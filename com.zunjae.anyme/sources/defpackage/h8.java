package defpackage;

import androidx.room.e;
import androidx.room.l;

/* renamed from: h8  reason: default package */
public final class h8 implements g8 {
    private final l a;
    private final e b;

    /* renamed from: h8$a */
    class a extends e<f8> {
        a(h8 h8Var, l lVar) {
            super(lVar);
        }

        public String d() {
            return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: j */
        public void g(q6 q6Var, f8 f8Var) {
            String str = f8Var.a;
            if (str == null) {
                q6Var.bindNull(1);
            } else {
                q6Var.bindString(1, str);
            }
            String str2 = f8Var.b;
            if (str2 == null) {
                q6Var.bindNull(2);
            } else {
                q6Var.bindString(2, str2);
            }
        }
    }

    public h8(l lVar) {
        this.a = lVar;
        this.b = new a(this, lVar);
    }

    public void a(f8 f8Var) {
        this.a.c();
        try {
            this.b.i(f8Var);
            this.a.v();
        } finally {
            this.a.h();
        }
    }
}
