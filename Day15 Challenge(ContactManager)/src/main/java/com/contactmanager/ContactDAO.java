package com.contactmanager;

import java.util.*;

public class ContactDAO {

    private static List<Contact> list = new ArrayList<>();
    private static int idCounter = 1;

    public boolean addContact(Contact c) {
        c.setId(idCounter++);
        return list.add(c);
    }

    public List<Contact> getAllContacts() {
        return list;
    }

    public Contact getContactById(int id) {
        return list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public void updateContact(Contact updated) {
        for (Contact c : list) {
            if (c.getId() == updated.getId()) {
                c.setName(updated.getName());
                c.setPhone(updated.getPhone());
                c.setEmail(updated.getEmail());
                break;
            }
        }
    }

    public void deleteContact(int id) {
        list.removeIf(c -> c.getId() == id);
    }
}
