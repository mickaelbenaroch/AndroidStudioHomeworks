package com.example.nhftk.mickaelbenaroch;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Birthdays extends AppCompatActivity {

    public static android.support.v4.app.FragmentManager fragmentManager;
    public  static MyDataBase myDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdays);
        fragmentManager = getSupportFragmentManager();
        myDataBase = Room.databaseBuilder(getApplicationContext(),MyDataBase.class, "birthdayDb" ).allowMainThreadQueries().build();
        if(findViewById(R.id.fragment_container)!= null ){

            if(savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, new HomeFragment()).commit();

        }
    }
}

