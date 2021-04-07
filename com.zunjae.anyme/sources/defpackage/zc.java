package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: zc  reason: default package */
public class zc {
    public static String a(String str) {
        try {
            return ad.b(b(str)).substring(0, 10);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static byte[] b(String str) {
        return MessageDigest.getInstance("SHA-256").digest(str.getBytes(wa.a));
    }
}
