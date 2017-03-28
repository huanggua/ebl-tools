package com.wangyin.ebl.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

//import com.wangyin.ebl.po.PromotionEntranceInfo;

public class HtmlUtil {
	
	/**
	 * 生成TBody
	 * @param object
	 * @return
	 */
	public static String generateTheadWithCheckbox(Object object){

		List<Field> fields = getAnnoFieldList(object);
		StringBuffer sb = new StringBuffer();
		sb.append("<tr>");
		sb.append("<th class=\"center\"><label><span class=\"lbl\"></span></label></th>");
		for (Field field : fields) {
//			Method method = getFieldGetMethod(object, field);
            String fieldType = field.getType().toString();
            if (fieldType.equals("class java.lang.Integer") || fieldType.equals("class java.lang.String") || fieldType.equals("class java.lang.Boolean") || fieldType.equals("class java.util.Date") || fieldType.equals("class java.lang.Byte")){
                sb.append("<th>");
                sb.append(field.getName());
                sb.append("</th>");
            }
		}
        sb.append("<th class=\"center\">操作</th>");
		sb.append("</tr>");
		return sb.toString();
	}
//	public static void main(String[] args) {
//		PromotionEntranceInfo pei = new PromotionEntranceInfo();
//		pei.setEndDate(new Timestamp(System.currentTimeMillis()));
//		System.err.println(generateTR4Edit(pei));
//	}
	
//	/**
//	 * <span class="label label-sm label-warning">Expiring</span>
//	 * 生成不带input的td 同时首列为checkbox
//	 * @param object
//	 * @return
//	 */
//	public static String generateTR4SimpleQuery(Object object,String queryKey){
//		List<Field> fields = getAnnoFieldList(object);
//		String primary = "";
//		StringBuffer sb = new StringBuffer();
//		sb.append("<tr>");
//		sb.append("<td name =\"primaryId\" class=\"center\"><label><input type=\"checkbox\" class=\"ace\" name=\"checkItem\" /><span class=\"lbl\"></span></label></td>");
//		for (Field field : fields) {
//			sb.append("<td>");
//			String value = getFieldValue(object, field);
//			if(value != null){
//				if(field.getGenericType().equals(Timestamp.class)){
//					sb.append(value.split("\\.")[0]);
//				}else{
//					if(field.isAnnotationPresent(Id.class)){
//						//主键高亮
//						sb.append("<span class=\"label label-sm label-warning\">");
//						sb.append(value);
//						primary = value;
//						sb.append("</span>");
//					}else if(field.getName().equals(StringUtil.underlineToCamel(queryKey))){
//						sb.append("<span class=\"label label-sm label-danger\">");
//						sb.append(value);
//						sb.append("</span>");
//					}else{
//						sb.append(value);
//					}
//				}
//			}else{
//				sb.append("");
//			}
//
//			sb.append("</td>");
//		}
//		sb.append("</tr>");
//		return sb.toString().replace("primaryId", primary);
//	}
	/**
	 * 生成不可编辑的列 首列
	 * @param object
	 * @return
	 */
	public static String generateTR4RelateQuery(Object object,String queryKey,String tableName){
		
		List<Field> fields = getAnnoFieldList(object);
		StringBuffer sb = new StringBuffer();
		sb.append("<tr>");
        sb.append("<th class=\"center\"><label><span class=\"lbl\"></span></label></th>");
		for (Field field : fields) {
            String fieldType = field.getType().toString();
            if (fieldType.equals("class java.lang.Integer") || fieldType.equals("class java.lang.String") || fieldType.equals("class java.lang.Boolean") || fieldType.equals("class java.util.Date") || fieldType.equals("class java.lang.Byte")){
                sb.append("<td>");
                String value = getFieldValue(object, field);
                if(value != null){
                    if(field.getGenericType().equals(Timestamp.class)){
                        sb.append(value.split("\\.")[0]);
                    }else{
                        if(field.isAnnotationPresent(Id.class)){
                            //主键高亮
                            sb.append("<span class=\"label label-sm label-warning\" value=\""+value+"\">");
                            sb.append(value);
                            sb.append("</span>");
                        }else if(field.getName().equals(StringUtil.underlineToCamel(queryKey))){
                            sb.append("<span class=\"label label-sm label-danger\" value=\"\"+value+\"\">");
                            sb.append(value);
                            sb.append("</span>");
                        }else{
                            sb.append("<span value=\"\"+value+\"\">");
                            sb.append(value);
                            sb.append("</span>");
                        }
                    }
                }else{
                    sb.append("");
                }
                sb.append("</td>");
            }
		}
        sb.append("<td>");
        sb.append("<a href=\"javascript:void(0)\" onclick=\"deleteAction('"+getFieldValue(object,fields.get(0))+"','"+tableName+"');\"><i class=\"icon-trash bigger-120\"></i></a>");
        sb.append("</td>");

		sb.append("</tr>");
		return sb.toString();
	}
	
	/**
	 * 
	 * @param object
	 * @return
	 */
	public static String generateTheadWithoutCheckbox(Object object){
		List<Field> fields = getAnnoFieldList(object);
		StringBuffer sb = new StringBuffer();
		sb.append("<tr>");
		for (Field field : fields) {
			Method method = getFieldGetMethod(object, field);
			sb.append("<th>");
			sb.append(method.getAnnotation(Column.class).name());
			sb.append("</th>");
		}
		sb.append("</tr>");
		return sb.toString();
	}
	
	/**
	 * 生成更新数据的tr --> @Id注解的不允许更新
	 * @param object
	 * @return
	 */
	public static String generateTR4Edit(Object object){
		List<Field> fields = getAnnoFieldList(object);
		StringBuffer sb = new StringBuffer();
		//隐藏表单
		String hiddenInput = "";
		sb.append("<tr>");
		for (Field field : fields) {
			sb.append("<td><input type=\"text\" value=\"");
			String value = getFieldValue(object, field);
			if(value != null){
				if(field.getGenericType().equals(Timestamp.class)){
					sb.append(value.split("\\.")[0]);
				}else{
					sb.append(value);
				}
			}
			
			sb.append("\"");
			Method method = getFieldGetMethod(object, field);
			//增加最大长度
			sb.append(" maxlength=\"");
			sb.append(method.getAnnotation(Column.class).length());
			sb.append("\"");

			if(field.isAnnotationPresent(Id.class)){
				//如果是主键 就不生成名字
				sb.append(" disabled=\"disabled\"");
				sb.append(" />");
				hiddenInput= "<input type=\"hidden\" value=\""+value+"\" name=\""+field.getName()+"\"/>";
			}else{
				sb.append(" name=\"");
				sb.append(field.getName());
				sb.append("\" />");
			}
			sb.append("</td>");
		}
		sb.append("</tr>");
		sb.append(hiddenInput);
		return sb.toString();
	}


	/**
	 * 生成规则编辑的界面
	 * @param object
	 * @return
	 */
	public static String generateRuleEdit(Object object){
		List<Field> fields = getAnnoFieldList(object);
		StringBuffer sb = new StringBuffer();
		//隐藏表单
		sb.append("<tr>");
		for (Field field : fields) {
			sb.append("<td><input type=\"text\" value=\"");
			String value = getFieldValue(object, field);
			if(value != null){
				if(field.getGenericType().equals(Timestamp.class)){
					sb.append(value.split("\\.")[0]);
				}else{
					sb.append(value);
				}
			}
			sb.append("\"");
			sb.append(" name=\"");
			sb.append(field.getName());
			sb.append("\" />");
			sb.append("</td>");
		}
		sb.append("</tr>");
		return sb.toString();
	}

	/**
	 * 生成更新数据的tr --> @Id注解的不允许更新
	 * @param object
	 * @return
	 */
	public static String generateTr4SimilarSave(Object object){
		List<Field> fields = getAnnoFieldList(object);
		StringBuffer sb = new StringBuffer();
		//隐藏表单
		String hiddenInput = "";
		sb.append("<tr>");
		for (Field field : fields) {
			sb.append("<td><input type=\"text\" value=\"");
			String value = getFieldValue(object, field);
			if(value != null){
				if(field.getGenericType().equals(Timestamp.class)){
					sb.append(value.split("\\.")[0]);
				}else{
					sb.append(value);
				}
			}
			
			sb.append("\"");
			Method method = getFieldGetMethod(object, field);
			//增加最大长度
			sb.append(" maxlength=\"");
			sb.append(method.getAnnotation(Column.class).length());
			sb.append("\"");
			sb.append(" name=\"");
			sb.append(field.getName());
			sb.append("\" />");
			sb.append("</td>");
		}
		sb.append("</tr>");
		sb.append(hiddenInput);
		return sb.toString();
	}
	
	
	/**
	 * 
	 * @Title: getAnnoFieldList
	 * @Description: TODO(获取所有有注释的字段,支持多重继承)
	 * @param obj
	 * @param @return 设定文件
	 * @return List<Field> 返回类型
	 * @throws
	 */
	@SuppressWarnings("rawtypes")
	private static List<Field> getAnnoFieldList(Object obj) {
		List<Field> list = new ArrayList<Field>();
		Class superClass = obj.getClass().getSuperclass();
		while (true) {
			if (superClass != null) {
				Field[] superFields = superClass.getDeclaredFields();
				if (superFields != null && superFields.length > 0) {
					for (Field field : superFields) {
						list.add(field);
					}
				}
				superClass = superClass.getSuperclass();
			} else {
				break;
			}
		}
		Field[] objFields = obj.getClass().getDeclaredFields();
		if (objFields != null && objFields.length > 0) {
			for (Field field : objFields) {
					list.add(field);
			}
		}
		
		return list;
	}
	
	/**
	 * 
	 * @Title: getFieldValue
	 * @Description: TODO(获取字段的值,支持多重继承)
	 * @param obj
	 * @param field
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	@SuppressWarnings({ "rawtypes" })
	private static String getFieldValue(Object obj, Field field) {
		String value = null;
		String name = field.getName();
		String methodName;
		if (field.getType().equals(boolean.class) || field.getType().equals(Boolean.class) ){
			 methodName = "is" + name.substring(0, 1).toUpperCase()
					+ name.substring(1);
		}else{
			 methodName = "get" + name.substring(0, 1).toUpperCase()
					+ name.substring(1);
		}

		Method method = null;
		Object methodValue = null;
			try {
				method = obj.getClass().getMethod(methodName);
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (method != null) {
				try {
					methodValue = method.invoke(obj);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (methodValue != null) {
				value = methodValue.toString();
			} else {
				Class objSuperClass = obj.getClass().getSuperclass();
				while (true) {
					if (objSuperClass != null) {
						if (methodValue != null) {
							value = methodValue.toString();
							break;
						} else {
							objSuperClass = objSuperClass.getSuperclass();
						}
					} else {
						break;
					}
				}
			}
		}
		return value;
	}
	
	/**
	 * 获取get方法
	 * @param obj
	 * @param field
	 * @return
	 */
	private static Method getFieldGetMethod(Object obj, Field field) {
		String name = field.getName();
		String methodName = "get" + name.substring(0, 1).toUpperCase()
				+ name.substring(1);
		Method method = null;
			try {
				method = obj.getClass().getMethod(methodName);
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return method;
	}
}
