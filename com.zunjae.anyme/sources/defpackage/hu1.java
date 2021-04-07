package defpackage;

import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import com.zunjae.anyme.features.casting.c;
import com.zunjae.anyme.features.settings.b;
import java.util.HashMap;

/* renamed from: hu1  reason: default package */
public final class hu1 extends com.zunjae.anyme.features.settings.a {
    private final int k0 = C0285R$xml.settings_streaming_and_casting;
    private final String l0 = "Streaming and Casting";
    private HashMap m0;

    /* renamed from: hu1$a */
    public static final class a implements b {
        final /* synthetic */ hu1 a;

        a(hu1 hu1) {
            this.a = hu1;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            c.Companion.b();
            preference.M0("No Default Cast App Set");
            FragmentActivity n = this.a.n();
            if (n != null) {
                Toast makeText = Toast.makeText(n, "Default casting app cleared", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }

        public void c(Preference preference) {
            String str;
            v62.e(preference, "preference");
            c.a aVar = c.Companion;
            FragmentActivity m1 = this.a.m1();
            v62.d(m1, "requireActivity()");
            c d = aVar.d(m1);
            if (d == null) {
                str = "No Default Cast App Set";
            } else {
                str = "Currently selected app:\n" + d.getAppName() + " (" + d.getPackageId() + ')';
            }
            preference.M0(str);
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
        d2(C0283R$string.preference_key_default_cast_app, new a(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
