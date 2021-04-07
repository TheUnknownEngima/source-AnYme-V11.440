package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: h2  reason: default package */
public final class h2 {

    /* renamed from: h2$a */
    public static abstract class a {

        /* renamed from: h2$a$a  reason: collision with other inner class name */
        class C0128a implements Runnable {
            final /* synthetic */ Typeface e;

            C0128a(Typeface typeface) {
                this.e = typeface;
            }

            public void run() {
                a.this.d(this.e);
            }
        }

        /* renamed from: h2$a$b */
        class b implements Runnable {
            final /* synthetic */ int e;

            b(int i) {
                this.e = i;
            }

            public void run() {
                a.this.c(this.e);
            }
        }

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0128a(typeface));
        }

        public abstract void c(int i);

        public abstract void d(Typeface typeface);
    }

    public static int a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    public static Drawable b(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static Typeface c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, new TypedValue(), 0, (a) null, (Handler) null, false);
    }

    public static Typeface d(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    public static void e(Context context, int i, a aVar, Handler handler) {
        u3.c(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
            return;
        }
        f(context, i, new TypedValue(), 0, aVar, handler, false);
    }

    private static Typeface f(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface g = g(context, resources, typedValue, i, i2, aVar, handler, z);
        if (g != null || aVar != null) {
            return g;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface g(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, defpackage.h2.a r18, android.os.Handler r19, boolean r20) {
        /*
            r2 = r14
            r0 = r15
            r3 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x008a
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r10.startsWith(r0)
            r11 = 0
            r12 = -3
            if (r0 != 0) goto L_0x0022
            if (r8 == 0) goto L_0x0021
            r8.a(r12, r9)
        L_0x0021:
            return r11
        L_0x0022:
            android.graphics.Typeface r0 = defpackage.m2.f(r14, r3, r4)
            if (r0 == 0) goto L_0x002e
            if (r8 == 0) goto L_0x002d
            r8.b(r0, r9)
        L_0x002d:
            return r0
        L_0x002e:
            java.lang.String r0 = r10.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            if (r0 == 0) goto L_0x005b
            android.content.res.XmlResourceParser r0 = r14.getXml(r3)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            e2$a r1 = defpackage.e2.b(r0, r14)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            if (r1 != 0) goto L_0x004a
            if (r8 == 0) goto L_0x0049
            r8.a(r12, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
        L_0x0049:
            return r11
        L_0x004a:
            r0 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r0 = defpackage.m2.c(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            return r0
        L_0x005b:
            r0 = r13
            android.graphics.Typeface r0 = defpackage.m2.d(r13, r14, r3, r10, r4)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            if (r8 == 0) goto L_0x006b
            if (r0 == 0) goto L_0x0068
            r8.b(r0, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
            goto L_0x006b
        L_0x0068:
            r8.a(r12, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x006c }
        L_0x006b:
            return r0
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x007b
        L_0x0074:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x007b:
            r0.append(r1)
            r0.append(r10)
            r0.toString()
            if (r8 == 0) goto L_0x0089
            r8.a(r12, r9)
        L_0x0089:
            return r11
        L_0x008a:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r14.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2.g(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, h2$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
