package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* renamed from: qe  reason: default package */
final class qe implements g {
    private final g b;
    private final g c;

    qe(g gVar, g gVar2) {
        this.b = gVar;
        this.c = gVar2;
    }

    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return this.b.equals(qeVar.b) && this.c.equals(qeVar.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
