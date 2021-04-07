package defpackage;

/* renamed from: t72  reason: default package */
public final class t72 extends r72 {
    /* access modifiers changed from: private */
    public static final t72 i = new t72(1, 0);
    public static final a j = new a((r62) null);

    /* renamed from: t72$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final t72 a() {
            return t72.i;
        }
    }

    public t72(int i2, int i3) {
        super(i2, i3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof t72) {
            if (!isEmpty() || !((t72) obj).isEmpty()) {
                t72 t72 = (t72) obj;
                if (!(a() == t72.a() && c() == t72.c())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + c();
    }

    public Integer i() {
        return Integer.valueOf(c());
    }

    public boolean isEmpty() {
        return a() > c();
    }

    public Integer j() {
        return Integer.valueOf(a());
    }

    public String toString() {
        return a() + ".." + c();
    }
}
