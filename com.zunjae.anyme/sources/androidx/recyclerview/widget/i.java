package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class i {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f = 0;
    int g = 0;
    boolean h;
    boolean i;

    i() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.z zVar) {
        int i2 = this.c;
        return i2 >= 0 && i2 < zVar.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.u uVar) {
        View o = uVar.o(this.c);
        this.c += this.d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
