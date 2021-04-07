package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class p<S> extends Fragment {
    protected final LinkedHashSet<o<S>> a0 = new LinkedHashSet<>();

    p() {
    }

    /* access modifiers changed from: package-private */
    public boolean J1(o<S> oVar) {
        return this.a0.add(oVar);
    }

    /* access modifiers changed from: package-private */
    public void K1() {
        this.a0.clear();
    }
}
