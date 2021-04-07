package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;

/* renamed from: wh  reason: default package */
public class wh implements l<Bitmap> {
    public static final h<Integer> b = h.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final h<Bitmap.CompressFormat> c = h.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final of a;

    public wh(of ofVar) {
        this.a = ofVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, i iVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.c(c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public c b(i iVar) {
        return c.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:36|37)|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af A[SYNTHETIC, Splitter:B:36:0x00af] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(defpackage.Cif<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.d(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            defpackage.mm.c(r4, r2, r3, r1)
            long r2 = defpackage.fm.b()     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.load.h<java.lang.Integer> r4 = b     // Catch:{ all -> 0x00b3 }
            java.lang.Object r4 = r11.c(r4)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00b3 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00b3 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0058 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0058 }
            of r10 = r8.a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            if (r10 == 0) goto L_0x0045
            vd r10 = new vd     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            of r6 = r8.a     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r6 = r10
            goto L_0x0046
        L_0x0045:
            r6 = r7
        L_0x0046:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x0058 }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            r5 = 1
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0051:
            r9 = move-exception
            r6 = r7
            goto L_0x00ad
        L_0x0054:
            r6 = r7
            goto L_0x0058
        L_0x0056:
            r9 = move-exception
            goto L_0x00ad
        L_0x0058:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0060
            goto L_0x004d
        L_0x0060:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00b3 }
            if (r10 == 0) goto L_0x00a9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r10.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "Compressed with type: "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            r10.append(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = " of size "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            int r0 = defpackage.km.h(r9)     // Catch:{ all -> 0x00b3 }
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = " in "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            double r0 = defpackage.fm.a(r2)     // Catch:{ all -> 0x00b3 }
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = ", options format: "
            r10.append(r0)     // Catch:{ all -> 0x00b3 }
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r0 = c     // Catch:{ all -> 0x00b3 }
            java.lang.Object r11 = r11.c(r0)     // Catch:{ all -> 0x00b3 }
            r10.append(r11)     // Catch:{ all -> 0x00b3 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00b3 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00b3 }
            r10.append(r9)     // Catch:{ all -> 0x00b3 }
            r10.toString()     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            defpackage.mm.d()
            return r5
        L_0x00ad:
            if (r6 == 0) goto L_0x00b2
            r6.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r9     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r9 = move-exception
            defpackage.mm.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh.a(if, java.io.File, com.bumptech.glide.load.i):boolean");
    }
}
