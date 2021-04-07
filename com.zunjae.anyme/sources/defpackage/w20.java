package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: w20  reason: default package */
abstract class w20 implements l20 {
    private final ArrayDeque<b> a = new ArrayDeque<>();
    private final ArrayDeque<p20> b;
    private final PriorityQueue<b> c;
    private b d;
    private long e;
    private long f;

    /* renamed from: w20$b */
    private static final class b extends o20 implements Comparable<b> {
        /* access modifiers changed from: private */
        public long l;

        private b() {
        }

        /* renamed from: v */
        public int compareTo(b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.h - bVar.h;
            if (j == 0) {
                j = this.l - bVar.l;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* renamed from: w20$c */
    private final class c extends p20 {
        private c() {
        }

        public final void release() {
            w20.this.m(this);
        }
    }

    public w20() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c());
        }
        this.c = new PriorityQueue<>();
    }

    private void l(b bVar) {
        bVar.clear();
        this.a.add(bVar);
    }

    public void a() {
    }

    public void b(long j) {
        this.e = j;
    }

    /* access modifiers changed from: protected */
    public abstract k20 f();

    public void flush() {
        this.f = 0;
        this.e = 0;
        while (!this.c.isEmpty()) {
            l(this.c.poll());
        }
        b bVar = this.d;
        if (bVar != null) {
            l(bVar);
            this.d = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g(o20 o20);

    /* renamed from: h */
    public o20 d() {
        q40.f(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b pollFirst = this.a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    /* renamed from: i */
    public p20 c() {
        p20 pollFirst;
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && this.c.peek().h <= this.e) {
            b poll = this.c.poll();
            if (poll.isEndOfStream()) {
                pollFirst = this.b.pollFirst();
                pollFirst.addFlag(4);
            } else {
                g(poll);
                if (j()) {
                    k20 f2 = f();
                    if (!poll.isDecodeOnly()) {
                        pollFirst = this.b.pollFirst();
                        pollFirst.i(poll.h, f2, Long.MAX_VALUE);
                    }
                }
                l(poll);
            }
            l(poll);
            return pollFirst;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean j();

    /* renamed from: k */
    public void e(o20 o20) {
        q40.a(o20 == this.d);
        if (o20.isDecodeOnly()) {
            l(this.d);
        } else {
            b bVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            long unused = bVar.l = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public void m(p20 p20) {
        p20.clear();
        this.b.add(p20);
    }
}
