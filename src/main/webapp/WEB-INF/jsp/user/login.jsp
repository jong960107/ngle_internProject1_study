<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="root" value="/"/>


<html>
<head>
    <title>Title</title>
    <link href="/resources/css/reset.css" rel="stylesheet" />
    <link href="/resources/css/login.css" rel="stylesheet" />
</head>
<body>

<div id="top_menu">
    <c:import url="/WEB-INF/jsp/include/top_menu.jsp"/>
</div>


<div id="body">

    <div id="header">
        <div id="mainLogo">
            <img id="mainLogoImg" src="/resources/img/nglelogo.png" alt="ngleLogo">
        </div>
    </div>

    <div class="container">
        <form:form action="/user/signup_pro" id="form" class="form" modelAttribute="tempLoginUserBeansResource" method="post">

            <div class="form-control">
                <form:label path="user_email_front">엔글 이메일</form:label>
                <div id="emailWrapper">
                <form:input path="user_email_front" type="text" id="user_email_front_input" placeholder="아이디@ngle.co.kr" />
                <form:errors path="user_email_front" style='color:red'></form:errors>
                </div>

            </div>
            <div class="form-control">
                <form:label path="user_pw">비밀번호</form:label>
                <form:password path="user_pw" id="user_pw" placeholder="비밀번호를 입력해주세요." />
                <form:errors path="user_pw" style='color:red'></form:errors>
            </div>
            <form:button>로그인</form:button>
        </form:form>
    </div>
    <div id="footer">

    </div>
    <script src="/resources/js/login.js">

    </script>
</div>
</body>

</html>
