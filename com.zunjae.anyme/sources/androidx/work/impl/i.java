package androidx.work.impl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

class i {
    final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());

    static class a<T> extends r<T> {
        private final i l;

        /* renamed from: androidx.work.impl.i$a$a  reason: collision with other inner class name */
        class C0064a implements u<T> {
            C0064a() {
            }

            public void a(T t) {
                a.this.m(t);
            }
        }

        a(i iVar, LiveData<T> liveData) {
            this.l = iVar;
            n(liveData, new C0064a());
        }

        /* access modifiers changed from: protected */
        public void i() {
            super.i();
            this.l.a(this);
        }

        /* access modifiers changed from: protected */
        public void j() {
            super.j();
            this.l.b(this);
        }
    }

    i() {
    }

    /* access modifiers changed from: package-private */
    public void a(LiveData liveData) {
        this.a.add(liveData);
    }

    /* access modifiers changed from: package-private */
    public void b(LiveData liveData) {
        this.a.remove(liveData);
    }

    public <T> LiveData<T> c(LiveData<T> liveData) {
        return new a(this, liveData);
    }
}
