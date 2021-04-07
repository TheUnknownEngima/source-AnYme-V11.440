package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class j {
    private Context a;
    private long b = 0;
    private SharedPreferences c;
    private e d;
    private SharedPreferences.Editor e;
    private boolean f;
    private String g;
    private int h;
    private int i = 0;
    private PreferenceScreen j;
    private d k;
    private c l;
    private a m;
    private b n;

    public interface a {
        void d(Preference preference);
    }

    public interface b {
        void e(PreferenceScreen preferenceScreen);
    }

    public interface c {
        boolean f(Preference preference);
    }

    public static abstract class d {
        public abstract boolean a(Preference preference, Preference preference2);

        public abstract boolean b(Preference preference, Preference preference2);
    }

    public j(Context context) {
        this.a = context;
        q(b(context));
    }

    private static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.e) != null) {
            editor.apply();
        }
        this.f = z;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.j;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.X0(charSequence);
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences.Editor c() {
        if (this.d != null) {
            return null;
        }
        if (!this.f) {
            return j().edit();
        }
        if (this.e == null) {
            this.e = j().edit();
        }
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        long j2;
        synchronized (this) {
            j2 = this.b;
            this.b = 1 + j2;
        }
        return j2;
    }

    public b e() {
        return this.n;
    }

    public c f() {
        return this.l;
    }

    public d g() {
        return this.k;
    }

    public e h() {
        return this.d;
    }

    public PreferenceScreen i() {
        return this.j;
    }

    public SharedPreferences j() {
        if (h() != null) {
            return null;
        }
        if (this.c == null) {
            this.c = (this.i != 1 ? this.a : androidx.core.content.a.b(this.a)).getSharedPreferences(this.g, this.h);
        }
        return this.c;
    }

    public PreferenceScreen k(Context context, int i2, PreferenceScreen preferenceScreen) {
        l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new i(context, this).d(i2, preferenceScreen);
        preferenceScreen2.a0(this);
        l(false);
        return preferenceScreen2;
    }

    public void m(a aVar) {
        this.m = aVar;
    }

    public void n(b bVar) {
        this.n = bVar;
    }

    public void o(c cVar) {
        this.l = cVar;
    }

    public boolean p(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.f0();
        }
        this.j = preferenceScreen;
        return true;
    }

    public void q(String str) {
        this.g = str;
        this.c = null;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return !this.f;
    }

    public void s(Preference preference) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.d(preference);
        }
    }
}
