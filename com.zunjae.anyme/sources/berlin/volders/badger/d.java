package berlin.volders.badger;

import android.content.Context;
import berlin.volders.badger.e;

public class d extends e {
    private int j = 0;

    public static final class a extends e.a<d> {
        public a(Context context, b bVar) {
            super(context, bVar);
        }

        /* renamed from: b */
        public d a() {
            return new d(this.a, this.b, this.c);
        }
    }

    public d(b bVar, int i, int i2) {
        super(bVar, i, i2);
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("must be 0 <= count");
        } else if (this.j != i) {
            this.j = i;
            e(i == 0 ? null : String.valueOf(i));
        }
    }
}
