package com.zunjae.anyme.features.settings;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.k;
import androidx.fragment.app.s;
import androidx.preference.g;
import androidx.work.f;
import androidx.work.j;
import androidx.work.n;
import androidx.work.o;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.workers.AppUpdaterWorker;
import java.util.HashMap;

public final class UserSettingsActivity extends AbstractActivity {
    private final String D = "settingsActivityTitle";
    private HashMap E;

    static final class a implements k.g {
        final /* synthetic */ UserSettingsActivity a;

        a(UserSettingsActivity userSettingsActivity) {
            this.a = userSettingsActivity;
        }

        public final void a() {
            k q = this.a.q();
            v62.d(q, "supportFragmentManager");
            if (q.d0() == 0) {
                this.a.setTitle("Settings");
            }
        }
    }

    private final void n0() {
        o b = new j.a(AppUpdaterWorker.class).b();
        v62.d(b, "OneTimeWorkRequestBuilde…pUpdaterWorker>().build()");
        n.c().a("BunBakaThotAppUpdate", f.REPLACE, (j) b).a();
    }

    public View l0(int i) {
        if (this.E == null) {
            this.E = new HashMap();
        }
        View view = (View) this.E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.E.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void m0(g gVar, String str) {
        v62.e(gVar, "fragment");
        v62.e(str, "fragmentTitle");
        s j = q().j();
        j.q(C0275R$id.fragmentContainerFrameLayout, gVar);
        j.g((String) null);
        j.i();
        setTitle(str);
    }

    public void onBackPressed() {
        if (!q().I0()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_user_settings);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.preferencesActivityToolbar);
        v62.d(toolbar, "preferencesActivityToolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        if (bundle == null) {
            s j = q().j();
            j.q(C0275R$id.fragmentContainerFrameLayout, new c());
            j.i();
        } else {
            setTitle(bundle.getCharSequence(this.D));
        }
        q().e(new a(this));
        n0();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        v62.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(this.D, getTitle());
    }
}
