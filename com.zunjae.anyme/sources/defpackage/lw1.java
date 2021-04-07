package defpackage;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.a;
import com.mikepenz.materialdrawer.c;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.browsers.light_browsers.KissAsianBrowser;
import com.zunjae.anyme.features.browsers.nsfw.GenericNSFWBrowser;
import com.zunjae.anyme.features.browsers.sites.BasicWebViewBrowser;
import com.zunjae.anyme.features.discover.advanced_search_v3.AdvancedSearchV3Activity;
import com.zunjae.anyme.features.discover.continue_watching.ContinueWatchingV2;
import com.zunjae.anyme.features.discover.fast_search.FastAnimeSearchActivity;
import com.zunjae.anyme.features.discover.favorites.FavoritesActivity;
import com.zunjae.anyme.features.discover.friends.FriendsActivity;
import com.zunjae.anyme.features.discover.local_search.LocalAnimeSearchActivity;
import com.zunjae.anyme.features.discover.seasonal.SeasonalAnimeActivity;
import com.zunjae.anyme.features.download.DownloadManagerActivity;
import com.zunjae.anyme.features.niche.FAQActivity;
import com.zunjae.anyme.features.niche.bulk_delete.BulkDeleteActivity;
import com.zunjae.anyme.features.niche.donate.SupportActivity;
import com.zunjae.anyme.features.niche.trace.TraceMoeActivity;
import com.zunjae.anyme.features.recommendations.UserRecsActivity;
import com.zunjae.anyme.features.settings.UserSettingsActivity;
import com.zunjae.anyme.features.update.UpdateActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lw1  reason: default package */
public final class lw1 {
    public com.mikepenz.materialdrawer.c a;
    private com.mikepenz.materialdrawer.a b;
    /* access modifiers changed from: private */
    public final AbstractActivity c;
    private final Toolbar d;
    /* access modifiers changed from: private */
    public final kw1 e;

    /* renamed from: lw1$a */
    static final class a implements a.b {
        final /* synthetic */ lw1 a;

        a(lw1 lw1) {
            this.a = lw1;
        }

        public final boolean a(View view, ho1<?> ho1, boolean z) {
            lw1 lw1;
            String k;
            v62.e(ho1, "profile");
            long c = ho1.c();
            if (c == 100) {
                lw1 = this.a;
                k = fz1.a.l();
            } else if (c == 101) {
                lw1 = this.a;
                k = fz1.a.k();
            } else if (c != 102) {
                return false;
            } else {
                this.a.c.startActivity(new Intent(this.a.c, BulkDeleteActivity.class));
                return false;
            }
            lw1.k(k);
            return false;
        }
    }

    /* renamed from: lw1$b */
    static final class b extends w62 implements o52<List<? extends ao1>> {
        public static final b f = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final List<ao1> invoke() {
            List<com.zunjae.dynsourcegen.c> a = com.zunjae.dynsourcegen.c.i.a();
            ArrayList arrayList = new ArrayList(g32.l(a, 10));
            for (com.zunjae.dynsourcegen.c cVar : a) {
                ao1 ao1 = new ao1();
                ao1.a0("Open " + cVar.e());
                ao1 ao12 = ao1;
                ao12.m((long) cVar.d());
                ao1 ao13 = ao12;
                ao13.E(false);
                ao1 ao14 = ao13;
                ao14.Y(FontAwesome.a.faw_video_camera);
                arrayList.add(ao14);
            }
            return arrayList;
        }
    }

    /* renamed from: lw1$c */
    public static final class c implements c.a {
        final /* synthetic */ lw1 a;

        c(lw1 lw1) {
            this.a = lw1;
        }

        public boolean a(View view, int i, go1<?, ?> go1) {
            AbstractActivity a2;
            Intent intent;
            com.zunjae.dynsourcegen.c d;
            v62.e(go1, "drawerItem");
            long c = go1.c();
            List<Item> i2 = go1.i();
            if ((i2 != null ? i2.size() : 0) > 0) {
                uj2.f("Clicked on item with sub items", new Object[0]);
                return false;
            }
            try {
                List<com.zunjae.dynsourcegen.c> a3 = com.zunjae.dynsourcegen.c.i.a();
                ArrayList arrayList = new ArrayList(g32.l(a3, 10));
                for (com.zunjae.dynsourcegen.c d2 : a3) {
                    arrayList.add(Integer.valueOf(d2.d()));
                }
                int i3 = (int) c;
                if (arrayList.contains(Integer.valueOf(i3)) && (d = com.zunjae.dynsourcegen.c.i.d(i3)) != null) {
                    this.a.c.startActivity(GenericNSFWBrowser.V.a(this.a.c, d));
                    return false;
                }
            } catch (Exception e) {
                uj2.d(e);
            }
            if (c == 1337) {
                a2 = this.a.c;
                intent = UpdateActivity.G.a(this.a.c);
            } else {
                if (c == 8) {
                    this.a.c.g0("https://anyme.app/invite");
                } else if (c == 2) {
                    this.a.e.a();
                } else if (c == 12) {
                    mw1.q(this.a.c, "You can find more sites by adding a show to your profile and then clicking on it", "Info");
                } else if (c == 13) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, KissAsianBrowser.class);
                } else if (c == 3) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, FavoritesActivity.class);
                } else if (c == 14) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, UserRecsActivity.class);
                } else if (c == 15) {
                    this.a.c.startActivity(new Intent(this.a.c, ContinueWatchingV2.class));
                    qv1.a.k("ContinueWatching");
                } else if (c == 16) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, SeasonalAnimeActivity.class);
                } else if (c == 17) {
                    this.a.h();
                } else if (c == 26) {
                    a2 = this.a.c;
                    intent = DownloadManagerActivity.G.a(this.a.c);
                } else if (c == 25) {
                    a2 = this.a.c;
                    intent = FriendsActivity.G.a(this.a.c);
                } else if (c == 18) {
                    String string = this.a.c.getResources().getString(C0283R$string.reddit_url);
                    v62.d(string, "activity.resources.getString(R.string.reddit_url)");
                    this.a.c.g0(string);
                } else if (c == 19) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, TraceMoeActivity.class);
                } else if (c == 6) {
                    a2 = this.a.c;
                    intent = FastAnimeSearchActivity.c.b(FastAnimeSearchActivity.J, this.a.c, (String) null, false, 6, (Object) null);
                } else if (c == 24) {
                    a2 = this.a.c;
                    intent = LocalAnimeSearchActivity.I.a(this.a.c, false);
                } else if (c == 20) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, SupportActivity.class);
                } else if (c == 21) {
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, FAQActivity.class);
                } else if (c == 22) {
                    qv1.a.k("AdvancedSearch");
                    a2 = this.a.c;
                    intent = new Intent(this.a.c, AdvancedSearchV3Activity.class);
                } else if (c == 23) {
                    this.a.c.startActivityForResult(new Intent(this.a.c, UserSettingsActivity.class), lv1.f.a());
                }
                return false;
            }
            a2.startActivity(intent);
            return false;
        }
    }

    /* renamed from: lw1$d */
    static final class d extends w62 implements o52<u22> {
        final /* synthetic */ lw1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(lw1 lw1) {
            super(0);
            this.f = lw1;
        }

        public final void a() {
            String string = this.f.c.getResources().getString(C0283R$string.reddit_dm);
            v62.d(string, "activity.resources.getString(R.string.reddit_dm)");
            this.f.c.g0(string);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    public lw1(AbstractActivity abstractActivity, Toolbar toolbar, kw1 kw1) {
        v62.e(abstractActivity, "activity");
        v62.e(toolbar, "toolbar");
        v62.e(kw1, "callBack");
        this.c = abstractActivity;
        this.d = toolbar;
        this.e = kw1;
        f();
        g();
    }

    private final void f() {
        bo1 bo1 = new bo1();
        bo1.U(fz1.a.t());
        bo1.S("https://anyme.app");
        bo1.T(fz1.a.m());
        v62.d(bo1, "ProfileDrawerItem()\n    …mageFromMALUserProfile())");
        co1 co1 = new co1();
        co1.S("Show Profile");
        co1.m(100);
        co1 co12 = co1;
        co12.R(FontAwesome.a.faw_user);
        v62.d(co12, "ProfileSettingDrawerItem…ontAwesome.Icon.faw_user)");
        co1 co13 = new co1();
        co13.S("Show Manga");
        co13.m(101);
        co1 co14 = co13;
        co14.R(FontAwesome.a.faw_book);
        v62.d(co14, "ProfileSettingDrawerItem…ontAwesome.Icon.faw_book)");
        co1 co15 = new co1();
        co15.S("Bulk Delete Anime");
        co15.m(102);
        co1 co16 = co15;
        co16.R(FontAwesome.a.faw_trash);
        v62.d(co16, "ProfileSettingDrawerItem…ntAwesome.Icon.faw_trash)");
        com.mikepenz.materialdrawer.b bVar = new com.mikepenz.materialdrawer.b();
        bVar.q(this.c);
        bVar.r(true);
        bVar.t(C0274R$drawable.gradient_background);
        bVar.s(true);
        bVar.v(false);
        bVar.c(bo1, co12, co14, co16);
        bVar.u(new a(this));
        com.mikepenz.materialdrawer.a d2 = bVar.d();
        v62.d(d2, "AccountHeaderBuilder()\n …       }\n        .build()");
        this.b = d2;
    }

    private final void g() {
        ao1 ao1 = new ao1();
        ao1.a0("App Update Test");
        ao1 ao12 = ao1;
        ao12.X(C0274R$drawable.rsz_appicon);
        ao1 ao13 = ao12;
        ao13.m(1337);
        ao1 ao14 = ao13;
        ao14.E(false);
        ao1 ao15 = ao14;
        ao1 ao16 = new ao1();
        ao16.a0("Random Anime");
        ao1 ao17 = ao16;
        ao17.E(false);
        ao1 ao18 = ao17;
        ao18.g0("From your PTW");
        ao1 ao19 = ao18;
        ao19.m(2);
        ao1 ao110 = ao19;
        ao110.Y(FontAwesome.a.faw_random);
        ao1 ao111 = ao110;
        ao1 ao112 = new ao1();
        ao112.a0("Favorites");
        ao1 ao113 = ao112;
        ao113.E(false);
        ao1 ao114 = ao113;
        ao114.g0("Shows and Waifus");
        ao1 ao115 = ao114;
        ao115.m(3);
        ao1 ao116 = ao115;
        ao116.Y(FontAwesome.a.faw_heart);
        ao1 ao117 = new ao1();
        ao117.a0("Open KissAsian");
        ao1 ao118 = ao117;
        ao118.E(false);
        ao1 ao119 = ao118;
        ao119.m(13);
        ao1 ao120 = ao119;
        ao120.Y(FontAwesome.a.faw_video_camera);
        ao1 ao121 = ao120;
        ao1 ao122 = new ao1();
        ao122.a0("More Sites");
        ao1 ao123 = ao122;
        ao123.m(12);
        ao1 ao124 = ao123;
        ao124.E(false);
        ao1 ao125 = ao124;
        ao125.h0(C0272R$color.theme_NightBlue_accent);
        ao1 ao126 = ao125;
        ao126.c0(C0272R$color.theme_NightBlue_accent);
        ao1 ao127 = ao126;
        ao127.Y(FontAwesome.a.faw_video_camera);
        ao1 ao128 = ao127;
        ao1 ao129 = new ao1();
        ao129.a0("Join Discord Server");
        ao1 ao130 = ao129;
        ao130.g0("Chat With Other People");
        ao1 ao131 = ao130;
        ao131.m(8);
        ao1 ao132 = ao131;
        ao132.E(false);
        ao1 ao133 = ao132;
        ao133.X(C0274R$drawable.discord_icon);
        ao1 ao134 = ao133;
        ao1 ao135 = new ao1();
        ao135.a0("Recommendations");
        ao1 ao136 = ao135;
        ao136.m(14);
        ao1 ao137 = ao136;
        ao137.E(false);
        ao1 ao138 = ao137;
        ao138.Y(FontAwesome.a.faw_thumbs_o_up);
        ao1 ao139 = new ao1();
        ao139.a0("Continue Watching");
        ao1 ao140 = ao139;
        ao140.E(false);
        ao1 ao141 = ao140;
        ao141.m(15);
        ao1 ao142 = ao141;
        ao142.Y(FontAwesome.a.faw_arrow_right);
        ao1 ao143 = ao142;
        ao1 ao144 = new ao1();
        ao144.a0("Settings");
        ao1 ao145 = ao144;
        ao145.E(false);
        ao1 ao146 = ao145;
        ao146.m(23);
        ao1 ao147 = ao146;
        ao147.Y(FontAwesome.a.faw_cog);
        ao1 ao148 = new ao1();
        ao148.a0("Advanced Anime Search");
        ao1 ao149 = ao148;
        ao149.Y(FontAwesome.a.faw_tags);
        ao1 ao150 = ao149;
        ao150.m(22);
        ao1 ao151 = ao150;
        ao151.E(false);
        ao1 ao152 = ao151;
        ao1 ao153 = new ao1();
        ao153.a0("Seasonal Anime");
        ao1 ao154 = ao153;
        ao154.m(16);
        ao1 ao155 = ao154;
        ao155.Y(FontAwesome.a.faw_calendar);
        ao1 ao156 = ao155;
        ao156.E(false);
        ao1 ao157 = new ao1();
        ao157.a0("Help");
        ao1 ao158 = ao157;
        ao158.Y(FontAwesome.a.faw_book);
        ao1 ao159 = ao158;
        ao159.m(21);
        ao1 ao160 = ao159;
        ao160.c0(C0272R$color.theme_NightBlue_accent);
        ao1 ao161 = ao160;
        ao161.E(false);
        ao1 ao162 = new ao1();
        ao162.a0("Donate");
        ao1 ao163 = ao162;
        ao163.Y(FontAwesome.a.faw_money);
        ao1 ao164 = ao163;
        ao164.m(20);
        ao1 ao165 = ao164;
        ao165.c0(C0272R$color.theme_NightBlue_accent);
        ao1 ao166 = ao165;
        ao166.E(false);
        ao1 ao167 = new ao1();
        ao167.a0("Anime Search");
        ao1 ao168 = ao167;
        ao168.m(6);
        ao1 ao169 = ao168;
        ao169.Y(FontAwesome.a.faw_search);
        ao1 ao170 = ao169;
        ao170.E(false);
        ao1 ao171 = ao170;
        ao1 ao172 = new ao1();
        ao172.a0("Filter my Shows");
        ao1 ao173 = ao172;
        ao1 ao174 = ao116;
        ao173.m(24);
        ao1 ao175 = ao173;
        ao175.Y(FontAwesome.a.faw_filter);
        ao1 ao176 = ao175;
        ao176.E(false);
        ao1 ao177 = ao176;
        ao1 ao178 = new ao1();
        ao178.a0("Reverse Image Search");
        ao1 ao179 = ao178;
        ao179.X(C0274R$drawable.image);
        ao1 ao180 = ao179;
        ao1 ao181 = ao138;
        ao180.m(19);
        ao1 ao182 = ao180;
        ao182.E(false);
        ao1 ao183 = ao182;
        ao1 ao184 = new ao1();
        ao184.a0("Friends");
        ao1 ao185 = ao184;
        ao185.Y(FontAwesome.a.faw_address_book);
        ao1 ao186 = ao185;
        ao1 ao187 = ao166;
        ao186.m(25);
        ao1 ao188 = ao186;
        ao188.E(false);
        ao1 ao189 = new ao1();
        ao189.a0("Download Manager");
        ao1 ao190 = ao189;
        ao190.Y(FontAwesome.a.faw_download);
        ao1 ao191 = ao190;
        ao1 ao192 = ao188;
        ao191.m(26);
        ao1 ao193 = ao191;
        ao193.E(false);
        ao1 ao194 = ao193;
        ao1 ao195 = new ao1();
        ao195.a0("Leave Feedback on Reddit");
        ao1 ao196 = ao195;
        ao196.g0("And help improve the App!");
        ao1 ao197 = ao196;
        ao1 ao198 = ao156;
        ao1 ao199 = ao161;
        ao197.m(18);
        ao1 ao1100 = ao197;
        ao1100.Y(FontAwesome.a.faw_reddit_alien);
        ao1 ao1101 = ao1100;
        ao1101.E(false);
        ao1 ao1102 = new ao1();
        ao1102.a0("Message me on Reddit");
        ao1 ao1103 = ao1102;
        ao1 ao1104 = ao1101;
        ao1103.m(17);
        ao1 ao1105 = ao1103;
        ao1105.Y(FontAwesome.a.faw_envelope_o);
        ao1 ao1106 = ao1105;
        ao1106.E(false);
        ao1 ao1107 = ao1106;
        b bVar = b.f;
        com.mikepenz.materialdrawer.d dVar = new com.mikepenz.materialdrawer.d();
        ao1 ao1108 = ao147;
        dVar.r(this.c);
        dVar.x(false);
        dVar.w(this.d);
        com.mikepenz.materialdrawer.a aVar = this.b;
        if (aVar != null) {
            dVar.p(aVar);
            xn1 xn1 = new xn1();
            xn1.a0("NSFW");
            xn1 xn12 = xn1;
            xn12.Y(FontAwesome.a.faw_play_circle);
            xn1 xn13 = xn12;
            xn13.m(7);
            xn1 xn14 = xn13;
            xn14.E(false);
            xn1 xn15 = xn14;
            xn15.G(bVar.invoke());
            dVar.a(ao134, ao194, xn15, new wn1(), ao174, ao111, ao181, ao143, new wn1(), ao171, ao177, ao152, ao198, new wn1(), ao192, ao183, new wn1(), ao199, ao187, ao1107, ao1104);
            dVar.b(ao1108);
            dVar.u(new c(this));
            com.mikepenz.materialdrawer.c c2 = dVar.c();
            v62.d(c2, "DrawerBuilder()\n        …      })\n        .build()");
            this.a = c2;
            if (qv1.a.x(this.c)) {
                com.mikepenz.materialdrawer.c cVar = this.a;
                if (cVar != null) {
                    cVar.p(7);
                } else {
                    v62.p("drawer");
                    throw null;
                }
            }
            if (xu1.i.r()) {
                com.mikepenz.materialdrawer.c cVar2 = this.a;
                if (cVar2 != null) {
                    cVar2.p(8);
                } else {
                    v62.p("drawer");
                    throw null;
                }
            }
            com.mikepenz.materialdrawer.c cVar3 = this.a;
            if (cVar3 != null) {
                cVar3.w(0);
            } else {
                v62.p("drawer");
                throw null;
            }
        } else {
            v62.p("headerResult");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        mw1.b(this.c, "Notice", "Before sending a message, please check out the /r/AnYme subreddit and read the #help and #announcement channel on Discord", "Okay!", new d(this)).show();
    }

    /* access modifiers changed from: private */
    public final void k(String str) {
        this.c.startActivity(BasicWebViewBrowser.S.a(this.c, str));
    }

    public final com.mikepenz.materialdrawer.c e() {
        com.mikepenz.materialdrawer.c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        v62.p("drawer");
        throw null;
    }

    public final void i(int i) {
        ln1 ln1 = new ln1("" + i);
        com.mikepenz.materialdrawer.c cVar = this.a;
        if (cVar != null) {
            cVar.B(3, ln1);
        } else {
            v62.p("drawer");
            throw null;
        }
    }

    public final void j(int i) {
        ln1 ln1 = new ln1("" + i);
        com.mikepenz.materialdrawer.c cVar = this.a;
        if (cVar != null) {
            cVar.B(2, ln1);
        } else {
            v62.p("drawer");
            throw null;
        }
    }
}
