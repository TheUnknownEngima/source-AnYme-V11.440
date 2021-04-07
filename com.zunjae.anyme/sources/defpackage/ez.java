package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ez  reason: default package */
public final class ez extends cz {
    public static final Parcelable.Creator<ez> CREATOR = new a();
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final List<b> l;
    public final boolean m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;

    /* renamed from: ez$a */
    class a implements Parcelable.Creator<ez> {
        a() {
        }

        /* renamed from: a */
        public ez createFromParcel(Parcel parcel) {
            return new ez(parcel, (a) null);
        }

        /* renamed from: b */
        public ez[] newArray(int i) {
            return new ez[i];
        }
    }

    /* renamed from: ez$b */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        private b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    private ez(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<b> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = j3;
        this.k = j4;
        this.l = Collections.unmodifiableList(list);
        this.m = z5;
        this.n = j5;
        this.o = i2;
        this.p = i3;
        this.q = i4;
    }

    private ez(Parcel parcel) {
        this.e = parcel.readLong();
        boolean z = false;
        this.f = parcel.readByte() == 1;
        this.g = parcel.readByte() == 1;
        this.h = parcel.readByte() == 1;
        this.i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(b.a(parcel));
        }
        this.l = Collections.unmodifiableList(arrayList);
        this.m = parcel.readByte() == 1 ? true : z;
        this.n = parcel.readLong();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
    }

    /* synthetic */ ez(Parcel parcel, a aVar) {
        this(parcel);
    }

    static ez a(i50 i50, long j2, s50 s50) {
        boolean z;
        int i2;
        int i3;
        int i4;
        long j3;
        boolean z2;
        List list;
        long j4;
        boolean z3;
        boolean z4;
        long j5;
        boolean z5;
        s50 s502 = s50;
        long B = i50.B();
        boolean z6 = (i50.z() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int z7 = i50.z();
            boolean z8 = (z7 & 128) != 0;
            boolean z9 = (z7 & 64) != 0;
            boolean z10 = (z7 & 32) != 0;
            boolean z11 = (z7 & 16) != 0;
            long b2 = (!z9 || z11) ? -9223372036854775807L : hz.b(i50, j2);
            if (!z9) {
                int z12 = i50.z();
                ArrayList arrayList = new ArrayList(z12);
                for (int i5 = 0; i5 < z12; i5++) {
                    int z13 = i50.z();
                    long b3 = !z11 ? hz.b(i50, j2) : -9223372036854775807L;
                    arrayList.add(new b(z13, b3, s502.b(b3), (a) null));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long z14 = (long) i50.z();
                boolean z15 = (128 & z14) != 0;
                j5 = ((((z14 & 1) << 32) | i50.B()) * 1000) / 90;
                z5 = z15;
            } else {
                z5 = false;
                j5 = -9223372036854775807L;
            }
            i4 = i50.F();
            z = z9;
            i3 = i50.z();
            i2 = i50.z();
            list = emptyList;
            long j6 = b2;
            z2 = z5;
            j3 = j5;
            z3 = z11;
            z4 = z8;
            j4 = j6;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j4 = -9223372036854775807L;
            z2 = false;
            j3 = -9223372036854775807L;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            z = false;
        }
        return new ez(B, z6, z4, z, z3, j4, s502.b(j4), list, z2, j3, i4, i3, i2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.e);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeByte(this.g ? (byte) 1 : 0);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeByte(this.i ? (byte) 1 : 0);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        int size = this.l.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.l.get(i3).b(parcel);
        }
        parcel.writeByte(this.m ? (byte) 1 : 0);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
    }
}
