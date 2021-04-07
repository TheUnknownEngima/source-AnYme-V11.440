package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: r4  reason: default package */
public final class r4 {

    /* renamed from: r4$a */
    public static final class a implements g82<View> {
        final /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        public Iterator<View> iterator() {
            return r4.b(this.a);
        }
    }

    /* renamed from: r4$b */
    public static final class b implements Iterator<View>, Object {
        private int e;
        final /* synthetic */ ViewGroup f;

        b(ViewGroup viewGroup) {
            this.f = viewGroup;
        }

        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f;
            int i = this.e;
            this.e = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.e < this.f.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f;
            int i = this.e - 1;
            this.e = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final g82<View> a(ViewGroup viewGroup) {
        v62.f(viewGroup, "$this$children");
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        v62.f(viewGroup, "$this$iterator");
        return new b(viewGroup);
    }
}
