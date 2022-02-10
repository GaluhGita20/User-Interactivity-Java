package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private EditText input1;
    private TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.done_button);
        input1 = (EditText) findViewById(R.id.nickname_edit);
        result1 = (TextView) findViewById(R.id.nickname_text);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                input1.setText("Hallo " + input1.getText());
                result1.setText("Hallo " + input1.getText());
                result1.setVisibility(View.VISIBLE);
                input1.setVisibility(View.GONE);
                btnClick.setVisibility(View.GONE);
            }
        });

        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result1.setVisibility(View.GONE);
                input1.setVisibility(View.VISIBLE);
                btnClick.setVisibility(View.VISIBLE);
            }
        });
    }
}