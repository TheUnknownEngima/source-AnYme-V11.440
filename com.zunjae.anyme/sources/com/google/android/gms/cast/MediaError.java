package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import org.json.JSONObject;

public class MediaError extends m80 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new a1();
    private String e;
    private long f;
    private final Integer g;
    private final String h;
    private String i;
    private final JSONObject j;

    MediaError(String str, long j2, Integer num, String str2, String str3) {
        this(str, j2, num, str2, t60.a(str3));
    }

    public MediaError(String str, long j2, Integer num, String str2, JSONObject jSONObject) {
        this.e = str;
        this.f = j2;
        this.g = num;
        this.h = str2;
        this.j = jSONObject;
    }

    public static MediaError m(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, jSONObject.has("reason") ? jSONObject.optString("reason") : null, jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    public Integer i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public long k() {
        return this.f;
    }

    public String l() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.j;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int a = o80.a(parcel);
        o80.s(parcel, 2, l(), false);
        o80.o(parcel, 3, k());
        o80.n(parcel, 4, i(), false);
        o80.s(parcel, 5, j(), false);
        o80.s(parcel, 6, this.i, false);
        o80.b(parcel, a);
    }
}
