package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import defpackage.id1;
import defpackage.mc1;
import defpackage.of1;
import defpackage.rf1;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gc1  reason: default package */
class gc1 {
    static final FilenameFilter A = new o();
    static final Comparator<File> B = new p();
    static final Comparator<File> C = new q();
    /* access modifiers changed from: private */
    public static final Pattern D = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> E = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] F = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    static final FilenameFilter y = new j("BeginSession");
    static final FilenameFilter z = fc1.a();
    private final AtomicInteger a = new AtomicInteger(0);
    private final Context b;
    /* access modifiers changed from: private */
    public final oc1 c;
    /* access modifiers changed from: private */
    public final jc1 d;
    private final ed1 e;
    /* access modifiers changed from: private */
    public final ec1 f;
    private final xe1 g;
    private final tc1 h;
    private final gf1 i;
    /* access modifiers changed from: private */
    public final xb1 j;
    /* access modifiers changed from: private */
    public final of1.b k;
    private final a0 l;
    /* access modifiers changed from: private */
    public final id1 m;
    /* access modifiers changed from: private */
    public final nf1 n;
    /* access modifiers changed from: private */
    public final of1.a o;
    private final ib1 p;
    private final xg1 q;
    /* access modifiers changed from: private */
    public final String r;
    /* access modifiers changed from: private */
    public final nb1 s;
    /* access modifiers changed from: private */
    public final cd1 t;
    private mc1 u;
    f81<Boolean> v = new f81<>();
    f81<Boolean> w = new f81<>();
    f81<Void> x = new f81<>();

    /* renamed from: gc1$a */
    class a implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (gc1.this.g0()) {
                return null;
            }
            gc1.this.m.i(this.a, this.b);
            return null;
        }
    }

    /* renamed from: gc1$a0 */
    private static final class a0 implements id1.b {
        private final gf1 a;

        public a0(gf1 gf1) {
            this.a = gf1;
        }

        public File a() {
            File file = new File(this.a.b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: gc1$b */
    class b implements Runnable {
        final /* synthetic */ Date e;
        final /* synthetic */ Throwable f;
        final /* synthetic */ Thread g;

        b(Date date, Throwable th, Thread thread) {
            this.e = date;
            this.f = th;
            this.g = thread;
        }

        public void run() {
            if (!gc1.this.g0()) {
                long s = gc1.c0(this.e);
                gc1.this.t.l(this.f, this.g, s);
                gc1.this.M(this.g, this.f, s);
            }
        }
    }

    /* renamed from: gc1$b0 */
    private final class b0 implements of1.c {
        private b0() {
        }

        /* synthetic */ b0(gc1 gc1, j jVar) {
            this();
        }

        public File[] a() {
            return gc1.this.m0();
        }

        public File[] b() {
            return gc1.this.j0();
        }
    }

    /* renamed from: gc1$c */
    class c implements Callable<Void> {
        final /* synthetic */ Map a;

        c(Map map) {
            this.a = map;
        }

        /* renamed from: a */
        public Void call() {
            new wc1(gc1.this.X()).g(gc1.this.U(), this.a);
            return null;
        }
    }

    /* renamed from: gc1$c0 */
    private final class c0 implements of1.a {
        private c0() {
        }

        /* synthetic */ c0(gc1 gc1, j jVar) {
            this();
        }

        public boolean a() {
            return gc1.this.g0();
        }
    }

    /* renamed from: gc1$d */
    class d implements Callable<Void> {
        d() {
        }

        /* renamed from: a */
        public Void call() {
            gc1.this.L();
            return null;
        }
    }

    /* renamed from: gc1$d0 */
    private static final class d0 implements Runnable {
        private final Context e;
        private final rf1 f;
        private final of1 g;
        private final boolean h;

        public d0(Context context, rf1 rf1, of1 of1, boolean z) {
            this.e = context;
            this.f = rf1;
            this.g = of1;
            this.h = z;
        }

        public void run() {
            if (dc1.c(this.e)) {
                jb1.f().b("Attempting to send crash report at time of crash...");
                this.g.d(this.f, this.h);
            }
        }
    }

    /* renamed from: gc1$e */
    class e implements Runnable {
        e() {
        }

        public void run() {
            gc1 gc1 = gc1.this;
            gc1.I(gc1.l0(new z()));
        }
    }

    /* renamed from: gc1$e0 */
    static class e0 implements FilenameFilter {
        private final String a;

        public e0(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".cls");
            return !str.equals(sb.toString()) && str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: gc1$f */
    class f implements FilenameFilter {
        final /* synthetic */ Set a;

        f(gc1 gc1, Set set) {
            this.a = set;
        }

        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.a.contains(str.substring(0, 35));
        }
    }

    /* renamed from: gc1$g */
    class g implements x {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        g(gc1 gc1, String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public void a(kf1 kf1) {
            lf1.p(kf1, this.a, this.b, this.c);
        }
    }

    /* renamed from: gc1$h */
    class h implements x {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;

        h(String str, String str2, String str3, String str4, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }

        public void a(kf1 kf1) {
            lf1.r(kf1, this.a, this.b, this.c, this.d, this.e, gc1.this.r);
        }
    }

    /* renamed from: gc1$i */
    class i implements x {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        i(gc1 gc1, String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public void a(kf1 kf1) {
            lf1.B(kf1, this.a, this.b, this.c);
        }
    }

    /* renamed from: gc1$j */
    class j extends y {
        j(String str) {
            super(str);
        }

        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* renamed from: gc1$k */
    class k implements x {
        final /* synthetic */ int a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ long d;
        final /* synthetic */ long e;
        final /* synthetic */ boolean f;
        final /* synthetic */ int g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;

        k(gc1 gc1, int i2, String str, int i3, long j, long j2, boolean z, int i4, String str2, String str3) {
            this.a = i2;
            this.b = str;
            this.c = i3;
            this.d = j;
            this.e = j2;
            this.f = z;
            this.g = i4;
            this.h = str2;
            this.i = str3;
        }

        public void a(kf1 kf1) {
            lf1.t(kf1, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    /* renamed from: gc1$l */
    class l implements x {
        final /* synthetic */ ed1 a;

        l(gc1 gc1, ed1 ed1) {
            this.a = ed1;
        }

        public void a(kf1 kf1) {
            lf1.C(kf1, this.a.b(), (String) null, (String) null);
        }
    }

    /* renamed from: gc1$m */
    class m implements x {
        final /* synthetic */ String a;

        m(String str) {
            this.a = str;
        }

        public void a(kf1 kf1) {
            lf1.s(kf1, this.a);
        }
    }

    /* renamed from: gc1$n */
    class n implements Callable<Void> {
        final /* synthetic */ long a;

        n(long j) {
            this.a = j;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            gc1.this.s.a("_ae", bundle);
            return null;
        }
    }

    /* renamed from: gc1$o */
    class o implements FilenameFilter {
        o() {
        }

        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* renamed from: gc1$p */
    class p implements Comparator<File> {
        p() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* renamed from: gc1$q */
    class q implements Comparator<File> {
        q() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* renamed from: gc1$r */
    class r implements mc1.a {
        r() {
        }

        public void a(eg1 eg1, Thread thread, Throwable th) {
            gc1.this.f0(eg1, thread, th);
        }
    }

    /* renamed from: gc1$s */
    class s implements Callable<e81<Void>> {
        final /* synthetic */ Date a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;
        final /* synthetic */ eg1 d;

        /* renamed from: gc1$s$a */
        class a implements d81<jg1, Void> {
            final /* synthetic */ Executor a;

            a(Executor executor) {
                this.a = executor;
            }

            /* renamed from: b */
            public e81<Void> a(jg1 jg1) {
                if (jg1 == null) {
                    jb1.f().i("Received null app settings, cannot send reports at crash time.");
                    return h81.e(null);
                }
                gc1.this.v0(jg1, true);
                return h81.g(gc1.this.r0(), gc1.this.t.n(this.a, pc1.getState(jg1)));
            }
        }

        s(Date date, Throwable th, Thread thread, eg1 eg1) {
            this.a = date;
            this.b = th;
            this.c = thread;
            this.d = eg1;
        }

        /* renamed from: a */
        public e81<Void> call() {
            gc1.this.d.a();
            long s = gc1.c0(this.a);
            gc1.this.t.k(this.b, this.c, s);
            gc1.this.F0(this.c, this.b, s);
            gc1.this.D0(this.a.getTime());
            mg1 b2 = this.d.b();
            int i = b2.b().a;
            int i2 = b2.b().b;
            gc1.this.J(i);
            gc1.this.L();
            gc1.this.B0(i2);
            if (!gc1.this.c.d()) {
                return h81.e(null);
            }
            Executor c2 = gc1.this.f.c();
            return this.d.a().s(c2, new a(c2));
        }
    }

    /* renamed from: gc1$t */
    class t implements d81<Void, Boolean> {
        t(gc1 gc1) {
        }

        /* renamed from: b */
        public e81<Boolean> a(Void voidR) {
            return h81.e(Boolean.TRUE);
        }
    }

    /* renamed from: gc1$u */
    class u implements d81<Boolean, Void> {
        final /* synthetic */ e81 a;
        final /* synthetic */ float b;

        /* renamed from: gc1$u$a */
        class a implements Callable<e81<Void>> {
            final /* synthetic */ Boolean a;

            /* renamed from: gc1$u$a$a  reason: collision with other inner class name */
            class C0114a implements d81<jg1, Void> {
                final /* synthetic */ List a;
                final /* synthetic */ boolean b;
                final /* synthetic */ Executor c;

                C0114a(List list, boolean z, Executor executor) {
                    this.a = list;
                    this.b = z;
                    this.c = executor;
                }

                /* renamed from: b */
                public e81<Void> a(jg1 jg1) {
                    if (jg1 == null) {
                        jb1.f().i("Received null app settings, cannot send reports during app startup.");
                    } else {
                        for (rf1 rf1 : this.a) {
                            if (rf1.d() == rf1.a.JAVA) {
                                gc1.y(jg1.e, rf1.g());
                            }
                        }
                        e81 unused = gc1.this.r0();
                        gc1.this.k.a(jg1).e(this.a, this.b, u.this.b);
                        gc1.this.t.n(this.c, pc1.getState(jg1));
                        gc1.this.x.e(null);
                    }
                    return h81.e(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            /* renamed from: a */
            public e81<Void> call() {
                List<rf1> d = gc1.this.n.d();
                if (!this.a.booleanValue()) {
                    jb1.f().b("Reports are being deleted.");
                    gc1.G(gc1.this.i0());
                    gc1.this.n.c(d);
                    gc1.this.t.m();
                    gc1.this.x.e(null);
                    return h81.e(null);
                }
                jb1.f().b("Reports are being sent.");
                boolean booleanValue = this.a.booleanValue();
                gc1.this.c.c(booleanValue);
                Executor c = gc1.this.f.c();
                return u.this.a.s(c, new C0114a(d, booleanValue, c));
            }
        }

        u(e81 e81, float f) {
            this.a = e81;
            this.b = f;
        }

        /* renamed from: b */
        public e81<Void> a(Boolean bool) {
            return gc1.this.f.i(new a(bool));
        }
    }

    /* renamed from: gc1$v */
    class v implements of1.b {
        v() {
        }

        public of1 a(jg1 jg1) {
            String str = jg1.c;
            String str2 = jg1.d;
            return new of1(jg1.e, gc1.this.j.a, pc1.getState(jg1), gc1.this.n, gc1.this.T(str, str2), gc1.this.o);
        }
    }

    /* renamed from: gc1$w */
    private static class w implements FilenameFilter {
        private w() {
        }

        /* synthetic */ w(j jVar) {
            this();
        }

        public boolean accept(File file, String str) {
            return !gc1.A.accept(file, str) && gc1.D.matcher(str).matches();
        }
    }

    /* renamed from: gc1$x */
    private interface x {
        void a(kf1 kf1);
    }

    /* renamed from: gc1$y */
    static class y implements FilenameFilter {
        private final String a;

        public y(String str) {
            this.a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: gc1$z */
    static class z implements FilenameFilter {
        z() {
        }

        public boolean accept(File file, String str) {
            return jf1.h.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    gc1(Context context, ec1 ec1, xe1 xe1, tc1 tc1, oc1 oc1, gf1 gf1, jc1 jc1, xb1 xb1, nf1 nf1, of1.b bVar, ib1 ib1, ah1 ah1, nb1 nb1, eg1 eg1) {
        gf1 gf12 = gf1;
        of1.b bVar2 = bVar;
        new AtomicBoolean(false);
        this.b = context;
        this.f = ec1;
        this.g = xe1;
        this.h = tc1;
        this.c = oc1;
        this.i = gf12;
        this.d = jc1;
        this.j = xb1;
        this.k = bVar2 == null ? F() : bVar2;
        this.p = ib1;
        this.r = ah1.a();
        this.s = nb1;
        this.e = new ed1();
        this.l = new a0(gf12);
        this.m = new id1(context, this.l);
        this.n = nf1 == null ? new nf1(new b0(this, (j) null)) : nf1;
        this.o = new c0(this, (j) null);
        ug1 ug1 = new ug1(1024, new wg1(10));
        this.q = ug1;
        this.t = cd1.b(context, tc1, gf1, xb1, this.m, this.e, ug1, eg1);
    }

    private void A(Map<String, String> map) {
        this.f.h(new c(map));
    }

    private void A0(String str, int i2) {
        File X = X();
        gd1.d(X, new y(str + "SessionEvent"), i2, C);
    }

    private void C(File[] fileArr, int i2, int i3) {
        jb1.f().b("Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String b02 = b0(file);
            jb1 f2 = jb1.f();
            f2.b("Closing session: " + b02);
            O0(file, b02, i3);
            i2++;
        }
    }

    private e81<Boolean> C0() {
        if (this.c.d()) {
            jb1.f().b("Automatic data collection is enabled. Allowing upload.");
            this.v.e(Boolean.FALSE);
            return h81.e(Boolean.TRUE);
        }
        jb1.f().b("Automatic data collection is disabled.");
        jb1.f().b("Notifying that unsent reports are available.");
        this.v.e(Boolean.TRUE);
        e81<TContinuationResult> r2 = this.c.g().r(new t(this));
        jb1.f().b("Waiting for send/deleteUnsentReports to be called.");
        return gd1.h(r2, this.w.a());
    }

    private void D(jf1 jf1) {
        if (jf1 != null) {
            try {
                jf1.a();
            } catch (IOException e2) {
                jb1.f().e("Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void D0(long j2) {
        try {
            File X = X();
            new File(X, ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            jb1.f().b("Could not write app exception marker.");
        }
    }

    private static void E(InputStream inputStream, kf1 kf1, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        kf1.Q(bArr);
    }

    private void E0(String str, long j2) {
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{ic1.i()});
        N0(str, "BeginSession", new g(this, str, format, j2));
        this.p.d(str, format, j2);
    }

    private of1.b F() {
        return new v();
    }

    /* access modifiers changed from: private */
    public void F0(Thread thread, Throwable th, long j2) {
        jf1 jf1;
        kf1 kf1 = null;
        try {
            String U = U();
            if (U == null) {
                jb1.f().d("Tried to write a fatal exception while no session was open.");
                dc1.j((Flushable) null, "Failed to flush to session begin file.");
                dc1.e((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            jf1 = new jf1(X(), U + "SessionCrash");
            try {
                kf1 = kf1.y(jf1);
                L0(kf1, thread, th, j2, "crash", true);
            } catch (Exception e2) {
                e = e2;
            }
            dc1.j(kf1, "Failed to flush to session begin file.");
            dc1.e(jf1, "Failed to close fatal exception file output stream.");
        } catch (Exception e3) {
            e = e3;
            jf1 = null;
            try {
                jb1.f().e("An error occurred in the fatal exception logger", e);
                dc1.j(kf1, "Failed to flush to session begin file.");
                dc1.e(jf1, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                dc1.j(kf1, "Failed to flush to session begin file.");
                dc1.e(jf1, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            jf1 = null;
            dc1.j(kf1, "Failed to flush to session begin file.");
            dc1.e(jf1, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public static void G(File[] fileArr) {
        if (fileArr != null) {
            for (File delete : fileArr) {
                delete.delete();
            }
        }
    }

    private void G0(kf1 kf1, String str) {
        for (String str2 : F) {
            File[] l0 = l0(new y(str + str2 + ".cls"));
            if (l0.length == 0) {
                jb1.f().b("Can't find " + str2 + " data for session ID " + str);
            } else {
                jb1.f().b("Collecting " + str2 + " data for session ID " + str);
                Q0(kf1, l0[0]);
            }
        }
    }

    private static void H0(kf1 kf1, File[] fileArr, String str) {
        Arrays.sort(fileArr, dc1.c);
        for (File file : fileArr) {
            try {
                jb1.f().b(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                Q0(kf1, file);
            } catch (Exception e2) {
                jb1.f().e("Error writting non-fatal to session.", e2);
            }
        }
    }

    private void J0(String str) {
        String d2 = this.h.d();
        xb1 xb1 = this.j;
        String str2 = xb1.e;
        String str3 = xb1.f;
        String str4 = d2;
        String str5 = str2;
        String str6 = str3;
        String a2 = this.h.a();
        int id = qc1.determineFrom(this.j.c).getId();
        N0(str, "SessionApp", new h(str4, str5, str6, a2, id));
        this.p.f(str, str4, str5, str6, a2, id, this.r);
    }

    private void K(int i2, boolean z2) {
        int i3 = !z2;
        z0(i3 + 8);
        File[] p0 = p0();
        if (p0.length <= i3) {
            jb1.f().b("No open sessions to be closed.");
            return;
        }
        String b02 = b0(p0[i3]);
        P0(b02);
        if (z2) {
            this.t.h();
        } else if (this.p.e(b02)) {
            P(b02);
            if (!this.p.a(b02)) {
                jb1.f().b("Could not finalize native session: " + b02);
            }
        }
        C(p0, i3, i2);
        this.t.d(V());
    }

    private void K0(String str) {
        Context S = S();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m2 = dc1.m();
        String str2 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v2 = dc1.v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean C2 = dc1.C(S);
        int n2 = dc1.n(S);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        N0(str, "SessionDevice", new k(this, m2, str2, availableProcessors, v2, blockCount, C2, n2, str3, str4));
        this.p.c(str, m2, str2, availableProcessors, v2, blockCount, C2, n2, str3, str4);
    }

    /* access modifiers changed from: private */
    public void L() {
        long V = V();
        String cc1 = new cc1(this.h).toString();
        jb1 f2 = jb1.f();
        f2.b("Opening a new session with ID " + cc1);
        this.p.h(cc1);
        E0(cc1, V);
        J0(cc1);
        M0(cc1);
        K0(cc1);
        this.m.g(cc1);
        this.t.g(s0(cc1), V);
    }

    private void L0(kf1 kf1, Thread thread, Throwable th, long j2, String str, boolean z2) {
        Thread[] threadArr;
        TreeMap treeMap;
        Map map;
        yg1 yg1 = new yg1(th, this.q);
        Context S = S();
        ac1 a2 = ac1.a(S);
        Float b2 = a2.b();
        int c2 = a2.c();
        boolean q2 = dc1.q(S);
        int i2 = S.getResources().getConfiguration().orientation;
        long v2 = dc1.v() - dc1.a(S);
        long b3 = dc1.b(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo k2 = dc1.k(S.getPackageName(), S);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = yg1.c;
        String str2 = this.j.b;
        String d2 = this.h.d();
        int i3 = 0;
        if (z2) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry next : allStackTraces.entrySet()) {
                threadArr2[i3] = (Thread) next.getKey();
                linkedList.add(this.q.a((StackTraceElement[]) next.getValue()));
                i3++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (!dc1.l(S, "com.crashlytics.CollectCustomKeys", true)) {
            map = new TreeMap();
        } else {
            map = this.e.a();
            if (map != null && map.size() > 1) {
                treeMap = new TreeMap(map);
                lf1.u(kf1, j2, str, yg1, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.m.c(), k2, i2, d2, str2, b2, c2, q2, v2, b3);
                this.m.a();
            }
        }
        treeMap = map;
        lf1.u(kf1, j2, str, yg1, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.m.c(), k2, i2, d2, str2, b2, c2, q2, v2, b3);
        this.m.a();
    }

    /* access modifiers changed from: private */
    public void M(Thread thread, Throwable th, long j2) {
        jf1 jf1;
        kf1 y2;
        String U = U();
        if (U == null) {
            jb1.f().b("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        kf1 kf1 = null;
        try {
            jb1.f().b("Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
            jf1 = new jf1(X(), U + "SessionEvent" + dc1.F(this.a.getAndIncrement()));
            try {
                y2 = kf1.y(jf1);
            } catch (Exception e2) {
                e = e2;
                try {
                    jb1.f().e("An error occurred in the non-fatal exception logger", e);
                    dc1.j(kf1, "Failed to flush to non-fatal file.");
                    dc1.e(jf1, "Failed to close non-fatal file output stream.");
                    A0(U, 64);
                } catch (Throwable th2) {
                    th = th2;
                    dc1.j(kf1, "Failed to flush to non-fatal file.");
                    dc1.e(jf1, "Failed to close non-fatal file output stream.");
                    throw th;
                }
            }
            try {
                L0(y2, thread, th, j2, "error", false);
                dc1.j(y2, "Failed to flush to non-fatal file.");
            } catch (Exception e3) {
                e = e3;
                kf1 = y2;
                jb1.f().e("An error occurred in the non-fatal exception logger", e);
                dc1.j(kf1, "Failed to flush to non-fatal file.");
                dc1.e(jf1, "Failed to close non-fatal file output stream.");
                A0(U, 64);
            } catch (Throwable th3) {
                th = th3;
                kf1 = y2;
                dc1.j(kf1, "Failed to flush to non-fatal file.");
                dc1.e(jf1, "Failed to close non-fatal file output stream.");
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            jf1 = null;
            jb1.f().e("An error occurred in the non-fatal exception logger", e);
            dc1.j(kf1, "Failed to flush to non-fatal file.");
            dc1.e(jf1, "Failed to close non-fatal file output stream.");
            A0(U, 64);
        } catch (Throwable th4) {
            th = th4;
            jf1 = null;
            dc1.j(kf1, "Failed to flush to non-fatal file.");
            dc1.e(jf1, "Failed to close non-fatal file output stream.");
            throw th;
        }
        dc1.e(jf1, "Failed to close non-fatal file output stream.");
        try {
            A0(U, 64);
        } catch (Exception e5) {
            jb1.f().e("An error occurred when trimming non-fatal files.", e5);
        }
    }

    private void M0(String str) {
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        boolean E2 = dc1.E(S());
        N0(str, "SessionOS", new i(this, str2, str3, E2));
        this.p.g(str, str2, str3, E2);
    }

    private void N0(String str, String str2, x xVar) {
        jf1 jf1;
        kf1 kf1 = null;
        try {
            jf1 = new jf1(X(), str + str2);
            try {
                kf1 = kf1.y(jf1);
                xVar.a(kf1);
                dc1.j(kf1, "Failed to flush to session " + str2 + " file.");
                dc1.e(jf1, "Failed to close session " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                dc1.j(kf1, "Failed to flush to session " + str2 + " file.");
                dc1.e(jf1, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jf1 = null;
            dc1.j(kf1, "Failed to flush to session " + str2 + " file.");
            dc1.e(jf1, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    private File[] O(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void O0(File file, String str, int i2) {
        jb1 f2 = jb1.f();
        f2.b("Collecting session parts for ID " + str);
        File[] l0 = l0(new y(str + "SessionCrash"));
        boolean z2 = l0 != null && l0.length > 0;
        jb1.f().b(String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z2)}));
        File[] l02 = l0(new y(str + "SessionEvent"));
        boolean z3 = l02 != null && l02.length > 0;
        jb1.f().b(String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z3)}));
        if (z2 || z3) {
            y0(file, str, d0(str, l02, i2), z2 ? l0[0] : null);
        } else {
            jb1 f3 = jb1.f();
            f3.b("No events present for session ID " + str);
        }
        jb1 f4 = jb1.f();
        f4.b("Removing session part files for ID " + str);
        G(o0(str));
    }

    private void P(String str) {
        jb1 f2 = jb1.f();
        f2.b("Finalizing native report for session " + str);
        lb1 b2 = this.p.b(str);
        File e2 = b2.e();
        if (e2 == null || !e2.exists()) {
            jb1 f3 = jb1.f();
            f3.i("No minidump data found for session " + str);
            return;
        }
        long lastModified = e2.lastModified();
        id1 id1 = new id1(this.b, this.l, str);
        File file = new File(Z(), str);
        if (!file.mkdirs()) {
            jb1.f().b("Couldn't create native sessions directory");
            return;
        }
        D0(lastModified);
        List<xc1> Y = Y(b2, str, S(), X(), id1.c());
        yc1.b(file, Y);
        this.t.c(s0(str), Y);
        id1.a();
    }

    private void P0(String str) {
        N0(str, "SessionUser", new l(this, e0(str)));
    }

    private static void Q0(kf1 kf1, File file) {
        if (!file.exists()) {
            jb1 f2 = jb1.f();
            f2.d("Tried to include a file that doesn't exist: " + file.getName());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                E(fileInputStream2, kf1, (int) file.length());
                dc1.e(fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                dc1.e(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dc1.e(fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    private static boolean R() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context S() {
        return this.b;
    }

    /* access modifiers changed from: private */
    public uf1 T(String str, String str2) {
        String u2 = dc1.u(S(), "com.crashlytics.ApiEndpoint");
        return new tf1(new vf1(u2, str, this.g, ic1.i()), new wf1(u2, str2, this.g, ic1.i()));
    }

    /* access modifiers changed from: private */
    public String U() {
        File[] p0 = p0();
        if (p0.length > 0) {
            return b0(p0[0]);
        }
        return null;
    }

    private static long V() {
        return c0(new Date());
    }

    static List<xc1> Y(lb1 lb1, String str, Context context, File file, byte[] bArr) {
        byte[] bArr2;
        wc1 wc1 = new wc1(file);
        File b2 = wc1.b(str);
        File a2 = wc1.a(str);
        try {
            bArr2 = re1.a(lb1.d(), context);
        } catch (Exception unused) {
            bArr2 = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bc1("logs_file", "logs", bArr));
        arrayList.add(new bc1("binary_images_file", "binaryImages", bArr2));
        arrayList.add(new sc1("crash_meta_file", "metadata", lb1.g()));
        arrayList.add(new sc1("session_meta_file", "session", lb1.f()));
        arrayList.add(new sc1("app_meta_file", "app", lb1.a()));
        arrayList.add(new sc1("device_meta_file", "device", lb1.c()));
        arrayList.add(new sc1("os_meta_file", "os", lb1.b()));
        arrayList.add(new sc1("minidump_file", "minidump", lb1.e()));
        arrayList.add(new sc1("user_meta_file", "user", b2));
        arrayList.add(new sc1("keys_file", "keys", a2));
        return arrayList;
    }

    static String b0(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: private */
    public static long c0(Date date) {
        return date.getTime() / 1000;
    }

    private File[] d0(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        jb1.f().b(String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i2)}));
        A0(str, i2);
        return l0(new y(str + "SessionEvent"));
    }

    private ed1 e0(String str) {
        return g0() ? this.e : new wc1(X()).e(str);
    }

    private File[] k0(File file, FilenameFilter filenameFilter) {
        return O(file.listFiles(filenameFilter));
    }

    /* access modifiers changed from: private */
    public File[] l0(FilenameFilter filenameFilter) {
        return k0(X(), filenameFilter);
    }

    private File[] o0(String str) {
        return l0(new e0(str));
    }

    private File[] p0() {
        File[] n0 = n0();
        Arrays.sort(n0, B);
        return n0;
    }

    private e81<Void> q0(long j2) {
        if (!R()) {
            return h81.c(new ScheduledThreadPoolExecutor(1), new n(j2));
        }
        jb1.f().b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        return h81.e(null);
    }

    /* access modifiers changed from: private */
    public e81<Void> r0() {
        ArrayList arrayList = new ArrayList();
        for (File file : i0()) {
            try {
                arrayList.add(q0(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                jb1.f().b("Could not parse timestamp from file " + file.getName());
            }
            file.delete();
        }
        return h81.f(arrayList);
    }

    private static String s0(String str) {
        return str.replaceAll("-", "");
    }

    private void u0(File[] fileArr, Set<String> set) {
        jb1 f2;
        StringBuilder sb;
        String str;
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = D.matcher(name);
            if (!matcher.matches()) {
                f2 = jb1.f();
                sb = new StringBuilder();
                str = "Deleting unknown file: ";
            } else if (!set.contains(matcher.group(1))) {
                f2 = jb1.f();
                sb = new StringBuilder();
                str = "Trimming session file: ";
            }
            sb.append(str);
            sb.append(name);
            f2.b(sb.toString());
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    public void v0(jg1 jg1, boolean z2) {
        Context S = S();
        of1 a2 = this.k.a(jg1);
        for (File file : j0()) {
            y(jg1.e, file);
            this.f.g(new d0(S, new sf1(file, E), a2, z2));
        }
    }

    /* access modifiers changed from: private */
    public static void y(String str, File file) {
        if (str != null) {
            z(file, new m(str));
        }
    }

    private void y0(File file, String str, File[] fileArr, File file2) {
        jf1 jf1;
        boolean z2 = file2 != null;
        File W = z2 ? W() : a0();
        if (!W.exists()) {
            W.mkdirs();
        }
        try {
            jf1 = new jf1(W, str);
            try {
                kf1 y2 = kf1.y(jf1);
                jb1.f().b("Collecting SessionStart data for session ID " + str);
                Q0(y2, file);
                y2.e0(4, V());
                y2.B(5, z2);
                y2.c0(11, 1);
                y2.G(12, 3);
                G0(y2, str);
                H0(y2, fileArr, str);
                if (z2) {
                    Q0(y2, file2);
                }
                dc1.j(y2, "Error flushing session file stream");
                dc1.e(jf1, "Failed to close CLS file");
            } catch (Exception e2) {
                e = e2;
                try {
                    jb1.f().e("Failed to write session file for session ID: " + str, e);
                    dc1.j((Flushable) null, "Error flushing session file stream");
                    D(jf1);
                } catch (Throwable th) {
                    th = th;
                    dc1.j((Flushable) null, "Error flushing session file stream");
                    dc1.e(jf1, "Failed to close CLS file");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            jf1 = null;
            jb1.f().e("Failed to write session file for session ID: " + str, e);
            dc1.j((Flushable) null, "Error flushing session file stream");
            D(jf1);
        } catch (Throwable th2) {
            th = th2;
            jf1 = null;
            dc1.j((Flushable) null, "Error flushing session file stream");
            dc1.e(jf1, "Failed to close CLS file");
            throw th;
        }
    }

    private static void z(File file, x xVar) {
        FileOutputStream fileOutputStream;
        kf1 kf1 = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                kf1 = kf1.y(fileOutputStream);
                xVar.a(kf1);
                dc1.j(kf1, "Failed to flush to append to " + file.getPath());
                dc1.e(fileOutputStream, "Failed to close " + file.getPath());
            } catch (Throwable th) {
                th = th;
                dc1.j(kf1, "Failed to flush to append to " + file.getPath());
                dc1.e(fileOutputStream, "Failed to close " + file.getPath());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            dc1.j(kf1, "Failed to flush to append to " + file.getPath());
            dc1.e(fileOutputStream, "Failed to close " + file.getPath());
            throw th;
        }
    }

    private void z0(int i2) {
        HashSet hashSet = new HashSet();
        File[] p0 = p0();
        int min = Math.min(i2, p0.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(b0(p0[i3]));
        }
        this.m.b(hashSet);
        u0(l0(new w((j) null)), hashSet);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        this.f.g(new e());
    }

    /* access modifiers changed from: package-private */
    public void B0(int i2) {
        int f2 = i2 - gd1.f(Z(), W(), i2, C);
        gd1.d(X(), A, f2 - gd1.c(a0(), f2, C), C);
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        if (!this.d.c()) {
            String U = U();
            return U != null && this.p.e(U);
        }
        jb1.f().b("Found previous crash marker.");
        this.d.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void I(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            jb1.f().b("Found invalid session part file: " + file);
            hashSet.add(b0(file));
        }
        if (!hashSet.isEmpty()) {
            for (File file2 : l0(new f(this, hashSet))) {
                jb1.f().b("Deleting invalid session file: " + file2);
                file2.delete();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I0(Thread thread, Throwable th) {
        this.f.g(new b(new Date(), th, thread));
    }

    /* access modifiers changed from: package-private */
    public void J(int i2) {
        K(i2, true);
    }

    /* access modifiers changed from: package-private */
    public void N(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, eg1 eg1) {
        t0();
        mc1 mc1 = new mc1(new r(), eg1, uncaughtExceptionHandler);
        this.u = mc1;
        Thread.setDefaultUncaughtExceptionHandler(mc1);
    }

    /* access modifiers changed from: package-private */
    public boolean Q(int i2) {
        this.f.b();
        if (g0()) {
            jb1.f().b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        jb1.f().b("Finalizing previously open sessions.");
        try {
            K(i2, false);
            jb1.f().b("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            jb1.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void R0(long j2, String str) {
        this.f.h(new a(j2, str));
    }

    /* access modifiers changed from: package-private */
    public File W() {
        return new File(X(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public File X() {
        return this.i.b();
    }

    /* access modifiers changed from: package-private */
    public File Z() {
        return new File(X(), "native-sessions");
    }

    /* access modifiers changed from: package-private */
    public File a0() {
        return new File(X(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public synchronized void f0(eg1 eg1, Thread thread, Throwable th) {
        jb1 f2 = jb1.f();
        f2.b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            gd1.a(this.f.i(new s(new Date(), th, thread, eg1)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g0() {
        mc1 mc1 = this.u;
        return mc1 != null && mc1.a();
    }

    /* access modifiers changed from: package-private */
    public File[] i0() {
        return l0(z);
    }

    /* access modifiers changed from: package-private */
    public File[] j0() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, k0(W(), A));
        Collections.addAll(linkedList, k0(a0(), A));
        Collections.addAll(linkedList, k0(X(), A));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    public File[] m0() {
        return O(Z().listFiles());
    }

    /* access modifiers changed from: package-private */
    public File[] n0() {
        return l0(y);
    }

    /* access modifiers changed from: package-private */
    public void t0() {
        this.f.h(new d());
    }

    /* access modifiers changed from: package-private */
    public void w0(String str, String str2) {
        try {
            this.e.d(str, str2);
            A(this.e.a());
        } catch (IllegalArgumentException e2) {
            Context context = this.b;
            if (context == null || !dc1.A(context)) {
                jb1.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public e81<Void> x0(float f2, e81<jg1> e81) {
        if (!this.n.a()) {
            jb1.f().b("No reports are available.");
            this.v.e(Boolean.FALSE);
            return h81.e(null);
        }
        jb1.f().b("Unsent reports are available.");
        return C0().r(new u(e81, f2));
    }
}
