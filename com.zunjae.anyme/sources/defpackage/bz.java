package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bz  reason: default package */
public final class bz extends cz {
    public static final Parcelable.Creator<bz> CREATOR = new a();
    public final long e;
    public final long f;
    public final byte[] g;

    /* renamed from: bz$a */
    class a implements Parcelable.Creator<bz> {
        a() {
        }

        /* renamed from: a */
        public bz createFromParcel(Parcel parcel) {
            return new bz(parcel, (a) null);
        }

        /* renamed from: b */
        public bz[] newArray(int i) {
            return new bz[i];
        }
    }

    private bz(long j, byte[] bArr, long j2) {
        this.e = j2;
        this.f = j;
        this.g = bArr;
    }

    private bz(Parcel parcel) {
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.g = createByteArray;
    }

    /* synthetic */ bz(Parcel parcel, a aVar) {
        this(parcel);
    }

    static bz a(i50 i50, int i, long j) {
        long B = i50.B();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        i50.h(bArr, 0, i2);
        return new bz(B, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeByteArray(this.g);
    }
}
