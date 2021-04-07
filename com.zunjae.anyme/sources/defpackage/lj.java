package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

/* renamed from: lj  reason: default package */
public class lj implements m<ij> {
    private final m<Bitmap> b;

    public lj(m<Bitmap> mVar) {
        jm.d(mVar);
        this.b = mVar;
    }

    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    public Cif<ij> b(Context context, Cif<ij> ifVar, int i, int i2) {
        ij ijVar = ifVar.get();
        yh yhVar = new yh(ijVar.e(), c.d(context).g());
        Cif<Bitmap> b2 = this.b.b(context, yhVar, i, i2);
        if (!yhVar.equals(b2)) {
            yhVar.a();
        }
        ijVar.m(this.b, b2.get());
        return ifVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof lj) {
            return this.b.equals(((lj) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
