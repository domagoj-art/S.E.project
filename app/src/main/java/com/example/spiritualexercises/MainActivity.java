package com.example.spiritualexercises;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView spView;

    private Random rng = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spView = findViewById(R.id.spView);

        spView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shake();

            }
        private void shake () {
                int randomNumber = rng.nextInt(14) + 1;
                switch (randomNumber) {
                    case 1:
                        spView.setText(R.string.first);
                        break;
                    case 2:
                        spView.setText(R.string.second);
                        break;
                    case 3:
                        spView.setText(R.string.third );
                        break;
                    case 4:
                        spView.setText(R.string.fourth);
                        break;
                    case 5:
                        spView.setText(R.string.fifth);
                        break;
                    case 6:
                        spView.setText(R.string.sixth);
                        break;
                    case 7:
                        spView.setText(R.string.seventh);
                        break;
                    case 8:
                        spView.setText(R.string.eighth);
                        break;
                    case 9:
                        spView.setText(R.string.ninth);
                        break;
                    case 10:
                        spView.setText(R.string.tenth);
                        break;
                    case 11:
                        spView.setText(R.string.eleventh);
                        break;
                    case 12:
                        spView.setText(R.string.twelfth);
                        break;
                    case 13:
                        spView.setText(R.string.thirteenth);
                        break;
                    case 14:
                        spView.setText(R.string.fourteenth);
                        break;



                }
        }


    });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_info:
                startActivity(new Intent(this,InfoActivity.class));
                break;
        }
        return true;
    }
}


