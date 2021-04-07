package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.y;
import java.util.List;
import java.util.Map;

/* renamed from: d00  reason: default package */
final class d00 implements i {
    private final i a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    /* renamed from: d00$a */
    public interface a {
        void b(i50 i50);
    }

    public d00(i iVar, int i, a aVar) {
        q40.a(i > 0);
        this.a = iVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    private boolean f() {
        if (this.a.a(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int a2 = this.a.a(bArr, i3, i2);
            if (a2 == -1) {
                return false;
            }
            i3 += a2;
            i2 -= a2;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.b(new i50(bArr, i));
        }
        return true;
    }

    public int a(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            if (!f()) {
                return -1;
            }
            this.e = this.b;
        }
        int a2 = this.a.a(bArr, i, Math.min(this.e, i2));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    public void b(y yVar) {
        this.a.b(yVar);
    }

    public long c(l lVar) {
        throw new UnsupportedOperationException();
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public Map<String, List<String>> d() {
        return this.a.d();
    }

    public Uri e() {
        return this.a.e();
    }
}
