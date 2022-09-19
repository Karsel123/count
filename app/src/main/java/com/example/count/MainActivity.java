package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast, count;
    TextView Result;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = (Button)findViewById(R.id.toast);
        count = (Button)findViewById(R.id.count);
        Result = (TextView)findViewById(R.id.Result);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = 0;
                Result.setText(String.valueOf(sum));
                Toast.makeText(getApplicationContext(),"The COunter has been reset to 0",Toast.LENGTH_LONG).show();
            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum++;
                Result.setText(String.valueOf(sum));
            }
        });

    }
}