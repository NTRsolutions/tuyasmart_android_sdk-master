package com.tuya.smart.android.myapk.test.model;

import com.tuya.smart.android.myapk.test.bean.DpTestDataBean;

import java.util.ArrayList;

/**
 * Created by letian on 16/7/12.
 */
public interface IEditDpTestModel {
    ArrayList<DpTestDataBean> getDpTestDataBean(String devId);
}
