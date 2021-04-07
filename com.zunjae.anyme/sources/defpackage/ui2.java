package defpackage;

import java.lang.annotation.Annotation;

/* renamed from: ui2  reason: default package */
final class ui2 implements ti2 {
    private static final ti2 a = new ui2();

    ui2() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (vi2.m(annotationArr, ti2.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return ti2.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof ti2;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + ti2.class.getName() + "()";
    }
}
