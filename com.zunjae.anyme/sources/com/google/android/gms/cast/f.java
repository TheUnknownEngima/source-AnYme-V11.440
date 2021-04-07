package com.google.android.gms.cast;

import java.util.Collection;

public final class f {
    public static String a(String str) {
        if (str != null) {
            return c("com.google.android.gms.cast.CATEGORY_CAST", str, (Collection<String>) null, false, true);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String b(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            return c("com.google.android.gms.cast.CATEGORY_CAST", str, collection, false, true);
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }

    private static String c(String str, String str2, Collection<String> collection, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid application ID: ".concat(valueOf) : new String("Invalid application ID: "));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str2 == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z3 = true;
                for (String next : collection) {
                    t60.d(next);
                    if (z3) {
                        z3 = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(t60.l(next));
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str2 == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("/");
        sb.append("/");
        sb.append("ALLOW_IPV6");
        return sb.toString();
    }
}
