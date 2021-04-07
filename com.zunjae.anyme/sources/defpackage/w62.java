package defpackage;

import java.io.Serializable;

/* renamed from: w62  reason: default package */
public abstract class w62<R> implements s62<R>, Serializable {
    private final int e;

    public w62(int i) {
        this.e = i;
    }

    public int i() {
        return this.e;
    }

    public String toString() {
        String h = f72.h(this);
        v62.d(h, "Reflection.renderLambdaToString(this)");
        return h;
    }
}
