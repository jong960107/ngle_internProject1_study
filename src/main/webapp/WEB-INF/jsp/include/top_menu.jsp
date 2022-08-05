<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="root" value="/"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/resources/css/top_menu.css" rel="stylesheet" />

</head>
<body>

<div>
    <ul class="navbar-nav ml-auto">
        <c:choose>
            <c:when test="${loginUserBeansResource.userLogin == true}">
                <li class="nav-item">
                    <a href="${root }user/modify" class="nav-link"> <span id="modify">정보수정</span> </a>
                </li>
                <li class="nav-item">
                    <a href="${root }user/logout" class="nav-link"><span id="logout">로그아웃</span></a>
                </li>
            </c:when>
            <c:otherwise>
                <li class="nav-item">
                    <a href="/main" class="nav-link"><span id="login">로그인</span></a>
                </li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>

</body>
</html>
