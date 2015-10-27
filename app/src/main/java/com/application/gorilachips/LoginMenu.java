package com.application.gorilachips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginMenu extends AppCompatActivity implements View.OnClickListener {
    EditText email;
    EditText password;
    TextView forgotPassword;
    Button signIn;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText)findViewById(R.id.etEmail);
        password = (EditText)findViewById(R.id.etPassword);
        forgotPassword = (TextView)findViewById(R.id.forgotPassword);
        signIn = (Button)findViewById(R.id.signIn);
        signUp = (Button)findViewById(R.id.signUp);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signIn:
                startActivity(new Intent(this, MainMenu.class));
                break;
            case R.id.signUp:
                startActivity(new Intent(this, RegisterMenu.class));
                break;
            case R.id.forgotPassword:
                startActivity(new Intent(this, RegisterMenu.class));
                break;
        }
    }
}
