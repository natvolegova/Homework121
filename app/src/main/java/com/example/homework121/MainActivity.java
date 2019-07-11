package com.example.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.EditText;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    private  Button btnSubscribe;
    private Button btnReset;
    private TextView output;
    private EditText name;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //объявили переменные
        initView();
        //объявили методы
        btnSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result_name=name.getText().toString();
                String result_email = email.getText().toString();
                if(!result_name.equals("") && !result_email.equals("")){
                    String result = String.format(getString(R.string.btn_result_text), result_name, result_email);
                    output.setText(result);
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");
                name.setText("");
                email.setText("");
            }
        });
    }
    private void initView(){
        btnSubscribe = findViewById(R.id.btnSubscribe);
        btnReset = findViewById(R.id.btnReset);
        output = findViewById(R.id.txtResult);
        name = findViewById(R.id.inputName);
        email = findViewById(R.id.inputEmail);
    }

}
