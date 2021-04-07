package defpackage;

import defpackage.bi2;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: di2  reason: default package */
final class di2 extends bi2.a {
    static final bi2.a a = new di2();

    @IgnoreJRERequirement
    /* renamed from: di2$a */
    private static final class a<R> implements bi2<R, CompletableFuture<R>> {
        private final Type a;

        /* renamed from: di2$a$a  reason: collision with other inner class name */
        class C0225a extends CompletableFuture<R> {
            final /* synthetic */ ai2 e;

            C0225a(a aVar, ai2 ai2) {
                this.e = ai2;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.e.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: di2$a$b */
        class b implements ci2<R> {
            final /* synthetic */ CompletableFuture a;

            b(a aVar, CompletableFuture completableFuture) {
                this.a = completableFuture;
            }

            public void a(ai2<R> ai2, Throwable th) {
                this.a.completeExceptionally(th);
            }

            public void b(ai2<R> ai2, qi2<R> qi2) {
                if (qi2.d()) {
                    this.a.complete(qi2.a());
                } else {
                    this.a.completeExceptionally(new gi2(qi2));
                }
            }
        }

        a(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        /* renamed from: c */
        public CompletableFuture<R> b(ai2<R> ai2) {
            C0225a aVar = new C0225a(this, ai2);
            ai2.Q(new b(this, aVar));
            return aVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: di2$b */
    private static final class b<R> implements bi2<R, CompletableFuture<qi2<R>>> {
        private final Type a;

        /* renamed from: di2$b$a */
        class a extends CompletableFuture<qi2<R>> {
            final /* synthetic */ ai2 e;

            a(b bVar, ai2 ai2) {
                this.e = ai2;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.e.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: di2$b$b  reason: collision with other inner class name */
        class C0226b implements ci2<R> {
            final /* synthetic */ CompletableFuture a;

            C0226b(b bVar, CompletableFuture completableFuture) {
                this.a = completableFuture;
            }

            public void a(ai2<R> ai2, Throwable th) {
                this.a.completeExceptionally(th);
            }

            public void b(ai2<R> ai2, qi2<R> qi2) {
                this.a.complete(qi2);
            }
        }

        b(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        /* renamed from: c */
        public CompletableFuture<qi2<R>> b(ai2<R> ai2) {
            a aVar = new a(this, ai2);
            ai2.Q(new C0226b(this, aVar));
            return aVar;
        }
    }

    di2() {
    }

    @Nullable
    public bi2<?, ?> a(Type type, Annotation[] annotationArr, ri2 ri2) {
        if (bi2.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b2 = bi2.a.b(0, (ParameterizedType) type);
            if (bi2.a.c(b2) != qi2.class) {
                return new a(b2);
            }
            if (b2 instanceof ParameterizedType) {
                return new b(bi2.a.b(0, (ParameterizedType) b2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
