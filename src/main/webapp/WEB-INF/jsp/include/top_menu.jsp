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

<div id="body2">
<ul>
        <c:choose>
            <c:when test="${userLogin == true}">
                <li  id="adminMenu">
                    <a href="${root }main/adminMenu" class="nav-link"> <span>관리메뉴</span> </a>
                </li>
                <li class="checkingMachine">
                    <a href="${root }main/checkingMachine" class="nav-link"> <span class="checkingMachine">기기조회</span> </a>
                </li>
                <li>
                    <a href="${root }user/modify" class="nav-link"> <span id="modify">정보수정</span> </a>
                </li>
                <li>
                    <a href="${root }user/logout" class="nav-link"><span id="logout">로그아웃</span></a>
                </li>
            </c:when>
            <c:otherwise>

<%--                checkingMachine--%>
                <li class="checkingMachine">
                    <a href="${root }main/checkingMachine" class="nav-link"> <span class="checkingMachine">기기조회</span> </a>
                </li>
                <li class="nav-item">
                    <a href="/user/login" class="nav-link"><span id="login">로그인</span></a>
                </li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>
<script src="/resources/js/top_menu.js"></script>
</body>
</html>
