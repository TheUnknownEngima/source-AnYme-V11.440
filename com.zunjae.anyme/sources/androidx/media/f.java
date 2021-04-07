package androidx.media;

import android.text.TextUtils;

class f implements d {
    private String a;
    private int b;
    private int c;

    f(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return (this.b == -1 || fVar.b == -1) ? TextUtils.equals(this.a, fVar.a) && this.c == fVar.c : TextUtils.equals(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c;
    }

    public int hashCode() {
        return p3.b(this.a, Integer.valueOf(this.c));
    }
}
