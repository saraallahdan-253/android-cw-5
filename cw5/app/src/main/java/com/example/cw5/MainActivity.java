package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username = findViewById(R.id.editTextTextPersonName);
        Button one =findViewById(R.id.button1);
        final Button two =findViewById(R.id.button2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name =username.getText().toString();
                Intent s = new Intent(MainActivity.this,MainActivity2.class);
                s.putExtra( "move",name);
                startActivity(s);


                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent a = new Intent(MainActivity.this,MainActivity3.class);
                        startActivity(a);

                    }
                });
            }
        });


    }
}