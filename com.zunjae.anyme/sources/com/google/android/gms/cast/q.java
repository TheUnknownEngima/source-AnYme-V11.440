package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class q extends m80 {
    public static final Parcelable.Creator<q> CREATOR = new l1();
    private final SparseArray<Integer> A;
    private final a B;
    MediaInfo e;
    private long f;
    int g;
    double h;
    int i;
    int j;
    long k;
    long l;
    double m;
    boolean n;
    long[] o;
    int p;
    int q;
    String r;
    JSONObject s;
    int t;
    private final List<o> u;
    boolean v;
    c w;
    t x;
    k y;
    n z;

    public class a {
        public a() {
        }

        public void a(boolean z) {
            q.this.v = z;
        }
    }

    static {
        new u60("MediaStatus");
    }

    public q(MediaInfo mediaInfo, long j2, int i2, double d, int i3, int i4, long j3, long j4, double d2, boolean z2, long[] jArr, int i5, int i6, String str, int i7, List<o> list, boolean z3, c cVar, t tVar, k kVar, n nVar) {
        String str2 = str;
        List<o> list2 = list;
        this.u = new ArrayList();
        this.A = new SparseArray<>();
        this.B = new a();
        this.e = mediaInfo;
        this.f = j2;
        this.g = i2;
        this.h = d;
        this.i = i3;
        this.j = i4;
        this.k = j3;
        this.l = j4;
        this.m = d2;
        this.n = z2;
        this.o = jArr;
        this.p = i5;
        this.q = i6;
        this.r = str2;
        if (str2 != null) {
            try {
                this.s = new JSONObject(this.r);
            } catch (JSONException unused) {
                this.s = null;
                this.r = null;
            }
        } else {
            this.s = null;
        }
        this.t = i7;
        if (list2 != null && !list.isEmpty()) {
            q0(list2);
        }
        this.v = z3;
        this.w = cVar;
        this.x = tVar;
        this.y = kVar;
        this.z = nVar;
    }

    public q(JSONObject jSONObject) {
        this((MediaInfo) null, 0, 0, Utils.DOUBLE_EPSILON, 0, 0, 0, 0, Utils.DOUBLE_EPSILON, false, (long[]) null, 0, 0, (String) null, 0, (List<o>) null, false, (c) null, (t) null, (k) null, (n) null);
        m0(jSONObject, 0);
    }

    private static boolean o0(int i2, int i3, int i4, int i5) {
        if (i2 != 1) {
            return false;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return i5 != 2;
            }
            if (i3 != 3) {
                return true;
            }
        }
        return i4 == 0;
    }

    private final void q0(List<o> list) {
        this.u.clear();
        this.A.clear();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                o oVar = list.get(i2);
                this.u.add(oVar);
                this.A.put(oVar.l(), Integer.valueOf(i2));
            }
        }
    }

    private static JSONObject r0(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject == null) {
            return jSONObject;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
            Iterator<String> keys2 = optJSONObject.keys();
            while (keys2.hasNext()) {
                String next = keys2.next();
                jSONObject2.put(next, optJSONObject.get(next));
            }
            jSONObject2.remove("extendedStatus");
            return jSONObject2;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    public final boolean A0() {
        MediaInfo mediaInfo = this.e;
        return o0(this.i, this.j, this.p, mediaInfo == null ? -1 : mediaInfo.z());
    }

    public int D() {
        return this.i;
    }

    public int E() {
        return this.q;
    }

    public n F() {
        return this.z;
    }

    public o J(int i2) {
        return o(i2);
    }

    public int M() {
        return this.u.size();
    }

    public int N() {
        return this.t;
    }

    public long Q() {
        return this.k;
    }

    public double R() {
        return this.m;
    }

    public t X() {
        return this.x;
    }

    public a Y() {
        return this.B;
    }

    public boolean d0(long j2) {
        return (j2 & this.l) != 0;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if ((this.s == null) == (qVar.s == null) && this.f == qVar.f && this.g == qVar.g && this.h == qVar.h && this.i == qVar.i && this.j == qVar.j && this.k == qVar.k && this.m == qVar.m && this.n == qVar.n && this.p == qVar.p && this.q == qVar.q && this.t == qVar.t && Arrays.equals(this.o, qVar.o) && t60.f(Long.valueOf(this.l), Long.valueOf(qVar.l)) && t60.f(this.u, qVar.u) && t60.f(this.e, qVar.e)) {
            JSONObject jSONObject2 = this.s;
            return (jSONObject2 == null || (jSONObject = qVar.s) == null || l.a(jSONObject2, jSONObject)) && this.v == qVar.j0() && t60.f(this.w, qVar.w) && t60.f(this.x, qVar.x) && t60.f(this.y, qVar.y) && com.google.android.gms.common.internal.q.a(this.z, qVar.z);
        }
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.b(this.e, Long.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Long.valueOf(this.k), Long.valueOf(this.l), Double.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(this.p), Integer.valueOf(this.q), String.valueOf(this.s), Integer.valueOf(this.t), this.u, Boolean.valueOf(this.v), this.w, this.x, this.y, this.z);
    }

    public long[] i() {
        return this.o;
    }

    public boolean i0() {
        return this.n;
    }

    public c j() {
        return this.w;
    }

    public boolean j0() {
        return this.v;
    }

    public a k() {
        List<a> i2;
        c cVar = this.w;
        if (!(cVar == null || this.e == null)) {
            String i3 = cVar.i();
            if (!TextUtils.isEmpty(i3) && (i2 = this.e.i()) != null && !i2.isEmpty()) {
                for (a next : i2) {
                    if (i3.equals(next.n())) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public int l() {
        return this.g;
    }

    public int m() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0298, code lost:
        if (r15 == false) goto L_0x02b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x033c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m0(org.json.JSONObject r14, int r15) {
        /*
            r13 = this;
            org.json.JSONObject r14 = r0(r14)
            java.lang.String r0 = "mediaSessionId"
            long r0 = r14.getLong(r0)
            long r2 = r13.f
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0016
            r13.f = r0
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r1 = "playerState"
            boolean r2 = r14.has(r1)
            r3 = 2
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r2 = "IDLE"
            boolean r2 = r1.equals(r2)
            r6 = 3
            r7 = 4
            if (r2 == 0) goto L_0x0030
            r1 = 1
            goto L_0x0059
        L_0x0030:
            java.lang.String r2 = "PLAYING"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x003a
            r1 = 2
            goto L_0x0059
        L_0x003a:
            java.lang.String r2 = "PAUSED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0044
            r1 = 3
            goto L_0x0059
        L_0x0044:
            java.lang.String r2 = "BUFFERING"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x004e
            r1 = 4
            goto L_0x0059
        L_0x004e:
            java.lang.String r2 = "LOADING"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0058
            r1 = 5
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r2 = r13.i
            if (r1 == r2) goto L_0x0061
            r13.i = r1
            r0 = r0 | 2
        L_0x0061:
            if (r1 != r5) goto L_0x009f
            java.lang.String r1 = "idleReason"
            boolean r2 = r14.has(r1)
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r2 = "CANCELLED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0079
            r6 = 2
            goto L_0x0097
        L_0x0079:
            java.lang.String r2 = "INTERRUPTED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0082
            goto L_0x0097
        L_0x0082:
            java.lang.String r2 = "FINISHED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x008c
            r6 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r2 = "ERROR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r6 = 4
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            int r1 = r13.j
            if (r6 == r1) goto L_0x009f
            r13.j = r6
            r0 = r0 | 2
        L_0x009f:
            java.lang.String r1 = "playbackRate"
            boolean r2 = r14.has(r1)
            if (r2 == 0) goto L_0x00b5
            double r1 = r14.getDouble(r1)
            double r6 = r13.h
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L_0x00b5
            r13.h = r1
            r0 = r0 | 2
        L_0x00b5:
            java.lang.String r1 = "currentTime"
            boolean r2 = r14.has(r1)
            if (r2 == 0) goto L_0x00d1
            double r1 = r14.getDouble(r1)
            long r1 = defpackage.t60.c(r1)
            long r6 = r13.k
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00cf
            r13.k = r1
            r0 = r0 | 2
        L_0x00cf:
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x00d1:
            java.lang.String r1 = "supportedMediaCommands"
            boolean r2 = r14.has(r1)
            if (r2 == 0) goto L_0x00e7
            long r1 = r14.getLong(r1)
            long r6 = r13.l
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x00e7
            r13.l = r1
            r0 = r0 | 2
        L_0x00e7:
            java.lang.String r1 = "volume"
            boolean r2 = r14.has(r1)
            if (r2 == 0) goto L_0x0114
            r15 = r15 & r5
            if (r15 != 0) goto L_0x0114
            org.json.JSONObject r15 = r14.getJSONObject(r1)
            java.lang.String r1 = "level"
            double r1 = r15.getDouble(r1)
            double r6 = r13.m
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0106
            r13.m = r1
            r0 = r0 | 2
        L_0x0106:
            java.lang.String r1 = "muted"
            boolean r15 = r15.getBoolean(r1)
            boolean r1 = r13.n
            if (r15 == r1) goto L_0x0114
            r13.n = r15
            r0 = r0 | 2
        L_0x0114:
            java.lang.String r15 = "activeTrackIds"
            boolean r1 = r14.has(r15)
            r2 = 0
            if (r1 == 0) goto L_0x0148
            org.json.JSONArray r15 = r14.getJSONArray(r15)
            long[] r15 = defpackage.t60.i(r15)
            long[] r1 = r13.o
            if (r1 != 0) goto L_0x012b
        L_0x0129:
            r1 = 1
            goto L_0x0143
        L_0x012b:
            int r1 = r1.length
            int r6 = r15.length
            if (r1 == r6) goto L_0x0130
            goto L_0x0129
        L_0x0130:
            r1 = 0
        L_0x0131:
            int r6 = r15.length
            if (r1 >= r6) goto L_0x0142
            long[] r6 = r13.o
            r7 = r6[r1]
            r9 = r15[r1]
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x013f
            goto L_0x0129
        L_0x013f:
            int r1 = r1 + 1
            goto L_0x0131
        L_0x0142:
            r1 = 0
        L_0x0143:
            if (r1 == 0) goto L_0x0151
            r13.o = r15
            goto L_0x0151
        L_0x0148:
            long[] r15 = r13.o
            if (r15 == 0) goto L_0x014f
            r15 = r2
            r1 = 1
            goto L_0x0151
        L_0x014f:
            r15 = r2
            r1 = 0
        L_0x0151:
            if (r1 == 0) goto L_0x0157
            r13.o = r15
            r0 = r0 | 2
        L_0x0157:
            java.lang.String r15 = "customData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0169
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r13.s = r15
            r13.r = r2
            r0 = r0 | 2
        L_0x0169:
            java.lang.String r15 = "media"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0194
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            com.google.android.gms.cast.MediaInfo r1 = new com.google.android.gms.cast.MediaInfo
            r1.<init>(r15)
            com.google.android.gms.cast.MediaInfo r6 = r13.e
            if (r6 == 0) goto L_0x0186
            if (r6 == 0) goto L_0x018a
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x018a
        L_0x0186:
            r13.e = r1
            r0 = r0 | 2
        L_0x018a:
            java.lang.String r1 = "metadata"
            boolean r15 = r15.has(r1)
            if (r15 == 0) goto L_0x0194
            r0 = r0 | 4
        L_0x0194:
            java.lang.String r15 = "currentItemId"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01a8
            int r15 = r14.getInt(r15)
            int r1 = r13.g
            if (r1 == r15) goto L_0x01a8
            r13.g = r15
            r0 = r0 | 2
        L_0x01a8:
            java.lang.String r15 = "preloadedItemId"
            int r15 = r14.optInt(r15, r4)
            int r1 = r13.q
            if (r1 == r15) goto L_0x01b6
            r13.q = r15
            r0 = r0 | 16
        L_0x01b6:
            java.lang.String r15 = "loadingItemId"
            int r15 = r14.optInt(r15, r4)
            int r1 = r13.p
            if (r1 == r15) goto L_0x01c4
            r13.p = r15
            r0 = r0 | 2
        L_0x01c4:
            com.google.android.gms.cast.MediaInfo r15 = r13.e
            if (r15 != 0) goto L_0x01ca
            r15 = -1
            goto L_0x01ce
        L_0x01ca:
            int r15 = r15.z()
        L_0x01ce:
            int r1 = r13.i
            int r6 = r13.j
            int r7 = r13.p
            boolean r15 = o0(r1, r6, r7, r15)
            if (r15 != 0) goto L_0x029b
            java.lang.String r15 = "repeatMode"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0207
            java.lang.String r15 = r14.getString(r15)
            java.lang.Integer r15 = defpackage.v60.a(r15)
            if (r15 != 0) goto L_0x01ef
            int r15 = r13.t
            goto L_0x01f3
        L_0x01ef:
            int r15 = r15.intValue()
        L_0x01f3:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            int r1 = r13.t
            int r6 = r15.intValue()
            if (r1 == r6) goto L_0x0207
            int r15 = r15.intValue()
            r13.t = r15
            r15 = 1
            goto L_0x0208
        L_0x0207:
            r15 = 0
        L_0x0208:
            java.lang.String r1 = "items"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0298
            org.json.JSONArray r1 = r14.getJSONArray(r1)
            int r6 = r1.length()
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r8 = 0
        L_0x021e:
            if (r8 >= r6) goto L_0x0234
            org.json.JSONObject r9 = r1.getJSONObject(r8)
            java.lang.String r10 = "itemId"
            int r9 = r9.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r8, r9)
            int r8 = r8 + 1
            goto L_0x021e
        L_0x0234:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
        L_0x023a:
            if (r9 >= r6) goto L_0x028c
            java.lang.Object r10 = r7.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            org.json.JSONObject r11 = r1.getJSONObject(r9)
            int r12 = r10.intValue()
            com.google.android.gms.cast.o r12 = r13.o(r12)
            if (r12 == 0) goto L_0x0267
            boolean r11 = r12.i(r11)
            r15 = r15 | r11
            r8.add(r12)
            int r10 = r10.intValue()
            java.lang.Integer r10 = r13.n(r10)
            int r10 = r10.intValue()
            if (r9 == r10) goto L_0x0289
            goto L_0x0288
        L_0x0267:
            int r15 = r10.intValue()
            int r10 = r13.g
            if (r15 != r10) goto L_0x0280
            com.google.android.gms.cast.MediaInfo r15 = r13.e
            if (r15 == 0) goto L_0x0280
            com.google.android.gms.cast.o$a r10 = new com.google.android.gms.cast.o$a
            r10.<init>((com.google.android.gms.cast.MediaInfo) r15)
            com.google.android.gms.cast.o r15 = r10.a()
            r15.i(r11)
            goto L_0x0285
        L_0x0280:
            com.google.android.gms.cast.o r15 = new com.google.android.gms.cast.o
            r15.<init>((org.json.JSONObject) r11)
        L_0x0285:
            r8.add(r15)
        L_0x0288:
            r15 = 1
        L_0x0289:
            int r9 = r9 + 1
            goto L_0x023a
        L_0x028c:
            java.util.List<com.google.android.gms.cast.o> r1 = r13.u
            int r1 = r1.size()
            if (r1 == r6) goto L_0x0295
            r15 = 1
        L_0x0295:
            r13.q0(r8)
        L_0x0298:
            if (r15 == 0) goto L_0x02b7
            goto L_0x02b5
        L_0x029b:
            r13.g = r4
            r13.p = r4
            r13.q = r4
            java.util.List<com.google.android.gms.cast.o> r15 = r13.u
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x02b7
            r13.t = r4
            java.util.List<com.google.android.gms.cast.o> r15 = r13.u
            r15.clear()
            android.util.SparseArray<java.lang.Integer> r15 = r13.A
            r15.clear()
        L_0x02b5:
            r0 = r0 | 8
        L_0x02b7:
            java.lang.String r15 = "breakStatus"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.c r15 = com.google.android.gms.cast.c.n(r15)
            com.google.android.gms.cast.c r1 = r13.w
            if (r1 != 0) goto L_0x02c7
            if (r15 != 0) goto L_0x02d1
        L_0x02c7:
            com.google.android.gms.cast.c r1 = r13.w
            if (r1 == 0) goto L_0x02da
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x02da
        L_0x02d1:
            if (r15 == 0) goto L_0x02d4
            r4 = 1
        L_0x02d4:
            r13.v = r4
            r13.w = r15
            r0 = r0 | 32
        L_0x02da:
            java.lang.String r15 = "videoInfo"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.t r15 = com.google.android.gms.cast.t.j(r15)
            com.google.android.gms.cast.t r1 = r13.x
            if (r1 != 0) goto L_0x02ea
            if (r15 != 0) goto L_0x02f4
        L_0x02ea:
            com.google.android.gms.cast.t r1 = r13.x
            if (r1 == 0) goto L_0x02f8
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x02f8
        L_0x02f4:
            r13.x = r15
            r0 = r0 | 64
        L_0x02f8:
            java.lang.String r15 = "breakInfo"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x030d
            com.google.android.gms.cast.MediaInfo r1 = r13.e
            if (r1 == 0) goto L_0x030d
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.N(r15)
            r0 = r0 | 2
        L_0x030d:
            java.lang.String r15 = "queueData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0327
            com.google.android.gms.cast.n$a r1 = new com.google.android.gms.cast.n$a
            r1.<init>()
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.b(r15)
            com.google.android.gms.cast.n r15 = r1.a()
            r13.z = r15
        L_0x0327:
            java.lang.String r15 = "liveSeekableRange"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x033c
            org.json.JSONObject r14 = r14.optJSONObject(r15)
            com.google.android.gms.cast.k r14 = com.google.android.gms.cast.k.m(r14)
            r13.y = r14
            r14 = r0 | 2
            goto L_0x0345
        L_0x033c:
            com.google.android.gms.cast.k r14 = r13.y
            if (r14 == 0) goto L_0x0342
            r0 = r0 | 2
        L_0x0342:
            r13.y = r2
            r14 = r0
        L_0x0345:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.q.m0(org.json.JSONObject, int):int");
    }

    public Integer n(int i2) {
        return this.A.get(i2);
    }

    public o o(int i2) {
        Integer num = this.A.get(i2);
        if (num == null) {
            return null;
        }
        return this.u.get(num.intValue());
    }

    public k p() {
        return this.y;
    }

    public int u() {
        return this.p;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.s;
        this.r = jSONObject == null ? null : jSONObject.toString();
        int a2 = o80.a(parcel);
        o80.r(parcel, 2, y(), i2, false);
        o80.o(parcel, 3, this.f);
        o80.l(parcel, 4, l());
        o80.g(parcel, 5, z());
        o80.l(parcel, 6, D());
        o80.l(parcel, 7, m());
        o80.o(parcel, 8, Q());
        o80.o(parcel, 9, this.l);
        o80.g(parcel, 10, R());
        o80.c(parcel, 11, i0());
        o80.p(parcel, 12, i(), false);
        o80.l(parcel, 13, u());
        o80.l(parcel, 14, E());
        o80.s(parcel, 15, this.r, false);
        o80.l(parcel, 16, this.t);
        o80.w(parcel, 17, this.u, false);
        o80.c(parcel, 18, j0());
        o80.r(parcel, 19, j(), i2, false);
        o80.r(parcel, 20, X(), i2, false);
        o80.r(parcel, 21, p(), i2, false);
        o80.r(parcel, 22, F(), i2, false);
        o80.b(parcel, a2);
    }

    public MediaInfo y() {
        return this.e;
    }

    public final long y0() {
        return this.f;
    }

    public double z() {
        return this.h;
    }
}
