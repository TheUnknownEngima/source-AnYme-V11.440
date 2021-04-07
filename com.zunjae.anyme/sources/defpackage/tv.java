package defpackage;

import java.util.Arrays;

/* renamed from: tv  reason: default package */
final class tv {
    private final uv a = new uv();
    private final i50 b = new i50(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    tv() {
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            uv uvVar = this.a;
            if (i5 >= uvVar.d) {
                break;
            }
            int[] iArr = uvVar.g;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public uv b() {
        return this.a;
    }

    public i50 c() {
        return this.b;
    }

    public boolean d(it itVar) {
        int i;
        q40.f(itVar != null);
        if (this.e) {
            this.e = false;
            this.b.H();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.a(itVar, true)) {
                    return false;
                }
                uv uvVar = this.a;
                int i2 = uvVar.e;
                if ((uvVar.b & 1) == 1 && this.b.d() == 0) {
                    i2 += a(0);
                    i = this.d + 0;
                } else {
                    i = 0;
                }
                itVar.j(i2);
                this.c = i;
            }
            int a2 = a(this.c);
            int i3 = this.c + this.d;
            if (a2 > 0) {
                if (this.b.b() < this.b.d() + a2) {
                    i50 i50 = this.b;
                    i50.a = Arrays.copyOf(i50.a, i50.d() + a2);
                }
                i50 i502 = this.b;
                itVar.readFully(i502.a, i502.d(), a2);
                i50 i503 = this.b;
                i503.L(i503.d() + a2);
                this.e = this.a.g[i3 + -1] != 255;
            }
            if (i3 == this.a.d) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.H();
        this.c = -1;
        this.e = false;
    }

    public void f() {
        i50 i50 = this.b;
        byte[] bArr = i50.a;
        if (bArr.length != 65025) {
            i50.a = Arrays.copyOf(bArr, Math.max(65025, i50.d()));
        }
    }
}
