package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j5  reason: default package */
public abstract class j5 implements Parcelable {
    public static final Parcelable.Creator<j5> CREATOR = new b();
    public static final j5 f = new a();
    private final Parcelable e;

    /* renamed from: j5$a */
    static class a extends j5 {
        a() {
            super((a) null);
        }
    }

    /* renamed from: j5$b */
    static class b implements Parcelable.ClassLoaderCreator<j5> {
        b() {
        }

        /* renamed from: a */
        public j5 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public j5 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return j5.f;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public j5[] newArray(int i) {
            return new j5[i];
        }
    }

    private j5() {
        this.e = null;
    }

    protected j5(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.e = readParcelable == null ? f : readParcelable;
    }

    protected j5(Parcelable parcelable) {
        if (parcelable != null) {
            this.e = parcelable == f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ j5(a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }
}
