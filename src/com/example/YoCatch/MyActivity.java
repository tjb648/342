package com.example.YoCatch;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        YoCatchModel newmodel = new YoCatchModel();

        System.out.print(newmodel.username);

        newmodel.initArray("Sometext");

        newmodel.initArray("Thisismoretext");

        newmodel.initArray("Howdy doody");

        for (String i : newmodel.historyArray)
        {
            System.out.println(i);

        }

    }
}
