package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.AnYmeActivity;
import com.zunjae.anyme.features.login.LoginActivity;

/* renamed from: wu1  reason: default package */
public final class wu1 {
    public static final wu1 a = new wu1();

    /* renamed from: wu1$a */
    static final class a implements f.n {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            fz1.a.a();
            Intent intent = new Intent(this.a, AnYmeActivity.class);
            intent.addFlags(268468224);
            this.a.startActivity(intent);
        }
    }

    /* renamed from: wu1$b */
    static final class b implements f.n {
        final /* synthetic */ Activity a;

        b(Activity activity) {
            this.a = activity;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            fz1.a.a();
            Intent intent = new Intent(this.a, LoginActivity.class);
            intent.addFlags(268468224);
            this.a.startActivity(intent);
        }
    }

    private wu1() {
    }

    private final void b(Activity activity) {
        f.e eVar = new f.e(activity);
        eVar.E("Oops");
        eVar.i("Your tokens have expired. Please re-login :/");
        eVar.B("Re-login");
        eVar.A(new a(activity));
        eVar.D();
    }

    private final void c(Activity activity, String str, boolean z) {
        try {
            f.e eVar = new f.e(activity);
            eVar.E("Oops");
            eVar.i(str);
            eVar.B("Okay");
            if (z) {
                eVar.w("Re-login");
                eVar.b(e.START);
                eVar.y(new b(activity));
            }
            eVar.D();
        } catch (Exception e) {
            uj2.d(e);
        }
    }

    public final void a(Activity activity, kv1 kv1) {
        v62.e(activity, "activity");
        v62.e(kv1, "result");
        int b2 = kv1.b();
        if (400 <= b2 && 499 >= b2) {
            String t = fz1.a.t();
            if (t == null) {
                t = "N/A";
            }
            c(activity, y82.e("\n        The AnYme app is unable to update this show, status code = " + kv1.b() + ".\n\n        The reason is unknown but you can try the following things:\n        1) Go to the home screen of the app and refresh your profile\n        2) Double check if the username you entered is correct (It's currently set as '" + t + "')\n        3) Relogin in the app (Settings > Account > Relogin on MyAnimeList)\n        4) Clear app data so you start off fresh (Settings > Storage > Open Android Settings)\n        "), true);
        } else if (300 <= b2 && 399 >= b2) {
            b(activity);
        } else if (500 <= b2 && 599 >= b2) {
            c(activity, '(' + kv1.b() + ") MyAnimeList seems to be undergoing maintenance. Please try again later.", false);
        } else if (b2 == -1000) {
            c(activity, "It took AnYme too long to connect to MyAnimeList. Please try again later.", false);
        } else if (b2 == -2000) {
            c(activity, "Could not update this show. I'm guessing that MyAnimeList is a bit slow now. Please try to update again at a later moment!", false);
        } else {
            c(activity, y82.e("\n        Unknown error, status code = " + kv1.b() + ". \n\n        If you keep seeing this then please change your username (Settings > Account > Change Username) or simply re-login\",\n        "), true);
        }
    }
}
