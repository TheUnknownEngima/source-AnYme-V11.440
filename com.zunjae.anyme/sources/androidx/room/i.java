package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class i {
    private static final String[] l = {"UPDATE", "DELETE", "INSERT"};
    final HashMap<String, Integer> a;
    final String[] b;
    private Map<String, Set<String>> c;
    final l d;
    AtomicBoolean e;
    private volatile boolean f;
    volatile q6 g;
    private b h;
    private final h i;
    @SuppressLint({"RestrictedApi"})
    final z<c, d> j;
    Runnable k;

    class a implements Runnable {
        a() {
        }

        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor t = i.this.d.t(new l6("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (t.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(t.getInt(0)));
                } catch (Throwable th) {
                    t.close();
                    throw th;
                }
            }
            t.close();
            if (!hashSet.isEmpty()) {
                i.this.g.executeUpdateDelete();
            }
            return hashSet;
        }

        public void run() {
            m6 b;
            Lock j = i.this.d.j();
            Set<Integer> set = null;
            try {
                j.lock();
                if (!i.this.e()) {
                    j.unlock();
                } else if (!i.this.e.compareAndSet(true, false)) {
                    j.unlock();
                } else if (i.this.d.o()) {
                    j.unlock();
                } else {
                    if (i.this.d.g) {
                        b = i.this.d.l().b();
                        b.beginTransaction();
                        set = a();
                        b.setTransactionSuccessful();
                        b.endTransaction();
                    } else {
                        set = a();
                    }
                    j.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (i.this.j) {
                            Iterator<Map.Entry<c, d>> it = i.this.j.iterator();
                            while (it.hasNext()) {
                                ((d) it.next().getValue()).a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                j.unlock();
                throw th;
            }
        }
    }

    static class b {
        final long[] a;
        final boolean[] b;
        final int[] c;
        boolean d;
        boolean e;

        b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            this.b = new boolean[i];
            this.c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.b, false);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (this.d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.a[i] > 0;
                                if (z != this.b[i]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.c[i] = 0;
                                }
                                this.b[i] = z;
                                i++;
                            } else {
                                this.e = true;
                                this.d = false;
                                int[] iArr2 = this.c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.a[i];
                    this.a[i] = 1 + j;
                    if (j == 0) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.a[i];
                    this.a[i] = j - 1;
                    if (j == 1) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this) {
                this.e = false;
            }
        }
    }

    public static abstract class c {
        final String[] a;

        protected c(String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.a = strArr2;
            strArr2[strArr.length] = str;
        }

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    static class d {
        final int[] a;
        private final String[] b;
        final c c;
        private final Set<String> d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.b[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.d = set;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.c.b(set);
            }
        }
    }

    static class e extends c {
        final i b;
        final WeakReference<c> c;

        e(i iVar, c cVar) {
            super(cVar.a);
            this.b = iVar;
            this.c = new WeakReference<>(cVar);
        }

        public void b(Set<String> set) {
            c cVar = (c) this.c.get();
            if (cVar == null) {
                this.b.i(this);
            } else {
                cVar.b(set);
            }
        }
    }

    public i(l lVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.e = new AtomicBoolean(false);
        this.f = false;
        this.j = new z<>();
        this.k = new a();
        this.d = lVar;
        this.h = new b(strArr.length);
        this.a = new HashMap<>();
        this.c = map2;
        this.i = new h(this.d);
        int length = strArr.length;
        this.b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i2));
            String str = map.get(strArr[i2]);
            if (str != null) {
                this.b[i2] = str.toLowerCase(Locale.US);
            } else {
                this.b[i2] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public i(l lVar, String... strArr) {
        this(lVar, new HashMap(), Collections.emptyMap(), strArr);
    }

    private static void c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] j(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void l(m6 m6Var, int i2) {
        m6Var.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : l) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            m6Var.execSQL(sb.toString());
        }
    }

    private void m(m6 m6Var, int i2) {
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        for (String c2 : l) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            c(sb, str, c2);
            m6Var.execSQL(sb.toString());
        }
    }

    private String[] p(String[] strArr) {
        String[] j2 = j(strArr);
        int length = j2.length;
        int i2 = 0;
        while (i2 < length) {
            String str = j2[i2];
            if (this.a.containsKey(str.toLowerCase(Locale.US))) {
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return j2;
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d j2;
        String[] j3 = j(cVar.a);
        int[] iArr = new int[j3.length];
        int length = j3.length;
        int i2 = 0;
        while (i2 < length) {
            Integer num = this.a.get(j3[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + j3[i2]);
            }
        }
        d dVar = new d(cVar, iArr, j3);
        synchronized (this.j) {
            j2 = this.j.j(cVar, dVar);
        }
        if (j2 == null && this.h.b(iArr)) {
            n();
        }
    }

    public void b(c cVar) {
        a(new e(this, cVar));
    }

    public <T> LiveData<T> d(String[] strArr, boolean z, Callable<T> callable) {
        return this.i.a(p(strArr), z, callable);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        if (!this.d.s()) {
            return false;
        }
        if (!this.f) {
            this.d.l().b();
        }
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void f(m6 m6Var) {
        synchronized (this) {
            if (!this.f) {
                m6Var.execSQL("PRAGMA temp_store = MEMORY;");
                m6Var.execSQL("PRAGMA recursive_triggers='ON';");
                m6Var.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                o(m6Var);
                this.g = m6Var.p("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f = true;
            }
        }
    }

    public void g(String... strArr) {
        synchronized (this.j) {
            Iterator<Map.Entry<c, d>> it = this.j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((c) next.getKey()).a()) {
                    ((d) next.getValue()).b(strArr);
                }
            }
        }
    }

    public void h() {
        if (this.e.compareAndSet(false, true)) {
            this.d.m().execute(this.k);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void i(c cVar) {
        d k2;
        synchronized (this.j) {
            k2 = this.j.k(cVar);
        }
        if (k2 != null && this.h.c(k2.a)) {
            n();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Context context, String str) {
        new j(context, str, this, this.d.m());
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (this.d.s()) {
            o(this.d.l().b());
        }
    }

    /* access modifiers changed from: package-private */
    public void o(m6 m6Var) {
        if (!m6Var.inTransaction()) {
            while (true) {
                try {
                    Lock j2 = this.d.j();
                    j2.lock();
                    try {
                        int[] a2 = this.h.a();
                        if (a2 == null) {
                            j2.unlock();
                            return;
                        }
                        int length = a2.length;
                        m6Var.beginTransaction();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                l(m6Var, i2);
                            } else if (i3 == 2) {
                                m(m6Var, i2);
                            }
                        }
                        m6Var.setTransactionSuccessful();
                        m6Var.endTransaction();
                        this.h.d();
                        j2.unlock();
                    } catch (Throwable th) {
                        j2.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }
}
