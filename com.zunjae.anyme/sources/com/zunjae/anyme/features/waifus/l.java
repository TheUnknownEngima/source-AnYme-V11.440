package com.zunjae.anyme.features.waifus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.browsers.sites.BasicWebViewBrowser;
import java.util.ArrayList;
import java.util.Arrays;

public final class l {
    public static final l a = new l();

    public interface a {
        void a();
    }

    static final class b implements f.i {
        final /* synthetic */ ArrayList a;
        final /* synthetic */ String b;
        final /* synthetic */ AbstractActivity c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ int f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;
        final /* synthetic */ String j;
        final /* synthetic */ String k;
        final /* synthetic */ String l;
        final /* synthetic */ String m;
        final /* synthetic */ String n;
        final /* synthetic */ String o;
        final /* synthetic */ a p;

        b(ArrayList arrayList, String str, AbstractActivity abstractActivity, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, a aVar) {
            this.a = arrayList;
            this.b = str;
            this.c = abstractActivity;
            this.d = str2;
            this.e = str3;
            this.f = i2;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = str8;
            this.l = str9;
            this.m = str10;
            this.n = str11;
            this.o = str12;
            this.p = aVar;
        }

        public final void a(f fVar, View view, int i2, CharSequence charSequence) {
            a aVar;
            Intent a2;
            AbstractActivity abstractActivity;
            AbstractActivity abstractActivity2;
            String format;
            String str = (String) this.a.get(i2);
            if (v62.a(str, this.b)) {
                AbstractActivity abstractActivity3 = this.c;
                abstractActivity3.startActivity(BasicWebViewBrowser.S.a(abstractActivity3, this.d));
                return;
            }
            if (v62.a(str, this.e)) {
                xy1 xy1 = new xy1((long) this.f, this.g, "");
                abstractActivity = this.c;
                a2 = AnimeInfoActivity.M.b(abstractActivity, xy1);
            } else {
                if (v62.a(str, this.h)) {
                    abstractActivity2 = this.c;
                    h72 h72 = h72.a;
                    format = String.format("https://www.google.com/search?q=%s+%s", Arrays.copyOf(new Object[]{this.i, this.g}, 2));
                } else if (v62.a(str, this.j)) {
                    abstractActivity2 = this.c;
                    h72 h722 = h72.a;
                    format = String.format("https://www.google.com/search?q=%s+%s&dcr=0&source=lnms&tbm=isch", Arrays.copyOf(new Object[]{this.i, this.g}, 2));
                } else if (v62.a(str, this.k)) {
                    abstractActivity2 = this.c;
                    h72 h723 = h72.a;
                    format = String.format("https://www.google.com/search?q=%s+cosplay&source=lnms&tbm=isch", Arrays.copyOf(new Object[]{this.i}, 1));
                } else if (v62.a(str, this.l)) {
                    abstractActivity2 = this.c;
                    h72 h724 = h72.a;
                    format = String.format("https://www.google.com/search?q=%s+wallpaper&tbm=isch&source=lnt&tbs=isz:lt,islt:2mp", Arrays.copyOf(new Object[]{this.i}, 1));
                } else if (v62.a(str, this.m)) {
                    abstractActivity2 = this.c;
                    h72 h725 = h72.a;
                    format = String.format("https://www.youtube.com/results?search_query=%s+%s", Arrays.copyOf(new Object[]{this.i, this.g}, 2));
                } else if (v62.a(str, this.n)) {
                    a2 = BasicWebViewBrowser.S.a(this.c, "https://nhentai.net/search/?q=" + this.i);
                    abstractActivity = this.c;
                } else if (v62.a(str, this.o) && (aVar = this.p) != null) {
                    aVar.a();
                    return;
                } else {
                    return;
                }
                v62.d(format, "java.lang.String.format(format, *args)");
                abstractActivity2.g0(format);
                return;
            }
            abstractActivity.startActivity(a2);
        }
    }

    private l() {
    }

    public final void a(Activity activity, String str) {
        v62.e(activity, "activity");
        v62.e(str, "normalName");
        yv1.a.b(activity, str);
        Toast makeText = Toast.makeText(activity, "Name copied to your clipboard", 0);
        makeText.show();
        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
    }

    public final void b(AbstractActivity abstractActivity, String str, String str2, int i, int i2, a aVar) {
        AbstractActivity abstractActivity2 = abstractActivity;
        String str3 = str;
        v62.e(abstractActivity2, "activity");
        v62.e(str3, "characterName");
        v62.e(str2, "characterURL");
        ArrayList arrayList = new ArrayList();
        arrayList.add("Open Anime");
        arrayList.add("MyAnimeList");
        arrayList.add("Google Search");
        arrayList.add("Google Images");
        arrayList.add("Cosplay Images");
        arrayList.add("Wallpapers");
        arrayList.add("YouTube Videos");
        if (qv1.a.z(abstractActivity2)) {
            arrayList.add("NHentai");
        }
        if (i2 == 2) {
            arrayList.add("Delete Waifu");
        }
        f.e eVar = new f.e(abstractActivity2);
        h72 h72 = h72.a;
        String format = String.format("Pick an Action for %s", Arrays.copyOf(new Object[]{str3}, 1));
        v62.d(format, "java.lang.String.format(format, *args)");
        eVar.E(format);
        eVar.q(arrayList);
        b bVar = r0;
        f.e eVar2 = eVar;
        b bVar2 = new b(arrayList, "MyAnimeList", abstractActivity, str2, "Open Anime", i, "Anime", "Google Search", str, "Google Images", "Cosplay Images", "Wallpapers", "YouTube Videos", "NHentai", "Delete Waifu", aVar);
        f.e eVar3 = eVar2;
        eVar3.s(bVar);
        eVar3.D();
    }
}
