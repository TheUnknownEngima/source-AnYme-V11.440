package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.q;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class a {
    private static ScheduledExecutorService l;
    private final Object a;
    private final PowerManager.WakeLock b;
    private WorkSource c;
    private final int d;
    private final String e;
    private final String f;
    private final Context g;
    private boolean h;
    private final Map<String, Integer[]> i;
    private int j;
    private AtomicInteger k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context, int i2, String str) {
        this(context, i2, str, (String) null, context == null ? null : context.getPackageName());
    }

    private a(Context context, int i2, String str, String str2, String str3) {
        this(context, i2, str, (String) null, str3, (String) null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private a(Context context, int i2, String str, String str2, String str3, String str4) {
        this.a = this;
        this.h = true;
        this.i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.k = new AtomicInteger(0);
        r.k(context, "WakeLock: context must not be null");
        r.g(str, "WakeLock: wakeLockName must not be empty");
        this.d = i2;
        this.f = null;
        this.g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.e = str;
        }
        this.b = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        if (q.c(context)) {
            WorkSource a2 = q.a(context, o.a(str3) ? context.getPackageName() : str3);
            this.c = a2;
            if (a2 != null && q.c(this.g)) {
                WorkSource workSource = this.c;
                if (workSource != null) {
                    workSource.add(a2);
                } else {
                    this.c = a2;
                }
                try {
                    this.b.setWorkSource(this.c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (l == null) {
            l = p80.a().a();
        }
    }

    private final String d(String str) {
        return this.h ? !TextUtils.isEmpty(str) ? str : this.f : this.f;
    }

    private final List<String> e() {
        return q.b(this.c);
    }

    /* access modifiers changed from: private */
    public final void f(int i2) {
        if (this.b.isHeld()) {
            try {
                this.b.release();
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    String.valueOf(this.e).concat(" was already released!");
                } else {
                    throw e2;
                }
            }
            this.b.isHeld();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.j == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.d.a().c(r13.g, com.google.android.gms.common.stats.c.a(r13.b, r6), 7, r13.e, r6, (java.lang.String) null, r13.d, e(), r14);
        r13.j++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.d(r0)
            java.lang.Object r0 = r13.a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.j     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.j = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.h     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.i     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.h     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.j     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.g     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.e()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.j     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.j = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = l
            com.google.android.gms.stats.b r1 = new com.google.android.gms.stats.b
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.a.a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r12.j == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        com.google.android.gms.common.stats.d.a().b(r12.g, com.google.android.gms.common.stats.c.a(r12.b, r6), 8, r12.e, r6, (java.lang.String) null, r12.d, e());
        r12.j--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0013
            java.lang.String r0 = r12.e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            r0.concat(r1)
        L_0x0013:
            r0 = 0
            java.lang.String r6 = r12.d(r0)
            java.lang.Object r0 = r12.a
            monitor-enter(r0)
            boolean r1 = r12.h     // Catch:{ all -> 0x0078 }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x004c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0078 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r1 = 0
            goto L_0x004a
        L_0x002d:
            r2 = r1[r11]     // Catch:{ all -> 0x0078 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0078 }
            if (r2 != r10) goto L_0x003c
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.i     // Catch:{ all -> 0x0078 }
            r1.remove(r6)     // Catch:{ all -> 0x0078 }
            r1 = 1
            goto L_0x004a
        L_0x003c:
            r2 = r1[r11]     // Catch:{ all -> 0x0078 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0078 }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0078 }
            r1[r11] = r2     // Catch:{ all -> 0x0078 }
            goto L_0x002b
        L_0x004a:
            if (r1 != 0) goto L_0x0054
        L_0x004c:
            boolean r1 = r12.h     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0073
            int r1 = r12.j     // Catch:{ all -> 0x0078 }
            if (r1 != r10) goto L_0x0073
        L_0x0054:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch:{ all -> 0x0078 }
            android.content.Context r2 = r12.g     // Catch:{ all -> 0x0078 }
            android.os.PowerManager$WakeLock r3 = r12.b     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = com.google.android.gms.common.stats.c.a(r3, r6)     // Catch:{ all -> 0x0078 }
            r4 = 8
            java.lang.String r5 = r12.e     // Catch:{ all -> 0x0078 }
            r7 = 0
            int r8 = r12.d     // Catch:{ all -> 0x0078 }
            java.util.List r9 = r12.e()     // Catch:{ all -> 0x0078 }
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0078 }
            int r1 = r12.j     // Catch:{ all -> 0x0078 }
            int r1 = r1 - r10
            r12.j = r1     // Catch:{ all -> 0x0078 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            r12.f(r11)
            return
        L_0x0078:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.a.b():void");
    }

    public void c(boolean z) {
        this.b.setReferenceCounted(z);
        this.h = z;
    }
}
