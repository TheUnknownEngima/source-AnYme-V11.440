package com.zunjae.anyme.features.anime.info_screen;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.q;
import com.zunjae.anyme.features.notes.b;
import defpackage.kr1;
import java.lang.ref.WeakReference;
import java.util.List;

public final class e extends q {
    private WeakReference<hr1> j;
    private final List<String> k = f32.h("Main", "Notes", "Reviews", "Friends", "Songs", "News", "Videos");
    private final int l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(k kVar, int i) {
        super(kVar, 1);
        v62.e(kVar, "fm");
        this.l = i;
    }

    public int e() {
        return this.k.size();
    }

    public CharSequence g(int i) {
        return this.k.get(i);
    }

    public Object j(ViewGroup viewGroup, int i) {
        v62.e(viewGroup, "container");
        Object j2 = super.j(viewGroup, i);
        if (j2 != null) {
            Fragment fragment = (Fragment) j2;
            if (fragment instanceof hr1) {
                this.j = new WeakReference<>(fragment);
            }
            return fragment;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
    }

    public Fragment v(int i) {
        switch (i) {
            case 0:
                return hr1.m0.a();
            case 1:
                return b.h0.b();
            case 2:
                return lt1.e0.a();
            case 3:
                return yq1.e0.a(this.l);
            case 4:
                return kr1.e.b(kr1.e0, 0, 1, (Object) null);
            case 5:
                return br1.e0.a();
            case 6:
                return lr1.e0.a();
            default:
                throw new IllegalArgumentException("Wrong position, got " + i);
        }
    }

    public final boolean w() {
        hr1 hr1;
        WeakReference<hr1> weakReference = this.j;
        if (weakReference == null || (hr1 = (hr1) weakReference.get()) == null) {
            return false;
        }
        return hr1.o2();
    }

    public final u22 x() {
        hr1 hr1;
        WeakReference<hr1> weakReference = this.j;
        if (weakReference == null || (hr1 = (hr1) weakReference.get()) == null) {
            return null;
        }
        hr1.F2();
        return u22.a;
    }
}
