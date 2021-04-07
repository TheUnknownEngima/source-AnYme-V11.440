package defpackage;

import android.content.Intent;
import android.webkit.WebStorage;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import com.zunjae.anyme.features.settings.OptimizeActivity;
import java.util.HashMap;

/* renamed from: gu1  reason: default package */
public final class gu1 extends com.zunjae.anyme.features.settings.a {
    private final int k0 = C0285R$xml.settings_storage2;
    private final String l0 = "Storage";
    private HashMap m0;

    /* renamed from: gu1$a */
    public static final class a implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ gu1 a;

        /* renamed from: gu1$a$a  reason: collision with other inner class name */
        static final class C0242a implements Runnable {
            final /* synthetic */ a e;

            C0242a(a aVar) {
                this.e = aVar;
            }

            public final void run() {
                com.bumptech.glide.c.d(this.e.a.m1()).b();
            }
        }

        a(gu1 gu1) {
            this.a = gu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            FragmentActivity n = this.a.n();
            if (n != null) {
                Toast makeText = Toast.makeText(n, "Please wait 3 seconds :)", 1);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
            new Thread(new C0242a(this)).start();
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: gu1$b */
    public static final class b implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ gu1 a;

        b(gu1 gu1) {
            this.a = gu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            try {
                WebStorage.getInstance().deleteAllData();
                FragmentActivity n = this.a.n();
                if (n != null) {
                    Toast makeText = Toast.makeText(n, "Data cleared", 1);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                }
            } catch (Exception unused) {
                FragmentActivity n2 = this.a.n();
                if (n2 != null) {
                    Toast makeText2 = Toast.makeText(n2, "Could not clear the cache", 1);
                    makeText2.show();
                    v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
                }
            }
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
        }
    }

    /* renamed from: gu1$c */
    public static final class c implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ gu1 a;

        c(gu1 gu1) {
            this.a = gu1;
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

    /* renamed from: gu1$d */
    public static final class d implements com.zunjae.anyme.features.settings.b {
        final /* synthetic */ gu1 a;

        d(gu1 gu1) {
            this.a = gu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            this.a.E1(new Intent(this.a.n(), OptimizeActivity.class));
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
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
        d2(C0283R$string.preference_key_clear_cache, new a(this));
        d2(C0283R$string.preference_key_clear_browser_data, new b(this));
        d2(C0283R$string.preference_key_open_android_settings, new c(this));
        d2(C0283R$string.preference_key_optimize_database, new d(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
