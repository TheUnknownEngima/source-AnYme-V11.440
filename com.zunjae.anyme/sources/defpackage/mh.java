package defpackage;

import android.net.Uri;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mh  reason: default package */
public class mh implements ah<Uri, InputStream> {
    private static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final ah<tg, InputStream> a;

    /* renamed from: mh$a */
    public static class a implements bh<Uri, InputStream> {
        public ah<Uri, InputStream> b(eh ehVar) {
            return new mh(ehVar.d(tg.class, InputStream.class));
        }
    }

    public mh(ah<tg, InputStream> ahVar) {
        this.a = ahVar;
    }

    /* renamed from: c */
    public ah.a<InputStream> b(Uri uri, int i, int i2, i iVar) {
        return this.a.b(new tg(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
