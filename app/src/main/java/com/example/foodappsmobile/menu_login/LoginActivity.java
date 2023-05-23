package com.example.foodappsmobile.menu_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodappsmobile.R;
import com.example.foodappsmobile.menu_new_account.MenuCreateNewAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void register(View view) {
        Intent intent = new Intent(LoginActivity.this, MenuCreateNewAccountActivity.class);
        startActivity(intent);
    }
}