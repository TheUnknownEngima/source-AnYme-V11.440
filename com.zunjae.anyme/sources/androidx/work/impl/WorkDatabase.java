package androidx.work.impl;

import android.content.Context;
import androidx.room.k;
import androidx.room.l;
import androidx.work.impl.g;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends l {
    private static final long l = TimeUnit.DAYS.toMillis(7);

    static class a extends l.b {
        a() {
        }

        public void c(m6 m6Var) {
            super.c(m6Var);
            m6Var.beginTransaction();
            try {
                m6Var.execSQL("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
                m6Var.execSQL(WorkDatabase.A());
                m6Var.setTransactionSuccessful();
            } finally {
                m6Var.endTransaction();
            }
        }
    }

    static String A() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + z() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public static WorkDatabase w(Context context, boolean z) {
        l.a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = k.c(context, cls);
            aVar.c();
        } else {
            aVar = k.a(context, cls, "androidx.work.workdb");
        }
        aVar.a(y());
        aVar.b(g.a);
        aVar.b(new g.d(context, 2, 3));
        aVar.b(g.b);
        aVar.b(g.c);
        aVar.e();
        return aVar.d();
    }

    static l.b y() {
        return new a();
    }

    static long z() {
        return System.currentTimeMillis() - l;
    }

    public abstract d8 B();

    public abstract g8 C();

    public abstract j8 D();

    public abstract m8 E();

    public abstract a8 x();
}
