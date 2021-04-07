package com.google.android.exoplayer2;

import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.r0;

public abstract class t implements r0 {
    protected final b1.c a = new b1.c();

    protected static final class a {
        public final r0.a a;
        private boolean b;

        public a(r0.a aVar) {
            this.a = aVar;
        }

        public void a(b bVar) {
            if (!this.b) {
                bVar.a(this.a);
            }
        }

        public void b() {
            this.b = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    protected interface b {
        void a(r0.a aVar);
    }

    private int Y() {
        int G = G();
        if (G == 1) {
            return 0;
        }
        return G;
    }

    public final int B() {
        b1 N = N();
        if (N.q()) {
            return -1;
        }
        return N.l(w(), Y(), P());
    }

    public final boolean C() {
        return h() == 3 && j() && K() == 0;
    }

    public final int H() {
        b1 N = N();
        if (N.q()) {
            return -1;
        }
        return N.e(w(), Y(), P());
    }

    public final long X() {
        b1 N = N();
        if (N.q()) {
            return -9223372036854775807L;
        }
        return N.n(w(), this.a).c();
    }

    public final void Z(long j) {
        i(w(), j);
    }

    public final boolean hasNext() {
        return H() != -1;
    }

    public final boolean hasPrevious() {
        return B() != -1;
    }

    public final boolean o() {
        b1 N = N();
        return !N.q() && N.n(w(), this.a).f;
    }
}
