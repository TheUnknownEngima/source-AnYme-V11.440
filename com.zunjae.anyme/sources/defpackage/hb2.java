package defpackage;

/* renamed from: hb2  reason: default package */
public abstract class hb2 implements Runnable {
    protected final String e;

    public hb2(String str, Object... objArr) {
        this.e = ib2.r(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.e);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
