package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.afollestad.materialdialogs.f;
import com.cunoraz.tagview.TagView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.character.AnimeCharactersAdapter;
import com.zunjae.anyme.features.anime.character.CharactersActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.anime.info_screen.a;
import com.zunjae.anyme.features.anime.pickers.DefaultEpisodePickerDialogR2;
import com.zunjae.anyme.features.anime.pickers.ManualEpisodeSelectorDialogR2;
import com.zunjae.anyme.features.anime.pickers.ScorePickerDialogR2;
import com.zunjae.anyme.features.browsers.sites.BasicWebViewBrowser;
import com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList;
import com.zunjae.anyme.features.recommendations.AnimeRecommendationsActivity;
import com.zunjae.anyme.features.recommendations.AnimeRecommendationsAdapter;
import com.zunjae.anyme.features.related.AnimeRelatedShowsAdapter;
import com.zunjae.anyme.features.related.RelatedAnimeActivity;
import com.zunjae.dynsourcegen.e;
import com.zunjae.vresult.a;
import defpackage.a9;
import defpackage.fr1;
import defpackage.n9;
import defpackage.qv1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: hr1  reason: default package */
public final class hr1 extends Fragment {
    public static final j m0 = new j((r62) null);
    private final d22 a0 = g22.b(new c(this, (oh2) null, new b(this), (o52) null));
    private final d22 b0 = g22.b(new e(this, (oh2) null, new d(this), (o52) null));
    private final d22 c0 = g22.b(new g(this, (oh2) null, new f(this), (o52) null));
    private final d22 d0 = g22.b(new i(this, (oh2) null, new h(this), (o52) null));
    private final d22 e0 = g22.b(new a(this, (oh2) null, (o52) null));
    private AnimeInfoActivity f0;
    private sy1 g0;
    private AnimeCharactersAdapter h0;
    private boolean i0;
    /* access modifiers changed from: private */
    public boolean j0;
    /* access modifiers changed from: private */
    public a9<com.zunjae.anyme.features.anime.info_screen.b> k0 = b9.a();
    private HashMap l0;

    /* renamed from: hr1$a */
    public static final class a extends w62 implements o52<com.zunjae.anyme.features.kanon.e> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.zunjae.anyme.features.kanon.e] */
        public final com.zunjae.anyme.features.kanon.e invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(com.zunjae.anyme.features.kanon.e.class), this.g, this.h);
        }
    }

    /* renamed from: hr1$a0 */
    static final class a0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        a0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).startActivity(AnimeRecommendationsActivity.H.a(hr1.P1(this.e), this.e.h2().g().i(), this.e.h2().g().y()));
        }
    }

    /* renamed from: hr1$b */
    public static final class b extends w62 implements o52<androidx.lifecycle.e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final androidx.lifecycle.e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: hr1$b0 */
    static final class b0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        b0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).startActivity(RelatedAnimeActivity.H.a(hr1.P1(this.e), this.e.h2().g().i(), this.e.h2().g().y()));
        }
    }

    /* renamed from: hr1$c */
    public static final class c extends w62 implements o52<nu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return kg2.a(this.f, f72.b(nu1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: hr1$c0 */
    static final class c0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        c0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.R1(this.e).H();
            this.e.u2();
        }
    }

    /* renamed from: hr1$d */
    public static final class d extends w62 implements o52<androidx.lifecycle.e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final androidx.lifecycle.e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: hr1$d0 */
    static final class d0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        d0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            com.zunjae.anyme.features.anime.pickers.f fVar = new com.zunjae.anyme.features.anime.pickers.f();
            Bundle bundle = new Bundle();
            bundle.putInt("currentStatus", hr1.R1(this.e).n());
            u22 u22 = u22.a;
            fVar.u1(bundle);
            fVar.W1(this.e.t(), "CRUD_DIALOG_STATUS_PICKER");
        }
    }

    /* renamed from: hr1$e */
    public static final class e extends w62 implements o52<ou1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, ou1] */
        /* renamed from: a */
        public final ou1 invoke() {
            return kg2.a(this.f, f72.b(ou1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: hr1$e0 */
    static final class e0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        /* renamed from: hr1$e0$a */
        static final class a implements f.n {
            final /* synthetic */ e0 a;

            a(e0 e0Var) {
                this.a = e0Var;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
                xr1.a.h(true);
                this.a.e.s2();
            }
        }

        /* renamed from: hr1$e0$b */
        static final class b implements f.n {
            final /* synthetic */ e0 a;

            b(e0 e0Var) {
                this.a = e0Var;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
                this.a.e.s2();
            }
        }

        e0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            String f = qv1.a.f();
            if (f != null) {
                Toast makeText = Toast.makeText(hr1.P1(this.e), f, 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            } else if (nv1.a.a() == 0) {
                Toast makeText2 = Toast.makeText(hr1.P1(this.e), "Your AdBlocker version is outdated... Please wait", 1);
                makeText2.show();
                v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
                this.e.E2();
            } else if (xr1.a.d() || !hr1.P1(this.e).O0()) {
                this.e.s2();
            } else {
                f.e eVar = new f.e(this.e.o1());
                eVar.E("Vydia");
                eVar.i(this.e.O(C0283R$string.psstWannaUseVydia));
                eVar.B("Yep");
                eVar.k(C0274R$drawable.vydia_icon_64);
                eVar.v(90);
                eVar.w("Ask again later");
                eVar.e(false);
                eVar.A(new a(this));
                eVar.y(new b(this));
                eVar.D();
            }
        }
    }

    /* renamed from: hr1$f */
    public static final class f extends w62 implements o52<androidx.lifecycle.e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final androidx.lifecycle.e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: hr1$f0 */
    static final class f0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        f0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            fr1.w0.a(hr1.R1(this.e).i(), this.e.j0).W1(this.e.t(), "CRUD_DIALOG_STREAM_PICKER");
        }
    }

    /* renamed from: hr1$g */
    public static final class g extends w62 implements o52<qu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return kg2.a(this.f, f72.b(qu1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: hr1$g0 */
    static final class g0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        g0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            ScorePickerDialogR2 scorePickerDialogR2 = new ScorePickerDialogR2();
            Bundle bundle = new Bundle();
            bundle.putInt("currentScore", hr1.R1(this.e).m());
            u22 u22 = u22.a;
            scorePickerDialogR2.u1(bundle);
            scorePickerDialogR2.W1(this.e.t(), "CRUD_DIALOG_SCORE_PICKER");
        }
    }

    /* renamed from: hr1$h */
    public static final class h extends w62 implements o52<androidx.lifecycle.e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final androidx.lifecycle.e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: hr1$h0 */
    static final class h0 implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        h0(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            androidx.fragment.app.c cVar;
            ky1 d = this.e.h2().g().d();
            int b = d != null ? d.b() : 0;
            Bundle bundle = new Bundle();
            if (b > 0 || hr1.R1(this.e).u() > 0) {
                DefaultEpisodePickerDialogR2 defaultEpisodePickerDialogR2 = new DefaultEpisodePickerDialogR2();
                if (b <= 0) {
                    b = hr1.R1(this.e).u();
                }
                bundle.putParcelable("defaultEpisodePickerDialog", hr1.R1(this.e).g(b));
                cVar = defaultEpisodePickerDialogR2;
            } else {
                cVar = new ManualEpisodeSelectorDialogR2();
                bundle.putInt("myWatchedEpisodes", hr1.R1(this.e).p());
            }
            cVar.u1(bundle);
            cVar.W1(this.e.t(), "CRUD_DIALOG_EPISODE_PICKER");
        }
    }

    /* renamed from: hr1$i */
    public static final class i extends w62 implements o52<gr1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return kg2.a(this.f, f72.b(gr1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: hr1$i0 */
    static final class i0<T> implements androidx.lifecycle.u<com.zunjae.vresult.a<? extends List<? extends ux1>>> {
        final /* synthetic */ hr1 a;
        final /* synthetic */ AnimeRecommendationsAdapter b;

        i0(hr1 hr1, AnimeRecommendationsAdapter animeRecommendationsAdapter) {
            this.a = hr1;
            this.b = animeRecommendationsAdapter;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<ux1>> aVar) {
            if (!(aVar instanceof a.c)) {
                if (aVar instanceof a.e) {
                    List list = (List) ((a.e) aVar).b();
                    this.b.K(list);
                    if (list.size() > 3) {
                        TextView textView = (TextView) this.a.K1(C0275R$id.viewAllRecommendations);
                        v62.d(textView, "viewAllRecommendations");
                        rw1.i(textView);
                        return;
                    }
                } else if (!(aVar instanceof a.d) && !(aVar instanceof a.b)) {
                    return;
                }
                TextView textView2 = (TextView) this.a.K1(C0275R$id.viewAllRecommendations);
                v62.d(textView2, "viewAllRecommendations");
                rw1.a(textView2);
            }
        }
    }

    /* renamed from: hr1$j */
    public static final class j {
        private j() {
        }

        public /* synthetic */ j(r62 r62) {
            this();
        }

        public final hr1 a() {
            return new hr1();
        }
    }

    /* renamed from: hr1$j0 */
    static final class j0<T> implements androidx.lifecycle.u<com.zunjae.vresult.a<? extends List<? extends bz1>>> {
        final /* synthetic */ hr1 a;
        final /* synthetic */ AnimeRelatedShowsAdapter b;

        j0(hr1 hr1, AnimeRelatedShowsAdapter animeRelatedShowsAdapter) {
            this.a = hr1;
            this.b = animeRelatedShowsAdapter;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<bz1>> aVar) {
            if (!(aVar instanceof a.c)) {
                if (aVar instanceof a.e) {
                    List list = (List) ((a.e) aVar).b();
                    this.b.K(list);
                    if (list.size() > 3) {
                        TextView textView = (TextView) this.a.K1(C0275R$id.viewAllRelated);
                        v62.d(textView, "viewAllRelated");
                        rw1.i(textView);
                        return;
                    }
                } else if (!(aVar instanceof a.d) && !(aVar instanceof a.b)) {
                    return;
                }
                TextView textView2 = (TextView) this.a.K1(C0275R$id.viewAllRelated);
                v62.d(textView2, "viewAllRelated");
                rw1.a(textView2);
            }
        }
    }

    /* renamed from: hr1$k */
    static final class k<T> implements androidx.lifecycle.u<com.zunjae.vresult.a<? extends List<? extends com.zunjae.anyme.features.anime.character.d>>> {
        final /* synthetic */ hr1 a;

        k(hr1 hr1) {
            this.a = hr1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<com.zunjae.anyme.features.anime.character.d>> aVar) {
            if (!(aVar instanceof a.c)) {
                if (aVar instanceof a.e) {
                    List list = (List) ((a.e) aVar).b();
                    hr1.M1(this.a).P(list);
                    if (list.size() > 3) {
                        TextView textView = (TextView) this.a.K1(C0275R$id.viewAllCharacters);
                        v62.d(textView, "viewAllCharacters");
                        rw1.i(textView);
                        return;
                    }
                } else if (!(aVar instanceof a.d) && !(aVar instanceof a.b)) {
                    return;
                }
                TextView textView2 = (TextView) this.a.K1(C0275R$id.viewAllCharacters);
                v62.d(textView2, "viewAllCharacters");
                rw1.a(textView2);
            }
        }
    }

    /* renamed from: hr1$k0 */
    public static final class k0 implements OnChartValueSelectedListener {
        final /* synthetic */ hr1 a;

        k0(hr1 hr1) {
            this.a = hr1;
        }

        public void onNothingSelected() {
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
            if (entry != null) {
                int x = (int) entry.getX();
                int y = (int) entry.getY();
                FragmentActivity n = this.a.n();
                if (n != null) {
                    Toast makeText = Toast.makeText(n, y + " people rated this show a " + x, 0);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                }
                BarChart barChart = (BarChart) this.a.K1(C0275R$id.showScoreChart);
                v62.d(barChart, "showScoreChart");
                barChart.setSelected(false);
                ((BarChart) this.a.K1(C0275R$id.showScoreChart)).highlightValues((Highlight[]) null);
            }
        }
    }

    /* renamed from: hr1$l */
    static final class l extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ hr1 f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* renamed from: hr1$l$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends com.zunjae.anyme.features.anime.info_screen.b, com.zunjae.anyme.features.anime.info_screen.c>, u22> {
            final /* synthetic */ l f;

            /* renamed from: hr1$l$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0243a extends u62 implements z52<View, com.zunjae.anyme.features.anime.info_screen.c> {
                public static final C0243a n = new C0243a();

                C0243a() {
                    super(1, com.zunjae.anyme.features.anime.info_screen.c.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final com.zunjae.anyme.features.anime.info_screen.c r(View view) {
                    v62.e(view, "p1");
                    return new com.zunjae.anyme.features.anime.info_screen.c(view);
                }
            }

            /* renamed from: hr1$l$a$b */
            static final class b extends w62 implements e62<com.zunjae.anyme.features.anime.info_screen.c, Integer, com.zunjae.anyme.features.anime.info_screen.b, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(com.zunjae.anyme.features.anime.info_screen.c cVar, int i, com.zunjae.anyme.features.anime.info_screen.b bVar) {
                    TextView textView;
                    int i2;
                    v62.e(cVar, "$receiver");
                    v62.e(bVar, "info");
                    cVar.M().setText(bVar.a());
                    cVar.O().setText(bVar.d());
                    if (bVar.k()) {
                        textView = cVar.M();
                        i2 = this.f.f.g;
                    } else {
                        textView = cVar.M();
                        i2 = this.f.f.h;
                    }
                    textView.setTextColor(i2);
                    int size = this.f.f.f.k0.size() - 1;
                    View N = cVar.N();
                    if (i == size) {
                        rw1.a(N);
                    } else {
                        rw1.i(N);
                    }
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((com.zunjae.anyme.features.anime.info_screen.c) obj, ((Number) obj2).intValue(), (com.zunjae.anyme.features.anime.info_screen.b) obj3);
                    return u22.a;
                }
            }

            /* renamed from: hr1$l$a$c */
            static final class c extends w62 implements e62<r9<? extends com.zunjae.anyme.features.anime.info_screen.b>, Integer, TextView, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<com.zunjae.anyme.features.anime.info_screen.b> r9Var, int i, TextView textView) {
                    Intent intent;
                    v62.e(r9Var, "$receiver");
                    v62.e(textView, "<anonymous parameter 1>");
                    int i2 = ir1.a[r9Var.getItem().e().ordinal()];
                    if (i2 == 1) {
                        intent = GenericItemList.d.b(GenericItemList.M, hr1.P1(this.f.f.f), com.zunjae.anyme.features.kanon.generic_anime_list.c.Producer, r9Var.getItem().c(), r9Var.getItem().a().toString(), (String) null, 16, (Object) null);
                    } else if (i2 == 2) {
                        AnimeInfoActivity.e eVar = AnimeInfoActivity.M;
                        AnimeInfoActivity P1 = hr1.P1(this.f.f.f);
                        xy1 b = r9Var.getItem().b();
                        v62.c(b);
                        intent = eVar.b(P1, b);
                    } else if (i2 == 3) {
                        intent = BasicWebViewBrowser.S.a(hr1.P1(this.f.f.f), r9Var.getItem().f());
                    } else {
                        return;
                    }
                    hr1.P1(this.f.f.f).startActivity(intent);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (TextView) obj3);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(l lVar) {
                super(1);
                this.f = lVar;
            }

            public final void a(com.afollestad.recyclical.a<com.zunjae.anyme.features.anime.info_screen.b, com.zunjae.anyme.features.anime.info_screen.c> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0243a.n, new b(this));
                l9.d(aVar).f().add(new n9.a(com.zunjae.anyme.features.anime.info_screen.c.class, jr1.l, new c(this)));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(hr1 hr1, int i, int i2) {
            super(1);
            this.f = hr1;
            this.g = i;
            this.h = i2;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.k0);
            cVar.h(new LinearLayoutManager(this.f.u()));
            a aVar = new a(this);
            String name = com.zunjae.anyme.features.anime.info_screen.b.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_additional_info, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: hr1$l0 */
    static final class l0<T> implements androidx.lifecycle.u<com.zunjae.vresult.a<? extends List<? extends com.zunjae.anyme.features.kanon.h>>> {
        final /* synthetic */ hr1 a;
        final /* synthetic */ int b;
        final /* synthetic */ IValueFormatter c;
        final /* synthetic */ List d;

        l0(hr1 hr1, int i, IValueFormatter iValueFormatter, List list) {
            this.a = hr1;
            this.b = i;
            this.c = iValueFormatter;
            this.d = list;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<com.zunjae.anyme.features.kanon.h>> aVar) {
            if (!(aVar instanceof a.c)) {
                if (aVar instanceof a.e) {
                    com.zunjae.anyme.features.kanon.h hVar = (com.zunjae.anyme.features.kanon.h) n32.B((List) ((a.e) aVar).b());
                    List<com.zunjae.anyme.features.kanon.i> a2 = hVar != null ? hVar.a() : null;
                    if (a2 == null) {
                        BarChart barChart = (BarChart) this.a.K1(C0275R$id.showScoreChart);
                        v62.d(barChart, "showScoreChart");
                        rw1.a(barChart);
                        return;
                    }
                    ArrayList arrayList = new ArrayList(g32.l(a2, 10));
                    for (com.zunjae.anyme.features.kanon.i iVar : a2) {
                        float b2 = (float) iVar.b();
                        float a3 = (float) iVar.a();
                        if (a3 < ((float) 0)) {
                            a3 = Utils.FLOAT_EPSILON;
                            b2 = Utils.FLOAT_EPSILON;
                        }
                        arrayList.add(new BarEntry(b2, a3));
                    }
                    BarDataSet barDataSet = new BarDataSet(arrayList, "Scores");
                    barDataSet.setValueTextColor(this.b);
                    barDataSet.setValueTextSize(12.0f);
                    barDataSet.setValueFormatter(this.c);
                    barDataSet.setDrawValues(false);
                    barDataSet.setGradientColors(this.d);
                    ((BarChart) this.a.K1(C0275R$id.showScoreChart)).setData(new BarData(barDataSet));
                    ((BarChart) this.a.K1(C0275R$id.showScoreChart)).invalidate();
                    BarChart barChart2 = (BarChart) this.a.K1(C0275R$id.showScoreChart);
                    v62.d(barChart2, "showScoreChart");
                    rw1.i(barChart2);
                    return;
                } else if (!(aVar instanceof a.d) && !(aVar instanceof a.b)) {
                    return;
                }
            }
            BarChart barChart3 = (BarChart) this.a.K1(C0275R$id.showScoreChart);
            v62.d(barChart3, "showScoreChart");
            rw1.a(barChart3);
        }
    }

    /* renamed from: hr1$m */
    static final class m extends w62 implements z52<String, u22> {
        final /* synthetic */ hr1 f;

        /* renamed from: hr1$m$a */
        static final class a implements Runnable {
            final /* synthetic */ m e;

            a(m mVar) {
                this.e = mVar;
            }

            public final void run() {
                TextView textView = (TextView) this.e.f.K1(C0275R$id.animeSynopsisMessage);
                if ((textView != null ? textView.getLineCount() : 0) > 3) {
                    TextView textView2 = (TextView) this.e.f.K1(C0275R$id.readMoreSummary);
                    if (textView2 != null) {
                        rw1.i(textView2);
                        return;
                    }
                    return;
                }
                TextView textView3 = (TextView) this.e.f.K1(C0275R$id.readMoreSummary);
                if (textView3 != null) {
                    rw1.a(textView3);
                }
            }
        }

        /* renamed from: hr1$m$b */
        static final class b implements View.OnClickListener {
            final /* synthetic */ m e;
            final /* synthetic */ String f;

            b(m mVar, String str) {
                this.e = mVar;
                this.f = str;
            }

            public final void onClick(View view) {
                mw1.q(hr1.P1(this.e.f), this.f, "Synopsis");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(hr1 hr1) {
            super(1);
            this.f = hr1;
        }

        public final void a(String str) {
            if (str != null && !f92.n(str)) {
                TextView textView = (TextView) this.f.K1(C0275R$id.animeSynopsisMessage);
                if (textView != null) {
                    textView.setText(com.zunjae.extensions.c.a(str));
                }
                TextView textView2 = (TextView) this.f.K1(C0275R$id.animeSynopsisMessage);
                if (textView2 != null) {
                    rw1.i(textView2);
                }
                TextView textView3 = (TextView) this.f.K1(C0275R$id.animeSynopsisMessage);
                if (textView3 != null) {
                    textView3.post(new a(this));
                }
                TextView textView4 = (TextView) this.f.K1(C0275R$id.readMoreSummary);
                if (textView4 != null) {
                    textView4.setOnClickListener(new b(this, str));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((String) obj);
            return u22.a;
        }
    }

    /* renamed from: hr1$m0 */
    static final class m0 implements IValueFormatter {
        public static final m0 a = new m0();

        m0() {
        }

        public final String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewPortHandler) {
            return String.valueOf((int) f);
        }
    }

    /* renamed from: hr1$n */
    static final class n extends w62 implements z52<List<? extends kx1>, u22> {
        final /* synthetic */ hr1 f;

        /* renamed from: hr1$n$a */
        static final class a implements TagView.e {
            final /* synthetic */ n a;
            final /* synthetic */ List b;

            a(n nVar, List list) {
                this.a = nVar;
                this.b = list;
            }

            public final void a(com.cunoraz.tagview.b bVar, int i) {
                Object obj;
                Iterator it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = ((kx1) obj).c;
                    v62.d(bVar, "tag");
                    if (v62.a(str, bVar.l())) {
                        break;
                    }
                }
                kx1 kx1 = (kx1) obj;
                if (kx1 != null) {
                    int i2 = kx1.b;
                    AnimeInfoActivity P1 = hr1.P1(this.a.f);
                    GenericItemList.d dVar = GenericItemList.M;
                    AnimeInfoActivity P12 = hr1.P1(this.a.f);
                    com.zunjae.anyme.features.kanon.generic_anime_list.c cVar = com.zunjae.anyme.features.kanon.generic_anime_list.c.Genre;
                    v62.d(bVar, "tag");
                    P1.startActivity(GenericItemList.d.b(dVar, P12, cVar, i2, bVar.l(), (String) null, 16, (Object) null));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(hr1 hr1) {
            super(1);
            this.f = hr1;
        }

        public final void a(List<? extends kx1> list) {
            boolean z;
            ((TagView) this.f.K1(C0275R$id.genresTagView)).k();
            if (list != null && !list.isEmpty()) {
                int d = androidx.core.content.a.d(hr1.P1(this.f), 2131099728);
                int d2 = androidx.core.content.a.d(hr1.P1(this.f), C0272R$color.button_focus_color);
                for (kx1 kx1 : list) {
                    TagView tagView = (TagView) this.f.K1(C0275R$id.genresTagView);
                    if (tagView != null) {
                        com.cunoraz.tagview.b bVar = new com.cunoraz.tagview.b(kx1.c);
                        bVar.o(d);
                        bVar.q(15.0f);
                        bVar.p(d2);
                        u22 u22 = u22.a;
                        tagView.g(bVar);
                    }
                }
                boolean z2 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((kx1) it.next()).b == 12) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    this.f.j0 = true;
                }
                ((TagView) this.f.K1(C0275R$id.genresTagView)).setOnTagClickListener(new a(this, list));
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((List) obj);
            return u22.a;
        }
    }

    /* renamed from: hr1$n0 */
    static final class n0 extends w62 implements z52<ve2<hr1>, u22> {
        final /* synthetic */ hr1 f;

        /* renamed from: hr1$n0$a */
        static final class a extends w62 implements z52<hr1, u22> {
            final /* synthetic */ n0 f;
            final /* synthetic */ qv1.a g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n0 n0Var, qv1.a aVar) {
                super(1);
                this.f = n0Var;
                this.g = aVar;
            }

            public final void a(hr1 hr1) {
                AnimeInfoActivity P1;
                String O;
                String str;
                v62.e(hr1, "it");
                qv1.a aVar = this.g;
                if (aVar instanceof qv1.a.c) {
                    this.f.f.s2();
                    return;
                }
                if (aVar instanceof qv1.a.C0260a) {
                    P1 = hr1.P1(this.f.f);
                    O = this.f.f.O(C0283R$string.couldNotUpdateAdBlockerContactZun);
                    str = "getString(R.string.could…pdateAdBlockerContactZun)";
                } else if (aVar instanceof qv1.a.b) {
                    P1 = hr1.P1(this.f.f);
                    O = this.f.f.O(C0283R$string.AdBlockerCouldNotUpdateTryAgain);
                    str = "getString(R.string.AdBlo…erCouldNotUpdateTryAgain)";
                } else {
                    return;
                }
                v62.d(O, str);
                Toast makeText = Toast.makeText(P1, O, 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((hr1) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n0(hr1 hr1) {
            super(1);
            this.f = hr1;
        }

        public final void a(ve2<hr1> ve2) {
            v62.e(ve2, "$receiver");
            ow1.a(ve2, new a(this, qv1.a.C((ut1) hg2.a(this.f).c().e(f72.b(ut1.class), (oh2) null, (o52<mh2>) null), (tr1) hg2.a(this.f).c().e(f72.b(tr1.class), (oh2) null, (o52<mh2>) null))));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    /* renamed from: hr1$o */
    static final class o extends w62 implements z52<ve2<hr1>, u22> {
        final /* synthetic */ hr1 f;
        final /* synthetic */ m g;
        final /* synthetic */ n h;

        /* renamed from: hr1$o$a */
        static final class a extends w62 implements z52<hr1, u22> {
            final /* synthetic */ o f;
            final /* synthetic */ com.zunjae.anyme.features.anime.info_screen.a g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(o oVar, com.zunjae.anyme.features.anime.info_screen.a aVar) {
                super(1);
                this.f = oVar;
                this.g = aVar;
            }

            public final void a(hr1 hr1) {
                v62.e(hr1, "it");
                com.zunjae.anyme.features.anime.info_screen.a aVar = this.g;
                if (aVar instanceof a.c) {
                    if (((RecyclerView) this.f.f.K1(C0275R$id.recyclerViewAdditionalInfo)) != null) {
                        a9.a.a(this.f.f.k0, ((a.c) this.g).a(), (d62) null, (d62) null, 6, (Object) null);
                        this.f.f.h2().h().m(((a.c) this.g).b());
                        this.f.f.v2(((a.c) this.g).b());
                        this.f.g.a(((a.c) this.g).b().y());
                        this.f.h.a(((a.c) this.g).b().j());
                    }
                } else if (!(aVar instanceof a.b)) {
                    boolean z = aVar instanceof a.C0162a;
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((hr1) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(hr1 hr1, m mVar, n nVar) {
            super(1);
            this.f = hr1;
            this.g = mVar;
            this.h = nVar;
        }

        public final void a(ve2<hr1> ve2) {
            v62.e(ve2, "$receiver");
            ow1.a(ve2, new a(this, this.f.h2().f(this.f.h2().g().i())));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    /* renamed from: hr1$o0 */
    public static final class o0 implements com.zunjae.anyme.abstracts.e {
        final /* synthetic */ hr1 a;
        final /* synthetic */ boolean b;

        o0(hr1 hr1, boolean z) {
            this.a = hr1;
            this.b = z;
        }

        public void a(kv1 kv1) {
            v62.e(kv1, "httpResult");
            if (this.a.n() != null) {
                AnimeInfoActivity P1 = hr1.P1(this.a);
                Toast makeText = Toast.makeText(P1, "Successfully updated " + this.a.h2().g().y(), 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                this.a.D2();
                if (!this.b) {
                    hr1.P1(this.a).finish();
                }
            }
        }
    }

    /* renamed from: hr1$p */
    static final class p extends w62 implements z52<ve2<hr1>, u22> {
        final /* synthetic */ hr1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(hr1 hr1) {
            super(1);
            this.f = hr1;
        }

        public final void a(ve2<hr1> ve2) {
            v62.e(ve2, "$receiver");
            hr1 hr1 = this.f;
            hr1.j0 = hr1.f2().s0(this.f.h2().g().i());
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    /* renamed from: hr1$q */
    static final class q implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        /* renamed from: hr1$q$a */
        static final class a implements f.n {
            final /* synthetic */ q a;

            a(q qVar) {
                this.a = qVar;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
                this.a.e.G2();
            }
        }

        /* renamed from: hr1$q$b */
        static final class b implements f.n {
            final /* synthetic */ q a;

            b(q qVar) {
                this.a = qVar;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
                this.a.e.G2();
            }
        }

        q(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            f.e eVar;
            f.n nVar;
            boolean z = true;
            if (!this.e.h2().k()) {
                Toast.makeText(this.e.n(), "Please add this show first to your profile before you start updating your progress", 1).show();
                return;
            }
            boolean z2 = hr1.R1(this.e).n() == 2;
            if (hr1.R1(this.e).x() == 2 || hr1.R1(this.e).x() == -1) {
                z = false;
            }
            if (!this.e.h2().g().l0() && hr1.R1(this.e).l0() && hr1.R1(this.e).m() == 0) {
                eVar = new f.e(hr1.P1(this.e));
                eVar.E("Are you sure");
                eVar.i("Are you sure you want to mark this anime as completed without rating it first?");
                eVar.B("Yes");
                eVar.w("No");
                nVar = new a(this);
            } else if (!z2 || !z) {
                this.e.G2();
                return;
            } else {
                eVar = new f.e(hr1.P1(this.e));
                eVar.E("Are you sure");
                eVar.i("This Anime has not yet finished airing, are you sure that your status is properly set?");
                eVar.B("Yes");
                eVar.w("No");
                nVar = new b(this);
            }
            eVar.A(nVar);
            eVar.D();
        }
    }

    /* renamed from: hr1$r */
    static final class r implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        /* renamed from: hr1$r$a */
        public static final class a implements com.zunjae.anyme.abstracts.e {
            final /* synthetic */ r a;

            a(r rVar) {
                this.a = rVar;
            }

            public void a(kv1 kv1) {
                v62.e(kv1, "httpResult");
                this.a.e.h2().n(true);
                FragmentActivity n = this.a.e.n();
                Toast.makeText(n, "Successfully added " + hr1.R1(this.a.e).y() + " to your profile", 0).show();
                ((MaterialButton) this.a.e.K1(C0275R$id.addToPTW)).clearAnimation();
                MaterialButton materialButton = (MaterialButton) this.a.e.K1(C0275R$id.addToPTW);
                v62.d(materialButton, "addToPTW");
                rw1.a(materialButton);
                MaterialButton materialButton2 = (MaterialButton) this.a.e.K1(C0275R$id.ub);
                v62.d(materialButton2, "ub");
                rw1.i(materialButton2);
                MaterialButton materialButton3 = (MaterialButton) this.a.e.K1(C0275R$id.plusOne);
                v62.d(materialButton3, "plusOne");
                materialButton3.setEnabled(true);
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.a.e.K1(C0275R$id.userStatusContainer);
                v62.d(flexboxLayout, "userStatusContainer");
                rw1.i(flexboxLayout);
                this.a.e.J2();
            }
        }

        r(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).i0(hr1.R1(this.e), com.zunjae.anyme.abstracts.d.ADD, new a(this));
        }
    }

    /* renamed from: hr1$s */
    static final class s implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        s(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).startActivity(BasicWebViewBrowser.S.a(hr1.P1(this.e), this.e.h2().g().j()));
        }
    }

    /* renamed from: hr1$t */
    static final class t implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        t(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).startActivity(RelatedAnimeActivity.H.a(hr1.P1(this.e), this.e.h2().g().i(), this.e.h2().g().f()));
        }
    }

    /* renamed from: hr1$u */
    static final class u implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        u(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).startActivity(AnimeRecommendationsActivity.H.a(hr1.P1(this.e), this.e.h2().g().i(), this.e.h2().g().f()));
        }
    }

    /* renamed from: hr1$v */
    static final class v implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        v(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            ArrayList<Integer> J = hr1.M1(this.e).J();
            AnimeInfoActivity P1 = hr1.P1(this.e);
            CharactersActivity.c cVar = CharactersActivity.G;
            AnimeInfoActivity P12 = hr1.P1(this.e);
            int i = this.e.h2().g().i();
            String f = this.e.h2().g().f();
            v62.d(J, "characterIdsInFavorite");
            P1.startActivity(cVar.a(P12, i, f, J));
        }
    }

    /* renamed from: hr1$w */
    static final class w implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        w(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (!(n instanceof AbstractActivity)) {
                n = null;
            }
            AbstractActivity abstractActivity = (AbstractActivity) n;
            if (abstractActivity != null) {
                abstractActivity.W(this.e.h2().g().i());
            }
        }
    }

    /* renamed from: hr1$x */
    static final class x implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        x(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            this.e.r2();
        }
    }

    /* renamed from: hr1$y */
    static final class y implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        y(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            hr1.P1(this.e).startActivity(BasicWebViewBrowser.S.a(hr1.P1(this.e), this.e.h2().g().j()));
        }
    }

    /* renamed from: hr1$z */
    static final class z implements View.OnClickListener {
        final /* synthetic */ hr1 e;

        z(hr1 hr1) {
            this.e = hr1;
        }

        public final void onClick(View view) {
            ds1 C0 = hr1.P1(this.e).C0();
            if (xx1.a.b()) {
                C0.a(hr1.P1(this.e));
                return;
            }
            int i = hr1.R1(this.e).i();
            boolean a = ez1.a.a(i);
            if (a) {
                C0.c(i, (cs1) null);
            } else {
                C0.b(i, (cs1) null);
            }
            this.e.y2(!a);
        }
    }

    public hr1() {
        super(C0278R$layout.fragment_anime_main_r2);
    }

    private final void A2() {
        AnimeRelatedShowsAdapter animeRelatedShowsAdapter = new AnimeRelatedShowsAdapter(n(), 0);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewRelatedShows);
        recyclerView.setAdapter(animeRelatedShowsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(n(), 0, false));
        f2().I().g(R(), new j0(this, animeRelatedShowsAdapter));
    }

    private final void B2() {
        BarChart barChart = (BarChart) K1(C0275R$id.showScoreChart);
        Legend legend = barChart.getLegend();
        v62.d(legend, "legend");
        legend.setEnabled(false);
        Description description = barChart.getDescription();
        v62.d(description, "description");
        description.setEnabled(false);
        barChart.setFitBars(true);
        barChart.setDrawGridBackground(false);
        barChart.setDrawValueAboveBar(true);
        YAxis axisRight = barChart.getAxisRight();
        v62.d(axisRight, "axisRight");
        axisRight.setEnabled(false);
        barChart.setDoubleTapToZoomEnabled(false);
        barChart.setHighlightPerDragEnabled(false);
        barChart.setHighlightPerTapEnabled(true);
        BarChart barChart2 = (BarChart) K1(C0275R$id.showScoreChart);
        v62.d(barChart2, "showScoreChart");
        YAxis axisLeft = barChart2.getAxisLeft();
        axisLeft.setXOffset(Utils.FLOAT_EPSILON);
        axisLeft.setYOffset(Utils.FLOAT_EPSILON);
        axisLeft.setTextSize(12.0f);
        axisLeft.setTextColor(-1);
        BarChart barChart3 = (BarChart) K1(C0275R$id.showScoreChart);
        v62.d(barChart3, "showScoreChart");
        XAxis xAxis = barChart3.getXAxis();
        xAxis.setXOffset(Utils.FLOAT_EPSILON);
        xAxis.setYOffset(Utils.FLOAT_EPSILON);
        xAxis.setTextSize(12.0f);
        xAxis.setTextColor(-1);
        xAxis.setLabelCount(11);
        int d2 = androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent);
        int d3 = androidx.core.content.a.d(o1(), 17170443);
        List b2 = e32.b(new GradientColor(d2, androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent)));
        ((BarChart) K1(C0275R$id.showScoreChart)).setOnChartValueSelectedListener(new k0(this));
        f2().L().g(R(), new l0(this, d3, m0.a, b2));
    }

    private final void C2() {
        MaterialButton materialButton = (MaterialButton) K1(C0275R$id.ub);
        materialButton.setEnabled(true);
        materialButton.startAnimation(gw1.a.a(1.0d, 0.3d, 300));
        this.i0 = true;
    }

    /* access modifiers changed from: private */
    public final void D2() {
        MaterialButton materialButton = (MaterialButton) K1(C0275R$id.ub);
        materialButton.setEnabled(false);
        materialButton.setAnimation((Animation) null);
        this.i0 = false;
    }

    /* access modifiers changed from: private */
    public final void E2() {
        we2.c(this, (z52) null, new n0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void G2() {
        xu1 xu1 = xu1.i;
        AnimeInfoActivity animeInfoActivity = this.f0;
        if (animeInfoActivity != null) {
            boolean s2 = xu1.s(animeInfoActivity);
            AnimeInfoActivity animeInfoActivity2 = this.f0;
            if (animeInfoActivity2 != null) {
                sy1 sy1 = this.g0;
                if (sy1 != null) {
                    animeInfoActivity2.i0(sy1, com.zunjae.anyme.abstracts.d.UPDATE, new o0(this, s2));
                } else {
                    v62.p("updatedAnime");
                    throw null;
                }
            } else {
                v62.p("parentActivity");
                throw null;
            }
        } else {
            v62.p("parentActivity");
            throw null;
        }
    }

    private final void H2(int i2) {
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            sy1.Q(i2);
            J2();
            C2();
            return;
        }
        v62.p("updatedAnime");
        throw null;
    }

    private final void I2() {
        e.a aVar = com.zunjae.dynsourcegen.e.j;
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            com.zunjae.dynsourcegen.e k2 = aVar.k(sy1.i());
            MaterialButton materialButton = (MaterialButton) K1(C0275R$id.watchButton);
            v62.d(materialButton, "watchButton");
            materialButton.setText(k2.g());
            return;
        }
        v62.p("updatedAnime");
        throw null;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void J2() {
        TextView textView = (TextView) K1(C0275R$id.animeStatusValue);
        v62.d(textView, "animeStatusValue");
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            textView.setText(sy1.o());
            TextView textView2 = (TextView) K1(C0275R$id.animeProgressValue);
            v62.d(textView2, "animeProgressValue");
            sy1 sy12 = this.g0;
            if (sy12 != null) {
                textView2.setText(sy12.E((ky1) null));
                sy1 sy13 = this.g0;
                if (sy13 != null) {
                    int p2 = sy13.p() - h2().g().p();
                    String str = "+";
                    String str2 = p2 > 0 ? str : "";
                    if (p2 == 0) {
                        TextView textView3 = (TextView) K1(C0275R$id.animeProgressValue);
                        v62.d(textView3, "animeProgressValue");
                        sy1 sy14 = this.g0;
                        if (sy14 != null) {
                            textView3.setText(sy14.E((ky1) null));
                        } else {
                            v62.p("updatedAnime");
                            throw null;
                        }
                    } else {
                        TextView textView4 = (TextView) K1(C0275R$id.animeProgressValue);
                        v62.d(textView4, "animeProgressValue");
                        StringBuilder sb = new StringBuilder();
                        sy1 sy15 = this.g0;
                        if (sy15 != null) {
                            sb.append(sy15.E((ky1) null));
                            h72 h72 = h72.a;
                            String format = String.format(" (%s%d)", Arrays.copyOf(new Object[]{str2, Integer.valueOf(p2)}, 2));
                            v62.d(format, "java.lang.String.format(format, *args)");
                            sb.append(format);
                            textView4.setText(sb.toString());
                        } else {
                            v62.p("updatedAnime");
                            throw null;
                        }
                    }
                    MaterialButton materialButton = (MaterialButton) K1(C0275R$id.plusOne);
                    v62.d(materialButton, "plusOne");
                    sy1 sy16 = this.g0;
                    if (sy16 != null) {
                        materialButton.setEnabled(sy16.f0());
                        sy1 sy17 = this.g0;
                        if (sy17 != null) {
                            int m2 = sy17.m() - h2().g().m();
                            if (m2 <= 0) {
                                str = "";
                            }
                            if (m2 == 0) {
                                TextView textView5 = (TextView) K1(C0275R$id.animeScoreValue);
                                v62.d(textView5, "animeScoreValue");
                                sy1 sy18 = this.g0;
                                if (sy18 != null) {
                                    textView5.setText(String.valueOf(sy18.m()));
                                } else {
                                    v62.p("updatedAnime");
                                    throw null;
                                }
                            } else {
                                TextView textView6 = (TextView) K1(C0275R$id.animeScoreValue);
                                v62.d(textView6, "animeScoreValue");
                                StringBuilder sb2 = new StringBuilder();
                                sy1 sy19 = this.g0;
                                if (sy19 != null) {
                                    sb2.append(sy19.m());
                                    sb2.append(" (");
                                    sb2.append(str);
                                    sb2.append(m2);
                                    sb2.append(')');
                                    textView6.setText(sb2.toString());
                                    return;
                                }
                                v62.p("updatedAnime");
                                throw null;
                            }
                        } else {
                            v62.p("updatedAnime");
                            throw null;
                        }
                    } else {
                        v62.p("updatedAnime");
                        throw null;
                    }
                } else {
                    v62.p("updatedAnime");
                    throw null;
                }
            } else {
                v62.p("updatedAnime");
                throw null;
            }
        } else {
            v62.p("updatedAnime");
            throw null;
        }
    }

    public static final /* synthetic */ AnimeCharactersAdapter M1(hr1 hr1) {
        AnimeCharactersAdapter animeCharactersAdapter = hr1.h0;
        if (animeCharactersAdapter != null) {
            return animeCharactersAdapter;
        }
        v62.p("charactersAdapter");
        throw null;
    }

    public static final /* synthetic */ AnimeInfoActivity P1(hr1 hr1) {
        AnimeInfoActivity animeInfoActivity = hr1.f0;
        if (animeInfoActivity != null) {
            return animeInfoActivity;
        }
        v62.p("parentActivity");
        throw null;
    }

    public static final /* synthetic */ sy1 R1(hr1 hr1) {
        sy1 sy1 = hr1.g0;
        if (sy1 != null) {
            return sy1;
        }
        v62.p("updatedAnime");
        throw null;
    }

    private final void c2(iv1 iv1) {
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            sy1.R(iv1.a());
            if (iv1.a() == 2) {
                sy1 sy12 = this.g0;
                if (sy12 != null) {
                    sy12.M();
                } else {
                    v62.p("updatedAnime");
                    throw null;
                }
            }
            J2();
            C2();
            return;
        }
        v62.p("updatedAnime");
        throw null;
    }

    private final void d2() {
        fr1.b bVar = fr1.w0;
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            bVar.a(sy1.i(), this.j0).W1(t(), "CRUD_DIALOG_STREAM_PICKER");
        } else {
            v62.p("updatedAnime");
            throw null;
        }
    }

    private final void e2(av1 av1) {
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            sy1.S(av1.a());
            if (av1.a() == 0) {
                sy1 sy12 = this.g0;
                if (sy12 != null) {
                    sy12.R(6);
                } else {
                    v62.p("updatedAnime");
                    throw null;
                }
            }
            sy1 sy13 = this.g0;
            if (sy13 != null) {
                if (!sy13.l0() && av1.a() > 0) {
                    sy1 sy14 = this.g0;
                    if (sy14 != null) {
                        sy14.R(1);
                    } else {
                        v62.p("updatedAnime");
                        throw null;
                    }
                }
                sy1 sy15 = this.g0;
                if (sy15 != null) {
                    int p2 = sy15.p();
                    sy1 sy16 = this.g0;
                    if (sy16 != null) {
                        if (p2 == sy16.u()) {
                            sy1 sy17 = this.g0;
                            if (sy17 != null) {
                                sy17.M();
                            } else {
                                v62.p("updatedAnime");
                                throw null;
                            }
                        }
                        sy1 sy18 = this.g0;
                        if (sy18 != null) {
                            if (sy18.n() == 2) {
                                sy1 sy19 = this.g0;
                                if (sy19 == null) {
                                    v62.p("updatedAnime");
                                    throw null;
                                } else if (!sy19.l0()) {
                                    sy1 sy110 = this.g0;
                                    if (sy110 != null) {
                                        sy110.R(1);
                                    } else {
                                        v62.p("updatedAnime");
                                        throw null;
                                    }
                                }
                            }
                            J2();
                            C2();
                            return;
                        }
                        v62.p("updatedAnime");
                        throw null;
                    }
                    v62.p("updatedAnime");
                    throw null;
                }
                v62.p("updatedAnime");
                throw null;
            }
            v62.p("updatedAnime");
            throw null;
        }
        v62.p("updatedAnime");
        throw null;
    }

    /* access modifiers changed from: private */
    public final nu1 f2() {
        return (nu1) this.a0.getValue();
    }

    private final ou1 g2() {
        return (ou1) this.b0.getValue();
    }

    /* access modifiers changed from: private */
    public final gr1 h2() {
        return (gr1) this.d0.getValue();
    }

    private final com.zunjae.anyme.features.kanon.e i2() {
        return (com.zunjae.anyme.features.kanon.e) this.e0.getValue();
    }

    private final qu1 j2() {
        return (qu1) this.c0.getValue();
    }

    private final void k2(Intent intent) {
        int intExtra = intent.getIntExtra("newEpisodeNumber", -1);
        if (intExtra > 0 && h2().k()) {
            sy1 sy1 = this.g0;
            if (sy1 != null) {
                if (sy1.u() > 0) {
                    sy1 sy12 = this.g0;
                    if (sy12 == null) {
                        v62.p("updatedAnime");
                        throw null;
                    } else if (intExtra > sy12.u()) {
                        return;
                    }
                }
                sy1 sy13 = this.g0;
                if (sy13 == null) {
                    v62.p("updatedAnime");
                    throw null;
                } else if (intExtra > sy13.p()) {
                    sy1 sy14 = this.g0;
                    if (sy14 != null) {
                        sy14.S(intExtra);
                        sy1 sy15 = this.g0;
                        if (sy15 != null) {
                            if (sy15.p() > h2().g().p()) {
                                sy1 sy16 = this.g0;
                                if (sy16 != null) {
                                    sy16.R(1);
                                } else {
                                    v62.p("updatedAnime");
                                    throw null;
                                }
                            }
                            sy1 sy17 = this.g0;
                            if (sy17 != null) {
                                int p2 = sy17.p();
                                sy1 sy18 = this.g0;
                                if (sy18 != null) {
                                    if (p2 == sy18.u()) {
                                        sy1 sy19 = this.g0;
                                        if (sy19 == null) {
                                            v62.p("updatedAnime");
                                            throw null;
                                        } else if (sy19.p() > 0) {
                                            sy1 sy110 = this.g0;
                                            if (sy110 != null) {
                                                sy110.R(2);
                                            } else {
                                                v62.p("updatedAnime");
                                                throw null;
                                            }
                                        }
                                    }
                                    AnimeInfoActivity animeInfoActivity = this.f0;
                                    if (animeInfoActivity != null) {
                                        Toast makeText = Toast.makeText(animeInfoActivity, "Progress set to episode " + intExtra, 1);
                                        makeText.show();
                                        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                                        u2();
                                        return;
                                    }
                                    v62.p("parentActivity");
                                    throw null;
                                }
                                v62.p("updatedAnime");
                                throw null;
                            }
                            v62.p("updatedAnime");
                            throw null;
                        }
                        v62.p("updatedAnime");
                        throw null;
                    }
                    v62.p("updatedAnime");
                    throw null;
                }
            } else {
                v62.p("updatedAnime");
                throw null;
            }
        }
    }

    private final void l2() {
        AnimeInfoActivity animeInfoActivity = this.f0;
        if (animeInfoActivity != null) {
            AnimeCharactersAdapter animeCharactersAdapter = new AnimeCharactersAdapter(animeInfoActivity, h2().g().i(), j2(), 0);
            animeCharactersAdapter.h = true;
            u22 u22 = u22.a;
            this.h0 = animeCharactersAdapter;
            RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.charactersRecyclerView);
            AnimeCharactersAdapter animeCharactersAdapter2 = this.h0;
            if (animeCharactersAdapter2 != null) {
                recyclerView.setAdapter(animeCharactersAdapter2);
                recyclerView.setLayoutManager(new LinearLayoutManager(n(), 0, false));
                g2().g().g(R(), new k(this));
                return;
            }
            v62.p("charactersAdapter");
            throw null;
        }
        v62.p("parentActivity");
        throw null;
    }

    private final void m2() {
        AnimeInfoActivity animeInfoActivity = this.f0;
        if (animeInfoActivity != null) {
            int d2 = androidx.core.content.a.d(animeInfoActivity, C0272R$color.theme_NightBlue_accent);
            AnimeInfoActivity animeInfoActivity2 = this.f0;
            if (animeInfoActivity2 != null) {
                int d3 = androidx.core.content.a.d(animeInfoActivity2, C0272R$color.textColor_light_mode);
                RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewAdditionalInfo);
                v62.d(recyclerView, "recyclerViewAdditionalInfo");
                recyclerView.setNestedScrollingEnabled(false);
                RecyclerView recyclerView2 = (RecyclerView) K1(C0275R$id.recyclerViewAdditionalInfo);
                v62.d(recyclerView2, "recyclerViewAdditionalInfo");
                com.afollestad.recyclical.b.a(recyclerView2, new l(this, d2, d3));
                return;
            }
            v62.p("parentActivity");
            throw null;
        }
        v62.p("parentActivity");
        throw null;
    }

    private final void n2() {
        we2.c(this, (z52) null, new o(this, new m(this), new n(this)), 1, (Object) null);
    }

    private final void p2(ev1 ev1) {
        onDefaultProgressionChanged(new av1(ev1.a()));
    }

    private final void q2() {
        we2.c(this, (z52) null, new p(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void r2() {
        if (h2().g().x() == 3) {
            AnimeInfoActivity animeInfoActivity = this.f0;
            if (animeInfoActivity != null) {
                Toast makeText = Toast.makeText(animeInfoActivity, "This Anime has not yet been aired, so you probably won't find any discussions", 1);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            } else {
                v62.p("parentActivity");
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("title:\"" + h2().g().y() + '\"');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("subreddit:anime self:yes title:\"discussion\" ");
        sb2.append(sb);
        String sb3 = sb2.toString();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/search?q=" + sb3 + "&restrict_sr=on&sort=new&t=all"));
        intent.setFlags(268435456);
        AnimeInfoActivity animeInfoActivity2 = this.f0;
        if (animeInfoActivity2 != null) {
            animeInfoActivity2.startActivity(intent);
        } else {
            v62.p("parentActivity");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void s2() {
        e.a aVar = com.zunjae.dynsourcegen.e.j;
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            com.zunjae.dynsourcegen.e k2 = aVar.k(sy1.i());
            t2(k2, false, false);
            i2().N(h2().g().i(), k2.c()).Q(new au1());
            return;
        }
        v62.p("updatedAnime");
        throw null;
    }

    private final void t2(com.zunjae.dynsourcegen.e eVar, boolean z2, boolean z3) {
        AnimeInfoActivity animeInfoActivity = this.f0;
        if (animeInfoActivity != null) {
            sy1 sy1 = this.g0;
            if (sy1 != null) {
                Intent a2 = sr1.a(eVar, animeInfoActivity, sy1, z2, z3);
                if (a2 == null) {
                    AnimeInfoActivity animeInfoActivity2 = this.f0;
                    if (animeInfoActivity2 != null) {
                        Toast makeText = Toast.makeText(animeInfoActivity2, "An error occurred", 0);
                        makeText.show();
                        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                        return;
                    }
                    v62.p("parentActivity");
                    throw null;
                }
                G1(a2, lv1.f.e());
                return;
            }
            v62.p("updatedAnime");
            throw null;
        }
        v62.p("parentActivity");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void u2() {
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            int p2 = sy1.p();
            sy1 sy12 = this.g0;
            if (sy12 != null) {
                if (p2 == sy12.u()) {
                    sy1 sy13 = this.g0;
                    if (sy13 == null) {
                        v62.p("updatedAnime");
                        throw null;
                    } else if (sy13.p() > 0) {
                        sy1 sy14 = this.g0;
                        if (sy14 != null) {
                            sy14.R(2);
                        } else {
                            v62.p("updatedAnime");
                            throw null;
                        }
                    }
                }
                sy1 sy15 = this.g0;
                if (sy15 != null) {
                    int p3 = sy15.p();
                    sy1 sy16 = this.g0;
                    if (sy16 != null) {
                        if (p3 > sy16.p()) {
                            sy1 sy17 = this.g0;
                            if (sy17 == null) {
                                v62.p("updatedAnime");
                                throw null;
                            } else if (sy17.u() == 0) {
                                sy1 sy18 = this.g0;
                                if (sy18 != null) {
                                    sy18.R(1);
                                } else {
                                    v62.p("updatedAnime");
                                    throw null;
                                }
                            }
                        }
                        sy1 sy19 = this.g0;
                        if (sy19 != null) {
                            if (sy19.p() == 0) {
                                sy1 sy110 = this.g0;
                                if (sy110 == null) {
                                    v62.p("updatedAnime");
                                    throw null;
                                } else if (sy110.p() > 0) {
                                    sy1 sy111 = this.g0;
                                    if (sy111 != null) {
                                        sy111.d0(true);
                                    } else {
                                        v62.p("updatedAnime");
                                        throw null;
                                    }
                                }
                            }
                            J2();
                            if (!this.i0) {
                                C2();
                                return;
                            }
                            return;
                        }
                        v62.p("updatedAnime");
                        throw null;
                    }
                    v62.p("updatedAnime");
                    throw null;
                }
                v62.p("updatedAnime");
                throw null;
            }
            v62.p("updatedAnime");
            throw null;
        }
        v62.p("updatedAnime");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void v2(lx1 lx1) {
        Integer h2 = lx1.h();
        if (h2 != null && h2.intValue() > 0 && h2().g().u() == 0) {
            sy1 sy1 = this.g0;
            if (sy1 != null) {
                Integer h3 = lx1.h();
                v62.c(h3);
                sy1.W(h3.intValue());
                return;
            }
            v62.p("updatedAnime");
            throw null;
        }
    }

    private final void w2() {
        ((TextView) K1(C0275R$id.get_notified)).setOnClickListener(new z(this));
        ((TextView) K1(C0275R$id.viewAllRecommendations)).setOnClickListener(new a0(this));
        ((TextView) K1(C0275R$id.viewAllRelated)).setOnClickListener(new b0(this));
        ((MaterialButton) K1(C0275R$id.plusOne)).setOnClickListener(new c0(this));
        ((LinearLayout) K1(C0275R$id.statusContainer)).setOnClickListener(new d0(this));
        ((MaterialButton) K1(C0275R$id.watchButton)).setOnClickListener(new e0(this));
        ((TextView) K1(C0275R$id.buttonOtherSource)).setOnClickListener(new f0(this));
        ((LinearLayout) K1(C0275R$id.scoreContainer)).setOnClickListener(new g0(this));
        ((LinearLayout) K1(C0275R$id.progressContainer)).setOnClickListener(new h0(this));
        ((MaterialButton) K1(C0275R$id.ub)).setOnClickListener(new q(this));
        ((MaterialButton) K1(C0275R$id.addToPTW)).setOnClickListener(new r(this));
        ((TextView) K1(C0275R$id.buttonMoreInformation)).setOnClickListener(new s(this));
        ((TextView) K1(C0275R$id.viewAllRelated)).setOnClickListener(new t(this));
        ((TextView) K1(C0275R$id.viewAllRecommendations)).setOnClickListener(new u(this));
        ((TextView) K1(C0275R$id.viewAllCharacters)).setOnClickListener(new v(this));
        ((LinearLayout) K1(C0275R$id.animeActionAddToBookmark)).setOnClickListener(new w(this));
        ((Chip) K1(C0275R$id.redditDiscussButton)).setOnClickListener(new x(this));
        ((Chip) K1(C0275R$id.myAnimeListInfoButton)).setOnClickListener(new y(this));
    }

    @SuppressLint({"SetTextI18n"})
    private final void x2() {
        if (h2().g().x() != 2) {
            if (!f32.h(1, 3).contains(Integer.valueOf(h2().g().x()))) {
                CardView cardView = (CardView) K1(C0275R$id.cardViewContainerNextEpisode);
                v62.d(cardView, "cardViewContainerNextEpisode");
                rw1.a(cardView);
                return;
            }
            ky1 d2 = h2().g().d();
            CardView cardView2 = (CardView) K1(C0275R$id.cardViewContainerNextEpisode);
            v62.d(cardView2, "cardViewContainerNextEpisode");
            rw1.i(cardView2);
            if (d2 == null || d2.e()) {
                TextView textView = (TextView) K1(C0275R$id.textNextRelease);
                v62.d(textView, "textNextRelease");
                textView.setText("An episode will be released later.");
            } else {
                TextView textView2 = (TextView) K1(C0275R$id.textNextRelease);
                v62.d(textView2, "textNextRelease");
                textView2.setText("EP " + d2.b() + " will be released in " + d2.c());
            }
            y2(ez1.a.a(h2().g().i()));
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void y2(boolean z2) {
        TextView textView;
        String str;
        if (z2) {
            textView = (TextView) K1(C0275R$id.get_notified);
            v62.d(textView, "get_notified");
            str = "Stop Getting Notified";
        } else {
            textView = (TextView) K1(C0275R$id.get_notified);
            v62.d(textView, "get_notified");
            str = "Get Notified";
        }
        textView.setText(str);
    }

    private final void z2() {
        AnimeRecommendationsAdapter animeRecommendationsAdapter = new AnimeRecommendationsAdapter(n(), 0);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewRecommendations);
        recyclerView.setAdapter(animeRecommendationsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(n(), 0, false));
        f2().w().g(R(), new i0(this, animeRecommendationsAdapter));
    }

    public void F2() {
        G2();
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(g2().g())) {
            g2().j(h2().g().i());
        }
        if (!com.zunjae.vresult.b.a(f2().w())) {
            f2().U(h2().g().i());
        }
        if (!com.zunjae.vresult.b.a(f2().I())) {
            f2().b0(h2().g().i());
        }
        if (!com.zunjae.vresult.b.a(f2().L())) {
            f2().d0(h2().g().i());
        }
    }

    public void J0(Bundle bundle) {
        v62.e(bundle, "outState");
        super.J0(bundle);
        sy1 sy1 = this.g0;
        if (sy1 != null) {
            bundle.putParcelable("updatedAnime", sy1);
            bundle.putBoolean("madeChanges", this.i0);
            return;
        }
        v62.p("updatedAnime");
        throw null;
    }

    public void J1() {
        HashMap hashMap = this.l0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void K0() {
        super.K0();
        cw1.k.a().j(this);
    }

    public View K1(int i2) {
        if (this.l0 == null) {
            this.l0 = new HashMap();
        }
        View view = (View) this.l0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.l0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void L0() {
        super.L0();
        cw1.k.a().l(this);
    }

    public void h0(Bundle bundle) {
        View view;
        Bundle bundle2 = bundle;
        super.h0(bundle);
        FragmentActivity n2 = n();
        if (n2 != null) {
            this.f0 = (AnimeInfoActivity) n2;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) K1(C0275R$id.swipeRefreshLayout);
            v62.d(swipeRefreshLayout, "swipeRefreshLayout");
            swipeRefreshLayout.setEnabled(false);
            String str = "addToPTW";
            if (h2().k()) {
                view = (MaterialButton) K1(C0275R$id.addToPTW);
            } else {
                MaterialButton materialButton = (MaterialButton) K1(C0275R$id.ub);
                v62.d(materialButton, "ub");
                rw1.a(materialButton);
                MaterialButton materialButton2 = (MaterialButton) K1(C0275R$id.addToPTW);
                v62.d(materialButton2, str);
                rw1.i(materialButton2);
                view = (FlexboxLayout) K1(C0275R$id.userStatusContainer);
                str = "userStatusContainer";
            }
            v62.d(view, str);
            rw1.a(view);
            if (bundle2 != null) {
                Parcelable parcelable = bundle2.getParcelable("updatedAnime");
                v62.c(parcelable);
                this.g0 = (sy1) parcelable;
                boolean z2 = bundle2.getBoolean("madeChanges");
                this.i0 = z2;
                if (z2) {
                    C2();
                }
            } else {
                this.g0 = sy1.b(h2().g(), 0, (String) null, 0, 0, 0, (String) null, 0, 0, 0, 0, (List) null, (yy1) null, (ky1) null, 8191, (Object) null);
                this.i0 = false;
            }
            x2();
            m2();
            l2();
            w2();
            J2();
            I2();
            n2();
            z2();
            A2();
            B2();
            q2();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity");
    }

    public void i0(int i2, int i3, Intent intent) {
        if (i2 == lv1.f.e() && i3 == lv1.f.c()) {
            v62.c(intent);
            k2(intent);
        }
    }

    public boolean o2() {
        return this.i0;
    }

    @vq1
    public final void onAnimeScoreChanged(fv1 fv1) {
        v62.e(fv1, "bus");
        H2(fv1.a());
    }

    @vq1
    public final void onAnimeStatusChanged(iv1 iv1) {
        v62.e(iv1, "bus");
        c2(iv1);
    }

    @vq1
    public final void onDefaultProgressionChanged(av1 av1) {
        v62.e(av1, "bus");
        e2(av1);
    }

    @vq1
    public final void onManualAnimeProgressionChanged(ev1 ev1) {
        v62.e(ev1, "bus");
        p2(ev1);
    }

    @vq1
    public final void onOpenStreamBus(AnimeInfoActivity.f fVar) {
        v62.e(fVar, "bus");
        t2(fVar.c(), fVar.a(), fVar.b());
    }

    @vq1
    public final void onPickADifferentHost(zu1 zu1) {
        v62.e(zu1, "changeStreamingSiteBus");
        d2();
    }

    @vq1
    public final void onStreamingSiteChanged(com.zunjae.dynsourcegen.e eVar) {
        v62.e(eVar, "videoStreamSite");
        I2();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
