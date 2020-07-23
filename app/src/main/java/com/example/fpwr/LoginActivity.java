package com.example.fpwr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button LoginBtn , SignupBtn;
    private EditText InputNumber, InputPassword;
    private CheckBox chb_remember_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SignupBtn = findViewById(R.id.Sign_up_btn_restaurant);
        LoginBtn = findViewById(R.id.log_in_btn_restaurant);
        InputNumber = findViewById(R.id.log_in_phone_number_restaurant);
        InputPassword = findViewById(R.id.log_in_password_restaurant);

        SignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
