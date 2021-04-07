package com.zunjae.anyme.features.casting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.casting.CastActivity;
import com.zunjae.anyme.features.casting.c;
import defpackage.a9;
import java.util.ArrayList;
import java.util.HashMap;

public final class a extends com.zunjae.anyme.abstracts.b {
    /* access modifiers changed from: private */
    public static String u0 = "TAG_IGNORE_CASTING";
    public static final b v0 = new b((r62) null);
    private String p0;
    private String q0;
    private int r0;
    /* access modifiers changed from: private */
    public a9<c> s0 = b9.a();
    private HashMap t0;

    /* renamed from: com.zunjae.anyme.features.casting.a$a  reason: collision with other inner class name */
    public static final class C0177a extends RecyclerView.c0 {
        private final ImageView x;
        private final TextView y;
        private final TextView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0177a(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(C0275R$id.castImage);
            v62.d(findViewById, "itemView.findViewById(R.id.castImage)");
            this.x = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.castAppName);
            v62.d(findViewById2, "itemView.findViewById(R.id.castAppName)");
            this.y = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0275R$id.castAppNameInstalled);
            v62.d(findViewById3, "itemView.findViewById(R.id.castAppNameInstalled)");
            this.z = (TextView) findViewById3;
        }

        public final TextView M() {
            return this.y;
        }

        public final TextView N() {
            return this.z;
        }

        public final ImageView O() {
            return this.x;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final String a() {
            return a.u0;
        }

        public final a b() {
            return c(a(), "Pick an App", 0);
        }

        public final a c(String str, String str2, int i) {
            v62.e(str, "videoURL");
            v62.e(str2, "videoTitle");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("videoURL", str);
            bundle.putString("videoTitle", str2);
            bundle.putInt("episodeNumber", i);
            u22 u22 = u22.a;
            aVar.u1(bundle);
            return aVar;
        }
    }

    static final class c extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ a f;

        /* renamed from: com.zunjae.anyme.features.casting.a$c$a  reason: collision with other inner class name */
        static final class C0178a extends w62 implements z52<com.afollestad.recyclical.a<? extends c, C0177a>, u22> {
            final /* synthetic */ c f;

            /* renamed from: com.zunjae.anyme.features.casting.a$c$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0179a extends u62 implements z52<View, C0177a> {
                public static final C0179a n = new C0179a();

                C0179a() {
                    super(1, C0177a.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final C0177a r(View view) {
                    v62.e(view, "p1");
                    return new C0177a(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.casting.a$c$a$b */
            static final class b extends w62 implements e62<C0177a, Integer, c, u22> {
                final /* synthetic */ C0178a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0178a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(C0177a aVar, int i, c cVar) {
                    v62.e(aVar, "$receiver");
                    v62.e(cVar, "castApp");
                    com.zunjae.anyme.a.b(this.f.f.f.o1()).I(Integer.valueOf(cVar.getDrawableId())).K0(aVar.O());
                    aVar.M().setText(cVar.getAppName());
                    if (com.zunjae.zapplib.a.c(this.f.f.f.o1(), cVar.getPackageId()) || cVar.isNative()) {
                        rw1.a(aVar.N());
                        return;
                    }
                    aVar.N().setText("(click to install app)");
                    rw1.i(aVar.N());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((C0177a) obj, ((Number) obj2).intValue(), (c) obj3);
                    return u22.a;
                }
            }

            /* renamed from: com.zunjae.anyme.features.casting.a$c$a$c  reason: collision with other inner class name */
            static final class C0180c extends w62 implements d62<r9<? extends c>, Integer, u22> {
                final /* synthetic */ C0178a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0180c(C0178a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<? extends c> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    if (((c) r9Var.getItem()).isNative()) {
                        this.f.f.f.f2((c) r9Var.getItem());
                    } else if (com.zunjae.zapplib.a.c(this.f.f.f.o1(), ((c) r9Var.getItem()).getPackageId())) {
                        this.f.f.f.e2((c) r9Var.getItem());
                    } else {
                        FragmentActivity n = this.f.f.f.n();
                        if (n != null) {
                            mw1.i((AbstractActivity) n, ((c) r9Var.getItem()).getPackageId(), (String) null);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.abstracts.AbstractActivity");
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0178a(c cVar) {
                super(1);
                this.f = cVar;
            }

            public final void a(com.afollestad.recyclical.a<? extends c, C0177a> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0179a.n, new b(this));
                aVar.d(new C0180c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f = aVar;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.s0);
            cVar.h(new LinearLayoutManager(this.f.u()));
            C0178a aVar = new C0178a(this);
            String name = c.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_castapp_list, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* access modifiers changed from: private */
    public final void e2(c cVar) {
        String str = this.p0;
        if (str != null) {
            if (v62.a(str, u0)) {
                L1();
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            String str2 = this.p0;
            if (str2 != null) {
                intent.setDataAndType(Uri.parse(str2), "video/*");
                String str3 = this.q0;
                if (str3 != null) {
                    intent.putExtra("title", str3);
                    intent.setPackage(cVar.getPackageId());
                    if (!com.zunjae.zapplib.a.d(o1(), intent)) {
                        FragmentActivity n = n();
                        if (n != null) {
                            Toast makeText = Toast.makeText(n, "Can not cast using " + cVar.getAppName() + " app. Try again with a different app", 0);
                            makeText.show();
                            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                            return;
                        }
                        return;
                    }
                    CheckBox checkBox = (CheckBox) Z1(C0275R$id.rememberCastingApp);
                    v62.d(checkBox, "rememberCastingApp");
                    if (checkBox.isChecked()) {
                        c.Companion.e(cVar);
                    }
                    E1(intent);
                    L1();
                    return;
                }
                v62.p("videoTitle");
                throw null;
            }
            v62.p("videoURL");
            throw null;
        }
        v62.p("videoURL");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void f2(c cVar) {
        if (b.a[cVar.ordinal()] == 1) {
            CastActivity.a aVar = CastActivity.N;
            Context o1 = o1();
            v62.d(o1, "requireContext()");
            String str = this.q0;
            if (str != null) {
                int i = this.r0;
                String str2 = this.p0;
                if (str2 != null) {
                    E1(aVar.a(o1, str, i, str2));
                } else {
                    v62.p("videoURL");
                    throw null;
                }
            } else {
                v62.p("videoTitle");
                throw null;
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void I0() {
        super.I0();
        RecyclerView recyclerView = (RecyclerView) Z1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new c(this));
        String str = this.p0;
        if (str == null) {
            v62.p("videoURL");
            throw null;
        } else if (v62.a(str, u0)) {
            a9<c> a9Var = this.s0;
            c[] values = c.values();
            ArrayList arrayList = new ArrayList();
            for (c cVar : values) {
                if (!cVar.isNative()) {
                    arrayList.add(cVar);
                }
            }
            a9.a.a(a9Var, arrayList, (d62) null, (d62) null, 6, (Object) null);
        } else {
            a9.a.a(this.s0, c.Companion.a(), (d62) null, (d62) null, 6, (Object) null);
        }
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public void X1() {
        HashMap hashMap = this.t0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View Z1(int i) {
        if (this.t0 == null) {
            this.t0 = new HashMap();
        }
        View view = (View) this.t0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.t0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        String string = n1().getString("videoURL");
        v62.c(string);
        this.p0 = string;
        String string2 = n1().getString("videoTitle");
        v62.c(string2);
        this.q0 = string2;
        this.r0 = n1().getInt("episodeNumber");
        c.a aVar = c.Companion;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        c d = aVar.d(o1);
        if (d != null) {
            CheckBox checkBox = (CheckBox) Z1(C0275R$id.rememberCastingApp);
            v62.d(checkBox, "rememberCastingApp");
            checkBox.setChecked(true);
            e2(d);
        }
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.dialog_cast, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
