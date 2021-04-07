package com.zunjae.anyme.features.download;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.downloader.m;
import defpackage.a9;
import defpackage.n9;
import java.util.HashMap;
import java.util.List;

public final class DownloadManagerActivity extends AbstractActivity {
    public static final b G = new b((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public final a9<com.zunjae.downloader.e> E = b9.a();
    private HashMap F;

    public static final class a extends w62 implements o52<c> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.download.c, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final c invoke() {
            return lg2.b(this.f, f72.b(c.class), this.g, this.h);
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
            return new Intent(context, DownloadManagerActivity.class);
        }
    }

    static final class c<T> implements u<List<? extends com.zunjae.downloader.e>> {
        final /* synthetic */ DownloadManagerActivity a;

        static final class a extends w62 implements d62<com.zunjae.downloader.e, com.zunjae.downloader.e, Boolean> {
            public static final a f = new a();

            a() {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                return Boolean.valueOf(a((com.zunjae.downloader.e) obj, (com.zunjae.downloader.e) obj2));
            }

            public final boolean a(com.zunjae.downloader.e eVar, com.zunjae.downloader.e eVar2) {
                v62.e(eVar, "left");
                v62.e(eVar2, "right");
                return eVar.c() == eVar2.c();
            }
        }

        c(DownloadManagerActivity downloadManagerActivity) {
            this.a = downloadManagerActivity;
        }

        /* renamed from: b */
        public final void a(List<com.zunjae.downloader.e> list) {
            a9 n0 = this.a.E;
            v62.d(list, "downloads");
            a9.a.a(n0, list, a.f, (d62) null, 4, (Object) null);
        }
    }

    static final class d extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ DownloadManagerActivity f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends com.zunjae.downloader.e, b>, u22> {
            final /* synthetic */ d f;

            /* renamed from: com.zunjae.anyme.features.download.DownloadManagerActivity$d$a$a  reason: collision with other inner class name */
            static final class C0189a extends w62 implements z52<com.zunjae.downloader.e, Number> {
                public static final C0189a f = new C0189a();

                C0189a() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(com.zunjae.downloader.e eVar) {
                    v62.e(eVar, "it");
                    return Long.valueOf(eVar.c());
                }
            }

            static final class b extends w62 implements e62<r9<? extends com.zunjae.downloader.e>, Integer, Button, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<com.zunjae.downloader.e> r9Var, int i, Button button) {
                    v62.e(r9Var, "$receiver");
                    v62.e(button, "button");
                    this.f.f.f.p0().h(r9Var.getItem().c());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (Button) obj3);
                    return u22.a;
                }
            }

            static final /* synthetic */ class c extends u62 implements z52<View, b> {
                public static final c n = new c();

                c() {
                    super(1, b.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final b r(View view) {
                    v62.e(view, "p1");
                    return new b(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.download.DownloadManagerActivity$d$a$d  reason: collision with other inner class name */
            static final class C0190d extends w62 implements e62<b, Integer, com.zunjae.downloader.e, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0190d(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(b bVar, int i, com.zunjae.downloader.e eVar) {
                    sy1 a;
                    String w;
                    v62.e(bVar, "$receiver");
                    v62.e(eVar, "fileDownload");
                    com.zunjae.downloader.b a2 = eVar.a();
                    if (a2 != null) {
                        int b = a2.b();
                        TextView R = bVar.R();
                        R.setText("Downloading EP" + b);
                    } else {
                        bVar.R().setText(eVar.d());
                    }
                    com.zunjae.downloader.b a3 = eVar.a();
                    if (a3 != null) {
                        bVar.Q().setText(a3.e());
                    } else {
                        bVar.Q().setText(eVar.h());
                    }
                    TextView O = bVar.O();
                    StringBuilder sb = new StringBuilder();
                    sb.append(eVar.f());
                    sb.append('%');
                    O.setText(sb.toString());
                    if (eVar.e()) {
                        rw1.i(bVar.N());
                    } else {
                        rw1.a(bVar.N());
                    }
                    com.zunjae.downloader.b a4 = eVar.a();
                    if (a4 == null || (a = a4.a()) == null || (w = a.w()) == null || com.zunjae.anyme.a.b(this.f.f.f.T()).t(w).K0(bVar.M()) == null) {
                        com.zunjae.anyme.a.b(this.f.f.f.T()).I(Integer.valueOf(C0274R$drawable.ic_download_unselected)).K0(bVar.M());
                    }
                    bVar.P().setProgress(eVar.b() > 0 ? eVar.f() : 0);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((b) obj, ((Number) obj2).intValue(), (com.zunjae.downloader.e) obj3);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f = dVar;
            }

            public final void a(com.afollestad.recyclical.a<com.zunjae.downloader.e, b> aVar) {
                v62.e(aVar, "$receiver");
                aVar.b(C0189a.f);
                l9.d(aVar).f().add(new n9.a(b.class, a.l, new b(this)));
                aVar.c(c.n, new C0190d(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DownloadManagerActivity downloadManagerActivity) {
            super(1);
            this.f = downloadManagerActivity;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.E);
            cVar.h(new LinearLayoutManager(this.f.T()));
            a aVar = new a(this);
            String name = com.zunjae.downloader.e.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_downloadmanager, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    public static final class e implements TabLayout.d {
        final /* synthetic */ DownloadManagerActivity a;

        e(DownloadManagerActivity downloadManagerActivity) {
            this.a = downloadManagerActivity;
        }

        public void a(TabLayout.g gVar) {
        }

        public void b(TabLayout.g gVar) {
            c o0 = this.a.p0();
            Object obj = null;
            Object h = gVar != null ? gVar.h() : null;
            if (h instanceof m) {
                obj = h;
            }
            m mVar = (m) obj;
            if (mVar == null) {
                mVar = m.Running;
            }
            o0.m(mVar);
        }

        public void c(TabLayout.g gVar) {
        }
    }

    /* access modifiers changed from: private */
    public final c p0() {
        return (c) this.D.getValue();
    }

    private final void q0() {
        p0().i().g(this, new c(this));
    }

    private final void r0() {
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new d(this));
    }

    private final void s0() {
        for (m mVar : m.values()) {
            TabLayout.g x = ((TabLayout) l0(C0275R$id.tabLayout)).x();
            x.r(mVar);
            x.s(mVar.getText());
            v62.d(x, "tabLayout.newTab().apply…ext = status.text\n      }");
            ((TabLayout) l0(C0275R$id.tabLayout)).d(x);
        }
        ((TabLayout) l0(C0275R$id.tabLayout)).c(new e(this));
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
        setContentView((int) C0278R$layout.activity_download_manager);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        r0();
        s0();
        q0();
        p0().n();
    }
}
