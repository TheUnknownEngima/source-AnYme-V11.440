package defpackage;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b8  reason: default package */
public final class b8 implements a8 {
    private final l a;
    private final e b;

    /* renamed from: b8$a */
    class a extends e<z7> {
        a(b8 b8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, z7 z7Var) {
            String str = z7Var.a;
            if (str == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, str);
            }
            String str2 = z7Var.b;
            if (str2 == null) {
                q6Var.bindNull(2);
            } else {
                q6Var.bindString(2, str2);
            }
        }
    }

    public b8(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public void a(z7 z7Var) {
        this.a.c();
        try {
            this.b.i(z7Var);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public List<String> b(String str) {
        o h = o.h("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h.bindNull(1);
        } else {
            h.bindString(1, str);
        }
        Cursor t = this.a.t(h);
        try {
            ArrayList arrayList = new ArrayList(t.getCount());
            while (t.moveToNext()) {
                arrayList.add(t.getString(0));
            }
            return arrayList;
        } finally {
            t.close();
            h.l();
        }
    }

    public boolean c(String str) {
        boolean z = true;
        o h = o.h("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            h.bindNull(1);
        } else {
            h.bindString(1, str);
        }
        Cursor t = this.a.t(h);
        try {
            boolean z2 = false;
            if (t.moveToFirst()) {
                if (t.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            t.close();
            h.l();
        }
    }

    public boolean d(String str) {
        boolean z = true;
        o h = o.h("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h.bindNull(1);
        } else {
            h.bindString(1, str);
        }
        Cursor t = this.a.t(h);
        try {
            boolean z2 = false;
            if (t.moveToFirst()) {
                if (t.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            t.close();
            h.l();
        }
    }
}
