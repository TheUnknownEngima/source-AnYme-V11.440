package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.io.File;

/* renamed from: n6  reason: default package */
public interface n6 {

    /* renamed from: n6$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                "deleting the database file: " + str;
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                    } else if (!new File(str).delete()) {
                        "Could not delete the database file " + str;
                    }
                } catch (Exception unused) {
                }
            }
        }

        public void b(m6 m6Var) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (r0 != null) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
            if (r3.hasNext() != false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
            a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0023, B:8:0x002a, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0023] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(defpackage.m6 r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                r0.toString()
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0022
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
                return
            L_0x0022:
                r0 = 0
                java.util.List r0 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x002a, all -> 0x0028 }
                goto L_0x002a
            L_0x0028:
                r1 = move-exception
                goto L_0x002e
            L_0x002a:
                r3.close()     // Catch:{ IOException -> 0x0050, all -> 0x0028 }
                goto L_0x0051
            L_0x002e:
                if (r0 == 0) goto L_0x0048
                java.util.Iterator r3 = r0.iterator()
            L_0x0034:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004f
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0034
            L_0x0048:
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
            L_0x004f:
                throw r1
            L_0x0050:
            L_0x0051:
                if (r0 == 0) goto L_0x006b
                java.util.Iterator r3 = r0.iterator()
            L_0x0057:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0072
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0057
            L_0x006b:
                java.lang.String r3 = r3.getPath()
                r2.a(r3)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n6.a.c(m6):void");
        }

        public abstract void d(m6 m6Var);

        public abstract void e(m6 m6Var, int i, int i2);

        public void f(m6 m6Var) {
        }

        public abstract void g(m6 m6Var, int i, int i2);
    }

    /* renamed from: n6$b */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: n6$b$a */
        public static class a {
            Context a;
            String b;
            a c;

            a(Context context) {
                this.a = context;
            }

            public b a() {
                a aVar = this.c;
                if (aVar != null) {
                    Context context = this.a;
                    if (context != null) {
                        return new b(context, this.b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }
        }

        b(Context context, String str, a aVar) {
            this.a = context;
            this.b = str;
            this.c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: n6$c */
    public interface c {
        n6 a(b bVar);
    }

    void a(boolean z);

    m6 b();

    String c();
}
