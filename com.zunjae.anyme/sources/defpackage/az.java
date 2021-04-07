package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: az  reason: default package */
public final class az extends vy {
    public static final Parcelable.Creator<az> CREATOR = new a();
    public final String f;
    public final String g;

    /* renamed from: az$a */
    class a implements Parcelable.Creator<az> {
        a() {
        }

        /* renamed from: a */
        public az createFromParcel(Parcel parcel) {
            return new az(parcel);
        }

        /* renamed from: b */
        public az[] newArray(int i) {
            return new az[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    az(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            defpackage.v50.g(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            r1.f = r0
            java.lang.String r2 = r2.readString()
            defpackage.v50.g(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.<init>(android.os.Parcel):void");
    }

    public az(String str, String str2, String str3) {
        super(str);
        this.f = str2;
        this.g = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || az.class != obj.getClass()) {
            return false;
        }
        az azVar = (az) obj;
        return this.e.equals(azVar.e) && v50.b(this.f, azVar.f) && v50.b(this.g, azVar.g);
    }

    public int hashCode() {
        int hashCode = (527 + this.e.hashCode()) * 31;
        String str = this.f;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
