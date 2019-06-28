package com.example.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.EditText;
import java.lang.String;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //объявили переменные
        Button btnSubscribe = findViewById(R.id.btnSubscribe);
        Button btnReset = findViewById(R.id.btnReset);
        //объявили методы
        btnSubscribe.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        TextView output = findViewById(R.id.txtResult);
        EditText name = findViewById(R.id.inputName);
        EditText email = findViewById(R.id.inputEmail);

        switch (view.getId()){
            case R.id.btnSubscribe:
                String result = getString(R.string.btn_result_text);
                result = String.format(result, name.getText().toString(), email.getText().toString());
                output.setText(result);
                break;
            case R.id.btnReset:
                output.setText("");
                name.setText("");
                email.setText("");
                break;
        }
    }

}
