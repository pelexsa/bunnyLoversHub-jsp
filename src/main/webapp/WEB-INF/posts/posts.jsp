<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rabbit Enthusiasts Bulletin Board</title>
    <link rel="stylesheet" href="/css/common/button.css">
	<link rel="stylesheet" href="/css/posts/posts.css">
</head>
<body>
    <main>
	    <section id="bulletin-board">
	        <div class="posts-header">
		        <div class="no"><spring:message code="post.no"/></div>
	            <div class="title"><spring:message code="post.title"/></div>
	            <div class="createdUser"><spring:message code="post.createdUser"/></div>
	            <div class="createdDate"><spring:message code="post.createdDate"/></div>
	        </div>
	        <div class="posts">
				<c:choose>
					<c:when test="${empty posts}">
				        <div class="no-posts">
				            No posts to display. Be the first to create a post!
				        </div>
					</c:when>
					<c:otherwise>
						<c:forEach items="${posts}" var="post">
							<div class="post">
								<div class="no"><a href="posts/${post.id}">${post.id}</a></div>
								<div class="title">${post.title}</div>
								<div class="createdUser">${post.createdUser}</div>
								<div class="createdDate">${post.createdDate}</div>
							</div>
						</c:forEach>
					</c:otherwise>
				</c:choose>
	        </div>
		    <div class="btn-area">
			    <button type="button" class="btn btn-write" onclick="location.href='posts/addPost'">글 작성</button>
		    </div>
	    </section>
    </main>
</body>
</html>
