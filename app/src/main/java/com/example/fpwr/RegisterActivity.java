package com.example.fpwr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    private Button restaurant_register_btn;
    private EditText name_edit_txt_restaurant, phone_number_edit_txt_restaurant, password_edit_txt_restaurant;
    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        restaurant_register_btn = findViewById(R.id.register_btn_restaurant);

        name_edit_txt_restaurant = findViewById(R.id.register_name_input_restaurant);
        phone_number_edit_txt_restaurant = findViewById(R.id.register_phone_number_input_restaurant);
        password_edit_txt_restaurant = findViewById(R.id.register_password_input_restaurant);

        loadingBar = new ProgressDialog(this);

        restaurant_register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccount();
            }
        });


    }

    private void CreateAccount() {

        String name = name_edit_txt_restaurant.getText().toString();
        String phone = phone_number_edit_txt_restaurant.getText().toString();
        String password = password_edit_txt_restaurant.getText().toString();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(phone) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please fill up all the fields", Toast.LENGTH_LONG).show();

        }
        else {
            loadingBar.setTitle("Create Account");
            loadingBar.setMessage("Please wait, while we are checking credentials.");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            ValidatephoneNumber(name,phone,password);
        }

    }

    private void ValidatephoneNumber(String name, String phone, String password) {


    }

}

