package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.f0;
import defpackage.hx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lw  reason: default package */
public final class lw implements hx.c {
    private final int a;
    private final List<f0> b;

    public lw(int i) {
        this(i, Collections.singletonList(f0.y((String) null, "application/cea-608", 0, (String) null)));
    }

    public lw(int i, List<f0> list) {
        this.a = i;
        this.b = list;
    }

    private cx c(hx.b bVar) {
        return new cx(e(bVar));
    }

    private jx d(hx.b bVar) {
        return new jx(e(bVar));
    }

    private List<f0> e(hx.b bVar) {
        int i;
        String str;
        List<byte[]> list;
        if (f(32)) {
            return this.b;
        }
        i50 i50 = new i50(bVar.d);
        List<f0> list2 = this.b;
        while (i50.a() > 0) {
            int z = i50.z();
            int c = i50.c() + i50.z();
            if (z == 134) {
                list2 = new ArrayList<>();
                int z2 = i50.z() & 31;
                for (int i2 = 0; i2 < z2; i2++) {
                    String w = i50.w(3);
                    int z3 = i50.z();
                    boolean z4 = true;
                    boolean z5 = (z3 & 128) != 0;
                    if (z5) {
                        i = z3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte z6 = (byte) i50.z();
                    i50.N(1);
                    if (z5) {
                        if ((z6 & 64) == 0) {
                            z4 = false;
                        }
                        list = v20.a(z4);
                    } else {
                        list = null;
                    }
                    list2.add(f0.D((String) null, str, (String) null, -1, 0, w, i, (ns) null, Long.MAX_VALUE, list));
                }
            }
            i50.M(c);
        }
        return list2;
    }

    private boolean f(int i) {
        return (i & this.a) != 0;
    }

    public hx a(int i, hx.b bVar) {
        if (i == 2) {
            return new ww(new pw(d(bVar)));
        }
        if (i == 3 || i == 4) {
            return new ww(new uw(bVar.b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new ww(new sw());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new ww(new rw(c(bVar)));
                    }
                    if (i == 89) {
                        return new ww(new nw(bVar.c));
                    }
                    if (i != 138) {
                        if (i == 172) {
                            return new ww(new iw(bVar.b));
                        }
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (f(16)) {
                                    return null;
                                } else {
                                    return new bx(new dx());
                                }
                            } else if (!f(64)) {
                                return null;
                            }
                        }
                        return new ww(new gw(bVar.b));
                    }
                    return new ww(new mw(bVar.b));
                } else if (f(4)) {
                    return null;
                } else {
                    return new ww(new qw(c(bVar), f(1), f(8)));
                }
            } else if (f(2)) {
                return null;
            } else {
                return new ww(new tw(bVar.b));
            }
        } else if (f(2)) {
            return null;
        } else {
            return new ww(new kw(false, bVar.b));
        }
    }

    public SparseArray<hx> b() {
        return new SparseArray<>();
    }
}
