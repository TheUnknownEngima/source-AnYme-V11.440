package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.k;

final class c0 implements Runnable {
    private final /* synthetic */ b e;
    private final /* synthetic */ f.b f;

    c0(f.b bVar, b bVar2) {
        this.f = bVar;
        this.e = bVar2;
    }

    public final void run() {
        f.a aVar = (f.a) f.this.m.get(this.f.b);
        if (aVar != null) {
            if (this.e.m()) {
                boolean unused = this.f.e = true;
                if (this.f.a.o()) {
                    this.f.g();
                    return;
                }
                try {
                    this.f.a.b((k) null, this.f.a.a());
                } catch (SecurityException unused2) {
                    aVar.q(new b(10));
                }
            } else {
                aVar.q(this.e);
            }
        }
    }
}
