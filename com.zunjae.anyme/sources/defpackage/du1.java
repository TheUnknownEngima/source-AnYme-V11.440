package defpackage;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import com.zunjae.anyme.features.settings.CustomizeActivity;
import com.zunjae.anyme.features.settings.b;
import java.util.HashMap;

/* renamed from: du1  reason: default package */
public final class du1 extends com.zunjae.anyme.features.settings.a {
    private final int k0 = C0285R$xml.appearance_settings2;
    private final String l0 = "Appearance";
    private HashMap m0;

    /* renamed from: du1$a */
    public static final class a implements b {
        final /* synthetic */ du1 a;

        a(du1 du1) {
            this.a = du1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            Intent intent = new Intent(this.a.n(), CustomizeActivity.class);
            FragmentActivity n = this.a.n();
            if (n != null) {
                n.startActivityForResult(intent, lv1.f.b());
            }
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
        d2(C0283R$string.preference_menu_image_height, new a(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
