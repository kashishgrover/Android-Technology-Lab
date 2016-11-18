package kashishgrover.atlab.practice3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameEditText, phoneEditText, passwordEditText;
    Button registerButton;

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameEditText = (EditText) findViewById(R.id.editText);
        phoneEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);

        registerButton =(Button) findViewById(R.id.button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db = openOrCreateDatabase("UserDB", Context.MODE_PRIVATE, null);
                db.execSQL("create table if not exists user(username varchar,phone varchar," +
                        "password varchar);");
                //////
                try {
                    db.execSQL("insert into user values(\"" + usernameEditText.getText() + "\"," +
                            "\"" + phoneEditText.getText() + "\"," +
                            "\"" + passwordEditText.getText() + "\");");
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
