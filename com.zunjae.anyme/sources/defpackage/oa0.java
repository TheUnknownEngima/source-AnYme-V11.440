package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.media.a;
import com.google.android.gms.cast.framework.media.b;
import com.google.android.gms.cast.framework.media.c;

/* renamed from: oa0  reason: default package */
public final class oa0 extends g60 {
    /* access modifiers changed from: private */
    public final ImageView b;
    private final b c;
    private final Bitmap d;
    /* access modifiers changed from: private */
    public final View e;
    private final c f;
    private final com.google.android.gms.cast.framework.media.internal.b g;

    public oa0(ImageView imageView, Context context, b bVar, int i, View view) {
        a i2;
        this.b = imageView;
        this.c = bVar;
        c cVar = null;
        this.d = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.e = view;
        com.google.android.gms.cast.framework.a e2 = com.google.android.gms.cast.framework.a.e(context);
        if (!(e2 == null || (i2 = e2.a().i()) == null)) {
            cVar = i2.j();
        }
        this.f = cVar;
        this.g = new com.google.android.gms.cast.framework.media.internal.b(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r1 = r1.b(r0.p(), r4.c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r4 = this;
            com.google.android.gms.cast.framework.media.i r0 = r4.b()
            if (r0 == 0) goto L_0x0041
            boolean r1 = r0.o()
            if (r1 != 0) goto L_0x000d
            goto L_0x0041
        L_0x000d:
            com.google.android.gms.cast.MediaInfo r0 = r0.j()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0035
        L_0x0015:
            com.google.android.gms.cast.framework.media.c r1 = r4.f
            if (r1 == 0) goto L_0x0030
            com.google.android.gms.cast.l r2 = r0.p()
            com.google.android.gms.cast.framework.media.b r3 = r4.c
            k80 r1 = r1.b(r2, r3)
            if (r1 == 0) goto L_0x0030
            android.net.Uri r2 = r1.i()
            if (r2 == 0) goto L_0x0030
            android.net.Uri r0 = r1.i()
            goto L_0x0035
        L_0x0030:
            r1 = 0
            android.net.Uri r0 = com.google.android.gms.cast.framework.media.e.a(r0, r1)
        L_0x0035:
            if (r0 != 0) goto L_0x003b
            r4.j()
            return
        L_0x003b:
            com.google.android.gms.cast.framework.media.internal.b r1 = r4.g
            r1.e(r0)
            return
        L_0x0041:
            r4.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa0.i():void");
    }

    private final void j() {
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
            this.b.setVisibility(4);
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            this.b.setImageBitmap(bitmap);
        }
    }

    public final void c() {
        i();
    }

    public final void e(com.google.android.gms.cast.framework.c cVar) {
        super.e(cVar);
        this.g.d(new pa0(this));
        j();
        i();
    }

    public final void f() {
        this.g.b();
        j();
        super.f();
    }
}
