<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Contact Manager</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<div class="container">

    <h1>Contact Manager - Sprint 2</h1>

    <c:if test="${not empty success}">
        <div class="msg success">${success}</div>
    </c:if>

    <c:if test="${not empty error}">
        <div class="msg error">${error}</div>
    </c:if>

    <div class="form-box">
        <form action="ContactController" method="post">
            <input type="hidden" name="id" value="${contact.id}">

            <label>Name</label>
            <input type="text" name="name" value="${contact.name}" required>

            <label>Phone</label>
            <input type="text" name="phone" value="${contact.phone}" required>

            <label>Email</label>
            <input type="email" name="email" value="${contact.email}" required>

            <button type="submit" name="action" value="${empty contact ? 'add' : 'update'}">
                <c:choose>
                    <c:when test="${empty contact}">Add Contact</c:when>
                    <c:otherwise>Update Contact</c:otherwise>
                </c:choose>
            </button>
        </form>
    </div>

    <h2>Saved Contacts</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>

        <c:forEach var="c" items="${contactList}">
            <tr>
                <td>${c.name}</td>
                <td>${c.phone}</td>
                <td>${c.email}</td>
                <td>
                    <a href="ContactController?action=edit&id=${c.id}" class="edit-btn">Edit</a>
                    <a href="ContactController?action=delete&id=${c.id}" class="delete-btn">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>

</body>
</html>
