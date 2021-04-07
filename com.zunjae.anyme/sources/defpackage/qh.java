package defpackage;

import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;
import java.net.URL;

/* renamed from: qh  reason: default package */
public class qh implements ah<URL, InputStream> {
    private final ah<tg, InputStream> a;

    /* renamed from: qh$a */
    public static class a implements bh<URL, InputStream> {
        public ah<URL, InputStream> b(eh ehVar) {
            return new qh(ehVar.d(tg.class, InputStream.class));
        }
    }

    public qh(ah<tg, InputStream> ahVar) {
        this.a = ahVar;
    }

    /* renamed from: c */
    public ah.a<InputStream> b(URL url, int i, int i2, i iVar) {
        return this.a.b(new tg(url), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }
}
