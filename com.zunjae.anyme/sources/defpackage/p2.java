package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import defpackage.e2;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: p2  reason: default package */
public class p2 extends n2 {
    protected final Class<?> g;
    protected final Constructor<?> h;
    protected final Method i;
    protected final Method j;
    protected final Method k;
    protected final Method l;
    protected final Method m;

    public p2() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method4 = v(y);
            method3 = w(y);
            method2 = A(y);
            method = u(y);
            Class<?> cls2 = y;
            method5 = x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            "Unable to collect necessary methods for class " + e.getClass().getName();
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method4;
        this.j = method3;
        this.k = method2;
        this.l = method;
        this.m = method5;
    }

    private Object o() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        Method method = this.i;
        return this.i != null;
    }

    /* access modifiers changed from: protected */
    public Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    public Typeface b(Context context, e2.b bVar, Resources resources, int i2) {
        if (!t()) {
            return super.b(context, bVar, resources, i2);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        for (e2.c cVar : bVar.a()) {
            if (!q(context, o, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                p(o);
                return null;
            }
        }
        if (!s(o)) {
            return null;
        }
        return l(o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        throw r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface c(android.content.Context r11, android.os.CancellationSignal r12, defpackage.f3.f[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.t()
            if (r0 != 0) goto L_0x0058
            f3$f r13 = r10.h(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.c()     // Catch:{ IOException -> 0x0057 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0057 }
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r12.<init>(r14)     // Catch:{ all -> 0x0049 }
            int r14 = r13.d()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ all -> 0x0049 }
            boolean r13 = r13.e()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x004b }
        L_0x004b:
            r13 = move-exception
            if (r11 == 0) goto L_0x0056
            r11.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch:{ IOException -> 0x0057 }
        L_0x0056:
            throw r13     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r2
        L_0x0058:
            java.util.Map r11 = defpackage.f3.i(r11, r13, r12)
            java.lang.Object r12 = r10.o()
            if (r12 != 0) goto L_0x0063
            return r2
        L_0x0063:
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x0066:
            if (r9 >= r0) goto L_0x0093
            r4 = r13[r9]
            android.net.Uri r5 = r4.c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0077
            goto L_0x0090
        L_0x0077:
            int r6 = r4.b()
            int r7 = r4.d()
            boolean r8 = r4.e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.r(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x008f
            r10.p(r12)
            return r2
        L_0x008f:
            r3 = 1
        L_0x0090:
            int r9 = r9 + 1
            goto L_0x0066
        L_0x0093:
            if (r3 != 0) goto L_0x0099
            r10.p(r12)
            return r2
        L_0x0099:
            boolean r11 = r10.s(r12)
            if (r11 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            android.graphics.Typeface r11 = r10.l(r12)
            if (r11 != 0) goto L_0x00a7
            return r2
        L_0x00a7:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2.c(android.content.Context, android.os.CancellationSignal, f3$f[], int):android.graphics.Typeface");
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        if (!t()) {
            return super.e(context, resources, i2, str, i3);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        if (!q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            p(o);
            return null;
        } else if (!s(o)) {
            return null;
        } else {
            return l(o);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method v(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
