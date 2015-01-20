package edu.washington.maxoneal.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate() event fired");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart() event fired");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() event fired");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() event fired");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() event fired");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() event fired");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We're going down, Captain!");
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
