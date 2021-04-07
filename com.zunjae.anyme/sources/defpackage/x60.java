package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

/* renamed from: x60  reason: default package */
public final class x60 extends m80 {
    public static final Parcelable.Creator<x60> CREATOR = new q70();
    private String e;

    public x60() {
        this((String) null);
    }

    x60(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        return t60.f(this.e, ((x60) obj).e);
    }

    public final int hashCode() {
        return q.b(this.e);
    }

    public final String i() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, this.e, false);
        o80.b(parcel, a);
    }
}
