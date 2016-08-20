package com.mit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class success extends Activity {
	Bundle b;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.success);
	        b=getIntent().getExtras();
	        String s=b.getString("name");
	        TextView t=(TextView) findViewById(R.id.textView1);
	        t.setText("Welcome "+s);
            Toast.makeText(success.this, "Login Successful!", Toast.LENGTH_SHORT).show();
    }
}
