package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class i implements Callable<String> {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    i(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.a.getString(this.b, this.c);
    }
}
