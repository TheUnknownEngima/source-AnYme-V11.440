package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import java.util.Arrays;
import java.util.List;

/* renamed from: yx  reason: default package */
public final class yx implements Parcelable {
    public static final Parcelable.Creator<yx> CREATOR = new a();
    private final b[] e;

    /* renamed from: yx$a */
    class a implements Parcelable.Creator<yx> {
        a() {
        }

        /* renamed from: a */
        public yx createFromParcel(Parcel parcel) {
            return new yx(parcel);
        }

        /* renamed from: b */
        public yx[] newArray(int i) {
            return new yx[i];
        }
    }

    /* renamed from: yx$b */
    public interface b extends Parcelable {
        f0 C();

        byte[] F0();
    }

    yx(Parcel parcel) {
        this.e = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.e;
            if (i < bVarArr.length) {
                bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public yx(List<? extends b> list) {
        b[] bVarArr = new b[list.size()];
        this.e = bVarArr;
        list.toArray(bVarArr);
    }

    public yx(b... bVarArr) {
        this.e = bVarArr;
    }

    public yx a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new yx((b[]) v50.o0(this.e, bVarArr));
    }

    public yx b(yx yxVar) {
        return yxVar == null ? this : a(yxVar.e);
    }

    public b c(int i) {
        return this.e[i];
    }

    public int d() {
        return this.e.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yx.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.e, ((yx) obj).e);
    }

    public int hashCode() {
        return Arrays.hashCode(this.e);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.e));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e.length);
        for (b writeParcelable : this.e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
