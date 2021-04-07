package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.w;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import com.zunjae.anyme.features.niche.PrivacyActivity;
import java.util.HashMap;

/* renamed from: bu1  reason: default package */
public final class bu1 extends com.zunjae.anyme.features.settings.a {
    private final int k0 = C0285R$xml.settings_about2;
    private final String l0 = "About";
    private HashMap m0;

    /* renamed from: bu1$a */
    public static final class a implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        a(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            StringBuilder sb = new StringBuilder();
            sb.append("\n          **App Information**:\n          ```\n          App ID = com.zunjae.anyme\n          Build Type = Beta\n          Version = 11.440\n          MyAnimeList = ");
            String t = fz1.a.t();
            if (t == null) {
                t = "N/A";
            }
            sb.append(t);
            sb.append("\n          AdBlocker Version = ");
            sb.append(nv1.a.a());
            sb.append("\n          ```\n          **Device Information**:\n          ```\n          Manufacture = ");
            sb.append(Build.MANUFACTURER);
            sb.append("\n          Phone = ");
            sb.append(Build.MODEL);
            sb.append("\n          OS = ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n          ```\n        ");
            String e = y82.e(sb.toString());
            yv1 yv1 = yv1.a;
            FragmentActivity m1 = this.a.m1();
            v62.d(m1, "requireActivity()");
            yv1.b(m1, e);
            FragmentActivity m12 = this.a.m1();
            v62.d(m12, "requireActivity()");
            Toast makeText = Toast.makeText(m12, "Information copied to your clipboard.", 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: bu1$b */
    public static final class b implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        b(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            FragmentActivity n = this.a.n();
            if (n != null) {
                n.startActivity(new Intent(this.a.n(), PrivacyActivity.class));
            }
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: bu1$c */
    public static final class c implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        c(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://anyme.app/github"));
            intent.setFlags(268435456);
            FragmentActivity n = this.a.n();
            if (n != null) {
                n.startActivity(intent);
            }
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: bu1$d */
    public static final class d implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        d(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://anyme.app/reddit"));
            intent.setFlags(268435456);
            FragmentActivity n = this.a.n();
            if (n != null) {
                n.startActivity(intent);
            }
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: bu1$e */
    public static final class e implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        e(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://anyme.app/invite"));
            intent.setFlags(268435456);
            FragmentActivity n = this.a.n();
            if (n != null) {
                n.startActivity(intent);
            }
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: bu1$f */
    public static final class f implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        f(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            xv1 xv1 = xv1.a;
            FragmentActivity m1 = this.a.m1();
            v62.d(m1, "requireActivity()");
            xv1.c(m1);
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: bu1$g */
    public static final class g implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ bu1 a;

        /* renamed from: bu1$g$a */
        static final class a<TResult> implements z71<w> {
            final /* synthetic */ g a;

            a(g gVar) {
                this.a = gVar;
            }

            public final void a(e81<w> e81) {
                FragmentActivity n;
                int i;
                String str;
                v62.e(e81, "task");
                w m = e81.m();
                String a2 = m != null ? m.a() : null;
                if (a2 == null) {
                    n = this.a.a.n();
                    if (n != null) {
                        i = 1;
                        str = "Could not get your token :/";
                    } else {
                        return;
                    }
                } else {
                    yv1 yv1 = yv1.a;
                    FragmentActivity n2 = this.a.a.n();
                    v62.c(n2);
                    v62.d(n2, "activity!!");
                    yv1.b(n2, '`' + a2 + '`');
                    n = this.a.a.n();
                    if (n != null) {
                        i = 0;
                        str = "Copied token to your clipboard";
                    } else {
                        return;
                    }
                }
                Toast makeText = Toast.makeText(n, str, i);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }

        g(bu1 bu1) {
            this.a = bu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            FirebaseInstanceId l = FirebaseInstanceId.l();
            v62.d(l, "FirebaseInstanceId.getInstance()");
            l.m().b(new a(this));
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
            String f = com.zunjae.zapplib.a.f(this.a.n());
            v62.c(f);
            v62.d(f, "AppUtil.versionNumberString(activity)!!");
            int a2 = nv1.a.a();
            preference.P0("Version: " + f);
            preference.M0("AdBlocker Version: " + a2 + " | Beta");
        }
    }

    public void a2() {
        HashMap hashMap = this.m0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public int b2() {
        return this.k0;
    }

    public String c2() {
        return this.l0;
    }

    public void f2() {
        d2(C0283R$string.copy_device_info, new a(this));
        d2(C0283R$string.app_privacy_policy, new b(this));
        d2(C0283R$string.preference_key_author, new c(this));
        d2(C0283R$string.preference_key_reddit, new d(this));
        d2(C0283R$string.preference_key_discord, new e(this));
        d2(C0283R$string.preference_key_open_android_settings, new f(this));
        d2(C0283R$string.preference_key_version_name, new g(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
