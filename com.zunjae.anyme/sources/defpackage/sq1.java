package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: sq1  reason: default package */
class sq1 {
    final Object a;
    private final Method b;
    private final int c;
    private boolean d = true;

    sq1(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        } else if (method != null) {
            this.a = obj;
            this.b = method;
            method.setAccessible(true);
            this.c = ((method.hashCode() + 31) * 31) + obj.hashCode();
        } else {
            throw new NullPointerException("EventProducer method cannot be null.");
        }
    }

    public void a() {
        this.d = false;
    }

    public boolean b() {
        return this.d;
    }

    public Object c() {
        if (this.d) {
            try {
                return this.b.invoke(this.a, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        } else {
            throw new IllegalStateException(toString() + " has been invalidated and can no longer produce events.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sq1.class != obj.getClass()) {
            return false;
        }
        sq1 sq1 = (sq1) obj;
        return this.b.equals(sq1.b) && this.a == sq1.a;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return "[EventProducer " + this.b + "]";
    }
}
