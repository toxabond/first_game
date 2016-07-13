package com.example.zver.clicker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class Click extends AppCompatActivity {
    TextView count;
    Integer i =0;
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    Button Click;
    Button one;
    Button ten;
    Button hundred;
    Button thousands;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        Click = (Button) findViewById(R.id.Click);
        one = (Button) findViewById(R.id.one);
        ten = (Button) findViewById(R.id.ten);
        hundred = (Button) findViewById(R.id.hundred);
        thousands = (Button) findViewById(R.id.thousand);
        count = (TextView) findViewById(R.id.count);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>=10){
                i=i-10;
                a++;}
            }
            });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>=100){
                    i=i-100;
                b++;}
            }
        });

        hundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>=1000){
                    i=i-1000;
                c++;}
            }
        });

        thousands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i>=10000) {
                    i=i-10000;
                d++;}
            }
        });


        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=i+1+(1*a)+(10*b)+(100*c)+(1000*d);
                count.setText("счет"+i);
            }


        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_click, menu);
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
