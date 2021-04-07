package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

final class b extends ViewPager2.i {
    private final List<ViewPager2.i> a;

    b(int i) {
        this.a = new ArrayList(i);
    }

    private void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public void a(int i) {
        try {
            for (ViewPager2.i a2 : this.a) {
                a2.a(i);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
            throw null;
        }
    }

    public void b(int i, float f, int i2) {
        try {
            for (ViewPager2.i b : this.a) {
                b.b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
            throw null;
        }
    }

    public void c(int i) {
        try {
            for (ViewPager2.i c : this.a) {
                c.c(i);
            }
        } catch (ConcurrentModificationException e) {
            e(e);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d(ViewPager2.i iVar) {
        this.a.add(iVar);
    }
}
