package edu.nyu.cs101.android.kbm345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import edu.nyu.cs.kbm345.fortuneteller.R;

/**
 * A class that displays a second round of a group of four even numbers (buttons)
 */
public class DisplaySecondNumber extends AppCompatActivity {

    @Override
    /**
     * Auto-generated method by AndroidStudio
     * Used to start an activity
     * super calls parent constructor and setContentView sets the xml
     */    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_second_number);
    }

    //New DisplayNumber Object to be able to call its class methods
    DisplayNumber displayNumber = new DisplayNumber();
     //variable to hold the number of the first button pressed
    int firstButtonPressed = displayNumber.buttonPressed;

    /**
     * Used to determine which fortune telling activity will activate
     * @param view View object
     */
    public void displayFrom2(View view) {
        //Variable to hold the number of the second button pressed
        int secondButtonPressed = 2;

        //Variable to add both button's int values
        int seed = (firstButtonPressed + secondButtonPressed);

        //Like a switch statement, a certain activity will be called based on the seed value
        if (seed == 3) {
            Intent callNumbers = new Intent(this, Fortune1.class);
            startActivity(callNumbers);
        }
        if (seed == 4) {
            Intent callNumbers = new Intent(this, Fortune2.class);
            startActivity(callNumbers);
        }
        if (seed == 5) {
            Intent callNumbers = new Intent(this, Fortune3.class);
            startActivity(callNumbers);
        }
        if (seed == 7 || seed == 6) {
            Intent callNumbers = new Intent(this, Fortune4.class);
            startActivity(callNumbers);
        }
        if (seed == 9 || seed == 8) {
            Intent callNumbers = new Intent(this, Fortune5.class);
            startActivity(callNumbers);
        }
        if (seed == 11 || seed == 10) {
            Intent callNumbers = new Intent(this, Fortune6.class);
            startActivity(callNumbers);
        }
        if (seed == 13 || seed == 12) {
            Intent callNumbers = new Intent(this, Fortune7.class);
            startActivity(callNumbers);
        }
        if (seed == 15 || seed == 14) {
            Intent callNumbers = new Intent(this, Fortune8.class);
            startActivity(callNumbers);
        }
    }

    /**
     * Used to determine which fortune telling activity will activate
     * @param view View object
     */
    public void displayFrom4(View view) {
        //Variable to hold the number of the second button pressed
        int secondButtonPressed = 4;

        //Variable to add both button's int values
        int seed = (firstButtonPressed + secondButtonPressed);

        //Like a switch statement, a certain activity will be called based on the seed value
        if (seed == 3) {
            Intent callNumbers = new Intent(this, Fortune1.class);
            startActivity(callNumbers);
        }
        if (seed == 4) {
            Intent callNumbers = new Intent(this, Fortune2.class);
            startActivity(callNumbers);
        }
        if (seed == 5) {
            Intent callNumbers = new Intent(this, Fortune3.class);
            startActivity(callNumbers);
        }
        if (seed == 7 || seed == 6) {
            Intent callNumbers = new Intent(this, Fortune4.class);
            startActivity(callNumbers);
        }
        if (seed == 9 || seed == 8) {
            Intent callNumbers = new Intent(this, Fortune5.class);
            startActivity(callNumbers);
        }
        if (seed == 11 || seed == 10) {
            Intent callNumbers = new Intent(this, Fortune6.class);
            startActivity(callNumbers);
        }
        if (seed == 13 || seed == 12) {
            Intent callNumbers = new Intent(this, Fortune7.class);
            startActivity(callNumbers);
        }
        if (seed == 15 || seed == 14) {
            Intent callNumbers = new Intent(this, Fortune8.class);
            startActivity(callNumbers);
        }
    }

    /**
     * Used to determine which fortune telling activity will activate
     * @param view View object
     */
    public void displayFrom6(View view) {

        //Variable to hold the number of the second button pressed
        int secondButtonPressed = 6;

        //Variable to add both button's int values
        int seed = (firstButtonPressed + secondButtonPressed);

        //Like a switch statement, a certain activity will be called based on the seed value
        if (seed == 3) {
            Intent callNumbers = new Intent(this, Fortune1.class);
            startActivity(callNumbers);
        }
        if (seed == 4) {
            Intent callNumbers = new Intent(this, Fortune2.class);
            startActivity(callNumbers);
        }
        if (seed == 5) {
            Intent callNumbers = new Intent(this, Fortune3.class);
            startActivity(callNumbers);
        }
        if (seed == 7 || seed == 6) {
            Intent callNumbers = new Intent(this, Fortune4.class);
            startActivity(callNumbers);
        }
        if (seed == 9 || seed == 8) {
            Intent callNumbers = new Intent(this, Fortune5.class);
            startActivity(callNumbers);
        }
        if (seed == 11 || seed == 10) {
            Intent callNumbers = new Intent(this, Fortune6.class);
            startActivity(callNumbers);
        }
        if (seed == 13 || seed == 12) {
            Intent callNumbers = new Intent(this, Fortune7.class);
            startActivity(callNumbers);
        }
        if (seed == 15 || seed == 14) {
            Intent callNumbers = new Intent(this, Fortune8.class);
            startActivity(callNumbers);
        }
    }

    /**
     * Used to determine which fortune telling activity will activate
     * @param view View object
     */
    public void displayFrom8(View view) {

        //Variable to hold the number of the second button pressed
        int secondButtonPressed = 8;

        //Variable to add both button's int values
        int seed = (firstButtonPressed + secondButtonPressed);

        //Like a switch statement, a certain activity will be called based on the seed value
        if (seed == 3) {
            Intent callNumbers = new Intent(this, Fortune1.class);
            startActivity(callNumbers);
        }
        if (seed == 4) {
            Intent callNumbers = new Intent(this, Fortune2.class);
            startActivity(callNumbers);
        }
        if (seed == 5) {
            Intent callNumbers = new Intent(this, Fortune3.class);
            startActivity(callNumbers);
        }
        if (seed == 7 || seed == 6) {
            Intent callNumbers = new Intent(this, Fortune4.class);
            startActivity(callNumbers);
        }
        if (seed == 9 || seed == 8) {
            Intent callNumbers = new Intent(this, Fortune5.class);
            startActivity(callNumbers);
        }
        if (seed == 11 || seed == 10) {
            Intent callNumbers = new Intent(this, Fortune6.class);
            startActivity(callNumbers);
        }
        if (seed == 13 || seed == 12) {
            Intent callNumbers = new Intent(this, Fortune7.class);
            startActivity(callNumbers);
        }
        if (seed == 15 || seed == 14) {
            Intent callNumbers = new Intent(this, Fortune8.class);
            startActivity(callNumbers);
        }
    }

}
