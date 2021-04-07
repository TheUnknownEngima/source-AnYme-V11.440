package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: z02  reason: default package */
public final class z02 {
    private int a;
    private final String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private List<Long> g;
    private Uri h;

    public z02() {
        this(0, (String) null, (String) null, (String) null, 0, 0, (List) null, (Uri) null, 255, (r62) null);
    }

    public z02(int i, String str, String str2, String str3, int i2, int i3, List<Long> list, Uri uri) {
        v62.f(str, "channelKey");
        v62.f(str2, "channelName");
        v62.f(str3, "channelDescription");
        v62.f(list, "vibrationPattern");
        v62.f(uri, "sound");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = uri;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ z02(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, int r15, java.util.List r16, android.net.Uri r17, int r18, defpackage.r62 r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            java.lang.String r3 = "application_notification"
            goto L_0x0012
        L_0x0011:
            r3 = r11
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "Application notifications."
            goto L_0x001a
        L_0x0019:
            r4 = r12
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            java.lang.String r5 = "General application notifications."
            goto L_0x0022
        L_0x0021:
            r5 = r13
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x0029
        L_0x0028:
            r6 = r14
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r15
        L_0x002f:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0039
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x003b
        L_0x0039:
            r7 = r16
        L_0x003b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r0)
            java.lang.String r8 = "RingtoneManager.getDefau…anager.TYPE_NOTIFICATION)"
            defpackage.v62.b(r0, r8)
            goto L_0x004c
        L_0x004a:
            r0 = r17
        L_0x004c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z02.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.List, android.net.Uri, int, r62):void");
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z02) {
                z02 z02 = (z02) obj;
                if ((this.a == z02.a) && v62.a(this.b, z02.b) && v62.a(this.c, z02.c) && v62.a(this.d, z02.d)) {
                    if (this.e == z02.e) {
                        if (!(this.f == z02.f) || !v62.a(this.g, z02.g) || !v62.a(this.h, z02.h)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int f() {
        return this.a;
    }

    public final Uri g() {
        return this.h;
    }

    public final List<Long> h() {
        return this.g;
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31;
        List<Long> list = this.g;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Uri uri = this.h;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "Alerts(lockScreenVisibility=" + this.a + ", channelKey=" + this.b + ", channelName=" + this.c + ", channelDescription=" + this.d + ", channelImportance=" + this.e + ", lightColor=" + this.f + ", vibrationPattern=" + this.g + ", sound=" + this.h + ")";
    }
}
