package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: qd2  reason: default package */
public class qd2 implements Serializable, Comparable<qd2> {
    static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final qd2 i = t(new byte[0]);
    final byte[] e;
    transient int f;
    transient String g;

    qd2(byte[] bArr) {
        this.e = bArr;
    }

    static int e(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            if (i4 == i2) {
                return i3;
            }
            int codePointAt = str.codePointAt(i3);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i4++;
            i3 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    public static qd2 h(String str) {
        if (str != null) {
            byte[] a = md2.a(str);
            if (a != null) {
                return new qd2(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static qd2 i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((k(str.charAt(i3)) << 4) + k(str.charAt(i3 + 1)));
            }
            return t(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    private static int k(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    private qd2 l(String str) {
        try {
            return t(MessageDigest.getInstance(str).digest(this.e));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static qd2 m(String str) {
        if (str != null) {
            qd2 qd2 = new qd2(str.getBytes(fe2.a));
            qd2.g = str;
            return qd2;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static qd2 t(byte... bArr) {
        if (bArr != null) {
            return new qd2((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public int A() {
        return this.e.length;
    }

    public final boolean B(qd2 qd2) {
        return v(0, qd2, 0, qd2.A());
    }

    public qd2 C(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.e;
            if (i3 <= bArr.length) {
                int i4 = i3 - i2;
                if (i4 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i2 == 0 && i3 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(this.e, i2, bArr2, 0, i4);
                    return new qd2(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.e.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public qd2 E() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.e;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b < 65 || b > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b2 = bArr2[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i3] = (byte) (b2 + 32);
                    }
                }
                return new qd2(bArr2);
            }
        }
    }

    public byte[] F() {
        return (byte[]) this.e.clone();
    }

    public String G() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.e, fe2.a);
        this.g = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    public void H(nd2 nd2) {
        byte[] bArr = this.e;
        nd2.D0(bArr, 0, bArr.length);
    }

    public String a() {
        return md2.b(this.e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qd2) {
            qd2 qd2 = (qd2) obj;
            int A = qd2.A();
            byte[] bArr = this.e;
            return A == bArr.length && qd2.w(0, bArr, 0, bArr.length);
        }
    }

    /* renamed from: f */
    public int compareTo(qd2 qd2) {
        int A = A();
        int A2 = qd2.A();
        int min = Math.min(A, A2);
        for (int i2 = 0; i2 < min; i2++) {
            byte q = q(i2) & 255;
            byte q2 = qd2.q(i2) & 255;
            if (q != q2) {
                return q < q2 ? -1 : 1;
            }
        }
        if (A == A2) {
            return 0;
        }
        return A < A2 ? -1 : 1;
    }

    public int hashCode() {
        int i2 = this.f;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.e);
        this.f = hashCode;
        return hashCode;
    }

    public byte q(int i2) {
        return this.e[i2];
    }

    public String r() {
        byte[] bArr = this.e;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = h;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public qd2 s() {
        return l("MD5");
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.e.length == 0) {
            return "[size=0]";
        }
        String G = G();
        int e2 = e(G, 64);
        if (e2 == -1) {
            if (this.e.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(r());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.e.length);
                sb2.append(" hex=");
                sb2.append(C(0, 64).r());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = G.substring(0, e2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (e2 < G.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.e.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public boolean v(int i2, qd2 qd2, int i3, int i4) {
        return qd2.w(i3, this.e, i2, i4);
    }

    public boolean w(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.e;
            return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && fe2.a(bArr2, i2, bArr, i3, i4);
        }
    }

    public qd2 x() {
        return l("SHA-1");
    }

    public qd2 z() {
        return l("SHA-256");
    }
}
