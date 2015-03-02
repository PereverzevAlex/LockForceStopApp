package com.apps.pereverzev.alexander.lockforcestopapp;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by alexander on 02.03.15.
 */
public class DeviceAdminDemo extends DeviceAdminReceiver
{
    //	implement onEnabled(), onDisabled(),
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onEnabled(Context context, Intent intent) {};

    public void onDisabled(Context context, Intent intent) {};
}
