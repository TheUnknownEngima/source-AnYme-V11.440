package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;
import com.zunjae.anyme.features.vydia.i;
import com.zunjae.anyme.features.vydia.j;
import java.util.List;

/* renamed from: ru1  reason: default package */
public final class ru1 extends q {
    private final List<String> j = f32.h("Characters", "Info", "Music", "Snapshots", "Video Info");
    private final int k;
    private final int l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ru1(k kVar, int i, int i2) {
        super(kVar, 1);
        v62.e(kVar, "fm");
        this.k = i;
        this.l = i2;
    }

    public int e() {
        return this.j.size();
    }

    public CharSequence g(int i) {
        return this.j.get(i);
    }

    public Fragment v(int i) {
        if (i == 0) {
            return j.d0.a(this.k);
        }
        if (i == 1) {
            return i.d0.a(this.k);
        }
        if (i == 2) {
            return kr1.e0.a(1);
        }
        if (i == 3) {
            return tu1.g0.a(this.k, this.l);
        }
        if (i == 4) {
            return com.zunjae.anyme.features.vydia.k.d0.a();
        }
        throw new k22((String) null, 1, (r62) null);
    }
}
