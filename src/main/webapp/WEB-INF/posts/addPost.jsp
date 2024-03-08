<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rabbit Enthusiasts Bulletin Board</title>

	<script type="text/javascript" src="/js/common/bunnyFunction.js"></script>
	<script type="text/javascript" src="/js/posts/addPost.js"></script>
    <link rel="stylesheet" href="/css/common/button.css">
    <link rel="stylesheet" href="/css/posts/addPost.css">

	<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>
    <main>
	    <section id="post-creation">
<%--	        <h2>Create Your Post</h2>--%>
	        <form action="/posts/addPost"
	              id="frm"
	              method="post"
	              enctype="multipart/form-data"
	        >
		        <select name="tag">
			        <c:forEach items="${tags}" var="tag">
						<option value="${tag.code}">${tag.name}</option>
			        </c:forEach>
		        </select>
	            <div class="form-group">
	                <label for="post-title">Title</label>
	                <input type="text" id="post-title" name="title" required>
	            </div>
	            <div class="form-group">
		            <textarea id="summernote" name="content"></textarea>
	            </div>
	            <button type="submit">Submit Post</button>
	        </form>
	    </section>
    </main>
</body>
</html>
