package kotlinx.coroutines.internal;

public final class i {
    private static final Object a = new u("CONDITION_FALSE");

    static {
        new u("ALREADY_REMOVED");
        new u("LIST_EMPTY");
        new u("REMOVE_PREPARED");
    }

    public static final Object a() {
        return a;
    }

    public static final j b(Object obj) {
        j jVar;
        v62.f(obj, "$this$unwrap");
        q qVar = (q) (!(obj instanceof q) ? null : obj);
        return (qVar == null || (jVar = qVar.a) == null) ? (j) obj : jVar;
    }
}
