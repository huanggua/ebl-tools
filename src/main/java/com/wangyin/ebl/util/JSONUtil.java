package com.wangyin.ebl.util;

import com.alibaba.fastjson.JSON;
import com.wangyin.ebl.domain.RuleParser;

import java.io.*;
import java.util.*;

public class JSONUtil {
	
	/**
	 * 
	 * @param filePath
	 * @return
	 */
	public static Set<RuleParser> getRuleList(String filePath){
		String encoding = "UTF-8";
		File file = new File(filePath);
		InputStreamReader read = null;
		try {
			read = new InputStreamReader(new FileInputStream(file), encoding);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(read);
		StringBuffer sb = new StringBuffer();
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<RuleParser> list = JSON.parseArray(sb.toString(), RuleParser.class);
		Collections.sort(list);
		return new HashSet<RuleParser>(list);
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 */
	public static Map<String,RuleParser> getRuleSet(String filePath){
		Set<RuleParser> rps = getRuleList(filePath);
		Map<String,RuleParser> maps = new HashMap<String, RuleParser>();
		for (RuleParser ruleParser : rps) {
			maps.put(ruleParser.getField(), ruleParser);
		}
		return maps;
	}
	
	/**
	 * 
	 * 写rule配置文件
	 * @param ruleParser
	 * @param filePath
	 * @return
	 * 
	 */
	public static boolean writeRules(RuleParser ruleParser, String filePath) {
		
		Map<String,RuleParser>  ruleParserMap = getRuleSet(filePath);
		ruleParserMap.put(ruleParser.getField(), ruleParser);
		
		Set<RuleParser> sets = new HashSet<RuleParser>();
		for (Map.Entry<String, RuleParser> entry : ruleParserMap.entrySet()) {  
			sets.add(entry.getValue());
		}  
		
		String newRules = JSON.toJSONString(sets);
		File file = new File(filePath);
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		OutputStreamWriter writer;
		try {
			 writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
		}catch (FileNotFoundException e){
			e.printStackTrace();
			return false;
		}catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		BufferedWriter bw = new BufferedWriter(writer);
		try {
			bw.write(newRules);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
