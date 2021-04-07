package defpackage;

import defpackage.ei2;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: li2  reason: default package */
final class li2 extends ei2.a {
    static final ei2.a a = new li2();

    @IgnoreJRERequirement
    /* renamed from: li2$a */
    static final class a<T> implements ei2<db2, Optional<T>> {
        final ei2<db2, T> a;

        a(ei2<db2, T> ei2) {
            this.a = ei2;
        }

        /* renamed from: b */
        public Optional<T> a(db2 db2) {
            return Optional.ofNullable(this.a.a(db2));
        }
    }

    li2() {
    }

    @Nullable
    public ei2<db2, ?> d(Type type, Annotation[] annotationArr, ri2 ri2) {
        if (ei2.a.b(type) != Optional.class) {
            return null;
        }
        return new a(ri2.i(ei2.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
