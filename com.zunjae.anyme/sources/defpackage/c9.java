package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: c9  reason: default package */
public class c9<IT> implements a9<IT> {
    private List<IT> a;
    private f9 b;

    /* renamed from: c9$a */
    static final class a extends w62 implements z52<RecyclerView.g<?>, u22> {
        final /* synthetic */ int f;
        final /* synthetic */ Collection g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i, Collection collection) {
            super(1);
            this.f = i;
            this.g = collection;
        }

        public final void a(RecyclerView.g<?> gVar) {
            v62.f(gVar, "$receiver");
            gVar.s(this.f, this.g.size());
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((RecyclerView.g) obj);
            return u22.a;
        }
    }

    /* renamed from: c9$b */
    static final class b extends w62 implements z52<RecyclerView.g<?>, u22> {
        final /* synthetic */ int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i) {
            super(1);
            this.f = i;
        }

        public final void a(RecyclerView.g<?> gVar) {
            v62.f(gVar, "$receiver");
            gVar.o(this.f);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((RecyclerView.g) obj);
            return u22.a;
        }
    }

    /* renamed from: c9$c */
    static final class c extends w62 implements z52<RecyclerView.g<?>, u22> {
        public static final c f = new c();

        c() {
            super(1);
        }

        public final void a(RecyclerView.g<?> gVar) {
            v62.f(gVar, "$receiver");
            gVar.l();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((RecyclerView.g) obj);
            return u22.a;
        }
    }

    /* renamed from: c9$d */
    static final class d extends w62 implements z52<RecyclerView.g<?>, u22> {
        final /* synthetic */ int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i) {
            super(1);
            this.f = i;
        }

        public final void a(RecyclerView.g<?> gVar) {
            v62.f(gVar, "$receiver");
            gVar.u(this.f);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((RecyclerView.g) obj);
            return u22.a;
        }
    }

    /* renamed from: c9$e */
    static final class e extends w62 implements z52<RecyclerView.g<?>, u22> {
        final /* synthetic */ f.c f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f.c cVar) {
            super(1);
            this.f = cVar;
        }

        public final void a(RecyclerView.g<?> gVar) {
            v62.f(gVar, "$receiver");
            this.f.e(gVar);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((RecyclerView.g) obj);
            return u22.a;
        }
    }

    public c9(List<? extends IT> list) {
        v62.f(list, "initialData");
        this.a = n32.d0(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(List list, int i, r62 r62) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    public void a() {
        this.b = null;
    }

    public void addAll(Collection<? extends IT> collection) {
        v62.f(collection, "newItems");
        int size = this.a.size();
        this.a.addAll(collection);
        f9 f9Var = this.b;
        if (f9Var != null) {
            f9Var.a(new a(size, collection));
        }
    }

    public void b(f9 f9Var) {
        v62.f(f9Var, "handle");
        if (this.b == null) {
            this.b = f9Var;
            f();
        }
    }

    public void c(int i) {
        this.a.remove(i);
        f9 f9Var = this.b;
        if (f9Var != null) {
            f9Var.a(new d(i));
        }
    }

    public void clear() {
        this.a.clear();
        f();
    }

    public void d(List<? extends IT> list, d62<? super IT, ? super IT, Boolean> d62, d62<? super IT, ? super IT, Boolean> d622) {
        v62.f(list, "newItems");
        if (!(!this.a.isEmpty()) || d62 == null || d622 == null) {
            this.a = n32.d0(list);
            f();
            return;
        }
        List<IT> list2 = this.a;
        List<IT> d0 = n32.d0(list);
        this.a = d0;
        f.c a2 = f.a(new j9(list2, d0, d62, d622));
        v62.b(a2, "DiffUtil.calculateDiff(diffCallback)");
        f9 f9Var = this.b;
        if (f9Var != null) {
            f9Var.a(new e(a2));
        }
    }

    public List<IT> e() {
        return n32.a0(this.a);
    }

    public void f() {
        f9 f9Var = this.b;
        if (f9Var != null) {
            f9Var.a(c.f);
        }
    }

    public void g(int i, IT it) {
        v62.f(it, "item");
        this.a.add(i, it);
        f9 f9Var = this.b;
        if (f9Var != null) {
            f9Var.a(new b(i));
        }
    }

    public IT get(int i) {
        return this.a.get(i);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public int size() {
        return this.a.size();
    }
}
