package defpackage;

import android.app.PendingIntent;
import java.util.ArrayList;

/* renamed from: c12  reason: default package */
public final class c12 {
    private PendingIntent a;
    private PendingIntent b;
    private boolean c;
    private String d;
    private boolean e;
    private boolean f;
    private long g;
    private final ArrayList<String> h;

    public c12() {
        this((PendingIntent) null, (PendingIntent) null, false, (String) null, false, false, 0, (ArrayList) null, 255, (r62) null);
    }

    public c12(PendingIntent pendingIntent, PendingIntent pendingIntent2, boolean z, String str, boolean z2, boolean z3, long j, ArrayList<String> arrayList) {
        v62.f(arrayList, "contacts");
        this.a = pendingIntent;
        this.b = pendingIntent2;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = z3;
        this.g = j;
        this.h = arrayList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c12(android.app.PendingIntent r10, android.app.PendingIntent r11, boolean r12, java.lang.String r13, boolean r14, boolean r15, long r16, java.util.ArrayList r18, int r19, defpackage.r62 r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r13
        L_0x001e:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x0026
        L_0x0025:
            r5 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r6 = r15
        L_0x002c:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0033
            r7 = 0
            goto L_0x0035
        L_0x0033:
            r7 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0041
        L_0x003f:
            r0 = r18
        L_0x0041:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r2
            r15 = r5
            r16 = r6
            r17 = r7
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c12.<init>(android.app.PendingIntent, android.app.PendingIntent, boolean, java.lang.String, boolean, boolean, long, java.util.ArrayList, int, r62):void");
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final PendingIntent c() {
        return this.b;
    }

    public final PendingIntent d() {
        return this.a;
    }

    public final ArrayList<String> e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c12) {
                c12 c12 = (c12) obj;
                if (v62.a(this.a, c12.a) && v62.a(this.b, c12.b)) {
                    if ((this.c == c12.c) && v62.a(this.d, c12.d)) {
                        if (this.e == c12.e) {
                            if (this.f == c12.f) {
                                if (!(this.g == c12.g) || !v62.a(this.h, c12.h)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.f;
    }

    public final long h() {
        return this.g;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.a;
        int i = 0;
        int hashCode = (pendingIntent != null ? pendingIntent.hashCode() : 0) * 31;
        PendingIntent pendingIntent2 = this.b;
        int hashCode2 = (hashCode + (pendingIntent2 != null ? pendingIntent2.hashCode() : 0)) * 31;
        boolean z = this.c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str = this.d;
        int hashCode3 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (!z4) {
            z2 = z4;
        }
        long j = this.g;
        int i4 = (((i3 + (z2 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        ArrayList<String> arrayList = this.h;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return i4 + i;
    }

    public final void i(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public String toString() {
        return "Meta(clickIntent=" + this.a + ", clearIntent=" + this.b + ", cancelOnClick=" + this.c + ", category=" + this.d + ", localOnly=" + this.e + ", sticky=" + this.f + ", timeout=" + this.g + ", contacts=" + this.h + ")";
    }
}
