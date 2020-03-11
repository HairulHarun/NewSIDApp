package com.gorontalo.chair.newsidapp.adapter;

public class URLAdapter {
    private String URL = "https://192.168.0.104/sid-app/webservices/";
    private String URL_PHOTO = "https://192.168.0.104/sid-app/admin-control/assets/images/photo/";
    private String URL_WEB = "https://newsid.000webhostapp.com/";
    private String URL_ANDROID = "https://newsid.000webhostapp.com/android/";

    public String getLogin(){
        return URL = URL+"ws-get-login.php";
    }

    public String getMain(){
        return URL_WEB = URL_WEB+"index.php";
    }

    public String getAndroidProfile(){
        return URL_WEB = URL_ANDROID+"profile.php";
    }

    public String getAndroidRequest(){
        return URL_WEB = URL_ANDROID+"request.php";
    }
}
