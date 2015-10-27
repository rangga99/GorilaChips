package com.application.gorilachips;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Rian Heri H on 10/28/2015.
 */
public class RegisterMenu extends AppCompatActivity {
    EditText email;
    EditText password;
    TextView forgotPassword;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText)findViewById(R.id.etEmail);
        password = (EditText)findViewById(R.id.etPassword);
        forgotPassword = (TextView)findViewById(R.id.forgotPassword);
        register = (Button)findViewById(R.id.register);
    }
}
