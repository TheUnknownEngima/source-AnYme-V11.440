package defpackage;

import defpackage.ab2;
import defpackage.mi2;
import defpackage.sa2;
import defpackage.wa2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: pi2  reason: default package */
final class pi2 {
    private final Method a;
    private final ta2 b;
    final String c;
    @Nullable
    private final String d;
    @Nullable
    private final sa2 e;
    @Nullable
    private final va2 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final mi2<?>[] j;
    final boolean k;

    /* renamed from: pi2$a */
    static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final ri2 a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        @Nullable
        String n;
        boolean o;
        boolean p;
        boolean q;
        @Nullable
        String r;
        @Nullable
        sa2 s;
        @Nullable
        va2 t;
        @Nullable
        Set<String> u;
        @Nullable
        mi2<?>[] v;
        boolean w;

        a(ri2 ri2, Method method) {
            this.a = ri2;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private sa2 c(String[] strArr) {
            sa2.a aVar = new sa2.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw vi2.n(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.t = va2.c(trim);
                    } catch (IllegalArgumentException e2) {
                        throw vi2.o(this.b, e2, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.d();
        }

        private void d(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 == null) {
                this.n = str;
                this.o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (x.matcher(substring).find()) {
                            throw vi2.n(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.r = str2;
                    this.u = h(str2);
                    return;
                }
                return;
            }
            throw vi2.n(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof aj2) {
                value = ((aj2) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof dj2) {
                value = ((dj2) annotation).value();
                str = "GET";
            } else if (annotation instanceof ej2) {
                value = ((ej2) annotation).value();
                str = "HEAD";
            } else {
                if (annotation instanceof jj2) {
                    value2 = ((jj2) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof kj2) {
                    value2 = ((kj2) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof lj2) {
                    value2 = ((lj2) annotation).value();
                    str2 = "PUT";
                } else if (annotation instanceof ij2) {
                    value = ((ij2) annotation).value();
                    str = "OPTIONS";
                } else if (annotation instanceof fj2) {
                    fj2 fj2 = (fj2) annotation;
                    d(fj2.method(), fj2.path(), fj2.hasBody());
                    return;
                } else if (annotation instanceof hj2) {
                    String[] value3 = ((hj2) annotation).value();
                    if (value3.length != 0) {
                        this.s = c(value3);
                        return;
                    }
                    throw vi2.n(this.b, "@Headers annotation is empty.", new Object[0]);
                } else {
                    return;
                }
                d(str2, value2, true);
                return;
            }
            d(str, value, false);
        }

        @Nullable
        private mi2<?> f(int i2, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            mi2<?> mi2;
            if (annotationArr != null) {
                mi2 = null;
                for (Annotation g2 : annotationArr) {
                    mi2<?> g3 = g(i2, type, annotationArr, g2);
                    if (g3 != null) {
                        if (mi2 == null) {
                            mi2 = g3;
                        } else {
                            throw vi2.p(this.b, i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                mi2 = null;
            }
            if (mi2 != null) {
                return mi2;
            }
            if (z) {
                try {
                    if (vi2.i(type) == k42.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw vi2.p(this.b, i2, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        private mi2<?> g(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<wa2.b> cls2 = wa2.b.class;
            if (annotation instanceof oj2) {
                j(i2, type);
                if (this.j) {
                    throw vi2.p(this.b, i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.k) {
                    throw vi2.p(this.b, i2, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.l) {
                    throw vi2.p(this.b, i2, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.m) {
                    throw vi2.p(this.b, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.r != null) {
                    this.i = true;
                    oj2 oj2 = (oj2) annotation;
                    String value = oj2.value();
                    i(i2, value);
                    return new mi2.i(this.b, i2, value, this.a.j(type, annotationArr), oj2.encoded());
                } else {
                    throw vi2.p(this.b, i2, "@Path can only be used with relative url on @%s", this.n);
                }
            } else if (annotation instanceof pj2) {
                j(i2, type);
                pj2 pj2 = (pj2) annotation;
                String value2 = pj2.value();
                boolean encoded = pj2.encoded();
                Class<?> i3 = vi2.i(type);
                this.j = true;
                if (Iterable.class.isAssignableFrom(i3)) {
                    if (type instanceof ParameterizedType) {
                        return new mi2.j(value2, this.a.j(vi2.h(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    Method method = this.b;
                    throw vi2.p(method, i2, i3.getSimpleName() + " must include generic type (e.g., " + i3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i3.isArray()) {
                    return new mi2.j(value2, this.a.j(type, annotationArr), encoded);
                } else {
                    return new mi2.j(value2, this.a.j(a(i3.getComponentType()), annotationArr), encoded).b();
                }
            } else if (annotation instanceof rj2) {
                j(i2, type);
                boolean encoded2 = ((rj2) annotation).encoded();
                Class<?> i4 = vi2.i(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(i4)) {
                    if (type instanceof ParameterizedType) {
                        return new mi2.l(this.a.j(vi2.h(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    Method method2 = this.b;
                    throw vi2.p(method2, i2, i4.getSimpleName() + " must include generic type (e.g., " + i4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i4.isArray()) {
                    return new mi2.l(this.a.j(type, annotationArr), encoded2);
                } else {
                    return new mi2.l(this.a.j(a(i4.getComponentType()), annotationArr), encoded2).b();
                }
            } else if (annotation instanceof qj2) {
                j(i2, type);
                Class<?> i5 = vi2.i(type);
                this.l = true;
                if (Map.class.isAssignableFrom(i5)) {
                    Type j2 = vi2.j(type, i5, Map.class);
                    if (j2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) j2;
                        Type h2 = vi2.h(0, parameterizedType);
                        if (cls == h2) {
                            return new mi2.k(this.b, i2, this.a.j(vi2.h(1, parameterizedType), annotationArr), ((qj2) annotation).encoded());
                        }
                        Method method3 = this.b;
                        throw vi2.p(method3, i2, "@QueryMap keys must be of type String: " + h2, new Object[0]);
                    }
                    throw vi2.p(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw vi2.p(this.b, i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof gj2) {
                j(i2, type);
                String value3 = ((gj2) annotation).value();
                Class<?> i6 = vi2.i(type);
                if (Iterable.class.isAssignableFrom(i6)) {
                    if (type instanceof ParameterizedType) {
                        return new mi2.f(value3, this.a.j(vi2.h(0, (ParameterizedType) type), annotationArr)).c();
                    }
                    Method method4 = this.b;
                    throw vi2.p(method4, i2, i6.getSimpleName() + " must include generic type (e.g., " + i6.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i6.isArray()) {
                    return new mi2.f(value3, this.a.j(type, annotationArr));
                } else {
                    return new mi2.f(value3, this.a.j(a(i6.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof bj2) {
                j(i2, type);
                if (this.p) {
                    bj2 bj2 = (bj2) annotation;
                    String value4 = bj2.value();
                    boolean encoded3 = bj2.encoded();
                    this.f = true;
                    Class<?> i7 = vi2.i(type);
                    if (Iterable.class.isAssignableFrom(i7)) {
                        if (type instanceof ParameterizedType) {
                            return new mi2.d(value4, this.a.j(vi2.h(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        Method method5 = this.b;
                        throw vi2.p(method5, i2, i7.getSimpleName() + " must include generic type (e.g., " + i7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!i7.isArray()) {
                        return new mi2.d(value4, this.a.j(type, annotationArr), encoded3);
                    } else {
                        return new mi2.d(value4, this.a.j(a(i7.getComponentType()), annotationArr), encoded3).b();
                    }
                } else {
                    throw vi2.p(this.b, i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof cj2) {
                j(i2, type);
                if (this.p) {
                    Class<?> i8 = vi2.i(type);
                    if (Map.class.isAssignableFrom(i8)) {
                        Type j3 = vi2.j(type, i8, Map.class);
                        if (j3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) j3;
                            Type h3 = vi2.h(0, parameterizedType2);
                            if (cls == h3) {
                                ei2 j4 = this.a.j(vi2.h(1, parameterizedType2), annotationArr);
                                this.f = true;
                                return new mi2.e(this.b, i2, j4, ((cj2) annotation).encoded());
                            }
                            Method method6 = this.b;
                            throw vi2.p(method6, i2, "@FieldMap keys must be of type String: " + h3, new Object[0]);
                        }
                        throw vi2.p(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw vi2.p(this.b, i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw vi2.p(this.b, i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof mj2) {
                j(i2, type);
                if (this.q) {
                    mj2 mj2 = (mj2) annotation;
                    this.g = true;
                    String value5 = mj2.value();
                    Class<?> i9 = vi2.i(type);
                    if (!value5.isEmpty()) {
                        sa2 g2 = sa2.g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", mj2.encoding());
                        if (Iterable.class.isAssignableFrom(i9)) {
                            if (type instanceof ParameterizedType) {
                                Type h4 = vi2.h(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(vi2.i(h4))) {
                                    return new mi2.g(this.b, i2, g2, this.a.h(h4, annotationArr, this.c)).c();
                                }
                                throw vi2.p(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            Method method7 = this.b;
                            throw vi2.p(method7, i2, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (i9.isArray()) {
                            Class<?> a2 = a(i9.getComponentType());
                            if (!cls2.isAssignableFrom(a2)) {
                                return new mi2.g(this.b, i2, g2, this.a.h(a2, annotationArr, this.c)).b();
                            }
                            throw vi2.p(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(i9)) {
                            return new mi2.g(this.b, i2, g2, this.a.h(type, annotationArr, this.c));
                        } else {
                            throw vi2.p(this.b, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(i9)) {
                        if (!(type instanceof ParameterizedType)) {
                            Method method8 = this.b;
                            throw vi2.p(method8, i2, i9.getSimpleName() + " must include generic type (e.g., " + i9.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(vi2.i(vi2.h(0, (ParameterizedType) type)))) {
                            return mi2.m.a.c();
                        } else {
                            throw vi2.p(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (i9.isArray()) {
                        if (cls2.isAssignableFrom(i9.getComponentType())) {
                            return mi2.m.a.b();
                        }
                        throw vi2.p(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(i9)) {
                        return mi2.m.a;
                    } else {
                        throw vi2.p(this.b, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw vi2.p(this.b, i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof nj2) {
                j(i2, type);
                if (this.q) {
                    this.g = true;
                    Class<?> i10 = vi2.i(type);
                    if (Map.class.isAssignableFrom(i10)) {
                        Type j5 = vi2.j(type, i10, Map.class);
                        if (j5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) j5;
                            Type h5 = vi2.h(0, parameterizedType3);
                            if (cls == h5) {
                                Type h6 = vi2.h(1, parameterizedType3);
                                if (!cls2.isAssignableFrom(vi2.i(h6))) {
                                    return new mi2.h(this.b, i2, this.a.h(h6, annotationArr, this.c), ((nj2) annotation).encoding());
                                }
                                throw vi2.p(this.b, i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            Method method9 = this.b;
                            throw vi2.p(method9, i2, "@PartMap keys must be of type String: " + h5, new Object[0]);
                        }
                        throw vi2.p(this.b, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw vi2.p(this.b, i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw vi2.p(this.b, i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof zi2)) {
                return null;
            } else {
                j(i2, type);
                if (this.p || this.q) {
                    throw vi2.p(this.b, i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.h) {
                    try {
                        ei2 h7 = this.a.h(type, annotationArr, this.c);
                        this.h = true;
                        return new mi2.c(this.b, i2, h7);
                    } catch (RuntimeException e2) {
                        throw vi2.q(this.b, e2, i2, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw vi2.p(this.b, i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i2, String str) {
            if (!y.matcher(str).matches()) {
                throw vi2.p(this.b, i2, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
            } else if (!this.u.contains(str)) {
                throw vi2.p(this.b, i2, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
            }
        }

        private void j(int i2, Type type) {
            if (vi2.k(type)) {
                throw vi2.p(this.b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        public pi2 b() {
            for (Annotation e2 : this.c) {
                e(e2);
            }
            if (this.n != null) {
                if (!this.o) {
                    if (this.q) {
                        throw vi2.n(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.p) {
                        throw vi2.n(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.d.length;
                this.v = new mi2[length];
                int i2 = length - 1;
                int i3 = 0;
                while (true) {
                    boolean z = true;
                    if (i3 >= length) {
                        break;
                    }
                    mi2<?>[] mi2Arr = this.v;
                    Type type = this.e[i3];
                    Annotation[] annotationArr = this.d[i3];
                    if (i3 != i2) {
                        z = false;
                    }
                    mi2Arr[i3] = f(i3, type, annotationArr, z);
                    i3++;
                }
                if (this.r == null && !this.m) {
                    throw vi2.n(this.b, "Missing either @%s URL or @Url parameter.", this.n);
                } else if (!this.p && !this.q && !this.o && this.h) {
                    throw vi2.n(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.p && !this.f) {
                    throw vi2.n(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.q || this.g) {
                    return new pi2(this);
                } else {
                    throw vi2.n(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw vi2.n(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    pi2(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }

    static pi2 b(ri2 ri2, Method method) {
        return new a(ri2, method).b();
    }

    /* access modifiers changed from: package-private */
    public ab2 a(Object[] objArr) {
        mi2<?>[] mi2Arr = this.j;
        int length = objArr.length;
        if (length == mi2Arr.length) {
            oi2 oi2 = new oi2(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
            if (this.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                mi2Arr[i2].a(oi2, objArr[i2]);
            }
            ab2.a i3 = oi2.i();
            i3.h(ii2.class, new ii2(this.a, arrayList));
            return i3.b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + mi2Arr.length + ")");
    }
}
