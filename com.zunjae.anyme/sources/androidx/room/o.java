package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class o implements p6, o6 {
    static final TreeMap<Integer, o> m = new TreeMap<>();
    private volatile String e;
    final long[] f;
    final double[] g;
    final String[] h;
    final byte[][] i;
    private final int[] j;
    final int k;
    int l;

    private o(int i2) {
        this.k = i2;
        int i3 = i2 + 1;
        this.j = new int[i3];
        this.f = new long[i3];
        this.g = new double[i3];
        this.h = new String[i3];
        this.i = new byte[i3][];
    }

    public static o h(String str, int i2) {
        synchronized (m) {
            Map.Entry<Integer, o> ceilingEntry = m.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                m.remove(ceilingEntry.getKey());
                o value = ceilingEntry.getValue();
                value.i(str, i2);
                return value;
            }
            o oVar = new o(i2);
            oVar.i(str, i2);
            return oVar;
        }
    }

    private static void k() {
        if (m.size() > 15) {
            int size = m.size() - 10;
            Iterator<Integer> it = m.descendingKeySet().iterator();
            while (true) {
                int i2 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i2;
                } else {
                    return;
                }
            }
        }
    }

    public String a() {
        return this.e;
    }

    public void b(o6 o6Var) {
        for (int i2 = 1; i2 <= this.l; i2++) {
            int i3 = this.j[i2];
            if (i3 == 1) {
                o6Var.bindNull(i2);
            } else if (i3 == 2) {
                o6Var.bindLong(i2, this.f[i2]);
            } else if (i3 == 3) {
                o6Var.bindDouble(i2, this.g[i2]);
            } else if (i3 == 4) {
                o6Var.bindString(i2, this.h[i2]);
            } else if (i3 == 5) {
                o6Var.bindBlob(i2, this.i[i2]);
            }
        }
    }

    public void bindBlob(int i2, byte[] bArr) {
        this.j[i2] = 5;
        this.i[i2] = bArr;
    }

    public void bindDouble(int i2, double d) {
        this.j[i2] = 3;
        this.g[i2] = d;
    }

    public void bindLong(int i2, long j2) {
        this.j[i2] = 2;
        this.f[i2] = j2;
    }

    public void bindNull(int i2) {
        this.j[i2] = 1;
    }

    public void bindString(int i2, String str) {
        this.j[i2] = 4;
        this.h[i2] = str;
    }

    public void close() {
    }

    /* access modifiers changed from: package-private */
    public void i(String str, int i2) {
        this.e = str;
        this.l = i2;
    }

    public void l() {
        synchronized (m) {
            m.put(Integer.valueOf(this.k), this);
            k();
        }
    }
}
