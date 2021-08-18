package com.example.tradeonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bt;
Button btt;
EditText edittext,edittext1,edittext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.b1);
        edittext=findViewById(R.id.e1);
        edittext1=findViewById(R.id.e2);
        edittext2=findViewById(R.id.e4);
        btt=findViewById(R.id.b2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
        btt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edittext.getText().toString())){
                    Toast.makeText(MainActivity.this, "Empty field not allowed!",
                    Toast.LENGTH_SHORT).show();
                }
                if(TextUtils.isEmpty(edittext2.getText().toString())){
                }else {
                    Toast.makeText(MainActivity.this,
                            "Proceed..", Toast.LENGTH_SHORT).show();
                }
                btt.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                activity();
            }
        });
    }
        public void openNewActivity() {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
    public void activity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}