package edu.upenn.cis.gesturegym;

import com.example.gesturegym.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.parse.Parse;
import com.parse.ParseAnalytics;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Parse.initialize(this, "a9fgXH8y5WZxzucfA8ZrPOdQ6dEEsSLHfhykvyzY", "fvjFSvTnypy9zgLEiXbv3kgC3YhlY2zt4MvssEP3");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
