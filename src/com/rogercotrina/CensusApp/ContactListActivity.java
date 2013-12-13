/**
 * ContactListActivity.java
 * User: rogercotrina
 * Date: 12/12/13
 * Time: 9:45 PM
 */
package com.rogercotrina.CensusApp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class ContactListActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_census_app);

        FragmentManager fragmentManager = getFragmentManager();

        Fragment theFragment = fragmentManager.findFragmentById(R.id.fragmentContainer);

        if (theFragment == null) {
            theFragment = new FragmentContactList();
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, theFragment).commit();
        }
    }
}
