package com.example.databindingex;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {

    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onButtonClicked(View view){
        Toast.makeText(context, "Submit Button is Clicked", Toast.LENGTH_SHORT).show();

    }

}

