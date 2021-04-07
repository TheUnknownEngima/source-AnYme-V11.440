package defpackage;

import android.graphics.Typeface;

/* renamed from: aa1  reason: default package */
public final class aa1 extends fa1 {
    private final Typeface a;
    private final a b;
    private boolean c;

    /* renamed from: aa1$a */
    public interface a {
        void a(Typeface typeface);
    }

    public aa1(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    public void a(int i) {
        d(this.a);
    }

    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}
