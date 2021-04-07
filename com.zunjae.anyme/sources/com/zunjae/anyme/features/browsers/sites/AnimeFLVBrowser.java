package com.zunjae.anyme.features.browsers.sites;

import android.view.View;
import android.webkit.WebView;
import com.zunjae.anyme.features.browsers.abstracts.AbstractAnimeBrowser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public final class AnimeFLVBrowser extends AbstractAnimeBrowser {
    private List<String> e0 = f32.f();
    private HashMap f0;

    private final int x1(String str) {
        List<T> list;
        boolean z;
        try {
            List<String> e = new u82("-").e(str, 0);
            if (!e.isEmpty()) {
                ListIterator<String> listIterator = e.listIterator(e.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = n32.X(e, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = f32.f();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return Integer.parseInt(strArr[strArr.length - 1]);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception unused) {
            return -1;
        }
    }

    public List<String> O0() {
        return this.e0;
    }

    public void b1(WebView webView) {
        v62.e(webView, "webView");
        c1();
    }

    public String e1() {
        return pr1.AnimeFLV.getRepo();
    }

    public void f1(String str, WebView webView) {
        v62.e(str, "url");
    }

    public void g1(String str, WebView webView) {
        v62.e(str, "url");
        l1(x1(str));
    }

    public String i1(String str) {
        v62.e(str, "query");
        return "https://animeflv.net/browse?q=" + str;
    }

    public void k1(List<String> list) {
        this.e0 = list;
    }

    public View v0(int i) {
        if (this.f0 == null) {
            this.f0 = new HashMap();
        }
        View view = (View) this.f0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean v1(String str) {
        v62.e(str, "url");
        return g92.v(str, "animeflv.net/ver/", false, 2, (Object) null);
    }

    public boolean w1(String str) {
        v62.e(str, "url");
        return g92.v(str, "animeflv.net/anime/", false, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y1 */
    public ArrayList<ax1> d1() {
        ArrayList<ax1> arrayList = new ArrayList<>();
        arrayList.add(new ax1("", ax1.c.c("aside[class=\"SidebarA BFixed\"]")));
        arrayList.add(new ax1("animeflv.net/anime/", ax1.c.c("div[class=\"Carousel\"]")));
        arrayList.add(new ax1("animeflv.net/ver/", ax1.c.c("div[class=\"Comments\"]")));
        arrayList.add(new ax1("", ax1.c.c("li[class=\"User-Top AADrpd\"]")));
        arrayList.add(new ax1("", ax1.c.c("section[class=\"WdgtCn\"]")));
        return arrayList;
    }
}
