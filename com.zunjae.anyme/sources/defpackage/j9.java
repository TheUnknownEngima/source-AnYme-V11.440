package defpackage;

import androidx.recyclerview.widget.f;
import java.util.List;

/* renamed from: j9  reason: default package */
public final class j9<IT> extends f.b {
    private final List<IT> a;
    private final List<IT> b;
    private final d62<IT, IT, Boolean> c;
    private final d62<IT, IT, Boolean> d;

    public j9(List<? extends IT> list, List<? extends IT> list2, d62<? super IT, ? super IT, Boolean> d62, d62<? super IT, ? super IT, Boolean> d622) {
        v62.f(list, "oldItems");
        v62.f(list2, "newItems");
        v62.f(d62, "areTheSame");
        v62.f(d622, "areContentsTheSame");
        this.a = list;
        this.b = list2;
        this.c = d62;
        this.d = d622;
    }

    public boolean a(int i, int i2) {
        return this.d.G(this.a.get(i), this.b.get(i2)).booleanValue();
    }

    public boolean b(int i, int i2) {
        return this.c.G(this.a.get(i), this.b.get(i2)).booleanValue();
    }

    public int d() {
        return this.b.size();
    }

    public int e() {
        return this.a.size();
    }
}
