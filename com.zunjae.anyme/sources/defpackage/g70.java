package defpackage;

import com.google.android.gms.common.api.a;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: g70  reason: default package */
public final class g70 {
    public static final a.g<z70> a = new a.g<>();
    public static final a.g<h80> b = new a.g<>();
    public static final a.g<fb0> c = new a.g<>();
    public static final a.g<gb0> d = new a.g<>();

    static {
        try {
            Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        t60.k("com.google.cast.multizone");
    }
}
