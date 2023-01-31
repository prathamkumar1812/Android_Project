package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView textView;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView.setText("hellow");
<<<<<<< HEAD


        textView.setText("game");
        textView.setText("ggggg");


=======
        button=findViewById(R.id.button);



       // textView.setText("game");


>>>>>>> master


    }

    public void clickplease(View view) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Start the Project");
            }
        });

    }
}