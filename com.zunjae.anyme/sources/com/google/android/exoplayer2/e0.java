package com.google.android.exoplayer2;

import java.util.HashSet;

public final class e0 {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (e0.class) {
            if (a.add(str)) {
                String str2 = b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                b = sb.toString();
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (e0.class) {
            str = b;
        }
        return str;
    }
}
