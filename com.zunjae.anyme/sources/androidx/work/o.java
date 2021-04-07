package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class o {
    private UUID a;
    private i8 b;
    private Set<String> c;

    public static abstract class a<B extends a, W extends o> {
        boolean a = false;
        UUID b = UUID.randomUUID();
        i8 c;
        Set<String> d = new HashSet();

        a(Class<? extends ListenableWorker> cls) {
            this.c = new i8(this.b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.d.add(str);
            d();
            return this;
        }

        public final W b() {
            W c2 = c();
            this.b = UUID.randomUUID();
            i8 i8Var = new i8(this.c);
            this.c = i8Var;
            i8Var.a = this.b.toString();
            return c2;
        }

        /* access modifiers changed from: package-private */
        public abstract W c();

        /* access modifiers changed from: package-private */
        public abstract B d();

        public final B e(c cVar) {
            this.c.j = cVar;
            d();
            return this;
        }
    }

    protected o(UUID uuid, i8 i8Var, Set<String> set) {
        this.a = uuid;
        this.b = i8Var;
        this.c = set;
    }

    public UUID a() {
        return this.a;
    }

    public String b() {
        return this.a.toString();
    }

    public Set<String> c() {
        return this.c;
    }

    public i8 d() {
        return this.b;
    }
}
