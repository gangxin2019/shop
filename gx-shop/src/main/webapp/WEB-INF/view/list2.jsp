<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<LINK href="resources/css/css.css" type="text/css" rel="stylesheet">
<script src="/resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<form action="list2" method="post">

销售商品:<c:forEach items="${glist }" var="g">
             <input type="checkbox" name="gids" value="${g.gid }"
             <c:forEach items="${goods.gids }" var="gids">
             ${gids==g.gid?"checked":"" }
             </c:forEach>
             >${g.gname }
        </c:forEach><br><br>
店铺名称:<input type="text" name="sname" value="${goods.sname }">
<input type="submit" value="查询">

<table>
  <tr>
    <th>编号</th>
    <th>店铺名称</th>
    <th>创建日期</th>
    <th>销售商品</th>
    <th>操作<a href="add"><input type="button" value="添加"></a></th>
  </tr>
  <c:forEach items="${pg.list }" var="list">
  <tr>
    <td>${list.sid }</td>
    <td>${list.sname }</td>
    <td>${list.sdate }</td>
    <td>${list.gname }</td>
    <td></td>
  </tr>
  </c:forEach>
</table>
${page }



</form>

<!-- <script type="text/javascript">
  function toAdd(){
	  location="add.jsp";
  }

</script> -->

</body>
</html>