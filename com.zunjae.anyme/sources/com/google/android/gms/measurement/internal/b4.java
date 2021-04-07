package com.google.android.gms.measurement.internal;

final class b4 implements Runnable {
    private final /* synthetic */ int e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ Object i;
    private final /* synthetic */ c4 j;

    b4(c4 c4Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.j = c4Var;
        this.e = i2;
        this.f = str;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public final void run() {
        char c;
        c4 c4Var;
        p4 x = this.j.a.x();
        if (!x.s()) {
            this.j.z(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.j.c == 0) {
            if (this.j.j().B()) {
                c4Var = this.j;
                c = 'C';
            } else {
                c4Var = this.j;
                c = 'c';
            }
            char unused = c4Var.c = c;
        }
        if (this.j.d < 0) {
            long unused2 = this.j.d = 31049;
        }
        char charAt = "01VDIWEA?".charAt(this.e);
        char t = this.j.c;
        long C = this.j.d;
        String y = c4.y(true, this.f, this.g, this.h, this.i);
        StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(t);
        sb.append(C);
        sb.append(":");
        sb.append(y);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f.substring(0, 1024);
        }
        x.d.b(sb2, 1);
    }
}
