package defpackage;

import android.text.format.DateUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.l;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.q;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: i60  reason: default package */
public final class i60 {
    private static int b = j60.b;
    i a;

    private i60() {
    }

    private final l b() {
        MediaInfo j;
        i iVar = this.a;
        if (iVar == null || !iVar.o() || (j = this.a.j()) == null) {
            return null;
        }
        return j.p();
    }

    public static i60 e() {
        return new i60();
    }

    private final Long l() {
        i iVar = this.a;
        if (iVar != null && iVar.o() && this.a.q()) {
            MediaInfo j = this.a.j();
            l b2 = b();
            if (j != null && b2 != null && b2.i("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (b2.i("com.google.android.gms.cast.metadata.SECTION_DURATION") || this.a.v())) {
                return Long.valueOf(b2.n("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
        }
        return null;
    }

    private final Long n() {
        q k;
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q() || !this.a.v() || (k = this.a.k()) == null || k.p() == null) {
            return null;
        }
        return Long.valueOf(this.a.f());
    }

    private final Long o() {
        q k;
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q() || !this.a.v() || (k = this.a.k()) == null || k.p() == null) {
            return null;
        }
        return Long.valueOf(this.a.e());
    }

    private final Long p() {
        MediaInfo j;
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q() || (j = this.a.j()) == null || j.u() == -1) {
            return null;
        }
        return Long.valueOf(j.u());
    }

    private static String r(long j) {
        if (j >= 0) {
            return DateUtils.formatElapsedTime(j / 1000);
        }
        String valueOf = String.valueOf(DateUtils.formatElapsedTime((-j) / 1000));
        return valueOf.length() != 0 ? "-".concat(valueOf) : new String("-");
    }

    public final int a() {
        long g;
        MediaInfo m;
        i iVar = this.a;
        long j = 1;
        if (iVar != null && iVar.o()) {
            if (this.a.q()) {
                Long m2 = m();
                if (m2 == null && (m2 = o()) == null) {
                    g = this.a.g();
                } else {
                    j = m2.longValue();
                }
            } else if (this.a.r()) {
                o i = this.a.i();
                if (!(i == null || (m = i.m()) == null)) {
                    g = m.y();
                }
            } else {
                g = this.a.n();
            }
            j = Math.max(g, 1);
        }
        return Math.max((int) (j - k()), 1);
    }

    public final boolean c(long j) {
        i iVar = this.a;
        return iVar != null && iVar.o() && this.a.v() && (((long) j()) + k()) - j < 10000;
    }

    public final int d(long j) {
        return (int) (j - k());
    }

    public final int f() {
        i iVar = this.a;
        if (iVar == null || !iVar.o()) {
            return 0;
        }
        if (!this.a.q() && this.a.r()) {
            return 0;
        }
        int g = (int) (this.a.g() - k());
        if (this.a.v()) {
            g = t60.h(g, i(), j());
        }
        return t60.h(g, 0, a());
    }

    public final boolean g() {
        return (((long) f()) + k()) - (((long) i()) + k()) < 10000;
    }

    public final boolean h() {
        return c(((long) f()) + k());
    }

    public final int i() {
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q() || !this.a.v()) {
            return 0;
        }
        return t60.h((int) (n().longValue() - k()), 0, a());
    }

    public final int j() {
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q()) {
            return a();
        }
        if (!this.a.v()) {
            return 0;
        }
        return t60.h((int) (o().longValue() - k()), 0, a());
    }

    public final long k() {
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q()) {
            return 0;
        }
        Long l = l();
        if (l != null) {
            return l.longValue();
        }
        Long n = n();
        return n != null ? n.longValue() : this.a.g();
    }

    public final Long m() {
        l b2;
        Long l;
        i iVar = this.a;
        if (iVar == null || !iVar.o() || !this.a.q() || (b2 = b()) == null || !b2.i("com.google.android.gms.cast.metadata.SECTION_DURATION") || (l = l()) == null) {
            return null;
        }
        return Long.valueOf(l.longValue() + b2.n("com.google.android.gms.cast.metadata.SECTION_DURATION"));
    }

    public final String q(long j) {
        i iVar = this.a;
        if (iVar == null || !iVar.o()) {
            return null;
        }
        int[] iArr = k60.a;
        i iVar2 = this.a;
        int i = iArr[((iVar2 == null || !iVar2.o() || !this.a.q() || b == j60.a || p() == null) ? j60.a : j60.b) - 1];
        if (i == 1) {
            return DateFormat.getTimeInstance().format(new Date(p().longValue() + j));
        } else if (i != 2) {
            return null;
        } else {
            return (!this.a.q() || l() != null) ? r(j - k()) : r(j);
        }
    }

    public final long s(int i) {
        return ((long) i) + k();
    }
}
