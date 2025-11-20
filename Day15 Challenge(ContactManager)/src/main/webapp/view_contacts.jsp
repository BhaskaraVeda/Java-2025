<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.contactmanager.Contact,com.contactmanager.AddContactServlet"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Contacts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f7f7f7;
        text-align: center;
        padding: 40px;
    }
    h2 {
        color: #333;
    }
    table {
        margin: 0 auto;
        border-collapse: collapse;
        width: 80%;
        background: white;
        border-radius: 8px;
        overflow: hidden;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    th, td {
        padding: 12px 15px;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #007bff;
        color: white;
        text-transform: uppercase;
    }
    tr:hover {
        background-color: #f1f1f1;
    }
    a {
        display: inline-block;
        margin-top: 20px;
        text-decoration: none;
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
    }
    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

    <h2>Saved Contacts</h2>

    <%
        List<Contact> contacts = AddContactServlet.contacts;
        if (contacts.isEmpty()) {
    %>
        <p>No contacts available.</p>
    <%
        } else {
    %>
        <table>
            <tr>
                <th>Name</th>
                <th>Phone</th>
                <th>Email</th>
            </tr>
            <%
                for (Contact c : contacts) {
            %>
                <tr>
                    <td><%= c.getName() %></td>
                    <td><%= c.getPhone() %></td>
                    <td><%= c.getEmail() %></td>
                </tr>
            <%
                }
            %>
        </table>
    <%
        }
    %>

    <a href="index.jsp">Back to Home</a>

</body>
</html>
