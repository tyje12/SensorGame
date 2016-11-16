package com.example.labuser.sensorgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/*



 */


public class MainActivity extends AppCompatActivity {
    Private Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    startGame = (Button) findViewById(R.id.startGame);

    startGame.setOnclickListener((new View.OnClickListener() {
        @Override
        public void onClick(View v){


        }
    }));

}
