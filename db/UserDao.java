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

import java.util.List;
import java.util.Map;

import android.content.Context;



public class UserDao {
	/**
	 * 表名
	 */
	public static final String TABLE_NAME = "WB_ZZYH";
	/**
	 * 用户编码
	 */
	public static final String COLUMN_NAME_YHBM = "YHBM";
	/**
	 * 用户
	 */
	public static final String COLUMN_NAME_YHMC = "YHMC";
	/**
	 * 组织编码
	 */
	public static final String COLUMN_NAME_ZZBM = "ZZBM";
	/**
	 * 组织名称
	 */
	public static final String COLUMN_NAME_ZZMC = "ZZMC";
	

	
	
	public UserDao(Context context) {
	}



}
