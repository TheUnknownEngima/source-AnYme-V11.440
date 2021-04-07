package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* renamed from: zt0  reason: default package */
public abstract class zt0<T> {
    private static final Object g = new Object();
    @Nullable
    private static volatile hu0 h;
    private static mu0 i = new mu0(bu0.a);
    private static final AtomicInteger j = new AtomicInteger();
    private final iu0 a;
    private final String b;
    private final T c;
    private volatile int d;
    private volatile T e;
    private final boolean f;

    static {
        new AtomicReference();
    }

    private zt0(iu0 iu0, String str, T t, boolean z) {
        this.d = -1;
        if (iu0.a != null) {
            this.a = iu0;
            this.b = str;
            this.c = t;
            this.f = z;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ zt0(iu0 iu0, String str, Object obj, boolean z, eu0 eu0) {
        this(iu0, str, obj, z);
    }

    private final String f(String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static void g() {
        j.incrementAndGet();
    }

    @Deprecated
    public static void h(Context context) {
        synchronized (g) {
            hu0 hu0 = h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (hu0 == null || hu0.a() != context) {
                kt0.d();
                ku0.b();
                tt0.b();
                h = new lt0(context, xu0.a(new cu0(context)));
                j.incrementAndGet();
            }
        }
    }

    /* access modifiers changed from: private */
    public static zt0<Double> i(iu0 iu0, String str, double d2, boolean z) {
        return new gu0(iu0, str, Double.valueOf(-3.0d), true);
    }

    /* access modifiers changed from: private */
    public static zt0<Long> j(iu0 iu0, String str, long j2, boolean z) {
        return new eu0(iu0, str, Long.valueOf(j2), true);
    }

    /* access modifiers changed from: private */
    public static zt0<String> k(iu0 iu0, String str, String str2, boolean z) {
        return new fu0(iu0, str, str2, true);
    }

    /* access modifiers changed from: private */
    public static zt0<Boolean> l(iu0 iu0, String str, boolean z, boolean z2) {
        return new du0(iu0, str, Boolean.valueOf(z), true);
    }

    static final /* synthetic */ boolean p() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract T e(Object obj);

    public final String n() {
        return f(this.a.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T o() {
        /*
            r6 = this;
            boolean r0 = r6.f
            if (r0 != 0) goto L_0x0011
            mu0 r0 = i
            java.lang.String r1 = r6.b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            defpackage.tu0.h(r0, r1)
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = j
            int r0 = r0.get()
            int r1 = r6.d
            if (r1 >= r0) goto L_0x010e
            monitor-enter(r6)
            int r1 = r6.d     // Catch:{ all -> 0x010b }
            if (r1 >= r0) goto L_0x0109
            hu0 r1 = h     // Catch:{ all -> 0x010b }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            defpackage.tu0.h(r4, r5)     // Catch:{ all -> 0x010b }
            android.content.Context r4 = r1.a()     // Catch:{ all -> 0x010b }
            tt0 r4 = defpackage.tt0.a(r4)     // Catch:{ all -> 0x010b }
            java.lang.String r5 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r4 = r4.f(r5)     // Catch:{ all -> 0x010b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x010b }
            if (r4 == 0) goto L_0x004d
            java.util.regex.Pattern r5 = defpackage.gt0.c     // Catch:{ all -> 0x010b }
            java.util.regex.Matcher r4 = r5.matcher(r4)     // Catch:{ all -> 0x010b }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x010b }
            if (r4 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            r3 = 0
            if (r2 != 0) goto L_0x0091
            iu0 r2 = r6.a     // Catch:{ all -> 0x010b }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0078
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x010b }
            iu0 r4 = r6.a     // Catch:{ all -> 0x010b }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x010b }
            boolean r2 = defpackage.xt0.b(r2, r4)     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x0076
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x010b }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x010b }
            iu0 r4 = r6.a     // Catch:{ all -> 0x010b }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x010b }
            kt0 r2 = defpackage.kt0.a(r2, r4)     // Catch:{ all -> 0x010b }
            goto L_0x0080
        L_0x0076:
            r2 = r3
            goto L_0x0080
        L_0x0078:
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x010b }
            ku0 r2 = defpackage.ku0.a(r2, r3)     // Catch:{ all -> 0x010b }
        L_0x0080:
            if (r2 == 0) goto L_0x00b3
            java.lang.String r4 = r6.n()     // Catch:{ all -> 0x010b }
            java.lang.Object r2 = r2.f(r4)     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r6.e(r2)     // Catch:{ all -> 0x010b }
            goto L_0x00b4
        L_0x0091:
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x00b3
            java.lang.String r2 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.n()     // Catch:{ all -> 0x010b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x010b }
            int r5 = r4.length()     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00ae
            r2.concat(r4)     // Catch:{ all -> 0x010b }
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x010b }
            r4.<init>(r2)     // Catch:{ all -> 0x010b }
        L_0x00b3:
            r2 = r3
        L_0x00b4:
            if (r2 == 0) goto L_0x00b7
            goto L_0x00d8
        L_0x00b7:
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x010b }
            tt0 r2 = defpackage.tt0.a(r2)     // Catch:{ all -> 0x010b }
            iu0 r4 = r6.a     // Catch:{ all -> 0x010b }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x010b }
            java.lang.String r4 = r6.f(r4)     // Catch:{ all -> 0x010b }
            java.lang.Object r2 = r2.f(r4)     // Catch:{ all -> 0x010b }
            if (r2 == 0) goto L_0x00d2
            java.lang.Object r2 = r6.e(r2)     // Catch:{ all -> 0x010b }
            goto L_0x00d3
        L_0x00d2:
            r2 = r3
        L_0x00d3:
            if (r2 == 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            T r2 = r6.c     // Catch:{ all -> 0x010b }
        L_0x00d8:
            yu0 r1 = r1.b()     // Catch:{ all -> 0x010b }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x010b }
            uu0 r1 = (defpackage.uu0) r1     // Catch:{ all -> 0x010b }
            boolean r4 = r1.b()     // Catch:{ all -> 0x010b }
            if (r4 == 0) goto L_0x0105
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x010b }
            ut0 r1 = (defpackage.ut0) r1     // Catch:{ all -> 0x010b }
            iu0 r2 = r6.a     // Catch:{ all -> 0x010b }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x010b }
            iu0 r4 = r6.a     // Catch:{ all -> 0x010b }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x010b }
            java.lang.String r5 = r6.b     // Catch:{ all -> 0x010b }
            java.lang.String r1 = r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x010b }
            if (r1 != 0) goto L_0x0101
            T r2 = r6.c     // Catch:{ all -> 0x010b }
            goto L_0x0105
        L_0x0101:
            java.lang.Object r2 = r6.e(r1)     // Catch:{ all -> 0x010b }
        L_0x0105:
            r6.e = r2     // Catch:{ all -> 0x010b }
            r6.d = r0     // Catch:{ all -> 0x010b }
        L_0x0109:
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x010b }
            throw r0
        L_0x010e:
            T r0 = r6.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.o():java.lang.Object");
    }
}
