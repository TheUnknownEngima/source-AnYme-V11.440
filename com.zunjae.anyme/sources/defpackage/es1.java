package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;

/* renamed from: es1  reason: default package */
public final class es1 extends q {
    private final zr1[] j = zr1.values();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public es1(k kVar) {
        super(kVar, 1);
        v62.e(kVar, "fm");
    }

    public int e() {
        return this.j.length;
    }

    public CharSequence g(int i) {
        return this.j[i].getTitle();
    }

    public Fragment v(int i) {
        return fs1.f0.a(this.j[i].getContentType());
    }

    public final int w(zr1 zr1) {
        v62.e(zr1, "day");
        zr1[] zr1Arr = this.j;
        int length = zr1Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (v62.a(zr1Arr[i].getTitle(), zr1.getTitle())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return 1;
        }
        return i;
    }
}
