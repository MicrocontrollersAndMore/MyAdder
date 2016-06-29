package com.chrisdahms.android.myadder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

///////////////////////////////////////////////////////////////////////////////////////////////////
public class MainActivity extends AppCompatActivity {

    // member variables ///////////////////////////////////////////////////////////////////////////
    private EditText etNum1;
    private EditText etNum2;
    private TextView tvAnswer;
    private Button btnAdd;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText)findViewById(R.id.etNum1);
        etNum2 = (EditText)findViewById(R.id.etNum2);
        tvAnswer = (TextView)findViewById(R.id.tvAnswer);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(etNum1.getText().toString());
                double num2 = Double.parseDouble(etNum2.getText().toString());
                double answer = num1 + num2;

                tvAnswer.setText(String.valueOf(answer));
            }
        });

    }
}
