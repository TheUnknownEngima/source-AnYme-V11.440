package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* renamed from: ky1  reason: default package */
public final class ky1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    @SerializedName("malid")
    private int e;
    @SerializedName("time")
    private long f;
    @SerializedName("episode")
    private int g;

    /* renamed from: ky1$a */
    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            v62.e(parcel, "in");
            return new ky1(parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ky1[i];
        }
    }

    public ky1(int i, long j, int i2) {
        this.e = i;
        this.f = j;
        this.g = i2;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.g;
    }

    public final String c() {
        String str;
        ex1 a2 = fx1.a.a(this.f);
        int i = a2.b % 7;
        int i2 = a2.a;
        int i3 = a2.c % 24;
        int i4 = a2.d % 60;
        if (i2 > 0) {
            h72 h72 = h72.a;
            str = String.format("%dw", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            v62.d(str, "java.lang.String.format(format, *args)");
        } else {
            str = "";
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            h72 h722 = h72.a;
            String format = String.format(" %dd", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            v62.d(format, "java.lang.String.format(format, *args)");
            sb.append(format);
            str = sb.toString();
        }
        if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            h72 h723 = h72.a;
            String format2 = String.format(" %dh", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            v62.d(format2, "java.lang.String.format(format, *args)");
            sb2.append(format2);
            str = sb2.toString();
        }
        if (i4 > 0 && i2 <= 0 && i <= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            h72 h724 = h72.a;
            String format3 = String.format(" %dm", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            v62.d(format3, "java.lang.String.format(format, *args)");
            sb3.append(format3);
            str = sb3.toString();
        }
        int length = str.length() - 1;
        int i5 = 0;
        boolean z = false;
        while (i5 <= length) {
            boolean z2 = v62.g(str.charAt(!z ? i5 : length), 32) <= 0;
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i5++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    public final long d() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f < System.currentTimeMillis() / ((long) 1000);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky1)) {
            return false;
        }
        ky1 ky1 = (ky1) obj;
        return this.e == ky1.e && this.f == ky1.f && this.g == ky1.g;
    }

    public final boolean f() {
        return this.f > System.currentTimeMillis() / ((long) 1000);
    }

    public final int g() {
        return e() ? this.g : this.g - 1;
    }

    public int hashCode() {
        long j = this.f;
        return (((this.e * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.g;
    }

    public String toString() {
        return "MinimalCalendarEntry(malid=" + this.e + ", time=" + this.f + ", newEpisodeNumber=" + this.g + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        v62.e(parcel, "parcel");
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
    }
}
