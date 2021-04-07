package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: dh  reason: default package */
class dh<Model, Data> implements ah<Model, Data> {
    private final List<ah<Model, Data>> a;
    private final r3<List<Throwable>> b;

    /* renamed from: dh$a */
    static class a<Data> implements wd<Data>, wd.a<Data> {
        private final List<wd<Data>> e;
        private final r3<List<Throwable>> f;
        private int g = 0;
        private g h;
        private wd.a<? super Data> i;
        private List<Throwable> j;
        private boolean k;

        a(List<wd<Data>> list, r3<List<Throwable>> r3Var) {
            this.f = r3Var;
            jm.c(list);
            this.e = list;
        }

        private void g() {
            if (!this.k) {
                if (this.g < this.e.size() - 1) {
                    this.g++;
                    e(this.h, this.i);
                    return;
                }
                jm.d(this.j);
                this.i.c(new df("Fetch failed", (List<Throwable>) new ArrayList(this.j)));
            }
        }

        public Class<Data> a() {
            return this.e.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.j;
            if (list != null) {
                this.f.c(list);
            }
            this.j = null;
            for (wd<Data> b : this.e) {
                b.b();
            }
        }

        public void c(Exception exc) {
            List<Throwable> list = this.j;
            jm.d(list);
            list.add(exc);
            g();
        }

        public void cancel() {
            this.k = true;
            for (wd<Data> cancel : this.e) {
                cancel.cancel();
            }
        }

        public com.bumptech.glide.load.a d() {
            return this.e.get(0).d();
        }

        public void e(g gVar, wd.a<? super Data> aVar) {
            this.h = gVar;
            this.i = aVar;
            this.j = this.f.b();
            this.e.get(this.g).e(gVar, this);
            if (this.k) {
                cancel();
            }
        }

        public void f(Data data) {
            if (data != null) {
                this.i.f(data);
            } else {
                g();
            }
        }
    }

    dh(List<ah<Model, Data>> list, r3<List<Throwable>> r3Var) {
        this.a = list;
        this.b = r3Var;
    }

    public boolean a(Model model) {
        for (ah<Model, Data> a2 : this.a) {
            if (a2.a(model)) {
                return true;
            }
        }
        return false;
    }

    public ah.a<Data> b(Model model, int i, int i2, i iVar) {
        ah.a b2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            ah ahVar = this.a.get(i3);
            if (ahVar.a(model) && (b2 = ahVar.b(model, i, i2, iVar)) != null) {
                gVar = b2.a;
                arrayList.add(b2.c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new ah.a<>(gVar, new a(arrayList, this.b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
