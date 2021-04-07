package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: u6  reason: default package */
class u6 implements o6 {
    private final SQLiteProgram e;

    u6(SQLiteProgram sQLiteProgram) {
        this.e = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.e.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.e.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.e.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.e.bindNull(i);
    }

    public void bindString(int i, String str) {
        this.e.bindString(i, str);
    }

    public void close() {
        this.e.close();
    }
}
