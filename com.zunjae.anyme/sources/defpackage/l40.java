package defpackage;

import com.google.android.exoplayer2.x0;

/* renamed from: l40  reason: default package */
public final class l40 {
    public final int a;
    public final x0[] b;
    public final i40 c;
    public final Object d;

    public l40(x0[] x0VarArr, h40[] h40Arr, Object obj) {
        this.b = x0VarArr;
        this.c = new i40(h40Arr);
        this.d = obj;
        this.a = x0VarArr.length;
    }

    public boolean a(l40 l40) {
        if (l40 == null || l40.c.a != this.c.a) {
            return false;
        }
        for (int i = 0; i < this.c.a; i++) {
            if (!b(l40, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(l40 l40, int i) {
        return l40 != null && v50.b(this.b[i], l40.b[i]) && v50.b(this.c.a(i), l40.c.a(i));
    }

    public boolean c(int i) {
        return this.b[i] != null;
    }
}
