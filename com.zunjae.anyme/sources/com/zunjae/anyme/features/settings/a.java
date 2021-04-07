package com.zunjae.anyme.features.settings;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.g;
import java.util.HashMap;

public abstract class a extends g {
    private HashMap j0;

    /* renamed from: com.zunjae.anyme.features.settings.a$a  reason: collision with other inner class name */
    static final class C0209a implements Preference.e {
        final /* synthetic */ b a;
        final /* synthetic */ Preference b;

        C0209a(b bVar, Preference preference) {
            this.a = bVar;
            this.b = preference;
        }

        public final boolean a(Preference preference) {
            this.a.b(this.b);
            return true;
        }
    }

    static final class b implements Preference.d {
        final /* synthetic */ b a;

        b(b bVar) {
            this.a = bVar;
        }

        public final boolean a(Preference preference, Object obj) {
            b bVar = this.a;
            v62.d(preference, "pref");
            v62.d(obj, "newValue");
            bVar.a(preference, obj);
            return true;
        }
    }

    static final class c implements Preference.e {
        final /* synthetic */ a a;
        final /* synthetic */ g b;

        c(a aVar, g gVar) {
            this.a = aVar;
            this.b = gVar;
        }

        public final boolean a(Preference preference) {
            FragmentActivity n = this.a.n();
            if (n != null) {
                ((UserSettingsActivity) n).m0(this.b, this.a.c2());
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.features.settings.UserSettingsActivity");
        }
    }

    public void Q1(Bundle bundle, String str) {
        Y1(b2(), str);
        f2();
    }

    public void a2() {
        HashMap hashMap = this.j0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract int b2();

    public abstract String c2();

    public final void d2(int i, b bVar) {
        v62.e(bVar, "listener");
        Preference b2 = b(O(i));
        if (b2 != null) {
            bVar.c(b2);
            b2.K0(new C0209a(bVar, b2));
            b2.J0(new b(bVar));
        }
    }

    public final void e2(int i, g gVar) {
        v62.e(gVar, "settingsFragment");
        Preference b2 = b(O(i));
        if (b2 != null) {
            b2.K0(new c(this, gVar));
        }
    }

    public abstract void f2();

    public /* synthetic */ void u0() {
        super.u0();
        a2();
    }
}
