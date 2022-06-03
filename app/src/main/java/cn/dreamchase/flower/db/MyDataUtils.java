package cn.dreamchase.flower.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.dreamchase.flower.ui.bean.RecordDate;
import cn.dreamchase.flower.ui.utils.L;

public class MyDataUtils {

    public static long upDateData(Context context, String table, String column, int value) {
        DatasDao datasDao = new DatasDao(context);

        Cursor cursor = datasDao.selectColumn(table, new String[]{"_id", column});
        cursor.moveToLast();
        int id1 = cursor.getColumnIndex("_id");
        int id = cursor.getInt(id1);

        int select1 = cursor.getColumnIndex(column);
        int select = cursor.getInt(select1);

        cursor.close();
        ContentValues values = new ContentValues();
        values.put(column, value + select);//赋值

        long result = datasDao.updateValue(table, values, "_id = ?", new String[]{String.valueOf(id)});
        datasDao.close();
        return result;
    }


    public static Map<String, Integer> getTodayWithYesterdayData(Context context) {
        DatasDao datasDao = new DatasDao(context);
        Map<String, Integer> map = new HashMap<>();
        Cursor cursor = datasDao.selectAll("date");

        cursor.moveToLast();//游标移至最后一行
        int plant = cursor.getColumnIndex("plant");
        int today_plant = cursor.getInt(plant);
        int share = cursor.getColumnIndex("share");
        int today_share = cursor.getInt(share);
        map.put("today_plant", today_plant);
        map.put("today_share", today_share);

        cursor.moveToPrevious();//游标移动到上一行
        int plant1 = cursor.getColumnIndex("plant");
        int yesterday_plant = cursor.getInt(plant1);
        int share1 = cursor.getColumnIndex("share");
        int yesterday_share = cursor.getInt(share1);
        int time_str = cursor.getColumnIndex("time_str");
        String date_str = cursor.getString(time_str);
        L.e("昨日--》日期", date_str);
        map.put("yesterday_plant", yesterday_plant);
        map.put("yesterday_share", yesterday_share);
        cursor.close();
        datasDao.close();
        return map;

    }

    public static ArrayList<RecordDate>
}
