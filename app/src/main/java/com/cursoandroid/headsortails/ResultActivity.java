package com.cursoandroid.headsortails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageResult;
    private ImageView imageBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResult = findViewById(R.id.imageResult);
        imageBack = findViewById(R.id.imageBack);

        Bundle data = getIntent().getExtras();
        int number = data.getInt("number");

        if( number == 0 ){
            imageResult.setImageResource(R.drawable.moeda_cara);
        }else{
            imageResult.setImageResource(R.drawable.moeda_coroa);
        }

        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}