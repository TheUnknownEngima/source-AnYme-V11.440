package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();
    final String e;
    final String f;
    final boolean g;
    final int h;
    final int i;
    final String j;
    final boolean k;
    final boolean l;
    final boolean m;
    final Bundle n;
    final boolean o;
    final int p;
    Bundle q;

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* renamed from: a */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* renamed from: b */
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    o(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readString();
        boolean z = true;
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.o = parcel.readInt() == 0 ? false : z;
        this.q = parcel.readBundle();
        this.p = parcel.readInt();
    }

    o(Fragment fragment) {
        this.e = fragment.getClass().getName();
        this.f = fragment.i;
        this.g = fragment.q;
        this.h = fragment.z;
        this.i = fragment.A;
        this.j = fragment.B;
        this.k = fragment.E;
        this.l = fragment.p;
        this.m = fragment.D;
        this.n = fragment.j;
        this.o = fragment.C;
        this.p = fragment.T.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.e);
        sb.append(" (");
        sb.append(this.f);
        sb.append(")}:");
        if (this.g) {
            sb.append(" fromLayout");
        }
        if (this.i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.i));
        }
        String str = this.j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.j);
        }
        if (this.k) {
            sb.append(" retainInstance");
        }
        if (this.l) {
            sb.append(" removing");
        }
        if (this.m) {
            sb.append(" detached");
        }
        if (this.o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeBundle(this.q);
        parcel.writeInt(this.p);
    }
}
