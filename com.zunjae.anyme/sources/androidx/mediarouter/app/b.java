package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.mediarouter.media.g;

public class b extends c {
    private boolean o0 = false;
    private Dialog p0;
    private g q0;

    public b() {
        R1(true);
    }

    private void X1() {
        if (this.q0 == null) {
            Bundle s = s();
            if (s != null) {
                this.q0 = g.d(s.getBundle("selector"));
            }
            if (this.q0 == null) {
                this.q0 = g.c;
            }
        }
    }

    public Dialog P1(Bundle bundle) {
        if (this.o0) {
            g a2 = a2(u());
            this.p0 = a2;
            a2.k(Y1());
        } else {
            a Z1 = Z1(u(), bundle);
            this.p0 = Z1;
            Z1.k(Y1());
        }
        return this.p0;
    }

    public g Y1() {
        X1();
        return this.q0;
    }

    public a Z1(Context context, Bundle bundle) {
        return new a(context);
    }

    public g a2(Context context) {
        return new g(context);
    }

    public void b2(g gVar) {
        if (gVar != null) {
            X1();
            if (!this.q0.equals(gVar)) {
                this.q0 = gVar;
                Bundle s = s();
                if (s == null) {
                    s = new Bundle();
                }
                s.putBundle("selector", gVar.a());
                u1(s);
                Dialog dialog = this.p0;
                if (dialog == null) {
                    return;
                }
                if (this.o0) {
                    ((g) dialog).k(gVar);
                } else {
                    ((a) dialog).k(gVar);
                }
            }
        } else {
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    /* access modifiers changed from: package-private */
    public void c2(boolean z) {
        if (this.p0 == null) {
            this.o0 = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.p0;
        if (dialog != null) {
            if (this.o0) {
                ((g) dialog).l();
            } else {
                ((a) dialog).l();
            }
        }
    }
}
