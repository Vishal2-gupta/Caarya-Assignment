package com.example.tradeonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
ImageButton image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image=findViewById(R.id.i1);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activity();
            }
        });

    }
    public void activity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}