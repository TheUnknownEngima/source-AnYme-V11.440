package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    private final Calendar e;
    private final String f = s.o().format(this.e.getTime());
    final int g;
    final int h = this.e.get(1);
    final int i = this.e.getMaximum(7);
    final int j = this.e.getActualMaximum(5);
    final long k = this.e.getTimeInMillis();

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.e(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = s.d(calendar);
        this.e = d;
        this.g = d.get(2);
    }

    static l e(int i2, int i3) {
        Calendar l = s.l();
        l.set(1, i2);
        l.set(2, i3);
        return new l(l);
    }

    static l f(long j2) {
        Calendar l = s.l();
        l.setTimeInMillis(j2);
        return new l(l);
    }

    static l h() {
        return new l(s.j());
    }

    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.e.compareTo(lVar.e);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.g == lVar.g && this.h == lVar.h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    /* access modifiers changed from: package-private */
    public int i() {
        int firstDayOfWeek = this.e.get(7) - this.e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.i : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    public long k(int i2) {
        Calendar d = s.d(this.e);
        d.set(5, i2);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public long m() {
        return this.e.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public l q(int i2) {
        Calendar d = s.d(this.e);
        d.add(2, i2);
        return new l(d);
    }

    /* access modifiers changed from: package-private */
    public int s(l lVar) {
        if (this.e instanceof GregorianCalendar) {
            return ((lVar.h - this.h) * 12) + (lVar.g - this.g);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.g);
    }
}
