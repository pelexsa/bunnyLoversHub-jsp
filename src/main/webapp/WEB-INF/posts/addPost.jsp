<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rabbit Enthusiasts Bulletin Board</title>
    <link rel="stylesheet" href="/css/common/button.css">
    <link rel="stylesheet" href="/css/posts/addPost.css">
</head>
<body>
    <main>
	    <section id="post-creation">
	        <h2>Create Your Post</h2>
	        <form action="/posts/addPost" method="post">
	            <div class="form-group">
	                <label for="post-title">Title</label>
	                <input type="text" id="post-title" name="title" required>
	            </div>
	            <div class="form-group">
	                <label for="post-content">Content</label>
	                <textarea id="post-content" name="content" required></textarea>
	            </div>
	            <button type="submit">Submit Post</button>
	        </form>
	    </section>
    </main>
</body>
</html>
