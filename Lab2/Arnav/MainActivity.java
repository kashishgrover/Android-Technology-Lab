package com.mit.project2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button login;
	EditText uname;
	EditText pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		//Initializing elements
		login =(Button) findViewById(R.id.button1);
		uname=(EditText) findViewById(R.id.name);
		pwd=(EditText) findViewById(R.id.password);
       
        login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				if(uname.getText().toString().trim().equals("")){
					Toast.makeText(MainActivity.this, "Username field cannot be empty",Toast.LENGTH_SHORT).show();
				}
				else if(pwd.getText().toString().trim().equals("")){
					Toast.makeText(MainActivity.this, "Password field cannot be empty",Toast.LENGTH_SHORT).show();
				}
				else{
					if(uname.getText().toString().equals(Lab2Constants.username)){
						if(pwd.getText().toString().equals(Lab2Constants.password)){
							Intent i=new Intent(MainActivity.this,success.class);
							i.putExtra("name",uname.getText().toString());
							startActivity(i);
						}
						else {
							Toast.makeText(MainActivity.this, "Wrong Password Entered",Toast.LENGTH_SHORT).show();
						}
					}
					else {
						Toast.makeText(MainActivity.this, "Wrong Username Entered",Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
    }
}
