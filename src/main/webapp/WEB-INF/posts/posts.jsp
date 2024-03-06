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
	            <div class="title">Title</div>
	            <div class="summary">Summary</div>
	            <div class="author">Author</div>
	            <div class="date">Date</div>
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
								<div class="title"><a href="posts/${post.id}">Rabbit Care 101</a></div>
								<div class="summary">${post.title}</div>
								<div class="author">${post.createdUser}</div>
								<div class="date">${post.createdDate}</div>
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
