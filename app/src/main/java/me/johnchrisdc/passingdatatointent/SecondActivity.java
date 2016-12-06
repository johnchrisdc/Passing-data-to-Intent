package me.johnchrisdc.passingdatatointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String data = getIntent().getStringExtra("data");

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

    }
}
