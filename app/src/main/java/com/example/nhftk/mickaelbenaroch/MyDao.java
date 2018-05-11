package com.example.nhftk.mickaelbenaroch;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addDate(Birthday bday);

    @Query("select * from birthdays")
    public List<Birthday> getBirthdays();
}
