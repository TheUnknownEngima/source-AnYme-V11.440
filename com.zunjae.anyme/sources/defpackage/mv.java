package defpackage;

import defpackage.vt;

/* renamed from: mv  reason: default package */
public final class mv {
    public final boolean a;
    public final String b;
    public final vt.a c;
    public final int d;
    public final byte[] e;

    public mv(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        q40.a((bArr2 != null ? false : z2) ^ (i == 0));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new vt.a(a(str), bArr, i2, i3);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return 1;
        }
        if (c2 == 2 || c2 == 3) {
            return 2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
        sb.append("Unsupported protection scheme type '");
        sb.append(str);
        sb.append("'. Assuming AES-CTR crypto mode.");
        b50.h("TrackEncryptionBox", sb.toString());
        return 1;
    }
}
