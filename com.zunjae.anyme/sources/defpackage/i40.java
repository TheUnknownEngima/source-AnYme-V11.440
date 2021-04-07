package defpackage;

import java.util.Arrays;

/* renamed from: i40  reason: default package */
public final class i40 {
    public final int a;
    private final h40[] b;
    private int c;

    public i40(h40... h40Arr) {
        this.b = h40Arr;
        this.a = h40Arr.length;
    }

    public h40 a(int i) {
        return this.b[i];
    }

    public h40[] b() {
        return (h40[]) this.b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i40.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((i40) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
