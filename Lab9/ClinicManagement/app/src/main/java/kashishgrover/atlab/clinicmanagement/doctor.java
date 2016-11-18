package kashishgrover.atlab.clinicmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mahe on 10/21/2016.
 */
public class doctor extends AppCompatActivity
{
    String send;
    public void onCreate(Bundle savedBundleInstance)
    {
        super.onCreate(savedBundleInstance);
        setContentView(R.layout.doctor);
        Button b=(Button)findViewById(R.id.button6);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                send="Spongebob Modi"+"-"+"Cardiology"+"-"+"102";
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                send="Patrick Mehta"+"-"+"Pediatrician"+"-"+"009";
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                send="Gary Paul"+"-"+"General Physician"+"-"+"405";
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent in=new Intent(doctor.this,resultActivity.class);
                in.putExtra("bach",String.valueOf(send));
                doctor.this.startActivity(in);
            }
    });

    }
}
