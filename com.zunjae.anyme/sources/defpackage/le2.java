package defpackage;

import java.io.Writer;

/* renamed from: le2  reason: default package */
public abstract class le2 extends ke2 {
    public final int b(CharSequence charSequence, int i, Writer writer) {
        return f(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean f(int i, Writer writer);
}
