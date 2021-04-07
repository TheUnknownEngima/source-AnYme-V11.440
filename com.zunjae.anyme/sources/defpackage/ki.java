package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* renamed from: ki  reason: default package */
public class ki extends zh {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(g.a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(rf rfVar, Bitmap bitmap, int i, int i2) {
        return ti.e(rfVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof ki;
    }

    public int hashCode() {
        return 1572326941;
    }
}
