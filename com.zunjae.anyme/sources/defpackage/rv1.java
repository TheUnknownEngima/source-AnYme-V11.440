package defpackage;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.zunjae.anyme.features.anime.character.d;
import com.zunjae.anyme.features.database.AppDatabase;
import com.zunjae.anyme.features.database.c;
import java.util.List;

/* renamed from: rv1  reason: default package */
public final class rv1 {
    private final c a;

    public rv1(Application application) {
        v62.e(application, "application");
        c x = AppDatabase.y(application.getApplicationContext()).x();
        v62.d(x, "AppDatabase.getAppDataba…nContext).charactersDao()");
        this.a = x;
    }

    public final List<d> a(long j) {
        return this.a.c(j);
    }

    public final LiveData<List<d>> b(long j) {
        return this.a.d(j);
    }

    public final void c(List<d> list, long j) {
        if (list != null) {
            this.a.b(j);
            this.a.f(list, j);
        }
    }
}
