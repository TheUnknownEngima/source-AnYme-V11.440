package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;

/* renamed from: ra0  reason: default package */
public final class ra0 extends g60 {
    private final ImageView b;
    private final String c;
    private final String d = this.e.getString(R$string.cast_unmute);
    private final Context e;
    private e.c f;

    public ra0(ImageView imageView, Context context) {
        this.b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.c = applicationContext.getString(R$string.cast_mute);
        this.b.setEnabled(false);
        this.f = null;
    }

    public final void c() {
        g();
    }

    public final void d() {
        this.b.setEnabled(false);
    }

    public final void e(c cVar) {
        if (this.f == null) {
            this.f = new ta0(this);
        }
        super.e(cVar);
        cVar.n(this.f);
        g();
    }

    public final void f() {
        e.c cVar;
        this.b.setEnabled(false);
        c c2 = a.d(this.e).b().c();
        if (!(c2 == null || (cVar = this.f) == null)) {
            c2.r(cVar);
        }
        super.f();
    }

    /* access modifiers changed from: protected */
    public final void g() {
        c c2 = a.d(this.e).b().c();
        if (c2 == null || !c2.c()) {
            this.b.setEnabled(false);
            return;
        }
        i b2 = b();
        if (b2 == null || !b2.o()) {
            this.b.setEnabled(false);
        } else {
            this.b.setEnabled(true);
        }
        boolean q = c2.q();
        this.b.setSelected(q);
        this.b.setContentDescription(q ? this.d : this.c);
    }
}
