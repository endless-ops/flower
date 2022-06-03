package cn.dreamchase.flower.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatasDB extends SQLiteOpenHelper {
    private static final String DB_NAME = "flower.db";
    private static final int DB_VERSION = 1;
    private static DatasDB datasDB;

    public DatasDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public static synchronized DatasDB getDatasDB(Context context) {
        if (datasDB == null) {
            datasDB = new DatasDB(context);
        }
        return datasDB;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String flowers = "create table flower (_id integer primary key autoincrement, name varchar(30) , count integer)";
        String time = "create table date(_id integer primary key autoincrement,time_str varchar(30) ,year integer, month integer,day integer,week integer,plant integer,share integer,plant_time integer)";
        db.execSQL(flowers);
        db.execSQL(time);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
