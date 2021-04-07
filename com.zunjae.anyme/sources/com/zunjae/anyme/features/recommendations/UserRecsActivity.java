package com.zunjae.anyme.features.recommendations;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.google.gson.Gson;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import defpackage.ny1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"SetTextI18n"})
public final class UserRecsActivity extends AbstractActivity {
    private final d22 D = g22.b(new b(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private ArrayList<ny1> F = new ArrayList<>();
    private b G;
    private Integer[] H;
    private final ArrayList<Integer> I = new ArrayList<>();
    private final String J = "KEY_HATED_GENRES_IDS";
    private HashMap K;

    public static final class a extends w62 implements o52<Gson> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.google.gson.Gson, java.lang.Object] */
        public final Gson invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(Gson.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<nu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, oh2 oh2, o52 o52) {
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

    static final class c implements f.j {
        final /* synthetic */ UserRecsActivity a;

        c(UserRecsActivity userRecsActivity) {
            this.a = userRecsActivity;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
            this.a.w0(numArr);
            this.a.s0();
            return true;
        }
    }

    static final class d implements f.n {
        final /* synthetic */ UserRecsActivity a;

        d(UserRecsActivity userRecsActivity) {
            this.a = userRecsActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.w0((Integer[]) null);
            this.a.t0();
        }
    }

    static final class e<T> implements u<com.zunjae.vresult.a<? extends List<? extends vx1>>> {
        final /* synthetic */ UserRecsActivity a;

        e(UserRecsActivity userRecsActivity) {
            this.a = userRecsActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<vx1>> aVar) {
            UserRecsActivity userRecsActivity;
            String str;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.h(recyclerView);
            } else if (aVar instanceof a.e) {
                UserRecsActivity.m0(this.a).K((List) ((a.e) aVar).b());
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.g(recyclerView2);
            } else {
                if (aVar instanceof a.d) {
                    userRecsActivity = this.a;
                    str = "Kanon will show you recommendations based on shows you've rated a " + com.zunjae.anyme.features.firebase.b.MinimumScoreStats.m0int() + " or higher";
                } else if (aVar instanceof a.b) {
                    userRecsActivity = this.a;
                    str = "Could not get any recommendations, this is most likely cause you're being rate-limited by Kanon";
                } else {
                    return;
                }
                userRecsActivity.x0(str);
            }
        }
    }

    static final class f extends w62 implements o52<u22> {
        final /* synthetic */ UserRecsActivity f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(UserRecsActivity userRecsActivity) {
            super(0);
            this.f = userRecsActivity;
        }

        public final void a() {
            this.f.s0();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    private final nu1 S() {
        return (nu1) this.D.getValue();
    }

    public static final /* synthetic */ b m0(UserRecsActivity userRecsActivity) {
        b bVar = userRecsActivity.G;
        if (bVar != null) {
            return bVar;
        }
        v62.p("adapter");
        throw null;
    }

    private final Gson q0() {
        return (Gson) this.E.getValue();
    }

    private final Integer[] r0() {
        String l = l02.l(this.J, (String) null);
        if (l != null) {
            return (Integer[]) new Gson().fromJson(l, Integer[].class);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void s0() {
        S().Y(this.I);
    }

    private final void u0(Integer[] numArr) {
        if (numArr == null) {
            l02.c(this.J);
        } else {
            l02.v(this.J, q0().toJson((Object) numArr));
        }
    }

    private final void v0() {
        S().v().g(this, new e(this));
    }

    /* access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public final void w0(Integer[] numArr) {
        this.I.clear();
        this.H = numArr;
        u0(numArr);
        if (numArr != null) {
            for (Integer intValue : numArr) {
                this.I.add(Integer.valueOf(this.F.get(intValue.intValue()).a()));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void x0(String str) {
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        rw1.d(recyclerView, str, (String) null, new f(this), 2, (Object) null);
    }

    public View l0(int i) {
        if (this.K == null) {
            this.K = new HashMap();
        }
        View view = (View) this.K.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.K.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_userrecs);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        this.F = ny1.a.b(ny1.c, false, false, 2, (Object) null);
        w0(r0());
        this.G = new b(this);
        int b2 = bw1.b(bw1.a, T(), 3, 4, 5, 0, 16, (Object) null);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        b bVar = this.G;
        if (bVar != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(this, recyclerView, bVar);
            cVar.c(b2, b2 + 2);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.a();
            v0();
            return;
        }
        v62.p("adapter");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0279R$menu.menu_activity_userrecs, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() != 2131296316) {
            return super.onOptionsItemSelected(menuItem);
        }
        t0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!com.zunjae.vresult.b.a(S().v())) {
            s0();
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final void t0() {
        f.e eVar = new f.e(this);
        eVar.E("Select all genres you hate");
        eVar.q(this.F);
        eVar.t(this.H, new c(this));
        eVar.B("Save");
        eVar.w("Reset");
        eVar.y(new d(this));
        eVar.D();
    }
}
