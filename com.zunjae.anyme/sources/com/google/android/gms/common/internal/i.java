package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;

public abstract class i {
    private static int e = 129;
    private static final Object f = new Object();
    private static i g;

    protected static final class a {
        private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        private final String a;
        private final String b;
        private final ComponentName c = null;
        private final int d;
        private final boolean e;

        public a(String str, String str2, int i, boolean z) {
            r.f(str);
            this.a = str;
            r.f(str2);
            this.b = str2;
            this.d = i;
            this.e = z;
        }

        /* JADX WARNING: type inference failed for: r5v3, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.content.Intent d(android.content.Context r5) {
            /*
                r4 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = r4.a
                java.lang.String r2 = "serviceActionBundleKey"
                r0.putString(r2, r1)
                r1 = 0
                android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x001a }
                android.net.Uri r2 = f     // Catch:{ IllegalArgumentException -> 0x001a }
                java.lang.String r3 = "serviceIntentCall"
                android.os.Bundle r5 = r5.call(r2, r3, r1, r0)     // Catch:{ IllegalArgumentException -> 0x001a }
                goto L_0x003a
            L_0x001a:
                r5 = move-exception
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r0 = java.lang.String.valueOf(r5)
                int r0 = r0.length()
                int r0 = r0 + 34
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r0)
                java.lang.String r0 = "Dynamic intent resolution failed: "
                r2.append(r0)
                r2.append(r5)
                r2.toString()
                r5 = r1
            L_0x003a:
                if (r5 != 0) goto L_0x003d
                goto L_0x0046
            L_0x003d:
                java.lang.String r0 = "serviceResponseIntentKey"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.content.Intent r1 = (android.content.Intent) r1
            L_0x0046:
                if (r1 != 0) goto L_0x005f
                java.lang.String r5 = "Dynamic lookup for intent failed for action: "
                java.lang.String r0 = r4.a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r2 = r0.length()
                if (r2 == 0) goto L_0x005a
                r5.concat(r0)
                goto L_0x005f
            L_0x005a:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5)
            L_0x005f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.i.a.d(android.content.Context):android.content.Intent");
        }

        public final ComponentName a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final Intent c(Context context) {
            if (this.a == null) {
                return new Intent().setComponent(this.c);
            }
            Intent d2 = this.e ? d(context) : null;
            return d2 == null ? new Intent(this.a).setPackage(this.b) : d2;
        }

        public final int e() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return q.a(this.a, aVar.a) && q.a(this.b, aVar.b) && q.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return q.b(this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e));
        }

        public final String toString() {
            String str = this.a;
            if (str != null) {
                return str;
            }
            r.j(this.c);
            return this.c.flattenToString();
        }
    }

    public static int a() {
        return e;
    }

    public static i b(Context context) {
        synchronized (f) {
            if (g == null) {
                g = new k0(context.getApplicationContext());
            }
        }
        return g;
    }

    public final void c(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        e(new a(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void e(a aVar, ServiceConnection serviceConnection, String str);
}
