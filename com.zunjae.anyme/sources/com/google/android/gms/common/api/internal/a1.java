package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class a1 {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */
    public final Map<f81<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    private final void b(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((f81) entry2.getKey()).d(new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <TResult> void a(f81<TResult> f81, boolean z) {
        this.b.put(f81, Boolean.valueOf(z));
        f81.a().b(new t(this, f81));
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }

    public final void d() {
        b(false, f.r);
    }

    public final void e() {
        b(true, r0.a);
    }
}
