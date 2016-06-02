package com.example.bidzis.errorreportsystem.User;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.bidzis.errorreportsystem.R;

public class RegisterUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_register_activity);

        final EditText etEmail = (EditText) findViewById(R.id.etEmailRegisterUser);
        final EditText etLogin = (EditText) findViewById(R.id.etLoginRegisterUser);
        final EditText etPassword = (EditText) findViewById(R.id.etPasswordRegisterUser);
        final EditText etName = (EditText) findViewById(R.id.etNameRegisterUser);
        final EditText etSurname = (EditText) findViewById(R.id.etSurnameRegisterUser);
        final Button btRegister = (Button) findViewById(R.id.btRegisterUser);

    }
}
