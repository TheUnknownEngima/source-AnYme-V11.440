package defpackage;

import android.os.Bundle;
import androidx.core.app.h;

/* renamed from: g12  reason: default package */
public final class g12 implements h.f {
    public static final a f = new a((r62) null);
    private boolean a;
    private boolean b;
    private boolean c;
    private CharSequence d;
    private CharSequence e;

    /* renamed from: g12$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Bundle a(Bundle bundle) {
            v62.f(bundle, "extras");
            Bundle bundle2 = bundle.getBundle("io.karn.notify.EXTENSIONS");
            return bundle2 != null ? bundle2 : new Bundle();
        }

        public final CharSequence b(Bundle bundle) {
            v62.f(bundle, "extras");
            return a(bundle).getCharSequence("stack_key", (CharSequence) null);
        }
    }

    public g12() {
        g(true);
    }

    private final void b(Bundle bundle) {
        g(bundle.getBoolean("notify_valid", this.a));
        d(bundle.getBoolean("stackable", this.b));
        e(bundle.getBoolean("stacked", this.c));
        c(bundle.getCharSequence("stack_key", this.d));
        f(bundle.getCharSequence("summary_content", this.e));
    }

    public h.e a(h.e eVar) {
        v62.f(eVar, "builder");
        Bundle bundle = eVar.g().getBundle("io.karn.notify.EXTENSIONS");
        if (bundle == null) {
            bundle = new Bundle();
        }
        b(bundle);
        bundle.putBoolean("notify_valid", this.a);
        boolean z = this.b;
        if (z) {
            bundle.putBoolean("stackable", z);
        }
        CharSequence charSequence = this.d;
        boolean z2 = false;
        if (!(charSequence == null || f92.n(charSequence))) {
            bundle.putCharSequence("stack_key", this.d);
        }
        boolean z3 = this.c;
        if (z3) {
            bundle.putBoolean("stacked", z3);
        }
        CharSequence charSequence2 = this.e;
        if (charSequence2 == null || f92.n(charSequence2)) {
            z2 = true;
        }
        if (!z2) {
            bundle.putCharSequence("summary_content", this.e);
        }
        eVar.g().putBundle("io.karn.notify.EXTENSIONS", bundle);
        return eVar;
    }

    public final void c(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final void f(CharSequence charSequence) {
        this.e = charSequence;
    }

    public final void g(boolean z) {
        this.a = z;
    }
}
