<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <select id="lang-select" onchange="changeLanguage(this.value)">
        <option value="ko" selected>한국어</option>
        <option value="en">영어</option>
        <option value="jp">일본어</option>
        <option value="zh">중국어</option>
    </select>

    <script>
        function changeLanguage(lang) {
            location.href = '?lang=' + lang;
        }

        document.addEventListener("DOMContentLoaded", function () {
	        const urlParams = new URLSearchParams(window.location.search);
	        const lang = urlParams.get('lang');

	        if (lang) {
	            document.querySelector("#lang-select").value = lang;
	        }
        });
    </script>

    <div>테스트</div>
    <div><spring:message code="${test}"/></div>

    <div>ㅇㅇ</div>
    <div><spring:message code="hello"/></div>
    <div><spring:message code="goodbye"/></div>
    <div><spring:message code="welcome"/></div>
    <div><spring:message code="login"/></div>
    <div><spring:message code="logout"/></div>
    <div><spring:message code="home"/></div>
    <div><spring:message code="about"/></div>
    <div><spring:message code="contact"/></div>
    <div><spring:message code="terms"/></div>
    <div><spring:message code="privacy"/></div>
    <div><spring:message code="error"/></div>
    <div><spring:message code="notfound"/></div>
    <div><spring:message code="success"/></div>
    <div><spring:message code="failure"/></div>
    <div><spring:message code="loading"/></div>
</body>
</html>
