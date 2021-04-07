package defpackage;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.m0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: hu  reason: default package */
final class hu extends iu {
    private long b = -9223372036854775807L;

    public hu() {
        super(new gt());
    }

    private static Boolean e(i50 i50) {
        boolean z = true;
        if (i50.z() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Object f(i50 i50, int i) {
        if (i == 0) {
            return h(i50);
        }
        if (i == 1) {
            return e(i50);
        }
        if (i == 2) {
            return l(i50);
        }
        if (i == 3) {
            return j(i50);
        }
        if (i == 8) {
            return i(i50);
        }
        if (i == 10) {
            return k(i50);
        }
        if (i != 11) {
            return null;
        }
        return g(i50);
    }

    private static Date g(i50 i50) {
        Date date = new Date((long) h(i50).doubleValue());
        i50.N(2);
        return date;
    }

    private static Double h(i50 i50) {
        return Double.valueOf(Double.longBitsToDouble(i50.s()));
    }

    private static HashMap<String, Object> i(i50 i50) {
        int D = i50.D();
        HashMap<String, Object> hashMap = new HashMap<>(D);
        for (int i = 0; i < D; i++) {
            String l = l(i50);
            Object f = f(i50, m(i50));
            if (f != null) {
                hashMap.put(l, f);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> j(i50 i50) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String l = l(i50);
            int m = m(i50);
            if (m == 9) {
                return hashMap;
            }
            Object f = f(i50, m);
            if (f != null) {
                hashMap.put(l, f);
            }
        }
    }

    private static ArrayList<Object> k(i50 i50) {
        int D = i50.D();
        ArrayList<Object> arrayList = new ArrayList<>(D);
        for (int i = 0; i < D; i++) {
            Object f = f(i50, m(i50));
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    private static String l(i50 i50) {
        int F = i50.F();
        int c = i50.c();
        i50.N(F);
        return new String(i50.a, c, F);
    }

    private static int m(i50 i50) {
        return i50.z();
    }

    /* access modifiers changed from: protected */
    public boolean b(i50 i50) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(i50 i50, long j) {
        if (m(i50) != 2) {
            throw new m0();
        } else if (!"onMetaData".equals(l(i50)) || m(i50) != 8) {
            return false;
        } else {
            HashMap<String, Object> i = i(i50);
            if (i.containsKey("duration")) {
                double doubleValue = ((Double) i.get("duration")).doubleValue();
                if (doubleValue > Utils.DOUBLE_EPSILON) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            return false;
        }
    }

    public long d() {
        return this.b;
    }
}
