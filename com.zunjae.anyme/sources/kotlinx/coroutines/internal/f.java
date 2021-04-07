package kotlinx.coroutines.internal;

import defpackage.m22;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class f {
    private static final int a = d(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, z52<Throwable, Throwable>> c = new WeakHashMap<>();

    public static final class a extends w62 implements z52<Throwable, Throwable> {
        final /* synthetic */ Constructor f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f = constructor;
        }

        /* renamed from: a */
        public final Throwable r(Throwable th) {
            Object obj;
            v62.f(th, "e");
            try {
                m22.a aVar = m22.e;
                Object newInstance = this.f.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    m22.a(obj);
                    if (m22.c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new r22("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                m22.a aVar2 = m22.e;
                obj = n22.a(th2);
                m22.a(obj);
            }
        }
    }

    public static final class b extends w62 implements z52<Throwable, Throwable> {
        final /* synthetic */ Constructor f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f = constructor;
        }

        /* renamed from: a */
        public final Throwable r(Throwable th) {
            Object obj;
            v62.f(th, "e");
            try {
                m22.a aVar = m22.e;
                Object newInstance = this.f.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = (Throwable) newInstance;
                    m22.a(obj);
                    if (m22.c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new r22("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                m22.a aVar2 = m22.e;
                obj = n22.a(th2);
                m22.a(obj);
            }
        }
    }

    public static final class c extends w62 implements z52<Throwable, Throwable> {
        final /* synthetic */ Constructor f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f = constructor;
        }

        /* renamed from: a */
        public final Throwable r(Throwable th) {
            Throwable th2;
            v62.f(th, "e");
            try {
                m22.a aVar = m22.e;
                Object newInstance = this.f.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    m22.a(th3);
                    th2 = th3;
                    boolean c = m22.c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new r22("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                m22.a aVar2 = m22.e;
                Object a = n22.a(th5);
                m22.a(a);
                th2 = a;
            }
        }
    }

    public static final class d extends w62 implements z52<Throwable, Throwable> {
        final /* synthetic */ Constructor f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f = constructor;
        }

        /* renamed from: a */
        public final Throwable r(Throwable th) {
            Throwable th2;
            v62.f(th, "e");
            try {
                m22.a aVar = m22.e;
                Object newInstance = this.f.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th3 = (Throwable) newInstance;
                    th3.initCause(th);
                    m22.a(th3);
                    th2 = th3;
                    boolean c = m22.c(th2);
                    Throwable th4 = th2;
                    if (c) {
                        th4 = null;
                    }
                    return th4;
                }
                throw new r22("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th5) {
                m22.a aVar2 = m22.e;
                Object a = n22.a(th5);
                m22.a(a);
                th2 = a;
            }
        }
    }

    public static final class e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            v62.b(constructor, "it");
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            v62.b(constructor2, "it");
            return d42.a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$f  reason: collision with other inner class name */
    static final class C0247f extends w62 implements z52 {
        public static final C0247f f = new C0247f();

        C0247f() {
            super(1);
        }

        /* renamed from: a */
        public final Void r(Throwable th) {
            v62.f(th, "it");
            return null;
        }
    }

    static final class g extends w62 implements z52 {
        public static final g f = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final Void r(Throwable th) {
            v62.f(th, "it");
            return null;
        }
    }

    private static final z52<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (v62.a(cls2, Throwable.class)) {
                return new b(constructor);
            }
            if (v62.a(cls2, cls)) {
                return new c(constructor);
            }
        } else if (length == 2 && v62.a(parameterTypes[0], cls) && v62.a(parameterTypes[1], Throwable.class)) {
            return new a(constructor);
        }
        return null;
    }

    private static final int b(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r6.getDeclaredFields();
            v62.b(declaredFields, "declaredFields");
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (Field field : declaredFields) {
                v62.b(field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    static /* synthetic */ int c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return b(cls, i);
    }

    private static final int d(Class<?> cls, int i) {
        Integer num;
        m52.c(cls);
        try {
            m22.a aVar = m22.e;
            num = Integer.valueOf(c(cls, 0, 1, (Object) null));
            m22.a(num);
        } catch (Throwable th) {
            m22.a aVar2 = m22.e;
            num = n22.a(th);
            m22.a(num);
        }
        Integer valueOf = Integer.valueOf(i);
        if (m22.c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final <E extends java.lang.Throwable> E e(E r9) {
        /*
            java.lang.String r0 = "exception"
            defpackage.v62.f(r9, r0)
            boolean r0 = r9 instanceof kotlinx.coroutines.y
            r1 = 0
            if (r0 == 0) goto L_0x002b
            m22$a r0 = defpackage.m22.e     // Catch:{ all -> 0x0016 }
            kotlinx.coroutines.y r9 = (kotlinx.coroutines.y) r9     // Catch:{ all -> 0x0016 }
            java.lang.Throwable r9 = r9.a()     // Catch:{ all -> 0x0016 }
            defpackage.m22.a(r9)     // Catch:{ all -> 0x0016 }
            goto L_0x0020
        L_0x0016:
            r9 = move-exception
            m22$a r0 = defpackage.m22.e
            java.lang.Object r9 = defpackage.n22.a(r9)
            defpackage.m22.a(r9)
        L_0x0020:
            boolean r0 = defpackage.m22.c(r9)
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r9
        L_0x0028:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x002b:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, z52<java.lang.Throwable, java.lang.Throwable>> r2 = c     // Catch:{ all -> 0x0128 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x0128 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0128 }
            z52 r2 = (defpackage.z52) r2     // Catch:{ all -> 0x0128 }
            r0.unlock()
            if (r2 == 0) goto L_0x004c
            java.lang.Object r9 = r2.r(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x004c:
            int r0 = a
            java.lang.Class r2 = r9.getClass()
            r3 = 0
            int r2 = d(r2, r3)
            if (r0 == r2) goto L_0x00a1
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x006a
            int r4 = r0.getReadHoldCount()
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            r5 = 0
        L_0x006c:
            if (r5 >= r4) goto L_0x0074
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x006c
        L_0x0074:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, z52<java.lang.Throwable, java.lang.Throwable>> r5 = c     // Catch:{ all -> 0x0094 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0094 }
            kotlinx.coroutines.internal.f$f r6 = kotlinx.coroutines.internal.f.C0247f.f     // Catch:{ all -> 0x0094 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0094 }
            u22 r9 = defpackage.u22.a     // Catch:{ all -> 0x0094 }
        L_0x0088:
            if (r3 >= r4) goto L_0x0090
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0088
        L_0x0090:
            r0.unlock()
            return r1
        L_0x0094:
            r9 = move-exception
        L_0x0095:
            if (r3 >= r4) goto L_0x009d
            r2.lock()
            int r3 = r3 + 1
            goto L_0x0095
        L_0x009d:
            r0.unlock()
            throw r9
        L_0x00a1:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            java.lang.String r2 = "exception.javaClass.constructors"
            defpackage.v62.b(r0, r2)
            kotlinx.coroutines.internal.f$e r2 = new kotlinx.coroutines.internal.f$e
            r2.<init>()
            java.util.List r0 = defpackage.b32.o(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00bc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00d3
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.String r4 = "constructor"
            defpackage.v62.b(r2, r4)
            z52 r2 = a(r2)
            if (r2 == 0) goto L_0x00bc
        L_0x00d3:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00e4
            int r5 = r0.getReadHoldCount()
            goto L_0x00e5
        L_0x00e4:
            r5 = 0
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            if (r6 >= r5) goto L_0x00ee
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x00e6
        L_0x00ee:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, z52<java.lang.Throwable, java.lang.Throwable>> r6 = c     // Catch:{ all -> 0x011b }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00ff
            r8 = r2
            goto L_0x0101
        L_0x00ff:
            kotlinx.coroutines.internal.f$g r8 = kotlinx.coroutines.internal.f.g.f     // Catch:{ all -> 0x011b }
        L_0x0101:
            r6.put(r7, r8)     // Catch:{ all -> 0x011b }
            u22 r6 = defpackage.u22.a     // Catch:{ all -> 0x011b }
        L_0x0106:
            if (r3 >= r5) goto L_0x010e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0106
        L_0x010e:
            r0.unlock()
            if (r2 == 0) goto L_0x011a
            java.lang.Object r9 = r2.r(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x011a:
            return r1
        L_0x011b:
            r9 = move-exception
        L_0x011c:
            if (r3 >= r5) goto L_0x0124
            r4.lock()
            int r3 = r3 + 1
            goto L_0x011c
        L_0x0124:
            r0.unlock()
            throw r9
        L_0x0128:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.f.e(java.lang.Throwable):java.lang.Throwable");
    }
}
