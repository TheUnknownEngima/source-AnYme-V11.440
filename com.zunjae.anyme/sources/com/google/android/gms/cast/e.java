package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.UUID;

public final class e {
    private static final a.C0087a<z70, b> a;

    public interface a extends j {
        boolean a();

        String c();

        d d();

        String h();
    }

    public static final class b implements a.d {
        final CastDevice a;
        final c b;
        final Bundle c;
        final int d;
        final String e;

        public static final class a {
            CastDevice a;
            c b;
            /* access modifiers changed from: private */
            public int c = 0;
            /* access modifiers changed from: private */
            public Bundle d;

            public a(CastDevice castDevice, c cVar) {
                r.k(castDevice, "CastDevice parameter cannot be null");
                r.k(cVar, "CastListener parameter cannot be null");
                this.a = castDevice;
                this.b = cVar;
            }

            public final b a() {
                return new b(this, (s1) null);
            }

            public final a c(Bundle bundle) {
                this.d = bundle;
                return this;
            }
        }

        private b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.d = aVar.c;
            this.c = aVar.d;
            this.e = UUID.randomUUID().toString();
        }

        /* synthetic */ b(a aVar, s1 s1Var) {
            this(aVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            if (r1 != r3) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r1 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r8 instanceof com.google.android.gms.cast.e.b
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                com.google.android.gms.cast.e$b r8 = (com.google.android.gms.cast.e.b) r8
                com.google.android.gms.cast.CastDevice r1 = r7.a
                com.google.android.gms.cast.CastDevice r3 = r8.a
                boolean r1 = com.google.android.gms.common.internal.q.a(r1, r3)
                if (r1 == 0) goto L_0x0070
                android.os.Bundle r1 = r7.c
                android.os.Bundle r3 = r8.c
                if (r1 == 0) goto L_0x0058
                if (r3 != 0) goto L_0x001f
                goto L_0x0058
            L_0x001f:
                int r4 = r1.size()
                int r5 = r3.size()
                if (r4 == r5) goto L_0x002a
                goto L_0x005a
            L_0x002a:
                java.util.Set r4 = r1.keySet()
                java.util.Set r5 = r3.keySet()
                boolean r5 = r4.containsAll(r5)
                if (r5 != 0) goto L_0x0039
                goto L_0x005a
            L_0x0039:
                java.util.Iterator r4 = r4.iterator()
            L_0x003d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x005c
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r1.get(r5)
                java.lang.Object r5 = r3.get(r5)
                boolean r5 = com.google.android.gms.common.internal.q.a(r6, r5)
                if (r5 != 0) goto L_0x003d
                goto L_0x005a
            L_0x0058:
                if (r1 == r3) goto L_0x005c
            L_0x005a:
                r1 = 0
                goto L_0x005d
            L_0x005c:
                r1 = 1
            L_0x005d:
                if (r1 == 0) goto L_0x0070
                int r1 = r7.d
                int r3 = r8.d
                if (r1 != r3) goto L_0x0070
                java.lang.String r1 = r7.e
                java.lang.String r8 = r8.e
                boolean r8 = com.google.android.gms.common.internal.q.a(r1, r8)
                if (r8 == 0) goto L_0x0070
                return r0
            L_0x0070:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.e.b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return q.b(this.a, this.c, Integer.valueOf(this.d), this.e);
        }
    }

    public static class c {
        public void a(int i) {
        }

        public void b(int i) {
        }

        public void c(d dVar) {
        }

        public void d() {
        }

        public void e(int i) {
        }

        public void f() {
        }
    }

    public interface d {
        void a(CastDevice castDevice, String str, String str2);
    }

    static {
        s1 s1Var = new s1();
        a = s1Var;
        new com.google.android.gms.common.api.a("Cast.API", s1Var, g70.a);
    }

    public static t1 a(Context context, b bVar) {
        return new c0(context, bVar);
    }
}
