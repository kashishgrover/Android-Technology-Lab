package kashishgrover.atlab.practice2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editName, editPassword, editRoll;
    TextView tv;
    Button submitButton;

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Registering the elements
        editName = (EditText) findViewById(R.id.editText);
        editRoll = (EditText) findViewById(R.id.editText2);
        editPassword = (EditText) findViewById(R.id.editText3);
        submitButton = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView2);
        tv.setMovementMethod(new ScrollingMovementMethod());

        //Set Listener
        try {
            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    tv.setText("");

                    //Creating database and table
                    db = openOrCreateDatabase("TestDatabase", Context.MODE_PRIVATE, null);
                    db.execSQL("create table if not exists student(name varchar, rno int, password varchar);");

                    //Adding data to the table
                    db.execSQL("insert into student values(\"" + editName.getText() + "\","
                            + Integer.parseInt(String.valueOf(editRoll.getText())) + ",\""
                            + editPassword.getText() + "\");");

                    Cursor c = db.rawQuery("select * from student;", null);
                    if (c.moveToFirst()){
                        do{
                            String name = c.getString(0);
                            String rno = c.getString(1);
                            String pass = c.getString(2);

                            tv.append("\n*******DATA*******\n" +
                                    "NAME: " + name + "\n" +
                                    "RNO: " + rno + "\n" +
                                    "PASS: " + pass);
//
//                            Log.i("NAME: ", name);
//                            Log.i("RNO: ", rno);
//                            Log.i("PASS: ", pass);
                        }while(c.moveToNext());
                    }
                    c.close();
                }
            });
        }catch(Exception e) {
            Log.i("EXCEPTION: ",e.getMessage());
        }
    }
}
