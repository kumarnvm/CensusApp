/**
 * ContactAdapter.java
 * User: rogercotrina
 * Date: 12/12/13
 * Time: 9:49 PM
 */
package com.rogercotrina.CensusApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(Context context, int resource, List<Contact> contactList) {
        super(context, resource, contactList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        // inflate layout if not present.
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_contact, null);
        }

        Contact currentContact = getItem(position);

        TextView contactNameTextView = (TextView) view.findViewById(R.id.contact_name);
        contactNameTextView.setText(currentContact.getName());

        TextView contactStreetTextView = (TextView) view.findViewById(R.id.contact_street);
        contactStreetTextView.setText(currentContact.getStreetAddress());

        CheckBox contactedCheckBox = (CheckBox) view.findViewById(R.id.contact_contacted_checkbox);
        contactedCheckBox.setChecked(currentContact.isContacted());

        return view;
    }
}
