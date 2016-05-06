package com.chenga.android.tipscalculator;

/*
* The activity class of TipsFragment
* Creates a fragment where work is done there
 */

import android.support.v4.app.Fragment;

public class TipsActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return TipsFragment.newInstance();
    }
}
