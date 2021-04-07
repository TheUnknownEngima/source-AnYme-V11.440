package com.zunjae.anyme.features.anime.info_screen;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import berlin.volders.badger.d;
import com.afollestad.materialdialogs.f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.mikepenz.materialdrawer.c;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.download.DownloadManagerActivity;
import com.zunjae.anyme.features.niche.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.aviran.cookiebar2.a;

@SuppressLint({"DefaultLocale"})
public final class AnimeInfoActivity extends AbstractActivity {
    public static final e M = new e((r62) null);
    private final d22 D = g22.b(new b(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new c(this, (oh2) null, (o52) null));
    private final d22 F = g22.b(new a(this, (oh2) null, (o52) null));
    private e G;
    private com.mikepenz.materialdrawer.c H;
    /* access modifiers changed from: private */
    public String I = "";
    /* access modifiers changed from: private */
    public int J;
    private final String K = "https://i.imgur.com/QwSD1Fg.jpg";
    private HashMap L;

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

    public static final class b extends w62 implements o52<gr1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return lg2.b(this.f, f72.b(gr1.class), this.g, this.h);
        }
    }

    public static final class c extends w62 implements o52<com.zunjae.anyme.features.download.c> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.download.c, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final com.zunjae.anyme.features.download.c invoke() {
            return lg2.b(this.f, f72.b(com.zunjae.anyme.features.download.c.class), this.g, this.h);
        }
    }

    public static final class d {
        private final String a;
        private final String b;

        public d(String str, String str2) {
            v62.e(str, "language");
            v62.e(str2, "title");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return v62.a(this.a, dVar.a) && v62.a(this.b, dVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return this.a + ": " + this.b;
        }
    }

    public static final class e {
        private e() {
        }

        public /* synthetic */ e(r62 r62) {
            this();
        }

        public final Intent a(Context context, int i, String str, String str2) {
            v62.e(context, "context");
            v62.e(str2, "imageURL");
            Intent intent = new Intent(context, AnimeInfoActivity.class);
            intent.putExtra("animeId", i);
            if (str == null) {
                str = "";
            }
            intent.putExtra("seriesTitle", str);
            intent.putExtra("imageURL", str2);
            return intent;
        }

        public final Intent b(Context context, xy1 xy1) {
            v62.e(context, "context");
            v62.e(xy1, "minimalAnimeInfo");
            Intent intent = new Intent(context, AnimeInfoActivity.class);
            intent.putExtra("minimalAnimeInfo", xy1);
            return intent;
        }
    }

    public static final class f {
        private final com.zunjae.dynsourcegen.e a;
        private final boolean b;
        private final boolean c;

        public f(com.zunjae.dynsourcegen.e eVar, boolean z, boolean z2) {
            v62.e(eVar, "site");
            this.a = eVar;
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }

        public final com.zunjae.dynsourcegen.e c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return v62.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c;
        }

        public int hashCode() {
            com.zunjae.dynsourcegen.e eVar = this.a;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            boolean z = this.b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "OpenStreamBus(site=" + this.a + ", cast=" + this.b + ", download=" + this.c + ")";
        }
    }

    public static final class g implements com.zunjae.anyme.abstracts.e {
        final /* synthetic */ AnimeInfoActivity a;

        g(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public void a(kv1 kv1) {
            v62.e(kv1, "httpResult");
            AnimeInfoActivity animeInfoActivity = this.a;
            Toast makeText = Toast.makeText(animeInfoActivity, "Deleted " + this.a.E0().g().y() + " from your profile", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            this.a.finish();
        }
    }

    static final class h implements org.aviran.cookiebar2.c {
        final /* synthetic */ AnimeInfoActivity a;
        final /* synthetic */ String b;

        h(AnimeInfoActivity animeInfoActivity, String str) {
            this.a = animeInfoActivity;
            this.b = str;
        }

        public final void a() {
            cw1.k.a().p(new zu1());
            this.a.V().b(this.b);
        }
    }

    static final class i implements f.n {
        final /* synthetic */ AnimeInfoActivity a;

        i(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            AnimeInfoActivity animeInfoActivity = this.a;
            ViewPager viewPager = (ViewPager) animeInfoActivity.l0(C0275R$id.viewPager);
            v62.d(viewPager, "viewPager");
            viewPager.setCurrentItem(0);
            AnimeInfoActivity.r0(animeInfoActivity).x();
        }
    }

    static final class j implements f.n {
        final /* synthetic */ AnimeInfoActivity a;

        j(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.finish();
        }
    }

    static final class k extends w62 implements z52<sw1, u22> {
        final /* synthetic */ AnimeInfoActivity f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(AnimeInfoActivity animeInfoActivity) {
            super(1);
            this.f = animeInfoActivity;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            TabLayout tabLayout = (TabLayout) this.f.l0(C0275R$id.tabLayout);
            v62.d(tabLayout, "tabLayout");
            sw1.c(tabLayout);
            sw1.b(hw1.a.a());
            sw1.a(AnimeInfoActivity.r0(this.f));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    static final class l<T> implements androidx.lifecycle.u<Integer> {
        final /* synthetic */ AnimeInfoActivity a;

        l(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        /* renamed from: b */
        public final void a(Integer num) {
            AnimeInfoActivity animeInfoActivity = this.a;
            v62.d(num, "numberOfDownloads");
            animeInfoActivity.J = num.intValue();
            this.a.invalidateOptionsMenu();
        }
    }

    static final class m<T> implements androidx.lifecycle.u<lx1> {
        final /* synthetic */ AnimeInfoActivity a;

        m(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        /* renamed from: b */
        public final void a(lx1 lx1) {
            String z;
            ImageView imageView = (ImageView) this.a.l0(C0275R$id.animeCoverImage);
            v62.d(imageView, "animeCoverImage");
            if (imageView.getDrawable() == null) {
                String k = lx1.k();
                if (k != null) {
                    this.a.K0(k);
                }
                if (f92.n(this.a.E0().g().y())) {
                    sy1 g = this.a.E0().g();
                    String z2 = lx1.z();
                    if (z2 == null) {
                        z2 = "Anime";
                    }
                    g.a0(z2);
                }
                if ((f92.n(this.a.E0().g().y()) || v62.a(this.a.E0().g().y(), "Anime")) && (z = lx1.z()) != null) {
                    Toolbar toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
                    v62.d(toolbar, "toolbar");
                    toolbar.setTitle((CharSequence) z);
                }
            }
        }
    }

    public static final class n extends nl<Bitmap> {
        final /* synthetic */ AnimeInfoActivity h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(AnimeInfoActivity animeInfoActivity, int i, int i2) {
            super(i, i2);
            this.h = animeInfoActivity;
        }

        public void g(Drawable drawable) {
            AnimeInfoActivity animeInfoActivity = this.h;
            IconCompat e = IconCompat.e(animeInfoActivity.T(), C0274R$drawable.rsz_appicon);
            v62.d(e, "IconCompat.createWithRes…, R.drawable.rsz_appicon)");
            animeInfoActivity.I0(e);
        }

        /* renamed from: k */
        public void e(Bitmap bitmap, ul<? super Bitmap> ulVar) {
            v62.e(bitmap, "resource");
            AnimeInfoActivity animeInfoActivity = this.h;
            IconCompat d = IconCompat.d(bitmap);
            v62.d(d, "IconCompat.createWithBitmap(resource)");
            animeInfoActivity.I0(d);
        }
    }

    public static final class o implements zt1 {
        final /* synthetic */ AnimeInfoActivity a;

        o(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public void a() {
        }

        public void b(String str) {
            v62.e(str, "message");
            Toast makeText = Toast.makeText(this.a, str, 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class p implements View.OnClickListener {
        final /* synthetic */ AnimeInfoActivity e;

        p(AnimeInfoActivity animeInfoActivity) {
            this.e = animeInfoActivity;
        }

        public final void onClick(View view) {
            d.q0.a(this.e.E0().g().y(), this.e.I).W1(this.e.q(), "Anime_Cover_Preview");
        }
    }

    static final class q implements View.OnClickListener {
        final /* synthetic */ AnimeInfoActivity e;

        q(AnimeInfoActivity animeInfoActivity) {
            this.e = animeInfoActivity;
        }

        public final void onClick(View view) {
            this.e.Q0();
        }
    }

    static final class r implements View.OnClickListener {
        final /* synthetic */ AnimeInfoActivity e;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ r f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(0);
                this.f = rVar;
            }

            public final void a() {
                if (com.zunjae.anyme.features.casting.c.Companion.f(this.f.e)) {
                    cw1.k.a().p(new f(com.zunjae.dynsourcegen.e.j.k(this.f.e.E0().g().i()), true, false));
                    return;
                }
                com.zunjae.anyme.features.casting.a.v0.b().W1(this.f.e.q(), "castingstuff");
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        static final class b implements Runnable {
            final /* synthetic */ a e;

            b(a aVar) {
                this.e = aVar;
            }

            public final void run() {
                this.e.a();
            }
        }

        r(AnimeInfoActivity animeInfoActivity) {
            this.e = animeInfoActivity;
        }

        public final void onClick(View view) {
            a aVar = new a(this);
            ViewPager viewPager = (ViewPager) this.e.l0(C0275R$id.viewPager);
            v62.d(viewPager, "viewPager");
            boolean z = false;
            if (viewPager.getCurrentItem() > 0) {
                ViewPager viewPager2 = (ViewPager) this.e.l0(C0275R$id.viewPager);
                v62.d(viewPager2, "viewPager");
                viewPager2.setCurrentItem(0);
                z = true;
            }
            if (z) {
                new Handler().postDelayed(new b(aVar), 500);
            } else {
                aVar.a();
            }
        }
    }

    static final class s implements View.OnClickListener {
        final /* synthetic */ AnimeInfoActivity e;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ s f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(s sVar) {
                super(0);
                this.f = sVar;
            }

            public final void a() {
                cw1.k.a().p(new f(com.zunjae.dynsourcegen.e.j.k(this.f.e.E0().g().i()), false, true));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        static final class b implements Runnable {
            final /* synthetic */ a e;

            b(a aVar) {
                this.e = aVar;
            }

            public final void run() {
                this.e.a();
            }
        }

        s(AnimeInfoActivity animeInfoActivity) {
            this.e = animeInfoActivity;
        }

        public final void onClick(View view) {
            a aVar = new a(this);
            ViewPager viewPager = (ViewPager) this.e.l0(C0275R$id.viewPager);
            v62.d(viewPager, "viewPager");
            boolean z = false;
            if (viewPager.getCurrentItem() > 0) {
                ViewPager viewPager2 = (ViewPager) this.e.l0(C0275R$id.viewPager);
                v62.d(viewPager2, "viewPager");
                viewPager2.setCurrentItem(0);
                z = true;
            }
            if (z) {
                new Handler().postDelayed(new b(aVar), 500);
            } else {
                aVar.a();
            }
        }
    }

    static final class t implements c.a {
        final /* synthetic */ AnimeInfoActivity a;

        t(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public final boolean a(View view, int i, go1<Object, RecyclerView.c0> go1) {
            AnimeInfoActivity animeInfoActivity;
            String str;
            v62.d(go1, "drawerItem");
            switch ((int) go1.c()) {
                case 1:
                    this.a.P0();
                    break;
                case 2:
                    this.a.H0();
                    break;
                case 3:
                    yv1.a.b(this.a.T(), this.a.E0().g().y());
                    animeInfoActivity = this.a;
                    str = "Copied title to your clipboard";
                    break;
                case 4:
                    int i2 = this.a.E0().g().i();
                    com.zunjae.dynsourcegen.e.j.c(i2);
                    jz1.Companion.b(i2);
                    animeInfoActivity = this.a;
                    str = "URLs cleared for " + this.a.E0().g().y();
                    break;
                case 5:
                    MiscSettingsDialog.r0.a(this.a.E0().g().i()).W1(this.a.q(), "MISC_SETTINGS_DIALOG");
                    break;
                case 6:
                    String q = f92.q(this.a.E0().g().y(), " ", "_", false, 4, (Object) null);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", "https://myanimelist.net/anime/" + this.a.E0().g().i() + '/' + q);
                    intent.putExtra("android.intent.extra.SUBJECT", this.a.E0().g().y());
                    this.a.startActivity(Intent.createChooser(intent, "Share this Anime"));
                    break;
                case 7:
                    this.a.Q0();
                    break;
                case 9:
                    this.a.R0();
                    break;
                case 10:
                    AnimeInfoActivity animeInfoActivity2 = this.a;
                    animeInfoActivity2.W(animeInfoActivity2.E0().g().i());
                    break;
            }
            Toast makeText = Toast.makeText(animeInfoActivity, str, 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            return false;
        }
    }

    static final class u implements f.n {
        final /* synthetic */ AnimeInfoActivity a;

        u(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.A0();
        }
    }

    static final class v implements f.i {
        final /* synthetic */ AnimeInfoActivity a;
        final /* synthetic */ List b;

        v(AnimeInfoActivity animeInfoActivity, List list) {
            this.a = animeInfoActivity;
            this.b = list;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            d dVar = (d) this.b.get(i);
            yv1.a.b(this.a, dVar.a());
            AnimeInfoActivity animeInfoActivity = this.a;
            Toast makeText = Toast.makeText(animeInfoActivity, "Copied '" + dVar.a() + "' to your clipboard", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class w implements cs1 {
        final /* synthetic */ AnimeInfoActivity a;

        w(AnimeInfoActivity animeInfoActivity) {
            this.a = animeInfoActivity;
        }

        public final void a(boolean z) {
            Toast makeText = Toast.makeText(this.a, "You'll now receive notifications on new episodes", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    /* access modifiers changed from: private */
    public final void A0() {
        i0(E0().g(), com.zunjae.anyme.abstracts.d.DELETE, new g(this));
    }

    private final xy1 B0() {
        if (getIntent().hasExtra("minimalAnimeInfo")) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("minimalAnimeInfo");
            v62.c(parcelableExtra);
            return (xy1) parcelableExtra;
        }
        int intExtra = getIntent().getIntExtra("animeId", 0);
        String stringExtra = getIntent().getStringExtra("seriesTitle");
        if (stringExtra == null) {
            stringExtra = "Anime";
        }
        v62.d(stringExtra, "intent.getStringExtra(\"seriesTitle\") ?: \"Anime\"");
        String stringExtra2 = getIntent().getStringExtra("seriesImage");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        v62.d(stringExtra2, "intent.getStringExtra(\"seriesImage\") ?: \"\"");
        return new xy1((long) intExtra, stringExtra, stringExtra2);
    }

    private final com.zunjae.anyme.features.download.c D0() {
        return (com.zunjae.anyme.features.download.c) this.E.getValue();
    }

    /* access modifiers changed from: private */
    public final gr1 E0() {
        return (gr1) this.D.getValue();
    }

    private final void F0() {
        if (!V().c("NotifyDefaultSourceClicked2") && V().e("NotifyDefaultSource2", new c.a(3, 3))) {
            try {
                a.b c2 = org.aviran.cookiebar2.a.c(this);
                c2.e("Tip");
                c2.c(false);
                c2.d("Not happy with the current streaming site you are using? The AnYme app currently supports many other streaming sites!");
                c2.b("Pick a different site", new h(this, "NotifyDefaultSourceClicked2"));
                c2.f();
            } catch (Exception e2) {
                uj2.d(e2);
            }
        }
    }

    private final void G0() {
        f.e eVar = new f.e(this);
        eVar.E("Changes not saved");
        eVar.i("You made some changes, do you want to sync them with MyAnimeList?");
        eVar.B("Yes");
        eVar.A(new i(this));
        eVar.w("No");
        eVar.y(new j(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void H0() {
        com.zunjae.anyme.a.b(T()).b().P0(E0().g().w()).U0().H0(new n(this, 128, 128));
    }

    /* access modifiers changed from: private */
    public final void I0(IconCompat iconCompat) {
        yt1.a.a(T(), iconCompat, E0().g(), new o(this));
    }

    private final void J0() {
        com.zunjae.anyme.a.b(T()).t(this.K).K0((ImageView) l0(C0275R$id.backgroundImageAnimePoster));
    }

    /* access modifiers changed from: private */
    public final void K0(String str) {
        this.I = str;
        com.zunjae.anyme.a.d(this).t(str).K0((ImageView) l0(C0275R$id.animeCoverImage));
    }

    private final void L0(String str) {
        com.zunjae.anyme.a.b(T()).t(str).a1(com.zunjae.anyme.a.b(T()).t(this.K)).K0((ImageView) l0(C0275R$id.backgroundImageAnimePoster));
    }

    private final void M0() {
        ((ImageView) l0(C0275R$id.animeCoverImage)).setOnClickListener(new p(this));
        ((ImageView) l0(C0275R$id.dropDownImage)).setOnClickListener(new q(this));
        ((FloatingActionButton) l0(C0275R$id.fabCast)).setOnClickListener(new r(this));
        ((FloatingActionButton) l0(C0275R$id.fabDownload)).setOnClickListener(new s(this));
    }

    private final void N0() {
        com.mikepenz.materialdrawer.d dVar = new com.mikepenz.materialdrawer.d();
        dVar.r(this);
        dVar.s(8388613);
        dVar.v(-1);
        ao1 ao1 = new ao1();
        ao1.a0("Delete Anime");
        ao1 ao12 = ao1;
        ao12.X(C0274R$drawable.baseline_delete_white_24dp);
        ao1 ao13 = ao12;
        ao13.m(1);
        ao1 ao14 = new ao1();
        ao14.a0("Clear Saved URLs");
        ao1 ao15 = ao14;
        ao15.X(C0274R$drawable.baseline_clear_white_24dp);
        ao1 ao16 = ao15;
        ao16.m(4);
        ao1 ao17 = new ao1();
        ao17.a0("Add Shortcut On Homescreen");
        ao1 ao18 = ao17;
        ao18.b0(androidx.core.content.a.d(T(), C0272R$color.theme_NightBlue_accent));
        ao1 ao19 = ao18;
        ao19.X(C0274R$drawable.add_icon);
        ao1 ao110 = ao19;
        ao110.m(2);
        ao1 ao111 = new ao1();
        ao111.a0("Add To Bookmarks");
        ao1 ao112 = ao111;
        ao112.X(C0274R$drawable.outline_bookmarks_white_48dp);
        ao1 ao113 = ao112;
        ao113.m(10);
        ao1 ao114 = new ao1();
        ao114.a0("Copy Title");
        ao1 ao115 = ao114;
        ao115.X(C0274R$drawable.baseline_file_copy_white_24dp);
        ao1 ao116 = ao115;
        ao116.m(3);
        ao1 ao117 = new ao1();
        ao117.a0("Sync Incorrect Episodes");
        ao1 ao118 = ao117;
        ao118.X(C0274R$drawable.baseline_settings_white_48dp);
        ao1 ao119 = ao118;
        ao119.m(5);
        ao1 ao120 = new ao1();
        ao120.a0("Share Anime");
        ao1 ao121 = ao120;
        ao121.X(C0274R$drawable.baseline_share_white_24dp);
        ao1 ao122 = ao121;
        ao122.m(6);
        ao1 ao123 = new ao1();
        ao123.a0("Show Synonyms");
        ao1 ao124 = ao123;
        ao124.X(C0274R$drawable.baseline_text_fields_white_24dp);
        ao1 ao125 = ao124;
        ao125.m(7);
        ao1 ao126 = new ao1();
        ao126.a0("Get Notified for Updates");
        ao1 ao127 = ao126;
        ao127.X(C0274R$drawable.notification_icon);
        ao1 ao128 = ao127;
        ao128.m(9);
        dVar.a(ao13, ao16, new wn1(), ao110, ao113, ao116, ao119, ao122, ao125, ao128);
        dVar.u(new t(this));
        com.mikepenz.materialdrawer.c c2 = dVar.c();
        v62.d(c2, "DrawerBuilder()\n        …       }\n        .build()");
        this.H = c2;
        if (c2 != null) {
            c2.w(0);
            if (xx1.a.b()) {
                com.mikepenz.materialdrawer.c cVar = this.H;
                if (cVar != null) {
                    cVar.p(9);
                } else {
                    v62.p("rightDrawer");
                    throw null;
                }
            }
        } else {
            v62.p("rightDrawer");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void P0() {
        f.e eVar = new f.e(this);
        eVar.E("Are you sure you want to delete this show?");
        eVar.B("Yes");
        eVar.w("No");
        eVar.A(new u(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void Q0() {
        ArrayList<String> x;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d("Original", E0().g().y()));
        yy1 k2 = E0().g().k();
        if (k2 != null) {
            String l2 = k2.l();
            if (l2 != null) {
                arrayList.add(new d("English", l2));
            }
            String n2 = k2.n();
            if (n2 != null) {
                arrayList.add(new d("True Weebanese", n2));
            }
        }
        lx1 d2 = E0().h().d();
        if (!(d2 == null || (x = d2.x()) == null)) {
            int i2 = 0;
            for (T next : x) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList.add(new d("Synonym " + i3, (String) next));
                    i2 = i3;
                } else {
                    d32.k();
                    throw null;
                }
            }
        }
        f.e eVar = new f.e(this);
        eVar.E("Titles");
        eVar.q(arrayList);
        eVar.s(new v(this, arrayList));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void R0() {
        if (xx1.a.b()) {
            C0().a(Q());
            return;
        }
        int i2 = E0().g().i();
        if (ez1.a.a(i2)) {
            C0().c(i2, (cs1) null);
        } else {
            C0().b(i2, new w(this));
        }
    }

    public static final /* synthetic */ e r0(AnimeInfoActivity animeInfoActivity) {
        e eVar = animeInfoActivity.G;
        if (eVar != null) {
            return eVar;
        }
        v62.p("pagerAdapter");
        throw null;
    }

    private final boolean z0() {
        ViewPager viewPager = (ViewPager) l0(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        if (viewPager.getCurrentItem() != 0) {
            ViewPager viewPager2 = (ViewPager) l0(C0275R$id.viewPager);
            v62.d(viewPager2, "viewPager");
            viewPager2.setCurrentItem(0);
            return false;
        }
        e eVar = this.G;
        if (eVar == null) {
            v62.p("pagerAdapter");
            throw null;
        } else if (!eVar.w()) {
            return true;
        } else {
            G0();
            return false;
        }
    }

    public final ds1 C0() {
        return (ds1) this.F.getValue();
    }

    public final boolean O0() {
        return V().e("hint_use_vydia", new c.a(6, 0, 2, (r62) null));
    }

    public View l0(int i2) {
        if (this.L == null) {
            this.L = new HashMap();
        }
        View view = (View) this.L.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.L.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        if (z0()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_anime_info);
        xy1 B0 = B0();
        E0().l(B0);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, E0().g().y(), (String) null, true, 4, (Object) null);
        androidx.fragment.app.k q2 = q();
        v62.d(q2, "supportFragmentManager");
        this.G = new e(q2, (int) E0().g().c());
        ViewPager viewPager = (ViewPager) l0(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new k(this));
        if (!f92.n(E0().g().w())) {
            K0(E0().g().w());
        }
        yy1 k2 = E0().g().k();
        if (k2 != null) {
            L0(k2.c());
        } else {
            J0();
        }
        D0().j((int) B0.a()).g(this, new l(this));
        E0().h().g(this, new m(this));
        M0();
        N0();
        F0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.menu_activity_betteranime, menu);
        MenuItem findItem = menu.findItem(C0275R$id.menu_item_downloader);
        if (this.J > 0) {
            berlin.volders.badger.a a2 = berlin.volders.badger.c.a(findItem, new d.a(T(), berlin.volders.badger.b.b(0.5f, 8388661)));
            v62.d(a2, "Badger.sett<CountBadge>(…dMenuItem, circleFactory)");
            ((berlin.volders.badger.d) a2).f(this.J);
            v62.d(findItem, "downloadMenuItem");
            findItem.setVisible(true);
        } else {
            v62.d(findItem, "downloadMenuItem");
            findItem.setVisible(false);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        switch (menuItem.getItemId()) {
            case 16908332:
                if (z0()) {
                    finish();
                }
                return true;
            case C0275R$id.menu_item_downloader:
                startActivity(DownloadManagerActivity.G.a(this));
                break;
            case C0275R$id.menu_item_hamburger:
                com.mikepenz.materialdrawer.c cVar = this.H;
                if (cVar != null) {
                    cVar.o();
                    break;
                } else {
                    v62.p("rightDrawer");
                    throw null;
                }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        try {
            org.aviran.cookiebar2.a.e(this);
        } catch (Exception e2) {
            uj2.d(e2);
        }
    }
}
