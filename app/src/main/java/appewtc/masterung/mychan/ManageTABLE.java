package appewtc.masterung.mychan;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 11/16/15 AD.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String TABLE_CHAN = "chanTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_CATEGORY = "Category";
    public static final String COLUMN_TITLE = "Title";
    public static final String COLUMN_HEAD = "Head";
    public static final String COLUMN_DETAIL = "Detail";
    public static final String COLUMN_SOURCE = "Source";
    public static final String COLUMN_LAT = "Lat";
    public static final String COLUMN_LNG = "Lng";
    public static final String COLUMN_REVIEW = "Review";

    public ManageTABLE(Context context) {

        //Create & Connect Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

    //Add New Value to SQLite
    public long addValue(String strCategory, String strTitle, String strHead, String strDetail, String strSource, String strLat, String strLng, String strReview) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_CATEGORY, strCategory);
        objContentValues.put(COLUMN_TITLE, strTitle);
        objContentValues.put(COLUMN_HEAD, strHead);
        objContentValues.put(COLUMN_DETAIL, strDetail);
        objContentValues.put(COLUMN_SOURCE, strSource);
        objContentValues.put(COLUMN_LAT, strLat);
        objContentValues.put(COLUMN_LNG, strLng);
        objContentValues.put(COLUMN_REVIEW, strReview);

        return writeSqLiteDatabase.insert(TABLE_CHAN, null, objContentValues);
    }



}   // Main Class
