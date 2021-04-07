package defpackage;

import defpackage.bi2;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: fi2  reason: default package */
final class fi2 extends bi2.a {
    @Nullable
    private final Executor a;

    /* renamed from: fi2$a */
    class a implements bi2<Object, ai2<?>> {
        final /* synthetic */ Type a;
        final /* synthetic */ Executor b;

        a(fi2 fi2, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        public Type a() {
            return this.a;
        }

        /* renamed from: c */
        public ai2<Object> b(ai2<Object> ai2) {
            Executor executor = this.b;
            return executor == null ? ai2 : new b(executor, ai2);
        }
    }

    /* renamed from: fi2$b */
    static final class b<T> implements ai2<T> {
        final Executor e;
        final ai2<T> f;

        /* renamed from: fi2$b$a */
        class a implements ci2<T> {
            final /* synthetic */ ci2 a;

            /* renamed from: fi2$b$a$a  reason: collision with other inner class name */
            class C0227a implements Runnable {
                final /* synthetic */ qi2 e;

                C0227a(qi2 qi2) {
                    this.e = qi2;
                }

                public void run() {
                    if (b.this.f.l()) {
                        a aVar = a.this;
                        aVar.a.a(b.this, new IOException("Canceled"));
                        return;
                    }
                    a aVar2 = a.this;
                    aVar2.a.b(b.this, this.e);
                }
            }

            /* renamed from: fi2$b$a$b  reason: collision with other inner class name */
            class C0228b implements Runnable {
                final /* synthetic */ Throwable e;

                C0228b(Throwable th) {
                    this.e = th;
                }

                public void run() {
                    a aVar = a.this;
                    aVar.a.a(b.this, this.e);
                }
            }

            a(ci2 ci2) {
                this.a = ci2;
            }

            public void a(ai2<T> ai2, Throwable th) {
                b.this.e.execute(new C0228b(th));
            }

            public void b(ai2<T> ai2, qi2<T> qi2) {
                b.this.e.execute(new C0227a(qi2));
            }
        }

        b(Executor executor, ai2<T> ai2) {
            this.e = executor;
            this.f = ai2;
        }

        public void Q(ci2<T> ci2) {
            vi2.b(ci2, "callback == null");
            this.f.Q(new a(ci2));
        }

        /* renamed from: Y */
        public ai2<T> clone() {
            return new b(this.e, this.f.Y());
        }

        public void cancel() {
            this.f.cancel();
        }

        public qi2<T> h() {
            return this.f.h();
        }

        public ab2 i() {
            return this.f.i();
        }

        public boolean l() {
            return this.f.l();
        }
    }

    fi2(@Nullable Executor executor) {
        this.a = executor;
    }

    @Nullable
    public bi2<?, ?> a(Type type, Annotation[] annotationArr, ri2 ri2) {
        Executor executor = null;
        if (bi2.a.c(type) != ai2.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type h = vi2.h(0, (ParameterizedType) type);
            if (!vi2.m(annotationArr, ti2.class)) {
                executor = this.a;
            }
            return new a(this, h, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
