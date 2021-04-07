package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: ip  reason: default package */
final /* synthetic */ class ip implements aq.b {
    private final long a;
    private final eo b;

    private ip(long j, eo eoVar) {
        this.a = j;
        this.b = eoVar;
    }

    public static aq.b b(long j, eo eoVar) {
        return new ip(j, eoVar);
    }

    public Object a(Object obj) {
        return aq.Y(this.a, this.b, (SQLiteDatabase) obj);
    }
}
