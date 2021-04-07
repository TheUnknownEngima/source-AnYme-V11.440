package defpackage;

/* renamed from: cl1  reason: default package */
final class cl1 implements mk1 {
    private final ok1 a;
    private final String b;
    private final Object[] c;
    private final int d;

    cl1(ok1 ok1, String str, Object[] objArr) {
        char charAt;
        this.a = ok1;
        this.b = str;
        this.c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c2 = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c2 |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c2 | (charAt << i);
        }
        this.d = charAt2;
    }

    public boolean a() {
        return (this.d & 2) == 2;
    }

    public ok1 b() {
        return this.a;
    }

    public zk1 c() {
        return (this.d & 1) == 1 ? zk1.PROTO2 : zk1.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }
}
