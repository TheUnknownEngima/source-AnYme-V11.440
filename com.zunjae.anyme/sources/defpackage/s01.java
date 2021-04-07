package defpackage;

import defpackage.sy0;

/* renamed from: s01  reason: default package */
final class s01 implements d01 {
    private final f01 a;
    private final String b;
    private final Object[] c;
    private final int d;

    s01(f01 f01, String str, Object[] objArr) {
        this.a = f01;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return (this.d & 2) == 2;
    }

    public final f01 c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.c;
    }

    public final int zza() {
        return (this.d & 1) == 1 ? sy0.e.i : sy0.e.j;
    }
}
