package defpackage;

import defpackage.cl0;

/* renamed from: en0  reason: default package */
final class en0 implements nm0 {
    private final pm0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    en0(pm0 pm0, String str, Object[] objArr) {
        this.a = pm0;
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

    public final boolean a() {
        return (this.d & 2) == 2;
    }

    public final pm0 b() {
        return this.a;
    }

    public final int c() {
        return (this.d & 1) == 1 ? cl0.e.i : cl0.e.j;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.c;
    }
}
