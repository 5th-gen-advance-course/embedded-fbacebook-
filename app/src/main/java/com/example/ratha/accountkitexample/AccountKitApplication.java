package com.example.ratha.accountkitexample;

import android.accounts.Account;
import android.app.Application;

import com.facebook.accountkit.AccountKit;

/**
 * Created by ratha on 12/6/2017.
 */

public class AccountKitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AccountKit.initialize(getApplicationContext());
    }
}
