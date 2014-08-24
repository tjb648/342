package com.example.YoCatch;

import android.app.Activity;
import java.util.ArrayList;



public class YoCatchModel extends MyActivity {

  ArrayList<String> historyArray;
  String username;

  public YoCatchModel() {
      historyArray = new ArrayList<String>();

      username = "BigDogBell";

  }

    public void initArray(String history){

         historyArray.add(history);


    }
}
