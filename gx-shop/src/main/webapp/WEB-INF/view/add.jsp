<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<LINK href="resources/css/css.css" type="text/css" rel="stylesheet">
<script src="resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<form action="add" method="post">

<table>
  <tr>
    <th>店铺名称</th>
    <th><input type="text" name="sname"></th>
  </tr>
  <tr>
    <td>创建日期</td>
    <td><input type="text" name="sdate"></td>
  </tr>
    <tr>
    <td>销售商品</td>
    <td id="goods">
    
    </td>
  </tr>
  
</table>

<input type="submit" value="添加">


</form>

<script type="text/javascript">

$(function(){
	$.post(
			"toAdd",
			{},
		    function(msg){
				for ( var i in msg.glist) {
					$("#goods").append("<input type='checkbox' name='gids' value='"+msg.glist[i].gid+"'>"+msg.glist[i].gname+"")
				}
			},"json"
	
	)
})


</script>

</body>
</html>