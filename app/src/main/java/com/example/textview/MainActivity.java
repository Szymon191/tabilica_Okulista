package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TextView> textViewList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonZwie = findViewById(R.id.buttonZwieksz);
        textViewList.add(findViewById(R.id.textView));
        textViewList.add(findViewById(R.id.textView2));
        textViewList.add(findViewById(R.id.textView3));
        textViewList.add(findViewById(R.id.textView4));
        textViewList.add(findViewById(R.id.textView5));

        buttonZwie.setOnClickListener(new ButtonListener());

        Button buttonZmiej = findViewById(R.id.buttonPomniejsz);
        buttonZmiej.setOnClickListener(new ButtonListener());
    }

    class ButtonListener implements View.OnClickListener{

        /*
         private boolean isAdd;
        public ButtonListener(boolean isAdd){
            this.isAdd = isAdd;
        }

         */
        @Override
        public void onClick(View v) {
            for(TextView textView: textViewList){
                float size = textView.getTextSize();
                if(((Button) v).getText().equals("+"))
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size+5);
                else
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size-5);
            }
        }
    }
}