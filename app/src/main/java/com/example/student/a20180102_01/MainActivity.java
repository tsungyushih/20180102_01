package com.example.student.a20180102_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {//方法3:加上implement View.OnClickListener
    Button but3;
    ToggleButton tb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but3=findViewById(R.id.button3);
        but3.setOnClickListener(this);//方法4:implement View.OnClickListener時的寫法，以避免當按鈕有10幾顆時的麻煩
        /*方法1
        x listener1 = new x();
        but3.setOnClickListener(listener1);
        */
        /*方法2:下面為上方的實務常用寫法，稱為"內部匿名類別"
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Text3",Toast.LENGTH_LONG).show();
            }
        });
        */
        tb1=findViewById(R.id.toggleButton);
        tb1.setOnClickListener(new View.OnClickListener() //因ToggleButton和android.view.View有間接繼承關係，所以可以用OnClickListener
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"切換",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /* 當只有button1時的寫法
    public void click1(View v)
    {
        Toast.makeText(this,"Test1",Toast.LENGTH_LONG).show();
    }
    */

    @Override      //方法2
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
            Toast.makeText(this, "Test3", Toast.LENGTH_LONG).show();
            break;
        }
    }
    //當共用同一個method click1時，除了寫兩次外還有以下寫法
    public void click1(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                Toast.makeText(this,"Text1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"Text2",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /*方法1:以下為自己寫的JAVA語法寫的method，但"內部匿名類別"寫法不需要
    class x implements View.OnClickListener
    {
        @Override
        public void onClick(View view1) {
            Toast.makeText(MainActivity.this,"Text3",Toast.LENGTH_LONG).show();
        }
    }
    */

    public void click99 (View v)
    {
        Intent it=new Intent(this,Main2Activity.class);
        startActivity(it);
    }
}
