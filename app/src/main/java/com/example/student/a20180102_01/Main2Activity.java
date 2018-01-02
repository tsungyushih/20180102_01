package com.example.student.a20180102_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {
    ToggleButton tb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tb1 = findViewById(R.id.toggleButton2);
        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tb1.isChecked()) {
                    Toast.makeText(Main2Activity.this, "開啟中", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Main2Activity.this, "關閉中", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void clickcheck(View v)
    {
        if (tb1.isChecked())
        {
            Toast.makeText(Main2Activity.this,"開啟中",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(Main2Activity.this,"關閉中",Toast.LENGTH_SHORT).show();
        }
    }


}
