/**
 * Contact.java
 * User: rogercotrina
 * Date: 12/10/13
 * Time: 11:08 PM
 */
package com.rogercotrina.CensusApp;

import android.util.Log;

import java.util.UUID;

public class Contact {

    private String name;
    private String phoneNumber;
    private String streetAddress;
    private String city;

    private UUID idNumber;
    private boolean contacted;

    public Contact() {
        idNumber = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Log.e("CENSUS", "NAME CHANGED TO " + name);
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        Log.e("CENSUS", "PHONE NUMBER CHANGED TO " + phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public void setStreetAddress(String streetAddress) {
        Log.e("CENSUS", "ADDRESS CHANGED TO " + streetAddress);
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        Log.e("CENSUS", "CITY CHANGED TO " + city);
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public UUID getIdNumber() {
        return idNumber;
    }

    public boolean isContacted() {
        return contacted;
    }

    public void setContacted(boolean contacted) {
        this.contacted = contacted;
    }
}
