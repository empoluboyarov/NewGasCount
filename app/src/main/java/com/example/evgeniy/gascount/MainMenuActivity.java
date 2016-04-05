package com.example.evgeniy.gascount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.evgeniy.gascount.activity_2level.ConverterActivity;
import com.example.evgeniy.gascount.activity_2level.CountsActivity;
import com.example.evgeniy.gascount.activity_2level.DewPointActivity;
import com.example.evgeniy.gascount.activity_2level.MethodicsActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt_counts:
                startActivity(new Intent(this, CountsActivity.class));
                break;
            case R.id.bt_methodics:
                startActivity(new Intent(this, MethodicsActivity.class));
                break;
            case R.id.bt_pressure:
                startActivity(new Intent(this, ConverterActivity.class));
                break;
            case R.id.bt_dewpoint:
                startActivity(new Intent(this,DewPointActivity.class));
                break;
        }
    }
}
