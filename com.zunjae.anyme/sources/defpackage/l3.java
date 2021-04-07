package defpackage;

import java.util.Locale;

/* renamed from: l3  reason: default package */
public final class l3 {
    public static final k3 a = new e((c) null, false);
    public static final k3 b = new e((c) null, true);
    public static final k3 c = new e(b.a, false);
    public static final k3 d = new e(b.a, true);

    /* renamed from: l3$a */
    private static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = l3.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: l3$b */
    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = l3.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: l3$c */
    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: l3$d */
    private static abstract class d implements k3 {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int a2 = this.a.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.a == null ? b() : c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    /* renamed from: l3$e */
    private static class e extends d {
        private final boolean b;

        e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.b;
        }
    }

    /* renamed from: l3$f */
    private static class f extends d {
        static final f b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return m3.b(Locale.getDefault()) == 1;
        }
    }

    static {
        a aVar = a.b;
        f fVar = f.b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
