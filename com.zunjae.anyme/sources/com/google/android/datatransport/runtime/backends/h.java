package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class h {
    public static h a(Context context, kq kqVar, kq kqVar2, String str) {
        return new c(context, kqVar, kqVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract kq d();

    public abstract kq e();
}
