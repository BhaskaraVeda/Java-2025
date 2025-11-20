<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Contact</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body {
        font-family: Arial, sans-serif;
        text-align: center;
        padding: 40px;
        background: #f7f7f7;
    }
    h2 {
        color: #333;
    }
    form {
        display: inline-block;
        background: white;
        padding: 20px 40px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    input {
        display: block;
        width: 250px;
        margin: 10px auto;
        padding: 10px;
        font-size: 16px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    button {
        margin-top: 15px;
        padding: 10px 20px;
        font-size: 16px;
        border: none;
        border-radius: 6px;
        background-color: #007bff;
        color: white;
        cursor: pointer;
    }
    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

    <h2>Add a New Contact</h2>
    <form action="AddContactServlet" method="post">
        <input type="text" name="name" placeholder="Enter Name" required>
        <input type="text" name="phone" placeholder="Enter Phone" required>
        <input type="email" name="email" placeholder="Enter Email" required>
        <button type="submit">Save Contact</button>
    </form>

    <br><br>
    <a href="index.jsp">Back to Home</a>

</body>
</html>
