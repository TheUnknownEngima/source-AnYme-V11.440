package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.s;
import androidx.lifecycle.h;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final int[] e;
    final ArrayList<String> f;
    final int[] g;
    final int[] h;
    final int i;
    final String j;
    final int k;
    final int l;
    final CharSequence m;
    final int n;
    final CharSequence o;
    final ArrayList<String> p;
    final ArrayList<String> q;
    final boolean r;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.e = parcel.createIntArray();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createIntArray();
        this.h = parcel.createIntArray();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.e = new int[(size * 5)];
        if (aVar.g) {
            this.f = new ArrayList<>(size);
            this.g = new int[size];
            this.h = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                s.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.e[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.i : null);
                int[] iArr = this.e;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f;
                this.g[i2] = aVar2.g.ordinal();
                this.h[i2] = aVar2.h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.i = aVar.f;
            this.j = aVar.i;
            this.k = aVar.t;
            this.l = aVar.j;
            this.m = aVar.k;
            this.n = aVar.l;
            this.o = aVar.m;
            this.p = aVar.n;
            this.q = aVar.o;
            this.r = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(k kVar) {
        a aVar = new a(kVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.e.length) {
            s.a aVar2 = new s.a();
            int i4 = i2 + 1;
            aVar2.a = this.e[i2];
            if (k.s0(2)) {
                "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.e[i4];
            }
            String str = this.f.get(i3);
            aVar2.b = str != null ? kVar.X(str) : null;
            aVar2.g = h.b.values()[this.g[i3]];
            aVar2.h = h.b.values()[this.h[i3]];
            int[] iArr = this.e;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.e = i10;
            int i11 = iArr[i9];
            aVar2.f = i11;
            aVar.b = i6;
            aVar.c = i8;
            aVar.d = i10;
            aVar.e = i11;
            aVar.f(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f = this.i;
        aVar.i = this.j;
        aVar.t = this.k;
        aVar.g = true;
        aVar.j = this.l;
        aVar.k = this.m;
        aVar.l = this.n;
        aVar.m = this.o;
        aVar.n = this.p;
        aVar.o = this.q;
        aVar.p = this.r;
        aVar.w(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.e);
        parcel.writeStringList(this.f);
        parcel.writeIntArray(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }
}
