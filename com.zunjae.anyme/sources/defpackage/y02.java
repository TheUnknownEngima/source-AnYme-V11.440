package defpackage;

import android.app.NotificationManager;

/* renamed from: y02  reason: default package */
public final class y02 {
    private NotificationManager a;
    private b12 b;
    private z02 c;

    public y02() {
        this((NotificationManager) null, (b12) null, (z02) null, 7, (r62) null);
    }

    public y02(NotificationManager notificationManager, b12 b12, z02 z02) {
        v62.f(b12, "defaultHeader");
        v62.f(z02, "defaultAlerting");
        this.a = notificationManager;
        this.b = b12;
        this.c = z02;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ y02(android.app.NotificationManager r15, defpackage.b12 r16, defpackage.z02 r17, int r18, defpackage.r62 r19) {
        /*
            r14 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r15
        L_0x0007:
            r1 = r18 & 2
            if (r1 == 0) goto L_0x0019
            b12 r1 = new b12
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 15
            r8 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x001b
        L_0x0019:
            r1 = r16
        L_0x001b:
            r2 = r18 & 4
            if (r2 == 0) goto L_0x0032
            z02 r2 = new z02
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 255(0xff, float:3.57E-43)
            r13 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = r14
            goto L_0x0035
        L_0x0032:
            r3 = r14
            r2 = r17
        L_0x0035:
            r14.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y02.<init>(android.app.NotificationManager, b12, z02, int, r62):void");
    }

    public final z02 a() {
        return this.c;
    }

    public final b12 b() {
        return this.b;
    }

    public final NotificationManager c() {
        return this.a;
    }

    public final void d(NotificationManager notificationManager) {
        this.a = notificationManager;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y02)) {
            return false;
        }
        y02 y02 = (y02) obj;
        return v62.a(this.a, y02.a) && v62.a(this.b, y02.b) && v62.a(this.c, y02.c);
    }

    public int hashCode() {
        NotificationManager notificationManager = this.a;
        int i = 0;
        int hashCode = (notificationManager != null ? notificationManager.hashCode() : 0) * 31;
        b12 b12 = this.b;
        int hashCode2 = (hashCode + (b12 != null ? b12.hashCode() : 0)) * 31;
        z02 z02 = this.c;
        if (z02 != null) {
            i = z02.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "NotifyConfig(notificationManager=" + this.a + ", defaultHeader=" + this.b + ", defaultAlerting=" + this.c + ")";
    }
}
