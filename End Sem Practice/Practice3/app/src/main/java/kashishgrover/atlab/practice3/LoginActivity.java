package kashishgrover.atlab.practice3;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText6);
        loginButton = (Button) findViewById(R.id.button2);

        db = openOrCreateDatabase("UserDB", Context.MODE_PRIVATE,null);
        final Intent i = new Intent(LoginActivity.this, CheckBoxActivity.class);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean flag = false;
                Cursor cursor = db.rawQuery("select username,password from user;",null);
                if(cursor.moveToFirst()) {
                    do {
                        String username = cursor.getString(0);
                        String password = cursor.getString(1);
                        if(username.equals(usernameEditText.getText().toString()) &&
                            password.equals(passwordEditText.getText().toString())) {
                            flag = true;
                            break;
                        }
                        else flag = false;
                    }while(cursor.moveToNext());
                }
                if(flag == true)
                    startActivity(i);
                else {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context,"INVALID",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });



    }
}
