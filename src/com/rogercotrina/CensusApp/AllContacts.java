/**
 * AllContacts.java
 * User: rogercotrina
 * Date: 12/12/13
 * Time: 12:42 AM
 */
package com.rogercotrina.CensusApp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Singleton handling the storage of all contacts in the app.
 */
public class AllContacts {
    private static AllContacts allContacts;

    private Context applicationContext;

    private List<Contact> contactList;

    private AllContacts(Context applicationContext) {
        this.applicationContext = applicationContext;

        contactList = new ArrayList<Contact>();

        Contact paulSmith = new Contact();
        paulSmith.setName("Paul Smith");
        paulSmith.setStreetAddress("123 Main");
        paulSmith.setContacted(true);
        contactList.add(paulSmith);

        Contact sallySmith = new Contact();
        sallySmith.setName("Sally Smith");
        sallySmith.setStreetAddress("125 Main");
        sallySmith.setContacted(false);
        contactList.add(sallySmith);

        Contact markSmith = new Contact();
        markSmith.setName("Mark Smith");
        markSmith.setStreetAddress("127 Main");
        markSmith.setContacted(false);
        contactList.add(markSmith);
    }

    public static AllContacts get(Context context) {
        if (allContacts == null) {
            allContacts = new AllContacts(context.getApplicationContext());
        }

        return allContacts;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public Contact getContact(UUID id) {
        for (Contact contact : contactList) {
            if (contact.getIdNumber().equals(id)) {
                return contact;
            }
        }
        return null;
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(Context applicationContext) {
        this.applicationContext = applicationContext;
    }
}
