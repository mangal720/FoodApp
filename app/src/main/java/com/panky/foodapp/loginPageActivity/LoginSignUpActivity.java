package com.panky.foodapp.loginPageActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.panky.foodapp.R;

public class LoginSignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout relLayoutLogin, relLayoutSignup;
    private Button btnLoginLayout, btnLoginLayoutSignUp, btnSignUpLayoutLogin, btnSignUpLayout;
    private EditText etSignUpLayoutFullName, etSignUpLayoutEmail, etSignUpLayoutMobile,
            etSignUpLayoutPassword, etLoginLayoutMobile, etLoginLayoutPassword;
    private CardView cvLoginLayoutLogin, cvSignUpLayoutSignUp,
            cvLoginLayoutGoogleButton, cvLoginLayoutFacebookButton;
    private TextView tvLoginLayoutForgot, tvSignUpLayoutLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);
        initViews();

        relLayoutSignup.setVisibility(View.GONE);
        relLayoutLogin.setVisibility(View.VISIBLE);

        btnSignUpLayoutLogin.setOnClickListener(this);
        btnLoginLayoutSignUp.setOnClickListener(this);
        tvSignUpLayoutLogin.setOnClickListener(this);
        tvLoginLayoutForgot.setOnClickListener(this);
        cvLoginLayoutLogin.setOnClickListener(this);
        cvSignUpLayoutSignUp.setOnClickListener(this);
        cvLoginLayoutGoogleButton.setOnClickListener(this);
        cvLoginLayoutFacebookButton.setOnClickListener(this);
    }

    private void initViews() {
        relLayoutLogin = findViewById(R.id.relLayoutLogin);
        relLayoutSignup = findViewById(R.id.relLayoutSignUp);
        btnLoginLayoutSignUp = findViewById(R.id.btnLoginLayoutSignUp);
        btnSignUpLayoutLogin = findViewById(R.id.btnSignUpLayoutLogin);

        tvLoginLayoutForgot = findViewById(R.id.tvLoginLayoutForgot);
        tvSignUpLayoutLogin = findViewById(R.id.tvSignUpLayoutLogin);

        cvLoginLayoutFacebookButton = findViewById(R.id.cvLoginLayoutFacebookButton);
        cvLoginLayoutGoogleButton = findViewById(R.id.cvLoginLayoutGoogleButton);
        cvLoginLayoutLogin = findViewById(R.id.cvLoginLayoutLogin);
        cvSignUpLayoutSignUp = findViewById(R.id.cvSignUpLayoutSignUp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSignUpLayoutLogin:
                relLayoutSignup.setVisibility(View.GONE);
                relLayoutLogin.setVisibility(View.VISIBLE);
                break;

            case R.id.btnLoginLayoutSignUp:
                relLayoutSignup.setVisibility(View.VISIBLE);
                relLayoutLogin.setVisibility(View.GONE);
                break;

            case R.id.tvLoginLayoutForgot:
                startActivity(new Intent(LoginSignUpActivity.this, ForgotActivity.class));
                break;

            case R.id.tvSignUpLayoutLogin:
                relLayoutSignup.setVisibility(View.GONE);
                relLayoutLogin.setVisibility(View.VISIBLE);
                break;

            case R.id.cvLoginLayoutFacebookButton:
                Toast.makeText(LoginSignUpActivity.this, "Process this task.....", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cvLoginLayoutGoogleButton:
                Toast.makeText(LoginSignUpActivity.this, "Process this task.....", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cvLoginLayoutLogin:
                Toast.makeText(LoginSignUpActivity.this, "Process this task.....", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cvSignUpLayoutSignUp:
                Toast.makeText(LoginSignUpActivity.this, "Process this task.....", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
