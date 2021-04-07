package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class d extends m80 {
    public static final Parcelable.Creator<d> CREATOR = new o1();
    private String e;
    private String f;
    private List<String> g;
    private String h;
    private Uri i;
    @Nullable
    private String j;
    private String k;

    private d() {
        this.g = new ArrayList();
    }

    d(String str, String str2, @Nullable List<k80> list, List<String> list2, String str3, Uri uri, @Nullable String str4, @Nullable String str5) {
        this.e = str;
        this.f = str2;
        this.g = list2;
        this.h = str3;
        this.i = uri;
        this.j = str4;
        this.k = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t60.f(this.e, dVar.e) && t60.f(this.f, dVar.f) && t60.f(this.g, dVar.g) && t60.f(this.h, dVar.h) && t60.f(this.i, dVar.i) && t60.f(this.j, dVar.j) && t60.f(this.k, dVar.k);
    }

    public int hashCode() {
        return q.b(this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public String i() {
        return this.e;
    }

    public List<k80> j() {
        return null;
    }

    public String k() {
        return this.f;
    }

    public String l() {
        return this.h;
    }

    public List<String> m() {
        return Collections.unmodifiableList(this.g);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        List<String> list = this.g;
        int size = list == null ? 0 : list.size();
        String str3 = this.h;
        String valueOf = String.valueOf(this.i);
        String str4 = this.j;
        String str5 = this.k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(valueOf).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, i(), false);
        o80.s(parcel, 3, k(), false);
        o80.w(parcel, 4, j(), false);
        o80.u(parcel, 5, m(), false);
        o80.s(parcel, 6, l(), false);
        o80.r(parcel, 7, this.i, i2, false);
        o80.s(parcel, 8, this.j, false);
        o80.s(parcel, 9, this.k, false);
        o80.b(parcel, a);
    }
}
