package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

public class k extends m80 {
    public static final Parcelable.Creator<k> CREATOR = new c1();
    private static final u60 i = new u60("MediaLiveSeekableRange");
    private final long e;
    private final long f;
    private final boolean g;
    private final boolean h;

    k(long j, long j2, boolean z, boolean z2) {
        this.e = Math.max(j, 0);
        this.f = Math.max(j2, 0);
        this.g = z;
        this.h = z2;
    }

    static k m(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                return new k(t60.c(jSONObject.getDouble("start")), t60.c(jSONObject.getDouble("end")), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                u60 u60 = i;
                String valueOf = String.valueOf(jSONObject);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                sb.append(valueOf);
                u60.c(sb.toString(), new Object[0]);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.e == kVar.e && this.f == kVar.f && this.g == kVar.g && this.h == kVar.h;
    }

    public int hashCode() {
        return q.b(Long.valueOf(this.e), Long.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    public long i() {
        return this.f;
    }

    public long j() {
        return this.e;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.o(parcel, 2, j());
        o80.o(parcel, 3, i());
        o80.c(parcel, 4, l());
        o80.c(parcel, 5, k());
        o80.b(parcel, a);
    }
}
