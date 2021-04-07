package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* renamed from: zl  reason: default package */
public final class zl implements g {
    private final Object b;

    public zl(Object obj) {
        jm.d(obj);
        this.b = obj;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(g.a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof zl) {
            return this.b.equals(((zl) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
