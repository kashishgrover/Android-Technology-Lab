package com.example.student.rchat_calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void clear_txt_1(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.txt_1);
        e1.setText("");
    }

    public void clear_txt_2(View v)
    {
        EditText e2 = (EditText) findViewById(R.id.txt_2);
        e2.setText("");
    }

    public void click_plus(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.txt_1);
        EditText e2 = (EditText) findViewById(R.id.txt_2);
        float x = Float.parseFloat(e1.getText().toString());
        float y = Float.parseFloat(e2.getText().toString());
        float ans;
        ans = x + y;
        Intent i = new Intent(MainActivity.this,result_page.class);
        i.putExtra("abc",String.valueOf(ans));
        startActivity(i);
    }

    public void click_minus(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.txt_1);
        EditText e2 = (EditText) findViewById(R.id.txt_2);
        float x = Float.parseFloat(e1.getText().toString());
        float y = Float.parseFloat(e2.getText().toString());
        float ans;
        ans = x - y;
        Intent i = new Intent(MainActivity.this,result_page.class);
        i.putExtra("abc",String.valueOf(ans));
        startActivity(i);
    }

    public void click_multiply(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.txt_1);
        EditText e2 = (EditText) findViewById(R.id.txt_2);
        float x = Float.parseFloat(e1.getText().toString());
        float y = Float.parseFloat(e2.getText().toString());
        float ans;
        ans = x * y;
        Intent i = new Intent(MainActivity.this,result_page.class);
        i.putExtra("abc",String.valueOf(ans));
        startActivity(i);
    }

    public void click_divide(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.txt_1);
        EditText e2 = (EditText) findViewById(R.id.txt_2);
        float x = Float.parseFloat(e1.getText().toString());
        float y = Float.parseFloat(e2.getText().toString());
        float ans;
        ans = x / y;
        Intent i = new Intent(MainActivity.this,result_page.class);
        i.putExtra("abc",String.valueOf(ans));
        startActivity(i);
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
