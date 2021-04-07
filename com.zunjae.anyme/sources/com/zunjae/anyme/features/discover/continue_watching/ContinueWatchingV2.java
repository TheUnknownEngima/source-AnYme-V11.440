package com.zunjae.anyme.features.discover.continue_watching;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.vresult.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class ContinueWatchingV2 extends AbstractActivity {
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    private a E;
    private HashMap F;

    public static final class a extends w62 implements o52<qu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    static final class b<T> implements u<com.zunjae.vresult.a<? extends List<? extends d>>> {
        final /* synthetic */ ContinueWatchingV2 a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ b f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.f = bVar;
            }

            public final void a() {
                this.f.a.o0().G();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        /* renamed from: com.zunjae.anyme.features.discover.continue_watching.ContinueWatchingV2$b$b  reason: collision with other inner class name */
        static final class C0184b extends w62 implements o52<u22> {
            final /* synthetic */ b f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0184b(b bVar) {
                super(0);
                this.f = bVar;
            }

            public final void a() {
                this.f.a.o0().G();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        b(ContinueWatchingV2 continueWatchingV2) {
            this.a = continueWatchingV2;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<d>> aVar) {
            ExpandableListView expandableListView;
            o52 bVar;
            String str;
            if (aVar instanceof a.c) {
                ExpandableListView expandableListView2 = (ExpandableListView) this.a.l0(C0275R$id.expandableListView);
                v62.d(expandableListView2, "expandableListView");
                rw1.h(expandableListView2);
            } else if (aVar instanceof a.e) {
                a.e eVar = (a.e) aVar;
                ContinueWatchingV2.m0(this.a).b((List) eVar.b());
                ExpandableListView expandableListView3 = (ExpandableListView) this.a.l0(C0275R$id.expandableListView);
                v62.d(expandableListView3, "expandableListView");
                mw1.k(expandableListView3, ((Collection) eVar.b()).size() - 1);
                ExpandableListView expandableListView4 = (ExpandableListView) this.a.l0(C0275R$id.expandableListView);
                v62.d(expandableListView4, "expandableListView");
                rw1.g(expandableListView4);
            } else {
                if (aVar instanceof a.d) {
                    expandableListView = (ExpandableListView) this.a.l0(C0275R$id.expandableListView);
                    v62.d(expandableListView, "expandableListView");
                    bVar = new a(this);
                    str = "No Anime found here...";
                } else if (aVar instanceof a.b) {
                    expandableListView = (ExpandableListView) this.a.l0(C0275R$id.expandableListView);
                    v62.d(expandableListView, "expandableListView");
                    bVar = new C0184b(this);
                    str = "Could not connect with Kanon or you're being rate limited";
                } else {
                    return;
                }
                rw1.d(expandableListView, str, (String) null, bVar, 2, (Object) null);
            }
        }
    }

    public static final class c implements b {
        final /* synthetic */ ContinueWatchingV2 a;

        c(ContinueWatchingV2 continueWatchingV2) {
            this.a = continueWatchingV2;
        }

        public void a(c cVar) {
            v62.e(cVar, "model");
            ContinueWatchingV2 continueWatchingV2 = this.a;
            continueWatchingV2.startActivity(AnimeInfoActivity.M.b(continueWatchingV2, cVar.h()));
        }
    }

    public static final /* synthetic */ a m0(ContinueWatchingV2 continueWatchingV2) {
        a aVar = continueWatchingV2.E;
        if (aVar != null) {
            return aVar;
        }
        v62.p("adapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final qu1 o0() {
        return (qu1) this.D.getValue();
    }

    private final void p0() {
        this.E = new a(this, new c(this));
        ExpandableListView expandableListView = (ExpandableListView) l0(C0275R$id.expandableListView);
        a aVar = this.E;
        if (aVar != null) {
            expandableListView.setAdapter(aVar);
            o0().p().g(this, new b(this));
            return;
        }
        v62.p("adapter");
        throw null;
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
        setContentView((int) C0278R$layout.activity_continue_watching_v2);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, "Continue Watching", (String) null, true, 4, (Object) null);
        p0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0279R$menu.menu_continue_watching, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() != 2131296830) {
            return super.onOptionsItemSelected(menuItem);
        }
        ExpandableListView expandableListView = (ExpandableListView) l0(C0275R$id.expandableListView);
        v62.d(expandableListView, "expandableListView");
        a aVar = this.E;
        if (aVar != null) {
            mw1.s(expandableListView, aVar.getGroupCount() - 1);
            return true;
        }
        v62.p("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!com.zunjae.vresult.b.a(o0().p())) {
            o0().G();
        }
    }
}
