package com.johnkent.project0.myportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Handles the button clicks for each app button. Eventually will launch the apps, for now creates a toast.
    public void spotifyClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "This will launch my Spotify app once I've completed it!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();

    }

    public void scoreClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "This will launch my Scores app once I've completed it!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();

    }

    public void libraryClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "This will launch my Library app once I've completed it!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void biggerClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "This will launch my Build it Bigger app once I've completed it!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void xyzClick(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will launch my XYZ Reader once I've completed it!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void capstoneClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "This will launch my Capstone app once I've completed it!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
