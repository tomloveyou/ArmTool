package com.huayi.armtool.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

import com.huayi.armtool.bean.ZhiChanXXBean;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DemoDBManager {
    static private DemoDBManager dbMgr = new DemoDBManager();
    private DbOpenHelper dbHelper;

    private DemoDBManager() {

       // dbHelper = DbOpenHelper.getInstance(DemoApplication.getInstance().getApplicationContext());
    }


    
    public static synchronized DemoDBManager getInstance() {
        if (dbMgr == null) {
            dbMgr = new DemoDBManager();
        }
        return dbMgr;
    }

    /**
     * save contact list
     *
     * @param values
     */
    synchronized public void saveContactList(ContentValues values) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();



            db.delete(UserDao.TABLE_NAME, null, null);
            db.replace(UserDao.TABLE_NAME, null, values);

    }

    /**
     * @param ZCMC 资产名称
     * @param ZCXH 资产型号
     * @param BGR  保管人
     * @param ZCWZ 资产位置
     * @return
     */
    synchronized public List<ZhiChanXXBean> getContactList(String ZCMC, String ZCXH, String BGR, String ZCWZ) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        List<ZhiChanXXBean> zhiChanXXBeans = new ArrayList<>();
        if (db.isOpen()) {
            Cursor cursor = db.rawQuery("select * from " + ZhiChanXXDao.TABLE_NAME /* + " desc" */, new String[]{ZCMC, ZCXH, BGR, ZCWZ});

            while (cursor.moveToNext()) {
                ZhiChanXXBean zhiChanXXBean = new ZhiChanXXBean();
                String zcmc = cursor.getString(cursor.getColumnIndex(ZhiChanXXDao.COLUMN_NAME_ZCMC));
                String zcxh = cursor.getString(cursor.getColumnIndex(ZhiChanXXDao.COLUMN_NAME_ZCXH));
                int zcid = cursor.getInt(cursor.getColumnIndex(ZhiChanXXDao.COLUMN_NAME_ZCID));
                String zcxlh = cursor.getString(cursor.getColumnIndex(ZhiChanXXDao.COLUMN_NAME_ZCXLH));
                String bgr = cursor.getString(cursor.getColumnIndex(ZhiChanXXDao.COLUMN_NAME_BGR));
                String zcwz = cursor.getString(cursor.getColumnIndex(ZhiChanXXDao.COLUMN_NAME_ZCWZ));
                zhiChanXXBean.setZCMC(zcmc);
                zhiChanXXBean.setBGR(bgr);
                zhiChanXXBean.setZCID(zcid);
                zhiChanXXBean.setZCWZ(zcwz);
                zhiChanXXBean.setZCXH(zcxh);
                zhiChanXXBean.setZCXLH(zcxlh);
                zhiChanXXBeans.add(zhiChanXXBean);
            }
            cursor.close();
        }
        return zhiChanXXBeans;
    }

    /**
     * delete a contact
     *
     * @param username
     */
    synchronized public void deleteContact(String username) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        if (db.isOpen()) {
            //db.delete(UserDao.TABLE_NAME, UserDao.COLUMN_NAME_ID + " = ?", new String[]{username});
        }
    }


}
