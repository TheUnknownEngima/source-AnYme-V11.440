package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import defpackage.n6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class l {
    @Deprecated
    protected volatile m6 a;
    private Executor b;
    private Executor c;
    private n6 d;
    private final i e = f();
    private boolean f;
    boolean g;
    @Deprecated
    protected List<b> h;
    private final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> j = new ThreadLocal<>();
    private final Map<String, Object> k = new ConcurrentHashMap();

    public static class a<T extends l> {
        private final Class<T> a;
        private final String b;
        private final Context c;
        private ArrayList<b> d;
        private Executor e;
        private Executor f;
        private n6.c g;
        private boolean h;
        private c i = c.AUTOMATIC;
        private boolean j;
        private boolean k = true;
        private boolean l;
        private final d m = new d();
        private Set<Integer> n;
        private Set<Integer> o;
        private String p;
        private File q;

        a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }

        public a<T> b(e6... e6VarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (e6 e6Var : e6VarArr) {
                this.o.add(Integer.valueOf(e6Var.a));
                this.o.add(Integer.valueOf(e6Var.b));
            }
            this.m.b(e6VarArr);
            return this;
        }

        public a<T> c() {
            this.h = true;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            if (r1 != null) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T d() {
            /*
                r21 = this;
                r0 = r21
                android.content.Context r1 = r0.c
                if (r1 == 0) goto L_0x00ec
                java.lang.Class<T> r1 = r0.a
                if (r1 == 0) goto L_0x00e4
                java.util.concurrent.Executor r1 = r0.e
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = r0.f
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = defpackage.v.e()
                r0.f = r1
            L_0x0018:
                r0.e = r1
                goto L_0x002f
            L_0x001b:
                java.util.concurrent.Executor r1 = r0.e
                if (r1 == 0) goto L_0x0026
                java.util.concurrent.Executor r2 = r0.f
                if (r2 != 0) goto L_0x0026
                r0.f = r1
                goto L_0x002f
            L_0x0026:
                java.util.concurrent.Executor r1 = r0.e
                if (r1 != 0) goto L_0x002f
                java.util.concurrent.Executor r1 = r0.f
                if (r1 == 0) goto L_0x002f
                goto L_0x0018
            L_0x002f:
                java.util.Set<java.lang.Integer> r1 = r0.o
                if (r1 == 0) goto L_0x0067
                java.util.Set<java.lang.Integer> r2 = r0.n
                if (r2 == 0) goto L_0x0067
                java.util.Iterator r1 = r1.iterator()
            L_0x003b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0067
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.Set<java.lang.Integer> r3 = r0.n
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L_0x0050
                goto L_0x003b
            L_0x0050:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0067:
                n6$c r1 = r0.g
                if (r1 != 0) goto L_0x0072
                t6 r1 = new t6
                r1.<init>()
                r0.g = r1
            L_0x0072:
                java.lang.String r1 = r0.p
                if (r1 != 0) goto L_0x007a
                java.io.File r1 = r0.q
                if (r1 == 0) goto L_0x009c
            L_0x007a:
                java.lang.String r1 = r0.b
                if (r1 == 0) goto L_0x00dc
                java.lang.String r1 = r0.p
                if (r1 == 0) goto L_0x008f
                java.io.File r1 = r0.q
                if (r1 != 0) goto L_0x0087
                goto L_0x008f
            L_0x0087:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations."
                r1.<init>(r2)
                throw r1
            L_0x008f:
                androidx.room.r r1 = new androidx.room.r
                java.lang.String r2 = r0.p
                java.io.File r3 = r0.q
                n6$c r4 = r0.g
                r1.<init>(r2, r3, r4)
                r0.g = r1
            L_0x009c:
                androidx.room.c r1 = new androidx.room.c
                android.content.Context r6 = r0.c
                java.lang.String r7 = r0.b
                n6$c r8 = r0.g
                androidx.room.l$d r9 = r0.m
                java.util.ArrayList<androidx.room.l$b> r10 = r0.d
                boolean r11 = r0.h
                androidx.room.l$c r2 = r0.i
                androidx.room.l$c r12 = r2.resolve(r6)
                java.util.concurrent.Executor r13 = r0.e
                java.util.concurrent.Executor r14 = r0.f
                boolean r15 = r0.j
                boolean r2 = r0.k
                boolean r3 = r0.l
                java.util.Set<java.lang.Integer> r4 = r0.n
                java.lang.String r5 = r0.p
                r18 = r4
                java.io.File r4 = r0.q
                r19 = r5
                r5 = r1
                r16 = r2
                r17 = r3
                r20 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Class<T> r2 = r0.a
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = androidx.room.k.b(r2, r3)
                androidx.room.l r2 = (androidx.room.l) r2
                r2.p(r1)
                return r2
            L_0x00dc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x00e4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            L_0x00ec:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.l.a.d():androidx.room.l");
        }

        public a<T> e() {
            this.k = false;
            this.l = true;
            return this;
        }
    }

    public static abstract class b {
        public void a(m6 m6Var) {
        }

        public void b(m6 m6Var) {
        }

        public void c(m6 m6Var) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
            r3 = (android.app.ActivityManager) r3.getSystemService("activity");
         */
        @android.annotation.SuppressLint({"NewApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.room.l.c resolve(android.content.Context r3) {
            /*
                r2 = this;
                androidx.room.l$c r0 = AUTOMATIC
                if (r2 == r0) goto L_0x0005
                return r2
            L_0x0005:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 < r1) goto L_0x001e
                java.lang.String r0 = "activity"
                java.lang.Object r3 = r3.getSystemService(r0)
                android.app.ActivityManager r3 = (android.app.ActivityManager) r3
                if (r3 == 0) goto L_0x001e
                boolean r3 = isLowRamDevice(r3)
                if (r3 != 0) goto L_0x001e
                androidx.room.l$c r3 = WRITE_AHEAD_LOGGING
                return r3
            L_0x001e:
                androidx.room.l$c r3 = TRUNCATE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.l.c.resolve(android.content.Context):androidx.room.l$c");
        }
    }

    public static class d {
        private HashMap<Integer, TreeMap<Integer, e6>> a = new HashMap<>();

        private void a(e6 e6Var) {
            int i = e6Var.a;
            int i2 = e6Var.b;
            TreeMap treeMap = this.a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.a.put(Integer.valueOf(i), treeMap);
            }
            e6 e6Var2 = (e6) treeMap.get(Integer.valueOf(i2));
            if (e6Var2 != null) {
                "Overriding migration " + e6Var2 + " with " + e6Var;
            }
            treeMap.put(Integer.valueOf(i2), e6Var);
        }

        private List<e6> d(List<e6> list, boolean z, int i, int i2) {
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    Iterator it = (z ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        public void b(e6... e6VarArr) {
            for (e6 a2 : e6VarArr) {
                a(a2);
            }
        }

        public List<e6> c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i2 > i, i, i2);
        }
    }

    private static boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f && r()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!o() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        m6 b2 = this.d.b();
        this.e.o(b2);
        b2.beginTransaction();
    }

    public abstract void d();

    public q6 e(String str) {
        a();
        b();
        return this.d.b().p(str);
    }

    /* access modifiers changed from: protected */
    public abstract i f();

    /* access modifiers changed from: protected */
    public abstract n6 g(c cVar);

    @Deprecated
    public void h() {
        this.d.b().endTransaction();
        if (!o()) {
            this.e.h();
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> i() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public Lock j() {
        return this.i.readLock();
    }

    public i k() {
        return this.e;
    }

    public n6 l() {
        return this.d;
    }

    public Executor m() {
        return this.b;
    }

    public Executor n() {
        return this.c;
    }

    public boolean o() {
        return this.d.b().inTransaction();
    }

    public void p(c cVar) {
        n6 g2 = g(cVar);
        this.d = g2;
        if (g2 instanceof q) {
            ((q) g2).e(cVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (cVar.g == c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.d.a(z);
        }
        this.h = cVar.e;
        this.b = cVar.h;
        this.c = new u(cVar.i);
        this.f = cVar.f;
        this.g = z;
        if (cVar.j) {
            this.e.k(cVar.b, cVar.c);
        }
    }

    /* access modifiers changed from: protected */
    public void q(m6 m6Var) {
        this.e.f(m6Var);
    }

    public boolean s() {
        m6 m6Var = this.a;
        return m6Var != null && m6Var.isOpen();
    }

    public Cursor t(p6 p6Var) {
        return u(p6Var, (CancellationSignal) null);
    }

    public Cursor u(p6 p6Var, CancellationSignal cancellationSignal) {
        a();
        b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.d.b().i0(p6Var) : this.d.b().x(p6Var, cancellationSignal);
    }

    @Deprecated
    public void v() {
        this.d.b().setTransactionSuccessful();
    }
}
