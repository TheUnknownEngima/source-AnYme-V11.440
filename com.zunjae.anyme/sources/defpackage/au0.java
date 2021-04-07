package defpackage;

import android.net.Uri;

/* renamed from: au0  reason: default package */
public final class au0 {
    private static final b0<String, Uri> a = new b0<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (au0.class) {
            uri = a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                a.put(str, uri);
            }
        }
        return uri;
    }
}
