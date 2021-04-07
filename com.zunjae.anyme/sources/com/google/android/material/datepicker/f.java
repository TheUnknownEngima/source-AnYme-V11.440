package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();
    private final long e;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    private f(long j) {
        this.e = j;
    }

    /* synthetic */ f(long j, a aVar) {
        this(j);
    }

    public static f a(long j) {
        return new f(j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.e == ((f) obj).e;
    }

    public boolean g0(long j) {
        return j >= this.e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.e);
    }
}
