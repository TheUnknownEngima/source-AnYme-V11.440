package com.zunjae.anyme.features.settings;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.zasync.b;
import java.util.Map;

public final class OptimizeActivity extends AbstractActivity {
    private final String[] D = {"KEY_ANIME_SYNOPSIS", "KEY_GENRES_ANIME", "KEY_CHARACTERS", "KEY_VIDEOS_ANIME", "KEY_ANIME_RECOMMENDATIONS", "KEY_JIKAN_INFO", "KissAnime", "GoGoAnime", "AnimeHeavenRepo", "ChiaAnimeRepository", "AnimeFrostRepository", "BetterNineAnimeRepo", "KEY_DISCOVERY_ANIME", "AnimeFLVRepository", "AnimePaheRepository", "RyuAnimeRepository"};

    private class a extends b<Boolean> {
        a(Activity activity) {
            super(activity);
        }

        /* renamed from: m */
        public Boolean f() {
            SharedPreferences k = l02.k();
            for (Map.Entry<String, ?> key : k.getAll().entrySet()) {
                String str = (String) key.getKey();
                if (OptimizeActivity.this.o0(str)) {
                    k.edit().remove(str).apply();
                }
            }
            return Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void j(Boolean bool) {
            super.j(bool);
            Toast.makeText(OptimizeActivity.this.T(), "Database optimized", 0).show();
            OptimizeActivity.this.finish();
        }
    }

    public OptimizeActivity() {
        Class<OptimizeActivity> cls = OptimizeActivity.class;
    }

    private void n0() {
        for (Map.Entry next : l02.k().getAll().entrySet()) {
        }
    }

    /* access modifiers changed from: private */
    public boolean o0(String str) {
        for (String startsWith : this.D) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_optimize);
        n0();
        new a(this).g();
        n0();
    }
}
