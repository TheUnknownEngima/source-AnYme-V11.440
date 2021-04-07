package defpackage;

import defpackage.m22;
import java.lang.reflect.Method;
import kotlinx.coroutines.i;
import kotlinx.coroutines.j;

/* renamed from: ji2  reason: default package */
public final class ji2 {

    /* renamed from: ji2$a */
    static final class a extends w62 implements z52<Throwable, u22> {
        final /* synthetic */ ai2 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ai2 ai2) {
            super(1);
            this.f = ai2;
        }

        public final void a(Throwable th) {
            this.f.cancel();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((Throwable) obj);
            return u22.a;
        }
    }

    /* renamed from: ji2$b */
    static final class b extends w62 implements z52<Throwable, u22> {
        final /* synthetic */ ai2 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ai2 ai2) {
            super(1);
            this.f = ai2;
        }

        public final void a(Throwable th) {
            this.f.cancel();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((Throwable) obj);
            return u22.a;
        }
    }

    /* renamed from: ji2$c */
    public static final class c implements ci2<T> {
        final /* synthetic */ i a;

        c(i iVar) {
            this.a = iVar;
        }

        public void a(ai2<T> ai2, Throwable th) {
            v62.f(ai2, "call");
            v62.f(th, "t");
            i iVar = this.a;
            m22.a aVar = m22.e;
            Object a2 = n22.a(th);
            m22.a(a2);
            iVar.d(a2);
        }

        public void b(ai2<T> ai2, qi2<T> qi2) {
            T t;
            i iVar;
            v62.f(ai2, "call");
            v62.f(qi2, "response");
            if (qi2.d()) {
                t = qi2.a();
                if (t == null) {
                    Object i = ai2.i().i(ii2.class);
                    if (i != null) {
                        v62.b(i, "call.request().tag(Invocation::class.java)!!");
                        Method a2 = ((ii2) i).a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        v62.b(a2, "method");
                        Class<?> declaringClass = a2.getDeclaringClass();
                        v62.b(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(a2.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        b22 b22 = new b22(sb.toString());
                        iVar = this.a;
                        m22.a aVar = m22.e;
                        t = n22.a(b22);
                    } else {
                        v62.l();
                        throw null;
                    }
                } else {
                    iVar = this.a;
                    m22.a aVar2 = m22.e;
                }
            } else {
                iVar = this.a;
                gi2 gi2 = new gi2(qi2);
                m22.a aVar3 = m22.e;
                t = n22.a(gi2);
            }
            m22.a(t);
            iVar.d(t);
        }
    }

    /* renamed from: ji2$d */
    public static final class d implements ci2<T> {
        final /* synthetic */ i a;

        d(i iVar) {
            this.a = iVar;
        }

        public void a(ai2<T> ai2, Throwable th) {
            v62.f(ai2, "call");
            v62.f(th, "t");
            i iVar = this.a;
            m22.a aVar = m22.e;
            Object a2 = n22.a(th);
            m22.a(a2);
            iVar.d(a2);
        }

        public void b(ai2<T> ai2, qi2<T> qi2) {
            T t;
            i iVar;
            v62.f(ai2, "call");
            v62.f(qi2, "response");
            if (qi2.d()) {
                iVar = this.a;
                t = qi2.a();
                m22.a aVar = m22.e;
            } else {
                iVar = this.a;
                gi2 gi2 = new gi2(qi2);
                m22.a aVar2 = m22.e;
                t = n22.a(gi2);
            }
            m22.a(t);
            iVar.d(t);
        }
    }

    /* renamed from: ji2$e */
    static final class e extends w62 implements z52<Throwable, u22> {
        final /* synthetic */ ai2 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ai2 ai2) {
            super(1);
            this.f = ai2;
        }

        public final void a(Throwable th) {
            this.f.cancel();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((Throwable) obj);
            return u22.a;
        }
    }

    /* renamed from: ji2$f */
    public static final class f implements ci2<T> {
        final /* synthetic */ i a;

        f(i iVar) {
            this.a = iVar;
        }

        public void a(ai2<T> ai2, Throwable th) {
            v62.f(ai2, "call");
            v62.f(th, "t");
            i iVar = this.a;
            m22.a aVar = m22.e;
            Object a2 = n22.a(th);
            m22.a(a2);
            iVar.d(a2);
        }

        public void b(ai2<T> ai2, qi2<T> qi2) {
            v62.f(ai2, "call");
            v62.f(qi2, "response");
            i iVar = this.a;
            m22.a aVar = m22.e;
            m22.a(qi2);
            iVar.d(qi2);
        }
    }

    @y42(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", l = {100, 102}, m = "yieldAndThrow")
    /* renamed from: ji2$g */
    static final class g extends w42 {
        /* synthetic */ Object h;
        int i;
        Object j;

        g(k42 k42) {
            super(k42);
        }

        public final Object k(Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return ji2.d((Exception) null, this);
        }
    }

    public static final <T> Object a(ai2<T> ai2, k42<? super T> k42) {
        j jVar = new j(r42.c(k42), 1);
        jVar.f(new a(ai2));
        ai2.Q(new c(jVar));
        Object s = jVar.s();
        if (s == s42.d()) {
            a52.c(k42);
        }
        return s;
    }

    public static final <T> Object b(ai2<T> ai2, k42<? super T> k42) {
        j jVar = new j(r42.c(k42), 1);
        jVar.f(new b(ai2));
        ai2.Q(new d(jVar));
        Object s = jVar.s();
        if (s == s42.d()) {
            a52.c(k42);
        }
        return s;
    }

    public static final <T> Object c(ai2<T> ai2, k42<? super qi2<T>> k42) {
        j jVar = new j(r42.c(k42), 1);
        jVar.f(new e(ai2));
        ai2.Q(new f(jVar));
        Object s = jVar.s();
        if (s == s42.d()) {
            a52.c(k42);
        }
        return s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(java.lang.Exception r4, defpackage.k42<?> r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ji2.g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ji2$g r0 = (defpackage.ji2.g) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.i = r1
            goto L_0x0018
        L_0x0013:
            ji2$g r0 = new ji2$g
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.h
            java.lang.Object r1 = defpackage.s42.d()
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.j
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r0 = r5 instanceof defpackage.m22.b
            if (r0 == 0) goto L_0x0049
            m22$b r5 = (defpackage.m22.b) r5
            java.lang.Throwable r4 = r5.e
            throw r4
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            boolean r2 = r5 instanceof defpackage.m22.b
            if (r2 != 0) goto L_0x004a
            r0.j = r4
            r0.i = r3
            java.lang.Object r5 = kotlinx.coroutines.p2.b(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            throw r4
        L_0x004a:
            m22$b r5 = (defpackage.m22.b) r5
            java.lang.Throwable r4 = r5.e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji2.d(java.lang.Exception, k42):java.lang.Object");
    }
}
