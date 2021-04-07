package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.d;
import com.google.android.gms.cast.y;
import com.google.android.gms.common.internal.q;

/* renamed from: j80  reason: default package */
public final class j80 extends m80 {
    public static final Parcelable.Creator<j80> CREATOR = new i80();
    private double e;
    private boolean f;
    private int g;
    private d h;
    private int i;
    private y j;
    private double k;

    public j80() {
        this(Double.NaN, false, -1, (d) null, -1, (y) null, Double.NaN);
    }

    j80(double d, boolean z, int i2, d dVar, int i3, y yVar, double d2) {
        this.e = d;
        this.f = z;
        this.g = i2;
        this.h = dVar;
        this.i = i3;
        this.j = yVar;
        this.k = d2;
    }

    public final d d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80 = (j80) obj;
        if (this.e == j80.e && this.f == j80.f && this.g == j80.g && t60.f(this.h, j80.h) && this.i == j80.i) {
            y yVar = this.j;
            return t60.f(yVar, yVar) && this.k == j80.k;
        }
    }

    public final int hashCode() {
        return q.b(Double.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), this.j, Double.valueOf(this.k));
    }

    public final int i() {
        return this.g;
    }

    public final int j() {
        return this.i;
    }

    public final double k() {
        return this.e;
    }

    public final boolean l() {
        return this.f;
    }

    public final y m() {
        return this.j;
    }

    public final double n() {
        return this.k;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.g(parcel, 2, this.e);
        o80.c(parcel, 3, this.f);
        o80.l(parcel, 4, this.g);
        o80.r(parcel, 5, this.h, i2, false);
        o80.l(parcel, 6, this.i);
        o80.r(parcel, 7, this.j, i2, false);
        o80.g(parcel, 8, this.k);
        o80.b(parcel, a);
    }
}
