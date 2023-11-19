<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Customer</title>
</head>
<body style="text-align: center;">
    <h1>Add Customer</h1>

    <form method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="first_name" required><br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="last_name" required><br><br>

        <label for="street">Street:</label>
        <input type="text" id="street" name="street" required><br><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br><br>

        <label for="city">City:</label>
        <input type="text" id="city" name="city" required><br><br>

        <label for="state">State:</label>
        <input type="text" id="state" name="state" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="phone">Phone:</label>
        <input type="text" id="phone" name="phone" required><br><br>

        <button type="submit" style="background-color: aqua;">Submit</button>
    </form> <br><br>

    <a>Back to Customer List</a>
</body>
</html>
