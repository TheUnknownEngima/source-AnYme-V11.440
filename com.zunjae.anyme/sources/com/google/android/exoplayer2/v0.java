package com.google.android.exoplayer2;

import android.annotation.SuppressLint;

public final /* synthetic */ class v0 {
    public static int a(int i) {
        return b(i, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    public static int b(int i, int i2, int i3) {
        return i | i2 | i3;
    }

    @SuppressLint({"WrongConstant"})
    public static int c(int i) {
        return i & 24;
    }

    @SuppressLint({"WrongConstant"})
    public static int d(int i) {
        return i & 7;
    }

    public static String e(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    @SuppressLint({"WrongConstant"})
    public static int f(int i) {
        return i & 32;
    }
}
