package defpackage;

import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.io.InputStream;

/* renamed from: lh  reason: default package */
public class lh implements ah<tg, InputStream> {
    public static final h<Integer> b = h.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final zg<tg, tg> a;

    /* renamed from: lh$a */
    public static class a implements bh<tg, InputStream> {
        private final zg<tg, tg> a = new zg<>(500);

        public ah<tg, InputStream> b(eh ehVar) {
            return new lh(this.a);
        }
    }

    public lh(zg<tg, tg> zgVar) {
        this.a = zgVar;
    }

    /* renamed from: c */
    public ah.a<InputStream> b(tg tgVar, int i, int i2, i iVar) {
        zg<tg, tg> zgVar = this.a;
        if (zgVar != null) {
            tg a2 = zgVar.a(tgVar, 0, 0);
            if (a2 == null) {
                this.a.b(tgVar, 0, 0, tgVar);
            } else {
                tgVar = a2;
            }
        }
        return new ah.a<>(tgVar, new ce(tgVar, ((Integer) iVar.c(b)).intValue()));
    }

    /* renamed from: d */
    public boolean a(tg tgVar) {
        return true;
    }
}
