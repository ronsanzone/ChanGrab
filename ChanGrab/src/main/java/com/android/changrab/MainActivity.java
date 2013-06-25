package com.android.changrab;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.android.changrab.chan.Board;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Board b = new Board();
        ChanGrab cg = new ChanGrab(this, b, "http://api.4chan.org/x/0.json");
        cg.initiateVolley();
        cg.populateBoard();
        b = cg.getBoard();
        b.testMethod();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        //this is a test comment
        return true;
    }
    
}
