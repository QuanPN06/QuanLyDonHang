package quanpnph29471.example.quanpnph29471_quanlydonhang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    static  String DB_NAME = "ql_donhang";
    static  int DB_VERSION = 1;

    public DbHelper( Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql_product = "CREATE TABLE tbl_product (" +
                "    id    INTEGER PRIMARY KEY AUTOINCREMENT ," +
                "    name  TEXT    NOT NULL," +
                "    price INTEGER NOT NULL" +
                ");";
        String sql_void = "CREATE TABLE tbl_void (" +
                "    id_void     INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    id_customer INTEGER NOT NULL," +
                "    id_staff    INTEGER NOT NULL," +
                "    date_buy    TEXT    NOT NULL," +
                "    status      TEXT    NOT NULL" +
                ");";
        String sql_detail="CREATE TABLE tbl_detail (\n" +
                "    id_void    INTEGER REFERENCES tbl_void (id_void),\n" +
                "    id_product INTEGER REFERENCES tbl_product (id),\n" +
                "    quantity   INTEGER NOT NULL,\n" +
                "    gia_mua    INTEGER NOT NULL\n" +
                ");";

        sqLiteDatabase.execSQL(sql_product);
        sqLiteDatabase.execSQL(sql_void);
        sqLiteDatabase.execSQL(sql_detail);

        String insert_product = "INSERT INTO tbl_product (name,price) VALUES ('CX-5',900), ('Santafe',1200), ('3008',939),('Cross-h',999) ";
        sqLiteDatabase.execSQL(insert_product);
        String insert_void = "INSERT INTO tbl_void (id_customer,id_staff,date_buy,status) VALUES " +
                "(2,5,'10/10/2023','Đã thanh toán')," +
                "(3,2,'12/12/2023','Đã cọc')," +
                "(4,5,'09/09/2023','Đã thanh toán') ;";
        sqLiteDatabase.execSQL(insert_void);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS  sql_detail");
        // tb_product là bảng bên nhiều phải xóa trước
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS  sql_void");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS  sql_product");
    }
}
