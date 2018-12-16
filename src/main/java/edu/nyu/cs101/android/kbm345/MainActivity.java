package edu.nyu.cs101.android.kbm345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import edu.nyu.cs.kbm345.fortuneteller.R;

/**
 * The Main class, which extends AppCompatActivity to inherit methods/properties etc
 * This class is the first activity shown when user opens the app
 */
public class MainActivity extends AppCompatActivity {

    @Override
    /**
     * Auto-generated method by AndroidStudio
     * Used to start an activity
     * super calls parent constructor and setContentView sets the xml
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Allows a button to be 'clicked' and start up a new activity that presents 4 numbers to choose from
     * @param view View Object!
     */
    public void newButton(View view) {
        Intent callNumbers = new Intent(this, DisplayNumber.class);
        startActivity(callNumbers);
    }
}
