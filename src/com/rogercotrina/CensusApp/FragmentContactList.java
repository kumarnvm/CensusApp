/**
 * FragmentContactList.java
 * User: rogercotrina
 * Date: 12/12/13
 * Time: 9:47 PM
 */
package com.rogercotrina.CensusApp;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.List;

public class FragmentContactList extends ListFragment {

    private List<Contact> contactList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().setTitle(R.string.fragment_contact_list_title);

        contactList = AllContacts.get(getActivity()).getContactList();

        ContactAdapter contactAdapter = new ContactAdapter(getActivity(), android.R.layout.simple_list_item_1 ,contactList);

        setListAdapter(contactAdapter);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
