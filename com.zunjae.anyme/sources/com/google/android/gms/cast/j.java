package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import java.util.Locale;

public class j extends m80 {
    public static final Parcelable.Creator<j> CREATOR = new z0();
    private boolean e;
    private String f;
    private boolean g;
    private i h;

    public j() {
        this(false, t60.e(Locale.getDefault()), false, (i) null);
    }

    j(boolean z, String str, boolean z2, i iVar) {
        this.e = z;
        this.f = str;
        this.g = z2;
        this.h = iVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.e == jVar.e && t60.f(this.f, jVar.f) && this.g == jVar.g && t60.f(this.h, jVar.h);
    }

    public int hashCode() {
        return q.b(Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), this.h);
    }

    public boolean i() {
        return this.g;
    }

    public i j() {
        return this.h;
    }

    public String k() {
        return this.f;
    }

    public boolean l() {
        return this.e;
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", new Object[]{Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.c(parcel, 2, l());
        o80.s(parcel, 3, k(), false);
        o80.c(parcel, 4, i());
        o80.r(parcel, 5, j(), i, false);
        o80.b(parcel, a);
    }
}
