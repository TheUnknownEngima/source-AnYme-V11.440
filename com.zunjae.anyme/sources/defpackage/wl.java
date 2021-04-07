package defpackage;

import android.content.Context;
import com.bumptech.glide.load.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: wl  reason: default package */
public final class wl implements g {
    private final int b;
    private final g c;

    private wl(int i, g gVar) {
        this.b = i;
        this.c = gVar;
    }

    public static g c(Context context) {
        return new wl(context.getResources().getConfiguration().uiMode & 48, xl.c(context));
    }

    public void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wl)) {
            return false;
        }
        wl wlVar = (wl) obj;
        return this.b == wlVar.b && this.c.equals(wlVar.c);
    }

    public int hashCode() {
        return km.n(this.c, this.b);
    }
}
