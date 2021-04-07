package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.a;
import com.google.android.gms.cast.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b extends m80 {
    public static final Parcelable.Creator<b> CREATOR = new t();
    private String e;
    private final List<String> f;
    private boolean g;
    private j h;
    private final boolean i;
    private final com.google.android.gms.cast.framework.media.a j;
    private final boolean k;
    private final double l;
    private final boolean m;

    public static final class a {
        private String a;
        private List<String> b = new ArrayList();
        private boolean c;
        private j d = new j();
        private boolean e = true;
        private tb0<com.google.android.gms.cast.framework.media.a> f = null;
        private boolean g = true;
        private double h = 0.05000000074505806d;

        public final b a() {
            tb0<com.google.android.gms.cast.framework.media.a> tb0 = this.f;
            return new b(this.a, this.b, this.c, this.d, this.e, tb0 != null ? tb0.a() : new a.C0085a().a(), this.g, this.h, false);
        }

        public final a b(String str) {
            this.a = str;
            return this;
        }

        public final a c(boolean z) {
            this.c = z;
            return this;
        }
    }

    b(String str, List<String> list, boolean z, j jVar, boolean z2, com.google.android.gms.cast.framework.media.a aVar, boolean z3, double d, boolean z4) {
        this.e = TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.f = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.g = z;
        this.h = jVar == null ? new j() : jVar;
        this.i = z2;
        this.j = aVar;
        this.k = z3;
        this.l = d;
        this.m = z4;
    }

    public com.google.android.gms.cast.framework.media.a i() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }

    public j k() {
        return this.h;
    }

    public String l() {
        return this.e;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.g;
    }

    public List<String> o() {
        return Collections.unmodifiableList(this.f);
    }

    public double p() {
        return this.l;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = o80.a(parcel);
        o80.s(parcel, 2, l(), false);
        o80.u(parcel, 3, o(), false);
        o80.c(parcel, 4, n());
        o80.r(parcel, 5, k(), i2, false);
        o80.c(parcel, 6, m());
        o80.r(parcel, 7, i(), i2, false);
        o80.c(parcel, 8, j());
        o80.g(parcel, 9, p());
        o80.c(parcel, 10, this.m);
        o80.b(parcel, a2);
    }
}
