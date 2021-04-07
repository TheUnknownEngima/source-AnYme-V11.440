package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.narayanacharya.waveview.WaveView;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.HomeActivity;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.discover.favorites.FavoritesActivity;
import com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList;
import defpackage.a9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"SetTextI18n"})
/* renamed from: lu1  reason: default package */
public final class lu1 extends rs1 {
    private final d22 c0 = g22.b(new d(this, (oh2) null, new c(this), (o52) null));
    private final d22 d0 = g22.b(new f(this, (oh2) null, new e(this), (o52) null));
    private final d22 e0 = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 f0 = g22.b(new b(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<ay1> g0 = b9.a();
    private ju1 h0;
    private HashMap i0;

    /* renamed from: lu1$a */
    public static final class a extends w62 implements o52<ov1> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, ov1] */
        public final ov1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(ov1.class), this.g, this.h);
        }
    }

    /* renamed from: lu1$b */
    public static final class b extends w62 implements o52<com.zunjae.anyme.features.kanon.e> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
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

    /* renamed from: lu1$c */
    public static final class c extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: lu1$d */
    public static final class d extends w62 implements o52<qu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    /* renamed from: lu1$e */
    public static final class e extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: lu1$f */
    public static final class f extends w62 implements o52<nu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    /* renamed from: lu1$g */
    public static final class g extends RecyclerView.c0 {
        private final TextView x;
        private final TextView y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(2131297204);
            v62.d(findViewById, "itemView.findViewById(R.id.title)");
            this.x = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.subtitle);
            v62.d(findViewById2, "itemView.findViewById(R.id.subtitle)");
            this.y = (TextView) findViewById2;
        }

        public final TextView M() {
            return this.y;
        }

        public final TextView N() {
            return this.x;
        }
    }

    /* renamed from: lu1$h */
    static final class h extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ lu1 f;

        /* renamed from: lu1$h$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends ay1, g>, u22> {
            final /* synthetic */ h f;

            /* renamed from: lu1$h$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0251a extends u62 implements z52<View, g> {
                public static final C0251a n = new C0251a();

                C0251a() {
                    super(1, g.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final g r(View view) {
                    v62.e(view, "p1");
                    return new g(view);
                }
            }

            /* renamed from: lu1$h$a$b */
            static final class b extends w62 implements e62<g, Integer, ay1, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(g gVar, int i, ay1 ay1) {
                    TextView textView;
                    int i2;
                    v62.e(gVar, "$receiver");
                    v62.e(ay1, "stat");
                    TextView N = gVar.N();
                    N.setText(ay1.b().getTitle() + ':');
                    gVar.M().setText(ay1.a());
                    if (ay1.b().isClickable()) {
                        gVar.N().setPaintFlags(gVar.N().getPaintFlags() | 8);
                        textView = gVar.M();
                        i2 = gVar.M().getPaintFlags() | 8;
                    } else {
                        gVar.N().setPaintFlags(gVar.N().getPaintFlags() ^ 8);
                        textView = gVar.M();
                        i2 = gVar.N().getPaintFlags() ^ 8;
                    }
                    textView.setPaintFlags(i2);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((g) obj, ((Number) obj2).intValue(), (ay1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: lu1$h$a$c */
            static final class c extends w62 implements d62<r9<? extends ay1>, Integer, u22> {
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

                public final void a(r9<ay1> r9Var, int i) {
                    Intent intent;
                    ts1 ts1;
                    v62.e(r9Var, "$receiver");
                    if (r9Var.getItem().b().isClickable()) {
                        FragmentActivity n = this.f.f.f.n();
                        if (n != null) {
                            HomeActivity homeActivity = (HomeActivity) n;
                            int i2 = mu1.a[r9Var.getItem().b().ordinal()];
                            if (i2 == 1) {
                                intent = FavoritesActivity.E.a(homeActivity, 1);
                            } else if (i2 != 2) {
                                if (i2 == 3) {
                                    ts1 = ts1.Bookmarks;
                                } else if (i2 == 4) {
                                    ts1 = ts1.Home;
                                } else {
                                    return;
                                }
                                homeActivity.v0(ts1);
                                return;
                            } else {
                                intent = GenericItemList.d.b(GenericItemList.M, homeActivity, com.zunjae.anyme.features.kanon.generic_anime_list.c.AllUserNotes, -1, "All Shows With Notes", (String) null, 16, (Object) null);
                            }
                            homeActivity.startActivity(intent);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.HomeActivity");
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f = hVar;
            }

            public final void a(com.afollestad.recyclical.a<ay1, g> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0251a.n, b.f);
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(lu1 lu1) {
            super(1);
            this.f = lu1;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.g0);
            cVar.h(new GridLayoutManager(this.f.u(), 2));
            a aVar = new a(this);
            String name = ay1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_kanon_stats, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: lu1$i */
    public static final class i implements ku1 {
        final /* synthetic */ lu1 a;

        i(lu1 lu1) {
            this.a = lu1;
        }

        public void a(xq1 xq1) {
            v62.e(xq1, "chip");
            ey1 ey1 = (ey1) xq1;
            GenericItemList.d dVar = GenericItemList.M;
            FragmentActivity n = this.a.n();
            v62.c(n);
            v62.d(n, "activity!!");
            Intent b = GenericItemList.d.b(dVar, n, com.zunjae.anyme.features.kanon.generic_anime_list.c.Producer, ey1.b(), ey1.c(), (String) null, 16, (Object) null);
            FragmentActivity n2 = this.a.n();
            if (n2 != null) {
                n2.startActivity(b);
            }
        }
    }

    /* renamed from: lu1$j */
    static final class j extends w62 implements z52<ve2<lu1>, u22> {
        final /* synthetic */ lu1 f;

        /* renamed from: lu1$j$a */
        static final class a extends w62 implements z52<lu1, u22> {
            final /* synthetic */ j f;
            final /* synthetic */ yx1 g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, yx1 yx1) {
                super(1);
                this.f = jVar;
                this.g = yx1;
            }

            public final void a(lu1 lu1) {
                v62.e(lu1, "it");
                this.f.f.p2(this.g);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((lu1) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(lu1 lu1) {
            super(1);
            this.f = lu1;
        }

        public final void a(ve2<lu1> ve2) {
            yx1 yx1;
            v62.e(ve2, "$receiver");
            try {
                yx1 = this.f.c2().b(new zx1(this.f.Z1().t(com.zunjae.anyme.features.firebase.b.MinimumScoreStats.m0int()))).h().a();
            } catch (Exception e) {
                uj2.d(e);
                yx1 = null;
            }
            ow1.a(ve2, new a(this, yx1));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    /* renamed from: lu1$k */
    static final class k extends w62 implements o52<u22> {
        final /* synthetic */ lu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(lu1 lu1) {
            super(0);
            this.f = lu1;
        }

        public final void a() {
            AbstractActivity U1 = this.f.K1();
            if (U1 != null) {
                U1.g0("https://kanonapp.com/account/register");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    /* renamed from: lu1$l */
    static final class l extends w62 implements o52<u22> {
        final /* synthetic */ lu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(lu1 lu1) {
            super(0);
            this.f = lu1;
        }

        public final void a() {
            this.f.i2();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    /* renamed from: lu1$m */
    public static final class m implements OnChartValueSelectedListener {
        m() {
        }

        public void onNothingSelected() {
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
        }
    }

    /* renamed from: lu1$n */
    static final class n implements IAxisValueFormatter {
        final /* synthetic */ List a;

        n(List list) {
            this.a = list;
        }

        public final String getFormattedValue(float f, AxisBase axisBase) {
            return (String) this.a.get((int) f);
        }
    }

    /* renamed from: lu1$o */
    public static final class o implements OnChartValueSelectedListener {
        final /* synthetic */ lu1 a;

        o(lu1 lu1) {
            this.a = lu1;
        }

        public void onNothingSelected() {
        }

        public void onValueSelected(Entry entry, Highlight highlight) {
            if (entry != null) {
                int x = (int) entry.getX();
                GenericItemList.d dVar = GenericItemList.M;
                Context o1 = this.a.o1();
                v62.d(o1, "requireContext()");
                com.zunjae.anyme.features.kanon.generic_anime_list.c cVar = com.zunjae.anyme.features.kanon.generic_anime_list.c.ShowByScore;
                Intent b = GenericItemList.d.b(dVar, o1, cVar, x, "Shows rated at " + x + "/10", (String) null, 16, (Object) null);
                FragmentActivity n = this.a.n();
                if (n != null) {
                    n.startActivity(b);
                }
            }
            BarChart barChart = (BarChart) this.a.Q1(C0275R$id.scoreChart);
            v62.d(barChart, "scoreChart");
            barChart.setSelected(false);
            ((BarChart) this.a.Q1(C0275R$id.scoreChart)).highlightValues((Highlight[]) null);
        }
    }

    /* renamed from: lu1$p */
    static final class p<T> implements u<List<? extends uv1>> {
        final /* synthetic */ lu1 a;
        final /* synthetic */ int b;
        final /* synthetic */ List c;
        final /* synthetic */ IValueFormatter d;

        p(lu1 lu1, int i, List list, IValueFormatter iValueFormatter) {
            this.a = lu1;
            this.b = i;
            this.c = list;
            this.d = iValueFormatter;
        }

        /* renamed from: b */
        public final void a(List<uv1> list) {
            T t;
            T t2;
            String str;
            TextView textView;
            boolean z;
            boolean z2;
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (true) {
                t = null;
                if (i > 10) {
                    break;
                }
                float f = (float) i;
                v62.d(list, "scores");
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((uv1) next).b() == i) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        t = next;
                        break;
                    }
                }
                uv1 uv1 = (uv1) t;
                arrayList.add(new BarEntry(f, uv1 != null ? (float) uv1.a() : Utils.FLOAT_EPSILON));
                i++;
            }
            v62.d(list, "scores");
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it2.next();
                if (((uv1) t2).b() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uv1 uv12 = (uv1) t2;
            if (uv12 != null) {
                t = Integer.valueOf(uv12.a());
            }
            if (t == null || t.intValue() == 0) {
                TextView textView2 = (TextView) this.a.Q1(C0275R$id.labelUnrankedShows);
                v62.d(textView2, "labelUnrankedShows");
                rw1.a(textView2);
            } else {
                if (t.intValue() == 1) {
                    textView = (TextView) this.a.Q1(C0275R$id.labelUnrankedShows);
                    v62.d(textView, "labelUnrankedShows");
                    str = "1 unranked show";
                } else {
                    textView = (TextView) this.a.Q1(C0275R$id.labelUnrankedShows);
                    v62.d(textView, "labelUnrankedShows");
                    str = t + " unranked shows";
                }
                textView.setText(str);
                TextView textView3 = (TextView) this.a.Q1(C0275R$id.labelUnrankedShows);
                v62.d(textView3, "labelUnrankedShows");
                rw1.i(textView3);
            }
            BarDataSet barDataSet = new BarDataSet(arrayList, "Scores");
            barDataSet.setValueTextColor(this.b);
            barDataSet.setValueTextSize(13.0f);
            barDataSet.setGradientColors(this.c);
            barDataSet.setValueFormatter(this.d);
            ((BarChart) this.a.Q1(C0275R$id.scoreChart)).setData(new BarData(barDataSet));
            ((BarChart) this.a.Q1(C0275R$id.scoreChart)).invalidate();
        }
    }

    /* renamed from: lu1$q */
    static final class q implements IValueFormatter {
        public static final q a = new q();

        q() {
        }

        public final String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewPortHandler) {
            return String.valueOf((int) f);
        }
    }

    /* renamed from: lu1$r */
    static final class r extends w62 implements z52<ve2<lu1>, u22> {
        final /* synthetic */ lu1 f;
        final /* synthetic */ yx1 g;

        /* renamed from: lu1$r$a */
        static final class a extends w62 implements z52<lu1, u22> {
            final /* synthetic */ r f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(1);
                this.f = rVar;
            }

            public final void a(lu1 lu1) {
                v62.e(lu1, "it");
                r rVar = this.f;
                yx1 yx1 = rVar.g;
                lu1 lu12 = rVar.f;
                if (yx1 == null) {
                    lu12.j2();
                } else {
                    lu12.l2(yx1);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((lu1) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(lu1 lu1, yx1 yx1) {
            super(1);
            this.f = lu1;
            this.g = yx1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r0 = r0.a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(defpackage.ve2<defpackage.lu1> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "$receiver"
                defpackage.v62.e(r7, r0)
                yx1 r0 = r6.g
                if (r0 == 0) goto L_0x0016
                java.util.List r0 = r0.a()
                if (r0 == 0) goto L_0x0016
                java.lang.Object r0 = defpackage.n32.B(r0)
                cy1 r0 = (defpackage.cy1) r0
                goto L_0x0017
            L_0x0016:
                r0 = 0
            L_0x0017:
                r1 = 0
                if (r0 == 0) goto L_0x001f
                int r2 = r0.c()
                goto L_0x0020
            L_0x001f:
                r2 = 0
            L_0x0020:
                if (r0 == 0) goto L_0x0027
                int r0 = r0.b()
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                lu1 r3 = r6.f     // Catch:{ Exception -> 0x0033 }
                ov1 r3 = r3.Z1()     // Catch:{ Exception -> 0x0033 }
                int r3 = r3.o()     // Catch:{ Exception -> 0x0033 }
                goto L_0x0034
            L_0x0033:
                r3 = 0
            L_0x0034:
                lu1 r4 = r6.f     // Catch:{ Exception -> 0x0040 }
                ov1 r4 = r4.Z1()     // Catch:{ Exception -> 0x0040 }
                r5 = 2
                int r1 = r4.V(r5)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0041
            L_0x0040:
            L_0x0041:
                gy1 r4 = new gy1
                r4.<init>(r3, r2, r0, r1)
                yx1 r0 = r6.g
                if (r0 == 0) goto L_0x004d
                r0.e(r4)
            L_0x004d:
                lu1$r$a r0 = new lu1$r$a
                r0.<init>(r6)
                defpackage.ow1.a(r7, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lu1.r.a(ve2):void");
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    /* access modifiers changed from: private */
    public final ov1 Z1() {
        return (ov1) this.e0.getValue();
    }

    private final nu1 a2() {
        return (nu1) this.d0.getValue();
    }

    private final GridLayoutManager b2(int i2) {
        return new GridLayoutManager(u(), i2, 0, false);
    }

    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.kanon.e c2() {
        return (com.zunjae.anyme.features.kanon.e) this.f0.getValue();
    }

    private final qu1 d2() {
        return (qu1) this.c0.getValue();
    }

    private final void e2() {
        RadarChart radarChart = (RadarChart) Q1(C0275R$id.barChart);
        v62.d(radarChart, "barChart");
        XAxis xAxis = radarChart.getXAxis();
        v62.d(xAxis, "xAxis");
        xAxis.setXOffset(Utils.FLOAT_EPSILON);
        xAxis.setYOffset(Utils.FLOAT_EPSILON);
        xAxis.setTextSize(13.0f);
        xAxis.setTextColor(-1);
        RadarChart radarChart2 = (RadarChart) Q1(C0275R$id.barChart);
        v62.d(radarChart2, "barChart");
        YAxis yAxis = radarChart2.getYAxis();
        v62.d(yAxis, "yAxis");
        yAxis.setAxisMinimum(Utils.FLOAT_EPSILON);
        yAxis.setTextSize(14.0f);
        yAxis.setDrawLabels(false);
        RadarChart radarChart3 = (RadarChart) Q1(C0275R$id.barChart);
        v62.d(radarChart3, "barChart");
        radarChart3.setRotationEnabled(false);
        RadarChart radarChart4 = (RadarChart) Q1(C0275R$id.barChart);
        v62.d(radarChart4, "barChart");
        Legend legend = radarChart4.getLegend();
        v62.d(legend, "barChart.legend");
        legend.setEnabled(false);
        RadarChart radarChart5 = (RadarChart) Q1(C0275R$id.barChart);
        v62.d(radarChart5, "barChart");
        Description description = radarChart5.getDescription();
        v62.d(description, "barChart.description");
        description.setEnabled(false);
        RadarChart radarChart6 = (RadarChart) Q1(C0275R$id.barChart);
        v62.d(radarChart6, "barChart");
        radarChart6.setMinOffset(Utils.FLOAT_EPSILON);
    }

    private final void f2() {
        RecyclerView recyclerView = (RecyclerView) Q1(C0275R$id.recyclerViewUserStats);
        v62.d(recyclerView, "recyclerViewUserStats");
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = (RecyclerView) Q1(C0275R$id.recyclerViewUserStats);
        v62.d(recyclerView2, "recyclerViewUserStats");
        com.afollestad.recyclical.b.a(recyclerView2, new h(this));
    }

    private final void g2() {
        this.h0 = new ju1(new i(this));
        RecyclerView recyclerView = (RecyclerView) Q1(C0275R$id.producerRecyclerView);
        recyclerView.setLayoutManager(b2(1));
        ju1 ju1 = this.h0;
        if (ju1 != null) {
            recyclerView.setAdapter(ju1);
        } else {
            v62.p("producerAdapter");
            throw null;
        }
    }

    private final void h2() {
        if (d2().v() != null) {
            yx1 v = d2().v();
            v62.c(v);
            p2(v);
            return;
        }
        i2();
    }

    /* access modifiers changed from: private */
    public final void i2() {
        fw1.f.j((LinearLayout) Q1(C0275R$id.container));
        we2.c(this, (z52) null, new j(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void j2() {
        LinearLayout linearLayout = (LinearLayout) Q1(C0275R$id.container);
        v62.d(linearLayout, "container");
        rw1.d(linearLayout, "Could not connect to Kanon.", (String) null, new l(this), 2, (Object) null);
    }

    private final void k2(List<dy1> list) {
        if (((RadarChart) Q1(C0275R$id.barChart)) != null && u() != null) {
            ((RadarChart) Q1(C0275R$id.barChart)).clear();
            if (list.size() >= 5) {
                List<T> X = n32.X(list, 5);
                if (!X.isEmpty()) {
                    RadarChart radarChart = (RadarChart) Q1(C0275R$id.barChart);
                    v62.d(radarChart, "barChart");
                    YAxis yAxis = radarChart.getYAxis();
                    RadarChart radarChart2 = (RadarChart) Q1(C0275R$id.barChart);
                    v62.d(radarChart2, "barChart");
                    XAxis xAxis = radarChart2.getXAxis();
                    for (T b2 : X) {
                        b2.b();
                    }
                    ArrayList arrayList = new ArrayList(g32.l(X, 10));
                    for (T a2 : X) {
                        arrayList.add(a2.a());
                    }
                    ArrayList arrayList2 = new ArrayList(g32.l(X, 10));
                    for (T b3 : X) {
                        arrayList2.add(new RadarEntry((float) b3.b()));
                    }
                    yAxis.setLabelCount(X.size(), false);
                    RadarDataSet radarDataSet = new RadarDataSet(arrayList2, "");
                    radarDataSet.setFillColor(androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent));
                    radarDataSet.setFillAlpha(96);
                    radarDataSet.setDrawFilled(true);
                    radarDataSet.setLineWidth(3.0f);
                    ((RadarChart) Q1(C0275R$id.barChart)).setOnChartValueSelectedListener(new m());
                    RadarData radarData = new RadarData(radarDataSet);
                    radarData.setDrawValues(false);
                    xAxis.setValueFormatter(new n(arrayList));
                    RadarChart radarChart3 = (RadarChart) Q1(C0275R$id.barChart);
                    v62.d(radarChart3, "barChart");
                    radarChart3.setData(radarData);
                    ((RadarChart) Q1(C0275R$id.barChart)).invalidate();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void l2(yx1 yx1) {
        if (((TextView) Q1(C0275R$id.userLevel)) != null) {
            d2().Q(yx1);
            n2(yx1);
            k2(yx1.c());
            ju1 ju1 = this.h0;
            String str = null;
            if (ju1 != null) {
                ju1.K(yx1.d());
                if (yx1.b() == null) {
                    CardView cardView = (CardView) Q1(C0275R$id.levelContainer);
                    v62.d(cardView, "levelContainer");
                    rw1.a(cardView);
                } else {
                    CardView cardView2 = (CardView) Q1(C0275R$id.levelContainer);
                    v62.d(cardView2, "levelContainer");
                    rw1.i(cardView2);
                    gy1 b2 = yx1.b();
                    TextView textView = (TextView) Q1(C0275R$id.userLevel);
                    v62.d(textView, "userLevel");
                    textView.setText(b2 != null ? b2.f() : null);
                    TextView textView2 = (TextView) Q1(C0275R$id.userLevelDescription);
                    v62.d(textView2, "userLevelDescription");
                    StringBuilder sb = new StringBuilder();
                    sb.append(b2 != null ? b2.e() : null);
                    sb.append(' ');
                    if (b2 != null) {
                        str = b2.g();
                    }
                    sb.append(str);
                    textView2.setText(sb.toString());
                    ((WaveView) Q1(C0275R$id.waveView)).c();
                }
                LinearLayout linearLayout = (LinearLayout) Q1(C0275R$id.container);
                v62.d(linearLayout, "container");
                rw1.g(linearLayout);
                return;
            }
            v62.p("producerAdapter");
            throw null;
        }
    }

    private final void m2() {
    }

    private final void n2(yx1 yx1) {
        cy1 cy1;
        List<cy1> a2 = yx1.a();
        if (a2 != null && (cy1 = (cy1) n32.z(a2)) != null) {
            ay1[] ay1Arr = new ay1[5];
            ay1Arr[0] = new ay1(by1.Since, cy1.d());
            by1 by1 = by1.Waifus;
            ay1Arr[1] = new ay1(by1, "" + cy1.c());
            by1 by12 = by1.Notes;
            ay1Arr[2] = new ay1(by12, "" + cy1.b());
            by1 by13 = by1.Bookmarks;
            ay1Arr[3] = new ay1(by13, "" + cy1.a());
            by1 by14 = by1.Episodes;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            gy1 b2 = yx1.b();
            sb.append(b2 != null ? Integer.valueOf(b2.d()) : null);
            ay1Arr[4] = new ay1(by14, sb.toString());
            List i2 = f32.i(ay1Arr);
            String i3 = fz1.a.i();
            if (i3 != null) {
                i2.add(new ay1(by1.DaysWasted, f92.q(i3, "Days: ", "", false, 4, (Object) null)));
            }
            a9.a.a(this.g0, i2, (d62) null, (d62) null, 6, (Object) null);
        }
    }

    private final void o2() {
        BarChart barChart = (BarChart) Q1(C0275R$id.scoreChart);
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
        BarChart barChart2 = (BarChart) Q1(C0275R$id.scoreChart);
        v62.d(barChart2, "scoreChart");
        YAxis axisLeft = barChart2.getAxisLeft();
        axisLeft.setXOffset(Utils.FLOAT_EPSILON);
        axisLeft.setYOffset(Utils.FLOAT_EPSILON);
        axisLeft.setTextSize(12.0f);
        axisLeft.setTextColor(-1);
        ((BarChart) Q1(C0275R$id.scoreChart)).setOnChartValueSelectedListener(new o(this));
        BarChart barChart3 = (BarChart) Q1(C0275R$id.scoreChart);
        v62.d(barChart3, "scoreChart");
        XAxis xAxis = barChart3.getXAxis();
        xAxis.setXOffset(Utils.FLOAT_EPSILON);
        xAxis.setYOffset(Utils.FLOAT_EPSILON);
        xAxis.setTextSize(12.0f);
        xAxis.setTextColor(-1);
        xAxis.setLabelCount(11);
        int d2 = androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent);
        a2().F().g(R(), new p(this, androidx.core.content.a.d(o1(), 17170443), e32.b(new GradientColor(d2, androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent))), q.a));
    }

    /* access modifiers changed from: private */
    public final void p2(yx1 yx1) {
        we2.c(this, (z52) null, new r(this, yx1), 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r0 = (java.lang.Integer) r0.getKey();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q2() {
        /*
            r11 = this;
            gy1$a r0 = defpackage.gy1.k
            java.util.Map r0 = r0.a()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0016
            r0 = 0
            goto L_0x004b
        L_0x0016:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            r0 = r1
            goto L_0x004b
        L_0x0022:
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L_0x002f:
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r2 >= r4) goto L_0x0044
            r1 = r3
            r2 = r4
        L_0x0044:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x002f
            goto L_0x0020
        L_0x004b:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r0.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x005c
            int r0 = r0.intValue()
            goto L_0x005e
        L_0x005c:
            r0 = 9999(0x270f, float:1.4012E-41)
        L_0x005e:
            gy1$a r1 = defpackage.gy1.k
            java.util.Map r1 = r1.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0075:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ae
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "< "
            r4.append(r5)
            java.lang.Object r5 = r3.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4.append(r5)
            java.lang.String r5 = ": "
            r4.append(r5)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.add(r3)
            goto L_0x0075
        L_0x00ae:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            java.lang.String r3 = "\n"
            java.lang.String r1 = defpackage.n32.G(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "\n+ "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ": ... Let's not talk about it"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            androidx.fragment.app.FragmentActivity r1 = r11.n()
            if (r1 == 0) goto L_0x00e0
            java.lang.String r2 = "Level Info"
            defpackage.mw1.q(r1, r0, r2)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu1.q2():void");
    }

    public void J1() {
        HashMap hashMap = this.i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void L1(Intent intent) {
    }

    public int M1() {
        return C0279R$menu.menu_stats;
    }

    public int N1() {
        return C0278R$layout.kanon_stats_controller;
    }

    public void O1() {
        q2();
    }

    public void P1(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 2131296319) {
            q2();
            return;
        }
        throw new k22("An operation is not implemented: " + "Not implemented");
    }

    public View Q1(int i2) {
        if (this.i0 == null) {
            this.i0 = new HashMap();
        }
        View view = (View) this.i0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.i0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        AbstractActivity K1 = K1();
        v62.c(K1);
        v62.d(FirebaseAnalytics.getInstance(K1), "FirebaseAnalytics.getInstance(parentActivity!!)");
        RecyclerView recyclerView = (RecyclerView) Q1(C0275R$id.recyclerViewUserStats);
        v62.d(recyclerView, "recyclerViewUserStats");
        recyclerView.setNestedScrollingEnabled(true);
        if (xx1.a.b()) {
            LinearLayout linearLayout = (LinearLayout) Q1(C0275R$id.container);
            v62.d(linearLayout, "container");
            rw1.c(linearLayout, "In order to see stats about your MyAnimeList account you need to be logged in through Kanon", "Login", new k(this));
            return;
        }
        f2();
        e2();
        g2();
        o2();
        m2();
        h2();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
