package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends m80 {
    public static final Parcelable.Creator<b> CREATOR = new q0();
    private final long e;
    private final String f;
    private final long g;
    private final boolean h;
    private String[] i;
    private final boolean j;

    public b(long j2, String str, long j3, boolean z, String[] strArr, boolean z2) {
        this.e = j2;
        this.f = str;
        this.g = j3;
        this.h = z;
        this.i = strArr;
        this.j = z2;
    }

    static b p(JSONObject jSONObject) {
        String[] strArr;
        if (jSONObject != null && jSONObject.has("id") && jSONObject.has("position")) {
            try {
                String string = jSONObject.getString("id");
                long c = t60.c((double) jSONObject.getLong("position"));
                boolean optBoolean = jSONObject.optBoolean("isWatched");
                long c2 = t60.c((double) jSONObject.optLong("duration"));
                JSONArray optJSONArray = jSONObject.optJSONArray("breakClipIds");
                if (optJSONArray != null) {
                    String[] strArr2 = new String[optJSONArray.length()];
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        strArr2[i2] = optJSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } else {
                    strArr = null;
                }
                return new b(c, string, c2, optBoolean, strArr, jSONObject.optBoolean("isEmbedded"));
            } catch (JSONException e2) {
                String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[]{e2.getMessage()});
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t60.f(this.f, bVar.f) && this.e == bVar.e && this.g == bVar.g && this.h == bVar.h && Arrays.equals(this.i, bVar.i) && this.j == bVar.j;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    public String[] i() {
        return this.i;
    }

    public long j() {
        return this.g;
    }

    public String k() {
        return this.f;
    }

    public long l() {
        return this.e;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.h;
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f);
            jSONObject.put("position", t60.b(this.e));
            jSONObject.put("isWatched", this.h);
            jSONObject.put("isEmbedded", this.j);
            jSONObject.put("duration", t60.b(this.g));
            if (this.i != null) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.i) {
                    jSONArray.put(put);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.o(parcel, 2, l());
        o80.s(parcel, 3, k(), false);
        o80.o(parcel, 4, j());
        o80.c(parcel, 5, n());
        o80.t(parcel, 6, i(), false);
        o80.c(parcel, 7, m());
        o80.b(parcel, a);
    }
}
