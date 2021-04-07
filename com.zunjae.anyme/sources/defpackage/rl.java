package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: rl  reason: default package */
public class rl implements vl<Drawable> {
    private final int a;
    private final boolean b;
    private sl c;

    /* renamed from: rl$a */
    public static class a {
        private final int a;
        private boolean b;

        public a() {
            this(300);
        }

        public a(int i) {
            this.a = i;
        }

        public rl a() {
            return new rl(this.a, this.b);
        }
    }

    protected rl(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    private ul<Drawable> b() {
        if (this.c == null) {
            this.c = new sl(this.a, this.b);
        }
        return this.c;
    }

    public ul<Drawable> a(com.bumptech.glide.load.a aVar, boolean z) {
        return aVar == com.bumptech.glide.load.a.MEMORY_CACHE ? tl.b() : b();
    }
}
