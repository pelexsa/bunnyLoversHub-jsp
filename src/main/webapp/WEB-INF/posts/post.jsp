<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rabbit Enthusiasts Bulletin Board</title>
    <link rel="stylesheet" href="/css/common/button.css">
	<link rel="stylesheet" href="/css/posts/post.css">
</head>
<body>
    <main>
	    <section id="bulletin-board">
		    <div class="post-container">
		        <h1 class="post-title">${post.title}</h1>
		        <div class="post-info">
		            <span class="author">작성자: ${post.createdUser}</span>
		            <span class="views">조회수: ${post.viewCount}</span>
		        </div>
		        <div class="post-content">
		            ${post.content}
		        </div>
		    </div>
	    </section>
    </main>
</body>
</html>
