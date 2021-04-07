package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.b;
import java.util.List;

public class e {
    private static final String a = h.f("Schedulers");

    @SuppressLint({"NewApi"})
    static d a(Context context, h hVar) {
        d dVar;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23) {
            dVar = new b(context, hVar);
            androidx.work.impl.utils.e.a(context, SystemJobService.class, true);
            h.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            z = false;
        } else {
            dVar = new f(context);
            h.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        }
        androidx.work.impl.utils.e.a(context, SystemAlarmService.class, z);
        return dVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<d> list) {
        if (list != null && list.size() != 0) {
            j8 D = workDatabase.D();
            workDatabase.c();
            try {
                List<i8> d = D.d(bVar.d());
                if (d != null && d.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (i8 i8Var : d) {
                        D.b(i8Var.a, currentTimeMillis);
                    }
                }
                workDatabase.v();
                if (d != null && d.size() > 0) {
                    i8[] i8VarArr = (i8[]) d.toArray(new i8[0]);
                    for (d a2 : list) {
                        a2.a(i8VarArr);
                    }
                }
            } finally {
                workDatabase.h();
            }
        }
    }
}
