package kashishgrover.atlab.practice3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ViewAllActivity extends AppCompatActivity {

    TextView tv;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        tv = (TextView) findViewById(R.id.textView);
        tv.setText("");
        tv.setMovementMethod(new ScrollingMovementMethod());

        db = openOrCreateDatabase("UserDB", Context.MODE_PRIVATE, null);

        Cursor cursor = db.rawQuery("select * from user;",null);
        if(cursor.moveToFirst()) {
            do {
                String username = cursor.getString(0);
                String phone = cursor.getString(1);
                String password = cursor.getString(2);
                tv.append("***************************\n");
                tv.append("Username: " + username + "\n");
                tv.append("Phone: " + phone + "\n");
                tv.append("Password: " + password + "\n");
            }while(cursor.moveToNext());
        }
    }
}
