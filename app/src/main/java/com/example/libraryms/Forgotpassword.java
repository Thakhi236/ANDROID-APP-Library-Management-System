package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Forgotpassword extends AppCompatActivity implements View.OnClickListener{



    EditText a,c;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("RESET PASSWORD");
        setContentView(R.layout.activity_forgotpassword);



        a =(EditText)findViewById(R.id.forgotemail);
        c =(EditText)findViewById(R.id.forgotsurname);

        reg =(Button)findViewById(R.id.forgotreset);
        reg.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {





        if(v.equals(reg)){
            String em =a.getText().toString();
            String syr = c.getText().toString();

            boolean state =true;

            if(em.equals("")){
                a.setError("email address can not be empty");
                state = false;
            }
            if(syr.equals("")){
                state = false;
                c.setError("please input surname");
            }

            if(state == true){



                //check if names,surname,and email exist in the date base then move to the reset password inteface


                Intent intent = new Intent(Forgotpassword.this,ResetP.class);
                startActivity(intent);




            }




        }








    }
}
