package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.c;
import java.util.Collections;
import java.util.Set;

public abstract class h<T extends IInterface> extends c<T> implements a.f {
    private final Set<Scope> x;
    private final Account y;

    @Deprecated
    protected h(Context context, Looper looper, int i, d dVar, f.a aVar, f.b bVar) {
        this(context, looper, i, dVar, (e) aVar, (l) bVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.d r13, com.google.android.gms.common.api.internal.e r14, com.google.android.gms.common.api.internal.l r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.i.b(r10)
            com.google.android.gms.common.e r4 = com.google.android.gms.common.e.m()
            com.google.android.gms.common.internal.r.j(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.e r7 = (com.google.android.gms.common.api.internal.e) r7
            com.google.android.gms.common.internal.r.j(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.l r8 = (com.google.android.gms.common.api.internal.l) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.l):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected h(Context context, Looper looper, i iVar, com.google.android.gms.common.e eVar, int i, d dVar, e eVar2, l lVar) {
        super(context, looper, iVar, eVar, i, k0(eVar2), l0(lVar), dVar.e());
        this.y = dVar.a();
        Set<Scope> c = dVar.c();
        m0(c);
        this.x = c;
    }

    private static c.a k0(e eVar) {
        if (eVar == null) {
            return null;
        }
        return new z(eVar);
    }

    private static c.b l0(l lVar) {
        if (lVar == null) {
            return null;
        }
        return new a0(lVar);
    }

    private final Set<Scope> m0(Set<Scope> set) {
        j0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> C() {
        return this.x;
    }

    public Set<Scope> a() {
        return o() ? this.x : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> j0(Set<Scope> set) {
        return set;
    }

    public int m() {
        return super.m();
    }

    public final Account t() {
        return this.y;
    }
}
