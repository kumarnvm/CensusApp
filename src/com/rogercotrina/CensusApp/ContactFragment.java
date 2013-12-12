/**
 * ContactFragment.java
 * User: rogercotrina
 * Date: 12/10/13
 * Time: 11:08 PM
 */
package com.rogercotrina.CensusApp;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class ContactFragment extends Fragment {

    private Contact contact;
    private EditText contactNameEditText;
    private EditText contactStreetAddressEditText;
    private EditText contactCityEditText;
    private EditText contactPhoneNumberEditText;
    private CheckBox contactedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contact = new Contact();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.fragment_contact, container, false);
        contactNameEditText = (EditText) theView.findViewById(R.id.contactNameEditText);
        contactStreetAddressEditText = (EditText) theView.findViewById(R.id.contactStreetAddressEditText);
        contactCityEditText = (EditText) theView.findViewById(R.id.contactCityEditText);
        contactPhoneNumberEditText = (EditText) theView.findViewById(R.id.contactPhoneNumberEditText);
        contactedCheckBox = (CheckBox) theView.findViewById(R.id.contactedCheckBox);

        TextWatcher editTextWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(contactNameEditText.hasFocus()) {
                    contact.setName(s.toString());
                }else if(contactStreetAddressEditText.hasFocus()) {
                    contact.setStreetAddress(s.toString());
                }else if(contactCityEditText.hasFocus()) {
                    contact.setCity(s.toString());
                }else if(contactPhoneNumberEditText.hasFocus()) {
                    contact.setPhoneNumber(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };

        contactNameEditText.addTextChangedListener(editTextWatcher);
        contactStreetAddressEditText.addTextChangedListener(editTextWatcher);
        contactCityEditText.addTextChangedListener(editTextWatcher);
        contactPhoneNumberEditText.addTextChangedListener(editTextWatcher);

        contactedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              // TODO if true change to false, if false change to true.
                contact.setContacted(true);
            }
        });

        return theView;
    }
}
