<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hot-Pot | Dashboard</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Google Font (optional) -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
</head>

<body class="bg-warning bg-opacity-10" style="font-family: 'Poppins', sans-serif;">

<div class="container py-5">
    <h2 class="text-center text-danger fw-bold mb-5 display-5">Explore Our Categories</h2>

    <div class="row g-4">
        <!-- Biryani -->
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <img src="image/high-angle-pakistan-meal-composition.jpg" class="card-img-top" style="height:250px; object-fit:cover;" alt="Biryani">
                <div class="card-body d-flex flex-column">
                    <h5 class="card-title fw-semibold">Biryani & Indian Meals</h5>
                    <p class="card-text">Savor rich, spicy biryanis with authentic Indian flavors.</p>
                    <a href="biryaniMenu.jsp" class="btn btn-warning w-100 mt-auto fw-semibold">Order Now</a>
                </div>
            </div>
        </div>

        <!-- Pizza -->
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <img src="image/delicious-pizza-studio.jpg" class="card-img-top" style="height:250px; object-fit:cover;" alt="Pizza">
                <div class="card-body d-flex flex-column">
                    <h5 class="card-title fw-semibold">Pizzas</h5>
                    <p class="card-text">Freshly baked with your favorite toppings, hot from the oven!</p>
                    <a href="pizzaMenu.jsp" class="btn btn-danger w-100 mt-auto fw-semibold">Order Now</a>
                </div>
            </div>
        </div>

        <!-- Burger -->
        <div class="col-md-4">
            <div class="card h-100 shadow-sm">
                <img src="image/double-cheeseburger.jpg" class="card-img-top" style="height:250px; object-fit:cover;" alt="Burger">
                <div class="card-body d-flex flex-column">
                    <h5 class="card-title fw-semibold">Burgers</h5>
                    <p class="card-text">Juicy, cheesy burgers loaded with flavor and freshness.</p>
                    <a href="burgerMenu.jsp" class="btn btn-success w-100 mt-auto fw-semibold">Order Now</a>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
