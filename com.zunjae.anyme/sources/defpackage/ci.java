package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* renamed from: ci  reason: default package */
public class ci extends zh {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(g.a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(rf rfVar, Bitmap bitmap, int i, int i2) {
        return ti.b(rfVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof ci;
    }

    public int hashCode() {
        return -599754482;
    }
}
