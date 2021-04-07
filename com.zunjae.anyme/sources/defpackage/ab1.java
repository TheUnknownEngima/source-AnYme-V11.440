package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ab1  reason: default package */
public class ab1 extends j5 {
    public static final Parcelable.Creator<ab1> CREATOR = new a();
    public final h0<String, Bundle> g;

    /* renamed from: ab1$a */
    static class a implements Parcelable.ClassLoaderCreator<ab1> {
        a() {
        }

        /* renamed from: a */
        public ab1 createFromParcel(Parcel parcel) {
            return new ab1(parcel, (ClassLoader) null, (a) null);
        }

        /* renamed from: b */
        public ab1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ab1(parcel, classLoader, (a) null);
        }

        /* renamed from: c */
        public ab1[] newArray(int i) {
            return new ab1[i];
        }
    }

    private ab1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.g = new h0<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.g.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ ab1(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public ab1(Parcelable parcelable) {
        super(parcelable);
        this.g = new h0<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.g + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.g.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.g.i(i2);
            bundleArr[i2] = this.g.m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
