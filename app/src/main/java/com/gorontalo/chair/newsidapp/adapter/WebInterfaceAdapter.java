package com.gorontalo.chair.newsidapp.adapter;

import android.app.Activity;
import android.content.Intent;
import android.webkit.JavascriptInterface;

import com.gorontalo.chair.newsidapp.RequestSuratActivity;

public class WebInterfaceAdapter {
    private Activity mActivity;

    /** Instantiate the interface and set the context */
    public WebInterfaceAdapter(Activity a) {
        mActivity = a;
    }

    @JavascriptInterface
    public void goToMain(){
        Intent intent = new Intent(mActivity, RequestSuratActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        mActivity.startActivity(intent);
    }
}
