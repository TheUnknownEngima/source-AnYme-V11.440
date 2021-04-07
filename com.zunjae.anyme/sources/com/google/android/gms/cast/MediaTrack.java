package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class MediaTrack extends m80 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new m1();
    private long e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private final List<String> l;
    private String m;
    private JSONObject n;

    public static class a {
        private final long a;
        private final int b;
        private String c;
        private String d;
        private String e;
        private String f;
        private int g = 0;
        private List<String> h;
        private JSONObject i;

        public a(long j, int i2) {
            this.a = j;
            this.b = i2;
        }

        public MediaTrack a() {
            return new MediaTrack(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a c(String str) {
            this.e = str;
            return this;
        }

        public a d(int i2) {
            if (i2 < -1 || i2 > 5) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid subtype ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 == 0 || this.b == 1) {
                this.g = i2;
                return this;
            } else {
                throw new IllegalArgumentException("subtypes are only valid for text tracks");
            }
        }
    }

    MediaTrack(long j2, int i2, String str, String str2, String str3, String str4, int i3, List<String> list, String str5) {
        this(j2, i2, str, str2, str3, str4, i3, list, t60.a(str5));
    }

    MediaTrack(long j2, int i2, String str, String str2, String str3, String str4, int i3, List<String> list, JSONObject jSONObject) {
        this.e = j2;
        this.f = i2;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = i3;
        this.l = list;
        this.n = jSONObject;
    }

    static MediaTrack y(JSONObject jSONObject) {
        int i2;
        zb0 zb0;
        JSONObject jSONObject2 = jSONObject;
        long j2 = jSONObject2.getLong("trackId");
        String optString = jSONObject2.optString("type");
        int i3 = "TEXT".equals(optString) ? 1 : "AUDIO".equals(optString) ? 2 : "VIDEO".equals(optString) ? 3 : 0;
        String optString2 = jSONObject2.optString("trackContentId", (String) null);
        String optString3 = jSONObject2.optString("trackContentType", (String) null);
        String optString4 = jSONObject2.optString("name", (String) null);
        String optString5 = jSONObject2.optString("language", (String) null);
        if (jSONObject2.has("subtype")) {
            String string = jSONObject2.getString("subtype");
            i2 = "SUBTITLES".equals(string) ? 1 : "CAPTIONS".equals(string) ? 2 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
        } else {
            i2 = 0;
        }
        if (jSONObject2.has("roles")) {
            cc0 l2 = zb0.l();
            JSONArray jSONArray = jSONObject2.getJSONArray("roles");
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                l2.a(jSONArray.optString(i4));
            }
            zb0 = l2.b();
        } else {
            zb0 = null;
        }
        return new MediaTrack(j2, i3, optString2, optString3, optString4, optString5, i2, (List<String>) zb0, jSONObject2.optJSONObject("customData"));
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.n == null) != (mediaTrack.n == null)) {
            return false;
        }
        JSONObject jSONObject2 = this.n;
        return (jSONObject2 == null || (jSONObject = mediaTrack.n) == null || l.a(jSONObject2, jSONObject)) && this.e == mediaTrack.e && this.f == mediaTrack.f && t60.f(this.g, mediaTrack.g) && t60.f(this.h, mediaTrack.h) && t60.f(this.i, mediaTrack.i) && t60.f(this.j, mediaTrack.j) && this.k == mediaTrack.k && t60.f(this.l, mediaTrack.l);
    }

    public final int hashCode() {
        return q.b(Long.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, this.i, this.j, Integer.valueOf(this.k), this.l, String.valueOf(this.n));
    }

    public final String i() {
        return this.g;
    }

    public final String j() {
        return this.h;
    }

    public final long k() {
        return this.e;
    }

    public final String l() {
        return this.j;
    }

    public final String m() {
        return this.i;
    }

    public final List<String> n() {
        return this.l;
    }

    public final int o() {
        return this.k;
    }

    public final int p() {
        return this.f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[Catch:{ JSONException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[Catch:{ JSONException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[Catch:{ JSONException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ JSONException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076 A[Catch:{ JSONException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d A[Catch:{ JSONException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d A[Catch:{ JSONException -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject u() {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trackId"
            long r2 = r6.e     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0094 }
            int r1 = r6.f     // Catch:{ JSONException -> 0x0094 }
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "type"
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x0020
            if (r1 == r2) goto L_0x001a
            goto L_0x0026
        L_0x001a:
            java.lang.String r1 = "VIDEO"
        L_0x001c:
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0094 }
            goto L_0x0026
        L_0x0020:
            java.lang.String r1 = "AUDIO"
            goto L_0x001c
        L_0x0023:
            java.lang.String r1 = "TEXT"
            goto L_0x001c
        L_0x0026:
            java.lang.String r1 = r6.g     // Catch:{ JSONException -> 0x0094 }
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = "trackContentId"
            java.lang.String r5 = r6.g     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0094 }
        L_0x0031:
            java.lang.String r1 = r6.h     // Catch:{ JSONException -> 0x0094 }
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = "trackContentType"
            java.lang.String r5 = r6.h     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0094 }
        L_0x003c:
            java.lang.String r1 = r6.i     // Catch:{ JSONException -> 0x0094 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "name"
            java.lang.String r5 = r6.i     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0094 }
        L_0x0047:
            java.lang.String r1 = r6.j     // Catch:{ JSONException -> 0x0094 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0094 }
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "language"
            java.lang.String r5 = r6.j     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0094 }
        L_0x0056:
            int r1 = r6.k     // Catch:{ JSONException -> 0x0094 }
            java.lang.String r5 = "subtype"
            if (r1 == r4) goto L_0x0076
            if (r1 == r3) goto L_0x0073
            if (r1 == r2) goto L_0x0070
            r2 = 4
            if (r1 == r2) goto L_0x006d
            r2 = 5
            if (r1 == r2) goto L_0x0067
            goto L_0x0079
        L_0x0067:
            java.lang.String r1 = "METADATA"
        L_0x0069:
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0094 }
            goto L_0x0079
        L_0x006d:
            java.lang.String r1 = "CHAPTERS"
            goto L_0x0069
        L_0x0070:
            java.lang.String r1 = "DESCRIPTIONS"
            goto L_0x0069
        L_0x0073:
            java.lang.String r1 = "CAPTIONS"
            goto L_0x0069
        L_0x0076:
            java.lang.String r1 = "SUBTITLES"
            goto L_0x0069
        L_0x0079:
            java.util.List<java.lang.String> r1 = r6.l     // Catch:{ JSONException -> 0x0094 }
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "roles"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0094 }
            java.util.List<java.lang.String> r3 = r6.l     // Catch:{ JSONException -> 0x0094 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0094 }
        L_0x0089:
            org.json.JSONObject r1 = r6.n     // Catch:{ JSONException -> 0x0094 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "customData"
            org.json.JSONObject r2 = r6.n     // Catch:{ JSONException -> 0x0094 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0094 }
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaTrack.u():org.json.JSONObject");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.n;
        this.m = jSONObject == null ? null : jSONObject.toString();
        int a2 = o80.a(parcel);
        o80.o(parcel, 2, k());
        o80.l(parcel, 3, p());
        o80.s(parcel, 4, i(), false);
        o80.s(parcel, 5, j(), false);
        o80.s(parcel, 6, m(), false);
        o80.s(parcel, 7, l(), false);
        o80.l(parcel, 8, o());
        o80.u(parcel, 9, n(), false);
        o80.s(parcel, 10, this.m, false);
        o80.b(parcel, a2);
    }
}
