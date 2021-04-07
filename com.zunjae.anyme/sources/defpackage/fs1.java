package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.anime.info_screen.d;
import defpackage.a9;
import defpackage.n9;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: fs1  reason: default package */
public final class fs1 extends Fragment {
    public static final d f0 = new d((r62) null);
    private int a0;
    private final d22 b0 = g22.b(new c(this, (oh2) null, new b(this), (o52) null));
    private final d22 c0 = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<bs1> d0 = b9.a();
    private HashMap e0;

    /* renamed from: fs1$a */
    public static final class a extends w62 implements o52<ds1> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [ds1, java.lang.Object] */
        public final ds1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(ds1.class), this.g, this.h);
        }
    }

    /* renamed from: fs1$b */
    public static final class b extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
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

    /* renamed from: fs1$c */
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

    /* renamed from: fs1$d */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(r62 r62) {
            this();
        }

        public final fs1 a(int i) {
            fs1 fs1 = new fs1();
            Bundle bundle = new Bundle();
            bundle.putInt("tabContentType", i);
            u22 u22 = u22.a;
            fs1.u1(bundle);
            return fs1;
        }
    }

    /* renamed from: fs1$e */
    static final class e<T> implements u<List<? extends bs1>> {
        final /* synthetic */ fs1 a;

        e(fs1 fs1) {
            this.a = fs1;
        }

        /* renamed from: b */
        public final void a(List<bs1> list) {
            T t;
            boolean z;
            int size = list != null ? list.size() : 0;
            if (list != null) {
                for (my1 my1 : ez1.a.b()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        Integer num = ((bs1) t).a;
                        int b = my1.b();
                        if (num != null && num.intValue() == b) {
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
                    bs1 bs1 = (bs1) t;
                    if (bs1 != null) {
                        bs1.g = true;
                    }
                }
                a9.a.a(this.a.d0, list, (d62) null, (d62) null, 6, (Object) null);
            }
            fw1 fw1 = fw1.f;
            fs1 fs1 = this.a;
            if (size == 0) {
                fw1.f((RecyclerView) fs1.K1(C0275R$id.recyclerView));
            } else {
                fw1.o((RecyclerView) fs1.K1(C0275R$id.recyclerView));
            }
        }
    }

    /* renamed from: fs1$f */
    static final class f extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ fs1 f;
        final /* synthetic */ List g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ SimpleDateFormat j;

        /* renamed from: fs1$f$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends bs1, g>, u22> {
            final /* synthetic */ f f;

            /* renamed from: fs1$f$a$a  reason: collision with other inner class name */
            static final class C0231a extends w62 implements d62<r9<? extends bs1>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0231a(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<bs1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    FragmentActivity n = this.f.f.f.n();
                    if (n != null) {
                        Integer num = r9Var.getItem().a;
                        v62.d(num, "item.malid");
                        int intValue = num.intValue();
                        String str = r9Var.getItem().e;
                        v62.d(str, "item.title");
                        String str2 = r9Var.getItem().c;
                        v62.d(str2, "item.seriesCover");
                        ((AbstractActivity) n).M(intValue, str, str2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.abstracts.AbstractActivity");
                }
            }

            /* renamed from: fs1$f$a$b */
            static final class b extends w62 implements e62<r9<? extends bs1>, Integer, ImageView, u22> {
                final /* synthetic */ a f;
                final /* synthetic */ c g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar, c cVar) {
                    super(3);
                    this.f = aVar;
                    this.g = cVar;
                }

                public final void a(r9<bs1> r9Var, int i, ImageView imageView) {
                    v62.e(r9Var, "$receiver");
                    v62.e(imageView, "view");
                    if (xx1.a.b()) {
                        this.f.f.f.O1().a((AbstractActivity) this.f.f.f.n());
                        return;
                    }
                    r9Var.getItem().g = !r9Var.getItem().g;
                    if (r9Var.getItem().g) {
                        ds1 L1 = this.f.f.f.O1();
                        Integer num = r9Var.getItem().a;
                        v62.d(num, "item.malid");
                        L1.b(num.intValue(), (cs1) null);
                        List list = this.f.f.g;
                        Integer num2 = r9Var.getItem().a;
                        v62.d(num2, "item.malid");
                        list.add(num2);
                    } else {
                        ds1 L12 = this.f.f.f.O1();
                        Integer num3 = r9Var.getItem().a;
                        v62.d(num3, "item.malid");
                        L12.c(num3.intValue(), (cs1) null);
                        this.f.f.g.remove(r9Var.getItem().a);
                    }
                    this.g.a(r9Var.getItem(), imageView);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (ImageView) obj3);
                    return u22.a;
                }
            }

            /* renamed from: fs1$f$a$c */
            static final class c extends w62 implements d62<bs1, ImageView, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((bs1) obj, (ImageView) obj2);
                    return u22.a;
                }

                public final void a(bs1 bs1, ImageView imageView) {
                    int i;
                    v62.e(bs1, "calendarEntry");
                    v62.e(imageView, "subscribeButton");
                    if (bs1.g || this.f.f.g.contains(bs1.a)) {
                        imageView.setImageResource(C0274R$drawable.notification_active);
                        i = this.f.f.h;
                    } else {
                        imageView.setImageResource(C0274R$drawable.notification_unactive);
                        i = this.f.f.i;
                    }
                    imageView.setColorFilter(i);
                }
            }

            /* renamed from: fs1$f$a$d */
            static final /* synthetic */ class d extends u62 implements z52<View, g> {
                public static final d n = new d();

                d() {
                    super(1, g.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final g r(View view) {
                    v62.e(view, "p1");
                    return new g(view);
                }
            }

            /* renamed from: fs1$f$a$e */
            static final class e extends w62 implements e62<g, Integer, bs1, u22> {
                final /* synthetic */ a f;
                final /* synthetic */ c g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                e(a aVar, c cVar) {
                    super(3);
                    this.f = aVar;
                    this.g = cVar;
                }

                public final void a(g gVar, int i, bs1 bs1) {
                    TextView textView;
                    int i2;
                    v62.e(gVar, "$receiver");
                    v62.e(bs1, "calendar");
                    Date date = new Date(bs1.b * ((long) 1000));
                    TextView N = gVar.N();
                    N.setText("" + this.f.f.j.format(date));
                    TextView O = gVar.O();
                    O.setText("EP" + bs1.f);
                    gVar.P().setText(bs1.e);
                    com.zunjae.anyme.a.d(this.f.f.f.m1()).t(bs1.c).K0(gVar.M());
                    gVar.R().setText(bs1.b());
                    if (bs1.c()) {
                        textView = gVar.R();
                        i2 = this.f.f.h;
                    } else {
                        textView = gVar.R();
                        i2 = this.f.f.i;
                    }
                    textView.setTextColor(i2);
                    this.g.a(bs1, gVar.Q());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((g) obj, ((Number) obj2).intValue(), (bs1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: fs1$f$a$f  reason: collision with other inner class name */
            static final class C0232f extends w62 implements d62<r9<? extends bs1>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0232f(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<bs1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    xy1 xy1 = new xy1((long) r9Var.getItem().a.intValue(), r9Var.getItem().e, r9Var.getItem().c);
                    FragmentActivity n = this.f.f.f.n();
                    if (n != null) {
                        AnimeInfoActivity.e eVar = AnimeInfoActivity.M;
                        FragmentActivity m1 = this.f.f.f.m1();
                        v62.d(m1, "requireActivity()");
                        n.startActivity(eVar.b(m1, xy1));
                    }
                }
            }

            /* renamed from: fs1$f$a$g */
            static final class g extends w62 implements e62<r9<? extends bs1>, Integer, TextView, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                g(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<bs1> r9Var, int i, TextView textView) {
                    v62.e(r9Var, "$receiver");
                    v62.e(textView, "<anonymous parameter 1>");
                    yv1 yv1 = yv1.a;
                    Context o1 = this.f.f.f.o1();
                    v62.d(o1, "requireContext()");
                    String str = r9Var.getItem().e;
                    v62.d(str, "item.title");
                    yv1.b(o1, str);
                    FragmentActivity n = this.f.f.f.n();
                    if (n != null) {
                        Toast makeText = Toast.makeText(n, "Title copied to your clipboard", 0);
                        makeText.show();
                        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                    }
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (TextView) obj3);
                    return u22.a;
                }
            }

            /* renamed from: fs1$f$a$h */
            static final class h extends w62 implements e62<r9<? extends bs1>, Integer, ImageView, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                h(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<bs1> r9Var, int i, ImageView imageView) {
                    v62.e(r9Var, "$receiver");
                    v62.e(imageView, "<anonymous parameter 1>");
                    d.a aVar = com.zunjae.anyme.features.anime.info_screen.d.q0;
                    String str = r9Var.getItem().e;
                    v62.d(str, "item.title");
                    String str2 = r9Var.getItem().c;
                    v62.d(str2, "item.seriesCover");
                    aVar.a(str, str2).W1(this.f.f.f.t(), "Anime_Cover_Preview");
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (ImageView) obj3);
                    return u22.a;
                }
            }

            /* renamed from: fs1$f$a$i */
            static final class i extends w62 implements z52<bs1, Number> {
                public static final i f = new i();

                i() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(bs1 bs1) {
                    v62.e(bs1, "it");
                    Integer num = bs1.a;
                    v62.d(num, "it.malid");
                    return num;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f = fVar;
            }

            public final void a(com.afollestad.recyclical.a<bs1, g> aVar) {
                Class<g> cls = g.class;
                v62.e(aVar, "$receiver");
                c cVar = new c(this);
                aVar.c(d.n, new e(this, cVar));
                aVar.d(new C0232f(this));
                l9.d(aVar).f().add(new n9.a(cls, hs1.l, new g(this)));
                l9.d(aVar).f().add(new n9.a(cls, is1.l, new h(this)));
                aVar.b(i.f);
                aVar.a(new C0231a(this));
                l9.d(aVar).f().add(new n9.a(cls, gs1.l, new b(this, cVar)));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(fs1 fs1, List list, int i2, int i3, SimpleDateFormat simpleDateFormat) {
            super(1);
            this.f = fs1;
            this.g = list;
            this.h = i2;
            this.i = i3;
            this.j = simpleDateFormat;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.d0);
            cVar.h(new GridLayoutManager(this.f.u(), 1));
            a aVar = new a(this);
            String name = bs1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_livechart, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: fs1$g */
    public static final class g extends RecyclerView.c0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final ImageView x;
        private final ImageView y;
        private final TextView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(C0275R$id.animeCoverImage);
            v62.d(findViewById, "itemView.findViewById(R.id.animeCoverImage)");
            this.x = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.subscribeButton);
            v62.d(findViewById2, "itemView.findViewById(R.id.subscribeButton)");
            this.y = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0275R$id.seriesTitle);
            v62.d(findViewById3, "itemView.findViewById(R.id.seriesTitle)");
            this.z = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0275R$id.daysUntil);
            v62.d(findViewById4, "itemView.findViewById(R.id.daysUntil)");
            this.A = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0275R$id.episodeNumber);
            v62.d(findViewById5, "itemView.findViewById(R.id.episodeNumber)");
            this.B = (TextView) findViewById5;
            View findViewById6 = view.findViewById(C0275R$id.trueTimeUntil);
            v62.d(findViewById6, "itemView.findViewById(R.id.trueTimeUntil)");
            this.C = (TextView) findViewById6;
        }

        public final ImageView M() {
            return this.x;
        }

        public final TextView N() {
            return this.A;
        }

        public final TextView O() {
            return this.B;
        }

        public final TextView P() {
            return this.z;
        }

        public final ImageView Q() {
            return this.y;
        }

        public final TextView R() {
            return this.C;
        }
    }

    public fs1() {
        super(C0278R$layout.fragment_anime_calendar);
    }

    private final nu1 N1() {
        return (nu1) this.b0.getValue();
    }

    /* access modifiers changed from: private */
    public final ds1 O1() {
        return (ds1) this.c0.getValue();
    }

    private final void P1() {
        LiveData<List<bs1>> liveData;
        e eVar = new e(this);
        switch (this.a0) {
            case 100:
                liveData = N1().x().d();
                break;
            case 101:
                liveData = N1().x().J();
                break;
            case 102:
                liveData = N1().z(2);
                if (liveData == null) {
                    return;
                }
                break;
            case 103:
                liveData = N1().z(3);
                if (liveData == null) {
                    return;
                }
                break;
            case 104:
                liveData = N1().z(4);
                if (liveData == null) {
                    return;
                }
                break;
            case 105:
                liveData = N1().z(5);
                if (liveData == null) {
                    return;
                }
                break;
            case 106:
                liveData = N1().z(6);
                if (liveData == null) {
                    return;
                }
                break;
            case 107:
                liveData = N1().z(7);
                if (liveData == null) {
                    return;
                }
                break;
            case 108:
                liveData = N1().z(1);
                if (liveData == null) {
                    return;
                }
                break;
            default:
                return;
        }
        liveData.g(R(), eVar);
    }

    @SuppressLint({"SetTextI18n", "SimpleDateFormat"})
    private final void Q1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd HH:mm");
        int d2 = androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent);
        int d3 = androidx.core.content.a.d(o1(), 17170443);
        ArrayList arrayList = new ArrayList();
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new f(this, arrayList, d2, d3, simpleDateFormat));
    }

    public void J1() {
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.e0 == null) {
            this.e0 = new HashMap();
        }
        View view = (View) this.e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.e0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        int i = n1().getInt("tabContentType", 0);
        this.a0 = i;
        if (i > 0) {
            Q1();
            P1();
            return;
        }
        throw new IllegalStateException("Incorrectly set the argument");
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
