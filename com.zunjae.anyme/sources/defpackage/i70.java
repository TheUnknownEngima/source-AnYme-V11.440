package defpackage;

import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.a;
import com.google.android.gms.cast.c;
import com.google.android.gms.cast.k;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.q;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i70  reason: default package */
public final class i70 extends s70 {
    public static final String B = t60.k("com.google.cast.media");
    private final n70 A = new n70(86400000);
    private long e;
    private q f;
    /* access modifiers changed from: private */
    public Long g;
    private k70 h;
    private final n70 i = new n70(86400000);
    private final n70 j = new n70(86400000);
    private final n70 k = new n70(86400000);
    private final n70 l = new n70(86400000);
    private final n70 m = new n70(10000);
    private final n70 n = new n70(86400000);
    private final n70 o = new n70(86400000);
    private final n70 p = new n70(86400000);
    private final n70 q = new n70(86400000);
    private final n70 r = new n70(86400000);
    private final n70 s = new n70(86400000);
    private final n70 t = new n70(86400000);
    private final n70 u = new n70(86400000);
    private final n70 v = new n70(86400000);
    private final n70 w = new n70(86400000);
    private final n70 x = new n70(86400000);
    private final n70 y = new n70(86400000);
    private final n70 z = new n70(86400000);

    public i70(String str) {
        super(B, "MediaControlChannel", (String) null);
        g(this.i);
        g(this.j);
        g(this.k);
        g(this.l);
        g(this.m);
        g(this.n);
        g(this.o);
        g(this.p);
        g(this.q);
        g(this.r);
        g(this.s);
        g(this.t);
        g(this.u);
        g(this.v);
        g(this.w);
        g(this.y);
        g(this.y);
        g(this.z);
        g(this.A);
        H();
    }

    private static int[] G(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            iArr[i2] = jSONArray.getInt(i2);
        }
        return iArr;
    }

    private final void H() {
        this.e = 0;
        this.f = null;
        for (n70 e2 : h()) {
            e2.e(2002);
        }
    }

    private static m70 I(JSONObject jSONObject) {
        MediaError m2 = MediaError.m(jSONObject);
        m70 m70 = new m70();
        m70.a = jSONObject.optJSONObject("customData");
        m70.b = m2;
        return m70;
    }

    private final long J() {
        q qVar = this.f;
        if (qVar != null) {
            return qVar.y0();
        }
        throw new j70();
    }

    private final void p() {
        k70 k70 = this.h;
        if (k70 != null) {
            k70.a();
        }
    }

    private final void q() {
        k70 k70 = this.h;
        if (k70 != null) {
            k70.c();
        }
    }

    private final void r() {
        k70 k70 = this.h;
        if (k70 != null) {
            k70.b();
        }
    }

    private final void s() {
        k70 k70 = this.h;
        if (k70 != null) {
            k70.d();
        }
    }

    private final long t(double d, long j2, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j2;
        }
        long j4 = j2 + ((long) (((double) elapsedRealtime) * d));
        if (j3 > 0 && j4 > j3) {
            return j3;
        }
        if (j4 < 0) {
            return 0;
        }
        return j4;
    }

    public final void B(k70 k70) {
        this.h = k70;
    }

    public final long C(o70 o70) {
        JSONObject jSONObject = new JSONObject();
        long f2 = f();
        try {
            jSONObject.put("requestId", f2);
            jSONObject.put("type", "GET_STATUS");
            if (this.f != null) {
                jSONObject.put("mediaSessionId", this.f.y0());
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), f2, (String) null);
        this.p.c(f2, o70);
        return f2;
    }

    public final void D(long j2, int i2) {
        for (n70 f2 : h()) {
            f2.f(j2, i2, (Object) null);
        }
    }

    public final long E(o70 o70) {
        JSONObject jSONObject = new JSONObject();
        long f2 = f();
        try {
            jSONObject.put("requestId", f2);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", J());
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), f2, (String) null);
        this.w.c(f2, o70);
        return f2;
    }

    public final long F(o70 o70, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long f2 = f();
        try {
            jSONObject2.put("requestId", f2);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", J());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), f2, (String) null);
        this.k.c(f2, o70);
        return f2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0244 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0251 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x025e A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0268 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x026f A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0276 A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027d A[Catch:{ JSONException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0290 A[Catch:{ JSONException -> 0x02c1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.lang.String r14) {
        /*
            r13 = this;
            u60 r0 = r13.a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r14
            java.lang.String r4 = "message received: %s"
            r0.a(r4, r2)
            r0 = 2
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02c1 }
            r2.<init>(r14)     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r5 = "requestId"
            r6 = -1
            long r5 = r2.optLong(r5, r6)     // Catch:{ JSONException -> 0x02c1 }
            int r7 = r4.hashCode()     // Catch:{ JSONException -> 0x02c1 }
            r8 = -1
            r9 = 4
            r10 = 3
            switch(r7) {
                case -1830647528: goto L_0x007d;
                case -1790231854: goto L_0x0072;
                case -1125000185: goto L_0x0068;
                case -262628938: goto L_0x005e;
                case 66247144: goto L_0x0054;
                case 154411710: goto L_0x004a;
                case 431600379: goto L_0x0040;
                case 823510221: goto L_0x0036;
                case 2107149050: goto L_0x002c;
                default: goto L_0x002b;
            }     // Catch:{ JSONException -> 0x02c1 }
        L_0x002b:
            goto L_0x0087
        L_0x002c:
            java.lang.String r7 = "QUEUE_ITEM_IDS"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 6
            goto L_0x0088
        L_0x0036:
            java.lang.String r7 = "MEDIA_STATUS"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 0
            goto L_0x0088
        L_0x0040:
            java.lang.String r7 = "INVALID_PLAYER_STATE"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 1
            goto L_0x0088
        L_0x004a:
            java.lang.String r7 = "QUEUE_CHANGE"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 7
            goto L_0x0088
        L_0x0054:
            java.lang.String r7 = "ERROR"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 5
            goto L_0x0088
        L_0x005e:
            java.lang.String r7 = "LOAD_FAILED"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 2
            goto L_0x0088
        L_0x0068:
            java.lang.String r7 = "INVALID_REQUEST"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 4
            goto L_0x0088
        L_0x0072:
            java.lang.String r7 = "QUEUE_ITEMS"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 8
            goto L_0x0088
        L_0x007d:
            java.lang.String r7 = "LOAD_CANCELLED"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0087
            r4 = 3
            goto L_0x0088
        L_0x0087:
            r4 = -1
        L_0x0088:
            java.lang.String r7 = "itemIds"
            r11 = 2100(0x834, float:2.943E-42)
            r12 = 0
            switch(r4) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x01bf;
                case 2: goto L_0x01b5;
                case 3: goto L_0x01a9;
                case 4: goto L_0x0183;
                case 5: goto L_0x0159;
                case 6: goto L_0x0140;
                case 7: goto L_0x00c7;
                case 8: goto L_0x0092;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x02c0
        L_0x0092:
            n70 r4 = r13.x     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r3, r12)     // Catch:{ JSONException -> 0x02c1 }
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x02c0
            java.lang.String r4 = "items"
            org.json.JSONArray r2 = r2.getJSONArray(r4)     // Catch:{ JSONException -> 0x02c1 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x02c1 }
            com.google.android.gms.cast.o[] r4 = new com.google.android.gms.cast.o[r4]     // Catch:{ JSONException -> 0x02c1 }
            r5 = 0
        L_0x00a8:
            int r6 = r2.length()     // Catch:{ JSONException -> 0x02c1 }
            if (r5 >= r6) goto L_0x00c0
            com.google.android.gms.cast.o$a r6 = new com.google.android.gms.cast.o$a     // Catch:{ JSONException -> 0x02c1 }
            org.json.JSONObject r7 = r2.getJSONObject(r5)     // Catch:{ JSONException -> 0x02c1 }
            r6.<init>((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x02c1 }
            com.google.android.gms.cast.o r6 = r6.a()     // Catch:{ JSONException -> 0x02c1 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x02c1 }
            int r5 = r5 + 1
            goto L_0x00a8
        L_0x00c0:
            k70 r2 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r2.k(r4)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x02c0
        L_0x00c7:
            n70 r4 = r13.y     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r3, r12)     // Catch:{ JSONException -> 0x02c1 }
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x013f
            java.lang.String r4 = "changeType"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x02c1 }
            org.json.JSONArray r5 = r2.getJSONArray(r7)     // Catch:{ JSONException -> 0x02c1 }
            int[] r5 = G(r5)     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r6 = "insertBefore"
            int r2 = r2.optInt(r6, r3)     // Catch:{ JSONException -> 0x02c1 }
            if (r5 == 0) goto L_0x013f
            int r6 = r4.hashCode()     // Catch:{ JSONException -> 0x02c1 }
            switch(r6) {
                case -2130463047: goto L_0x0116;
                case -1881281404: goto L_0x010c;
                case -1785516855: goto L_0x0102;
                case 1122976047: goto L_0x00f8;
                case 1395699694: goto L_0x00ee;
                default: goto L_0x00ed;
            }     // Catch:{ JSONException -> 0x02c1 }
        L_0x00ed:
            goto L_0x011f
        L_0x00ee:
            java.lang.String r6 = "NO_CHANGE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x011f
            r8 = 4
            goto L_0x011f
        L_0x00f8:
            java.lang.String r6 = "ITEMS_CHANGE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x011f
            r8 = 1
            goto L_0x011f
        L_0x0102:
            java.lang.String r6 = "UPDATE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x011f
            r8 = 3
            goto L_0x011f
        L_0x010c:
            java.lang.String r6 = "REMOVE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x011f
            r8 = 2
            goto L_0x011f
        L_0x0116:
            java.lang.String r6 = "INSERT"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x011f
            r8 = 0
        L_0x011f:
            if (r8 == 0) goto L_0x013a
            if (r8 == r1) goto L_0x0134
            if (r8 == r0) goto L_0x012e
            if (r8 == r10) goto L_0x0128
            goto L_0x013f
        L_0x0128:
            k70 r2 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r2.h(r5)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x012e:
            k70 r2 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r2.g(r5)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x0134:
            k70 r2 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r2.i(r5)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x013a:
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r2)     // Catch:{ JSONException -> 0x02c1 }
        L_0x013f:
            return
        L_0x0140:
            n70 r4 = r13.w     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r3, r12)     // Catch:{ JSONException -> 0x02c1 }
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0158
            org.json.JSONArray r2 = r2.getJSONArray(r7)     // Catch:{ JSONException -> 0x02c1 }
            int[] r2 = G(r2)     // Catch:{ JSONException -> 0x02c1 }
            if (r2 == 0) goto L_0x0158
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r4.h(r2)     // Catch:{ JSONException -> 0x02c1 }
        L_0x0158:
            return
        L_0x0159:
            java.util.List r4 = r13.h()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x0161:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x0175
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x02c1 }
            n70 r7 = (defpackage.n70) r7     // Catch:{ JSONException -> 0x02c1 }
            m70 r8 = I(r2)     // Catch:{ JSONException -> 0x02c1 }
            r7.f(r5, r11, r8)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x0161
        L_0x0175:
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x0182
            com.google.android.gms.cast.MediaError r2 = com.google.android.gms.cast.MediaError.m(r2)     // Catch:{ JSONException -> 0x02c1 }
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r4.j(r2)     // Catch:{ JSONException -> 0x02c1 }
        L_0x0182:
            return
        L_0x0183:
            u60 r4 = r13.a     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r7 = "received unexpected error: Invalid Request."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x02c1 }
            r4.g(r7, r8)     // Catch:{ JSONException -> 0x02c1 }
            java.util.List r4 = r13.h()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x0194:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x01a8
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x02c1 }
            n70 r7 = (defpackage.n70) r7     // Catch:{ JSONException -> 0x02c1 }
            m70 r8 = I(r2)     // Catch:{ JSONException -> 0x02c1 }
            r7.f(r5, r11, r8)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x0194
        L_0x01a8:
            return
        L_0x01a9:
            n70 r4 = r13.i     // Catch:{ JSONException -> 0x02c1 }
            r7 = 2101(0x835, float:2.944E-42)
            m70 r2 = I(r2)     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r7, r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x01b5:
            n70 r4 = r13.i     // Catch:{ JSONException -> 0x02c1 }
            m70 r2 = I(r2)     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r11, r2)     // Catch:{ JSONException -> 0x02c1 }
            return
        L_0x01bf:
            u60 r4 = r13.a     // Catch:{ JSONException -> 0x02c1 }
            java.lang.String r7 = "received unexpected error: Invalid Player State."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x02c1 }
            r4.g(r7, r8)     // Catch:{ JSONException -> 0x02c1 }
            java.util.List r4 = r13.h()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x01d0:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x01e4
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x02c1 }
            n70 r7 = (defpackage.n70) r7     // Catch:{ JSONException -> 0x02c1 }
            m70 r8 = I(r2)     // Catch:{ JSONException -> 0x02c1 }
            r7.f(r5, r11, r8)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x01d0
        L_0x01e4:
            return
        L_0x01e5:
            java.lang.String r4 = "status"
            org.json.JSONArray r2 = r2.getJSONArray(r4)     // Catch:{ JSONException -> 0x02c1 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x02c1 }
            if (r4 <= 0) goto L_0x029a
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ JSONException -> 0x02c1 }
            n70 r4 = r13.i     // Catch:{ JSONException -> 0x02c1 }
            boolean r4 = r4.a(r5)     // Catch:{ JSONException -> 0x02c1 }
            n70 r7 = r13.n     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.g()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x020b
            n70 r7 = r13.n     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.a(r5)     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x021b
        L_0x020b:
            n70 r7 = r13.o     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.g()     // Catch:{ JSONException -> 0x02c1 }
            if (r7 == 0) goto L_0x021d
            n70 r7 = r13.o     // Catch:{ JSONException -> 0x02c1 }
            boolean r7 = r7.a(r5)     // Catch:{ JSONException -> 0x02c1 }
            if (r7 != 0) goto L_0x021d
        L_0x021b:
            r7 = 1
            goto L_0x021e
        L_0x021d:
            r7 = 0
        L_0x021e:
            if (r7 == 0) goto L_0x0222
            r7 = 1
            goto L_0x0223
        L_0x0222:
            r7 = 0
        L_0x0223:
            if (r4 != 0) goto L_0x0231
            com.google.android.gms.cast.q r4 = r13.f     // Catch:{ JSONException -> 0x02c1 }
            if (r4 != 0) goto L_0x022a
            goto L_0x0231
        L_0x022a:
            com.google.android.gms.cast.q r4 = r13.f     // Catch:{ JSONException -> 0x02c1 }
            int r2 = r4.m0(r2, r7)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x0240
        L_0x0231:
            com.google.android.gms.cast.q r4 = new com.google.android.gms.cast.q     // Catch:{ JSONException -> 0x02c1 }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x02c1 }
            r13.f = r4     // Catch:{ JSONException -> 0x02c1 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r13.e = r7     // Catch:{ JSONException -> 0x02c1 }
            r2 = 127(0x7f, float:1.78E-43)
        L_0x0240:
            r4 = r2 & 1
            if (r4 == 0) goto L_0x024d
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r13.e = r7     // Catch:{ JSONException -> 0x02c1 }
            r13.s()     // Catch:{ JSONException -> 0x02c1 }
        L_0x024d:
            r4 = r2 & 2
            if (r4 == 0) goto L_0x025a
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r13.e = r7     // Catch:{ JSONException -> 0x02c1 }
            r13.s()     // Catch:{ JSONException -> 0x02c1 }
        L_0x025a:
            r4 = r2 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0264
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r13.e = r7     // Catch:{ JSONException -> 0x02c1 }
        L_0x0264:
            r4 = r2 & 4
            if (r4 == 0) goto L_0x026b
            r13.p()     // Catch:{ JSONException -> 0x02c1 }
        L_0x026b:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x0272
            r13.r()     // Catch:{ JSONException -> 0x02c1 }
        L_0x0272:
            r4 = r2 & 16
            if (r4 == 0) goto L_0x0279
            r13.q()     // Catch:{ JSONException -> 0x02c1 }
        L_0x0279:
            r4 = r2 & 32
            if (r4 == 0) goto L_0x028c
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r13.e = r7     // Catch:{ JSONException -> 0x02c1 }
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x028c
            k70 r4 = r13.h     // Catch:{ JSONException -> 0x02c1 }
            r4.e()     // Catch:{ JSONException -> 0x02c1 }
        L_0x028c:
            r2 = r2 & 64
            if (r2 == 0) goto L_0x02a8
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x02c1 }
            r13.e = r7     // Catch:{ JSONException -> 0x02c1 }
            r13.s()     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x02a8
        L_0x029a:
            r13.f = r12     // Catch:{ JSONException -> 0x02c1 }
            r13.s()     // Catch:{ JSONException -> 0x02c1 }
            r13.p()     // Catch:{ JSONException -> 0x02c1 }
            r13.r()     // Catch:{ JSONException -> 0x02c1 }
            r13.q()     // Catch:{ JSONException -> 0x02c1 }
        L_0x02a8:
            java.util.List r2 = r13.h()     // Catch:{ JSONException -> 0x02c1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x02c1 }
        L_0x02b0:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x02c1 }
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x02c1 }
            n70 r4 = (defpackage.n70) r4     // Catch:{ JSONException -> 0x02c1 }
            r4.f(r5, r3, r12)     // Catch:{ JSONException -> 0x02c1 }
            goto L_0x02b0
        L_0x02c0:
            return
        L_0x02c1:
            r2 = move-exception
            u60 r4 = r13.a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.getMessage()
            r0[r3] = r2
            r0[r1] = r14
            java.lang.String r14 = "Message is malformed (%s); ignoring: %s"
            r4.g(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i70.K(java.lang.String):void");
    }

    public final void e() {
        super.e();
        H();
    }

    public final long i() {
        q qVar;
        c j2;
        a k2;
        if (this.e == 0 || (qVar = this.f) == null || (j2 = qVar.j()) == null || (k2 = this.f.k()) == null) {
            return 0;
        }
        double z2 = this.f.z();
        double d = Utils.DOUBLE_EPSILON;
        if (z2 == Utils.DOUBLE_EPSILON && this.f.D() == 2) {
            d = 1.0d;
        }
        return t(d, j2.k(), k2.l());
    }

    public final long j() {
        k p2;
        q qVar = this.f;
        if (qVar == null || (p2 = qVar.p()) == null) {
            return 0;
        }
        long i2 = p2.i();
        return !p2.k() ? t(1.0d, i2, -1) : i2;
    }

    public final long k() {
        k p2;
        q qVar = this.f;
        if (qVar == null || (p2 = qVar.p()) == null) {
            return 0;
        }
        long j2 = p2.j();
        if (p2.l()) {
            j2 = t(1.0d, j2, -1);
        }
        return p2.k() ? Math.min(j2, p2.i()) : j2;
    }

    public final long l() {
        MediaInfo m2 = m();
        if (m2 == null) {
            return 0;
        }
        Long l2 = this.g;
        if (l2 != null) {
            if (l2.equals(4294967296000L)) {
                if (this.f.p() != null) {
                    return Math.min(l2.longValue(), j());
                }
                if (o() >= 0) {
                    return Math.min(l2.longValue(), o());
                }
            }
            return l2.longValue();
        } else if (this.e == 0) {
            return 0;
        } else {
            double z2 = this.f.z();
            long Q = this.f.Q();
            int D = this.f.D();
            if (z2 == Utils.DOUBLE_EPSILON || D != 2) {
                return Q;
            }
            return t(z2, Q, m2.y());
        }
    }

    public final MediaInfo m() {
        q qVar = this.f;
        if (qVar == null) {
            return null;
        }
        return qVar.y();
    }

    public final q n() {
        return this.f;
    }

    public final long o() {
        MediaInfo m2 = m();
        if (m2 != null) {
            return m2.y();
        }
        return 0;
    }

    public final long u(o70 o70) {
        JSONObject jSONObject = new JSONObject();
        long f2 = f();
        try {
            jSONObject.put("requestId", f2);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", J());
        } catch (JSONException e2) {
            this.a.g(String.format(Locale.ROOT, "Error creating SkipAd message: %s", new Object[]{e2.getMessage()}), new Object[0]);
        }
        d(jSONObject.toString(), f2, (String) null);
        this.A.c(f2, o70);
        return f2;
    }

    public final long v(o70 o70, int i2, long j2, o[] oVarArr, int i3, Integer num, JSONObject jSONObject) {
        int i4 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i4 == 0 || j2 >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long f2 = f();
            try {
                jSONObject2.put("requestId", f2);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", J());
                if (i2 != 0) {
                    jSONObject2.put("currentItemId", i2);
                }
                if (i3 != 0) {
                    jSONObject2.put("jump", i3);
                }
                if (oVarArr != null && oVarArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i5 = 0; i5 < oVarArr.length; i5++) {
                        jSONArray.put(i5, oVarArr[i5].u());
                    }
                    jSONObject2.put("items", jSONArray);
                }
                String b = v60.b(num);
                if (b != null) {
                    jSONObject2.put("repeatMode", b);
                }
                if (i4 != 0) {
                    jSONObject2.put("currentTime", t60.b(j2));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException unused) {
            }
            d(jSONObject2.toString(), f2, (String) null);
            this.t.c(f2, o70);
            return f2;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("playPosition cannot be negative: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A[Catch:{ JSONException -> 0x005f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long w(defpackage.o70 r9, com.google.android.gms.cast.p r10) {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = r8.f()
            boolean r3 = r10.d()
            if (r3 == 0) goto L_0x0015
            r3 = 4294967296000(0x3e800000000, double:2.1219957909653E-311)
            goto L_0x0019
        L_0x0015:
            long r3 = r10.b()
        L_0x0019:
            java.lang.String r5 = "requestId"
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r5 = "type"
            java.lang.String r6 = "SEEK"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r5 = "mediaSessionId"
            long r6 = r8.J()     // Catch:{ JSONException -> 0x005f }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r5 = "currentTime"
            double r6 = defpackage.t60.b(r3)     // Catch:{ JSONException -> 0x005f }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x005f }
            int r5 = r10.c()     // Catch:{ JSONException -> 0x005f }
            r6 = 1
            java.lang.String r7 = "resumeState"
            if (r5 != r6) goto L_0x0046
            java.lang.String r5 = "PLAYBACK_START"
        L_0x0042:
            r0.put(r7, r5)     // Catch:{ JSONException -> 0x005f }
            goto L_0x0050
        L_0x0046:
            int r5 = r10.c()     // Catch:{ JSONException -> 0x005f }
            r6 = 2
            if (r5 != r6) goto L_0x0050
            java.lang.String r5 = "PLAYBACK_PAUSE"
            goto L_0x0042
        L_0x0050:
            org.json.JSONObject r5 = r10.a()     // Catch:{ JSONException -> 0x005f }
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = "customData"
            org.json.JSONObject r10 = r10.a()     // Catch:{ JSONException -> 0x005f }
            r0.put(r5, r10)     // Catch:{ JSONException -> 0x005f }
        L_0x005f:
            java.lang.String r10 = r0.toString()
            r0 = 0
            r8.d(r10, r1, r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r8.g = r10
            n70 r10 = r8.m
            h70 r0 = new h70
            r0.<init>(r8, r9)
            r10.c(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i70.w(o70, com.google.android.gms.cast.p):long");
    }

    public final long x(o70 o70, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long f2 = f();
        try {
            jSONObject2.put("requestId", f2);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", J());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), f2, (String) null);
        this.j.c(f2, o70);
        return f2;
    }

    public final long y(o70 o70, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long f2 = f();
        try {
            jSONObject.put("requestId", f2);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", J());
            JSONArray jSONArray = new JSONArray();
            for (int put : iArr) {
                jSONArray.put(put);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), f2, (String) null);
        this.x.c(f2, o70);
        return f2;
    }

    public final long z(o70 o70, long[] jArr) {
        if (jArr != null) {
            JSONObject jSONObject = new JSONObject();
            long f2 = f();
            try {
                jSONObject.put("requestId", f2);
                jSONObject.put("type", "EDIT_TRACKS_INFO");
                jSONObject.put("mediaSessionId", J());
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jSONArray.put(i2, jArr[i2]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            } catch (JSONException unused) {
            }
            d(jSONObject.toString(), f2, (String) null);
            this.q.c(f2, o70);
            return f2;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }
}
