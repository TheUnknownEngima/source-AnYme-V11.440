package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.b;
import java.util.Map;
import java.util.Set;

public final class x0 {
    private final b0<b<?>, b> a;
    private final b0<b<?>, String> b;
    private final f81<Map<b<?>, String>> c;
    private int d;
    private boolean e;

    public final void a(b<?> bVar, b bVar2, String str) {
        this.a.put(bVar, bVar2);
        this.b.put(bVar, str);
        this.d--;
        if (!bVar2.m()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.c.b(new c(this.a));
            return;
        }
        this.c.c(this.b);
    }

    public final Set<b<?>> b() {
        return this.a.keySet();
    }
}
