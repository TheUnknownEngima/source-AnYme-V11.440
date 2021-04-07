package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.xv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: wv  reason: default package */
final class wv extends xv {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean n;

    wv() {
    }

    private long l(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return ((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    private void m(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    public static boolean n(i50 i50) {
        int a = i50.a();
        byte[] bArr = o;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        i50.h(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, o);
    }

    /* access modifiers changed from: protected */
    public long e(i50 i50) {
        return b(l(i50.a));
    }

    /* access modifiers changed from: protected */
    public boolean h(i50 i50, long j, xv.b bVar) {
        boolean z = true;
        if (!this.n) {
            byte[] copyOf = Arrays.copyOf(i50.a, i50.d());
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            m(arrayList, 3840);
            bVar.a = f0.p((String) null, "audio/opus", (String) null, -1, -1, b, 48000, arrayList, (ns) null, 0, (String) null);
            this.n = true;
            return true;
        }
        if (i50.k() != 1332770163) {
            z = false;
        }
        i50.M(0);
        return z;
    }

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = false;
        }
    }
}
