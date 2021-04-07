package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fz  reason: default package */
public final class fz extends cz {
    public static final Parcelable.Creator<fz> CREATOR = new a();

    /* renamed from: fz$a */
    class a implements Parcelable.Creator<fz> {
        a() {
        }

        /* renamed from: a */
        public fz createFromParcel(Parcel parcel) {
            return new fz();
        }

        /* renamed from: b */
        public fz[] newArray(int i) {
            return new fz[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
