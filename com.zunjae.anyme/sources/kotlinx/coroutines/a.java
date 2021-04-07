package kotlinx.coroutines;

public abstract class a<T> extends w1 implements o1, k42<T>, f0 {
    private final n42 f;
    protected final n42 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(n42 n42, boolean z) {
        super(z);
        v62.f(n42, "parentContext");
        this.g = n42;
        this.f = n42.plus(this);
    }

    public final void N(Throwable th) {
        v62.f(th, "exception");
        c0.a(this.f, th);
    }

    public String U() {
        String b = z.b(this.f);
        if (b == null) {
            return super.U();
        }
        return '\"' + b + "\":" + super.U();
    }

    /* access modifiers changed from: protected */
    public final void Z(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            r0(sVar.a, sVar.a());
            return;
        }
        s0(obj);
    }

    public final void a0() {
        t0();
    }

    public boolean b() {
        return super.b();
    }

    public final void d(Object obj) {
        S(t.a(obj), p0());
    }

    public final n42 e() {
        return this.f;
    }

    public n42 i() {
        return this.f;
    }

    public int p0() {
        return 0;
    }

    public final void q0() {
        O((o1) this.g.get(o1.d));
    }

    /* access modifiers changed from: protected */
    public void r0(Throwable th, boolean z) {
        v62.f(th, "cause");
    }

    /* access modifiers changed from: protected */
    public void s0(T t) {
    }

    /* access modifiers changed from: protected */
    public void t0() {
    }

    public final <R> void u0(i0 i0Var, R r, d62<? super R, ? super k42<? super T>, ? extends Object> d62) {
        v62.f(i0Var, "start");
        v62.f(d62, "block");
        q0();
        i0Var.invoke(d62, r, this);
    }
}
