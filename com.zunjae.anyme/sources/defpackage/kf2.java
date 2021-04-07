package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: kf2  reason: default package */
public final class kf2 {
    private final char[] a;
    private final int b;
    private int c = 0;
    private int d = 0;
    private final String[] e = new String[512];

    public kf2(String str) {
        jf2.j(str);
        char[] charArray = str.toCharArray();
        this.a = charArray;
        this.b = charArray.length;
    }

    private String b(int i, int i2) {
        char[] cArr = this.a;
        String[] strArr = this.e;
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = (strArr.length - 1) & i5;
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        } else if (E(i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length] = str3;
            return str3;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        if (q()) {
            return false;
        }
        char c2 = this.a[this.c];
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2);
    }

    /* access modifiers changed from: package-private */
    public int B(char c2) {
        for (int i = this.c; i < this.b; i++) {
            if (c2 == this.a[i]) {
                return i - this.c;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int C(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        int i = this.c;
        while (i < this.b) {
            int i2 = 1;
            if (charAt != this.a[i]) {
                do {
                    i++;
                    if (i >= this.b) {
                        break;
                    }
                } while (charAt == this.a[i]);
            }
            int i3 = i + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.b;
            if (i < i4 && length <= i4) {
                int i5 = i3;
                while (i5 < length && charSequence.charAt(i2) == this.a[i5]) {
                    i5++;
                    i2++;
                }
                if (i5 == length) {
                    return i - this.c;
                }
            }
            i = i3;
        }
        return -1;
    }

    public int D() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public boolean E(int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        char[] cArr = this.a;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.c = this.d;
    }

    /* access modifiers changed from: package-private */
    public void G() {
        this.c--;
    }

    public void a() {
        this.c++;
    }

    /* access modifiers changed from: package-private */
    public char c() {
        int i = this.c;
        char c2 = i >= this.b ? 65535 : this.a[i];
        this.c++;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        char c2;
        int i = this.c;
        int i2 = this.b;
        char[] cArr = this.a;
        while (true) {
            int i3 = this.c;
            if (i3 >= i2 || (c2 = cArr[i3]) == '&' || c2 == '<' || c2 == 0) {
                int i4 = this.c;
            } else {
                this.c = i3 + 1;
            }
        }
        int i42 = this.c;
        return i42 > i ? b(i, i42 - i) : "";
    }

    /* access modifiers changed from: package-private */
    public String e() {
        char c2;
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 < this.b && (c2 = this.a[i2]) >= '0' && c2 <= '9') {
                this.c = i2 + 1;
            }
        }
        return b(i, this.c - i);
    }

    /* access modifiers changed from: package-private */
    public String f() {
        char c2;
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 < this.b && (((c2 = this.a[i2]) >= '0' && c2 <= '9') || ((c2 >= 'A' && c2 <= 'F') || (c2 >= 'a' && c2 <= 'f')))) {
                this.c++;
            }
        }
        return b(i, this.c - i);
    }

    /* access modifiers changed from: package-private */
    public String g() {
        char c2;
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 < this.b && (((c2 = this.a[i2]) >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2)))) {
                this.c++;
            }
        }
        return b(i, this.c - i);
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char c2;
        int i = this.c;
        while (true) {
            int i2 = this.c;
            if (i2 < this.b && (((c2 = this.a[i2]) >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2)))) {
                this.c++;
            }
        }
        while (!q() && (r1 = this.a[r2]) >= '0' && r1 <= '9') {
            this.c = (r2 = this.c) + 1;
        }
        return b(i, this.c - i);
    }

    /* access modifiers changed from: package-private */
    public String i() {
        char c2;
        int i = this.c;
        int i2 = this.b;
        char[] cArr = this.a;
        while (true) {
            int i3 = this.c;
            if (i3 >= i2 || (c2 = cArr[i3]) == 9 || c2 == 10 || c2 == 13 || c2 == 12 || c2 == ' ' || c2 == '/' || c2 == '>' || c2 == 0) {
                int i4 = this.c;
            } else {
                this.c = i3 + 1;
            }
        }
        int i42 = this.c;
        return i42 > i ? b(i, i42 - i) : "";
    }

    public String j(char c2) {
        int B = B(c2);
        if (B == -1) {
            return n();
        }
        String b2 = b(this.c, B);
        this.c += B;
        return b2;
    }

    /* access modifiers changed from: package-private */
    public String k(String str) {
        int C = C(str);
        if (C == -1) {
            return n();
        }
        String b2 = b(this.c, C);
        this.c += C;
        return b2;
    }

    public String l(char... cArr) {
        int i = this.c;
        int i2 = this.b;
        char[] cArr2 = this.a;
        loop0:
        while (this.c < i2) {
            for (char c2 : cArr) {
                if (cArr2[this.c] == c2) {
                    break loop0;
                }
            }
            this.c++;
        }
        int i3 = this.c;
        return i3 > i ? b(i, i3 - i) : "";
    }

    /* access modifiers changed from: package-private */
    public String m(char... cArr) {
        int i = this.c;
        int i2 = this.b;
        char[] cArr2 = this.a;
        while (true) {
            int i3 = this.c;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                int i4 = this.c;
            } else {
                this.c++;
            }
        }
        int i42 = this.c;
        return i42 > i ? b(i, i42 - i) : "";
    }

    /* access modifiers changed from: package-private */
    public String n() {
        int i = this.c;
        String b2 = b(i, this.b - i);
        this.c = this.b;
        return b2;
    }

    /* access modifiers changed from: package-private */
    public boolean o(String str) {
        return C(str.toLowerCase(Locale.ENGLISH)) > -1 || C(str.toUpperCase(Locale.ENGLISH)) > -1;
    }

    public char p() {
        int i = this.c;
        if (i >= this.b) {
            return 65535;
        }
        return this.a[i];
    }

    public boolean q() {
        return this.c >= this.b;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.d = this.c;
    }

    /* access modifiers changed from: package-private */
    public boolean s(String str) {
        if (!v(str)) {
            return false;
        }
        this.c += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t(String str) {
        if (!z(str)) {
            return false;
        }
        this.c += str.length();
        return true;
    }

    public String toString() {
        char[] cArr = this.a;
        int i = this.c;
        return new String(cArr, i, this.b - i);
    }

    /* access modifiers changed from: package-private */
    public boolean u(char c2) {
        return !q() && this.a[this.c] == c2;
    }

    /* access modifiers changed from: package-private */
    public boolean v(String str) {
        int length = str.length();
        if (length > this.b - this.c) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.a[this.c + i]) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean w(char... cArr) {
        if (q()) {
            return false;
        }
        char c2 = this.a[this.c];
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean x(char[] cArr) {
        return !q() && Arrays.binarySearch(cArr, this.a[this.c]) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.a[r3.c];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y() {
        /*
            r3 = this;
            boolean r0 = r3.q()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            char[] r0 = r3.a
            int r2 = r3.c
            char r0 = r0[r2]
            r2 = 48
            if (r0 < r2) goto L_0x0017
            r2 = 57
            if (r0 > r2) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf2.y():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean z(String str) {
        int length = str.length();
        if (length > this.b - this.c) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.a[this.c + i])) {
                return false;
            }
        }
        return true;
    }
}
