package com.example.android.gapplauncher;

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

    //gnc - to handle button presses - with some help from StackOverflow forum entries on Toasts
    public void sendMessageToUser(View view){

        //int msgText = view.getId();
        int duration = Toast.LENGTH_SHORT;
        Context gncContext = getApplicationContext();
        CharSequence textForToast = getResources().getResourceEntryName(view.getId());

        Toast popUpMsg = Toast.makeText(gncContext, "You've pressed the button for this app: " + textForToast, duration);
        popUpMsg.show();

        /*

        Commented out because I found a cleaner way, above, to show the Toast.

        Toast popUpMsg = Toast.makeText(gncContext, "Unknown or unexptected button press!", duration);

        switch(view.getId()){
            case R.id.gncButtonStreamer:
                popUpMsg.makeText(gncContext, "Button press will launch the Streamer app", duration);
                popUpMsg.show();
            case R.id.gncButtonScores:
                popUpMsg.makeText(gncContext, "Button press will launch the Scores app", duration);
                popUpMsg.show();
            case R.id.gncButtonLibrary:
                popUpMsg.makeText(gncContext, "Button press will launch the Library app", duration);
                popUpMsg.show();
            case R.id.gncButtonBigger:
                popUpMsg.makeText(gncContext, "Button press will launch the Build It Bigger app", duration);
                popUpMsg.show();
            case R.id.gncButtonXYZ:
                popUpMsg.makeText(gncContext, "Button press will launch the XYZ Reader app", duration);
                popUpMsg.show();
            case R.id.gncButtonCapstone:
                popUpMsg.makeText(gncContext, "Button press will launch the Capstone app", duration);
                popUpMsg.show();
        }*/
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
