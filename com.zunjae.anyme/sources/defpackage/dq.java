package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.gq;

/* renamed from: dq  reason: default package */
final /* synthetic */ class dq implements gq.a {
    private static final dq a = new dq();

    private dq() {
    }

    public static gq.a b() {
        return a;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        gq.h(sQLiteDatabase);
    }
}
