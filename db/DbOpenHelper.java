/**
 * Copyright (C) 2016 Hyphenate Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huayi.armtool.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DbOpenHelper extends SQLiteOpenHelper{

	private static final int DATABASE_VERSION = 1;
	private static DbOpenHelper instance;
	/**
	 * 创建组织用户WB_ZZYH表的SQL语句
	 */
	private static final String WB_ZZYH_TABLE_CREATE = "CREATE TABLE "
			+ UserDao.TABLE_NAME + " ("
			+ UserDao.COLUMN_NAME_ZZBM + " TEXT PRIMARY KEY, "
			+ UserDao.COLUMN_NAME_YHMC + " TEXT, "
			+ UserDao.COLUMN_NAME_ZZMC + " TEXT, "
			+ UserDao.COLUMN_NAME_YHBM + " TEXT);";
	/**
	 * 创建数据字典WB_SJZD表的SQL语句
	 */
	private static final String WB_SJZD_TABLE_CREATE = "CREATE TABLE "
			+ ZiDianDao.TABLE_NAME + " ("
			+ ZiDianDao.COLUMN_NAME_ZDID + " INTEGER PRIMARY KEY,"
			+ ZiDianDao.COLUMN_NAME_ZDFID + " INTEGER, "
			+ ZiDianDao.COLUMN_NAME_ZDFL + " TEXT, "
			+ ZiDianDao.COLUMN_NAME_ZDMC + " TEXT, "
			+ ZiDianDao.COLUMN_NAME_ZDFL + " TEXT);";
	/**
	 * 创建WB_ZCXX表的SQL语句
	 */
	private static final String WB_ZCXX_TABLE_CREATE = "CREATE TABLE "
			+ ZhiChanXXDao.TABLE_NAME + " ("
			+ ZhiChanXXDao.COLUMN_NAME_ZCID + " INTEGER PRIMARY KEY, "
			+ ZhiChanXXDao.COLUMN_NAME_ZCXLH + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_ZCMC + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_ZCXH + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_JLDW + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_BGBMBM + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_BGBM + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_BGRBM + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_BGR + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_WZID + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_ZCWZ + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_ZCLY + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_DJRQ+ " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_ZCZT + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_YZ + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_KGYBM + " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_KGY+ " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_ZPSL+ " INTEGER, "
			+ ZhiChanXXDao.COLUMN_NAME_PDZT+ " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_PDSJ+ " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_PDSM+ " TEXT, "
			+ ZhiChanXXDao.COLUMN_NAME_BZ+ " TEXT);";
	/**
	 * 创建资产位置WB_ZCWZ表的SQL语句
	 */
	private static final String WB_ZCWZ_TABLE_CREATE = "CREATE TABLE "
			+ ZhiChanPositionDao.TABLE_NAME + " ("
			+ ZhiChanPositionDao.COLUMN_NAME_FH + " TEXT , "
			+ ZhiChanPositionDao.COLUMN_NAME_ID + " TEXT PRIMARY KEY , "
			+ ZhiChanPositionDao.COLUMN_NAME_LC + " TEXT, "
			+ ZhiChanPositionDao.COLUMN_NAME_LD + " TEXT);";
	/**
	 * 创建WB_ZCZP表的SQL语句
	 */
	private static final String WB_ZCZP_TABLE_CREATE = "CREATE TABLE "
            + ZhiChanOprationDao.TABLE_NAME + " ("
            + ZhiChanOprationDao.COLUMN_NAME_ZCID + " INTEGER, "
			+ ZhiChanOprationDao.COLUMN_NAME_ZPID + " INTEGER PRIMARY KEY, "
            + ZhiChanOprationDao.COLUMN_NAME_ZPLJ + " TEXT);";
	
	private DbOpenHelper(Context context) {
		super(context, getUserDatabaseName(), null, DATABASE_VERSION);
	}
	
	public static DbOpenHelper getInstance(Context context) {
		if (instance == null) {
			instance = new DbOpenHelper(context.getApplicationContext());
		}
		return instance;
	}
	
	private static String getUserDatabaseName() {
        return  "demo.db";
    }
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(WB_ZZYH_TABLE_CREATE);
		db.execSQL(WB_SJZD_TABLE_CREATE);
		db.execSQL(WB_ZCWZ_TABLE_CREATE);
		db.execSQL(WB_ZCZP_TABLE_CREATE);
		db.execSQL(WB_ZCXX_TABLE_CREATE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//		if(oldVersion < 2){
//		    db.execSQL("ALTER TABLE "+ UserDao.TABLE_NAME +" ADD COLUMN "+
//		            UserDao.COLUMN_NAME_AVATAR + " TEXT ;");
//		}
//
//		if(oldVersion < 3){
//		    db.execSQL(CREATE_PREF_TABLE);
//        }
//		if(oldVersion < 4){
//			db.execSQL(ROBOT_TABLE_CREATE);
//		}
//		if(oldVersion < 5){
//		    db.execSQL("ALTER TABLE " + InviteMessgeDao.TABLE_NAME + " ADD COLUMN " +
//		            InviteMessgeDao.COLUMN_NAME_UNREAD_MSG_COUNT + " INTEGER ;");
//		}
//		if (oldVersion < 6) {
//		    db.execSQL("ALTER TABLE " + InviteMessgeDao.TABLE_NAME + " ADD COLUMN " +
//		            InviteMessgeDao.COLUMN_NAME_GROUPINVITER + " TEXT;");
//		}
	}
	
	public void closeDB() {
	    if (instance != null) {
	        try {
	            SQLiteDatabase db = instance.getWritableDatabase();
	            db.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        instance = null;
	    }
	}
	
}
