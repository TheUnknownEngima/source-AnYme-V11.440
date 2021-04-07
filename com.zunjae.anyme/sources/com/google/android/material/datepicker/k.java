package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class k<S> extends p<S> {
    private d<S> b0;
    private a c0;

    class a extends o<S> {
        a() {
        }

        public void a(S s) {
            Iterator it = k.this.a0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(s);
            }
        }
    }

    static <T> k<T> L1(d<T> dVar, a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.u1(bundle);
        return kVar;
    }

    public void J0(Bundle bundle) {
        super.J0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.b0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.c0);
    }

    public void n0(Bundle bundle) {
        super.n0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.b0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.c0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b0.U(layoutInflater, viewGroup, bundle, this.c0, new a());
    }
}
