package defpackage;

import defpackage.ei2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: zh2  reason: default package */
final class zh2 extends ei2.a {
    private boolean a = true;

    /* renamed from: zh2$a */
    static final class a implements ei2<db2, db2> {
        static final a a = new a();

        a() {
        }

        /* renamed from: b */
        public db2 a(db2 db2) {
            try {
                return vi2.a(db2);
            } finally {
                db2.close();
            }
        }
    }

    /* renamed from: zh2$b */
    static final class b implements ei2<bb2, bb2> {
        static final b a = new b();

        b() {
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            bb2 bb2 = (bb2) obj;
            b(bb2);
            return bb2;
        }

        public bb2 b(bb2 bb2) {
            return bb2;
        }
    }

    /* renamed from: zh2$c */
    static final class c implements ei2<db2, db2> {
        static final c a = new c();

        c() {
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            db2 db2 = (db2) obj;
            b(db2);
            return db2;
        }

        public db2 b(db2 db2) {
            return db2;
        }
    }

    /* renamed from: zh2$d */
    static final class d implements ei2<Object, String> {
        static final d a = new d();

        d() {
        }

        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: zh2$e */
    static final class e implements ei2<db2, u22> {
        static final e a = new e();

        e() {
        }

        /* renamed from: b */
        public u22 a(db2 db2) {
            db2.close();
            return u22.a;
        }
    }

    /* renamed from: zh2$f */
    static final class f implements ei2<db2, Void> {
        static final f a = new f();

        f() {
        }

        /* renamed from: b */
        public Void a(db2 db2) {
            db2.close();
            return null;
        }
    }

    zh2() {
    }

    @Nullable
    public ei2<?, bb2> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ri2 ri2) {
        if (bb2.class.isAssignableFrom(vi2.i(type))) {
            return b.a;
        }
        return null;
    }

    @Nullable
    public ei2<db2, ?> d(Type type, Annotation[] annotationArr, ri2 ri2) {
        if (type == db2.class) {
            return vi2.m(annotationArr, sj2.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != u22.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}
