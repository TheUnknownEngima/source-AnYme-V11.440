package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.gq;

/* renamed from: eq  reason: default package */
final /* synthetic */ class eq implements gq.a {
    private static final eq a = new eq();

    private eq() {
    }

    public static gq.a b() {
        return a;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
