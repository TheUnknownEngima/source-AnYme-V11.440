package defpackage;

import java.util.Queue;

/* renamed from: zg  reason: default package */
public class zg<A, B> {
    private final gm<b<A>, B> a;

    /* renamed from: zg$a */
    class a extends gm<b<A>, B> {
        a(zg zgVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void j(b<A> bVar, B b) {
            bVar.c();
        }
    }

    /* renamed from: zg$b */
    static final class b<A> {
        private static final Queue<b<?>> d = km.f(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        static <A> b<A> a(A a2, int i, int i2) {
            b<A> poll;
            synchronized (d) {
                poll = d.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.b(a2, i, i2);
            return poll;
        }

        private void b(A a2, int i, int i2) {
            this.c = a2;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            synchronized (d) {
                d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public zg(long j) {
        this.a = new a(this, j);
    }

    public B a(A a2, int i, int i2) {
        b a3 = b.a(a2, i, i2);
        B g = this.a.g(a3);
        a3.c();
        return g;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.k(b.a(a2, i, i2), b2);
    }
}
