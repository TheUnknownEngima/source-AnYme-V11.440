package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import java.util.Arrays;

/* renamed from: o00  reason: default package */
public final class o00 implements Parcelable {
    public static final Parcelable.Creator<o00> CREATOR = new a();
    public final int e;
    private final f0[] f;
    private int g;

    /* renamed from: o00$a */
    class a implements Parcelable.Creator<o00> {
        a() {
        }

        /* renamed from: a */
        public o00 createFromParcel(Parcel parcel) {
            return new o00(parcel);
        }

        /* renamed from: b */
        public o00[] newArray(int i) {
            return new o00[i];
        }
    }

    o00(Parcel parcel) {
        int readInt = parcel.readInt();
        this.e = readInt;
        this.f = new f0[readInt];
        for (int i = 0; i < this.e; i++) {
            this.f[i] = (f0) parcel.readParcelable(f0.class.getClassLoader());
        }
    }

    public o00(f0... f0VarArr) {
        q40.f(f0VarArr.length > 0);
        this.f = f0VarArr;
        this.e = f0VarArr.length;
    }

    public f0 a(int i) {
        return this.f[i];
    }

    public int b(f0 f0Var) {
        int i = 0;
        while (true) {
            f0[] f0VarArr = this.f;
            if (i >= f0VarArr.length) {
                return -1;
            }
            if (f0Var == f0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00.class != obj.getClass()) {
            return false;
        }
        o00 o00 = (o00) obj;
        return this.e == o00.e && Arrays.equals(this.f, o00.f);
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = 527 + Arrays.hashCode(this.f);
        }
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        for (int i2 = 0; i2 < this.e; i2++) {
            parcel.writeParcelable(this.f[i2], 0);
        }
    }
}
