package com.example.student.lab5;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button encrypt;

        encrypt = (Button) findViewById(R.id.button);

        encrypt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                char p[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z'};

                char ch[] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
                        'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
                        'V', 'B', 'N', 'M'};

                EditText msg = (EditText) findViewById(R.id.editText);

                String s;


                s = msg.getText().toString();

                char c[] = new char[(s.length())];
                for (int i = 0; i < s.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        if (p[j] == (s.charAt(i))) {
                            c[i] = ch[j];
                            break;
                        }
                    }
                }
                String a = "";

                for (int i = 0; i < c.length; i++) {
                    a += c[i];
                }

                TextView m = (TextView) findViewById(R.id.textView3);
                m.setText(a);
            }
        });
    }
}
