package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: uj2  reason: default package */
public final class uj2 {
    private static final b[] a = new b[0];
    private static final List<b> b = new ArrayList();
    static volatile b[] c = a;
    private static final b d = new a();

    /* renamed from: uj2$a */
    static class a extends b {
        a() {
        }

        public void a(String str, Object... objArr) {
            for (b a : uj2.c) {
                a.a(str, objArr);
            }
        }

        public void b(Throwable th) {
            for (b b : uj2.c) {
                b.b(th);
            }
        }

        public void c(String str, Object... objArr) {
            for (b c : uj2.c) {
                c.c(str, objArr);
            }
        }

        public void d(Throwable th) {
            for (b d : uj2.c) {
                d.d(th);
            }
        }

        public void h(String str, Object... objArr) {
            for (b h : uj2.c) {
                h.h(str, objArr);
            }
        }

        /* access modifiers changed from: protected */
        public void k(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* renamed from: uj2$b */
    public static abstract class b {
        final ThreadLocal<String> a = new ThreadLocal<>();

        private String f(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void l(int i, Throwable th, String str, Object... objArr) {
            String g = g();
            if (j(g, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = e(str, objArr);
                    }
                    if (th != null) {
                        str = str + "\n" + f(th);
                    }
                } else if (th != null) {
                    str = f(th);
                } else {
                    return;
                }
                k(i, g, str, th);
            }
        }

        public void a(String str, Object... objArr) {
            l(3, (Throwable) null, str, objArr);
        }

        public void b(Throwable th) {
            l(3, th, (String) null, new Object[0]);
        }

        public void c(String str, Object... objArr) {
            l(6, (Throwable) null, str, objArr);
        }

        public void d(Throwable th) {
            l(6, th, (String) null, new Object[0]);
        }

        /* access modifiers changed from: protected */
        public String e(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* access modifiers changed from: package-private */
        public String g() {
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        public void h(String str, Object... objArr) {
            l(4, (Throwable) null, str, objArr);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public boolean i(int i) {
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean j(String str, int i) {
            return i(i);
        }

        /* access modifiers changed from: protected */
        public abstract void k(int i, String str, String str2, Throwable th);
    }

    public static void a(String str, Object... objArr) {
        d.a(str, objArr);
    }

    public static void b(Throwable th) {
        d.b(th);
    }

    public static void c(String str, Object... objArr) {
        d.c(str, objArr);
    }

    public static void d(Throwable th) {
        d.d(th);
    }

    public static List<b> e() {
        List<b> unmodifiableList;
        synchronized (b) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(b));
        }
        return unmodifiableList;
    }

    public static void f(String str, Object... objArr) {
        d.h(str, objArr);
    }

    public static void g(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("tree == null");
        } else if (bVar != d) {
            synchronized (b) {
                b.add(bVar);
                c = (b[]) b.toArray(new b[b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }

    public static b h(String str) {
        for (b bVar : c) {
            bVar.a.set(str);
        }
        return d;
    }
}
