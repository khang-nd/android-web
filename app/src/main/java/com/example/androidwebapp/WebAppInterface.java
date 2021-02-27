package com.example.androidwebapp;

import android.os.Build;
import android.webkit.JavascriptInterface;

import java.util.Map;

public class WebAppInterface {
    @JavascriptInterface
    public int[] getAndroidVersion() {
        int[] array = new int[] { 0, 1, 2 };
        return array;
    }
}
