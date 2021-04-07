package com.zunjae.anyme.features.login;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;
import java.util.List;

public final class b extends q {
    private List<xt1> j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(k kVar) {
        super(kVar, 1);
        v62.e(kVar, "fm");
    }

    public int e() {
        List<xt1> list = this.j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public CharSequence g(int i) {
        List<xt1> list = this.j;
        v62.c(list);
        return list.get(i).a();
    }

    public Fragment v(int i) {
        List<xt1> list = this.j;
        v62.c(list);
        xt1 xt1 = list.get(i);
        return a.b0.a(xt1.a(), xt1.b());
    }

    public final void w(List<xt1> list) {
        v62.e(list, "pages");
        this.j = list;
        l();
    }
}
