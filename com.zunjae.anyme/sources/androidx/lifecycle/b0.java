package androidx.lifecycle;

import kotlinx.coroutines.f0;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.v0;

public final class b0 {
    public static final f0 a(a0 a0Var) {
        v62.f(a0Var, "$this$viewModelScope");
        f0 f0Var = (f0) a0Var.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (f0Var != null) {
            return f0Var;
        }
        Object e = a0Var.e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new b(i2.b((o1) null, 1, (Object) null).plus(v0.c().U())));
        v62.b(e, "setTagIfAbsent(JOB_KEY,\n…patchers.Main.immediate))");
        return (f0) e;
    }
}
