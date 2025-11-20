<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Manager</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body {
        font-family: Arial, sans-serif;
        text-align: center;
        padding: 50px;
        background: #f2f2f2;
    }
    h1 {
        color: #333;
    }
    button {
        margin: 10px;
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

    <h1>Welcome to Contact Manager</h1>
    <button onclick="window.location.href='add_contact.jsp'">Add Contact</button>
    <button onclick="window.location.href='view_contacts.jsp'">View Contacts</button>

</body>
</html>
