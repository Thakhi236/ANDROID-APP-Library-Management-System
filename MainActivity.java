package com.example.newone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button _btnReg, _btnLogin;
    EditText Name,addr,mail,user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnLogin = (Button) findViewById(R.id.button2);
        _btnReg = (Button)findViewById(R.id.button);
        addr = (EditText) findViewById(R.id.address);
        mail = (EditText) findViewById(R.id.email);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        Name = (EditText) findViewById(R.id.name);

        _btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String address = addr.getText().toString();
                String email = mail.getText().toString();
                String username = user.getText().toString();
                String password = pass.getText().toString();
                String type ="reg";
               BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
               backgroundTask.execute(type, name, address, email, username, password);

            }
       });
    }
}

