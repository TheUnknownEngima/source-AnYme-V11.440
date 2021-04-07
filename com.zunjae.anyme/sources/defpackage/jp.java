package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: jp  reason: default package */
final /* synthetic */ class jp implements aq.b {
    private final aq a;
    private final eo b;

    private jp(aq aqVar, eo eoVar) {
        this.a = aqVar;
        this.b = eoVar;
    }

    public static aq.b b(aq aqVar, eo eoVar) {
        return new jp(aqVar, eoVar);
    }

    public Object a(Object obj) {
        return aq.M(this.a, this.b, (SQLiteDatabase) obj);
    }
}
