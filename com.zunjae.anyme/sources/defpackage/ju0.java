package defpackage;

import android.content.SharedPreferences;

/* renamed from: ju0  reason: default package */
final /* synthetic */ class ju0 implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final ku0 a;

    ju0(ku0 ku0) {
        this.a = ku0;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.c(sharedPreferences, str);
    }
}
