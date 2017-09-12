package com.tuya.smart.android.myapk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.tuya.smart.android.myapk.utils.ActivityUtils;
import com.tuya.smart.android.myapk.utils.LoginHelper;
import com.tuya.smart.sdk.TuyaUser;

/**
 * Created by letian on 16/7/19.
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (TuyaUser.getUserInstance().isLogin()) {//已登录，跳主页
            LoginHelper.afterLogin();
            ActivityUtils.gotoHomeActivity(this);

            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);

        } else {
//            ActivityUtils.gotoHomeActivity(this);
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
//            ActivityUtils.gotoActivity(this, LoginActivity.class, ActivityUtils.ANIMATE_FORWARD, true);
        }
    }
}
