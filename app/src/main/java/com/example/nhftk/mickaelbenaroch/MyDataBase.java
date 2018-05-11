package com.example.nhftk.mickaelbenaroch;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

@Database(entities ={Birthday.class}, version = 1)
@TypeConverters(Converters.class)
public abstract class MyDataBase extends RoomDatabase {

    public abstract MyDao mydao();
}
