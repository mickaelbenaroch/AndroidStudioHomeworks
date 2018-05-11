package com.example.nhftk.mickaelbenaroch;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "birthdays")
public class Birthday {

    @PrimaryKey
    private Date birthdayDate;
    private  String fullName;

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthdayDate() {

        return birthdayDate;
    }

    public String getFullName() {
        return fullName;
    }
}
