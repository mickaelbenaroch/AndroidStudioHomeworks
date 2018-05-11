package com.example.nhftk.mickaelbenaroch;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    private Button bnAddBday, bnReadBday;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);

        //RecyclerView programList = (RecyclerView) findViewById(R.id.programingList);

        bnAddBday = view.findViewById(R.id.bn_add_bday);
        bnAddBday.setOnClickListener(this);

        bnReadBday = view.findViewById(R.id.view_birthday);
        bnReadBday.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bn_add_bday:
                Birthdays.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddBirthdayFragment()).addToBackStack(null).commit();
                break;

            case R.id.view_birthday:
                Intent intent = new Intent(getActivity(), ReadBirthdayActivity2.class);
                startActivity(intent);
                break;
        }
    }


}
