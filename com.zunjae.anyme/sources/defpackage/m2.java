package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.e2;
import defpackage.f3;
import defpackage.h2;

@SuppressLint({"NewApi"})
/* renamed from: m2  reason: default package */
public class m2 {
    private static final s2 a;
    private static final f0<String, Typeface> b = new f0<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 29 ? new r2() : i >= 28 ? new q2() : i >= 26 ? new p2() : (i < 24 || !o2.m()) ? Build.VERSION.SDK_INT >= 21 ? new n2() : new s2() : new o2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = g(r2, r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = g(r2, r3, r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m2.a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f3.f[] fVarArr, int i) {
        return a.c(context, cancellationSignal, fVarArr, i);
    }

    public static Typeface c(Context context, e2.a aVar, Resources resources, int i, int i2, h2.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof e2.d) {
            e2.d dVar = (e2.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = f3.g(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = a.b(context, (e2.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.b(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.d(e(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = a.e(context, resources, i, str, i2);
        if (e != null) {
            b.d(e(resources, i, i2), e);
        }
        return e;
    }

    private static String e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return b.c(e(resources, i, i2));
    }

    private static Typeface g(Context context, Typeface typeface, int i) {
        e2.b i2 = a.i(typeface);
        if (i2 == null) {
            return null;
        }
        return a.b(context, i2, context.getResources(), i);
    }
}
