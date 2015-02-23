package com.example.student.fragmentexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    boolean pass= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager= getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        final FragmentOne fragOne= new FragmentOne();
        FragmentTwo fragTwo= new FragmentTwo();
        transaction.add(R.id.fragView,fragOne,"Fragment1");
        transaction.add(R.id.fragView,fragTwo,"Fragment2");
        transaction.commit();

        Button swButton = (Button)findViewById(R.id.button);

        swButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!pass) {
                    ImageView activity = (ImageView) findViewById(R.id.imageView1);
                    activity.setImageResource(R.drawable.dog2);
                    ImageView activity2 = (ImageView) findViewById(R.id.imageView2);
                    activity2.setImageResource(R.drawable.dog1);
                    pass=true;
                }
                else{
                    ImageView activity3 = (ImageView) findViewById(R.id.imageView1);
                    activity3.setImageResource(R.drawable.dog1);
                    ImageView activity4 = (ImageView) findViewById(R.id.imageView2);
                    activity4.setImageResource(R.drawable.dog2);
                    pass=false;
                }
                // Perform action on click
            }
        });

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
