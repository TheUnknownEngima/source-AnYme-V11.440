package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;

/* renamed from: ih  reason: default package */
public class ih<Model> implements ah<Model, Model> {
    private static final ih<?> a = new ih<>();

    /* renamed from: ih$a */
    public static class a<Model> implements bh<Model, Model> {
        private static final a<?> a = new a<>();

        public static <T> a<T> a() {
            return a;
        }

        public ah<Model, Model> b(eh ehVar) {
            return ih.c();
        }
    }

    /* renamed from: ih$b */
    private static class b<Model> implements wd<Model> {
        private final Model e;

        b(Model model) {
            this.e = model;
        }

        public Class<Model> a() {
            return this.e.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void e(g gVar, wd.a<? super Model> aVar) {
            aVar.f(this.e);
        }
    }

    public static <T> ih<T> c() {
        return a;
    }

    public boolean a(Model model) {
        return true;
    }

    public ah.a<Model> b(Model model, int i, int i2, i iVar) {
        return new ah.a<>(new zl(model), new b(model));
    }
}
