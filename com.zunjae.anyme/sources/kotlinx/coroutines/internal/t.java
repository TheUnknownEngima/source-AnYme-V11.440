package kotlinx.coroutines.internal;

import defpackage.m22;
import java.util.ArrayDeque;
import kotlinx.coroutines.k0;

public final class t {
    private static final String a;

    static {
        Object obj;
        Object obj2;
        try {
            m22.a aVar = m22.e;
            Class<?> cls = Class.forName("t42");
            v62.b(cls, "Class.forName(baseContinuationImplClass)");
            obj = cls.getCanonicalName();
            m22.a(obj);
        } catch (Throwable th) {
            m22.a aVar2 = m22.e;
            obj = n22.a(th);
            m22.a(obj);
        }
        if (m22.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) obj;
        try {
            m22.a aVar3 = m22.e;
            Class<?> cls2 = Class.forName("kotlinx.coroutines.internal.t");
            v62.b(cls2, "Class.forName(stackTraceRecoveryClass)");
            obj2 = cls2.getCanonicalName();
            m22.a(obj2);
        } catch (Throwable th2) {
            m22.a aVar4 = m22.e;
            obj2 = n22.a(th2);
            m22.a(obj2);
        }
        if (m22.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str = (String) obj2;
    }

    public static final StackTraceElement a(String str) {
        v62.f(str, "message");
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> l22<E, StackTraceElement[]> b(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !v62.a(cause.getClass(), e.getClass())) {
            return q22.a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        v62.b(stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            v62.b(stackTraceElement, "it");
            if (g(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        return z ? q22.a(cause, stackTrace) : q22.a(e, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E c(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        v62.b(stackTrace, "causeTrace");
        String str = a;
        v62.b(str, "baseContinuationImplClassName");
        int f = f(stackTrace, str);
        int i = 0;
        if (f == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new r22("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + f)];
        for (int i2 = 0; i2 < f; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[f + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[EDGE_INSN: B:12:0x0022->B:11:0x0022 ?: BREAK  
    EDGE_INSN: B:13:0x0022->B:11:0x0022 ?: BREAK  , RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    private static final java.util.ArrayDeque<java.lang.StackTraceElement> d(defpackage.x42 r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.g()
            if (r1 == 0) goto L_0x000e
        L_0x000b:
            r0.add(r1)
        L_0x000e:
            boolean r1 = r2 instanceof defpackage.x42
            if (r1 != 0) goto L_0x0013
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0022
            x42 r2 = r2.c()
            if (r2 == 0) goto L_0x0022
            java.lang.StackTraceElement r1 = r2.g()
            if (r1 == 0) goto L_0x000e
            goto L_0x000b
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.t.d(x42):java.util.ArrayDeque");
    }

    private static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && v62.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && v62.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && v62.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (v62.a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean g(StackTraceElement stackTraceElement) {
        v62.f(stackTraceElement, "$this$isArtificial");
        String className = stackTraceElement.getClassName();
        v62.b(className, "className");
        return f92.s(className, "\b\b\b", false, 2, (Object) null);
    }

    private static final void h(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (g(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                v62.b(last, "result.last");
                if (e(stackTraceElement, last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    private static final <E extends Throwable> E i(E e, x42 x42) {
        l22 b = b(e);
        E e2 = (Throwable) b.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b.b();
        E e3 = f.e(e2);
        if (e3 == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> d = d(x42);
        if (d.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            h(stackTraceElementArr, d);
        }
        c(e2, e3, d);
        return e3;
    }

    public static final <E extends Throwable> E j(E e, k42<?> k42) {
        v62.f(e, "exception");
        v62.f(k42, "continuation");
        return (!k0.d() || !(k42 instanceof x42)) ? e : i(e, (x42) k42);
    }

    public static final <E extends Throwable> E k(E e) {
        E cause;
        v62.f(e, "exception");
        if (k0.d() && (cause = e.getCause()) != null) {
            boolean z = true;
            if (!(!v62.a(cause.getClass(), e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                v62.b(stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    v62.b(stackTraceElement, "it");
                    if (g(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e;
    }
}
