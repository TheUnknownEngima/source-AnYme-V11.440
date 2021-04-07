package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;

/* renamed from: nh  reason: default package */
public class nh implements ah<Uri, InputStream> {
    private final Context a;

    /* renamed from: nh$a */
    public static class a implements bh<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        public ah<Uri, InputStream> b(eh ehVar) {
            return new nh(this.a);
        }
    }

    public nh(Context context) {
        this.a = context.getApplicationContext();
    }

    /* renamed from: c */
    public ah.a<InputStream> b(Uri uri, int i, int i2, i iVar) {
        if (je.d(i, i2)) {
            return new ah.a<>(new zl(uri), ke.f(this.a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return je.a(uri);
    }
}
