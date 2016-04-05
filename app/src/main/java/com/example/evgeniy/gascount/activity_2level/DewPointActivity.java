package com.example.evgeniy.gascount.activity_2level;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.evgeniy.gascount.R;
import com.example.evgeniy.gascount.dewpoint.DewPoint;

public class DewPointActivity extends AppCompatActivity {

    private EditText dewpoint;
    private EditText pressure;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dew_point);
    }

    public void onClicButton(View view){
        dewpoint = (EditText)findViewById(R.id.dp_initialDP);
        pressure = (EditText)findViewById(R.id.dp_pressure);
        result = (TextView)findViewById(R.id.dp_result);

        String dp = dewpoint.getText().toString();
        String pr = pressure.getText().toString();

        double dpoint = Double.valueOf(dp);
        double pres = Double.valueOf(pr);

        double res = DewPoint.calcDP(dpoint, pres);

        result.setText(""+res);


    }


}
