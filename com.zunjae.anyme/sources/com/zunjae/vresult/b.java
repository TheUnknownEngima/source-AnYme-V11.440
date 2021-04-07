package com.zunjae.vresult;

import androidx.lifecycle.b0;
import androidx.lifecycle.t;
import com.zunjae.vresult.a;
import java.util.List;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.v0;

public final class b {

    @y42(c = "com.zunjae.vresult.VResultKt$launchListOperation$1", f = "VResult.kt", l = {70}, m = "invokeSuspend")
    static final class a extends d52 implements d62<f0, k42<? super u22>, Object> {
        private f0 i;
        Object j;
        int k;
        final /* synthetic */ o52 l;
        final /* synthetic */ t m;

        @y42(c = "com.zunjae.vresult.VResultKt$launchListOperation$1$1", f = "VResult.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.zunjae.vresult.b$a$a  reason: collision with other inner class name */
        static final class C0218a extends d52 implements d62<f0, k42<? super u22>, Object> {
            private f0 i;
            int j;
            final /* synthetic */ a k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0218a(a aVar, k42 k42) {
                super(2, k42);
                this.k = aVar;
            }

            public final Object G(Object obj, Object obj2) {
                return ((C0218a) a(obj, (k42) obj2)).k(u22.a);
            }

            public final k42<u22> a(Object obj, k42<?> k42) {
                v62.e(k42, "completion");
                C0218a aVar = new C0218a(this.k, k42);
                aVar.i = (f0) obj;
                return aVar;
            }

            public final Object k(Object obj) {
                t tVar;
                Object obj2;
                Object unused = s42.d();
                if (this.j == 0) {
                    n22.b(obj);
                    try {
                        List list = (List) this.k.l.invoke();
                        if (list == null) {
                            tVar = this.k.m;
                            obj2 = new a.b((Exception) null);
                        } else if (list.isEmpty()) {
                            tVar = this.k.m;
                            obj2 = a.d.a;
                        } else {
                            this.k.m.k(new a.e(list));
                            return u22.a;
                        }
                        tVar.k(obj2);
                    } catch (Exception e) {
                        uj2.d(e);
                        this.k.m.k(new a.b(e));
                    }
                    return u22.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o52 o52, t tVar, k42 k42) {
            super(2, k42);
            this.l = o52;
            this.m = tVar;
        }

        public final Object G(Object obj, Object obj2) {
            return ((a) a(obj, (k42) obj2)).k(u22.a);
        }

        public final k42<u22> a(Object obj, k42<?> k42) {
            v62.e(k42, "completion");
            a aVar = new a(this.l, this.m, k42);
            aVar.i = (f0) obj;
            return aVar;
        }

        public final Object k(Object obj) {
            Object d = s42.d();
            int i2 = this.k;
            if (i2 == 0) {
                n22.b(obj);
                f0 f0Var = this.i;
                a0 a = v0.a();
                C0218a aVar = new C0218a(this, (k42) null);
                this.j = f0Var;
                this.k = 1;
                if (d.c(a, aVar, this) == d) {
                    return d;
                }
            } else if (i2 == 1) {
                f0 f0Var2 = (f0) this.j;
                n22.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u22.a;
        }
    }

    @y42(c = "com.zunjae.vresult.VResultKt$launchOperation$1", f = "VResult.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.zunjae.vresult.b$b  reason: collision with other inner class name */
    static final class C0219b extends d52 implements d62<f0, k42<? super u22>, Object> {
        private f0 i;
        Object j;
        int k;
        final /* synthetic */ o52 l;
        final /* synthetic */ t m;

        @y42(c = "com.zunjae.vresult.VResultKt$launchOperation$1$1", f = "VResult.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.zunjae.vresult.b$b$a */
        static final class a extends d52 implements d62<f0, k42<? super u22>, Object> {
            private f0 i;
            int j;
            final /* synthetic */ C0219b k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C0219b bVar, k42 k42) {
                super(2, k42);
                this.k = bVar;
            }

            public final Object G(Object obj, Object obj2) {
                return ((a) a(obj, (k42) obj2)).k(u22.a);
            }

            public final k42<u22> a(Object obj, k42<?> k42) {
                v62.e(k42, "completion");
                a aVar = new a(this.k, k42);
                aVar.i = (f0) obj;
                return aVar;
            }

            public final Object k(Object obj) {
                t tVar;
                a.e eVar;
                Object unused = s42.d();
                if (this.j == 0) {
                    n22.b(obj);
                    try {
                        Object invoke = this.k.l.invoke();
                        if (invoke == null) {
                            this.k.m.k(new a.b((Exception) null));
                            return u22.a;
                        }
                        if (invoke instanceof c) {
                            List a = ((c) invoke).a();
                            if (a == null) {
                                this.k.m.k(new a.b((Exception) null));
                            } else if (a.isEmpty()) {
                                this.k.m.k(a.d.a);
                            } else {
                                tVar = this.k.m;
                                eVar = new a.e(invoke);
                            }
                            return u22.a;
                        }
                        tVar = this.k.m;
                        eVar = new a.e(invoke);
                        tVar.k(eVar);
                        return u22.a;
                    } catch (Exception e) {
                        uj2.d(e);
                        this.k.m.k(new a.b(e));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0219b(o52 o52, t tVar, k42 k42) {
            super(2, k42);
            this.l = o52;
            this.m = tVar;
        }

        public final Object G(Object obj, Object obj2) {
            return ((C0219b) a(obj, (k42) obj2)).k(u22.a);
        }

        public final k42<u22> a(Object obj, k42<?> k42) {
            v62.e(k42, "completion");
            C0219b bVar = new C0219b(this.l, this.m, k42);
            bVar.i = (f0) obj;
            return bVar;
        }

        public final Object k(Object obj) {
            Object d = s42.d();
            int i2 = this.k;
            if (i2 == 0) {
                n22.b(obj);
                f0 f0Var = this.i;
                a0 a2 = v0.a();
                a aVar = new a(this, (k42) null);
                this.j = f0Var;
                this.k = 1;
                if (d.c(a2, aVar, this) == d) {
                    return d;
                }
            } else if (i2 == 1) {
                f0 f0Var2 = (f0) this.j;
                n22.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u22.a;
        }
    }

    public static final <T> boolean a(t<a<T>> tVar) {
        v62.e(tVar, "$this$alreadySucceeded");
        return (tVar.d() instanceof a.e) || (tVar.d() instanceof a.d);
    }

    public static final <T> void b(androidx.lifecycle.a0 a0Var, t<a<List<T>>> tVar, o52<? extends List<? extends T>> o52) {
        v62.e(a0Var, "$this$launchListOperation");
        v62.e(tVar, "liveData");
        v62.e(o52, "function");
        tVar.k(a.c.a);
        o1 unused = e.b(b0.a(a0Var), (n42) null, (i0) null, new a(o52, tVar, (k42) null), 3, (Object) null);
    }

    public static final <T> void c(androidx.lifecycle.a0 a0Var, t<a<T>> tVar, o52<? extends T> o52) {
        v62.e(a0Var, "$this$launchOperation");
        v62.e(tVar, "liveData");
        v62.e(o52, "func");
        tVar.k(a.c.a);
        o1 unused = e.b(b0.a(a0Var), (n42) null, (i0) null, new C0219b(o52, tVar, (k42) null), 3, (Object) null);
    }
}
