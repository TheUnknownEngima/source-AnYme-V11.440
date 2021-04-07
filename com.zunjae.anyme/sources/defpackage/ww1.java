package defpackage;

import android.content.Context;
import com.zunjae.anyme.C0283R$string;
import defpackage.uj2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ww1  reason: default package */
public final class ww1 extends uj2.b {
    private final List<String> b = f32.h("9anime.ru/assets/favicons/", "static.akacdn.ru/files/images/", "gogoanime.io/img/", "imgcf.chia-anime.com/cthumb", "https://www.google.com", "https://static.animecdn", "https://static.akacdn.ru/static/images/", "https://www.gstatic.com", "https://cdn.masterani.me", "https://cdnimg.xyz/", "https://vjs.zencdn.net/", "http://hentaipulse.com/wp-content/uploads/", "https://fonts.googleapis.com", "https://fonts.gstatic.com", "https://cdn.myanimelist.net/images/anime/", "https://cdn.myanimelist.net/r/");
    private final Context c;

    public ww1(Context context) {
        Context context2 = context;
        v62.e(context2, "context");
        this.c = context2;
        Context context3 = this.c;
        u9.c(context3, context3.getString(C0283R$string.bf), false);
    }

    /* access modifiers changed from: protected */
    public void k(int i, String str, String str2, Throwable th) {
        v62.e(str2, "message");
        List<String> list = this.b;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                String lowerCase = str2.toLowerCase();
                v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (str3 != null) {
                    String lowerCase2 = str3.toLowerCase();
                    v62.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (f92.s(lowerCase, lowerCase2, false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        if (!z && str != null && str.equals(vw1.AdBlocker.getValue())) {
            u9.b(str, str2);
        }
    }
}
