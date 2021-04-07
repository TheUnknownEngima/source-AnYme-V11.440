package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.ei2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: wi2  reason: default package */
public final class wi2 extends ei2.a {
    private final Gson a;

    private wi2(Gson gson) {
        this.a = gson;
    }

    public static wi2 f() {
        return g(new Gson());
    }

    public static wi2 g(Gson gson) {
        if (gson != null) {
            return new wi2(gson);
        }
        throw new NullPointerException("gson == null");
    }

    public ei2<?, bb2> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ri2 ri2) {
        return new xi2(this.a, this.a.getAdapter(TypeToken.get(type)));
    }

    public ei2<db2, ?> d(Type type, Annotation[] annotationArr, ri2 ri2) {
        return new yi2(this.a, this.a.getAdapter(TypeToken.get(type)));
    }
}
