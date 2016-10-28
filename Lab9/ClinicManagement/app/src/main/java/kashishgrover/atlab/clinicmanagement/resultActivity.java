package kashishgrover.atlab.clinicmanagement;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.w3c.dom.Text;
public class resultActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent i =getIntent();
        String uname =i.getStringExtra("username");
        Log.d("result",String.valueOf(uname));
        LinearLayout layout=(LinearLayout)findViewById(R.id.main);
        SQLiteDatabase mydatabase1=openOrCreateDatabase("patient", MODE_PRIVATE, null);

        mydatabase1.execSQL("CREATE TABLE appointment(name varchar(20),deptartment varchar(20),room varchar(3));");
        mydatabase1.execSQL("CREATE TABLE patient(uname varchar(20),name varchar(20),age varchar(2),dob varchar(20),bloodtype varchar(5));");
        mydatabase1.execSQL("INSERT INTO patient VALUES('kashish','Kashish Grover','21','16-01-1995','O+');");
        @SuppressLint("Recycle") Cursor resultSet=mydatabase1.rawQuery("Select * from patient", null);
        final int size=resultSet.getCount();
        resultSet.moveToFirst();
        for(int j =0;j<size;j++)
        {
            resultSet.moveToPosition(j);
            String u=resultSet.getString(0);

            String s=resultSet.getString(1);
            String s1=resultSet.getString(2);
            String s2=resultSet.getString(3);
            String s3=resultSet.getString(4);
            if(u.equals(uname))
            {
                TextView qtv = new TextView(this);
                qtv.setText(s);
                qtv.setTextSize(15);
                qtv.setPadding(10, 10, 10, 10);
                layout.addView(qtv);

                TextView o1tv = new TextView(this);
                o1tv.setText(s1);
                layout.addView(o1tv);

                TextView o2tv = new TextView(this);
                o2tv.setText(s2);
                layout.addView(o2tv);

                TextView o3tv = new TextView(this);
                o3tv.setText(s3);
                layout.addView(o3tv);

                Button b1 = (Button) new Button(this);
                b1.setText("Book Appointment");
                layout.addView(b1);

                b1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent in=new Intent(resultActivity.this,doctor.class);
                        resultActivity.this.startActivity(in);
                    }
                });
            }

        }
    }
}
