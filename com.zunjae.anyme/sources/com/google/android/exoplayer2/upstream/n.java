package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class n implements f, y {
    public static final Map<String, int[]> p = j();
    public static final long[] q = {5800000, 3500000, 1900000, 1000000, 520000};
    public static final long[] r = {204000, 154000, 139000, 122000, 102000};
    public static final long[] s = {2200000, 1150000, 810000, 640000, 450000};
    public static final long[] t = {4900000, 2300000, 1500000, 970000, 540000};
    private static n u;
    private final Context a;
    private final SparseArray<Long> b;
    private final x40<f.a> c;
    private final n50 d;
    private final r40 e;
    private int f;
    private long g;
    private long h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private int o;

    public static final class b {
        private final Context a;
        private SparseArray<Long> b;
        private int c;
        private r40 d;
        private boolean e;

        public b(Context context) {
            this.a = context == null ? null : context.getApplicationContext();
            this.b = c(v50.D(context));
            this.c = 2000;
            this.d = r40.a;
            this.e = true;
        }

        private static int[] b(String str) {
            int[] iArr = n.p.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }

        private static SparseArray<Long> c(String str) {
            int[] b2 = b(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            sparseArray.append(2, Long.valueOf(n.q[b2[0]]));
            sparseArray.append(3, Long.valueOf(n.r[b2[1]]));
            sparseArray.append(4, Long.valueOf(n.s[b2[2]]));
            sparseArray.append(5, Long.valueOf(n.t[b2[3]]));
            sparseArray.append(7, Long.valueOf(n.q[b2[0]]));
            sparseArray.append(9, Long.valueOf(n.t[b2[3]]));
            return sparseArray;
        }

        public n a() {
            return new n(this.a, this.b, this.c, this.d, this.e);
        }
    }

    private static class c extends BroadcastReceiver {
        private static c c;
        private final Handler a = new Handler(Looper.getMainLooper());
        private final ArrayList<WeakReference<n>> b = new ArrayList<>();

        private c() {
        }

        public static synchronized c a(Context context) {
            c cVar;
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(c, intentFilter);
                }
                cVar = c;
            }
            return cVar;
        }

        private void d() {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (((n) this.b.get(size).get()) == null) {
                    this.b.remove(size);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void b(n nVar) {
            nVar.o();
        }

        public synchronized void c(n nVar) {
            d();
            this.b.add(new WeakReference(nVar));
            this.a.post(new b(this, nVar));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                d();
                for (int i = 0; i < this.b.size(); i++) {
                    n nVar = (n) this.b.get(i).get();
                    if (nVar != null) {
                        b(nVar);
                    }
                }
            }
        }
    }

    @Deprecated
    public n() {
        this((Context) null, new SparseArray(), 2000, r40.a, false);
    }

    private n(Context context, SparseArray<Long> sparseArray, int i2, r40 r40, boolean z) {
        this.a = context == null ? null : context.getApplicationContext();
        this.b = sparseArray;
        this.c = new x40<>();
        this.d = new n50(i2);
        this.e = r40;
        int O = context == null ? 0 : v50.O(context);
        this.i = O;
        this.l = k(O);
        if (context != null && z) {
            c.a(context).c(this);
        }
    }

    private static Map<String, int[]> j() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{0, 2, 0, 0});
        hashMap.put("AE", new int[]{2, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{4, 2, 2, 3});
        hashMap.put("AI", new int[]{0, 3, 2, 4});
        hashMap.put("AL", new int[]{1, 2, 0, 1});
        hashMap.put("AM", new int[]{2, 2, 1, 2});
        hashMap.put("AO", new int[]{3, 4, 3, 1});
        hashMap.put("AQ", new int[]{4, 2, 2, 2});
        hashMap.put("AR", new int[]{2, 3, 1, 2});
        hashMap.put("AS", new int[]{2, 2, 4, 2});
        hashMap.put("AT", new int[]{0, 3, 0, 0});
        hashMap.put("AU", new int[]{0, 2, 0, 1});
        hashMap.put("AW", new int[]{1, 1, 2, 4});
        hashMap.put("AX", new int[]{0, 1, 0, 0});
        hashMap.put("AZ", new int[]{3, 3, 3, 3});
        hashMap.put("BA", new int[]{1, 1, 0, 1});
        hashMap.put("BB", new int[]{0, 3, 0, 0});
        hashMap.put("BD", new int[]{2, 0, 4, 3});
        hashMap.put("BE", new int[]{0, 1, 2, 3});
        hashMap.put("BF", new int[]{4, 4, 4, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{1, 0, 3, 4});
        hashMap.put("BI", new int[]{4, 4, 4, 4});
        hashMap.put("BJ", new int[]{4, 4, 3, 4});
        hashMap.put("BL", new int[]{1, 0, 4, 3});
        hashMap.put("BM", new int[]{0, 1, 0, 0});
        hashMap.put("BN", new int[]{4, 0, 2, 4});
        hashMap.put("BO", new int[]{1, 3, 3, 3});
        hashMap.put("BQ", new int[]{1, 0, 1, 0});
        hashMap.put("BR", new int[]{2, 4, 3, 1});
        hashMap.put("BS", new int[]{3, 1, 1, 3});
        hashMap.put("BT", new int[]{3, 0, 3, 1});
        hashMap.put("BW", new int[]{3, 4, 3, 3});
        hashMap.put("BY", new int[]{0, 1, 1, 1});
        hashMap.put("BZ", new int[]{1, 3, 2, 1});
        hashMap.put("CA", new int[]{0, 3, 2, 2});
        hashMap.put("CD", new int[]{3, 4, 2, 2});
        hashMap.put("CF", new int[]{4, 3, 2, 2});
        hashMap.put("CG", new int[]{3, 4, 1, 1});
        hashMap.put("CH", new int[]{0, 0, 0, 0});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 0, 1, 0});
        hashMap.put("CL", new int[]{1, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 3, 2});
        hashMap.put("CN", new int[]{1, 0, 1, 1});
        hashMap.put("CO", new int[]{2, 3, 3, 2});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 2, 1});
        hashMap.put("CV", new int[]{2, 3, 3, 2});
        hashMap.put("CW", new int[]{1, 1, 0, 0});
        hashMap.put("CY", new int[]{1, 1, 0, 0});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 1, 2, 3});
        hashMap.put("DJ", new int[]{4, 2, 4, 4});
        hashMap.put("DK", new int[]{0, 0, 1, 0});
        hashMap.put("DM", new int[]{1, 1, 0, 2});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 3, 4, 2});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 1});
        hashMap.put("EH", new int[]{2, 0, 3, 1});
        hashMap.put("ER", new int[]{4, 2, 4, 4});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 1});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 0, 4, 4});
        hashMap.put("FK", new int[]{2, 2, 2, 1});
        hashMap.put("FM", new int[]{3, 2, 4, 1});
        hashMap.put("FO", new int[]{1, 1, 0, 0});
        hashMap.put("FR", new int[]{1, 1, 1, 1});
        hashMap.put("GA", new int[]{3, 2, 2, 2});
        hashMap.put("GB", new int[]{0, 1, 1, 1});
        hashMap.put("GD", new int[]{1, 1, 3, 1});
        hashMap.put("GE", new int[]{1, 0, 1, 4});
        hashMap.put("GF", new int[]{2, 0, 1, 3});
        hashMap.put("GG", new int[]{1, 0, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 3, 3});
        hashMap.put("GI", new int[]{4, 4, 0, 0});
        hashMap.put("GL", new int[]{2, 1, 1, 2});
        hashMap.put("GM", new int[]{4, 3, 2, 4});
        hashMap.put("GN", new int[]{3, 4, 4, 2});
        hashMap.put("GP", new int[]{2, 1, 3, 4});
        hashMap.put("GQ", new int[]{4, 4, 4, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 2, 2, 2});
        hashMap.put("GU", new int[]{1, 0, 2, 2});
        hashMap.put("GW", new int[]{3, 4, 4, 3});
        hashMap.put("GY", new int[]{3, 2, 1, 1});
        hashMap.put("HK", new int[]{0, 2, 3, 4});
        hashMap.put("HN", new int[]{3, 1, 3, 3});
        hashMap.put("HR", new int[]{1, 1, 0, 1});
        hashMap.put("HT", new int[]{4, 4, 4, 4});
        hashMap.put("HU", new int[]{0, 1, 0, 0});
        hashMap.put("ID", new int[]{2, 2, 2, 3});
        hashMap.put("IE", new int[]{1, 0, 1, 1});
        hashMap.put("IL", new int[]{1, 0, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 3});
        hashMap.put("IO", new int[]{4, 4, 2, 3});
        hashMap.put("IQ", new int[]{3, 3, 4, 2});
        hashMap.put("IR", new int[]{3, 0, 2, 1});
        hashMap.put("IS", new int[]{0, 1, 0, 0});
        hashMap.put("IT", new int[]{1, 1, 1, 2});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 3, 3, 4});
        hashMap.put("JO", new int[]{1, 2, 1, 1});
        hashMap.put("JP", new int[]{0, 2, 0, 0});
        hashMap.put("KE", new int[]{3, 4, 3, 3});
        hashMap.put("KG", new int[]{2, 0, 2, 2});
        hashMap.put("KH", new int[]{1, 0, 4, 3});
        hashMap.put("KI", new int[]{4, 4, 4, 0});
        hashMap.put("KM", new int[]{4, 3, 2, 4});
        hashMap.put("KN", new int[]{1, 0, 2, 4});
        hashMap.put("KP", new int[]{4, 2, 0, 2});
        hashMap.put("KR", new int[]{0, 1, 0, 1});
        hashMap.put("KW", new int[]{2, 3, 1, 2});
        hashMap.put("KY", new int[]{3, 1, 2, 3});
        hashMap.put("KZ", new int[]{1, 2, 2, 2});
        hashMap.put("LA", new int[]{2, 2, 1, 1});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{1, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 1, 1});
        hashMap.put("LK", new int[]{2, 0, 2, 3});
        hashMap.put("LR", new int[]{3, 4, 4, 2});
        hashMap.put("LS", new int[]{3, 3, 2, 2});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 0, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{3, 3, 4, 3});
        hashMap.put("MA", new int[]{3, 2, 3, 2});
        hashMap.put("MC", new int[]{0, 4, 0, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 3, 1, 2});
        hashMap.put("MF", new int[]{2, 3, 1, 1});
        hashMap.put("MG", new int[]{3, 4, 2, 3});
        hashMap.put("MH", new int[]{4, 0, 2, 4});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 2, 0});
        hashMap.put("MM", new int[]{3, 3, 2, 2});
        hashMap.put("MN", new int[]{2, 3, 1, 1});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 1, 2});
        hashMap.put("MQ", new int[]{2, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 2, 4, 4});
        hashMap.put("MS", new int[]{1, 4, 3, 4});
        hashMap.put("MT", new int[]{0, 0, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 4, 4});
        hashMap.put("MV", new int[]{4, 3, 2, 4});
        hashMap.put("MW", new int[]{3, 1, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 3});
        hashMap.put("MY", new int[]{2, 1, 3, 3});
        hashMap.put("MZ", new int[]{3, 3, 3, 3});
        hashMap.put("NA", new int[]{4, 3, 3, 3});
        hashMap.put("NC", new int[]{2, 0, 4, 4});
        hashMap.put("NE", new int[]{4, 4, 4, 4});
        hashMap.put("NF", new int[]{1, 2, 2, 0});
        hashMap.put("NG", new int[]{3, 3, 2, 2});
        hashMap.put("NI", new int[]{3, 2, 4, 3});
        hashMap.put("NL", new int[]{0, 2, 3, 2});
        hashMap.put("NO", new int[]{0, 2, 1, 0});
        hashMap.put("NP", new int[]{2, 2, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 3, 2});
        hashMap.put("NZ", new int[]{0, 0, 1, 2});
        hashMap.put("OM", new int[]{2, 3, 0, 2});
        hashMap.put("PA", new int[]{1, 3, 3, 3});
        hashMap.put("PE", new int[]{2, 4, 4, 4});
        hashMap.put("PF", new int[]{2, 1, 1, 1});
        hashMap.put("PG", new int[]{4, 3, 3, 2});
        hashMap.put("PH", new int[]{3, 0, 3, 4});
        hashMap.put("PK", new int[]{3, 2, 3, 2});
        hashMap.put("PL", new int[]{1, 0, 1, 2});
        hashMap.put("PM", new int[]{0, 2, 2, 0});
        hashMap.put("PR", new int[]{2, 2, 2, 2});
        hashMap.put("PS", new int[]{3, 3, 1, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 0});
        hashMap.put("PW", new int[]{1, 1, 3, 0});
        hashMap.put("PY", new int[]{2, 0, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 1, 1});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 0, 1});
        hashMap.put("RW", new int[]{4, 4, 4, 4});
        hashMap.put("SA", new int[]{2, 2, 2, 1});
        hashMap.put("SB", new int[]{4, 4, 4, 1});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 4});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{1, 0, 3, 3});
        hashMap.put("SH", new int[]{4, 2, 2, 2});
        hashMap.put("SI", new int[]{0, 1, 0, 0});
        hashMap.put("SJ", new int[]{2, 2, 2, 4});
        hashMap.put("SK", new int[]{0, 1, 0, 0});
        hashMap.put("SL", new int[]{4, 3, 3, 1});
        hashMap.put("SM", new int[]{0, 0, 1, 2});
        hashMap.put("SN", new int[]{4, 4, 4, 3});
        hashMap.put("SO", new int[]{3, 4, 3, 4});
        hashMap.put("SR", new int[]{2, 2, 2, 1});
        hashMap.put("SS", new int[]{4, 4, 4, 4});
        hashMap.put("ST", new int[]{2, 3, 1, 2});
        hashMap.put("SV", new int[]{2, 2, 4, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 3, 1, 1});
        hashMap.put("SZ", new int[]{4, 4, 3, 4});
        hashMap.put("TC", new int[]{1, 2, 1, 0});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 2, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 3, 3});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 2, 2, 2});
        hashMap.put("TN", new int[]{2, 1, 1, 1});
        hashMap.put("TO", new int[]{4, 3, 4, 4});
        hashMap.put("TR", new int[]{1, 2, 1, 1});
        hashMap.put("TT", new int[]{1, 3, 2, 4});
        hashMap.put("TV", new int[]{4, 2, 3, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 0});
        hashMap.put("TZ", new int[]{3, 4, 3, 3});
        hashMap.put("UA", new int[]{0, 3, 1, 1});
        hashMap.put("UG", new int[]{3, 2, 2, 3});
        hashMap.put("US", new int[]{0, 1, 2, 2});
        hashMap.put("UY", new int[]{2, 1, 2, 2});
        hashMap.put("UZ", new int[]{2, 2, 3, 2});
        hashMap.put("VA", new int[]{0, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 3, 0, 2});
        hashMap.put("VE", new int[]{4, 4, 4, 4});
        hashMap.put("VG", new int[]{3, 1, 2, 4});
        hashMap.put("VI", new int[]{1, 4, 4, 3});
        hashMap.put("VN", new int[]{0, 1, 3, 4});
        hashMap.put("VU", new int[]{4, 0, 3, 3});
        hashMap.put("WS", new int[]{3, 2, 4, 3});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 3});
        hashMap.put("YT", new int[]{2, 2, 2, 3});
        hashMap.put("ZA", new int[]{2, 3, 2, 2});
        hashMap.put("ZM", new int[]{3, 2, 3, 3});
        hashMap.put("ZW", new int[]{3, 3, 2, 3});
        return Collections.unmodifiableMap(hashMap);
    }

    private long k(int i2) {
        Long l2 = this.b.get(i2);
        if (l2 == null) {
            l2 = this.b.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public static synchronized n l(Context context) {
        n nVar;
        synchronized (n.class) {
            if (u == null) {
                u = new b(context).a();
            }
            nVar = u;
        }
        return nVar;
    }

    private void n(int i2, long j2, long j3) {
        if (i2 != 0 || j2 != 0 || j3 != this.m) {
            this.m = j3;
            this.c.b(new a(i2, j2, j3));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void o() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.n     // Catch:{ all -> 0x005a }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            int r0 = r10.o     // Catch:{ all -> 0x005a }
            goto L_0x0015
        L_0x0009:
            android.content.Context r0 = r10.a     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0015
        L_0x000f:
            android.content.Context r0 = r10.a     // Catch:{ all -> 0x005a }
            int r0 = defpackage.v50.O(r0)     // Catch:{ all -> 0x005a }
        L_0x0015:
            int r2 = r10.i     // Catch:{ all -> 0x005a }
            if (r2 != r0) goto L_0x001b
            monitor-exit(r10)
            return
        L_0x001b:
            r10.i = r0     // Catch:{ all -> 0x005a }
            r2 = 1
            if (r0 == r2) goto L_0x0058
            if (r0 == 0) goto L_0x0058
            r2 = 8
            if (r0 != r2) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            long r2 = r10.k(r0)     // Catch:{ all -> 0x005a }
            r10.l = r2     // Catch:{ all -> 0x005a }
            r40 r0 = r10.e     // Catch:{ all -> 0x005a }
            long r2 = r0.a()     // Catch:{ all -> 0x005a }
            int r0 = r10.f     // Catch:{ all -> 0x005a }
            if (r0 <= 0) goto L_0x003e
            long r0 = r10.g     // Catch:{ all -> 0x005a }
            long r0 = r2 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x005a }
            r5 = r1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            long r6 = r10.h     // Catch:{ all -> 0x005a }
            long r8 = r10.l     // Catch:{ all -> 0x005a }
            r4 = r10
            r4.n(r5, r6, r8)     // Catch:{ all -> 0x005a }
            r10.g = r2     // Catch:{ all -> 0x005a }
            r0 = 0
            r10.h = r0     // Catch:{ all -> 0x005a }
            r10.k = r0     // Catch:{ all -> 0x005a }
            r10.j = r0     // Catch:{ all -> 0x005a }
            n50 r0 = r10.d     // Catch:{ all -> 0x005a }
            r0.g()     // Catch:{ all -> 0x005a }
            monitor-exit(r10)
            return
        L_0x0058:
            monitor-exit(r10)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.n.o():void");
    }

    public synchronized void a(i iVar, l lVar, boolean z) {
        if (z) {
            q40.f(this.f > 0);
            long a2 = this.e.a();
            int i2 = (int) (a2 - this.g);
            this.j += (long) i2;
            this.k += this.h;
            if (i2 > 0) {
                this.d.a((int) Math.sqrt((double) this.h), (((float) this.h) * 8000.0f) / ((float) i2));
                if (this.j >= 2000 || this.k >= 524288) {
                    this.l = (long) this.d.d(0.5f);
                }
                n(i2, this.h, this.l);
                this.g = a2;
                this.h = 0;
            }
            this.f--;
        }
    }

    public synchronized void b(i iVar, l lVar, boolean z) {
        if (z) {
            if (this.f == 0) {
                this.g = this.e.a();
            }
            this.f++;
        }
    }

    public y c() {
        return this;
    }

    public void d(f.a aVar) {
        this.c.c(aVar);
    }

    public synchronized long e() {
        return this.l;
    }

    public synchronized void f(i iVar, l lVar, boolean z, int i2) {
        if (z) {
            this.h += (long) i2;
        }
    }

    public void g(Handler handler, f.a aVar) {
        this.c.a(handler, aVar);
    }

    public void h(i iVar, l lVar, boolean z) {
    }
}
