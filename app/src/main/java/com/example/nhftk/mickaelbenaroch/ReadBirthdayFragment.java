package com.example.nhftk.mickaelbenaroch;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadBirthdayFragment extends Fragment {
    private TextView txtinfo;
    RecyclerView recyclerView2;

    public ReadBirthdayFragment() {
        // Required empty public constructor
        List<Birthday> births = Birthdays.myDataBase.mydao().getBirthdays();

        String info = "";
        for (Birthday bday : births) {
            String name = bday.getFullName();
            Date dt = bday.getBirthdayDate();

            info = info + "\n\n" + "full name: " + name + " Birthday: " + dt.toString();
            txtinfo.setText(info);

        }



//        Intent intent = new Intent(getActivity(), ReadBirthdayActivity2.class);
//        startActivity(intent);
    }


}