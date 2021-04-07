package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.work.R$bool;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.d;
import androidx.work.impl.utils.f;
import androidx.work.impl.utils.g;
import androidx.work.j;
import androidx.work.l;
import androidx.work.m;
import androidx.work.n;
import defpackage.i8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class h extends n {
    private static h k;
    private static h l;
    private static final Object m = new Object();
    private Context a;
    private b b;
    private WorkDatabase c;
    private s8 d;
    private List<d> e;
    private c f;
    private f g;
    private boolean h;
    private BroadcastReceiver.PendingResult i;
    private final i j;

    class a implements a0<List<i8.b>, m> {
        a(h hVar) {
        }

        /* renamed from: b */
        public m a(List<i8.b> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).a();
        }
    }

    public h(Context context, b bVar, s8 s8Var) {
        this(context, bVar, s8Var, context.getResources().getBoolean(R$bool.workmanager_test_configuration));
    }

    public h(Context context, b bVar, s8 s8Var, boolean z) {
        this.j = new i();
        Context applicationContext = context.getApplicationContext();
        WorkDatabase w = WorkDatabase.w(applicationContext, z);
        androidx.work.h.e(new h.a(bVar.f()));
        Context context2 = context;
        b bVar2 = bVar;
        s8 s8Var2 = s8Var;
        WorkDatabase workDatabase = w;
        List<d> f2 = f(applicationContext);
        o(context2, bVar2, s8Var2, workDatabase, f2, new c(context2, bVar2, s8Var2, workDatabase, f2));
    }

    public static void e(Context context, b bVar) {
        synchronized (m) {
            if (k != null) {
                if (l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (k == null) {
                Context applicationContext = context.getApplicationContext();
                if (l == null) {
                    l = new h(applicationContext, bVar, new t8());
                }
                k = l;
            }
        }
    }

    public static h i() {
        synchronized (m) {
            if (k != null) {
                h hVar = k;
                return hVar;
            }
            h hVar2 = l;
            return hVar2;
        }
    }

    private void o(Context context, b bVar, s8 s8Var, WorkDatabase workDatabase, List<d> list, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = bVar;
        this.d = s8Var;
        this.c = workDatabase;
        this.e = list;
        this.f = cVar;
        this.g = new f(applicationContext);
        this.h = false;
        this.d.c(new ForceStopRunnable(applicationContext, this));
    }

    public l b(String str, androidx.work.f fVar, List<j> list) {
        if (!list.isEmpty()) {
            return new f(this, str, fVar, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public LiveData<m> d(UUID uuid) {
        return this.j.c(d.a(this.c.D().o(Collections.singletonList(uuid.toString())), new a(this), this.d));
    }

    public List<d> f(Context context) {
        return Arrays.asList(new d[]{e.a(context, this), new f7(context, this)});
    }

    public Context g() {
        return this.a;
    }

    public b h() {
        return this.b;
    }

    public f j() {
        return this.g;
    }

    public c k() {
        return this.f;
    }

    public List<d> l() {
        return this.e;
    }

    public WorkDatabase m() {
        return this.c;
    }

    public s8 n() {
        return this.d;
    }

    public void p() {
        synchronized (m) {
            this.h = true;
            if (this.i != null) {
                this.i.finish();
                this.i = null;
            }
        }
    }

    public void q() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.c(g());
        }
        m().D().s();
        e.b(h(), m(), l());
    }

    public void r(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (m) {
            this.i = pendingResult;
            if (this.h) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public void s(String str) {
        t(str, (WorkerParameters.a) null);
    }

    public void t(String str, WorkerParameters.a aVar) {
        this.d.c(new g(this, str, aVar));
    }

    public void u(String str) {
        this.d.c(new androidx.work.impl.utils.h(this, str));
    }
}
