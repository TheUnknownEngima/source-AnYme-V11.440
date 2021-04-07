package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: py  reason: default package */
public final class py extends vy {
    public static final Parcelable.Creator<py> CREATOR = new a();
    public final byte[] f;

    /* renamed from: py$a */
    class a implements Parcelable.Creator<py> {
        a() {
        }

        /* renamed from: a */
        public py createFromParcel(Parcel parcel) {
            return new py(parcel);
        }

        /* renamed from: b */
        public py[] newArray(int i) {
            return new py[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    py(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            defpackage.v50.g(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            byte[] r2 = r2.createByteArray()
            defpackage.v50.g(r2)
            byte[] r2 = (byte[]) r2
            r1.f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py.<init>(android.os.Parcel):void");
    }

    public py(String str, byte[] bArr) {
        super(str);
        this.f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || py.class != obj.getClass()) {
            return false;
        }
        py pyVar = (py) obj;
        return this.e.equals(pyVar.e) && Arrays.equals(this.f, pyVar.f);
    }

    public int hashCode() {
        return ((527 + this.e.hashCode()) * 31) + Arrays.hashCode(this.f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }
}
