package defpackage;

import com.google.android.exoplayer2.offline.g;
import com.google.android.exoplayer2.offline.h;
import com.google.android.exoplayer2.upstream.w;
import java.util.List;

/* renamed from: w10  reason: default package */
public final class w10 implements b20 {
    private final b20 a;
    private final List<h> b;

    public w10(b20 b20, List<h> list) {
        this.a = b20;
        this.b = list;
    }

    public w.a<z10> a(x10 x10) {
        return new g(this.a.a(x10), this.b);
    }

    public w.a<z10> b() {
        return new g(this.a.b(), this.b);
    }
}
