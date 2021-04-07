package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

public class s extends m80 {
    public static final Parcelable.Creator<s> CREATOR = new q1();
    private final String e;
    private final String f;

    s(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public static s i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new s(jSONObject.optString("adTagUrl", (String) null), jSONObject.optString("adsResponse", (String) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return t60.f(this.e, sVar.e) && t60.f(this.f, sVar.f);
    }

    public int hashCode() {
        return q.b(this.e, this.f);
    }

    public String j() {
        return this.e;
    }

    public String k() {
        return this.f;
    }

    public final JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.e != null) {
                jSONObject.put("adTagUrl", this.e);
            }
            if (this.f != null) {
                jSONObject.put("adsResponse", this.f);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, j(), false);
        o80.s(parcel, 3, k(), false);
        o80.b(parcel, a);
    }
}
