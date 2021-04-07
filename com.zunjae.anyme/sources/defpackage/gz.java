package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gz  reason: default package */
public final class gz extends cz {
    public static final Parcelable.Creator<gz> CREATOR = new a();
    public final List<c> e;

    /* renamed from: gz$a */
    class a implements Parcelable.Creator<gz> {
        a() {
        }

        /* renamed from: a */
        public gz createFromParcel(Parcel parcel) {
            return new gz(parcel, (a) null);
        }

        /* renamed from: b */
        public gz[] newArray(int i) {
            return new gz[i];
        }
    }

    /* renamed from: gz$b */
    public static final class b {
        public final int a;
        public final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }
    }

    /* renamed from: gz$c */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long j2, boolean z, boolean z2, boolean z3, List<b> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.a = j2;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j3;
            this.g = z4;
            this.h = j4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
        }

        private c(Parcel parcel) {
            this.a = parcel.readLong();
            boolean z = false;
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(b.c(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1 ? true : z;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* access modifiers changed from: private */
        public static c e(i50 i50) {
            boolean z;
            int i2;
            int i3;
            int i4;
            long j2;
            boolean z2;
            long j3;
            ArrayList arrayList;
            boolean z3;
            long j4;
            boolean z4;
            long B = i50.B();
            boolean z5 = (i50.z() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int z6 = i50.z();
                boolean z7 = (z6 & 128) != 0;
                boolean z8 = (z6 & 64) != 0;
                boolean z9 = (z6 & 32) != 0;
                long B2 = z8 ? i50.B() : -9223372036854775807L;
                if (!z8) {
                    int z10 = i50.z();
                    ArrayList arrayList3 = new ArrayList(z10);
                    for (int i5 = 0; i5 < z10; i5++) {
                        arrayList3.add(new b(i50.z(), i50.B(), (a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long z11 = (long) i50.z();
                    boolean z12 = (128 & z11) != 0;
                    j4 = ((((z11 & 1) << 32) | i50.B()) * 1000) / 90;
                    z4 = z12;
                } else {
                    z4 = false;
                    j4 = -9223372036854775807L;
                }
                int F = i50.F();
                int z13 = i50.z();
                z = z8;
                i2 = i50.z();
                j2 = j4;
                arrayList = arrayList2;
                long j5 = B2;
                i4 = F;
                i3 = z13;
                j3 = j5;
                boolean z14 = z7;
                z2 = z4;
                z3 = z14;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j3 = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                z = false;
            }
            return new c(B, z5, z3, z, arrayList, j3, z2, j2, i4, i3, i2);
        }

        /* access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.b ? (byte) 1 : 0);
            parcel.writeByte(this.c ? (byte) 1 : 0);
            parcel.writeByte(this.d ? (byte) 1 : 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f.get(i2).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }

    private gz(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.d(parcel));
        }
        this.e = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ gz(Parcel parcel, a aVar) {
        this(parcel);
    }

    private gz(List<c> list) {
        this.e = Collections.unmodifiableList(list);
    }

    static gz a(i50 i50) {
        int z = i50.z();
        ArrayList arrayList = new ArrayList(z);
        for (int i = 0; i < z; i++) {
            arrayList.add(c.e(i50));
        }
        return new gz((List<c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.e.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.e.get(i2).f(parcel);
        }
    }
}
