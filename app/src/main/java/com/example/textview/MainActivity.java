package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonZwie = findViewById(R.id.buttonZwieksz);
        buttonZwie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float[] rozmiary = new float[5];
                TextView textView1 = findViewById(R.id.textView);
                rozmiary[0] = textView1.getTextSize();
                TextView textView2 = findViewById(R.id.textView2);
                rozmiary[1] = textView2.getTextSize();
                TextView textView3 = findViewById(R.id.textView3);
                rozmiary[2] = textView3.getTextSize();
                TextView textView4 = findViewById(R.id.textView4);
                rozmiary[3] = textView4.getTextSize();
                TextView textView5 = findViewById(R.id.textView5);
                rozmiary[4] = textView5.getTextSize();

                textView1.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[0]+=1);
                textView2.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[1]+=1);
                textView3.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[2]+=1);
                textView4.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[3]+=1);
                textView5.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[4]+=1);


            }
        });


        Button buttonZmiej = findViewById(R.id.buttonPomniejsz);
        buttonZmiej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float[] rozmiary = new float[5];
                TextView textView1 = findViewById(R.id.textView);
                rozmiary[0] = textView1.getTextSize();
                TextView textView2 = findViewById(R.id.textView2);
                rozmiary[1] = textView2.getTextSize();
                TextView textView3 = findViewById(R.id.textView3);
                rozmiary[2] = textView3.getTextSize();
                TextView textView4 = findViewById(R.id.textView4);
                rozmiary[3] = textView4.getTextSize();
                TextView textView5 = findViewById(R.id.textView5);
                rozmiary[4] = textView5.getTextSize();

                textView1.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[0]-=1);
                textView2.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[1]-=1);
                textView3.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[2]-=1);
                textView4.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[3]-=1);
                textView5.setTextSize(TypedValue.COMPLEX_UNIT_PX, rozmiary[4]-=1);


            }
        });
    }
}