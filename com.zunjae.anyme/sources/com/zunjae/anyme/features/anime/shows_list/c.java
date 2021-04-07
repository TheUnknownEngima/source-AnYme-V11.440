package com.zunjae.anyme.features.anime.shows_list;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;

public final class c extends q {
    private final b[] j = b.values();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(k kVar) {
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
        return ps1.m0.a(this.j[i].getTabContentType());
    }
}
