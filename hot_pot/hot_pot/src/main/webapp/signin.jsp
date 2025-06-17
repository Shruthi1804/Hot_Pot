<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Sign In</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-warning">
    <div class="container mt-5">
        <h2 class="text-center">Sign In</h2>

       

        <form action="login" method="post" class="w-50 mx-auto mt-4">
            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" name="email" value="${register.getEmail()}" class="form-control" required/>
            </div>
            <div class="mb-3">
                <label class="form-label">Password</label>
                <input type="password" name="password" value="${register.getPassword()}" class="form-control" required/>
            </div>
            <button type="submit" class="btn btn-dark">Login</button>
        </form>
    </div>
    <div style="color:red; text-align:center">${error}</div>
    
</body>
</html>
