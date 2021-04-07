package kotlinx.coroutines;

import defpackage.n42;
import kotlinx.coroutines.j2;

public final class d0 extends h42 implements j2<String> {
    public static final a f = new a((r62) null);
    private final long e;

    public static final class a implements n42.c<d0> {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }
    }

    public d0(long j) {
        super(f);
        this.e = j;
    }

    public final long N() {
        return this.e;
    }

    /* renamed from: P */
    public void F(n42 n42, String str) {
        v62.f(n42, "context");
        v62.f(str, "oldState");
        Thread currentThread = Thread.currentThread();
        v62.b(currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    /* renamed from: Q */
    public String L(n42 n42) {
        String str;
        v62.f(n42, "context");
        e0 e0Var = (e0) n42.get(e0.f);
        if (e0Var == null || (str = e0Var.N()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        v62.b(currentThread, "currentThread");
        String name = currentThread.getName();
        v62.b(name, "oldName");
        int J = g92.J(name, " @", 0, false, 6, (Object) null);
        if (J < 0) {
            J = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + J + 10);
        String substring = name.substring(0, J);
        v62.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.e);
        String sb2 = sb.toString();
        v62.b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d0) {
                if (this.e == ((d0) obj).e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, d62<? super R, ? super n42.b, ? extends R> d62) {
        v62.f(d62, "operation");
        return j2.a.a(this, r, d62);
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.f(cVar, "key");
        return j2.a.b(this, cVar);
    }

    public int hashCode() {
        long j = this.e;
        return (int) (j ^ (j >>> 32));
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.f(cVar, "key");
        return j2.a.c(this, cVar);
    }

    public n42 plus(n42 n42) {
        v62.f(n42, "context");
        return j2.a.d(this, n42);
    }

    public String toString() {
        return "CoroutineId(" + this.e + ')';
    }
}
