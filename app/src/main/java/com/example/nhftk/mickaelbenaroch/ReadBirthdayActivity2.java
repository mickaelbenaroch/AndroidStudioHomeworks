package com.example.nhftk.mickaelbenaroch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ReadBirthdayActivity2 extends AppCompatActivity  {

    private TextView txtinfo;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_birthday2);
        recyclerView = findViewById(R.id.programmingList2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        txtinfo = findViewById(R.id.textTitle);
        String[] items = {"demo","demo", "demo", "demo"};
        List<Birthday> births = Birthdays.myDataBase.mydao().getBirthdays();

        //Sorts Dates that came from database in descending
        //Log.d("DATE", String.valueOf(Calendar.getInstance().getTime().getDate()));
        //Log.d("DATE", String.valueOf(Calendar.getInstance().getTime().getMonth()));

        Collections.sort(births, new Comparator<Birthday>() {
            @Override
            public int compare(Birthday o1, Birthday o2) {
                if(o1.getBirthdayDate().after(o2.getBirthdayDate())){
                    return  -1;
                }
                else{
                    return 1;
                }
                //return o1.getBirthdayDate().compareTo(o2.getBirthdayDate());
            }
        });

//        for(int i=0; i<births.size(); i++){
//            int day = births.get(i).getDate();
//            int month = births.get(i).getMonth();
//        }
        String[] errorSoon = new String[births.size()];

        String info = "";

        int i = 0;
        for (Birthday bday : births) {


            String name = bday.getFullName();
            Date dt = bday.getBirthdayDate();
            info =  "\n\n" + "full name: " + name + " Birthday: " + dt.toString();
            errorSoon[i] = info;
            i++;

        }

        //Reverse the array order to sort from the soon date to the late one
        Collections.reverse(Arrays.asList(errorSoon));

        recyclerView.setAdapter(new ProgrammingAdapter2(errorSoon));

    }

}

