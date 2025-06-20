<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-warning">
    <div class="container mt-5">
        <h2 class="text-center mb-4">Sign Up</h2>

        <!-- Show success or info message -->
        <c:if test="${not empty msg}">
            <div class="alert alert-success text-center">${msg}</div>
        </c:if>

        <form action="register" method="post" class="w-50 mx-auto p-4 bg-white rounded shadow">
            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password" class="form-control" required />
            </div>
            <button type="submit" class="btn btn-dark w-100">Register</button>
        </form>

        <p class="text-center mt-3 text-white">
            Already have an account? <a href="signin" class="text-dark fw-bold">Sign In</a>
        </p>
    </div>
</body>
</html>
