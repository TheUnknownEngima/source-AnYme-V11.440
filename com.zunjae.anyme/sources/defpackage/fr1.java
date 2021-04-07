package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.c;
import androidx.work.i;
import androidx.work.j;
import androidx.work.m;
import androidx.work.n;
import androidx.work.o;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.kanon.g;
import com.zunjae.anyme.features.workers.DynSourceWorker;
import defpackage.a9;
import defpackage.og2;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: fr1  reason: default package */
public final class fr1 extends com.zunjae.anyme.abstracts.b implements og2 {
    public static final b w0 = new b((r62) null);
    private final d22 p0 = g22.b(new a(m().c(), (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<com.zunjae.dynsourcegen.e> q0 = b9.a();
    /* access modifiers changed from: private */
    public List<com.zunjae.dynsourcegen.e> r0 = f32.f();
    /* access modifiers changed from: private */
    public List<g> s0;
    private boolean t0;
    /* access modifiers changed from: private */
    public int u0;
    private HashMap v0;

    /* renamed from: fr1$a */
    public static final class a extends w62 implements o52<com.zunjae.anyme.features.kanon.e> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.zunjae.anyme.features.kanon.e] */
        public final com.zunjae.anyme.features.kanon.e invoke() {
            return this.f.e(f72.b(com.zunjae.anyme.features.kanon.e.class), this.g, this.h);
        }
    }

    /* renamed from: fr1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final fr1 a(int i, boolean z) {
            fr1 fr1 = new fr1();
            Bundle bundle = new Bundle();
            bundle.putInt("animeId", i);
            bundle.putBoolean("withNSFWSites", z);
            u22 u22 = u22.a;
            fr1.u1(bundle);
            return fr1;
        }
    }

    /* renamed from: fr1$c */
    public static final class c implements ci2<List<? extends g>> {
        final /* synthetic */ fr1 a;

        c(fr1 fr1) {
            this.a = fr1;
        }

        public void a(ai2<List<g>> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
        }

        public void b(ai2<List<g>> ai2, qi2<List<g>> qi2) {
            Object obj;
            boolean z;
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            if (qi2.d()) {
                this.a.s0 = qi2.a();
                for (com.zunjae.dynsourcegen.e eVar : this.a.r0) {
                    List c2 = this.a.s0;
                    int i = 0;
                    if (c2 != null) {
                        Iterator it = c2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((g) obj).b() == eVar.c()) {
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
                        g gVar = (g) obj;
                        if (gVar != null) {
                            i = gVar.a();
                        }
                    }
                    eVar.k(i);
                }
                a9.a.a(this.a.q0, this.a.r0, (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: fr1$d */
    static final class d<T> implements u<m> {
        final /* synthetic */ fr1 a;

        d(fr1 fr1) {
            this.a = fr1;
        }

        /* renamed from: b */
        public final void a(m mVar) {
            if (mVar != null) {
                Button button = (Button) this.a.Z1(C0275R$id.syncSources);
                v62.d(button, "syncSources");
                button.setEnabled(true);
                if (mVar.a() == m.a.SUCCEEDED) {
                    this.a.k2();
                    Button button2 = (Button) this.a.Z1(C0275R$id.syncSources);
                    v62.d(button2, "syncSources");
                    rw1.a(button2);
                }
            }
        }
    }

    /* renamed from: fr1$e */
    static final class e extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ fr1 f;
        final /* synthetic */ com.zunjae.dynsourcegen.e g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;
        final /* synthetic */ int l;

        /* renamed from: fr1$e$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends com.zunjae.dynsourcegen.e, er1>, u22> {
            final /* synthetic */ e f;

            /* renamed from: fr1$e$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0229a extends u62 implements z52<View, er1> {
                public static final C0229a n = new C0229a();

                C0229a() {
                    super(1, er1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final er1 r(View view) {
                    v62.e(view, "p1");
                    return new er1(view);
                }
            }

            /* renamed from: fr1$e$a$b */
            static final class b extends w62 implements e62<er1, Integer, com.zunjae.dynsourcegen.e, u22> {
                final /* synthetic */ a f;

                /* renamed from: fr1$e$a$b$a  reason: collision with other inner class name */
                public static final class C0230a<T> implements Comparator<T> {
                    public final int compare(T t, T t2) {
                        return d42.a((String) t, (String) t2);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(er1 er1, int i, com.zunjae.dynsourcegen.e eVar) {
                    TextView textView;
                    int i2;
                    String str;
                    TextView textView2;
                    StringBuilder sb;
                    int i3;
                    List<T> U;
                    String G;
                    v62.e(er1, "$receiver");
                    v62.e(eVar, "streamingSite");
                    if (this.f.f.g.c() == eVar.c()) {
                        er1.M().setCardBackgroundColor(this.f.f.h);
                        er1.P().setTextColor(this.f.f.i);
                        textView = er1.Q();
                        i2 = this.f.f.i;
                    } else {
                        er1.M().setCardBackgroundColor(this.f.f.j);
                        er1.P().setTextColor(this.f.f.k);
                        textView = er1.Q();
                        i2 = this.f.f.l;
                    }
                    textView.setTextColor(i2);
                    List<String> f2 = eVar.f();
                    if (f2 == null || (U = n32.U(f2, new C0230a())) == null || (G = n32.G(U, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null)) == null) {
                        rw1.a(er1.Q());
                    } else {
                        rw1.i(er1.Q());
                        er1.Q().setText(G);
                    }
                    String a = eVar.a();
                    if (a != null) {
                        er1.N().setText(a);
                        rw1.i(er1.N());
                    } else {
                        rw1.a(er1.N());
                    }
                    er1.P().setText(eVar.g());
                    if (this.f.f.f.s0 != null) {
                        List c2 = this.f.f.f.s0;
                        v62.c(c2);
                        if (!c2.isEmpty()) {
                            rw1.i(er1.O());
                            if (eVar.d() > 0) {
                                List<g> c22 = this.f.f.f.s0;
                                if (c22 != null) {
                                    i3 = 0;
                                    for (g a2 : c22) {
                                        i3 += a2.a();
                                    }
                                } else {
                                    i3 = 1;
                                }
                                int d = (int) ((((float) eVar.d()) / ((float) i3)) * ((float) 100));
                                textView2 = er1.O();
                                if (d < 2) {
                                    sb = new StringBuilder();
                                } else {
                                    str = "Popularity: " + d + '%';
                                    textView2.setText(str);
                                }
                            } else {
                                textView2 = er1.O();
                                sb = new StringBuilder();
                            }
                            sb.append("Popularity: < ");
                            sb.append(2);
                            sb.append('%');
                            str = sb.toString();
                            textView2.setText(str);
                        }
                    }
                    textView2 = er1.O();
                    str = "Popularity: ?";
                    textView2.setText(str);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((er1) obj, ((Number) obj2).intValue(), (com.zunjae.dynsourcegen.e) obj3);
                    return u22.a;
                }
            }

            /* renamed from: fr1$e$a$c */
            static final class c extends w62 implements d62<r9<? extends com.zunjae.dynsourcegen.e>, Integer, u22> {
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

                public final void a(r9<com.zunjae.dynsourcegen.e> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    CheckBox checkBox = (CheckBox) this.f.f.f.Z1(C0275R$id.rememberStreamingApp);
                    v62.d(checkBox, "rememberStreamingApp");
                    if (checkBox.isChecked()) {
                        com.zunjae.dynsourcegen.e.j.n(r9Var.getItem());
                        com.zunjae.dynsourcegen.e.j.m(this.f.f.f.u0);
                    } else {
                        com.zunjae.dynsourcegen.e.j.o(this.f.f.f.u0, r9Var.getItem());
                    }
                    cw1.k.a().i(r9Var.getItem());
                    this.f.f.f.L1();
                }
            }

            /* renamed from: fr1$e$a$d */
            static final class d extends w62 implements z52<com.zunjae.dynsourcegen.e, Number> {
                public static final d f = new d();

                d() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(com.zunjae.dynsourcegen.e eVar) {
                    v62.e(eVar, "it");
                    return Integer.valueOf(eVar.c());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f = eVar;
            }

            public final void a(com.afollestad.recyclical.a<com.zunjae.dynsourcegen.e, er1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0229a.n, new b(this));
                aVar.d(new c(this));
                aVar.b(d.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(fr1 fr1, com.zunjae.dynsourcegen.e eVar, int i2, int i3, int i4, int i5, int i6) {
            super(1);
            this.f = fr1;
            this.g = eVar;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.l = i6;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.q0);
            cVar.h(new LinearLayoutManager(this.f.u()));
            a aVar = new a(this);
            String name = com.zunjae.dynsourcegen.e.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_host_picker, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: fr1$f */
    static final class f implements View.OnClickListener {
        final /* synthetic */ fr1 e;

        f(fr1 fr1) {
            this.e = fr1;
        }

        public final void onClick(View view) {
            this.e.j2();
            Button button = (Button) this.e.Z1(C0275R$id.syncSources);
            v62.d(button, "syncSources");
            button.setEnabled(false);
        }
    }

    private final com.zunjae.anyme.features.kanon.e h2() {
        return (com.zunjae.anyme.features.kanon.e) this.p0.getValue();
    }

    private final void i2() {
        h2().P().Q(new c(this));
    }

    /* access modifiers changed from: private */
    public final void j2() {
        c.a aVar = new c.a();
        aVar.b(i.CONNECTED);
        androidx.work.c a2 = aVar.a();
        v62.d(a2, "Constraints.Builder()\n  …NNECTED)\n        .build()");
        j.a aVar2 = new j.a(DynSourceWorker.class);
        aVar2.e(a2);
        o b2 = aVar2.b();
        v62.d(b2, "OneTimeWorkRequestBuilde…traints)\n        .build()");
        j jVar = (j) b2;
        n.c().b("DynSourceWorker", androidx.work.f.REPLACE, e32.b(jVar)).a();
        n.c().d(jVar.a()).g(R(), new d(this));
    }

    /* access modifiers changed from: private */
    public final void k2() {
        List<com.zunjae.dynsourcegen.e> f2 = this.t0 ? com.zunjae.dynsourcegen.e.j.f() : com.zunjae.dynsourcegen.e.j.g();
        this.r0 = f2;
        a9.a.a(this.q0, f2, (d62) null, (d62) null, 6, (Object) null);
        i2();
        if (this.r0.size() < 3) {
            Button button = (Button) Z1(C0275R$id.syncSources);
            v62.d(button, "syncSources");
            rw1.i(button);
        }
    }

    @SuppressLint({"SetTextI18n"})
    private final void l2() {
        com.zunjae.dynsourcegen.e k = com.zunjae.dynsourcegen.e.j.k(this.u0);
        int d2 = androidx.core.content.a.d(o1(), 2131099728);
        int d3 = androidx.core.content.a.d(o1(), 2131100145);
        int d4 = androidx.core.content.a.d(o1(), C0272R$color.card_background);
        int d5 = androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent);
        int d6 = androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent_3);
        RecyclerView recyclerView = (RecyclerView) Z1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new e(this, k, d2, d3, d4, d5, d6));
        ((Button) Z1(C0275R$id.syncSources)).setOnClickListener(new f(this));
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public void X1() {
        HashMap hashMap = this.v0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View Z1(int i) {
        if (this.v0 == null) {
            this.v0 = new HashMap();
        }
        View view = (View) this.v0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.v0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        this.u0 = n1().getInt("animeId", -10);
        boolean z = n1().getBoolean("withNSFWSites", false);
        this.t0 = z;
        if (z) {
            CheckBox checkBox = (CheckBox) Z1(C0275R$id.rememberStreamingApp);
            v62.d(checkBox, "rememberStreamingApp");
            rw1.a(checkBox);
        }
        l2();
        k2();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.dialog_streaming_site, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
