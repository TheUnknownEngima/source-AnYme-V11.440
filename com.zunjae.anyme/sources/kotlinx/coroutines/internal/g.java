package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

public final class g {
    public static final g a = new g();

    private g() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        defpackage.k52.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        defpackage.z12.a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        defpackage.k52.a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> d(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "url.toString()"
            defpackage.v62.b(r0, r1)
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = defpackage.f92.s(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x0062
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = defpackage.g92.b0(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = defpackage.g92.g0(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = defpackage.g92.b0(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0056 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0056 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0056 }
            r3.<init>(r0)     // Catch:{ all -> 0x0056 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0056 }
            r6.<init>(r2)     // Catch:{ all -> 0x0056 }
            kotlinx.coroutines.internal.g r0 = a     // Catch:{ all -> 0x004f }
            java.util.List r0 = r0.e(r6)     // Catch:{ all -> 0x004f }
            defpackage.k52.a(r6, r4)     // Catch:{ all -> 0x0056 }
            r1.close()     // Catch:{ all -> 0x004d }
            return r0
        L_0x004d:
            r6 = move-exception
            throw r6
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r2 = move-exception
            defpackage.k52.a(r6, r0)     // Catch:{ all -> 0x0056 }
            throw r2     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x005d }
            throw r0
        L_0x005d:
            r0 = move-exception
            defpackage.z12.a(r6, r0)
            throw r6
        L_0x0062:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.g r6 = a     // Catch:{ all -> 0x007a }
            java.util.List r6 = r6.e(r0)     // Catch:{ all -> 0x007a }
            defpackage.k52.a(r0, r4)
            return r6
        L_0x007a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            defpackage.k52.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.d(java.net.URL):java.util.List");
    }

    private final List<String> e(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return n32.a0(linkedHashSet);
            }
            String h0 = g92.h0(readLine, "#", (String) null, 2, (Object) null);
            if (h0 != null) {
                String obj = g92.i0(h0).toString();
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i >= obj.length()) {
                        z = true;
                        break;
                    }
                    char charAt = obj.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (obj.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                throw new r22("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        v62.f(cls, "service");
        v62.f(classLoader, "loader");
        try {
            return c(cls, classLoader);
        } catch (Throwable unused) {
            ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
            v62.b(load, "ServiceLoader.load(service, loader)");
            return n32.a0(load);
        }
    }

    public final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        v62.f(cls, "service");
        v62.f(classLoader, "loader");
        Enumeration<URL> resources = classLoader.getResources("META-INF/services/" + cls.getName());
        v62.b(resources, "urls");
        ArrayList<T> list = Collections.list(resources);
        v62.b(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            g gVar = a;
            v62.b(t, "it");
            boolean unused = k32.q(arrayList, gVar.d(t));
        }
        Set<String> f0 = n32.f0(arrayList);
        if (!f0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(g32.l(f0, 10));
            for (String a2 : f0) {
                arrayList2.add(a.a(a2, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
