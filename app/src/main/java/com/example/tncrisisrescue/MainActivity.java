package com.example.tncrisisrescue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    EditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClick(View view){
        phoneNumber = (EditText) findViewById(R.id.editText2);

        String phoneNo = phoneNumber.getText().toString();
        if(phoneNo.isEmpty() || phoneNo.length()!=10){
            Toast.makeText(this, "Enter a valid phone number", Toast.LENGTH_LONG).show();
        }
        else{
            String phone = "+91" + phoneNo;
            Intent intent = new Intent(this, Authenticate.class);
            intent.putExtra("phonenumber",phone);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(FirebaseAuth.getInstance().getCurrentUser()!= null){
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        }
    }
}