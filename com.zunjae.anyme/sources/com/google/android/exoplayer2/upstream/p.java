package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.s;

public final class p extends s.a {
    private final String b;
    private final y c;
    private final int d;
    private final int e;
    private final boolean f;

    public p(String str, int i, int i2, boolean z) {
        this(str, (y) null, i, i2, z);
    }

    public p(String str, y yVar, int i, int i2, boolean z) {
        q40.d(str);
        this.b = str;
        this.c = yVar;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public o c(s.e eVar) {
        o oVar = new o(this.b, this.d, this.e, this.f, eVar);
        y yVar = this.c;
        if (yVar != null) {
            oVar.b(yVar);
        }
        return oVar;
    }
}
