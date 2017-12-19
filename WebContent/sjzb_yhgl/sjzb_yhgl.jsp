<%@ page language="java" import="java.util.*" isELIgnored="false"  pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">
<head>
<meta http-equiv="Content-Type" Content="text/html;charset=utf8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Amaze UI Admin index Examples</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="../assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="../assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="../assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="../assets/css/admin.css">
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="../assets/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
  <button class="am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o" data-am-dropdown-toggle> 消息管理<span class="am-badge am-badge-danger am-round">6</span></button>
  <ul class="am-dropdown-content">
  	
  	
  	
    <li class="am-dropdown-header">所有消息都在这里</li>

    

    <li><a href="#">未激活会员 <span class="am-badge am-badge-danger am-round">556</span></a></li>
    <li><a href="#">未激活代理 <span class="am-badge am-badge-danger am-round">69</span></a></a></li>
    <li><a href="#">未处理汇款</a></li>
    <li><a href="#">未发放提现</a></li>
    <li><a href="#">未发货订单</a></li>
    <li><a href="#">低库存产品</a></li>
    <li><a href="#">信息反馈</a></li>
    
    
    
  </ul>
</li>

 <li class="kuanjie">
 	
 	<a href="#">会员管理</a>          
 	<a href="#">奖金管理</a> 
 	<a href="#">订单管理</a>   
 	<a href="#">产品管理</a> 
 	<a href="#">个人中心</a> 
 	 <a href="#">系统设置</a>
 </li>

 <li class="soso">
 	
<p>   
	
	<select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
          <option value="b">全部</option>
          <option value="o">产品</option>
          <option value="o">会员</option>
          
        </select>

</p>

<p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="圆角表单域" /></p>
<p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#ffffff; margin: 10px 0 0 0;"> 欢迎系统管理员：清风抚雪</div>
    <div class="sideMenu">
    <h3 class="am-icon-flag"><em></em> <a href="">参数设置</a></h3>
     <ul>
        <li><a href="/Spring-MVC-model/sjzbsjcczlj/sjcczlj">存储路径管理</a></li>
        <li><a href="/Spring-MVC-model/sjzbjfgl/jfgl">积分级量管理</a></li>
        <li><a href="/Spring-MVC-model/sjzbspgl/spgl">商品数据管理</a></li>
        <li><a href="/Spring-MVC-model/gztx/index">工作提醒管理</a></li>
      </ul> 
      <h3 class="am-icon-cart-plus"><em></em> <a href=""> 数据采集管理</a></h3>
      <ul>
        <li><a href="/Spring-MVC-model/sjzbyhgl/yhgl">用户管理</a></li>
         <li><a href="/Spring-MVC-model/sjzbdhgl/dhgl">兑换管理</a></li>
        <li><a href="/Spring-MVC-model/sjzbscsjxx/scsjxx"> 上传数据信息</a></li>
      </ul>
      <h3 class="am-icon-users"><em></em> <a href="">数据加工管理</a></h3>
      <ul>
        <li><a href="/Spring-MVC-model/sjjgyhgl/yhgl">用户管理</a> </li>
      
      </ul>
      <h3 class="am-icon-volume-up"><em></em> <a href="">数据标注管理</a></h3>
      <ul>
       
      </ul>
      <h3 class="am-icon-gears"><em></em> <a href="">数据需求管理</a></h3>
      <ul>
        <li><a href="/Spring-MVC-model/sjxqyhgl/yhgl">用户管理</a> </li>
      </ul>
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
			<ul>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 首页 </li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">帮助中心<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">奖金管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs">产品管理<a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close="">×</a></button></li>
				
				
			</ul>

       

	
</div>
	
	


  <div class="admin-biaogelist">
      <div class="listbiaoti am-cf">
        <ul class="am-icon-flag on">
          用户管理
        </ul>
        <dl class="am-icon-home" style="float: right;">
          当前位置： 首页 > <a href="#">用户管理</a>
        </dl>
        <dl>
          <a class="am-btn am-btn-primary" href="/Spring-MVC-model/sjzbyhgl/toAddSjzbYhgl">
  添加用户
</a>
        </dl>
        <!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束--> 
    
    <div class="am-collapse am-topbar-collapse">
                <div class="am-collapse am-topbar-collapse">
                	<form id="search-form" action="<c:url value="/sjzbyhgl/yhgl"/>" class="am-topbar-form am-topbar-left am-form-inline" method="post" data-target="#table-container">
                        <input type="text" placeholder="请输入用户id" class="form-control" name="yhidsearch">
                        <input type="text" placeholder="请输入用户名" class="form-control" name="yhmsearch">
                    <input type="submit" class="am-btn am-btn-success" value="搜索">
                    </form>
                </div>
            </div>
        
      </div>
      <form class="am-form am-g">
        <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
          <thead>
            <tr class="am-success">
              <th class="am-text-center">用户id</th>
              <th class="am-text-center">用户名</th>
              <th class="am-text-center">密码</th>
              <th class="am-text-center">手机</th>
              <th class="am-text-center">邮箱</th>
             <th class="am-text-center">等级</th>
              <th class="am-text-center">注册方式</th>
              <th class="am-text-center">现有积分</th>
              <th class="am-text-center">上传视频数</th>
              <th class="am-text-center">平均速度</th>
              <th class="am-text-center">总里程</th>
              <th class="am-text-center">平均里程</th>
              <th width="125px" class="am-text-center">操作</th>
            </tr>
          </thead>
          <tbody>
          <c:if test="${!empty sjzbscsjyhList }"> 
          <c:forEach items="${sjzbscsjyhList }" var="scsjyh">  
            <tr>
              <td class="am-text-center">${scsjyh.yhid }</td>  
                        <td class="am-text-center">${scsjyh.yhm }</td>   
                        <td class="am-text-center">${scsjyh.mm }</td>  
                        <td class="am-text-center">${scsjyh.sj }</td>  
                        <td class="am-text-center">${scsjyh.yx }</td>  
                        <td class="am-text-center">${scsjyh.dj }</td>  
                        <td class="am-text-center">${scsjyh.zcfs }</td>  
                        <td class="am-text-center">${scsjyh.jf }</td>
                        <td class="am-text-center">${scsjyh.yxspsl }</td>  
                        <td class="am-text-center">${scsjyh.pjsd }</td>  
                        <td class="am-text-center">${scsjyh.zlc }</td>  
                        <td class="am-text-center">${scsjyh.pjlc }</td>
              
              <td><div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                  <a class="am-btn am-btn-primary" href="/Spring-MVC-model/sjzbyhgl/getSjzbYhgl?id=${scsjyh.yhid}">
  编辑
</a>
<a class="am-btn am-btn-danger" href="/Spring-MVC-model/sjzbyhgl/delSjzbYhgl?id=${scsjyh.yhid}">
  删除
</a>
                  </div>
                </div></td>
            </tr>
            </c:forEach> 
            </c:if>  
          </tbody>
        </table>
      </form>

    <div class="foods">
    	<dl><a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a></dl>


    	
    </div>







</div>

</div>




</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->



</body>
</html>