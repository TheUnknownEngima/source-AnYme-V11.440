package androidx.room;

import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h1;

public final class b {
    public static final a0 a(l lVar) {
        v62.f(lVar, "$this$queryDispatcher");
        Map<String, Object> i = lVar.i();
        v62.b(i, "backingFieldMap");
        Object obj = i.get("QueryDispatcher");
        if (obj == null) {
            Executor m = lVar.m();
            v62.b(m, "queryExecutor");
            obj = h1.a(m);
            i.put("QueryDispatcher", obj);
        }
        if (obj != null) {
            return (a0) obj;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }

    public static final a0 b(l lVar) {
        v62.f(lVar, "$this$transactionDispatcher");
        Map<String, Object> i = lVar.i();
        v62.b(i, "backingFieldMap");
        Object obj = i.get("TransactionDispatcher");
        if (obj == null) {
            Executor n = lVar.n();
            v62.b(n, "transactionExecutor");
            obj = h1.a(n);
            i.put("TransactionDispatcher", obj);
        }
        if (obj != null) {
            return (a0) obj;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }
}
