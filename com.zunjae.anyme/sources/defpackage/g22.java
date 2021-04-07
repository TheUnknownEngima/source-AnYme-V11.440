package defpackage;

/* renamed from: g22  reason: default package */
class g22 {
    public static <T> d22<T> a(i22 i22, o52<? extends T> o52) {
        v62.e(i22, "mode");
        v62.e(o52, "initializer");
        int i = e22.a[i22.ordinal()];
        if (i == 1) {
            return new p22(o52, (Object) null, 2, (r62) null);
        }
        if (i == 2) {
            return new o22(o52);
        }
        if (i == 3) {
            return new v22(o52);
        }
        throw new j22();
    }

    public static <T> d22<T> b(o52<? extends T> o52) {
        v62.e(o52, "initializer");
        return new p22(o52, (Object) null, 2, (r62) null);
    }
}
