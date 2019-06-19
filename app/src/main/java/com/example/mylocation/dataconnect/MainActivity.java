package com.example.mylocation.dataconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email,pass,branch;
    MyDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        branch=findViewById(R.id.branch);


       db=new MyDatabase(this);
    }



    public void registerUser(View view) {
        String e=email.getText().toString();
        String p=pass.getText().toString();
        String b=branch.getText().toString();

        db.insertData(e,p,b);
    }
}
