package com.zunjae.anyme;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.multidex.MultiDexApplication;
import androidx.work.c;
import androidx.work.i;
import androidx.work.j;
import com.google.gson.Gson;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.zunjae.anyme.features.vydia.o;
import com.zunjae.anyme.features.vydia.x;
import com.zunjae.anyme.features.workers.AppUpdaterWorker;
import com.zunjae.anyme.features.workers.DynSourceWorker;
import com.zunjae.anyme.features.workers.FRCWorker;
import com.zunjae.anyme.features.workers.NSFWIdsWorker;
import com.zunjae.downloader.k;
import com.zunjae.downloader.n;
import defpackage.mo1;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.e;

public final class AnYmeApp extends MultiDexApplication {

    public static final class a extends lo1 {
        final /* synthetic */ AnYmeApp a;

        a(AnYmeApp anYmeApp) {
            this.a = anYmeApp;
        }

        public Drawable b(Context context, String str) {
            Drawable b;
            String str2;
            tm1 tm1;
            String str3;
            v62.e(context, "ctx");
            if (v62.a(mo1.c.PROFILE.name(), str)) {
                b = no1.c(context);
                str2 = "DrawerUIUtils.getPlaceHolder(ctx)";
            } else {
                if (v62.a(mo1.c.ACCOUNT_HEADER.name(), str)) {
                    tm1 = new tm1(context);
                    tm1.t(" ");
                    tm1.d(2131099890);
                    tm1.E(56);
                    str3 = "IconicsDrawable(ctx).ico…md_black_1000).sizeDp(56)";
                } else if (v62.a("customUrlItem", str)) {
                    tm1 = new tm1(context);
                    tm1.t(" ");
                    tm1.d(2131100145);
                    tm1.E(56);
                    str3 = "IconicsDrawable(ctx).ico…md_white_1000).sizeDp(56)";
                } else {
                    b = super.b(context, str);
                    str2 = "super.placeholder(ctx, tag)";
                }
                v62.d(tm1, str3);
                return tm1;
            }
            v62.d(b, str2);
            return b;
        }

        public void c(ImageView imageView) {
            if (imageView != null) {
                a.b(this.a.getApplicationContext()).l(imageView);
            }
        }

        public void e(ImageView imageView, Uri uri, Drawable drawable) {
            c<Drawable> Z0 = a.b(this.a.getApplicationContext()).H(uri).g(we.c).n(17170443);
            v62.c(imageView);
            Z0.K0(imageView);
        }
    }

    static final class b extends w62 implements z52<ng2, u22> {
        final /* synthetic */ AnYmeApp f;
        final /* synthetic */ lh2 g;
        final /* synthetic */ lh2 h;
        final /* synthetic */ lh2 i;
        final /* synthetic */ lh2 j;
        final /* synthetic */ lh2 k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AnYmeApp anYmeApp, lh2 lh2, lh2 lh22, lh2 lh23, lh2 lh24, lh2 lh25) {
            super(1);
            this.f = anYmeApp;
            this.g = lh2;
            this.h = lh22;
            this.i = lh23;
            this.j = lh24;
            this.k = lh25;
        }

        public final void a(ng2 ng2) {
            v62.e(ng2, "$receiver");
            ig2.a(ng2, this.f);
            ng2.g(f32.h(this.g, this.h, this.i, this.j, this.k));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ng2) obj);
            return u22.a;
        }
    }

    static final class c extends w62 implements z52<lh2, u22> {
        final /* synthetic */ AnYmeApp f;

        static final class a extends w62 implements d62<sh2, mh2, ut1> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final ut1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return tt1.a.a(this.f.f, false);
            }
        }

        static final class b extends w62 implements d62<sh2, mh2, com.zunjae.jikanrest.b> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final com.zunjae.jikanrest.b G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return com.zunjae.jikanrest.a.a.a(this.f.f, false);
            }
        }

        /* renamed from: com.zunjae.anyme.AnYmeApp$c$c  reason: collision with other inner class name */
        static final class C0157c extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.kanon.e> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0157c(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.kanon.e G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return com.zunjae.anyme.features.kanon.d.a.a(this.f.f, false);
            }
        }

        static final class d extends w62 implements d62<sh2, mh2, g02> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final g02 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return h02.n.a(this.f.f, false);
            }
        }

        static final class e extends w62 implements d62<sh2, mh2, a02> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final a02 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return zz1.n.a(this.f.f, false);
            }
        }

        static final class f extends w62 implements d62<sh2, mh2, sz1> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final sz1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return rz1.n.a(this.f.f, false);
            }
        }

        static final class g extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.niche.trace.e> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(c cVar) {
                super(2);
                this.f = cVar;
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.niche.trace.e G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return com.zunjae.anyme.features.niche.trace.c.a.a(this.f.f, false);
            }
        }

        static final class h extends w62 implements d62<sh2, mh2, hy1> {
            public static final h f = new h();

            h() {
                super(2);
            }

            /* renamed from: a */
            public final hy1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new hy1((Gson) sh2.e(f72.b(Gson.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class i extends w62 implements d62<sh2, mh2, or1> {
            public static final i f = new i();

            i() {
                super(2);
            }

            /* renamed from: a */
            public final or1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new or1((Gson) sh2.e(f72.b(Gson.class), (oh2) null, (o52<mh2>) null), (ut1) sh2.e(f72.b(ut1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AnYmeApp anYmeApp) {
            super(1);
            this.f = anYmeApp;
        }

        public final void a(lh2 lh2) {
            v62.e(lh2, "$receiver");
            a aVar = new a(this);
            tg2 tg2 = tg2.a;
            ug2 ug2 = ug2.Single;
            sg2 sg2 = new sg2((oh2) null, (oh2) null, f72.b(ut1.class));
            sg2.n(aVar);
            sg2.o(ug2);
            lh2.a(sg2, new vg2(false, false));
            b bVar = new b(this);
            tg2 tg22 = tg2.a;
            ug2 ug22 = ug2.Single;
            sg2 sg22 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.jikanrest.b.class));
            sg22.n(bVar);
            sg22.o(ug22);
            lh2.a(sg22, new vg2(false, false));
            C0157c cVar = new C0157c(this);
            tg2 tg23 = tg2.a;
            ug2 ug23 = ug2.Single;
            sg2 sg23 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.kanon.e.class));
            sg23.n(cVar);
            sg23.o(ug23);
            lh2.a(sg23, new vg2(false, false));
            d dVar = new d(this);
            tg2 tg24 = tg2.a;
            ug2 ug24 = ug2.Factory;
            sg2 sg24 = new sg2((oh2) null, (oh2) null, f72.b(g02.class));
            sg24.n(dVar);
            sg24.o(ug24);
            lh2.a(sg24, new vg2(false, false, 1, (r62) null));
            e eVar = new e(this);
            tg2 tg25 = tg2.a;
            ug2 ug25 = ug2.Factory;
            sg2 sg25 = new sg2((oh2) null, (oh2) null, f72.b(a02.class));
            sg25.n(eVar);
            sg25.o(ug25);
            lh2.a(sg25, new vg2(false, false, 1, (r62) null));
            f fVar = new f(this);
            tg2 tg26 = tg2.a;
            ug2 ug26 = ug2.Factory;
            sg2 sg26 = new sg2((oh2) null, (oh2) null, f72.b(sz1.class));
            sg26.n(fVar);
            sg26.o(ug26);
            lh2.a(sg26, new vg2(false, false, 1, (r62) null));
            g gVar = new g(this);
            tg2 tg27 = tg2.a;
            ug2 ug27 = ug2.Factory;
            sg2 sg27 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.niche.trace.e.class));
            sg27.n(gVar);
            sg27.o(ug27);
            lh2.a(sg27, new vg2(false, false, 1, (r62) null));
            h hVar = h.f;
            tg2 tg28 = tg2.a;
            ug2 ug28 = ug2.Factory;
            sg2 sg28 = new sg2((oh2) null, (oh2) null, f72.b(hy1.class));
            sg28.n(hVar);
            sg28.o(ug28);
            lh2.a(sg28, new vg2(false, false, 1, (r62) null));
            i iVar = i.f;
            tg2 tg29 = tg2.a;
            ug2 ug29 = ug2.Factory;
            sg2 sg29 = new sg2((oh2) null, (oh2) null, f72.b(or1.class));
            sg29.n(iVar);
            sg29.o(ug29);
            lh2.a(sg29, new vg2(false, false, 1, (r62) null));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((lh2) obj);
            return u22.a;
        }
    }

    static final class d extends w62 implements z52<lh2, u22> {
        final /* synthetic */ AnYmeApp f;

        static final class a extends w62 implements d62<sh2, mh2, ds1> {
            public static final a f = new a();

            a() {
                super(2);
            }

            /* renamed from: a */
            public final ds1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new ds1((com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class b extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.niche.d> {
            public static final b f = new b();

            b() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.niche.d G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                SharedPreferences k = l02.k();
                v62.d(k, "ZimpleDB.getPreferences()");
                return new com.zunjae.anyme.features.niche.d(k);
            }
        }

        static final class c extends w62 implements d62<sh2, mh2, Gson> {
            public static final c f = new c();

            c() {
                super(2);
            }

            /* renamed from: a */
            public final Gson G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new Gson();
            }
        }

        /* renamed from: com.zunjae.anyme.AnYmeApp$d$d  reason: collision with other inner class name */
        static final class C0158d extends w62 implements d62<sh2, mh2, tr1> {
            public static final C0158d f = new C0158d();

            C0158d() {
                super(2);
            }

            /* renamed from: a */
            public final tr1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new tr1();
            }
        }

        static final class e extends w62 implements d62<sh2, mh2, zw1> {
            public static final e f = new e();

            e() {
                super(2);
            }

            /* renamed from: a */
            public final zw1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new zw1();
            }
        }

        static final class f extends w62 implements d62<sh2, mh2, com.zunjae.downloader.f> {
            final /* synthetic */ d f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(d dVar) {
                super(2);
                this.f = dVar;
            }

            /* renamed from: a */
            public final com.zunjae.downloader.f G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new k(this.f.f, (com.zunjae.downloader.g) sh2.e(f72.b(com.zunjae.downloader.g.class), (oh2) null, (o52<mh2>) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AnYmeApp anYmeApp) {
            super(1);
            this.f = anYmeApp;
        }

        public final void a(lh2 lh2) {
            v62.e(lh2, "$receiver");
            a aVar = a.f;
            tg2 tg2 = tg2.a;
            ug2 ug2 = ug2.Factory;
            sg2 sg2 = new sg2((oh2) null, (oh2) null, f72.b(ds1.class));
            sg2.n(aVar);
            sg2.o(ug2);
            lh2.a(sg2, new vg2(false, false, 1, (r62) null));
            b bVar = b.f;
            tg2 tg22 = tg2.a;
            ug2 ug22 = ug2.Single;
            sg2 sg22 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.niche.d.class));
            sg22.n(bVar);
            sg22.o(ug22);
            lh2.a(sg22, new vg2(false, false));
            c cVar = c.f;
            tg2 tg23 = tg2.a;
            ug2 ug23 = ug2.Single;
            sg2 sg23 = new sg2((oh2) null, (oh2) null, f72.b(Gson.class));
            sg23.n(cVar);
            sg23.o(ug23);
            lh2.a(sg23, new vg2(false, false));
            C0158d dVar = C0158d.f;
            tg2 tg24 = tg2.a;
            ug2 ug24 = ug2.Factory;
            sg2 sg24 = new sg2((oh2) null, (oh2) null, f72.b(tr1.class));
            sg24.n(dVar);
            sg24.o(ug24);
            lh2.a(sg24, new vg2(false, false, 1, (r62) null));
            e eVar = e.f;
            tg2 tg25 = tg2.a;
            ug2 ug25 = ug2.Factory;
            sg2 sg25 = new sg2((oh2) null, (oh2) null, f72.b(zw1.class));
            sg25.n(eVar);
            sg25.o(ug25);
            lh2.a(sg25, new vg2(false, false, 1, (r62) null));
            f fVar = new f(this);
            tg2 tg26 = tg2.a;
            ug2 ug26 = ug2.Factory;
            sg2 sg26 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.downloader.f.class));
            sg26.n(fVar);
            sg26.o(ug26);
            lh2.a(sg26, new vg2(false, false, 1, (r62) null));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((lh2) obj);
            return u22.a;
        }
    }

    static final class e extends w62 implements z52<lh2, u22> {
        final /* synthetic */ AnYmeApp f;

        static final class a extends w62 implements d62<sh2, mh2, ov1> {
            final /* synthetic */ e f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(2);
                this.f = eVar;
            }

            /* renamed from: a */
            public final ov1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new ov1(this.f.f);
            }
        }

        static final class b extends w62 implements d62<sh2, mh2, tv1> {
            final /* synthetic */ e f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(e eVar) {
                super(2);
                this.f = eVar;
            }

            /* renamed from: a */
            public final tv1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new tv1(this.f.f, (com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class c extends w62 implements d62<sh2, mh2, rv1> {
            final /* synthetic */ e f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(e eVar) {
                super(2);
                this.f = eVar;
            }

            /* renamed from: a */
            public final rv1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new rv1(this.f.f);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AnYmeApp anYmeApp) {
            super(1);
            this.f = anYmeApp;
        }

        public final void a(lh2 lh2) {
            v62.e(lh2, "$receiver");
            a aVar = new a(this);
            tg2 tg2 = tg2.a;
            ug2 ug2 = ug2.Single;
            sg2 sg2 = new sg2((oh2) null, (oh2) null, f72.b(ov1.class));
            sg2.n(aVar);
            sg2.o(ug2);
            lh2.a(sg2, new vg2(false, false));
            b bVar = new b(this);
            tg2 tg22 = tg2.a;
            ug2 ug22 = ug2.Single;
            sg2 sg22 = new sg2((oh2) null, (oh2) null, f72.b(tv1.class));
            sg22.n(bVar);
            sg22.o(ug22);
            lh2.a(sg22, new vg2(false, false));
            c cVar = new c(this);
            tg2 tg23 = tg2.a;
            ug2 ug23 = ug2.Single;
            sg2 sg23 = new sg2((oh2) null, (oh2) null, f72.b(rv1.class));
            sg23.n(cVar);
            sg23.o(ug23);
            lh2.a(sg23, new vg2(false, false));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((lh2) obj);
            return u22.a;
        }
    }

    static final class f extends w62 implements z52<lh2, u22> {
        final /* synthetic */ AnYmeApp f;

        static final class a extends w62 implements d62<sh2, mh2, o> {
            final /* synthetic */ f f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(2);
                this.f = fVar;
            }

            /* renamed from: a */
            public final o G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new x(this.f.f);
            }
        }

        static final class b extends w62 implements d62<sh2, mh2, com.zunjae.downloader.g> {
            final /* synthetic */ f f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(f fVar) {
                super(2);
                this.f = fVar;
            }

            /* renamed from: a */
            public final com.zunjae.downloader.g G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.downloader.o(this.f.f);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AnYmeApp anYmeApp) {
            super(1);
            this.f = anYmeApp;
        }

        public final void a(lh2 lh2) {
            v62.e(lh2, "$receiver");
            a aVar = new a(this);
            tg2 tg2 = tg2.a;
            ug2 ug2 = ug2.Factory;
            sg2 sg2 = new sg2((oh2) null, (oh2) null, f72.b(o.class));
            sg2.n(aVar);
            sg2.o(ug2);
            lh2.a(sg2, new vg2(false, false, 1, (r62) null));
            b bVar = new b(this);
            tg2 tg22 = tg2.a;
            ug2 ug22 = ug2.Factory;
            sg2 sg22 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.downloader.g.class));
            sg22.n(bVar);
            sg22.o(ug22);
            lh2.a(sg22, new vg2(false, false, 1, (r62) null));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((lh2) obj);
            return u22.a;
        }
    }

    static final class g extends w62 implements z52<lh2, u22> {
        public static final g f = new g();

        static final class a extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.download.c> {
            public static final a f = new a();

            a() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.download.c G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.anyme.features.download.c((com.zunjae.downloader.f) sh2.e(f72.b(com.zunjae.downloader.f.class), (oh2) null, (o52<mh2>) null), (ov1) sh2.e(f72.b(ov1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class b extends w62 implements d62<sh2, mh2, n> {
            public static final b f = new b();

            b() {
                super(2);
            }

            /* renamed from: a */
            public final n G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new n((com.zunjae.downloader.g) sh2.e(f72.b(com.zunjae.downloader.g.class), (oh2) null, (o52<mh2>) null), (com.zunjae.downloader.f) sh2.e(f72.b(com.zunjae.downloader.f.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class c extends w62 implements d62<sh2, mh2, qu1> {
            public static final c f = new c();

            c() {
                super(2);
            }

            /* renamed from: a */
            public final qu1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new qu1((tv1) sh2.e(f72.b(tv1.class), (oh2) null, (o52<mh2>) null), (com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null), (ov1) sh2.e(f72.b(ov1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class d extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.vydia.c> {
            public static final d f = new d();

            d() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.vydia.c G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.anyme.features.vydia.c();
            }
        }

        static final class e extends w62 implements d62<sh2, mh2, nu1> {
            public static final e f = new e();

            e() {
                super(2);
            }

            /* renamed from: a */
            public final nu1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new nu1((ov1) sh2.e(f72.b(ov1.class), (oh2) null, (o52<mh2>) null), (or1) sh2.e(f72.b(or1.class), (oh2) null, (o52<mh2>) null), (com.zunjae.anyme.features.niche.trace.e) sh2.e(f72.b(com.zunjae.anyme.features.niche.trace.e.class), (oh2) null, (o52<mh2>) null), (com.zunjae.jikanrest.b) sh2.e(f72.b(com.zunjae.jikanrest.b.class), (oh2) null, (o52<mh2>) null), (com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class f extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.niche.b> {
            public static final f f = new f();

            f() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.niche.b G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.anyme.features.niche.b((ut1) sh2.e(f72.b(ut1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        /* renamed from: com.zunjae.anyme.AnYmeApp$g$g  reason: collision with other inner class name */
        static final class C0159g extends w62 implements d62<sh2, mh2, ou1> {
            public static final C0159g f = new C0159g();

            C0159g() {
                super(2);
            }

            /* renamed from: a */
            public final ou1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new ou1((rv1) sh2.e(f72.b(rv1.class), (oh2) null, (o52<mh2>) null), (com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null), (or1) sh2.e(f72.b(or1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class h extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.browsers.native_streaming.f> {
            public static final h f = new h();

            h() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.browsers.native_streaming.f G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.anyme.features.browsers.native_streaming.f();
            }
        }

        static final class i extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.browsers.native_streaming.d> {
            public static final i f = new i();

            i() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.browsers.native_streaming.d G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.anyme.features.browsers.native_streaming.d();
            }
        }

        static final class j extends w62 implements d62<sh2, mh2, gr1> {
            public static final j f = new j();

            j() {
                super(2);
            }

            /* renamed from: a */
            public final gr1 G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new gr1((com.zunjae.jikanrest.b) sh2.e(f72.b(com.zunjae.jikanrest.b.class), (oh2) null, (o52<mh2>) null), (com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null), (ov1) sh2.e(f72.b(ov1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        static final class k extends w62 implements d62<sh2, mh2, com.zunjae.anyme.features.discover.advanced_search_v3.b> {
            public static final k f = new k();

            k() {
                super(2);
            }

            /* renamed from: a */
            public final com.zunjae.anyme.features.discover.advanced_search_v3.b G(sh2 sh2, mh2 mh2) {
                v62.e(sh2, "$receiver");
                v62.e(mh2, "it");
                return new com.zunjae.anyme.features.discover.advanced_search_v3.b((com.zunjae.anyme.features.kanon.e) sh2.e(f72.b(com.zunjae.anyme.features.kanon.e.class), (oh2) null, (o52<mh2>) null), (ov1) sh2.e(f72.b(ov1.class), (oh2) null, (o52<mh2>) null));
            }
        }

        g() {
            super(1);
        }

        public final void a(lh2 lh2) {
            v62.e(lh2, "$receiver");
            c cVar = c.f;
            tg2 tg2 = tg2.a;
            ug2 ug2 = ug2.Factory;
            sg2 sg2 = new sg2((oh2) null, (oh2) null, f72.b(qu1.class));
            sg2.n(cVar);
            sg2.o(ug2);
            lh2.a(sg2, new vg2(false, false, 1, (r62) null));
            jg2.a(sg2);
            d dVar = d.f;
            tg2 tg22 = tg2.a;
            ug2 ug22 = ug2.Factory;
            sg2 sg22 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.vydia.c.class));
            sg22.n(dVar);
            sg22.o(ug22);
            lh2.a(sg22, new vg2(false, false, 1, (r62) null));
            jg2.a(sg22);
            e eVar = e.f;
            tg2 tg23 = tg2.a;
            ug2 ug23 = ug2.Factory;
            sg2 sg23 = new sg2((oh2) null, (oh2) null, f72.b(nu1.class));
            sg23.n(eVar);
            sg23.o(ug23);
            lh2.a(sg23, new vg2(false, false, 1, (r62) null));
            jg2.a(sg23);
            f fVar = f.f;
            tg2 tg24 = tg2.a;
            ug2 ug24 = ug2.Factory;
            sg2 sg24 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.niche.b.class));
            sg24.n(fVar);
            sg24.o(ug24);
            lh2.a(sg24, new vg2(false, false, 1, (r62) null));
            jg2.a(sg24);
            C0159g gVar = C0159g.f;
            tg2 tg25 = tg2.a;
            ug2 ug25 = ug2.Factory;
            sg2 sg25 = new sg2((oh2) null, (oh2) null, f72.b(ou1.class));
            sg25.n(gVar);
            sg25.o(ug25);
            lh2.a(sg25, new vg2(false, false, 1, (r62) null));
            jg2.a(sg25);
            h hVar = h.f;
            tg2 tg26 = tg2.a;
            ug2 ug26 = ug2.Factory;
            sg2 sg26 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.browsers.native_streaming.f.class));
            sg26.n(hVar);
            sg26.o(ug26);
            lh2.a(sg26, new vg2(false, false, 1, (r62) null));
            jg2.a(sg26);
            i iVar = i.f;
            tg2 tg27 = tg2.a;
            ug2 ug27 = ug2.Factory;
            sg2 sg27 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.browsers.native_streaming.d.class));
            sg27.n(iVar);
            sg27.o(ug27);
            lh2.a(sg27, new vg2(false, false, 1, (r62) null));
            jg2.a(sg27);
            j jVar = j.f;
            tg2 tg28 = tg2.a;
            ug2 ug28 = ug2.Factory;
            sg2 sg28 = new sg2((oh2) null, (oh2) null, f72.b(gr1.class));
            sg28.n(jVar);
            sg28.o(ug28);
            lh2.a(sg28, new vg2(false, false, 1, (r62) null));
            jg2.a(sg28);
            k kVar = k.f;
            tg2 tg29 = tg2.a;
            ug2 ug29 = ug2.Factory;
            sg2 sg29 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.discover.advanced_search_v3.b.class));
            sg29.n(kVar);
            sg29.o(ug29);
            lh2.a(sg29, new vg2(false, false, 1, (r62) null));
            jg2.a(sg29);
            a aVar = a.f;
            tg2 tg210 = tg2.a;
            ug2 ug210 = ug2.Factory;
            sg2 sg210 = new sg2((oh2) null, (oh2) null, f72.b(com.zunjae.anyme.features.download.c.class));
            sg210.n(aVar);
            sg210.o(ug210);
            lh2.a(sg210, new vg2(false, false, 1, (r62) null));
            jg2.a(sg210);
            b bVar = b.f;
            tg2 tg211 = tg2.a;
            ug2 ug211 = ug2.Factory;
            sg2 sg211 = new sg2((oh2) null, (oh2) null, f72.b(n.class));
            sg211.n(bVar);
            sg211.o(ug211);
            lh2.a(sg211, new vg2(false, false, 1, (r62) null));
            jg2.a(sg211);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((lh2) obj);
            return u22.a;
        }
    }

    private final void a() {
        e.c cVar = io.github.inflationx.viewpump.e.g;
        e.a a2 = cVar.a();
        a2.a(new CalligraphyInterceptor(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/GoogleSans-Bold.ttf").setFontAttrId(2130969069).build()));
        cVar.c(a2.b());
    }

    private final void b() {
        l02.c(getString(C0283R$string.preference_key_link_ads));
    }

    private final void c() {
        mo1.d(new a(this));
    }

    private final void d() {
        c.a aVar = new c.a();
        aVar.b(i.CONNECTED);
        androidx.work.c a2 = aVar.a();
        v62.d(a2, "Constraints.Builder()\n  …NNECTED)\n        .build()");
        j.a aVar2 = new j.a(AppUpdaterWorker.class);
        aVar2.e(a2);
        androidx.work.o b2 = aVar2.b();
        v62.d(b2, "OneTimeWorkRequestBuilde…tworkConstraints).build()");
        j.a aVar3 = new j.a(NSFWIdsWorker.class);
        aVar3.e(a2);
        androidx.work.o b3 = aVar3.b();
        v62.d(b3, "OneTimeWorkRequestBuilde…tworkConstraints).build()");
        j.a aVar4 = new j.a(FRCWorker.class);
        aVar4.e(a2);
        androidx.work.o b4 = aVar4.b();
        v62.d(b4, "OneTimeWorkRequestBuilde…tworkConstraints).build()");
        j.a aVar5 = new j.a(DynSourceWorker.class);
        aVar5.e(a2);
        androidx.work.o b5 = aVar5.b();
        v62.d(b5, "OneTimeWorkRequestBuilde…tworkConstraints).build()");
        androidx.work.n.c().b("BunBakaThot", androidx.work.f.REPLACE, f32.h((j) b2, (j) b3, (j) b4, (j) b5)).a();
    }

    public void onCreate() {
        super.onCreate();
        uj2.g(new uw1());
        l02.n(this);
        b();
        qg2.a(new b(this, wh2.b(false, false, g.f, 3, (Object) null), wh2.b(false, false, new c(this), 3, (Object) null), wh2.b(false, false, new d(this), 3, (Object) null), wh2.b(false, false, new e(this), 3, (Object) null), wh2.b(false, false, new f(this), 3, (Object) null)));
        d();
        a();
        Iconify.with(new FontAwesomeModule());
        com.tripl3dev.prettystates.b.c.c().e();
        com.tripl3dev.prettystates.b a2 = com.tripl3dev.prettystates.b.c.a();
        a2.c(fw1.f.b(), C0278R$layout.state_message);
        a2.c(fw1.f.c(), C0278R$layout.state_error_retry);
        a2.c(fw1.f.d(), C0278R$layout.state_no_anime);
        a2.c(fw1.f.a(), C0278R$layout.state_no_kanon);
        a2.c(fw1.f.e(), C0278R$layout.state_no_mal);
        c();
    }
}
