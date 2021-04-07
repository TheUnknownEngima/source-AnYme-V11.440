package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

public class r<T> extends t<T> {
    private z<LiveData<?>, a<?>> k = new z<>();

    private static class a<V> implements u<V> {
        final LiveData<V> a;
        final u<? super V> b;
        int c = -1;

        a(LiveData<V> liveData, u<? super V> uVar) {
            this.a = liveData;
            this.b = uVar;
        }

        public void a(V v) {
            if (this.c != this.a.e()) {
                this.c = this.a.e();
                this.b.a(v);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.a.h(this);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.a.l(this);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.k.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).b();
        }
    }

    /* access modifiers changed from: protected */
    public void j() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.k.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).c();
        }
    }

    public <S> void n(LiveData<S> liveData, u<? super S> uVar) {
        a aVar = new a(liveData, uVar);
        a j = this.k.j(liveData, aVar);
        if (j != null && j.b != uVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (j == null && f()) {
            aVar.b();
        }
    }
}
