package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends m80 {
    public static final Parcelable.Creator<r> CREATOR = new p1();
    private float e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;
    private int n;
    private int o;
    private String p;
    private JSONObject q;

    public r() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, (String) null, -1, -1, (String) null);
    }

    r(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2) {
        this.e = f2;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = str;
        this.n = i9;
        this.o = i10;
        this.p = str2;
        if (str2 != null) {
            try {
                this.q = new JSONObject(this.p);
            } catch (JSONException unused) {
                this.q = null;
                this.p = null;
            }
        } else {
            this.q = null;
        }
    }

    private static int F(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    private static String J(int i2) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Integer.valueOf(Color.alpha(i2))});
    }

    public final int D() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0.put("fontGenericFamily", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject E() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "fontScale"
            float r2 = r8.e     // Catch:{ JSONException -> 0x00e7 }
            double r2 = (double) r2     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
            int r1 = r8.f     // Catch:{ JSONException -> 0x00e7 }
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = "foregroundColor"
            int r2 = r8.f     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r2 = J(r2)     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x001c:
            int r1 = r8.g     // Catch:{ JSONException -> 0x00e7 }
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "backgroundColor"
            int r2 = r8.g     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r2 = J(r2)     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x002b:
            int r1 = r8.h     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r2 = "NONE"
            r3 = 3
            r4 = 1
            r5 = 2
            java.lang.String r6 = "edgeType"
            if (r1 == 0) goto L_0x004f
            if (r1 == r4) goto L_0x004c
            if (r1 == r5) goto L_0x0049
            if (r1 == r3) goto L_0x0046
            r7 = 4
            if (r1 == r7) goto L_0x0040
            goto L_0x0052
        L_0x0040:
            java.lang.String r1 = "DEPRESSED"
        L_0x0042:
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x0052
        L_0x0046:
            java.lang.String r1 = "RAISED"
            goto L_0x0042
        L_0x0049:
            java.lang.String r1 = "DROP_SHADOW"
            goto L_0x0042
        L_0x004c:
            java.lang.String r1 = "OUTLINE"
            goto L_0x0042
        L_0x004f:
            r0.put(r6, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x0052:
            int r1 = r8.i     // Catch:{ JSONException -> 0x00e7 }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = "edgeColor"
            int r6 = r8.i     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r6 = J(r6)     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x00e7 }
        L_0x0061:
            int r1 = r8.j     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r6 = "NORMAL"
            java.lang.String r7 = "windowType"
            if (r1 == 0) goto L_0x0078
            if (r1 == r4) goto L_0x0074
            if (r1 == r5) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            java.lang.String r1 = "ROUNDED_CORNERS"
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x007b
        L_0x0074:
            r0.put(r7, r6)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x007b
        L_0x0078:
            r0.put(r7, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x007b:
            int r1 = r8.k     // Catch:{ JSONException -> 0x00e7 }
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = "windowColor"
            int r2 = r8.k     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r2 = J(r2)     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x008a:
            int r1 = r8.j     // Catch:{ JSONException -> 0x00e7 }
            if (r1 != r5) goto L_0x0095
            java.lang.String r1 = "windowRoundedCornerRadius"
            int r2 = r8.l     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x0095:
            java.lang.String r1 = r8.m     // Catch:{ JSONException -> 0x00e7 }
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = "fontFamily"
            java.lang.String r2 = r8.m     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x00a0:
            int r1 = r8.n     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r2 = "fontGenericFamily"
            switch(r1) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a8;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x00c0
        L_0x00a8:
            java.lang.String r1 = "SMALL_CAPITALS"
        L_0x00aa:
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x00c0
        L_0x00ae:
            java.lang.String r1 = "CURSIVE"
            goto L_0x00aa
        L_0x00b1:
            java.lang.String r1 = "CASUAL"
            goto L_0x00aa
        L_0x00b4:
            java.lang.String r1 = "MONOSPACED_SERIF"
            goto L_0x00aa
        L_0x00b7:
            java.lang.String r1 = "SERIF"
            goto L_0x00aa
        L_0x00ba:
            java.lang.String r1 = "MONOSPACED_SANS_SERIF"
            goto L_0x00aa
        L_0x00bd:
            java.lang.String r1 = "SANS_SERIF"
            goto L_0x00aa
        L_0x00c0:
            int r1 = r8.o     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r2 = "fontStyle"
            if (r1 == 0) goto L_0x00d9
            if (r1 == r4) goto L_0x00d6
            if (r1 == r5) goto L_0x00d3
            if (r1 == r3) goto L_0x00cd
            goto L_0x00dc
        L_0x00cd:
            java.lang.String r1 = "BOLD_ITALIC"
        L_0x00cf:
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x00dc
        L_0x00d3:
            java.lang.String r1 = "ITALIC"
            goto L_0x00cf
        L_0x00d6:
            java.lang.String r1 = "BOLD"
            goto L_0x00cf
        L_0x00d9:
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x00e7 }
        L_0x00dc:
            org.json.JSONObject r1 = r8.q     // Catch:{ JSONException -> 0x00e7 }
            if (r1 == 0) goto L_0x00e7
            java.lang.String r1 = "customData"
            org.json.JSONObject r2 = r8.q     // Catch:{ JSONException -> 0x00e7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00e7 }
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.r.E():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if ((this.q == null) != (rVar.q == null)) {
            return false;
        }
        JSONObject jSONObject2 = this.q;
        return (jSONObject2 == null || (jSONObject = rVar.q) == null || l.a(jSONObject2, jSONObject)) && this.e == rVar.e && this.f == rVar.f && this.g == rVar.g && this.h == rVar.h && this.i == rVar.i && this.j == rVar.j && this.l == rVar.l && t60.f(this.m, rVar.m) && this.n == rVar.n && this.o == rVar.o;
    }

    public final int hashCode() {
        return q.b(Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), this.m, Integer.valueOf(this.n), Integer.valueOf(this.o), String.valueOf(this.q));
    }

    public final void i(JSONObject jSONObject) {
        int i2;
        this.e = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f = F(jSONObject.optString("foregroundColor"));
        this.g = F(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.h = 0;
            } else if ("OUTLINE".equals(string)) {
                this.h = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.h = 2;
            } else if ("RAISED".equals(string)) {
                this.h = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.h = 4;
            }
        }
        this.i = F(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.j = 0;
            } else if ("NORMAL".equals(string2)) {
                this.j = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.j = 2;
            }
        }
        this.k = F(jSONObject.optString("windowColor"));
        if (this.j == 2) {
            this.l = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.m = jSONObject.optString("fontFamily", (String) null);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.n = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.n = 1;
            } else if ("SERIF".equals(string3)) {
                this.n = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.n = 3;
            } else if ("CASUAL".equals(string3)) {
                this.n = 4;
            } else {
                if ("CURSIVE".equals(string3)) {
                    i2 = 5;
                } else if ("SMALL_CAPITALS".equals(string3)) {
                    i2 = 6;
                }
                this.n = i2;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.o = 0;
            } else if ("BOLD".equals(string4)) {
                this.o = 1;
            } else if ("ITALIC".equals(string4)) {
                this.o = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.o = 3;
            }
        }
        this.q = jSONObject.optJSONObject("customData");
    }

    public final int j() {
        return this.g;
    }

    public final int k() {
        return this.i;
    }

    public final int l() {
        return this.h;
    }

    public final String m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final float o() {
        return this.e;
    }

    public final int p() {
        return this.o;
    }

    public final int u() {
        return this.f;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.q;
        this.p = jSONObject == null ? null : jSONObject.toString();
        int a = o80.a(parcel);
        o80.i(parcel, 2, o());
        o80.l(parcel, 3, u());
        o80.l(parcel, 4, j());
        o80.l(parcel, 5, l());
        o80.l(parcel, 6, k());
        o80.l(parcel, 7, D());
        o80.l(parcel, 8, y());
        o80.l(parcel, 9, z());
        o80.s(parcel, 10, m(), false);
        o80.l(parcel, 11, n());
        o80.l(parcel, 12, p());
        o80.s(parcel, 13, this.p, false);
        o80.b(parcel, a);
    }

    public final int y() {
        return this.k;
    }

    public final int z() {
        return this.l;
    }
}
