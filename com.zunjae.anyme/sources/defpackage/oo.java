package defpackage;

/* renamed from: oo  reason: default package */
public final class oo {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, no<TInput, TResult, TException> noVar, po<TInput, TResult> poVar) {
        TResult a;
        if (i < 1) {
            return noVar.a(tinput);
        }
        do {
            a = noVar.a(tinput);
            tinput = poVar.a(tinput, a);
            if (tinput == null || i - 1 < 1) {
                return a;
            }
            a = noVar.a(tinput);
            tinput = poVar.a(tinput, a);
            break;
        } while (i - 1 < 1);
        return a;
    }
}
