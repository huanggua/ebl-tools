/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var firstIn = true;
var welcomeContent = "";
var addTabs = function (obj) {
    id = "tab_" + obj.id;
 
    $(".active").removeClass("active");
     
    //如果TAB不存在，创建一个新的TAB
    if (!$("#" + id)[0]) {
        //固定TAB中IFRAME高度,根据需要自己修改
        mainHeight = $(window).height() - $('#navbar').height() - 110;
        //创建新TAB的title
        title = '<li role="presentation" id="tab_' + id + '"><a href="#' + id + '" aria-controls="' + id + '" role="tab" data-toggle="tab">' + obj.title+'</a>';
        //是否允许关闭
        if (obj.close) {
            title += ' <span class="close-tab">x</span>';
        }
        title += '</li>';
        //是否指定TAB内容
        if (obj.content) {
            content = '<div role="tabpanel" class="tab-pane" id="' + id + '">' + obj.content + '</div>';
        } else {//没有内容，使用IFRAME打开链接
            content = '<div role="tabpanel" class="tab-pane" id="' + id + '"><iframe src="' + obj.url + '" width="100%" height="' + mainHeight +
                    '" frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="yes" allowtransparency="yes"></iframe></div>';
        }
        //加入TABS
        $(".nav-tabs").append(title);
        if(firstIn){
        	firstIn=false;
        	welcomeContent =$(".tab-content").html();
        	$(".tab-content").html(content);
        }else{
        	$(".tab-content").append(content);
        }
    }
     
    //激活TAB
    $("#tab_" + id).addClass('active');
    $("#" + id).addClass("active");
};

var closeTab = function (id) {
    //如果关闭的是当前激活的TAB，激活他的前一个TAB
    if ($("li.active").attr('id') == "tab_" + id) {
        $("#tab_" + id).prev().addClass('active');
        $("#" + id).prev().addClass('active');
    }
    //关闭TAB
    $("#tab_" + id).remove();
    $("#" + id).remove();
};
/**
 * 第一个打开的tab不允许关闭
 * @returns
 */
var isFirstTable = function(){
	return $('.nav-tabs').find('li').length === 0 ? false:true;
};

$(function () {
	  //首次打开的不可以关闭
//    $("[addtabs]").click(function () {
//        addTabs({id: $(this).attr("addtabs"), title: $(this).attr('title'), url: $(this).attr('url'), close: isFirstTable()});
//    });
//    
//    $(".nav-tabs").on("click", ".close-tab", function () {
//        if($(this).parents('.nav-tabs').find('li').length > 1){
//        	id = $(this).prev("a").attr("aria-controls");
//        	closeTab(id);
//        }else{
//        	return false;
//        }
//  
//    });
    //标签全都可以关闭
    $("[addtabs]").click(function () {
        addTabs({id: $(this).attr("addtabs"), title: $(this).attr('title'), url: $(this).attr('url'), close: true});
    });
    
    $(".nav-tabs").on("click", ".close-tab", function () {
    	if($(this).parents('.nav-tabs').find('li').length == 1){
    		$(".tab-content").html(welcomeContent);
    		firstIn=true;
    	}
    	id = $(this).prev("a").attr("aria-controls");
    	closeTab(id);
    });
});


$(window).resize(function(){
    var height = $(window).height() - $('#navbar').height() - 110;
    $('iframe').attr('height',height);
});
