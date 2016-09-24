package com.example.student.lab7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button but0, but1, but2, but3, but4, but5, but6,
            but7, but8, but9, butAdd, butSub, butDivision,
            butMul, but10, butC, butEqual;

    EditText edt1;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but0 = (Button) findViewById(R.id.but0);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        but10 = (Button) findViewById(R.id.but10);
        butAdd = (Button) findViewById(R.id.butadd);
        butSub = (Button) findViewById(R.id.butsub);
        butMul = (Button) findViewById(R.id.butmul);
        butDivision = (Button) findViewById(R.id.butdiv);
        butC = (Button) findViewById(R.id.butC);
        butEqual = (Button) findViewById(R.id.buteql);
        edt1 = (EditText) findViewById(R.id.edt1);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
            }
        });

        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true;
                edt1.setText(null);
            }
        });

        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true;
                edt1.setText(null);
            }
        });

        butDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mDivision = true;
                edt1.setText(null);
            }
        });

        butEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true) {

                    edt1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    edt1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    edt1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    edt1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });

        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + ".");
            }
        });
    }


}
