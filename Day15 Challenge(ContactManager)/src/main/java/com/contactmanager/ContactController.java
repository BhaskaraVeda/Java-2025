package com.contactmanager;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContactController extends HttpServlet {

    ContactDAO dao = new ContactDAO();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        if ("edit".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            Contact c = dao.getContactById(id);
            req.setAttribute("contact", c);
        }

        if ("delete".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            dao.deleteContact(id);
            req.setAttribute("success", "Contact deleted!");
        }

        req.setAttribute("contactList", dao.getAllContacts());
        req.getRequestDispatcher("contact.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        if ("add".equals(action)) {
            boolean added = dao.addContact(new Contact(name, phone, email));

            if (added) req.setAttribute("success", "Contact added successfully!");
            else req.setAttribute("error", "Failed to add contact!");
        }

        if ("update".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            dao.updateContact(new Contact(id, name, phone, email));
            req.setAttribute("success", "Contact updated successfully!");
        }

        req.setAttribute("contactList", dao.getAllContacts());
        req.getRequestDispatcher("contact.jsp").forward(req, resp);
    }
}
