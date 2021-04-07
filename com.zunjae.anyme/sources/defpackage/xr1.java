package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0280R$mipmap;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.vydia.AnimeVydiaPlayer;
import com.zunjae.anyme.features.vydia.s;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@SuppressLint({"DefaultLocale"})
/* renamed from: xr1  reason: default package */
public final class xr1 {
    public static final xr1 a = new xr1();

    /* renamed from: xr1$a */
    static final class a implements f.n {
        final /* synthetic */ AbstractActivity a;

        a(AbstractActivity abstractActivity) {
            this.a = abstractActivity;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "dialog");
            v62.e(bVar, "<anonymous parameter 1>");
            xr1.a.h(true);
            Toast makeText = Toast.makeText(this.a, "Enabled Vydia", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            fVar.dismiss();
        }
    }

    /* renamed from: xr1$b */
    static final class b implements f.n {
        final /* synthetic */ AbstractActivity a;

        b(AbstractActivity abstractActivity) {
            this.a = abstractActivity;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "dialog");
            v62.e(bVar, "<anonymous parameter 1>");
            mw1.i(this.a, "com.mxtech.videoplayer.ad", (String) null);
            fVar.dismiss();
        }
    }

    /* renamed from: xr1$c */
    static final class c implements f.n {
        final /* synthetic */ AbstractActivity a;

        c(AbstractActivity abstractActivity) {
            this.a = abstractActivity;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "dialog");
            v62.e(bVar, "<anonymous parameter 1>");
            AbstractActivity abstractActivity = this.a;
            String string = abstractActivity.getString(C0283R$string.noticeIgnoreDialogVideoPlayer);
            v62.d(string, "context.getString(R.stri…eIgnoreDialogVideoPlayer)");
            Toast makeText = Toast.makeText(abstractActivity, string, 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            fVar.dismiss();
        }
    }

    private xr1() {
    }

    private final void c(Context context, String str, String str2) {
        String f = f(context);
        if (f == null) {
            mw1.i(context, "com.mxtech.videoplayer.ad", "Please download a video player app like MX Player or VLC");
            return;
        }
        Intent e = e(str, str2);
        e.setPackage(f);
        if (com.zunjae.zapplib.a.d(context, e)) {
            context.startActivity(e);
        } else {
            Toast.makeText(context, "Unable to open MX Player or VLC... Do you have it installed?", 1).show();
        }
    }

    private final Intent e(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "video/*");
        intent.putExtra("title", str2);
        return intent;
    }

    private final String f(Context context) {
        return com.zunjae.zapplib.a.a(context, "org.videolan.vlc", "com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.ad");
    }

    private final boolean i(Context context) {
        String string = context.getResources().getString(C0283R$string.preference_key_force_mx_player);
        v62.d(string, "context.resources.getStr…ence_key_force_mx_player)");
        return l02.e(string, false);
    }

    private final boolean n(String str) {
        List<s> h = qv1.a.h();
        if (h != null) {
            for (s b2 : h) {
                if (g92.v(str, b2.b(), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final f.e a(AbstractActivity abstractActivity) {
        v62.e(abstractActivity, "context");
        f.e eVar = new f.e(abstractActivity);
        eVar.E("Important");
        eVar.i(abstractActivity.getString(C0283R$string.justInstallMXYouPleb));
        eVar.B("Install");
        eVar.x("Use Vydia");
        eVar.z(new a(abstractActivity));
        eVar.A(new b(abstractActivity));
        eVar.w("Ignore");
        eVar.y(new c(abstractActivity));
        eVar.k(C0280R$mipmap.newappicon);
        eVar.a(false);
        eVar.v(90);
        v62.d(eVar, "MaterialDialog.Builder(c…\n        .maxIconSize(90)");
        return eVar;
    }

    public final String b(int i, String str) {
        String str2;
        v62.e(str, "showName");
        if (xu1.i.t()) {
            h72 h72 = h72.a;
            str2 = String.format("%03d.mp4", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        } else {
            h72 h722 = h72.a;
            str2 = String.format("%s (Episode %03d).mp4", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        }
        v62.d(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    public final boolean d() {
        return l02.e("preference_key_use_vydia_2", false);
    }

    public final boolean g(Context context) {
        v62.e(context, "context");
        if (d()) {
            return true;
        }
        return com.zunjae.zapplib.a.b(context, "com.mxtech.videoplayer.ad", "org.videolan.vlc", "com.mxtech.videoplayer.pro", "com.kmplayer", "video.player.videoplayer", "is.xyz.mpv");
    }

    public final void h(boolean z) {
        l02.p("preference_key_use_vydia_2", z);
    }

    public final void j(Context context, int i, String str, String str2, Integer num) {
        v62.e(context, "context");
        v62.e(str, "seriesTitle");
        v62.e(str2, "videoLink");
        if (d() || n(str2)) {
            context.startActivity(AnimeVydiaPlayer.Q.a(context, new com.zunjae.anyme.features.vydia.b(i, str, (String) null, str2, num)));
            return;
        }
        l(context, str2, str + " (Episode " + num + ").mp4");
    }

    public final void k(Context context, String str, String str2) {
        v62.e(context, "context");
        v62.e(str, "url");
        v62.e(str2, "videoTitle");
        Intent e = e(str, str2);
        if (e.resolveActivity(context.getPackageManager()) != null) {
            if (l02.e(context.getString(C0283R$string.preference_key_mx_hw_plus), false)) {
                e.putExtra("decode_mode", (byte) 4);
            }
            context.startActivity(e);
            return;
        }
        Toast makeText = Toast.makeText(context, "No app installed that can play this video.", 1);
        makeText.show();
        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
    }

    public final void l(Context context, String str, String str2) {
        v62.e(context, "context");
        v62.e(str, "url");
        v62.e(str2, "videoTitle");
        if (i(context)) {
            c(context, str, str2);
        } else {
            k(context, str, str2);
        }
    }

    public final boolean m(String str) {
        v62.e(str, "url");
        List<Boolean> h = f32.h(Boolean.valueOf(g92.v(str, ".m3u8", false, 2, (Object) null)), Boolean.valueOf(g92.v(str, "dlvr1.net", false, 2, (Object) null)), Boolean.valueOf(g92.v(str, "vrv.co/", false, 2, (Object) null)), Boolean.valueOf(f92.l(str, ".ts", false, 2, (Object) null)));
        if (!(h instanceof Collection) || !h.isEmpty()) {
            for (Boolean booleanValue : h) {
                if (booleanValue.booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }
}
