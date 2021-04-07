package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;
import com.zunjae.anyme.features.waifus.h;

/* renamed from: us1  reason: default package */
public final class us1 extends q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public us1(k kVar) {
        super(kVar, 1);
        v62.e(kVar, "fm");
    }

    public int e() {
        return 4;
    }

    public CharSequence g(int i) {
        if (i == 0) {
            return "Shows";
        }
        if (i == 1) {
            return "Genres";
        }
        if (i == 2) {
            return "Categories";
        }
        if (i == 3) {
            return "Characters";
        }
        String valueOf = String.valueOf(i);
        throw new k22("An operation is not implemented: " + valueOf);
    }

    public Fragment v(int i) {
        if (i == 0) {
            return new xs1();
        }
        if (i == 1) {
            return new ft1();
        }
        if (i == 2) {
            return new it1();
        }
        if (i == 3) {
            return new h();
        }
        String valueOf = String.valueOf(i);
        throw new k22("An operation is not implemented: " + valueOf);
    }
}
