package com.huawei.cordovahmspushplugin;

import android.os.Bundle;
import android.util.Log;

/**
 * This class is a push related utility class.
 *
 * @author Onur Kenis
 */
public class PushUtils {

    /**
     * Sets intent data as JSON string within
     * CordovaHMSPushPlugin's notificationData.
     *
     * @param extras The bundle object used passing intent data.
     */
    public static void setIntentData(Bundle extras) {
        IntentData intentData = new IntentData(extras);

        CordovaHMSPushPlugin.notificationData = "{"
                + "\"isNotification\":" + intentData.isNotification() + ", "
                + "\"data\": " + intentData.getData()
                + "}";


    }
}
