package defpackage;

import android.content.Context;
import com.zunjae.anyme.C0276R$integer;
import com.zunjae.anyme.C0283R$string;

/* renamed from: xu1  reason: default package */
public final class xu1 {
    private static final String a = "@@KEY_Custom_Column_Count";
    private static final String b = "@@KEY_Custom_Image_Height";
    private static final String c = "SyncEpisodeAnime";
    private static final String d = "preference_key_toolbar_back_button";
    private static final String e = "preference_key_alternative_downloader2";
    private static final String f = "KEY_ASK_FOR_PLAYBACK";
    private static final String g = "KEY_SORT_ORDER_WAIFU";
    private static final String h = "KEY_QUALITY_SELECTOR_PREFERRED";
    public static final xu1 i = new xu1();

    private xu1() {
    }

    private final String c(int i2) {
        return c + i2;
    }

    public final int a() {
        return l02.g(a, 3);
    }

    public final int b(boolean z) {
        String str;
        int i2;
        if (z) {
            str = b;
            i2 = 500;
        } else {
            str = b;
            i2 = -1;
        }
        return l02.g(str, i2);
    }

    public final int d(Context context) {
        v62.e(context, "context");
        return context.getResources().getInteger(C0276R$integer.imageHeight);
    }

    public final int e(Context context) {
        v62.e(context, "context");
        return context.getResources().getInteger(C0276R$integer.imageWidth);
    }

    public final int f(int i2) {
        return l02.g(c(i2), 0);
    }

    public final String g() {
        return l02.l(h, (String) null);
    }

    public final boolean h() {
        return l02.e(d, false);
    }

    public final void i() {
        l02.c(h);
    }

    public final void j() {
        l02.c(a);
    }

    public final void k() {
        l02.c(b);
    }

    public final void l(int i2) {
        if (i2 >= 1) {
            l02.r(a, i2);
            return;
        }
        throw new IllegalArgumentException("Incorrect custom size");
    }

    public final void m(int i2) {
        if (i2 >= 1) {
            l02.r(b, i2);
            return;
        }
        throw new IllegalArgumentException("Incorrect custom size");
    }

    public final void n(int i2, int i3) {
        l02.r(c(i2), i3);
    }

    public final void o(int i2) {
        l02.r(g, i2);
    }

    public final void p(boolean z) {
        l02.p(f, z);
    }

    public final boolean q() {
        return l02.e(f, false);
    }

    public final boolean r() {
        return l02.e("preference_key_hide_discord_item", false);
    }

    public final boolean s(Context context) {
        v62.e(context, "context");
        String string = context.getResources().getString(C0283R$string.preference_key_stay_on_animescreen);
        v62.d(string, "context.resources.getStr…_key_stay_on_animescreen)");
        return l02.e(string, false);
    }

    public final boolean t() {
        return l02.e(e, false);
    }

    public final boolean u() {
        return l02.e("preference_key_use_listviewV4", false);
    }

    public final int v() {
        return l02.g(g, 0);
    }
}
