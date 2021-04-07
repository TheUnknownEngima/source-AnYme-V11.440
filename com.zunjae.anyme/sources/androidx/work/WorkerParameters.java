package androidx.work;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    private UUID a;
    private e b;
    private Executor c;
    private s8 d;
    private p e;

    public static class a {
        public a() {
            Collections.emptyList();
            Collections.emptyList();
        }
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i, Executor executor, s8 s8Var, p pVar) {
        this.a = uuid;
        this.b = eVar;
        new HashSet(collection);
        this.c = executor;
        this.d = s8Var;
        this.e = pVar;
    }

    public Executor a() {
        return this.c;
    }

    public UUID b() {
        return this.a;
    }

    public e c() {
        return this.b;
    }

    public s8 d() {
        return this.d;
    }

    public p e() {
        return this.e;
    }
}
