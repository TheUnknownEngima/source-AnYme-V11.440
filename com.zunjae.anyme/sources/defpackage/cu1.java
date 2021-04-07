package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.AnYmeActivity;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.database.AppDatabase;
import com.zunjae.anyme.features.login.WelcomeActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: cu1  reason: default package */
public final class cu1 extends com.zunjae.anyme.features.settings.a {
    private final int k0 = C0285R$xml.settings_account2;
    private final String l0 = "Account";
    private HashMap m0;

    /* renamed from: cu1$a */
    public static final class a implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ cu1 a;

        /* renamed from: cu1$a$a  reason: collision with other inner class name */
        static final class C0221a implements f.i {
            final /* synthetic */ a a;
            final /* synthetic */ ArrayList b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;

            /* renamed from: cu1$a$a$a  reason: collision with other inner class name */
            static final class C0222a extends w62 implements o52<u22> {
                final /* synthetic */ C0221a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0222a(C0221a aVar) {
                    super(0);
                    this.f = aVar;
                }

                public final void a() {
                    l02.b();
                    AppDatabase.y(this.f.a.a.n()).d();
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return u22.a;
                }
            }

            C0221a(a aVar, ArrayList arrayList, String str, String str2) {
                this.a = aVar;
                this.b = arrayList;
                this.c = str;
                this.d = str2;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
                fz1.a.a();
                String str = (String) this.b.get(i);
                if (v62.a(str, this.c)) {
                    fz1.a.a();
                } else if (v62.a(str, this.d)) {
                    g42.b(false, false, (ClassLoader) null, (String) null, 0, new C0222a(this), 31, (Object) null);
                } else {
                    throw new IllegalStateException("no switch case found for " + i);
                }
                FragmentActivity n = this.a.a.n();
                if (n != null) {
                    n.finishAffinity();
                }
                FragmentActivity n2 = this.a.a.n();
                if (n2 != null) {
                    n2.startActivity(new Intent(this.a.a.n(), AnYmeActivity.class));
                }
            }
        }

        a(cu1 cu1) {
            this.a = cu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            ArrayList arrayList = new ArrayList();
            arrayList.add("Delete Login Data (just relogin)");
            arrayList.add("Delete App Data (everything)");
            f.e eVar = new f.e(this.a.m1());
            eVar.E("Pick an Action");
            eVar.q(arrayList);
            eVar.s(new C0221a(this, arrayList, "Delete Login Data (just relogin)", "Delete App Data (everything)"));
            eVar.D();
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: cu1$b */
    public static final class b implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ cu1 a;

        b(cu1 cu1) {
            this.a = cu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            FragmentActivity n = this.a.n();
            if (n != null) {
                ((AbstractActivity) n).g0("https://kanonapp.com/account/register");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.abstracts.AbstractActivity");
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
            if (xx1.a.a()) {
                this.a.M1().g1(preference.x());
            }
        }
    }

    /* renamed from: cu1$c */
    public static final class c implements com.zunjae.anyme.features.settings.b {
        private final String a = "com.zunjae.anyme.alpha";
        final /* synthetic */ cu1 b;

        c(cu1 cu1) {
            this.b = cu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            String d = xx1.a.d();
            if (d != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://kanonapp.com/authorized_user?token=" + d));
                intent.setPackage(this.a);
                Context u = this.b.u();
                if (u != null) {
                    u.startActivity(intent);
                }
            }
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
            if (xx1.a.b() || v62.a("com.zunjae.anyme", this.a) || !com.zunjae.zapplib.a.c(this.b.m1(), this.a)) {
                this.b.M1().g1(preference.x());
            }
        }
    }

    /* renamed from: cu1$d */
    public static final class d implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ cu1 a;

        /* renamed from: cu1$d$a */
        static final class a implements f.h {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
                FragmentActivity n;
                String str;
                v62.e(fVar, "<anonymous parameter 0>");
                v62.d(charSequence, "input");
                if (!g92.Y(charSequence, "anymetoken:", false, 2, (Object) null)) {
                    n = this.a.a.n();
                    if (n != null) {
                        str = "Invalid token...";
                    } else {
                        return;
                    }
                } else {
                    xx1.a.c(f92.q(charSequence.toString(), "anymetoken:", "", false, 4, (Object) null));
                    n = this.a.a.n();
                    if (n != null) {
                        str = "Done! Please restart the app.";
                    } else {
                        return;
                    }
                }
                Toast makeText = Toast.makeText(n, str, 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }

        d(cu1 cu1) {
            this.a = cu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            f.e eVar = new f.e(this.a.m1());
            eVar.E("Kanon Token");
            eVar.i("Enter the Kanon token here");
            eVar.n(21, 21);
            eVar.B("Save");
            eVar.e(true);
            eVar.l((CharSequence) null, (CharSequence) null, new a(this));
            eVar.D();
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
            if (xx1.a.a()) {
                this.a.M1().g1(preference.x());
            }
        }
    }

    /* renamed from: cu1$e */
    public static final class e implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ cu1 a;

        e(cu1 cu1) {
            this.a = cu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            this.a.h2();
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
            String t = fz1.a.t();
            if (t == null) {
                this.a.M1().g1(preference.x());
                return;
            }
            preference.M0("Your username is '" + t + '\'');
        }
    }

    /* renamed from: cu1$f */
    static final class f implements f.h {
        final /* synthetic */ cu1 a;
        final /* synthetic */ qy1 b;

        f(cu1 cu1, qy1 qy1) {
            this.a = cu1;
            this.b = qy1;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
            v62.e(fVar, "<anonymous parameter 0>");
            String obj = charSequence.toString();
            fz1.a.q(new qy1(obj, this.b.a()));
            FragmentActivity n = this.a.n();
            if (n != null) {
                Toast makeText = Toast.makeText(n, "Updated your username to " + obj, 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
            FragmentActivity n2 = this.a.n();
            if (n2 != null) {
                n2.recreate();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void h2() {
        qy1 s = fz1.a.s();
        if (s == null) {
            E1(new Intent(n(), WelcomeActivity.class));
            return;
        }
        f.e eVar = new f.e(m1());
        eVar.E("Set your new username");
        eVar.p(1);
        eVar.n(1, 64);
        eVar.B("update");
        eVar.l(s.b(), (CharSequence) null, new f(this, s));
        try {
            eVar.D();
        } catch (Exception e2) {
            uj2.d(e2);
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
        d2(C0283R$string.preference_key_relogin, new a(this));
        d2(C0283R$string.preference_key_kanon_login, new b(this));
        d2(C0283R$string.preference_key_migrate_to_alpha, new c(this));
        d2(C0283R$string.preference_key_manually_set_kanon_token, new d(this));
        d2(C0283R$string.preference_key_change_username, new e(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
