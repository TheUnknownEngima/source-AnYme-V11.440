package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: ei2  reason: default package */
public interface ei2<F, T> {

    /* renamed from: ei2$a */
    public static abstract class a {
        protected static Type a(int i, ParameterizedType parameterizedType) {
            return vi2.h(i, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return vi2.i(type);
        }

        @Nullable
        public ei2<?, bb2> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ri2 ri2) {
            return null;
        }

        @Nullable
        public ei2<db2, ?> d(Type type, Annotation[] annotationArr, ri2 ri2) {
            return null;
        }

        @Nullable
        public ei2<?, String> e(Type type, Annotation[] annotationArr, ri2 ri2) {
            return null;
        }
    }

    @Nullable
    T a(F f);
}
