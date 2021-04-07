package defpackage;

import android.annotation.SuppressLint;
import java.util.ArrayList;

@SuppressLint({"DefaultLocale"})
/* renamed from: ez1  reason: default package */
public final class ez1 {
    public static final ez1 a = new ez1();

    private ez1() {
    }

    public final boolean a(int i) {
        String l = l02.l("KEY_SUBSCRIBED_ANIME", "");
        v62.d(l, "fullJsonBody");
        return g92.v(l, "\":" + i, false, 2, (Object) null);
    }

    public final ArrayList<my1> b() {
        ArrayList<my1> j = l02.j("KEY_SUBSCRIBED_ANIME", my1.class);
        v62.d(j, "ZimpleDB.getModelList(KE…scribedAnime::class.java)");
        return j;
    }

    public final void c(int i) {
        l02.a("KEY_SUBSCRIBED_ANIME", new my1(i), my1.class);
    }

    public final void d(int i) {
        l02.d("KEY_SUBSCRIBED_ANIME", new my1(i), my1.class);
    }
}
