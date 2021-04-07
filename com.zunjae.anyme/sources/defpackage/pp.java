package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: pp  reason: default package */
final /* synthetic */ class pp implements aq.d {
    private final SQLiteDatabase a;

    private pp(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public static aq.d b(SQLiteDatabase sQLiteDatabase) {
        return new pp(sQLiteDatabase);
    }

    public Object a() {
        return this.a.beginTransaction();
    }
}
