package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* renamed from: j40  reason: default package */
public class j40 implements Parcelable {
    public static final Parcelable.Creator<j40> CREATOR = new a();
    public static final j40 j = new b().a();
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final int i;

    /* renamed from: j40$a */
    class a implements Parcelable.Creator<j40> {
        a() {
        }

        /* renamed from: a */
        public j40 createFromParcel(Parcel parcel) {
            return new j40(parcel);
        }

        /* renamed from: b */
        public j40[] newArray(int i) {
            return new j40[i];
        }
    }

    /* renamed from: j40$b */
    public static class b {
        String a;
        String b;
        int c;
        boolean d;
        int e;

        @Deprecated
        public b() {
            this.a = null;
            this.b = null;
            this.c = 0;
            this.d = false;
            this.e = 0;
        }

        public b(Context context) {
            this();
            b(context);
        }

        @TargetApi(19)
        private void c(Context context) {
            CaptioningManager captioningManager;
            if ((v50.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.c = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.b = v50.J(locale);
                }
            }
        }

        public j40 a() {
            return new j40(this.a, this.b, this.c, this.d, this.e);
        }

        public b b(Context context) {
            if (v50.a >= 19) {
                c(context);
            }
            return this;
        }
    }

    j40(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = v50.t0(parcel);
        this.i = parcel.readInt();
    }

    j40(String str, String str2, int i2, boolean z, int i3) {
        this.e = v50.m0(str);
        this.f = v50.m0(str2);
        this.g = i2;
        this.h = z;
        this.i = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j40 j40 = (j40) obj;
        return TextUtils.equals(this.e, j40.e) && TextUtils.equals(this.f, j40.f) && this.g == j40.g && this.h == j40.h && this.i == j40.i;
    }

    public int hashCode() {
        String str = this.e;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((((hashCode + i2) * 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + this.i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        v50.J0(parcel, this.h);
        parcel.writeInt(this.i);
    }
}
