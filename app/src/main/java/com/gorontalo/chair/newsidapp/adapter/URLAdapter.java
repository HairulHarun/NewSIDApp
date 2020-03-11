package com.gorontalo.chair.newsidapp.adapter;

public class URLAdapter {
    private String URL = "https://hairulharun.000webhostapp.com/webservices/";
    private String URL_PHOTO = "https://hairulharun.000webhostapp.com/admin-control/assets/images/photo/";
    private String URL_WEB = "https://hairulharun.000webhostapp.com/";
    private String URL_ANDROID = "https://hairulharun.000webhostapp.com/android/";

    public String getLogin(){
        return URL = URL+"ws-get-login.php";
    }

    public String getMain(){
        return URL_WEB = URL_WEB+"index.php";
    }

    public String getAndroidProfile(String nik){
        return URL_WEB = URL_ANDROID+"profile.php?nik="+nik;
    }

    public String getAndroidRequest(){
        return URL_WEB = URL_ANDROID+"request.php";
    }
}
