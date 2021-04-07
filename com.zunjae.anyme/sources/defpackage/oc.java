package defpackage;

import java.util.concurrent.Callable;

/* renamed from: oc  reason: default package */
public class oc implements Callable<Boolean> {
    private final ac a;
    private final jb b;

    public oc(ac acVar, jb jbVar) {
        this.a = acVar;
        this.b = jbVar;
    }

    /* renamed from: a */
    public Boolean call() {
        try {
            this.a.h(this.b);
            return Boolean.TRUE;
        } catch (oa e) {
            e.getMessage();
            return Boolean.FALSE;
        }
    }
}
