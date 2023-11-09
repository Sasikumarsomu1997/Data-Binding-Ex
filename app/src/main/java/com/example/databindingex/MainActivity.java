package com.example.databindingex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    MyClickHandler myclickHandler;
    ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonModel personModel = new PersonModel("Sasikumar", "sasikumar@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.setPerson(personModel);

        myclickHandler = new MyClickHandler(this);

       activityMainBinding.setClickHandler(myclickHandler);




    }
}