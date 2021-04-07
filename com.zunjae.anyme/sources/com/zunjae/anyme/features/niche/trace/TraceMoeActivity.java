package com.zunjae.anyme.features.niche.trace;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import defpackage.n9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public final class TraceMoeActivity extends AbstractActivity {
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

    static final class b extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ TraceMoeActivity f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends a, d>, u22> {
            final /* synthetic */ b f;

            /* renamed from: com.zunjae.anyme.features.niche.trace.TraceMoeActivity$b$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0202a extends u62 implements z52<View, d> {
                public static final C0202a n = new C0202a();

                C0202a() {
                    super(1, d.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final d r(View view) {
                    v62.e(view, "p1");
                    return new d(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.niche.trace.TraceMoeActivity$b$a$b  reason: collision with other inner class name */
            static final class C0203b extends w62 implements e62<d, Integer, a, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0203b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(d dVar, int i, a aVar) {
                    v62.e(dVar, "$receiver");
                    v62.e(aVar, "result");
                    com.zunjae.anyme.a.b(this.f.f.f.T()).t(aVar.a()).K0(dVar.N());
                    TextView O = dVar.O();
                    Object c = aVar.c();
                    if (!(c instanceof String)) {
                        c = null;
                    }
                    String str = (String) c;
                    if (str == null) {
                        str = "";
                    }
                    O.setText(str);
                    TextView M = dVar.M();
                    M.setText(com.zunjae.extensions.c.a(aVar.b() + "<br><br><i>Episode " + aVar.e() + "</i>  "));
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((d) obj, ((Number) obj2).intValue(), (a) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends a>, Integer, u22> {
                public static final c f = new c();

                c() {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<a> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                }
            }

            static final class d extends w62 implements e62<r9<? extends a>, Integer, Button, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<a> r9Var, int i, Button button) {
                    v62.e(r9Var, "$receiver");
                    v62.e(button, "<anonymous parameter 1>");
                    TraceMoeActivity traceMoeActivity = this.f.f.f;
                    traceMoeActivity.startActivity(AnimeInfoActivity.M.b(traceMoeActivity.Q(), r9Var.getItem().f()));
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

            public final void a(com.afollestad.recyclical.a<a, d> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0202a.n, new C0203b(this));
                aVar.d(c.f);
                l9.d(aVar).f().add(new n9.a(d.class, b.l, new d(this)));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TraceMoeActivity traceMoeActivity) {
            super(1);
            this.f = traceMoeActivity;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.E);
            cVar.h(new GridLayoutManager(this.f.T(), 1));
            a aVar = new a(this);
            String name = a.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.search_result_trace_item, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class c<T> implements u<com.zunjae.vresult.a<? extends d>> {
        final /* synthetic */ TraceMoeActivity a;

        c(TraceMoeActivity traceMoeActivity) {
            this.a = traceMoeActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<d> aVar) {
            fw1 fw1;
            RecyclerView recyclerView;
            String str;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.h(recyclerView2);
            } else if (aVar instanceof a.e) {
                ((RecyclerView) this.a.l0(C0275R$id.recyclerView)).j1(0);
                List<a> b = ((d) ((a.e) aVar).b()).b();
                ArrayList arrayList = new ArrayList();
                for (T next : b) {
                    if (v62.a(((a) next).d(), Boolean.FALSE)) {
                        arrayList.add(next);
                    }
                }
                a9.a.a(this.a.E, arrayList, (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.g(recyclerView3);
            } else {
                if (aVar instanceof a.d) {
                    fw1 = fw1.f;
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    str = "No results found, try another image";
                } else if (aVar instanceof a.b) {
                    fw1 = fw1.f;
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    str = "Could not reverse image search this image";
                } else {
                    return;
                }
                fw1.k(recyclerView, str);
            }
        }
    }

    public static final class d extends RecyclerView.c0 {
        private final Button A;
        private final ImageView x;
        private final TextView y;
        private final TextView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(2131296693);
            v62.d(findViewById, "itemView.findViewById(R.id.image)");
            this.x = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.name);
            v62.d(findViewById2, "itemView.findViewById(R.id.name)");
            this.y = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0275R$id.description);
            v62.d(findViewById3, "itemView.findViewById(R.id.description)");
            this.z = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0275R$id.visitButton);
            v62.d(findViewById4, "itemView.findViewById(R.id.visitButton)");
            this.A = (Button) findViewById4;
        }

        public final TextView M() {
            return this.z;
        }

        public final ImageView N() {
            return this.x;
        }

        public final TextView O() {
            return this.y;
        }

        public final Button P() {
            return this.A;
        }
    }

    static final class e implements View.OnClickListener {
        final /* synthetic */ TraceMoeActivity e;

        e(TraceMoeActivity traceMoeActivity) {
            this.e = traceMoeActivity;
        }

        public final void onClick(View view) {
            this.e.r0();
        }
    }

    private final nu1 S() {
        return (nu1) this.D.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    private final void q0() {
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new b(this));
        S().J().g(this, new c(this));
    }

    /* access modifiers changed from: private */
    public final void r0() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(intent, "Pick an image"), 123);
    }

    private final void s0() {
        ((FloatingTextButton) l0(C0275R$id.pickImageButton)).setOnClickListener(new e(this));
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
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            Toast makeText = Toast.makeText(this, "Action canceled", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        } else if (i == 123 && intent != null && (data = intent.getData()) != null) {
            v62.d(data, "data?.data ?: return");
            nu1 S = S();
            ContentResolver contentResolver = Q().getContentResolver();
            v62.d(contentResolver, "activity.contentResolver");
            S.h0(data, contentResolver);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_tracemoe);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        s0();
        q0();
        String string = getString(C0283R$string.explanationTraceMoe);
        v62.d(string, "getString(R.string.explanationTraceMoe)");
        fw1.f.k((RecyclerView) l0(C0275R$id.recyclerView), string);
    }
}
