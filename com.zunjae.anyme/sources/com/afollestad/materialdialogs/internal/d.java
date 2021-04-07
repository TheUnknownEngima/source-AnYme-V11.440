package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.afollestad.materialdialogs.e;

public class d {
    private static d w;
    public boolean a = false;
    public int b = 0;
    public int c = 0;
    public ColorStateList d = null;
    public ColorStateList e = null;
    public ColorStateList f = null;
    public int g = 0;
    public int h = 0;
    public Drawable i = null;
    public int j = 0;
    public int k = 0;
    public ColorStateList l = null;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public e r;
    public e s;
    public e t;
    public e u;
    public e v;

    public d() {
        e eVar = e.START;
        this.r = eVar;
        this.s = eVar;
        this.t = e.END;
        e eVar2 = e.START;
        this.u = eVar2;
        this.v = eVar2;
    }

    public static d a() {
        return b(true);
    }

    public static d b(boolean z) {
        if (w == null && z) {
            w = new d();
        }
        return w;
    }
}
