package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

final class d extends ViewPager2.i {
    private final LinearLayoutManager a;
    private ViewPager2.k b;

    d(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public void a(int i) {
    }

    public void b(int i, float f, int i2) {
        if (this.b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.a.T()) {
                View S = this.a.S(i3);
                if (S != null) {
                    this.b.a(S, ((float) (this.a.n0(S) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.a.T())}));
                }
            }
        }
    }

    public void c(int i) {
    }

    /* access modifiers changed from: package-private */
    public ViewPager2.k d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void e(ViewPager2.k kVar) {
        this.b = kVar;
    }
}
