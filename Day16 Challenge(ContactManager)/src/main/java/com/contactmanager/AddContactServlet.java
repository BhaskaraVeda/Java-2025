package com.contactmanager;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public static List<Contact> contacts = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        contacts.add(new Contact(name, phone, email));

        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("view_contacts.jsp").forward(request, response);
    }
}
