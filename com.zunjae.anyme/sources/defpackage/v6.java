package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: v6  reason: default package */
class v6 extends u6 implements q6 {
    private final SQLiteStatement f;

    v6(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f = sQLiteStatement;
    }

    public long executeInsert() {
        return this.f.executeInsert();
    }

    public int executeUpdateDelete() {
        return this.f.executeUpdateDelete();
    }
}
