package com.zunjae.anyme.features.discover.friends;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;

public final class FriendsActivity extends AbstractActivity {
    public static final b G = new b((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<a> E = b9.a();
    private HashMap F;

    public static final class a extends w62 implements o52<nu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return lg2.b(this.f, f72.b(nu1.class), this.g, this.h);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final Intent a(Context context) {
            v62.e(context, "context");
            return new Intent(context, FriendsActivity.class);
        }
    }

    static final class c<T> implements u<com.zunjae.vresult.a<? extends List<? extends a>>> {
        final /* synthetic */ FriendsActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.S().X();
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
                this.f.a.S().X();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        c(FriendsActivity friendsActivity) {
            this.a = friendsActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<a>> aVar) {
            RecyclerView recyclerView;
            String str;
            o52 o52;
            if (aVar instanceof a.e) {
                a9.a.a(this.a.E, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.g(recyclerView2);
            } else if (aVar instanceof a.c) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.h(recyclerView3);
            } else {
                if (aVar instanceof a.b) {
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    o52 = new a(this);
                    str = "Could not connect to MyAnimeList";
                } else if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    o52 = new b(this);
                    str = "No friends found ):";
                } else {
                    return;
                }
                rw1.c(recyclerView, str, "Retry", o52);
            }
        }
    }

    static final class d extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ FriendsActivity f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends a, b>, u22> {
            final /* synthetic */ d f;

            /* renamed from: com.zunjae.anyme.features.discover.friends.FriendsActivity$d$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0188a extends u62 implements z52<View, b> {
                public static final C0188a n = new C0188a();

                C0188a() {
                    super(1, b.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final b r(View view) {
                    v62.e(view, "p1");
                    return new b(view);
                }
            }

            static final class b extends w62 implements e62<b, Integer, a, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(b bVar, int i, a aVar) {
                    v62.e(bVar, "$receiver");
                    v62.e(aVar, "friend");
                    com.zunjae.anyme.a.b(this.f.f.f.T()).t(aVar.a()).K0(bVar.M());
                    bVar.O().setText(aVar.c());
                    bVar.N().setText(aVar.b());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((b) obj, ((Number) obj2).intValue(), (a) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends a>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<a> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.f.Q().startActivity(GenericItemList.M.c(this.f.f.f.T(), r9Var.getItem().c()));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f = dVar;
            }

            public final void a(com.afollestad.recyclical.a<a, b> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0188a.n, new b(this));
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FriendsActivity friendsActivity, int i) {
            super(1);
            this.f = friendsActivity;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.E);
            cVar.h(new GridLayoutManager(this.f.T(), this.g));
            a aVar = new a(this);
            String name = a.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.mal_friend, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.D.getValue();
    }

    private final void q0() {
        int b2 = bw1.b(bw1.a, T(), 2, 2, 2, 0, 16, (Object) null);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new d(this, b2));
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
        setContentView((int) C0278R$layout.activity_friends);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        q0();
        S().E().g(this, new c(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!com.zunjae.vresult.b.a(S().E())) {
            S().X();
        }
    }
}
