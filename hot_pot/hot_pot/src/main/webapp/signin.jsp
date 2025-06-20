<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Sign In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-warning">
    <div class="container mt-5">
        <h2 class="text-center mb-4">Sign In</h2>

        <!-- Success message after registration -->
        <c:if test="${not empty msg}">
            <div class="alert alert-success text-center">${msg}</div>
        </c:if>

        <!-- Error message if login fails -->
        <c:if test="${not empty error}">
            <div class="alert alert-danger text-center">${error}</div>
        </c:if>

        <form action="login" method="post" class="w-50 mx-auto p-4 bg-white rounded shadow">
            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" value="${register.getEmail()}" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password" value="${register.getPassword()}" class="form-control" required />
            </div>
            <button type="submit" class="btn btn-dark w-100">Login</button>
        </form>

        <p class="text-center mt-3 text-white">
            Don't have an account? <a href="signup" class="text-dark fw-bold">Sign Up</a>
        </p>
    </div>
</body>
</html>

