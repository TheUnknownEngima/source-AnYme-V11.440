package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

class o {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");

    o() {
    }

    static boolean c(String str) {
        return b.matcher(str).matches();
    }

    static boolean d(String str) {
        return str.contains(":");
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean b(bi1 bi1) {
        return TextUtils.isEmpty(bi1.b()) || bi1.h() + bi1.c() < a() + a;
    }
}
