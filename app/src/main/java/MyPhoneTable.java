import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.yasen.raslan.newbrojhe.Main2Activity;

public class MyPhoneTable extends SQLiteOpenHelper {
    private static final int DataBase_VERSION = 1;
    private static final String DATABASE_NAME = "CONTACT_DB";
    private static final String TABLE_CONTACT = "CONTACT_TBL";
    private static final String KEY_ID = "_id";
    private static final String KEY_RAMAT = "ramat";
    private static final String KEY_COLOR = "color";
    private static final String KEY_KIND = "KIND";
    private static final String KEY_MPH = "mph";
    private static final String KEY_GB = "gb";
    private static final String KEY_PRICE = "price";

    public MyPhoneTable(Context context) {
        super(context, DATABASE_NAME, null, DataBase_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreate = "create table " + TABLE_CONTACT + "(" + KEY_ID + "INTEGER PRIMARY KEY , " + KEY_RAMAT + "RAMAT" + KEY_COLOR + "color" + KEY_KIND + "kind" + KEY_MPH + "mph" + KEY_GB + "gb" + KEY_PRICE + "price" + ")";
        db.execSQL(sqlCreate);

    }


    @Override

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqldrop = "DROP TABLE IF EXISTS " + TABLE_CONTACT;
        db.execSQL(sqldrop);
        onCreate(db);
    }

    public long phonedetails(javanew Activity) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_GB, javanew.getGB());
        values.put(KEY_COLOR, javanew.getColor());
        values.put(KEY_ID, javanew.getid());
        values.put(KEY_MPH, javanew.getMph());
        values.put(KEY_RAMAT, javanew.getRamat());
        values.put(KEY_PRICE, javanew.getPrice());
        values.put(KEY_KIND, javanew.getKind());

        long row = db.insert(TABLE_CONTACT, null, values);
        db.close();
        return row;

    }
    public int updatephone(javanew activity){
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_GB, javanew.getGB());
        values.put(KEY_COLOR, javanew.getColor());
        values.put(KEY_ID, javanew.getid());
        values.put(KEY_MPH, javanew.getMph());
        values.put(KEY_RAMAT, javanew.getRamat());
        values.put(KEY_PRICE, javanew.getPrice());
        values.put(KEY_KIND, javanew.getKind());

        int num=db.update(TABLE_CONTACT,values , KEY_ID+"="javanew.getid(),null);
        db.close();
        return num;
    }

    public  int deleteContactById(javanew activity){
        SQLiteDatabase db =this.getWritableDatabase();
        int num =db.delete(TABLE_CONTACT,KEY_ID+"="+Activity.getid());
    }
}

