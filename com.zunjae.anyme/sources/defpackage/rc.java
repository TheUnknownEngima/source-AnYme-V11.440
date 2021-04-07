package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rc  reason: default package */
public class rc implements Callable<Boolean> {
    private final ac a;

    public rc(ac acVar) {
        this.a = acVar;
    }

    /* renamed from: a */
    public Boolean call() {
        return Boolean.valueOf(this.a.b().j());
    }
}
