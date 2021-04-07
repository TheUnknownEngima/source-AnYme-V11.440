package com.zunjae.anyme.features.niche;

public abstract class c {

    public static final class a extends c {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            super((r62) null);
            this.a = i;
            this.b = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i, int i2, int i3, r62 r62) {
            this(i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }
    }

    public static final class b extends c {
        private final int a;

        public final int a() {
            return this.a;
        }
    }

    /* renamed from: com.zunjae.anyme.features.niche.c$c  reason: collision with other inner class name */
    public static final class C0199c extends c {
        private final int a;

        public final int a() {
            return this.a;
        }
    }

    public static final class d extends c {
        private final int a;

        public final int a() {
            return this.a;
        }
    }

    public static final class e extends c {
        private final int a;
        private final int b;

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }
    }

    private c() {
    }

    public /* synthetic */ c(r62 r62) {
        this();
    }
}
