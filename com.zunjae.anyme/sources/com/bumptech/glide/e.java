package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import java.util.List;
import java.util.Map;

public class e extends ContextWrapper {
    static final k<?, ?> k = new b();
    private final of a;
    private final h b;
    private final ml c;
    private final c.a d;
    private final List<bl<Object>> e;
    private final Map<Class<?>, k<?, ?>> f;
    private final xe g;
    private final boolean h;
    private final int i;
    private cl j;

    public e(Context context, of ofVar, h hVar, ml mlVar, c.a aVar, Map<Class<?>, k<?, ?>> map, List<bl<Object>> list, xe xeVar, boolean z, int i2) {
        super(context.getApplicationContext());
        this.a = ofVar;
        this.b = hVar;
        this.c = mlVar;
        this.d = aVar;
        this.e = list;
        this.f = map;
        this.g = xeVar;
        this.h = z;
        this.i = i2;
    }

    public <X> ql<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.c.a(imageView, cls);
    }

    public of b() {
        return this.a;
    }

    public List<bl<Object>> c() {
        return this.e;
    }

    public synchronized cl d() {
        if (this.j == null) {
            this.j = (cl) this.d.a().Z();
        }
        return this.j;
    }

    public <T> k<?, T> e(Class<T> cls) {
        k<?, T> kVar = this.f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : this.f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) next.getValue();
                }
            }
        }
        return kVar == null ? k : kVar;
    }

    public xe f() {
        return this.g;
    }

    public int g() {
        return this.i;
    }

    public h h() {
        return this.b;
    }

    public boolean i() {
        return this.h;
    }
}
