package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CastDevice extends m80 implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new w1();
    private String e;
    private String f;
    private InetAddress g;
    private String h;
    private String i;
    private String j;
    private int k;
    private List<k80> l;
    private int m;
    private int n;
    private String o;
    private String p;
    private int q;
    private String r;
    private byte[] s;
    private String t;

    CastDevice(String str, String str2, String str3, String str4, String str5, int i2, List<k80> list, int i3, int i4, String str6, String str7, int i5, String str8, byte[] bArr, String str9) {
        this.e = y(str);
        String y = y(str2);
        this.f = y;
        if (!TextUtils.isEmpty(y)) {
            try {
                this.g = InetAddress.getByName(this.f);
            } catch (UnknownHostException e2) {
                String str10 = this.f;
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
                sb.toString();
            }
        }
        this.h = y(str3);
        this.i = y(str4);
        this.j = y(str5);
        this.k = i2;
        this.l = list != null ? list : new ArrayList<>();
        this.m = i3;
        this.n = i4;
        this.o = y(str6);
        this.p = str7;
        this.q = i5;
        this.r = str8;
        this.s = bArr;
        this.t = str9;
    }

    public static CastDevice l(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String y(String str) {
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.e;
        return str == null ? castDevice.e == null : t60.f(str, castDevice.e) && t60.f(this.g, castDevice.g) && t60.f(this.i, castDevice.i) && t60.f(this.h, castDevice.h) && t60.f(this.j, castDevice.j) && this.k == castDevice.k && t60.f(this.l, castDevice.l) && this.m == castDevice.m && this.n == castDevice.n && t60.f(this.o, castDevice.o) && t60.f(Integer.valueOf(this.q), Integer.valueOf(castDevice.q)) && t60.f(this.r, castDevice.r) && t60.f(this.p, castDevice.p) && t60.f(this.j, castDevice.j()) && this.k == castDevice.o() && ((this.s == null && castDevice.s == null) || Arrays.equals(this.s, castDevice.s)) && t60.f(this.t, castDevice.t);
    }

    public int hashCode() {
        String str = this.e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String i() {
        return this.e.startsWith("__cast_nearby__") ? this.e.substring(16) : this.e;
    }

    public String j() {
        return this.j;
    }

    public String k() {
        return this.h;
    }

    public List<k80> m() {
        return Collections.unmodifiableList(this.l);
    }

    public String n() {
        return this.i;
    }

    public int o() {
        return this.k;
    }

    public boolean p(int i2) {
        return (this.m & i2) == i2;
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.h, this.e});
    }

    public void u(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, this.e, false);
        o80.s(parcel, 3, this.f, false);
        o80.s(parcel, 4, k(), false);
        o80.s(parcel, 5, n(), false);
        o80.s(parcel, 6, j(), false);
        o80.l(parcel, 7, o());
        o80.w(parcel, 8, m(), false);
        o80.l(parcel, 9, this.m);
        o80.l(parcel, 10, this.n);
        o80.s(parcel, 11, this.o, false);
        o80.s(parcel, 12, this.p, false);
        o80.l(parcel, 13, this.q);
        o80.s(parcel, 14, this.r, false);
        o80.f(parcel, 15, this.s, false);
        o80.s(parcel, 16, this.t, false);
        o80.b(parcel, a);
    }

    public final String z() {
        return this.p;
    }
}
