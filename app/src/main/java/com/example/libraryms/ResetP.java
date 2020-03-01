package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetP extends AppCompatActivity implements View.OnClickListener {


    EditText a,b;
    Button ret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_p);






        a =(EditText)findViewById(R.id.retpassword);
        b =(EditText)findViewById(R.id.retconfirmpassword);
        ret =(Button)findViewById(R.id.resetpassword);
        getSupportActionBar().setTitle("RESET PASSWORD");


        ret.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {




        //get email from forgotpassword acticvity




        if(v.equals(ret)){

            String p = a.getText().toString();
            String pp = b.getText().toString();
            boolean state = true;

            if(p.equals("")){
                a.setError("password can not b empty");
                state = false;

            }

            if(!pp.equals(p)){
                b.setError("password did not match");
                state = false;

            }
            else if(state == true){
                //reset password and move to homepage  ie update datebase
                //move to homepage
                Toast.makeText(getApplicationContext(),"password successfully recoverd", Toast.LENGTH_SHORT).show();




            }

        }







    }
}
