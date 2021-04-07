package com.zunjae.anyme.features.discover.favorites;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;
import com.zunjae.anyme.features.kanon.c;
import com.zunjae.anyme.features.waifus.i;

public final class a extends q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(k kVar) {
        super(kVar, 1);
        v62.e(kVar, "fm");
    }

    public int e() {
        return 2;
    }

    public CharSequence g(int i) {
        if (i == 0) {
            return "Shows";
        }
        if (i == 1) {
            return "Waifus";
        }
        throw new k22((String) null, 1, (r62) null);
    }

    public Fragment v(int i) {
        if (i == 0) {
            return ps1.m0.a(7);
        }
        if (i == 1) {
            return xx1.a.a() ? i.e0.a() : c.b0.a("To keep track of your favorite characters you need to be logged in through Kanon!");
        }
        throw new k22((String) null, 1, (r62) null);
    }
}
