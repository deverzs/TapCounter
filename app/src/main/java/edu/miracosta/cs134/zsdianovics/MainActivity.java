package edu.miracosta.cs134.zsdianovics;
/*
Zsuzsanna Dianovics
cs134  February 1, 2019
Assignment 3 - Tap Counter

I. instance variables
II. onCreate()
    a. setContentView
    b.tapButton
    c. countView
    d. super
III. increment()
    a. create Toast object
    b. increment and set countView
    c. position toast
    d. show toast
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //instance variables
    private int count = 1;              //incremental count
    private Button tapButton;           //button object
    private TextView countView;         //text object

    /* onCreate
       starting point of app
       @param Bundle savedInstanceState
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //configure
        setContentView(R.layout.activity_main);
        tapButton = findViewById(R.id.tapMeButton);
        countView = findViewById(R.id.countTextView);
        super.onCreate(savedInstanceState);

    }

    /* increment
       onClick event - creates Toast and increment countView
       @param View v
    */
    public void increment(View v)
    {
        //creating Toast object to manipulate
        Toast toast = Toast.makeText(this, R.string.toast_name, Toast.LENGTH_SHORT );
        countView.setText(String.valueOf(count++));

        //position toast near the button
        toast.setGravity(Gravity.CENTER, 0, 180);
        toast.show();
    }
}
