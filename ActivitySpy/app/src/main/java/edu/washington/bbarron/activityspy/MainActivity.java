package edu.washington.bbarron.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate event fired");
        if (savedInstanceState != null) {
            Log.i("MainActivity", savedInstanceState.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "We're going down, Captain!");
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
}
