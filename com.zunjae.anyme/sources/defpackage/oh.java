package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;

/* renamed from: oh  reason: default package */
public class oh implements ah<Uri, InputStream> {
    private final Context a;

    /* renamed from: oh$a */
    public static class a implements bh<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        public ah<Uri, InputStream> b(eh ehVar) {
            return new oh(this.a);
        }
    }

    public oh(Context context) {
        this.a = context.getApplicationContext();
    }

    private boolean e(i iVar) {
        Long l = (Long) iVar.c(vi.d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public ah.a<InputStream> b(Uri uri, int i, int i2, i iVar) {
        if (!je.d(i, i2) || !e(iVar)) {
            return null;
        }
        return new ah.a<>(new zl(uri), ke.g(this.a, uri));
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return je.c(uri);
    }
}
