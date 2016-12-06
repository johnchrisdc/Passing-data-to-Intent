package me.johnchrisdc.passingdatatointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("data", "Hello World");
        startActivity(intent);
    }

}
