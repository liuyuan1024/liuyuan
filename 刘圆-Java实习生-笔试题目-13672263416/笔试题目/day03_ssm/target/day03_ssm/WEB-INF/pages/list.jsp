<%--
  Created by IntelliJ IDEA.
  User: 71856
  Date: 2020/10/4
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>查询了所有的账户信息</h3>
<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money}<br>
</c:forEach>
</body>
</html>
