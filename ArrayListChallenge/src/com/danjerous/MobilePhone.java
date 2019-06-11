package com.danjerous;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList;

    public MobilePhone() {
        contactList = new ArrayList<Contact>();
    }

    public boolean addContact (Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact [" + contact.getName() + "] is already on file.");

            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean updateContact (Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println("[" + oldContact.getName() + "], was not found.");
            return false;
        }

        this.contactList.set(foundPosition, newContact);

        System.out.println("[" + oldContact.getName() + "], was replaced with " + newContact.getName());

        return  true;
    }

    public void removeContact () {

    }


    private int findContact (Contact contact) {

        return contactList.indexOf(contact);

    }

    private int findContact (String contactName) {

        for (int i = 0; i < this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);

            if (contact.getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }

}
