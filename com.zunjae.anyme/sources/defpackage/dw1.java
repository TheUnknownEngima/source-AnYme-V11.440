package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.content.a;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;

/* renamed from: dw1  reason: default package */
public final class dw1 {
    public static final dw1 a = new dw1();

    private dw1() {
    }

    public static final void b(Menu menu, Context context, boolean z, boolean z2) {
        v62.e(menu, "menu");
        v62.e(context, "context");
        if (!z2 || !z) {
            MenuItem findItem = menu.findItem(C0275R$id.browser_open_drawer);
            v62.d(findItem, "menu.findItem(R.id.browser_open_drawer)");
            findItem.setIcon(a.f(context, C0274R$drawable.ic_drawer));
            int i = z ? C0274R$drawable.ic_download_selected : C0274R$drawable.ic_download_unselected;
            int i2 = z2 ? C0274R$drawable.ic_cast_selected : C0274R$drawable.ic_cast_unselected;
            MenuItem findItem2 = menu.findItem(C0275R$id.browser_downloader);
            v62.d(findItem2, "menu.findItem(R.id.browser_downloader)");
            findItem2.setIcon(a.f(context, i));
            MenuItem findItem3 = menu.findItem(C0275R$id.browser_cast);
            v62.d(findItem3, "menu.findItem(R.id.browser_cast)");
            findItem3.setIcon(a.f(context, i2));
            return;
        }
        throw new RuntimeException("CastMode can not be enabled at the same time as DownloaderMode");
    }

    public final void a(Menu menu, Context context, boolean z, boolean z2) {
        v62.e(menu, "menu");
        v62.e(context, "context");
        int i = z ? C0274R$drawable.ic_download_selected : C0274R$drawable.ic_download_unselected;
        int i2 = z2 ? C0274R$drawable.ic_cast_selected : C0274R$drawable.ic_cast_unselected;
        MenuItem findItem = menu.findItem(C0275R$id.browser_downloader);
        v62.d(findItem, "menu.findItem(R.id.browser_downloader)");
        findItem.setIcon(a.f(context, i));
        MenuItem findItem2 = menu.findItem(C0275R$id.browser_cast);
        v62.d(findItem2, "menu.findItem(R.id.browser_cast)");
        findItem2.setIcon(a.f(context, i2));
    }
}
