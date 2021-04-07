package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: nb2  reason: default package */
public final class nb2 implements Closeable, Flushable {
    static final Pattern y = Pattern.compile("[a-z0-9_-]{1,120}");
    final xc2 e;
    final File f;
    private final File g;
    private final File h;
    private final File i;
    private final int j;
    private long k;
    final int l;
    private long m = 0;
    od2 n;
    final LinkedHashMap<String, d> o = new LinkedHashMap<>(0, 0.75f, true);
    int p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    private long v = 0;
    private final Executor w;
    private final Runnable x = new a();

    /* renamed from: nb2$a */
    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.e.u = true;
            r5.e.n = defpackage.wd2.c(defpackage.wd2.b());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                nb2 r0 = defpackage.nb2.this
                monitor-enter(r0)
                nb2 r1 = defpackage.nb2.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.r     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                nb2 r4 = defpackage.nb2.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.s     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                nb2 r1 = defpackage.nb2.this     // Catch:{ IOException -> 0x001d }
                r1.K()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                nb2 r1 = defpackage.nb2.this     // Catch:{ all -> 0x0045 }
                r1.t = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                nb2 r1 = defpackage.nb2.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.z()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                nb2 r1 = defpackage.nb2.this     // Catch:{ IOException -> 0x0033 }
                r1.F()     // Catch:{ IOException -> 0x0033 }
                nb2 r1 = defpackage.nb2.this     // Catch:{ IOException -> 0x0033 }
                r1.p = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                nb2 r1 = defpackage.nb2.this     // Catch:{ all -> 0x0045 }
                r1.u = r3     // Catch:{ all -> 0x0045 }
                nb2 r1 = defpackage.nb2.this     // Catch:{ all -> 0x0045 }
                ce2 r2 = defpackage.wd2.b()     // Catch:{ all -> 0x0045 }
                od2 r2 = defpackage.wd2.c(r2)     // Catch:{ all -> 0x0045 }
                r1.n = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.a.run():void");
        }
    }

    /* renamed from: nb2$b */
    class b extends ob2 {
        static {
            Class<nb2> cls = nb2.class;
        }

        b(ce2 ce2) {
            super(ce2);
        }

        /* access modifiers changed from: protected */
        public void a(IOException iOException) {
            nb2.this.q = true;
        }
    }

    /* renamed from: nb2$c */
    public final class c {
        final d a;
        final boolean[] b;
        private boolean c;

        /* renamed from: nb2$c$a */
        class a extends ob2 {
            a(ce2 ce2) {
                super(ce2);
            }

            /* access modifiers changed from: protected */
            public void a(IOException iOException) {
                synchronized (nb2.this) {
                    c.this.c();
                }
            }
        }

        c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[nb2.this.l];
        }

        public void a() {
            synchronized (nb2.this) {
                if (!this.c) {
                    if (this.a.f == this) {
                        nb2.this.b(this, false);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void b() {
            synchronized (nb2.this) {
                if (!this.c) {
                    if (this.a.f == this) {
                        nb2.this.b(this, true);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.a.f == this) {
                int i = 0;
                while (true) {
                    nb2 nb2 = nb2.this;
                    if (i < nb2.l) {
                        try {
                            nb2.e.f(this.a.d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.a.f = null;
                        return;
                    }
                }
            }
        }

        public ce2 d(int i) {
            synchronized (nb2.this) {
                if (this.c) {
                    throw new IllegalStateException();
                } else if (this.a.f != this) {
                    ce2 b2 = wd2.b();
                    return b2;
                } else {
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    try {
                        a aVar = new a(nb2.this.e.b(this.a.d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return wd2.b();
                    }
                }
            }
        }
    }

    /* renamed from: nb2$d */
    private final class d {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        c f;
        long g;

        d(String str) {
            this.a = str;
            int i = nb2.this.l;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < nb2.this.l; i2++) {
                sb.append(i2);
                this.c[i2] = new File(nb2.this.f, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(nb2.this.f, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            if (strArr.length == nb2.this.l) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        a(strArr);
                        throw null;
                    }
                }
                return;
            }
            a(strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public e c() {
            if (Thread.holdsLock(nb2.this)) {
                de2[] de2Arr = new de2[nb2.this.l];
                long[] jArr = (long[]) this.b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < nb2.this.l) {
                    try {
                        de2Arr[i2] = nb2.this.e.a(this.c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < nb2.this.l && de2Arr[i] != null) {
                            ib2.g(de2Arr[i]);
                            i++;
                        }
                        try {
                            nb2.this.J(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new e(this.a, this.g, de2Arr, jArr);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public void d(od2 od2) {
            for (long I0 : this.b) {
                od2.w(32).I0(I0);
            }
        }
    }

    /* renamed from: nb2$e */
    public final class e implements Closeable {
        private final String e;
        private final long f;
        private final de2[] g;

        e(String str, long j, de2[] de2Arr, long[] jArr) {
            this.e = str;
            this.f = j;
            this.g = de2Arr;
        }

        @Nullable
        public c a() {
            return nb2.this.l(this.e, this.f);
        }

        public de2 b(int i) {
            return this.g[i];
        }

        public void close() {
            for (de2 g2 : this.g) {
                ib2.g(g2);
            }
        }
    }

    static {
        Class<nb2> cls = nb2.class;
    }

    nb2(xc2 xc2, File file, int i2, int i3, long j2, Executor executor) {
        this.e = xc2;
        this.f = file;
        this.j = i2;
        this.g = new File(file, "journal");
        this.h = new File(file, "journal.tmp");
        this.i = new File(file, "journal.bkp");
        this.l = i3;
        this.k = j2;
        this.w = executor;
    }

    private od2 A() {
        return wd2.c(new b(this.e.g(this.g)));
    }

    private void B() {
        this.e.f(this.h);
        Iterator<d> it = this.o.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f == null) {
                while (i2 < this.l) {
                    this.m += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < this.l) {
                    this.e.f(next.c[i2]);
                    this.e.f(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.p = r0 - r9.o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.v() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.n = A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            xc2 r1 = r9.e
            java.io.File r2 = r9.g
            de2 r1 = r1.a(r2)
            pd2 r1 = defpackage.wd2.d(r1)
            java.lang.String r2 = r1.l0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.l0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r1.l0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r1.l0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r1.l0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.j     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.l     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.l0()     // Catch:{ EOFException -> 0x005d }
            r9.E(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, nb2$d> r2 = r9.o     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.p = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.v()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.F()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            od2 r0 = r9.A()     // Catch:{ all -> 0x00a8 }
            r9.n = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            defpackage.ib2.g(r1)
            return
        L_0x007a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r7.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a8 }
            r7.append(r2)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r3)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r5)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a8 }
            throw r4     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            defpackage.ib2.g(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.C():void");
    }

    private void E(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            d dVar = this.o.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                this.o.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.e = true;
                dVar.f = null;
                dVar.b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    private void L(String str) {
        if (!y.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private synchronized void a() {
        if (t()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static nb2 h(xc2 xc2, File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            return new nb2(xc2, file, i2, i3, j2, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), ib2.G("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public synchronized void F() {
        if (this.n != null) {
            this.n.close();
        }
        od2 c2 = wd2.c(this.e.b(this.h));
        try {
            c2.O("libcore.io.DiskLruCache").w(10);
            c2.O("1").w(10);
            c2.I0((long) this.j).w(10);
            c2.I0((long) this.l).w(10);
            c2.w(10);
            for (d next : this.o.values()) {
                if (next.f != null) {
                    c2.O("DIRTY").w(32);
                    c2.O(next.a);
                } else {
                    c2.O("CLEAN").w(32);
                    c2.O(next.a);
                    next.d(c2);
                }
                c2.w(10);
            }
            c2.close();
            if (this.e.d(this.g)) {
                this.e.e(this.g, this.i);
            }
            this.e.e(this.h, this.g);
            this.e.f(this.i);
            this.n = A();
            this.q = false;
            this.u = false;
        } catch (Throwable th) {
            c2.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean G(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.r()     // Catch:{ all -> 0x0029 }
            r6.a()     // Catch:{ all -> 0x0029 }
            r6.L(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, nb2$d> r0 = r6.o     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            nb2$d r7 = (defpackage.nb2.d) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.J(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.m     // Catch:{ all -> 0x0029 }
            long r3 = r6.k     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.t = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.G(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean J(d dVar) {
        c cVar = dVar.f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i2 = 0; i2 < this.l; i2++) {
            this.e.f(dVar.c[i2]);
            long j2 = this.m;
            long[] jArr = dVar.b;
            this.m = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.p++;
        this.n.O("REMOVE").w(32).O(dVar.a).w(10);
        this.o.remove(dVar.a);
        if (z()) {
            this.w.execute(this.x);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void K() {
        while (this.m > this.k) {
            J(this.o.values().iterator().next());
        }
        this.t = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(defpackage.nb2.c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            nb2$d r0 = r10.a     // Catch:{ all -> 0x00fb }
            nb2$c r1 = r0.f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.l     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            xc2 r3 = r9.e     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.d(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.l     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            xc2 r2 = r9.e     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.d(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            xc2 r3 = r9.e     // Catch:{ all -> 0x00fb }
            r3.e(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            xc2 r10 = r9.e     // Catch:{ all -> 0x00fb }
            long r5 = r10.h(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.m     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.m = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            xc2 r2 = r9.e     // Catch:{ all -> 0x00fb }
            r2.f(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.p     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.p = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.e = r1     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            od2 r10 = r10.O(r1)     // Catch:{ all -> 0x00fb }
            r10.w(r3)     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x00fb }
            r10.O(r1)     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            r0.d(r10)     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            r10.w(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.v     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.v = r1     // Catch:{ all -> 0x00fb }
            r0.g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, nb2$d> r10 = r9.o     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            od2 r10 = r10.O(r11)     // Catch:{ all -> 0x00fb }
            r10.w(r3)     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x00fb }
            r10.O(r11)     // Catch:{ all -> 0x00fb }
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            r10.w(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            od2 r10 = r9.n     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.m     // Catch:{ all -> 0x00fb }
            long r0 = r9.k     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.z()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.w     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.x     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.b(nb2$c, boolean):void");
    }

    public synchronized void close() {
        if (this.r) {
            if (!this.s) {
                for (d dVar : (d[]) this.o.values().toArray(new d[this.o.size()])) {
                    if (dVar.f != null) {
                        dVar.f.a();
                    }
                }
                K();
                this.n.close();
                this.n = null;
                this.s = true;
                return;
            }
        }
        this.s = true;
    }

    public synchronized void flush() {
        if (this.r) {
            a();
            K();
            this.n.flush();
        }
    }

    public void i() {
        close();
        this.e.c(this.f);
    }

    @Nullable
    public c k(String str) {
        return l(str, -1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.nb2.c l(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.r()     // Catch:{ all -> 0x0074 }
            r5.a()     // Catch:{ all -> 0x0074 }
            r5.L(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, nb2$d> r0 = r5.o     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            nb2$d r0 = (defpackage.nb2.d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            nb2$c r7 = r0.f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.t     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.u     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            od2 r7 = r5.n     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            od2 r7 = r7.O(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            od2 r7 = r7.w(r8)     // Catch:{ all -> 0x0074 }
            od2 r7 = r7.O(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.w(r8)     // Catch:{ all -> 0x0074 }
            od2 r7 = r5.n     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.q     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            nb2$d r0 = new nb2$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, nb2$d> r7 = r5.o     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            nb2$c r6 = new nb2$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.w     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.x     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.l(java.lang.String, long):nb2$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.nb2.e m(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.r()     // Catch:{ all -> 0x0050 }
            r3.a()     // Catch:{ all -> 0x0050 }
            r3.L(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, nb2$d> r0 = r3.o     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            nb2$d r0 = (defpackage.nb2.d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            nb2$e r0 = r0.c()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.p     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.p = r1     // Catch:{ all -> 0x0050 }
            od2 r1 = r3.n     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            od2 r1 = r1.O(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            od2 r1 = r1.w(r2)     // Catch:{ all -> 0x0050 }
            od2 r4 = r1.O(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.w(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.z()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.w     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.x     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.m(java.lang.String):nb2$e");
    }

    public synchronized void r() {
        if (!this.r) {
            if (this.e.d(this.i)) {
                if (this.e.d(this.g)) {
                    this.e.f(this.i);
                } else {
                    this.e.e(this.i, this.g);
                }
            }
            if (this.e.d(this.g)) {
                try {
                    C();
                    B();
                    this.r = true;
                    return;
                } catch (IOException e2) {
                    dd2 j2 = dd2.j();
                    j2.q(5, "DiskLruCache " + this.f + " is corrupt: " + e2.getMessage() + ", removing", e2);
                    i();
                    this.s = false;
                } catch (Throwable th) {
                    this.s = false;
                    throw th;
                }
            }
            F();
            this.r = true;
        }
    }

    public synchronized boolean t() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        int i2 = this.p;
        return i2 >= 2000 && i2 >= this.o.size();
    }
}
