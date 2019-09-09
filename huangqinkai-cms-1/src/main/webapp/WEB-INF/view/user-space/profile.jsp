<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>我的个人空间</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="/libs/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="/css/cms.css"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    </style>
  </head>
  <body>
    <jsp:include page="/WEB-INF/inc/top.jsp"></jsp:include>
	<br/>
	<!-- 横幅 -->
	<div class="container">
		<div class="row">
			<div class="col-md-12 my_banner">
			</div>
		</div>
	</div>
	<br/>
	<!-- 主体内容区 -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<jsp:include page="/WEB-INF/inc/my_left.jsp"><jsp:param value="profile" name="module"/></jsp:include>
			</div>
			<div class="col-md-9">
				<div class="panel panel-default">
				  <div class="panel-body">
				  
					
					<h1>个人设置</h1>
				    	<hr/>
				    	
				    	<form action="/my/profile/save" enctype="multipart/form-data" method="post" >
				    	<input type="hidden" value="${profile.id}" name="id">
				    	<p align="center" class="red"> </p>
				    	<p>
				    		<input name="username" value="${profile.username}" class="form-control" placeholder="用户名"/>
				    		<span class="red"></span>
				    	</p>
				    	<p>
				    		<input name=nickname value="${profile.nickname}" class="form-control" placeholder="昵称"/>
				    		<span class="red"></span>
				    	</p>
				    	<p>
				    		<input name="phone" value="${profile.phone}" class="form-control" placeholder="电话"/>
				    		<span class="red"></span>
				    	</p>
				    	<p>
				    		<input name="email" value="${profile.email}" class="form-control" placeholder="邮箱"/>
				    		<span class="red"></span>
				    	</p>
				    	<p>
				    		<input name="address" value="${profile.address}" class="form-control" placeholder="地址"/>
				    		<span class="red"></span>
				    	</p>
				    	<p>
				    		<input name="star" value="${profile.star}" class="form-control" placeholder="星座"/>
				    		<span class="red"></span>
				    	</p>
				    	<p>
				    		<input name="motto" value="${profile.motto}" class="form-control" placeholder="座右铭"/>
				    		<span class="red"></span>
				    	</p>
				    	
				    	<p>
				    		<button type="submit" class="btn btn-info btn-block">保存</button> 
				    	</p>
				    	
				    	</form>









				  </div>
				</div>
				
			</div>
		</div>
	</div>
	
	<jsp:include page="/WEB-INF/inc/footer.jsp"/>
	
	<script type="text/javascript">
		
	</script>
  </body>
</html>