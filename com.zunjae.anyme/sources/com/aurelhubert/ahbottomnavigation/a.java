package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class a {
    private String a = "";
    private Drawable b;
    private int c = -7829368;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public a(String str, int i) {
        this.a = str;
        this.e = i;
    }

    public int a(Context context) {
        int i = this.f;
        return i != 0 ? androidx.core.content.a.d(context, i) : this.c;
    }

    public Drawable b(Context context) {
        int i = this.e;
        if (i == 0) {
            return this.b;
        }
        try {
            return f.d(context, i);
        } catch (Resources.NotFoundException unused) {
            return androidx.core.content.a.f(context, this.e);
        }
    }

    public String c(Context context) {
        int i = this.d;
        return i != 0 ? context.getString(i) : this.a;
    }
}
