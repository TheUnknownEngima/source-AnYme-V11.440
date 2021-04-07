package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class g implements i {
    private final boolean a;
    private final ArrayList<y> b = new ArrayList<>(1);
    private int c;
    private l d;

    protected g(boolean z) {
        this.a = z;
    }

    public final void b(y yVar) {
        if (!this.b.contains(yVar)) {
            this.b.add(yVar);
            this.c++;
        }
    }

    public /* synthetic */ Map<String, List<String>> d() {
        return h.a(this);
    }

    /* access modifiers changed from: protected */
    public final void f(int i) {
        l lVar = this.d;
        v50.g(lVar);
        l lVar2 = lVar;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).f(this, lVar2, this.a, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void g() {
        l lVar = this.d;
        v50.g(lVar);
        l lVar2 = lVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).a(this, lVar2, this.a);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void h(l lVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).h(this, lVar, this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final void i(l lVar) {
        this.d = lVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).b(this, lVar, this.a);
        }
    }
}
