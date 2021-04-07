package com.zunjae.anyme.features.settings;

import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.C0285R$xml;
import com.zunjae.anyme.abstracts.AbstractActivity;
import defpackage.uj2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c extends a {
    private final int k0 = C0285R$xml.root_preference;
    private final String l0 = "Settings";
    private HashMap m0;

    public static final class a implements b {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            FragmentActivity m1 = this.a.m1();
            v62.d(m1, "requireActivity()");
            uj2.g(new ww1(m1));
            FragmentActivity m12 = this.a.m1();
            v62.d(m12, "requireActivity()");
            String O = this.a.O(C0283R$string.noticeSiteGetsLogged);
            v62.d(O, "getString(R.string.noticeSiteGetsLogged)");
            mw1.q(m12, O, "Info");
            preference.C0(false);
        }

        public void c(Preference preference) {
            v62.e(preference, "preference");
            List<uj2.b> e = uj2.e();
            v62.d(e, "Timber.forest()");
            ArrayList arrayList = new ArrayList();
            for (T next : e) {
                if (next instanceof ww1) {
                    arrayList.add(next);
                }
            }
            if (n32.t(arrayList)) {
                preference.C0(false);
            }
        }
    }

    public static final class b implements b {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        public void a(Preference preference, Object obj) {
            v62.e(preference, "preference");
            v62.e(obj, "newValue");
        }

        public void b(Preference preference) {
            v62.e(preference, "preference");
            FragmentActivity n = this.a.n();
            if (n != null) {
                ((AbstractActivity) n).g0("https://www.google.com/search?q=learn+english+for+free");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.abstracts.AbstractActivity");
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
        e2(C0283R$string.preference_menu_appearance, new du1());
        e2(C0283R$string.preference_menu_vydia, new iu1());
        e2(C0283R$string.preference_menu_streaming, new hu1());
        e2(C0283R$string.preference_menu_download, new eu1());
        e2(C0283R$string.preference_menu_account, new cu1());
        e2(C0283R$string.preference_menu_misc, new fu1());
        e2(C0283R$string.preference_menu_storage, new gu1());
        e2(C0283R$string.preference_menu_about, new bu1());
        d2(C0283R$string.preference_key_link_ads, new a(this));
        d2(C0283R$string.preference_menu_language, new b(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
