package com.ataulm.didya;

import android.content.Context;

import com.ataulm.basic.R;

public class AppNameProvider {

    private final Context context;

    AppNameProvider(Context context) {
        this.context = context;
    }

    public String getAppName() {
        return context.getString(R.string.app_name);
    }

}
