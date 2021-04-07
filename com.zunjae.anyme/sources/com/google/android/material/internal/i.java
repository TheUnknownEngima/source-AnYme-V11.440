package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Constructor;

final class i {
    private static boolean k;
    private static Constructor<StaticLayout> l;
    private static Object m;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int d = 0;
    private int e;
    private Layout.Alignment f;
    private int g;
    private boolean h;
    private boolean i;
    private TextUtils.TruncateAt j;

    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private i(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i2;
        this.e = charSequence.length();
        this.f = Layout.Alignment.ALIGN_NORMAL;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.j = null;
    }

    private void b() {
        Class cls;
        if (!k) {
            try {
                boolean z = this.i && Build.VERSION.SDK_INT >= 23;
                if (Build.VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    m = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = i.class.getClassLoader();
                    String str = this.i ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    m = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE});
                l = declaredConstructor;
                declaredConstructor.setAccessible(true);
                k = true;
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
    }

    public static i c(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new i(charSequence, textPaint, i2);
    }

    public StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, (float) max, this.j);
        }
        this.e = Math.min(charSequence.length(), this.e);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.i) {
                this.f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, this.e, this.b, max);
            obtain.setAlignment(this.f);
            obtain.setIncludePad(this.h);
            obtain.setTextDirection(this.i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.j;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.g);
            return obtain.build();
        }
        b();
        try {
            Constructor<StaticLayout> constructor = l;
            u3.c(constructor);
            Object obj = m;
            u3.c(obj);
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, Integer.valueOf(this.d), Integer.valueOf(this.e), this.b, Integer.valueOf(max), this.f, obj, Float.valueOf(1.0f), Float.valueOf(Utils.FLOAT_EPSILON), Boolean.valueOf(this.h), null, Integer.valueOf(max), Integer.valueOf(this.g)});
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public i d(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public i e(TextUtils.TruncateAt truncateAt) {
        this.j = truncateAt;
        return this;
    }

    public i f(boolean z) {
        this.h = z;
        return this;
    }

    public i g(boolean z) {
        this.i = z;
        return this;
    }

    public i h(int i2) {
        this.g = i2;
        return this;
    }
}
