package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText a,b;
    TextView fog,siup,siin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("LOGIN");
        setContentView(R.layout.activity_login);

        siup =(TextView)findViewById(R.id.signup);
        fog  =(TextView)findViewById(R.id.forgot);
        siin =(TextView)findViewById(R.id.signin);
        a =(EditText)findViewById(R.id.email);
        b= (EditText)findViewById(R.id.password) ;

        siin.setOnClickListener(this);
        siup.setOnClickListener(this);
        fog.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if(view.equals(siup)){

            //done

            Intent intent = new Intent(Login.this,createAccount.class);
            startActivity(intent);
            a.setText("");
            b.setText("");

        }



        if(view.equals(fog)){

            //done
            Intent intent = new Intent(Login.this,Forgotpassword.class);
            startActivity(intent);
            a.setText("");
            b.setText("");

        }







        if(view.equals(siin)){

            String ems = a.getText().toString();
            String pas =b.getText().toString();

            boolean LoginState = true;


            if(ems.equals("")){
                a.setError("Email address can not be empty");
                LoginState = false;

            }


            if(pas.equals("")){
                b.setError("password can not be empty");
                LoginState = false;

            }

            else if(LoginState == true){




                if(ems.equals("Admin")){

                    //do sign in condition for sign in
                    Intent intent = new Intent(Login.this,Homepage.class);
                    startActivity(intent);






                    a.setText("");
                    b.setText("");
                }

                else{
                    //handle app user interface


                }













            }





        }






    }
}
