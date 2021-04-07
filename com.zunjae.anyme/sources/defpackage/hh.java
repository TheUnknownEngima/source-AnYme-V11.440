package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.File;
import java.io.InputStream;

/* renamed from: hh  reason: default package */
public class hh<Data> implements ah<String, Data> {
    private final ah<Uri, Data> a;

    /* renamed from: hh$a */
    public static final class a implements bh<String, AssetFileDescriptor> {
        public ah<String, AssetFileDescriptor> b(eh ehVar) {
            return new hh(ehVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: hh$b */
    public static class b implements bh<String, ParcelFileDescriptor> {
        public ah<String, ParcelFileDescriptor> b(eh ehVar) {
            return new hh(ehVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: hh$c */
    public static class c implements bh<String, InputStream> {
        public ah<String, InputStream> b(eh ehVar) {
            return new hh(ehVar.d(Uri.class, InputStream.class));
        }
    }

    public hh(ah<Uri, Data> ahVar) {
        this.a = ahVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return f(str);
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public ah.a<Data> b(String str, int i, int i2, i iVar) {
        Uri e = e(str);
        if (e == null || !this.a.a(e)) {
            return null;
        }
        return this.a.b(e, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}
