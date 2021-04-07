package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends m80 {
    public static final Parcelable.Creator<c> CREATOR = new n1();
    private static final u60 j = new u60("AdBreakStatus");
    private final long e;
    private final long f;
    private final String g;
    private final String h;
    private final long i;

    c(long j2, long j3, String str, String str2, long j4) {
        this.e = j2;
        this.f = j3;
        this.g = str;
        this.h = str2;
        this.i = j4;
    }

    static c n(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long c = t60.c((double) jSONObject.getLong("currentBreakTime"));
                long c2 = t60.c((double) jSONObject.getLong("currentBreakClipTime"));
                String optString = jSONObject.optString("breakId", (String) null);
                String optString2 = jSONObject.optString("breakClipId", (String) null);
                long optLong = jSONObject.optLong("whenSkippable", -1);
                return new c(c, c2, optString, optString2, optLong != -1 ? t60.c((double) optLong) : optLong);
            } catch (JSONException e2) {
                j.d(e2, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.e == cVar.e && this.f == cVar.f && t60.f(this.g, cVar.g) && t60.f(this.h, cVar.h) && this.i == cVar.i;
    }

    public int hashCode() {
        return q.b(Long.valueOf(this.e), Long.valueOf(this.f), this.g, this.h, Long.valueOf(this.i));
    }

    public String i() {
        return this.h;
    }

    public String j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public long l() {
        return this.e;
    }

    public long m() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.o(parcel, 2, l());
        o80.o(parcel, 3, k());
        o80.s(parcel, 4, j(), false);
        o80.s(parcel, 5, i(), false);
        o80.o(parcel, 6, m());
        o80.b(parcel, a);
    }
}
