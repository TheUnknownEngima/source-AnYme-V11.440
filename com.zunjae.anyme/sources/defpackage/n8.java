package defpackage;

import android.database.Cursor;
import androidx.room.e;
import androidx.room.l;
import androidx.room.o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n8  reason: default package */
public final class n8 implements m8 {
    private final l a;
    private final e b;

    /* renamed from: n8$a */
    class a extends e<l8> {
        a(n8 n8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, l8 l8Var) {
            String str = l8Var.a;
            if (str == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, str);
            }
            String str2 = l8Var.b;
            if (str2 == null) {
                q6Var.bindNull(2);
            } else {
                q6Var.bindString(2, str2);
            }
        }
    }

    public n8(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public void a(l8 l8Var) {
        this.a.c();
        try {
            this.b.i(l8Var);
            this.a.v();
        } finally {
            this.a.h();
        }
    }

    public List<String> b(String str) {
        o h = o.h("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}
