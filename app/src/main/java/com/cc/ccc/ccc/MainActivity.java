package com.cc.ccc.ccc;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textView = (TextView)findViewById(R.id.flag);
        //textView.setText(c.l());


        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, c.l(), Toast.LENGTH_SHORT).show();
                Log.i("flag", c.l());  //{"sig":0,"cb":10,"file":[],"prop":[]}
            }

        });
    }
}
