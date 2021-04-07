package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ma0  reason: default package */
public final class ma0 extends g60 implements i.e {
    private final CastSeekBar b;
    private final long c;
    private final i60 d;

    public ma0(CastSeekBar castSeekBar, long j, i60 i60) {
        this.b = castSeekBar;
        this.c = j;
        this.d = i60;
        g();
    }

    private final void g() {
        h();
        ArrayList arrayList = null;
        if (b() != null) {
            MediaInfo j = b().j();
            if (b().o() && !b().r() && j != null) {
                CastSeekBar castSeekBar = this.b;
                List<b> j2 = j.j();
                if (j2 != null) {
                    arrayList = new ArrayList();
                    for (b next : j2) {
                        if (next != null) {
                            long l = next.l();
                            int a = l == -1000 ? this.d.a() : Math.min(this.d.d(l), this.d.a());
                            if (a >= 0) {
                                arrayList.add(new CastSeekBar.a(a));
                            }
                        }
                    }
                }
                castSeekBar.setAdBreaks(arrayList);
                return;
            }
        }
        this.b.setAdBreaks((List<CastSeekBar.a>) null);
    }

    private final void h() {
        i b2 = b();
        boolean z = true;
        if (b2 == null || !b2.o() || b2.u()) {
            this.b.setEnabled(false);
        } else {
            this.b.setEnabled(true);
        }
        CastSeekBar.b bVar = new CastSeekBar.b();
        bVar.a = i();
        bVar.b = this.d.a();
        bVar.c = this.d.d(0);
        i b3 = b();
        bVar.d = (b3 == null || !b3.o() || !b3.v()) ? i() : this.d.i();
        i b4 = b();
        bVar.e = (b4 == null || !b4.o() || !b4.v()) ? i() : this.d.j();
        i b5 = b();
        if (b5 == null || !b5.o() || !b5.v()) {
            z = false;
        }
        bVar.f = z;
        this.b.b(bVar);
    }

    private final int i() {
        i b2 = b();
        if (b2 != null) {
            boolean q = b2.q();
        }
        return this.d.f();
    }

    public final void a(long j, long j2) {
        h();
    }

    public final void c() {
        g();
    }

    public final void e(c cVar) {
        super.e(cVar);
        if (b() != null) {
            b().c(this, this.c);
        }
        g();
    }

    public final void f() {
        if (b() != null) {
            b().E(this);
        }
        super.f();
        g();
    }
}
