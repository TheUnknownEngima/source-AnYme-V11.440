package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.vt;
import java.io.EOFException;

/* renamed from: gt  reason: default package */
public final class gt implements vt {
    public int a(it itVar, int i, boolean z) {
        int f = itVar.f(i);
        if (f != -1) {
            return f;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void b(i50 i50, int i) {
        i50.N(i);
    }

    public void c(long j, int i, int i2, int i3, vt.a aVar) {
    }

    public void d(f0 f0Var) {
    }
}
