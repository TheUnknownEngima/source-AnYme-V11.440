package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends m80 {
    public static final Parcelable.Creator<a> CREATOR = new u();
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final String i;
    private final String j;
    private String k;
    private String l;
    private String m;
    private final long n;
    private final String o;
    private final s p;
    private JSONObject q;

    a(String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9, s sVar) {
        JSONObject jSONObject;
        this.e = str;
        this.f = str2;
        this.g = j2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = j3;
        this.o = str9;
        this.p = sVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.q = new JSONObject(str6);
            } catch (JSONException e2) {
                String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e2.getMessage()});
                this.k = null;
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
            this.q = jSONObject;
        }
    }

    static a E(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null || !jSONObject2.has("id")) {
            return null;
        }
        try {
            String string = jSONObject2.getString("id");
            long c = t60.c((double) jSONObject2.optLong("duration"));
            String optString = jSONObject2.optString("clickThroughUrl", (String) null);
            String optString2 = jSONObject2.optString("contentUrl", (String) null);
            String optString3 = jSONObject2.optString("mimeType", (String) null);
            if (optString3 == null) {
                optString3 = jSONObject2.optString("contentType", (String) null);
            }
            String str2 = optString3;
            String optString4 = jSONObject2.optString("title", (String) null);
            JSONObject optJSONObject = jSONObject2.optJSONObject("customData");
            String optString5 = jSONObject2.optString("contentId", (String) null);
            String optString6 = jSONObject2.optString("posterUrl", (String) null);
            long j2 = -1;
            if (jSONObject2.has("whenSkippable")) {
                j2 = t60.c((double) ((Integer) jSONObject2.get("whenSkippable")).intValue());
            }
            long j3 = j2;
            String optString7 = jSONObject2.optString("hlsSegmentFormat", (String) null);
            s i2 = s.i(jSONObject2.optJSONObject("vastAdsRequest"));
            if (optJSONObject != null) {
                if (optJSONObject.length() != 0) {
                    str = optJSONObject.toString();
                    return new a(string, optString4, c, optString2, str2, optString, str, optString5, optString6, j3, optString7, i2);
                }
            }
            str = null;
            return new a(string, optString4, c, optString2, str2, optString, str, optString5, optString6, j3, optString7, i2);
        } catch (JSONException e2) {
            String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e2.getMessage()});
            return null;
        }
    }

    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.e);
            jSONObject.put("duration", t60.b(this.g));
            if (this.n != -1) {
                jSONObject.put("whenSkippable", t60.b(this.n));
            }
            if (this.l != null) {
                jSONObject.put("contentId", this.l);
            }
            if (this.i != null) {
                jSONObject.put("contentType", this.i);
            }
            if (this.f != null) {
                jSONObject.put("title", this.f);
            }
            if (this.h != null) {
                jSONObject.put("contentUrl", this.h);
            }
            if (this.j != null) {
                jSONObject.put("clickThroughUrl", this.j);
            }
            if (this.q != null) {
                jSONObject.put("customData", this.q);
            }
            if (this.m != null) {
                jSONObject.put("posterUrl", this.m);
            }
            if (this.o != null) {
                jSONObject.put("hlsSegmentFormat", this.o);
            }
            if (this.p != null) {
                jSONObject.put("vastAdsRequest", this.p.l());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t60.f(this.e, aVar.e) && t60.f(this.f, aVar.f) && this.g == aVar.g && t60.f(this.h, aVar.h) && t60.f(this.i, aVar.i) && t60.f(this.j, aVar.j) && t60.f(this.k, aVar.k) && t60.f(this.l, aVar.l) && t60.f(this.m, aVar.m) && this.n == aVar.n && t60.f(this.o, aVar.o) && t60.f(this.p, aVar.p);
    }

    public int hashCode() {
        return q.b(this.e, this.f, Long.valueOf(this.g), this.h, this.i, this.j, this.k, this.l, this.m, Long.valueOf(this.n), this.o, this.p);
    }

    public String i() {
        return this.j;
    }

    public String j() {
        return this.l;
    }

    public String k() {
        return this.h;
    }

    public long l() {
        return this.g;
    }

    public String m() {
        return this.o;
    }

    public String n() {
        return this.e;
    }

    public String o() {
        return this.m;
    }

    public String p() {
        return this.i;
    }

    public String u() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, n(), false);
        o80.s(parcel, 3, u(), false);
        o80.o(parcel, 4, l());
        o80.s(parcel, 5, k(), false);
        o80.s(parcel, 6, p(), false);
        o80.s(parcel, 7, i(), false);
        o80.s(parcel, 8, this.k, false);
        o80.s(parcel, 9, j(), false);
        o80.s(parcel, 10, o(), false);
        o80.o(parcel, 11, z());
        o80.s(parcel, 12, m(), false);
        o80.r(parcel, 13, y(), i2, false);
        o80.b(parcel, a);
    }

    public s y() {
        return this.p;
    }

    public long z() {
        return this.n;
    }
}
