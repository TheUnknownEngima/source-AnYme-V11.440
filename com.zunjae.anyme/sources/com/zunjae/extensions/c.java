package com.zunjae.extensions;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;

public final class c {
    public static final Spanned a(String str) {
        v62.e(str, "$this$fromHtml");
        Spanned fromHtml = Html.fromHtml(str);
        v62.d(fromHtml, "Html.fromHtml(this)");
        return fromHtml;
    }

    public static final Integer b(Bundle bundle, String str) {
        v62.e(bundle, "$this$getIntOrNull");
        v62.e(str, "key");
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static final Integer c(String str) {
        v62.e(str, "$this$makeNumerical");
        try {
            return Integer.valueOf(Integer.parseInt(new u82("\\D+").d(str, "")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final double d(double d, int i) {
        double d2 = 1.0d;
        for (int i2 = 0; i2 < i; i2++) {
            d2 *= (double) 10;
        }
        return Math.rint(d * d2) / d2;
    }

    public static final a e(long j) {
        float f = ((float) j) / 3600.0f;
        int i = (int) f;
        float f2 = (f - ((float) i)) * 60.0f;
        int i2 = (int) f2;
        return new a(i, i2, (int) ((f2 - ((float) i2)) * ((float) 60)));
    }
}
