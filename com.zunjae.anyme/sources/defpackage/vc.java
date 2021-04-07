package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vc  reason: default package */
public class vc implements Callable<Boolean> {
    private final ac a;

    public vc(ac acVar) {
        this.a = acVar;
    }

    /* renamed from: a */
    public Boolean call() {
        return Boolean.valueOf(this.a.f().j());
    }
}
