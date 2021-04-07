package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.m0;

/* renamed from: o92  reason: default package */
public class o92 extends e1 {
    private m92 e;
    private final int f;
    private final int g;
    private final long h;
    private final String i;

    public o92(int i2, int i3, long j, String str) {
        v62.f(str, "schedulerName");
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = str;
        this.e = Y();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o92(int i2, int i3, String str) {
        this(i2, i3, x92.e, str);
        v62.f(str, "schedulerName");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o92(int i2, int i3, String str, int i4, r62 r62) {
        this((i4 & 1) != 0 ? x92.c : i2, (i4 & 2) != 0 ? x92.d : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final m92 Y() {
        return new m92(this.f, this.g, this.h, this.i);
    }

    public void N(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        try {
            m92.Q(this.e, runnable, (u92) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            m0.k.N(n42, runnable);
        }
    }

    public void P(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        try {
            m92.Q(this.e, runnable, (u92) null, true, 2, (Object) null);
        } catch (RejectedExecutionException unused) {
            m0.k.P(n42, runnable);
        }
    }

    public Executor U() {
        return this.e;
    }

    public final a0 V(int i2) {
        if (i2 > 0) {
            return new q92(this, i2, w92.PROBABLY_BLOCKING);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i2).toString());
    }

    public final void Z(Runnable runnable, u92 u92, boolean z) {
        v62.f(runnable, "block");
        v62.f(u92, "context");
        try {
            this.e.P(runnable, u92, z);
        } catch (RejectedExecutionException unused) {
            m0.k.v0(this.e.M(runnable, u92));
        }
    }
}
