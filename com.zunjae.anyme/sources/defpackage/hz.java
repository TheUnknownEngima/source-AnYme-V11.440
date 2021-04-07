package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hz  reason: default package */
public final class hz extends cz {
    public static final Parcelable.Creator<hz> CREATOR = new a();
    public final long e;
    public final long f;

    /* renamed from: hz$a */
    class a implements Parcelable.Creator<hz> {
        a() {
        }

        /* renamed from: a */
        public hz createFromParcel(Parcel parcel) {
            return new hz(parcel.readLong(), parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public hz[] newArray(int i) {
            return new hz[i];
        }
    }

    private hz(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    /* synthetic */ hz(long j, long j2, a aVar) {
        this(j, j2);
    }

    static hz a(i50 i50, long j, s50 s50) {
        long b = b(i50, j);
        return new hz(b, s50.b(b));
    }

    static long b(i50 i50, long j) {
        long z = (long) i50.z();
        if ((128 & z) != 0) {
            return 8589934591L & ((((z & 1) << 32) | i50.B()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }
}
