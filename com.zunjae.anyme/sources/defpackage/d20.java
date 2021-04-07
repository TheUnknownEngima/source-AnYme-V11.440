package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.offline.f;
import com.google.android.exoplayer2.offline.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: d20  reason: default package */
public class d20 implements f<d20> {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final a e;
    public final b[] f;
    public final long g;
    public final long h;

    /* renamed from: d20$a */
    public static class a {
        public final UUID a;
        public final byte[] b;
        public final mv[] c;

        public a(UUID uuid, byte[] bArr, mv[] mvVarArr) {
            this.a = uuid;
            this.b = bArr;
            this.c = mvVarArr;
        }
    }

    /* renamed from: d20$b */
    public static class b {
        public final int a;
        public final String b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final String i;
        public final f0[] j;
        public final int k;
        private final String l;
        private final String m;
        private final List<Long> n;
        private final long[] o;
        private final long p;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i2, String str3, long j2, String str4, int i3, int i4, int i5, int i6, String str5, f0[] f0VarArr, List<Long> list, long j3) {
            this(str, str2, i2, str3, j2, str4, i3, i4, i5, i6, str5, f0VarArr, list, v50.x0(list, 1000000, j2), v50.w0(j3, 1000000, j2));
            String str6 = str;
            String str7 = str2;
            int i7 = i2;
        }

        private b(String str, String str2, int i2, String str3, long j2, String str4, int i3, int i4, int i5, int i6, String str5, f0[] f0VarArr, List<Long> list, long[] jArr, long j3) {
            this.l = str;
            this.m = str2;
            this.a = i2;
            this.b = str3;
            this.c = j2;
            this.d = str4;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = str5;
            this.j = f0VarArr;
            this.n = list;
            this.o = jArr;
            this.p = j3;
            this.k = list.size();
        }

        public Uri a(int i2, int i3) {
            boolean z = true;
            q40.f(this.j != null);
            q40.f(this.n != null);
            if (i3 >= this.n.size()) {
                z = false;
            }
            q40.f(z);
            String num = Integer.toString(this.j[i2].i);
            String l2 = this.n.get(i3).toString();
            return u50.d(this.l, this.m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l2).replace("{start_time}", l2));
        }

        public b b(f0[] f0VarArr) {
            String str = this.l;
            return new b(str, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, f0VarArr, this.n, this.o, this.p);
        }

        public long c(int i2) {
            if (i2 == this.k - 1) {
                return this.p;
            }
            long[] jArr = this.o;
            return jArr[i2 + 1] - jArr[i2];
        }

        public int d(long j2) {
            return v50.f(this.o, j2, true, true);
        }

        public long e(int i2) {
            return this.o[i2];
        }
    }

    private d20(int i, int i2, long j, long j2, int i3, boolean z, a aVar, b[] bVarArr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = aVar;
        this.f = bVarArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d20(int i, int i2, long j, long j2, long j3, int i3, boolean z, a aVar, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : v50.w0(j2, 1000000, j), j3 != 0 ? v50.w0(j3, 1000000, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    /* renamed from: b */
    public final d20 a(List<h> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            h hVar = (h) arrayList.get(i);
            b bVar2 = this.f[hVar.f];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.b((f0[]) arrayList3.toArray(new f0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[hVar.g]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((f0[]) arrayList3.toArray(new f0[0])));
        }
        return new d20(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (b[]) arrayList2.toArray(new b[0]));
    }
}
