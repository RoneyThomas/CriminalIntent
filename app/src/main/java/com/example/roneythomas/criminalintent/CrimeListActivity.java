package com.example.roneythomas.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by roneythomas on 2016-05-05.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
