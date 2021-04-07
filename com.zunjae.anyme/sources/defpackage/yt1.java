package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.core.graphics.drawable.IconCompat;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import defpackage.a2;

/* renamed from: yt1  reason: default package */
public final class yt1 {
    public static final yt1 a = new yt1();

    private yt1() {
    }

    public final void a(Context context, IconCompat iconCompat, sy1 sy1, zt1 zt1) {
        v62.e(context, "context");
        v62.e(iconCompat, "icon");
        v62.e(sy1, "anime");
        v62.e(zt1, "listener");
        if (!b2.a(context)) {
            zt1.b("Your launcher app does not support adding shortcuts.");
            return;
        }
        Intent action = AnimeInfoActivity.M.a(context, sy1.i(), sy1.y(), sy1.w()).setAction("SHORTCUT");
        v62.d(action, "AnimeInfoActivity\n      …   .setAction(\"SHORTCUT\")");
        a2.a aVar = new a2.a(context, "AnimeShortcut" + sy1.i() + "_V9");
        aVar.b(iconCompat);
        aVar.e(sy1.y());
        aVar.c(action);
        a2 a2 = aVar.a();
        v62.d(a2, "ShortcutInfoCompat.Build…ination)\n        .build()");
        if (b2.b(context, a2, (IntentSender) null)) {
            zt1.a();
        } else {
            zt1.b("Could not add a shortcut to your launcher for some reason");
        }
    }
}
