package cn.dreamchase.flower.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatasDao {

    private DatasDB myDB;
    private SQLiteDatabase db;

    public DatasDao(Context context) {
        myDB = DatasDB.getDatasDB(context);
        db = myDB.getWritableDatabase();
    }

    public long insertValue(String table, ContentValues values) {
        return db.insert(table, null, values);
    }

    public int updateValue(String table, ContentValues values, String whereClause, String[] whereArgs) {
        return db.update(table, values, whereClause, whereArgs);
    }

    public int deleteValue(String table, String whereClause, String[] whereArgs) {
        return db.delete(table, whereClause, whereArgs);
    }

    public Cursor selectValue(String sql, String[] selectArgs) {
        return db.rawQuery(sql, selectArgs);
    }

    public Cursor selectValue2(String table, String[] columns, String selection, String[] selectArgs, String groupBy,
                               String having, String orderBy) {
        return db.query(table, columns, selection, selectArgs, groupBy, having, orderBy);
    }

    public void close() {
        db.close();
    }

    public void clear(String name) {
        db.execSQL("delete from " + name);
    }

    public Cursor selectAll(String table) {
        return selectValue2(table, null, null, null, null, null, null);
    }

    public Cursor selectColumn(String table, String[] columns) {
        return selectValue2(table, columns, null, null, null, null, null);
    }
}
