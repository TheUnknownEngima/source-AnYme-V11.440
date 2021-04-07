package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    @Deprecated
    public void a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        a(viewGroup, i, obj);
        throw null;
    }

    @Deprecated
    public void c(View view) {
    }

    public void d(ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(Object obj) {
        return -1;
    }

    public CharSequence g(int i) {
        return null;
    }

    public float h(int i) {
        return 1.0f;
    }

    @Deprecated
    public Object i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object j(ViewGroup viewGroup, int i) {
        i(viewGroup, i);
        throw null;
    }

    public abstract boolean k(View view, Object obj);

    public void l() {
        synchronized (this) {
            if (this.b != null) {
                this.b.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public void m(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(View view, int i, Object obj) {
    }

    public void q(ViewGroup viewGroup, int i, Object obj) {
        p(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(View view) {
    }

    public void t(ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
