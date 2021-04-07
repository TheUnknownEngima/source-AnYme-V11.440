package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: xp1  reason: default package */
public class xp1 extends View.BaseSavedState {
    public static final Parcelable.Creator<xp1> CREATOR = new a();
    private int e;
    private int f;
    private int g;

    /* renamed from: xp1$a */
    static class a implements Parcelable.Creator<xp1> {
        a() {
        }

        /* renamed from: a */
        public xp1 createFromParcel(Parcel parcel) {
            return new xp1(parcel, (a) null);
        }

        /* renamed from: b */
        public xp1[] newArray(int i) {
            return new xp1[i];
        }
    }

    private xp1(Parcel parcel) {
        super(parcel);
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    /* synthetic */ xp1(Parcel parcel, a aVar) {
        this(parcel);
    }

    public xp1(Parcelable parcelable) {
        super(parcelable);
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public void d(int i) {
        this.g = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public void f(int i) {
        this.f = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
