package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public class o {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
