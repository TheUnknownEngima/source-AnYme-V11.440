package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ld  reason: default package */
public final class ld implements Closeable {
    /* access modifiers changed from: private */
    public final File e;
    private final File f;
    private final File g;
    private final File h;
    private final int i;
    private long j;
    /* access modifiers changed from: private */
    public final int k;
    private long l = 0;
    /* access modifiers changed from: private */
    public Writer m;
    private final LinkedHashMap<String, d> n = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */
    public int o;
    private long p = 0;
    final ThreadPoolExecutor q = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((a) null));
    private final Callable<Void> r = new a();

    /* renamed from: ld$a */
    class a implements Callable<Void> {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                ld r0 = defpackage.ld.this
                monitor-enter(r0)
                ld r1 = defpackage.ld.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.m     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                ld r1 = defpackage.ld.this     // Catch:{ all -> 0x0028 }
                r1.Y()     // Catch:{ all -> 0x0028 }
                ld r1 = defpackage.ld.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.K()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                ld r1 = defpackage.ld.this     // Catch:{ all -> 0x0028 }
                r1.Q()     // Catch:{ all -> 0x0028 }
                ld r1 = defpackage.ld.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.o = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.a.call():java.lang.Void");
        }
    }

    /* renamed from: ld$b */
    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: ld$c */
    public final class c {
        /* access modifiers changed from: private */
        public final d a;
        /* access modifiers changed from: private */
        public final boolean[] b;
        private boolean c;

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[ld.this.k];
        }

        /* synthetic */ c(ld ldVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            ld.this.A(this, false);
        }

        public void b() {
            if (!this.c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() {
            ld.this.A(this, true);
            this.c = true;
        }

        public File f(int i) {
            File k;
            synchronized (ld.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    k = this.a.k(i);
                    if (!ld.this.e.exists()) {
                        ld.this.e.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }
    }

    /* renamed from: ld$d */
    private final class d {
        /* access modifiers changed from: private */
        public final String a;
        /* access modifiers changed from: private */
        public final long[] b;
        File[] c;
        File[] d;
        /* access modifiers changed from: private */
        public boolean e;
        /* access modifiers changed from: private */
        public c f;
        /* access modifiers changed from: private */
        public long g;

        private d(String str) {
            this.a = str;
            this.b = new long[ld.this.k];
            this.c = new File[ld.this.k];
            this.d = new File[ld.this.k];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < ld.this.k; i++) {
                sb.append(i);
                this.c[i] = new File(ld.this.e, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(ld.this.e, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ d(ld ldVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == ld.this.k) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m(strArr);
                        throw null;
                    }
                }
                return;
            }
            m(strArr);
            throw null;
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    /* renamed from: ld$e */
    public final class e {
        private final File[] a;

        private e(ld ldVar, String str, long j, File[] fileArr, long[] jArr) {
            this.a = fileArr;
        }

        /* synthetic */ e(ld ldVar, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(ldVar, str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.a[i];
        }
    }

    private ld(File file, int i2, int i3, long j2) {
        File file2 = file;
        this.e = file2;
        this.i = i2;
        this.f = new File(file2, "journal");
        this.g = new File(file2, "journal.tmp");
        this.h = new File(file2, "journal.bkp");
        this.k = i3;
        this.j = j2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A(defpackage.ld.c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            ld$d r0 = r10.a     // Catch:{ all -> 0x010e }
            ld$c r1 = r0.f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.k     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.k     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.l     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.l = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            C(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.o     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.o = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            defpackage.ld.c unused = r0.f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.p     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.p = r1     // Catch:{ all -> 0x010e }
            long unused = r0.g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, ld$d> r10 = r9.n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.m     // Catch:{ all -> 0x010e }
            G(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.l     // Catch:{ all -> 0x010e }
            long r0 = r9.j     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.K()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.q     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.r     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.A(ld$c, boolean):void");
    }

    private static void C(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized defpackage.ld.c F(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.t()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, ld$d> r0 = r5.n     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            ld$d r0 = (defpackage.ld.d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            ld$d r0 = new ld$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, ld$d> r7 = r5.n     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            ld$c r7 = r0.f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            ld$c r7 = new ld$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            defpackage.ld.c unused = r0.f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.m     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.m     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.m     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.m     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.m     // Catch:{ all -> 0x005d }
            G(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.F(java.lang.String, long):ld$c");
    }

    @TargetApi(26)
    private static void G(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    public boolean K() {
        int i2 = this.o;
        return i2 >= 2000 && i2 >= this.n.size();
    }

    public static ld L(File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    V(file2, file3, false);
                }
            }
            ld ldVar = new ld(file, i2, i3, j2);
            if (ldVar.f.exists()) {
                try {
                    ldVar.N();
                    ldVar.M();
                    return ldVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    ldVar.B();
                }
            }
            file.mkdirs();
            ld ldVar2 = new ld(file, i2, i3, j2);
            ldVar2.Q();
            return ldVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void M() {
        C(this.g);
        Iterator<d> it = this.n.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f == null) {
                while (i2 < this.k) {
                    this.l += next.b[i2];
                    i2++;
                }
            } else {
                c unused = next.f = null;
                while (i2 < this.k) {
                    C(next.j(i2));
                    C(next.k(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.o = r0 - r9.n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.h() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.m = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f, true), defpackage.nd.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void N() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            md r1 = new md
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f
            r2.<init>(r3)
            java.nio.charset.Charset r3 = defpackage.nd.a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.i()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.i()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.i()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.i()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.i()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.i     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.k     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.i()     // Catch:{ EOFException -> 0x005f }
            r9.P(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, ld$d> r2 = r9.n     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.o = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.h()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.Q()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = defpackage.nd.a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.m = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            defpackage.nd.a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            defpackage.nd.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.N():void");
    }

    private void P(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            d dVar = this.n.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, (a) null);
                this.n.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.e = true;
                c unused2 = dVar.f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c unused3 = dVar.f = new c(this, dVar, (a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void Q() {
        String str;
        if (this.m != null) {
            z(this.m);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), nd.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.n.values()) {
                if (next.f != null) {
                    str = "DIRTY " + next.a + 10;
                } else {
                    str = "CLEAN " + next.a + next.l() + 10;
                }
                bufferedWriter.write(str);
            }
            z(bufferedWriter);
            if (this.f.exists()) {
                V(this.f, this.h, true);
            }
            V(this.g, this.f, false);
            this.h.delete();
            this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), nd.a));
        } catch (Throwable th) {
            z(bufferedWriter);
            throw th;
        }
    }

    private static void V(File file, File file2, boolean z) {
        if (z) {
            C(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        while (this.l > this.j) {
            U((String) this.n.entrySet().iterator().next().getKey());
        }
    }

    private void t() {
        if (this.m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void z(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void B() {
        close();
        nd.b(this.e);
    }

    public c E(String str) {
        return F(str, -1);
    }

    public synchronized e J(String str) {
        t();
        d dVar = this.n.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File exists : dVar.c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.o++;
        this.m.append("READ");
        this.m.append(' ');
        this.m.append(str);
        this.m.append(10);
        if (K()) {
            this.q.submit(this.r);
        }
        return new e(this, str, dVar.g, dVar.c, dVar.b, (a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean U(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.t()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, ld$d> r0 = r7.n     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            ld$d r0 = (defpackage.ld.d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            ld$c r2 = r0.f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.k     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.l     // Catch:{ all -> 0x008f }
            long[] r4 = r0.b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.l = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.o     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.o = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.m     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.m     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.m     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.m     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, ld$d> r0 = r7.n     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.K()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.q     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.r     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.U(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.m != null) {
            Iterator it = new ArrayList(this.n.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            Y();
            z(this.m);
            this.m = null;
        }
    }
}
