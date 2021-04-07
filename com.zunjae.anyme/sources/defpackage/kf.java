package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: kf  reason: default package */
final class kf implements g {
    private static final gm<Class<?>, byte[]> j = new gm<>(50);
    private final of b;
    private final g c;
    private final g d;
    private final int e;
    private final int f;
    private final Class<?> g;
    private final i h;
    private final m<?> i;

    kf(of ofVar, g gVar, g gVar2, int i2, int i3, m<?> mVar, Class<?> cls, i iVar) {
        this.b = ofVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = i2;
        this.f = i3;
        this.i = mVar;
        this.g = cls;
        this.h = iVar;
    }

    private byte[] c() {
        byte[] g2 = j.g(this.g);
        if (g2 != null) {
            return g2;
        }
        byte[] bytes = this.g.getName().getBytes(g.a);
        j.k(this.g, bytes);
        return bytes;
    }

    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        m<?> mVar = this.i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        messageDigest.update(c());
        this.b.d(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        return this.f == kfVar.f && this.e == kfVar.e && km.d(this.i, kfVar.i) && this.g.equals(kfVar.g) && this.c.equals(kfVar.c) && this.d.equals(kfVar.d) && this.h.equals(kfVar.h);
    }

    public int hashCode() {
        int hashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        m<?> mVar = this.i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + '\'' + ", options=" + this.h + '}';
    }
}
