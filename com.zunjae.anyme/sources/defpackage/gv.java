package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import defpackage.yx;
import java.util.Arrays;

/* renamed from: gv  reason: default package */
public final class gv implements yx.b {
    public static final Parcelable.Creator<gv> CREATOR = new a();
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;

    /* renamed from: gv$a */
    class a implements Parcelable.Creator<gv> {
        a() {
        }

        /* renamed from: a */
        public gv createFromParcel(Parcel parcel) {
            return new gv(parcel, (a) null);
        }

        /* renamed from: b */
        public gv[] newArray(int i) {
            return new gv[i];
        }
    }

    private gv(Parcel parcel) {
        String readString = parcel.readString();
        v50.g(readString);
        this.e = readString;
        byte[] bArr = new byte[parcel.readInt()];
        this.f = bArr;
        parcel.readByteArray(bArr);
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }

    /* synthetic */ gv(Parcel parcel, a aVar) {
        this(parcel);
    }

    public gv(String str, byte[] bArr, int i, int i2) {
        this.e = str;
        this.f = bArr;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ f0 C() {
        return zx.b(this);
    }

    public /* synthetic */ byte[] F0() {
        return zx.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gv.class != obj.getClass()) {
            return false;
        }
        gv gvVar = (gv) obj;
        return this.e.equals(gvVar.e) && Arrays.equals(this.f, gvVar.f) && this.g == gvVar.g && this.h == gvVar.h;
    }

    public int hashCode() {
        return ((((((527 + this.e.hashCode()) * 31) + Arrays.hashCode(this.f)) * 31) + this.g) * 31) + this.h;
    }

    public String toString() {
        String valueOf = String.valueOf(this.e);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeInt(this.f.length);
        parcel.writeByteArray(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
