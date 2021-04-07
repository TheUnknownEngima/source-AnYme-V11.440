package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* renamed from: di  reason: default package */
public class di extends zh {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(g.a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(rf rfVar, Bitmap bitmap, int i, int i2) {
        return ti.c(rfVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof di;
    }

    public int hashCode() {
        return -670243078;
    }
}
