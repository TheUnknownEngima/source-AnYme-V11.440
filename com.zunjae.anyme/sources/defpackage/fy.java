package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import defpackage.yx;
import java.util.Arrays;

/* renamed from: fy  reason: default package */
public final class fy implements yx.b {
    public static final Parcelable.Creator<fy> CREATOR = new a();
    private static final f0 k = f0.u((String) null, "application/id3", Long.MAX_VALUE);
    private static final f0 l = f0.u((String) null, "application/x-scte35", Long.MAX_VALUE);
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final byte[] i;
    private int j;

    /* renamed from: fy$a */
    class a implements Parcelable.Creator<fy> {
        a() {
        }

        /* renamed from: a */
        public fy createFromParcel(Parcel parcel) {
            return new fy(parcel);
        }

        /* renamed from: b */
        public fy[] newArray(int i) {
            return new fy[i];
        }
    }

    fy(Parcel parcel) {
        String readString = parcel.readString();
        v50.g(readString);
        this.e = readString;
        String readString2 = parcel.readString();
        v50.g(readString2);
        this.f = readString2;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.i = createByteArray;
    }

    public fy(String str, String str2, long j2, long j3, byte[] bArr) {
        this.e = str;
        this.f = str2;
        this.g = j2;
        this.h = j3;
        this.i = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.f0 C() {
        /*
            r5 = this;
            java.lang.String r0 = r5.e
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            com.google.android.exoplayer2.f0 r0 = l
            return r0
        L_0x0042:
            com.google.android.exoplayer2.f0 r0 = k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy.C():com.google.android.exoplayer2.f0");
    }

    public byte[] F0() {
        if (C() != null) {
            return this.i;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fy.class != obj.getClass()) {
            return false;
        }
        fy fyVar = (fy) obj;
        return this.g == fyVar.g && this.h == fyVar.h && v50.b(this.e, fyVar.e) && v50.b(this.f, fyVar.f) && Arrays.equals(this.i, fyVar.i);
    }

    public int hashCode() {
        if (this.j == 0) {
            String str = this.e;
            int i2 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j2 = this.g;
            long j3 = this.h;
            this.j = ((((((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.i);
        }
        return this.j;
    }

    public String toString() {
        String str = this.e;
        long j2 = this.h;
        long j3 = this.g;
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        sb.append(", durationMs=");
        sb.append(j3);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeByteArray(this.i);
    }
}
