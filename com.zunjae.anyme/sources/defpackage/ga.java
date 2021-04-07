package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ga  reason: default package */
public class ga implements y9<jb, String> {
    private JSONObject e(cb cbVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", cbVar.a());
        return jSONObject;
    }

    private JSONObject f(db dbVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("application", e(dbVar.a()));
        jSONObject.put("versionName", dbVar.e());
        jSONObject.put("versionCode", dbVar.d());
        return jSONObject;
    }

    private JSONObject g(eb ebVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("udid", ebVar.l());
        jSONObject.put("name", ebVar.e());
        jSONObject.put("deviceType", ebVar.c());
        jSONObject.put("osVersion", ebVar.f());
        jSONObject.put("version", ebVar.m());
        jSONObject.put("build", ebVar.b());
        jSONObject.put("language", ebVar.d());
        jSONObject.put("timezone", ebVar.i());
        jSONObject.put("sdkType", ebVar.g());
        jSONObject.put("applicationToken", ebVar.a());
        jSONObject.put("sdkVersion", ebVar.h());
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.g(new java.util.Date());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0101 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.jb a(java.lang.String r18) {
        /*
            r17 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0166 }
            r2 = r18
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0166 }
            jb$a r2 = new jb$a     // Catch:{ JSONException -> 0x0166 }
            r2.<init>()     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r3 = "device"
            org.json.JSONObject r3 = r0.optJSONObject(r3)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r4 = "sdkType"
            java.lang.String r5 = "timezone"
            java.lang.String r6 = "language"
            java.lang.String r7 = "osVersion"
            if (r3 == 0) goto L_0x0088
            java.lang.String r8 = "udid"
            java.lang.String r8 = r3.getString(r8)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r9 = "name"
            java.lang.String r9 = r3.getString(r9)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r10 = "deviceType"
            java.lang.String r10 = r3.getString(r10)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r11 = r3.optString(r7)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r12 = "version"
            java.lang.String r12 = r3.optString(r12)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r13 = "build"
            java.lang.String r13 = r3.optString(r13)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r14 = r3.optString(r6)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r15 = r3.optString(r5)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = r3.optString(r4)     // Catch:{ JSONException -> 0x0166 }
            r18 = r6
            java.lang.String r6 = "applicationToken"
            java.lang.String r6 = r3.getString(r6)     // Catch:{ JSONException -> 0x0166 }
            r16 = r7
            java.lang.String r7 = "sdkVersion"
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x0166 }
            eb$b r7 = new eb$b     // Catch:{ JSONException -> 0x0166 }
            r7.<init>()     // Catch:{ JSONException -> 0x0166 }
            r7.n(r8)     // Catch:{ JSONException -> 0x0166 }
            r7.i(r9)     // Catch:{ JSONException -> 0x0166 }
            r7.g(r10)     // Catch:{ JSONException -> 0x0166 }
            r7.j(r11)     // Catch:{ JSONException -> 0x0166 }
            r7.o(r12)     // Catch:{ JSONException -> 0x0166 }
            r7.f(r13)     // Catch:{ JSONException -> 0x0166 }
            r7.h(r14)     // Catch:{ JSONException -> 0x0166 }
            r7.m(r15)     // Catch:{ JSONException -> 0x0166 }
            r7.k(r1)     // Catch:{ JSONException -> 0x0166 }
            r7.b(r6)     // Catch:{ JSONException -> 0x0166 }
            r7.l(r3)     // Catch:{ JSONException -> 0x0166 }
            eb r1 = r7.d()     // Catch:{ JSONException -> 0x0166 }
            r2.e(r1)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x008c
        L_0x0088:
            r18 = r6
            r16 = r7
        L_0x008c:
            java.lang.String r1 = "applicationVersion"
            org.json.JSONObject r1 = r0.optJSONObject(r1)     // Catch:{ JSONException -> 0x0166 }
            if (r1 == 0) goto L_0x00bc
            java.lang.String r3 = "versionName"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r6 = "versionCode"
            java.lang.String r6 = r1.getString(r6)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r7 = "application"
            org.json.JSONObject r1 = r1.optJSONObject(r7)     // Catch:{ JSONException -> 0x0166 }
            if (r1 == 0) goto L_0x00af
            java.lang.String r7 = "key"
            java.lang.String r1 = r1.getString(r7)     // Catch:{ JSONException -> 0x0166 }
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            cb r7 = new cb     // Catch:{ JSONException -> 0x0166 }
            r7.<init>(r1)     // Catch:{ JSONException -> 0x0166 }
            db r1 = defpackage.db.c(r7, r3, r6)     // Catch:{ JSONException -> 0x0166 }
            r2.d(r1)     // Catch:{ JSONException -> 0x0166 }
        L_0x00bc:
            java.lang.String r1 = "batteryLevel"
            double r6 = r0.optDouble(r1)     // Catch:{ JSONException -> 0x0166 }
            java.lang.Double r1 = java.lang.Double.valueOf(r6)     // Catch:{ JSONException -> 0x0166 }
            boolean r3 = r1.isNaN()     // Catch:{ JSONException -> 0x0166 }
            if (r3 == 0) goto L_0x00ce
            r1 = 0
            goto L_0x00da
        L_0x00ce:
            double r6 = r1.doubleValue()     // Catch:{ JSONException -> 0x0166 }
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r6)     // Catch:{ JSONException -> 0x0166 }
            float r1 = r1.floatValue()     // Catch:{ JSONException -> 0x0166 }
        L_0x00da:
            r2.a(r1)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "freeRam"
            long r6 = r0.optLong(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.c(r6)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "time"
            r3 = 0
            java.lang.String r1 = r0.optString(r1, r3)     // Catch:{ JSONException -> 0x0166 }
            if (r1 == 0) goto L_0x00fb
            mb r3 = defpackage.mb.b()     // Catch:{ ParseException -> 0x0101 }
            java.util.Date r1 = r3.parse(r1)     // Catch:{ ParseException -> 0x0101 }
        L_0x00f7:
            r2.g(r1)     // Catch:{ ParseException -> 0x0101 }
            goto L_0x0109
        L_0x00fb:
            java.util.Date r1 = new java.util.Date     // Catch:{ ParseException -> 0x0101 }
            r1.<init>()     // Catch:{ ParseException -> 0x0101 }
            goto L_0x00f7
        L_0x0101:
            java.util.Date r1 = new java.util.Date     // Catch:{ JSONException -> 0x0166 }
            r1.<init>()     // Catch:{ JSONException -> 0x0166 }
            r2.g(r1)     // Catch:{ JSONException -> 0x0166 }
        L_0x0109:
            java.lang.String r1 = r0.getString(r5)     // Catch:{ JSONException -> 0x0166 }
            r2.p(r1)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "totalRam"
            long r5 = r0.getLong(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.o(r5)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "ramUsed"
            long r5 = r0.getLong(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.k(r5)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "orientation"
            int r1 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.b(r1)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = r0.getString(r4)     // Catch:{ JSONException -> 0x0166 }
            r2.l(r1)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "localSessionId"
            long r3 = r0.getLong(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.i(r3)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "sessionId"
            long r3 = r0.getLong(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.m(r3)     // Catch:{ JSONException -> 0x0166 }
            r1 = r16
            java.lang.String r1 = r0.optString(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.j(r1)     // Catch:{ JSONException -> 0x0166 }
            r1 = r18
            java.lang.String r1 = r0.optString(r1)     // Catch:{ JSONException -> 0x0166 }
            r2.f(r1)     // Catch:{ JSONException -> 0x0166 }
            java.lang.String r1 = "sessionIdentifier"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ JSONException -> 0x0166 }
            if (r0 == 0) goto L_0x0161
            r2.n(r0)     // Catch:{ JSONException -> 0x0166 }
        L_0x0161:
            jb r0 = r2.h()     // Catch:{ JSONException -> 0x0166 }
            return r0
        L_0x0166:
            r0 = move-exception
            r0.printStackTrace()
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga.a(java.lang.String):jb");
    }

    /* renamed from: d */
    public String b(jb jbVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device", g(jbVar.d()));
            jSONObject.put("applicationVersion", f(jbVar.a()));
            jSONObject.put("batteryLevel", (double) jbVar.c());
            jSONObject.put("freeRam", jbVar.e());
            jSONObject.put("time", mb.b().format(jbVar.n()));
            jSONObject.put("osVersion", jbVar.i());
            jSONObject.put("language", jbVar.f());
            jSONObject.put("timezone", jbVar.o());
            jSONObject.put("totalRam", jbVar.p());
            jSONObject.put("ramUsed", jbVar.j());
            jSONObject.put("orientation", jbVar.h());
            jSONObject.put("sdkType", jbVar.k());
            jSONObject.put("localSessionId", jbVar.g());
            jSONObject.put("sessionId", jbVar.l());
            jSONObject.put("sessionIdentifier", jbVar.m());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
