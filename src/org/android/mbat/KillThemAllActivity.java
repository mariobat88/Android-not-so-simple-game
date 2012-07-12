/*
NOTICE:
This is not my own project, i was simply interested
in game development so i recreated the game from 
http://www.edu4java.com/androidgame.html

If you are interested visit the page and look at some more details
regarding game development in Android.

*/

package org.android.mbat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class KillThemAllActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameView(this));
    }

}

