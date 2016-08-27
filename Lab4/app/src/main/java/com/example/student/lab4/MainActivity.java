package com.example.student.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private CheckBox chk1, chk2, chk3;
    private Button okay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnChk1();
        addListenerOnChk2();
        addListenerOnChk3();
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        // TODO Auto-generated method stub

        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        okay = (Button) findViewById(R.id.button1);

        okay.setOnClickListener(new OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Bread check : ").append(chk1.isChecked());
                result.append("\nDairy check : ").append(chk2.isChecked());
                result.append("\nFruits check  :").append(chk3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addListenerOnChk1() {
        // TODO Auto-generated method stub
        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //is chk1 checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Bread Selected", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void addListenerOnChk2() {
        // TODO Auto-generated method stub
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //is chk1 checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Dairy Selected", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void addListenerOnChk3() {
        // TODO Auto-generated method stub
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //is chk1 checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Fruits Selected", Toast.LENGTH_LONG).show();
                }
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
