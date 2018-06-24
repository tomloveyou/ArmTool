/**
 * Copyright (C) 2016 Hyphenate Inc. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huayi.armtool.db;

import android.content.Context;


public class ZhiChanXXDao {
    /**
     * 表名
     */
    public static final String TABLE_NAME = "WB_ZCXX";
    /**
     * 资产ID
     */
    public static final String COLUMN_NAME_ZCID = "ZCID";
    /**
     * 资产序列号
     */
    public static final String COLUMN_NAME_ZCXLH = "ZCXLH";
    /**
     * 资产名称
     */
    public static final String COLUMN_NAME_ZCMC = "ZCMC";
    /**
     * 资产型号
     */
    public static final String COLUMN_NAME_ZCXH = "ZCXH";

    /**
     * 计量单位
     */
    public static final String COLUMN_NAME_JLDW = "JLDW";
    /**
     * 保管部门编码
     */
    public static final String COLUMN_NAME_BGBMBM = "BGBMBM";
    /**
     * 保管部门
     */
    public static final String COLUMN_NAME_BGBM = "BGBM";
    /**
     * 保管人编码
     */
    public static final String COLUMN_NAME_BGRBM = "BGRBM";
    /**
     * 保管人
     */
    public static final String COLUMN_NAME_BGR = "BGR";
    /**
     * 位置ID
     */
    public static final String COLUMN_NAME_WZID = "WZID";
    /**
     * 资产位置
     */
    public static final String COLUMN_NAME_ZCWZ = "ZCWZ";
    /**
     * 资产来源
     */
    public static final String COLUMN_NAME_ZCLY = "ZCLY";

    /**
     * 登记日期
     */
    public static final String COLUMN_NAME_DJRQ = "DJRQ";
    /**
     * 资产状态
     */
    public static final String COLUMN_NAME_ZCZT = "ZCZT";
    /**
     * 原值
     */
    public static final String COLUMN_NAME_YZ = "YZ";
    /**
     * 库管员编码
     */
    public static final String COLUMN_NAME_KGYBM = "KGYBM";
    /**
     * 库管员
     */
    public static final String COLUMN_NAME_KGY = "KGY";
    /**
     * 照片数量
     */
    public static final String COLUMN_NAME_ZPSL = "ZPSL";
    /**
     * 盘点状态
     */
    public static final String COLUMN_NAME_PDZT = "PDZT";
    /**
     * 盘点时间
     */
    public static final String COLUMN_NAME_PDSJ = "PDSJ";
    /**
     * 盘点说明
     */
    public static final String COLUMN_NAME_PDSM = "PDSM";
    /**
     * 备注
     */
    public static final String COLUMN_NAME_BZ = "BZ";

    public ZhiChanXXDao(Context context) {
    }


}
