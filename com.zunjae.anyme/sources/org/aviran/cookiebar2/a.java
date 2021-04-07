package org.aviran.cookiebar2;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

public class a {
    private Cookie a;
    private final Activity b;

    /* renamed from: org.aviran.cookiebar2.a$a  reason: collision with other inner class name */
    class C0254a implements b {
        final /* synthetic */ b a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ Cookie c;

        C0254a(a aVar, b bVar, ViewGroup viewGroup, Cookie cookie) {
            this.a = bVar;
            this.b = viewGroup;
            this.c = cookie;
        }

        public void a(int i) {
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(4);
            }
            this.b.addView(this.c);
        }
    }

    public static class b {
        private final d a = new d();
        private final Activity b;

        b(Activity activity) {
            this.b = activity;
        }

        public a a() {
            return new a(this.b, this.a, (C0254a) null);
        }

        public b b(String str, c cVar) {
            d dVar = this.a;
            dVar.c = str;
            dVar.s = cVar;
            return this;
        }

        public b c(boolean z) {
            this.a.e = z;
            return this;
        }

        public b d(String str) {
            this.a.b = str;
            return this;
        }

        public b e(String str) {
            this.a.a = str;
            return this;
        }

        public a f() {
            a a2 = a();
            a2.g();
            return a2;
        }
    }

    public interface c {
        void a(View view);
    }

    static final class d {
        public String a;
        public String b;
        public String c;
        public boolean d = true;
        public boolean e = true;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public long k = 2000;
        public int l = 48;
        public int m;
        public int n = R$anim.slide_in_from_top;
        public int o = R$anim.slide_in_from_bottom;
        public int p = R$anim.slide_out_to_top;
        public int q = R$anim.slide_out_to_bottom;
        public c r;
        public c s;
        public AnimatorSet t;
        public b u;

        d() {
        }
    }

    private a(Activity activity, d dVar) {
        this.b = activity;
        if (dVar == null) {
            d();
            return;
        }
        Cookie cookie = new Cookie(activity);
        this.a = cookie;
        cookie.u(dVar);
    }

    /* synthetic */ a(Activity activity, d dVar, C0254a aVar) {
        this(activity, dVar);
    }

    private void b(ViewGroup viewGroup, Cookie cookie) {
        if (cookie.getParent() == null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof Cookie) {
                    Cookie cookie2 = (Cookie) childAt;
                    cookie2.l(new C0254a(this, cookie2.n(), viewGroup, cookie));
                    return;
                }
            }
            viewGroup.addView(cookie);
        }
    }

    public static b c(Activity activity) {
        return new b(activity);
    }

    private void d() {
        ViewGroup viewGroup = (ViewGroup) this.b.getWindow().getDecorView();
        f(viewGroup);
        f((ViewGroup) viewGroup.findViewById(16908290));
    }

    public static void e(Activity activity) {
        new a(activity, (d) null);
    }

    private void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Cookie) {
                ((Cookie) childAt).k();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.a != null) {
            ViewGroup viewGroup = (ViewGroup) this.b.getWindow().getDecorView();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(16908290);
            if (this.a.getParent() == null) {
                if (this.a.p() == 80) {
                    viewGroup = viewGroup2;
                }
                b(viewGroup, this.a);
            }
        }
    }
}
