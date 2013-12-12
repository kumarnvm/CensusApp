package com.rogercotrina.CensusApp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class CensusApp extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_census_app);

        FragmentManager fragmentManager = getFragmentManager();

        Fragment theFragment = fragmentManager.findFragmentById(R.id.fragmentContainer);

        if (theFragment == null) {
            theFragment = new ContactFragment();
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, theFragment).commit();
        }
    }
}
