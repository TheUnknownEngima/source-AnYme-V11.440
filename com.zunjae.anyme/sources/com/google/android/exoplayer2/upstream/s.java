package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.i;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface s extends i {

    public static abstract class a implements i.a {
        private final e a = new e();

        /* renamed from: b */
        public final s a() {
            return c(this.a);
        }

        /* access modifiers changed from: protected */
        public abstract s c(e eVar);

        public final e d() {
            return this.a;
        }
    }

    public static class b extends IOException {
        public b(IOException iOException, l lVar, int i) {
            super(iOException);
        }

        public b(String str, l lVar, int i) {
            super(str);
        }

        public b(String str, IOException iOException, l lVar, int i) {
            super(str, iOException);
        }
    }

    public static final class c extends b {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.String r3, com.google.android.exoplayer2.upstream.l r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "Invalid content type: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r0 = 1
                r2.<init>((java.lang.String) r3, (com.google.android.exoplayer2.upstream.l) r4, (int) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.c.<init>(java.lang.String, com.google.android.exoplayer2.upstream.l):void");
        }
    }

    public static final class d extends b {
        public final int e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(int r1, java.lang.String r2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3, com.google.android.exoplayer2.upstream.l r4) {
            /*
                r0 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 26
                r2.<init>(r3)
                java.lang.String r3 = "Response code: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                r3 = 1
                r0.<init>((java.lang.String) r2, (com.google.android.exoplayer2.upstream.l) r4, (int) r3)
                r0.e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.s.d.<init>(int, java.lang.String, java.util.Map, com.google.android.exoplayer2.upstream.l):void");
        }
    }

    public static final class e {
        private final Map<String, String> a = new HashMap();
        private Map<String, String> b;

        public synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }

        public synchronized void b(String str, String str2) {
            this.b = null;
            this.a.put(str, str2);
        }
    }

    static {
        c cVar = c.a;
    }
}
