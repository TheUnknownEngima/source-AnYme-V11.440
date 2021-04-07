package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class h implements Runnable {
    static final ThreadLocal<h> i = new ThreadLocal<>();
    static Comparator<c> j = new a();
    ArrayList<RecyclerView> e = new ArrayList<>();
    long f;
    long g;
    private ArrayList<c> h = new ArrayList<>();

    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if ((cVar.d == null) != (cVar2.d == null)) {
                return cVar.d == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.o.c {
        int a;
        int b;
        int[] c;
        int d;

        b() {
        }

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.q;
            if (recyclerView.p != null && oVar != null && oVar.A0()) {
                if (z) {
                    if (!recyclerView.h.p()) {
                        oVar.z(recyclerView.p.g(), this);
                    }
                } else if (!recyclerView.n0()) {
                    oVar.y(this.a, this.b, recyclerView.l0, this);
                }
                int i = this.d;
                if (i > oVar.q) {
                    oVar.q = i;
                    oVar.r = z;
                    recyclerView.f.K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        c() {
        }

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    h() {
    }

    private void b() {
        c cVar;
        int size = this.e.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.e.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.k0.c(recyclerView, false);
                i2 += recyclerView.k0.d;
            }
        }
        this.h.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.e.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.k0;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i6 = 0; i6 < bVar.d * 2; i6 += 2) {
                    if (i4 >= this.h.size()) {
                        cVar = new c();
                        this.h.add(cVar);
                    } else {
                        cVar = this.h.get(i4);
                    }
                    int i7 = bVar.c[i6 + 1];
                    cVar.a = i7 <= abs;
                    cVar.b = abs;
                    cVar.c = i7;
                    cVar.d = recyclerView2;
                    cVar.e = bVar.c[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.h, j);
    }

    private void c(c cVar, long j2) {
        RecyclerView.c0 i2 = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j2);
        if (i2 != null && i2.f != null && i2.s() && !i2.t()) {
            h((RecyclerView) i2.f.get(), j2);
        }
    }

    private void d(long j2) {
        int i2 = 0;
        while (i2 < this.h.size()) {
            c cVar = this.h.get(i2);
            if (cVar.d != null) {
                c(cVar, j2);
                cVar.a();
                i2++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i2) {
        int j2 = recyclerView.i.j();
        for (int i3 = 0; i3 < j2; i3++) {
            RecyclerView.c0 h0 = RecyclerView.h0(recyclerView.i.i(i3));
            if (h0.g == i2 && !h0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j2) {
        if (recyclerView != null) {
            if (recyclerView.H && recyclerView.i.j() != 0) {
                recyclerView.W0();
            }
            b bVar = recyclerView.k0;
            bVar.c(recyclerView, true);
            if (bVar.d != 0) {
                try {
                    c3.a("RV Nested Prefetch");
                    recyclerView.l0.f(recyclerView.p);
                    for (int i2 = 0; i2 < bVar.d * 2; i2 += 2) {
                        i(recyclerView, bVar.c[i2], j2);
                    }
                } finally {
                    c3.b();
                }
            }
        }
    }

    private RecyclerView.c0 i(RecyclerView recyclerView, int i2, long j2) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f;
        try {
            recyclerView.I0();
            RecyclerView.c0 I = uVar.I(i2, false, j2);
            if (I != null) {
                if (!I.s() || I.t()) {
                    uVar.a(I, false);
                } else {
                    uVar.B(I.e);
                }
            }
            return I;
        } finally {
            recyclerView.K0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.e.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f == 0) {
            this.f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.k0.e(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void g(long j2) {
        b();
        d(j2);
    }

    public void j(RecyclerView recyclerView) {
        this.e.remove(recyclerView);
    }

    public void run() {
        try {
            c3.a("RV Prefetch");
            if (!this.e.isEmpty()) {
                int size = this.e.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.e.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j2) + this.g);
                    this.f = 0;
                    c3.b();
                }
            }
        } finally {
            this.f = 0;
            c3.b();
        }
    }
}
