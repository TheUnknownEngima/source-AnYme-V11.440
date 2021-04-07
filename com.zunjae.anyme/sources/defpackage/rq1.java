package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: rq1  reason: default package */
class rq1 {
    private final Object a;
    private final Method b;
    private final int c;
    private boolean d = true;

    rq1(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        } else if (method != null) {
            this.a = obj;
            this.b = method;
            method.setAccessible(true);
            this.c = ((method.hashCode() + 31) * 31) + obj.hashCode();
        } else {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
    }

    public void a(Object obj) {
        if (this.d) {
            try {
                this.b.invoke(this.a, new Object[]{obj});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException(toString() + " has been invalidated and can no longer handle events.");
        }
    }

    public void b() {
        this.d = false;
    }

    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rq1.class != obj.getClass()) {
            return false;
        }
        rq1 rq1 = (rq1) obj;
        return this.b.equals(rq1.b) && this.a == rq1.a;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return "[EventHandler " + this.b + "]";
    }
}
