package com.afollestad.assent.internal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;

public final class a {
    /* access modifiers changed from: private */
    public static a d;
    /* access modifiers changed from: private */
    public static o52<g> e = b.f;
    public static final C0072a f = new C0072a((r62) null);
    private final i<f> a = new i<>();
    private f b;
    private g c;

    /* renamed from: com.afollestad.assent.internal.a$a  reason: collision with other inner class name */
    public static final class C0072a {

        /* renamed from: com.afollestad.assent.internal.a$a$a  reason: collision with other inner class name */
        static final class C0073a extends w62 implements d62<s, Context, u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0073a(g gVar) {
                super(2);
                this.f = gVar;
            }

            public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                a((s) obj, (Context) obj2);
                return u22.a;
            }

            public final void a(s sVar, Context context) {
                v62.f(sVar, "$receiver");
                v62.f(context, "it");
                sVar.e(this.f, "[assent_permission_fragment/activity]");
            }
        }

        /* renamed from: com.afollestad.assent.internal.a$a$b */
        static final class b extends w62 implements d62<s, Context, u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar) {
                super(2);
                this.f = gVar;
            }

            public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                a((s) obj, (Context) obj2);
                return u22.a;
            }

            public final void a(s sVar, Context context) {
                v62.f(sVar, "$receiver");
                v62.f(context, "it");
                sVar.e(this.f, "[assent_permission_fragment/fragment]");
            }
        }

        private C0072a() {
        }

        public /* synthetic */ C0072a(r62 r62) {
            this();
        }

        public final g a(Context context) {
            g gVar;
            v62.f(context, "context");
            a d = d();
            if (context instanceof FragmentActivity) {
                if (d.e() == null) {
                    gVar = a.f.e().invoke();
                    e.a(gVar, "Created new PermissionFragment for Context", new Object[0]);
                    c.b((FragmentActivity) context, new C0073a(gVar));
                } else {
                    e.a(d, "Re-using PermissionFragment for Context", new Object[0]);
                    gVar = d.e();
                }
                d.h(gVar);
                g e = d.e();
                if (e != null) {
                    return e;
                }
                throw new IllegalStateException("impossible!".toString());
            }
            throw new IllegalArgumentException(("Unable to ensure the permission Fragment on Context " + context).toString());
        }

        public final g b(Fragment fragment) {
            g gVar;
            v62.f(fragment, "context");
            a d = d();
            if (d.e() == null) {
                gVar = a.f.e().invoke();
                e.a(gVar, "Created new PermissionFragment for parent Fragment", new Object[0]);
                c.a(fragment, new b(gVar));
            } else {
                e.a(d, "Re-using PermissionFragment for parent Fragment", new Object[0]);
                gVar = d.e();
            }
            d.h(gVar);
            g e = d.e();
            if (e != null) {
                return e;
            }
            throw new IllegalStateException("impossible!".toString());
        }

        public final void c() {
            a d = d();
            e.a(d, "forgetFragment()", new Object[0]);
            g e = d.e();
            if (e != null) {
                e.J1();
            }
            d.h((g) null);
        }

        public final a d() {
            a b2 = a.d;
            if (b2 != null) {
                return b2;
            }
            a aVar = new a();
            a.d = aVar;
            return aVar;
        }

        public final o52<g> e() {
            return a.e;
        }
    }

    static final class b extends w62 implements o52<g> {
        public static final b f = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final g invoke() {
            return new g();
        }
    }

    public final f d() {
        return this.b;
    }

    public final g e() {
        return this.c;
    }

    public final i<f> f() {
        return this.a;
    }

    public final void g(f fVar) {
        this.b = fVar;
    }

    public final void h(g gVar) {
        this.c = gVar;
    }
}
