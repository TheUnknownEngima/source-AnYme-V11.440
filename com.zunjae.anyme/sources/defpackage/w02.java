package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import io.github.inflationx.viewpump.a;

/* renamed from: w02  reason: default package */
public final class w02 implements a {
    private static final Class<? extends Object>[] a = {Context.class};
    private static final Class<? extends Object>[] b = {Context.class, AttributeSet.class};

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r4, java.lang.String r5, android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r3 = this;
            java.lang.String r4 = "name"
            defpackage.v62.f(r5, r4)
            java.lang.String r4 = "context"
            defpackage.v62.f(r6, r4)
            java.lang.Class r4 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r4 = r4.asSubclass(r5)     // Catch:{ Exception -> 0x0055 }
            r5 = 0
            r0 = 1
            java.lang.Class<? extends java.lang.Object>[] r1 = b     // Catch:{ NoSuchMethodException -> 0x0030 }
            int r2 = r1.length     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r1 = r4.getConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0030 }
            java.lang.String r2 = "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_2)"
            defpackage.v62.b(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0030 }
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0030 }
            r2[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0030 }
            r2[r0] = r7     // Catch:{ NoSuchMethodException -> 0x0030 }
            goto L_0x0046
        L_0x0030:
            java.lang.Class<? extends java.lang.Object>[] r7 = a     // Catch:{ Exception -> 0x0055 }
            int r1 = r7.length     // Catch:{ Exception -> 0x0055 }
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)     // Catch:{ Exception -> 0x0055 }
            java.lang.Class[] r7 = (java.lang.Class[]) r7     // Catch:{ Exception -> 0x0055 }
            java.lang.reflect.Constructor r1 = r4.getConstructor(r7)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r4 = "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_1)"
            defpackage.v62.b(r1, r4)     // Catch:{ Exception -> 0x0055 }
            android.content.Context[] r2 = new android.content.Context[r0]     // Catch:{ Exception -> 0x0055 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0055 }
        L_0x0046:
            r1.setAccessible(r0)     // Catch:{ Exception -> 0x0055 }
            int r4 = r2.length     // Catch:{ Exception -> 0x0055 }
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r4)     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r4 = r1.newInstance(r4)     // Catch:{ Exception -> 0x0055 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ Exception -> 0x0055 }
            return r4
        L_0x0055:
            r4 = move-exception
            boolean r5 = r4 instanceof java.lang.ClassNotFoundException
            if (r5 == 0) goto L_0x005e
        L_0x005a:
            r4.printStackTrace()
            goto L_0x0072
        L_0x005e:
            boolean r5 = r4 instanceof java.lang.NoSuchMethodException
            if (r5 == 0) goto L_0x0063
            goto L_0x005a
        L_0x0063:
            boolean r5 = r4 instanceof java.lang.IllegalAccessException
            if (r5 == 0) goto L_0x0068
            goto L_0x005a
        L_0x0068:
            boolean r5 = r4 instanceof java.lang.InstantiationException
            if (r5 == 0) goto L_0x006d
            goto L_0x005a
        L_0x006d:
            boolean r5 = r4 instanceof java.lang.reflect.InvocationTargetException
            if (r5 == 0) goto L_0x0074
            goto L_0x005a
        L_0x0072:
            r4 = 0
            return r4
        L_0x0074:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w02.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
