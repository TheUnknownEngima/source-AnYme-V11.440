package com.mikepenz.fastadapter;

public interface e {
    public static final e a = new a();

    static class a implements e {
        a() {
        }

        public boolean a(b bVar, int i, int i2, int i3) {
            if (i > i2) {
                if (i2 > 0) {
                    bVar.n0(i3, i2);
                }
                bVar.p0(i3 + i2, i - i2);
                return false;
            }
            if (i > 0) {
                bVar.n0(i3, i);
                if (i >= i2) {
                    return false;
                }
                i3 += i;
                i2 -= i;
            } else if (i != 0) {
                bVar.k0();
                return false;
            }
            bVar.q0(i3, i2);
            return false;
        }
    }

    boolean a(b bVar, int i, int i2, int i3);
}
