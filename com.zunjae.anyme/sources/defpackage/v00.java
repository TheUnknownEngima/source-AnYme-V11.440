package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.x;
import java.util.List;
import java.util.Map;

/* renamed from: v00  reason: default package */
public abstract class v00 implements u.e {
    public final l a;
    public final int b;
    public final f0 c;
    public final int d;
    public final Object e;
    public final long f;
    public final long g;
    protected final x h;

    public v00(i iVar, l lVar, int i, f0 f0Var, int i2, Object obj, long j, long j2) {
        this.h = new x(iVar);
        q40.e(lVar);
        this.a = lVar;
        this.b = i;
        this.c = f0Var;
        this.d = i2;
        this.e = obj;
        this.f = j;
        this.g = j2;
    }

    public final long b() {
        return this.h.f();
    }

    public final long d() {
        return this.g - this.f;
    }

    public final Map<String, List<String>> e() {
        return this.h.h();
    }

    public final Uri f() {
        return this.h.g();
    }
}
