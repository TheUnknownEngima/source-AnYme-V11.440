package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: bi2  reason: default package */
public interface bi2<R, T> {

    /* renamed from: bi2$a */
    public static abstract class a {
        protected static Type b(int i, ParameterizedType parameterizedType) {
            return vi2.h(i, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return vi2.i(type);
        }

        @Nullable
        public abstract bi2<?, ?> a(Type type, Annotation[] annotationArr, ri2 ri2);
    }

    Type a();

    T b(ai2<R> ai2);
}
