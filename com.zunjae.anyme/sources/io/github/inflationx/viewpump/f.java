package io.github.inflationx.viewpump;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class f extends ContextWrapper {
    static final /* synthetic */ d82[] b;
    public static final a c = new a((r62) null);
    private final d22 a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final ContextWrapper a(Context context) {
            v62.f(context, "base");
            return new f(context, (r62) null);
        }
    }

    static final class b extends w62 implements o52<x02> {
        final /* synthetic */ f f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.f = fVar;
        }

        /* renamed from: a */
        public final x02 invoke() {
            LayoutInflater from = LayoutInflater.from(this.f.getBaseContext());
            v62.b(from, "LayoutInflater.from(baseContext)");
            return new x02(from, this.f, false);
        }
    }

    static {
        c72 c72 = new c72(f72.b(f.class), "inflater", "getInflater()Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;");
        f72.f(c72);
        b = new d82[]{c72};
    }

    private f(Context context) {
        super(context);
        this.a = g22.a(i22.NONE, new b(this));
    }

    public /* synthetic */ f(Context context, r62 r62) {
        this(context);
    }

    private final x02 a() {
        d22 d22 = this.a;
        d82 d82 = b[0];
        return (x02) d22.getValue();
    }

    public Object getSystemService(String str) {
        v62.f(str, "name");
        return v62.a("layout_inflater", str) ? a() : super.getSystemService(str);
    }
}
