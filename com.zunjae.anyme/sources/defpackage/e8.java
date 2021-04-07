package defpackage;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import androidx.room.s;

/* renamed from: e8  reason: default package */
public final class e8 implements d8 {
    private final l a;
    private final e b;
    private final s c;

    /* renamed from: e8$a */
    class a extends e<c8> {
        a(e8 e8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, c8 c8Var) {
            String str = c8Var.a;
            if (str == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, str);
            }
            q6Var.bindLong(2, (long) c8Var.b);
        }
    }

    /* renamed from: e8$b */
    class b extends s {
        b(e8 e8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public e8(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
        this.c = new b(this, lVar);
    }

    public void a(c8 c8Var) {
        this.a.c();
        try {
            this.b.i(c8Var);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public c8 b(String str) {
        o h = o.h("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            h.bindNull(1);
        } else {
            h.bindString(1, str);
        }
        Cursor t = this.a.t(h);
        try {
            return t.moveToFirst() ? new c8(t.getString(t.getColumnIndexOrThrow("work_spec_id")), t.getInt(t.getColumnIndexOrThrow("system_id"))) : null;
        } finally {
            t.close();
            h.l();
        }
    }

    public void c(String str) {
        q6 a2 = this.c.a();
        this.a.c();
        if (str == null) {
            try {
                a2.bindNull(1);
            } catch (Throwable th) {
                this.a.h();
                this.c.f(a2);
                throw th;
            }
        } else {
            a2.bindString(1, str);
        }
        a2.executeUpdateDelete();
        this.a.v();
        this.a.h();
        this.c.f(a2);
    }
}
