package com.huawei.cordovahmspushplugin;

import android.os.Bundle;

/**
 * Class to store the push notification data.
 *
 * @author Onur Kenis
 */
class IntentData {

    private boolean isNotification;
    private String data;

    IntentData(Bundle extras) {

        if (extras != null) {
            this.isNotification = Boolean
                .parseBoolean(extras.getString("isNotification", "false"));

            this.data = extras.getString("notificationData");
        }

    }

    boolean isNotification() {
        return isNotification;
    }

    void setNotification(boolean notification) {
        this.isNotification = notification;
    }

    String getData() {
        return data;
    }

    void setData(String data) {
        this.data = data;
    }
}
