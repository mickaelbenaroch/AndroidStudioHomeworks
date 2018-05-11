package com.example.nhftk.mickaelbenaroch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView = findViewById(R.id.programmingList);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         String[] items = {"Calculator", "Birthdays", "Item", "Item", "Item", "Item", "Item", "Item", "Item"};
         recyclerView.setAdapter(new ProgrammingAdapter(items));


    }

    public void openCalculator(View view){

            if(view.findViewById(R.id.textTitle).getTag().toString().equals("foo0")){

                Intent startNewActivity = new Intent(this, Calculator.class);
                startActivity(startNewActivity);
            }

        if(view.findViewById(R.id.textTitle).getTag().toString().equals("foo1")){

            Intent startNewActivity = new Intent(this, Birthdays.class);
            startActivity(startNewActivity);
        }
    }


}

