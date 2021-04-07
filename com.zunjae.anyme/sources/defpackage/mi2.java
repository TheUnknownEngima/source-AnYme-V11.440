package defpackage;

import defpackage.wa2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: mi2  reason: default package */
abstract class mi2<T> {

    /* renamed from: mi2$a */
    class a extends mi2<Iterable<T>> {
        a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(oi2 oi2, @Nullable Iterable<T> iterable) {
            if (iterable != null) {
                for (T a2 : iterable) {
                    mi2.this.a(oi2, a2);
                }
            }
        }
    }

    /* renamed from: mi2$b */
    class b extends mi2<Object> {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    mi2.this.a(oi2, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: mi2$c */
    static final class c<T> extends mi2<T> {
        private final Method a;
        private final int b;
        private final ei2<T, bb2> c;

        c(Method method, int i, ei2<T, bb2> ei2) {
            this.a = method;
            this.b = i;
            this.c = ei2;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            if (t != null) {
                try {
                    oi2.j(this.c.a(t));
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw vi2.q(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw vi2.p(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: mi2$d */
    static final class d<T> extends mi2<T> {
        private final String a;
        private final ei2<T, String> b;
        private final boolean c;

        d(String str, ei2<T, String> ei2, boolean z) {
            vi2.b(str, "name == null");
            this.a = str;
            this.b = ei2;
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                oi2.a(this.a, a2, this.c);
            }
        }
    }

    /* renamed from: mi2$e */
    static final class e<T> extends mi2<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ei2<T, String> c;
        private final boolean d;

        e(Method method, int i, ei2<T, String> ei2, boolean z) {
            this.a = method;
            this.b = i;
            this.c = ei2;
            this.d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(oi2 oi2, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a2 = this.c.a(value);
                            if (a2 != null) {
                                oi2.a(str, a2, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw vi2.p(method, i, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.a;
                            int i2 = this.b;
                            throw vi2.p(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw vi2.p(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw vi2.p(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: mi2$f */
    static final class f<T> extends mi2<T> {
        private final String a;
        private final ei2<T, String> b;

        f(String str, ei2<T, String> ei2) {
            vi2.b(str, "name == null");
            this.a = str;
            this.b = ei2;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                oi2.b(this.a, a2);
            }
        }
    }

    /* renamed from: mi2$g */
    static final class g<T> extends mi2<T> {
        private final Method a;
        private final int b;
        private final sa2 c;
        private final ei2<T, bb2> d;

        g(Method method, int i, sa2 sa2, ei2<T, bb2> ei2) {
            this.a = method;
            this.b = i;
            this.c = sa2;
            this.d = ei2;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            if (t != null) {
                try {
                    oi2.c(this.c, this.d.a(t));
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw vi2.p(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: mi2$h */
    static final class h<T> extends mi2<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ei2<T, bb2> c;
        private final String d;

        h(Method method, int i, ei2<T, bb2> ei2, String str) {
            this.a = method;
            this.b = i;
            this.c = ei2;
            this.d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(oi2 oi2, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            oi2.c(sa2.g("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.d), this.c.a(value));
                        } else {
                            Method method = this.a;
                            int i = this.b;
                            throw vi2.p(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw vi2.p(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw vi2.p(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: mi2$i */
    static final class i<T> extends mi2<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final ei2<T, String> d;
        private final boolean e;

        i(Method method, int i, String str, ei2<T, String> ei2, boolean z) {
            this.a = method;
            this.b = i;
            vi2.b(str, "name == null");
            this.c = str;
            this.d = ei2;
            this.e = z;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            if (t != null) {
                oi2.e(this.c, this.d.a(t), this.e);
                return;
            }
            Method method = this.a;
            int i = this.b;
            throw vi2.p(method, i, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: mi2$j */
    static final class j<T> extends mi2<T> {
        private final String a;
        private final ei2<T, String> b;
        private final boolean c;

        j(String str, ei2<T, String> ei2, boolean z) {
            vi2.b(str, "name == null");
            this.a = str;
            this.b = ei2;
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.b.a(t)) != null) {
                oi2.f(this.a, a2, this.c);
            }
        }
    }

    /* renamed from: mi2$k */
    static final class k<T> extends mi2<Map<String, T>> {
        private final Method a;
        private final int b;
        private final ei2<T, String> c;
        private final boolean d;

        k(Method method, int i, ei2<T, String> ei2, boolean z) {
            this.a = method;
            this.b = i;
            this.c = ei2;
            this.d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(oi2 oi2, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a2 = this.c.a(value);
                            if (a2 != null) {
                                oi2.f(str, a2, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw vi2.p(method, i, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.a;
                            int i2 = this.b;
                            throw vi2.p(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw vi2.p(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw vi2.p(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: mi2$l */
    static final class l<T> extends mi2<T> {
        private final ei2<T, String> a;
        private final boolean b;

        l(ei2<T, String> ei2, boolean z) {
            this.a = ei2;
            this.b = z;
        }

        /* access modifiers changed from: package-private */
        public void a(oi2 oi2, @Nullable T t) {
            if (t != null) {
                oi2.f(this.a.a(t), (String) null, this.b);
            }
        }
    }

    /* renamed from: mi2$m */
    static final class m extends mi2<wa2.b> {
        static final m a = new m();

        private m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(oi2 oi2, @Nullable wa2.b bVar) {
            if (bVar != null) {
                oi2.d(bVar);
            }
        }
    }

    mi2() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(oi2 oi2, @Nullable T t);

    /* access modifiers changed from: package-private */
    public final mi2<Object> b() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public final mi2<Iterable<T>> c() {
        return new a();
    }
}
