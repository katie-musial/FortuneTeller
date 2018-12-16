package edu.nyu.cs101.android.kbm345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import edu.nyu.cs.kbm345.fortuneteller.R;

/**
 * A class that displays a group of four odd numbers (buttons)
 */
public class DisplayNumber extends AppCompatActivity {

    @Override
    /**
     * Auto-generated method by AndroidStudio
     * Used to start an activity
     * super calls parent constructor and setContentView sets the xml
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_number);
    }

    /**
     * Variable flag to track which button was pressed
     */
    public static int buttonPressed = 0;

    /**
     * Method called when button '1' is clicked
     * Allows a button to be 'clicked' and start up a new activity that presents 4 new (even) numbers to choose from
     * @param view View object!
     */
    public void newButton2From1(View view) {
        //Changes flag here
        buttonPressed = 1;
        Intent callNumbers = new Intent(this, DisplaySecondNumber.class);
        startActivity(callNumbers);
    }

    /**
     * Method called when button '3' is clicked
     * Allows a button to be 'clicked' and start up a new activity that presents 4 new (even) numbers to choose from
     * @param view View object!
     */
    public void newButton2From3(View view) {
        //Changes flag here
        buttonPressed = 3;
        Intent callNumbers = new Intent(this, DisplaySecondNumber.class);
        startActivity(callNumbers);
    }

    /**
     * Method called when button '3' is clicked
     * Allows a button to be 'clicked' and start up a new activity that presents 4 new (even) numbers to choose from
     * @param view View object!
     */
    public void newButton2From5(View view) {
        //Changes flag here
        buttonPressed = 5;
        Intent callNumbers = new Intent(this, DisplaySecondNumber.class);
        startActivity(callNumbers);
    }

    /**
     * Method called when button '3' is clicked
     * Allows a button to be 'clicked' and start up a new activity that presents 4 new (even) numbers to choose from
     * @param view View object!
     */
    public void newButton2From7(View view) {
        //Changes flag here
        buttonPressed = 7;
        Intent callNumbers = new Intent(this, DisplaySecondNumber.class);
        startActivity(callNumbers);
    }
}
