package com.zunjae.anyme.features.niche.donate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import defpackage.n9;
import java.util.HashMap;
import java.util.List;

public final class SupportActivity extends AbstractActivity {
    /* access modifiers changed from: private */
    public a9<rt1> D = b9.a();
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private HashMap F;

    public static final class a extends w62 implements o52<com.zunjae.anyme.features.niche.b> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.niche.b, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final com.zunjae.anyme.features.niche.b invoke() {
            return lg2.b(this.f, f72.b(com.zunjae.anyme.features.niche.b.class), this.g, this.h);
        }
    }

    static final class b extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ SupportActivity f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends rt1, a>, u22> {
            final /* synthetic */ b f;

            /* renamed from: com.zunjae.anyme.features.niche.donate.SupportActivity$b$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0200a extends u62 implements z52<View, a> {
                public static final C0200a n = new C0200a();

                C0200a() {
                    super(1, a.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final a r(View view) {
                    v62.e(view, "p1");
                    return new a(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.niche.donate.SupportActivity$b$a$b  reason: collision with other inner class name */
            static final class C0201b extends w62 implements e62<a, Integer, rt1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0201b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(a aVar, int i, rt1 rt1) {
                    v62.e(aVar, "$receiver");
                    v62.e(rt1, "group");
                    com.zunjae.anyme.a.b(this.f.f.f.T()).t(rt1.c()).K0(aVar.O());
                    aVar.P().setText(rt1.d());
                    aVar.M().setText(rt1.a());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((a) obj, ((Number) obj2).intValue(), (rt1) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements e62<r9<? extends rt1>, Integer, Button, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<rt1> r9Var, int i, Button button) {
                    v62.e(r9Var, "$receiver");
                    v62.e(button, "<anonymous parameter 1>");
                    this.f.f.f.h0(r9Var.getItem().b());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (Button) obj3);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f = bVar;
            }

            public final void a(com.afollestad.recyclical.a<rt1, a> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0200a.n, new C0201b(this));
                l9.d(aVar).f().add(new n9.a(a.class, b.l, new c(this)));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SupportActivity supportActivity) {
            super(1);
            this.f = supportActivity;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.D);
            cVar.h(new LinearLayoutManager(this.f.T()));
            a aVar = new a(this);
            String name = rt1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.donation_item, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class c<T> implements u<com.zunjae.vresult.a<? extends List<? extends rt1>>> {
        final /* synthetic */ SupportActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.p0().o();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        static final class b extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.p0().o();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        c(SupportActivity supportActivity) {
            this.a = supportActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<rt1>> aVar) {
            RecyclerView recyclerView;
            o52 bVar;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.h(recyclerView2);
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.D, e32.c((Iterable) ((a.e) aVar).b()), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.g(recyclerView3);
            } else {
                if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    bVar = new a(this);
                } else if (aVar instanceof a.b) {
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    bVar = new b(this);
                } else {
                    return;
                }
                rw1.d(recyclerView, "No entries found. Please try again later", (String) null, bVar, 2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.niche.b p0() {
        return (com.zunjae.anyme.features.niche.b) this.E.getValue();
    }

    private final void q0() {
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new b(this));
        p0().h().g(this, new c(this));
    }

    public View l0(int i) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.F.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.donate_activity);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        q0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0279R$menu.menu_donate, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 2131296831) {
            mw1.q(this, "Note: AnYme makes no money through any donation you make. None of these links are referrer links either. Want an app, group or person added? Let us know on the Discord server.\n\nNote: you can support the AnYme app simply by telling your friends about it.", "Info");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!com.zunjae.vresult.b.a(p0().h())) {
            p0().o();
        }
    }
}
