package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import defpackage.a9;
import defpackage.lx1;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: kr1  reason: default package */
public final class kr1 extends Fragment {
    public static final e e0 = new e((r62) null);
    /* access modifiers changed from: private */
    public a9<lx1.a> a0 = b9.a();
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private final d22 c0 = g22.b(new d(this, (oh2) null, new c(this), (o52) null));
    private HashMap d0;

    /* renamed from: kr1$a */
    public static final class a extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
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

    /* renamed from: kr1$b */
    public static final class b extends w62 implements o52<nu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    /* renamed from: kr1$c */
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

    /* renamed from: kr1$d */
    public static final class d extends w62 implements o52<gr1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return kg2.a(this.f, f72.b(gr1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: kr1$e */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(r62 r62) {
            this();
        }

        public static /* synthetic */ kr1 b(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = -1;
            }
            return eVar.a(i);
        }

        public final kr1 a(int i) {
            kr1 kr1 = new kr1();
            Bundle bundle = new Bundle();
            bundle.putInt("spanCount", i);
            u22 u22 = u22.a;
            kr1.u1(bundle);
            return kr1;
        }
    }

    /* renamed from: kr1$f */
    static final class f extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ kr1 f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* renamed from: kr1$f$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends lx1.a, mr1>, u22> {
            final /* synthetic */ f f;

            /* renamed from: kr1$f$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0248a extends u62 implements z52<View, mr1> {
                public static final C0248a n = new C0248a();

                C0248a() {
                    super(1, mr1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final mr1 r(View view) {
                    v62.e(view, "p1");
                    return new mr1(view);
                }
            }

            /* renamed from: kr1$f$a$b */
            static final class b extends w62 implements e62<mr1, Integer, lx1.a, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(mr1 mr1, int i, lx1.a aVar) {
                    TextView textView;
                    String str;
                    v62.e(mr1, "$receiver");
                    v62.e(aVar, "song");
                    if (aVar.e() == lx1.b.OPENING) {
                        textView = mr1.N();
                        str = "Opening Theme";
                    } else {
                        textView = mr1.N();
                        str = "Ending Theme";
                    }
                    textView.setText(str);
                    SpannableString spannableString = new SpannableString(aVar.b());
                    ArrayList<Integer> c = aVar.c();
                    if (c != null) {
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f.f.h);
                        Integer num = c.get(0);
                        v62.d(num, "indexes[0]");
                        int intValue = num.intValue();
                        Integer num2 = c.get(1);
                        v62.d(num2, "indexes[1]");
                        spannableString.setSpan(foregroundColorSpan, intValue, num2.intValue(), 33);
                    }
                    mr1.M().setText(spannableString);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((mr1) obj, ((Number) obj2).intValue(), (lx1.a) obj3);
                    return u22.a;
                }
            }

            /* renamed from: kr1$f$a$c */
            static final class c extends w62 implements d62<r9<? extends lx1.a>, Integer, u22> {
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

                public final void a(r9<lx1.a> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(r9Var.getItem().f()));
                    intent.setFlags(268435456);
                    Context u = this.f.f.f.u();
                    if (u != null) {
                        u.startActivity(intent);
                    }
                }
            }

            /* renamed from: kr1$f$a$d */
            static final class d extends w62 implements d62<r9<? extends lx1.a>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<lx1.a> r9Var, int i) {
                    Toast makeText;
                    v62.e(r9Var, "$receiver");
                    String d = r9Var.getItem().d();
                    if (d != null) {
                        yv1 yv1 = yv1.a;
                        Context o1 = this.f.f.f.o1();
                        v62.d(o1, "requireContext()");
                        yv1.b(o1, d);
                        FragmentActivity n = this.f.f.f.n();
                        if (n != null) {
                            makeText = Toast.makeText(n, "Copied '" + d + "' to your clipboard", 0);
                        } else {
                            return;
                        }
                    } else {
                        FragmentActivity n2 = this.f.f.f.n();
                        if (n2 != null) {
                            makeText = Toast.makeText(n2, "Could not find the song title", 0);
                        } else {
                            return;
                        }
                    }
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f = fVar;
            }

            public final void a(com.afollestad.recyclical.a<lx1.a, mr1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0248a.n, new b(this));
                aVar.d(new c(this));
                aVar.a(new d(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(kr1 kr1, int i, int i2) {
            super(1);
            this.f = kr1;
            this.g = i;
            this.h = i2;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = lx1.a.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_music, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: kr1$g */
    static final class g implements View.OnClickListener {
        final /* synthetic */ kr1 e;

        g(kr1 kr1) {
            this.e = kr1;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (!(n instanceof AbstractActivity)) {
                n = null;
            }
            AbstractActivity abstractActivity = (AbstractActivity) n;
            if (abstractActivity != null) {
                abstractActivity.g0(this.e.O1().g().F());
            }
        }
    }

    /* renamed from: kr1$h */
    static final class h<T> implements u<lx1> {
        final /* synthetic */ kr1 a;

        h(kr1 kr1) {
            this.a = kr1;
        }

        /* renamed from: b */
        public final void a(lx1 lx1) {
            ArrayList<lx1.a> c;
            if (lx1 == null || (c = lx1.c()) == null) {
                kr1 kr1 = this.a;
                fw1.f.h((RecyclerView) kr1.K1(C0275R$id.recyclerView), "No songs found for " + kr1.O1().g().y());
                return;
            }
            a9.a.a(this.a.a0, c, (d62) null, (d62) null, 6, (Object) null);
            RecyclerView recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
            v62.d(recyclerView, "recyclerView");
            rw1.g(recyclerView);
        }
    }

    public kr1() {
        super(C0278R$layout.fragment_anime_songs);
    }

    private final nu1 N1() {
        return (nu1) this.b0.getValue();
    }

    /* access modifiers changed from: private */
    public final gr1 O1() {
        return (gr1) this.c0.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    private final void P1() {
        int i;
        int d2 = androidx.core.content.a.d(o1(), C0272R$color.theme_NightBlue_accent);
        Bundle s = s();
        Integer valueOf = s != null ? Integer.valueOf(s.getInt("spanCount")) : null;
        if ((valueOf != null ? valueOf.intValue() : 0) > 0) {
            v62.c(valueOf);
            i = valueOf.intValue();
        } else {
            bw1 bw1 = bw1.a;
            Context o1 = o1();
            v62.d(o1, "requireContext()");
            i = bw1.a(o1, 1, 2, 2, 1);
        }
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new f(this, i, d2));
    }

    public void J1() {
        HashMap hashMap = this.d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.d0 == null) {
            this.d0 = new HashMap();
        }
        View view = (View) this.d0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.d0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        P1();
        ((TextView) K1(C0275R$id.ostButton)).setOnClickListener(new g(this));
        N1().r(O1().g().c()).g(R(), new h(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
