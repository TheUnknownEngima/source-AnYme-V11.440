package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0098a();
    /* access modifiers changed from: private */
    public final l e;
    /* access modifiers changed from: private */
    public final l f;
    /* access modifiers changed from: private */
    public final l g;
    /* access modifiers changed from: private */
    public final c h;
    private final int i;
    private final int j;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    static class C0098a implements Parcelable.Creator<a> {
        C0098a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C0098a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b {
        static final long e = s.a(l.e(1900, 0).k);
        static final long f = s.a(l.e(2100, 11).k);
        private long a = e;
        private long b = f;
        private Long c;
        private c d = f.a(Long.MIN_VALUE);

        b(a aVar) {
            this.a = aVar.e.k;
            this.b = aVar.f.k;
            this.c = Long.valueOf(aVar.g.k);
            this.d = aVar.h;
        }

        public a a() {
            if (this.c == null) {
                long o2 = i.o2();
                if (this.a > o2 || o2 > this.b) {
                    o2 = this.a;
                }
                this.c = Long.valueOf(o2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            return new a(l.f(this.a), l.f(this.b), l.f(this.c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C0098a) null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean g0(long j);
    }

    private a(l lVar, l lVar2, l lVar3, c cVar) {
        this.e = lVar;
        this.f = lVar2;
        this.g = lVar3;
        this.h = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3.compareTo(lVar2) <= 0) {
            this.j = lVar.s(lVar2) + 1;
            this.i = (lVar2.h - lVar.h) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ a(l lVar, l lVar2, l lVar3, c cVar, C0098a aVar) {
        this(lVar, lVar2, lVar3, cVar);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public l e(l lVar) {
        return lVar.compareTo(this.e) < 0 ? this.e : lVar.compareTo(this.f) > 0 ? this.f : lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && this.h.equals(aVar.h);
    }

    public c f() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public l g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.g, this.h});
    }

    /* access modifiers changed from: package-private */
    public l i() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public l j() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
    }
}
