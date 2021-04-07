package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.yx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: y40  reason: default package */
public final class y40 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final yx l;

    /* renamed from: y40$a */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    private y40(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, a aVar, yx yxVar) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = l(i6);
        this.g = i7;
        this.h = i8;
        this.i = g(i8);
        this.j = j2;
        this.k = aVar;
        this.l = yxVar;
    }

    public y40(byte[] bArr, int i2) {
        h50 h50 = new h50(bArr);
        h50.o(i2 * 8);
        this.a = h50.h(16);
        this.b = h50.h(16);
        this.c = h50.h(24);
        this.d = h50.h(24);
        int h2 = h50.h(20);
        this.e = h2;
        this.f = l(h2);
        this.g = h50.h(3) + 1;
        int h3 = h50.h(5) + 1;
        this.h = h3;
        this.i = g(h3);
        this.j = h50.j(36);
        this.k = null;
        this.l = null;
    }

    private static yx a(List<String> list, List<iy> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] A0 = v50.A0(str, "=");
            if (A0.length != 2) {
                String valueOf = String.valueOf(str);
                b50.h("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new jy(A0[0], A0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new yx((List<? extends yx.b>) arrayList);
    }

    private static int g(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int l(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y40 b(List<iy> list) {
        return new y40(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, j(a(Collections.emptyList(), list)));
    }

    public y40 c(a aVar) {
        return new y40(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public y40 d(List<String> list) {
        return new y40(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, j(a(list, Collections.emptyList())));
    }

    public long e() {
        long j2;
        long j3;
        int i2 = this.d;
        if (i2 > 0) {
            j2 = (((long) i2) + ((long) this.c)) / 2;
            j3 = 1;
        } else {
            int i3 = this.a;
            j2 = ((((i3 != this.b || i3 <= 0) ? 4096 : (long) i3) * ((long) this.g)) * ((long) this.h)) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    public int f() {
        return this.h * this.e * this.g;
    }

    public long h() {
        long j2 = this.j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.e);
    }

    public f0 i(byte[] bArr, yx yxVar) {
        int i2;
        yx yxVar2;
        bArr[4] = Byte.MIN_VALUE;
        int i3 = this.d;
        if (i3 > 0) {
            i2 = i3;
            yxVar2 = yxVar;
        } else {
            yxVar2 = yxVar;
            i2 = -1;
        }
        return f0.n((String) null, "audio/flac", (String) null, f(), i2, this.g, this.e, -1, 0, 0, Collections.singletonList(bArr), (ns) null, 0, (String) null, j(yxVar2));
    }

    public yx j(yx yxVar) {
        yx yxVar2 = this.l;
        return yxVar2 == null ? yxVar : yxVar2.b(yxVar);
    }

    public long k(long j2) {
        return v50.p((j2 * ((long) this.e)) / 1000000, 0, this.j - 1);
    }
}
