package kashishgrover.atlab.clinicmanagement;
 import android.annotation.SuppressLint;
 import android.content.Intent;
 import android.database.Cursor;
 import android.database.sqlite.SQLiteDatabase;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.util.Log;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed=(EditText)findViewById(R.id.editText);
        final EditText ed1=(EditText)findViewById(R.id.editText2);
        String uname=ed.getText().toString();
        String pass=ed1.getText().toString();
        SQLiteDatabase mydatabase=openOrCreateDatabase("login", MODE_PRIVATE, null);
        //mydatabase.execSQL("CREATE TABLE login(username varchar(20),password varchar(20));");
       // mydatabase.execSQL("INSERT INTO login VALUES('kashish','zildjian1');");
        //mydatabase.execSQL("INSERT INTO login VALUES('grover','zildjian1');");
        @SuppressLint("Recycle") final Cursor resultSet=mydatabase.rawQuery("Select * from login;",null);
        final int size=resultSet.getCount();
        resultSet.moveToFirst();
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                String uname=ed.getText().toString();
                String pass=ed1.getText().toString();
                for(int i=0;i<size;i++)
                {
                    resultSet.moveToPosition(i);
                    String a=resultSet.getString(0).toString();
                    String b=resultSet.getString(1).toString();
                    Log.d("Answer",uname+" "+pass);
                    if(a.equals(uname)==true && b.equals(pass)==true)
                    {
                    Intent in=new Intent(MainActivity.this,resultActivity.class);
                    in.putExtra("username",String.valueOf(uname));
                    MainActivity.this.startActivity(in);
                    }
                }

            }
        });
    }
}
