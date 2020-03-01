package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class createAccount extends AppCompatActivity implements View.OnClickListener {


    TextView a,b,c,d,e;
    String nnn="";
    Button cre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        getSupportActionBar().setTitle("CREATE ACCOUNT");


        a =(TextView)findViewById(R.id.names);
        b =(TextView)findViewById(R.id.surname);
        c =(TextView)findViewById(R.id.emailA);
        d =(TextView)findViewById(R.id.pass);
        e=(TextView)findViewById(R.id.confirm);
        cre =(Button)findViewById(R.id.createA);

        cre.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {



        if(v.equals(cre)){


            String na = a.getText().toString();
            String sur =b.getText().toString();
            String em  =c.getText().toString();
            String ps =d.getText().toString();
            String pss=e.getText().toString();

            boolean state = true;
            if(na.equals("")){
                state = false;
                a.setError("please input name(s)");
            }
            if(sur.equals("")){
                state = false;
                b.setError("surname can not be empty");
            }
            if(em.equals("")){
                state = false;
                c.setError("email address can not be empty");
            }
            if(ps.equals("")){
                state = false;
                d.setError("password can not be empty");
            }

            if(!pss.equals(ps)){
                state = false;
                e.setError("password did not match");

            }
            if(nnn.equals("")){
                Toast.makeText(getApplicationContext(),"please select your gender",Toast.LENGTH_SHORT).show();
                state = false;
            }


            else if(state == true){


                Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_SHORT).show();
                //do registration



            }




        }















    }





    public void dogen(View v){
        boolean checked =((RadioButton) v).isChecked();
        switch (v.getId()){
            case R.id.male:
                nnn = "Male";
                break;

            case R.id.female:
                nnn ="Female";
                break;
        }

    }

}
