package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: af  reason: default package */
class af implements g {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final g g;
    private final Map<Class<?>, m<?>> h;
    private final i i;
    private int j;

    af(Object obj, g gVar, int i2, int i3, Map<Class<?>, m<?>> map, Class<?> cls, Class<?> cls2, i iVar) {
        jm.d(obj);
        this.b = obj;
        jm.e(gVar, "Signature must not be null");
        this.g = gVar;
        this.c = i2;
        this.d = i3;
        jm.d(map);
        this.h = map;
        jm.e(cls, "Resource class must not be null");
        this.e = cls;
        jm.e(cls2, "Transcode class must not be null");
        this.f = cls2;
        jm.d(iVar);
        this.i = iVar;
    }

    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.b.equals(afVar.b) && this.g.equals(afVar.g) && this.d == afVar.d && this.c == afVar.c && this.h.equals(afVar.h) && this.e.equals(afVar.e) && this.f.equals(afVar.f) && this.i.equals(afVar.i);
    }

    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (hashCode * 31) + this.g.hashCode();
            this.j = hashCode2;
            int i2 = (hashCode2 * 31) + this.c;
            this.j = i2;
            int i3 = (i2 * 31) + this.d;
            this.j = i3;
            int hashCode3 = (i3 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
