package com.example.firebaseconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view)
    {
        t1=(EditText)findViewById(R.id.t1);

        //firebase object
        FirebaseDatabase db=FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference() ;

        root.setValue(t1.getText().toString());
        t1.setText(" ");
        Toast.makeText(getApplicationContext(),"inserted",Toast.LENGTH_LONG).show();


    }




    //----------end--------------
}