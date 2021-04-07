package defpackage;

import io.karn.notify.R$drawable;

/* renamed from: b12  reason: default package */
public final class b12 {
    private int a;
    private int b;
    private CharSequence c;
    private boolean d;

    public b12() {
        this(0, 0, (CharSequence) null, false, 15, (r62) null);
    }

    public b12(int i, int i2, CharSequence charSequence, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b12(int i, int i2, CharSequence charSequence, boolean z, int i3, r62 r62) {
        this((i3 & 1) != 0 ? R$drawable.ic_app_icon : i, (i3 & 2) != 0 ? 4886754 : i2, (i3 & 4) != 0 ? null : charSequence, (i3 & 8) != 0 ? true : z);
    }

    public static /* synthetic */ b12 b(b12 b12, int i, int i2, CharSequence charSequence, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = b12.a;
        }
        if ((i3 & 2) != 0) {
            i2 = b12.b;
        }
        if ((i3 & 4) != 0) {
            charSequence = b12.c;
        }
        if ((i3 & 8) != 0) {
            z = b12.d;
        }
        return b12.a(i, i2, charSequence, z);
    }

    public final b12 a(int i, int i2, CharSequence charSequence, boolean z) {
        return new b12(i, i2, charSequence, z);
    }

    public final int c() {
        return this.b;
    }

    public final CharSequence d() {
        return this.c;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b12) {
                b12 b12 = (b12) obj;
                if (this.a == b12.a) {
                    if ((this.b == b12.b) && v62.a(this.c, b12.c)) {
                        if (this.d == b12.d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        CharSequence charSequence = this.c;
        int hashCode = (i + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "Header(icon=" + this.a + ", color=" + this.b + ", headerText=" + this.c + ", showTimestamp=" + this.d + ")";
    }
}
