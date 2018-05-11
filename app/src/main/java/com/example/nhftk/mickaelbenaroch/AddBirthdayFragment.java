package com.example.nhftk.mickaelbenaroch;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddBirthdayFragment extends Fragment {
    private EditText date, name;
    private Button addBtn;

    public AddBirthdayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_birthday, container, false);

        date = view.findViewById(R.id.enterDate);
        name = view.findViewById(R.id.enterName);
        addBtn = view.findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String str = name.getText().toString();
                String text = date.getText().toString();
                java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
                java.time.LocalDate textFieldAsDate = java.time.LocalDate.parse(text, formatter);
                java.sql.Date sqlDate = java.sql.Date.valueOf(String.valueOf(textFieldAsDate));


                Birthday bday = new Birthday();
                bday.setBirthdayDate(sqlDate);
                bday.setFullName(str);

                Birthdays.myDataBase.mydao().addDate(bday);
                Toast.makeText(getActivity(),"Date added succesfully", Toast.LENGTH_SHORT).show();
                bday.setFullName("");
            }

        });

        return view;
    }

}

