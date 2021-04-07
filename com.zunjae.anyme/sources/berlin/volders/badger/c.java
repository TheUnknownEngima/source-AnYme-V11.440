package berlin.volders.badger;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import berlin.volders.badger.a;

public class c<T extends a> {
    public final Drawable a;
    public final T b;

    private c(Drawable drawable, T t) {
        this.a = drawable;
        this.b = t;
    }

    public static <T extends a> T a(MenuItem menuItem, a.b<? extends T> bVar) {
        c<? extends T> b2 = b(menuItem.getIcon(), bVar);
        menuItem.setIcon(b2.a);
        return b2.b;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [berlin.volders.badger.a$b<? extends T>, berlin.volders.badger.a$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends berlin.volders.badger.a> berlin.volders.badger.c<T> b(android.graphics.drawable.Drawable r4, berlin.volders.badger.a.b<? extends T> r5) {
        /*
            boolean r0 = r4 instanceof android.graphics.drawable.LayerDrawable
            r1 = 0
            if (r0 != 0) goto L_0x0021
            berlin.volders.badger.a r5 = r5.a()
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r2 = 2
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r2[r1] = r4
            r4 = 1
            r2[r4] = r5
            r0.<init>(r2)
            int r1 = berlin.volders.badger.R$id.badger_drawable
            r0.setId(r4, r1)
            berlin.volders.badger.c r4 = new berlin.volders.badger.c
            r4.<init>(r0, r5)
            return r4
        L_0x0021:
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4
            int r0 = berlin.volders.badger.R$id.badger_drawable
            android.graphics.drawable.Drawable r0 = r4.findDrawableByLayerId(r0)
            if (r0 != 0) goto L_0x0054
            berlin.volders.badger.a r5 = r5.a()
            int r0 = r4.getNumberOfLayers()
            int r2 = r0 + 1
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
        L_0x0037:
            if (r1 >= r0) goto L_0x0042
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r1)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0042:
            r2[r0] = r5
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            r4.<init>(r2)
            int r1 = berlin.volders.badger.R$id.badger_drawable
            r4.setId(r0, r1)
            berlin.volders.badger.c r0 = new berlin.volders.badger.c
            r0.<init>(r4, r5)
            return r0
        L_0x0054:
            berlin.volders.badger.c r1 = new berlin.volders.badger.c     // Catch:{ ClassCastException -> 0x005c }
            berlin.volders.badger.a r0 = (berlin.volders.badger.a) r0     // Catch:{ ClassCastException -> 0x005c }
            r1.<init>(r4, r0)     // Catch:{ ClassCastException -> 0x005c }
            return r1
        L_0x005c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "layer with id R.id.badger_drawable must be an instance of "
            r4.append(r0)
            berlin.volders.badger.a r5 = r5.a()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: berlin.volders.badger.c.b(android.graphics.drawable.Drawable, berlin.volders.badger.a$b):berlin.volders.badger.c");
    }
}
