package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import defpackage.xd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class h {
    private final ch a;
    private final rk b;
    private final vk c;
    private final wk d;
    private final yd e;
    private final vj f;
    private final sk g;
    private final uk h = new uk();
    private final tk i = new tk();
    private final r3<List<Throwable>> j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m, List<ah<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        r3<List<Throwable>> e2 = lm.e();
        this.j = e2;
        this.a = new ch(e2);
        this.b = new rk();
        this.c = new vk();
        this.d = new wk();
        this.e = new yd();
        this.f = new vj();
        this.g = new sk();
        r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    private <Data, TResource, Transcode> List<ve<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.c.d(cls, cls2)) {
            for (Class next2 : this.f.b(next, cls3)) {
                arrayList.add(new ve(cls, next, next2, this.c.b(cls, next), this.f.a(next, next2), this.j));
            }
        }
        return arrayList;
    }

    public <Data> h a(Class<Data> cls, com.bumptech.glide.load.d<Data> dVar) {
        this.b.a(cls, dVar);
        return this;
    }

    public <TResource> h b(Class<TResource> cls, l<TResource> lVar) {
        this.d.a(cls, lVar);
        return this;
    }

    public <Data, TResource> h c(Class<Data> cls, Class<TResource> cls2, k<Data, TResource> kVar) {
        e("legacy_append", cls, cls2, kVar);
        return this;
    }

    public <Model, Data> h d(Class<Model> cls, Class<Data> cls2, bh<Model, Data> bhVar) {
        this.a.a(cls, cls2, bhVar);
        return this;
    }

    public <Data, TResource> h e(String str, Class<Data> cls, Class<TResource> cls2, k<Data, TResource> kVar) {
        this.c.a(str, kVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b2 = this.g.b();
        if (!b2.isEmpty()) {
            return b2;
        }
        throw new b();
    }

    public <Data, TResource, Transcode> gf<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        gf<Data, TResource, Transcode> a2 = this.i.a(cls, cls2, cls3);
        if (this.i.c(a2)) {
            return null;
        }
        if (a2 == null) {
            List<ve<Data, TResource, Transcode>> f2 = f(cls, cls2, cls3);
            if (f2.isEmpty()) {
                a2 = null;
            } else {
                a2 = new gf<>(cls, cls2, cls3, f2, this.j);
            }
            this.i.d(cls, cls2, cls3, a2);
        }
        return a2;
    }

    public <Model> List<ah<Model, ?>> i(Model model) {
        return this.a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a2 = this.h.a(cls, cls2, cls3);
        if (a2 == null) {
            a2 = new ArrayList<>();
            for (Class<?> d2 : this.a.c(cls)) {
                for (Class next : this.c.d(d2, cls2)) {
                    if (!this.f.b(next, cls3).isEmpty() && !a2.contains(next)) {
                        a2.add(next);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(a2));
        }
        return a2;
    }

    public <X> l<X> k(Cif<X> ifVar) {
        l<X> b2 = this.d.b(ifVar.d());
        if (b2 != null) {
            return b2;
        }
        throw new d(ifVar.d());
    }

    public <X> xd<X> l(X x) {
        return this.e.a(x);
    }

    public <X> com.bumptech.glide.load.d<X> m(X x) {
        com.bumptech.glide.load.d<X> b2 = this.b.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new e(x.getClass());
    }

    public boolean n(Cif<?> ifVar) {
        return this.d.b(ifVar.d()) != null;
    }

    public h o(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public h p(xd.a<?> aVar) {
        this.e.b(aVar);
        return this;
    }

    public <TResource, Transcode> h q(Class<TResource> cls, Class<Transcode> cls2, uj<TResource, Transcode> ujVar) {
        this.f.c(cls, cls2, ujVar);
        return this;
    }

    public final h r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.c.e(arrayList);
        return this;
    }
}
