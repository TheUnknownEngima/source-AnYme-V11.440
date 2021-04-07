package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: zp  reason: default package */
final /* synthetic */ class zp implements aq.b {
    private final aq a;
    private final eo b;

    private zp(aq aqVar, eo eoVar) {
        this.a = aqVar;
        this.b = eoVar;
    }

    public static aq.b b(aq aqVar, eo eoVar) {
        return new zp(aqVar, eoVar);
    }

    public Object a(Object obj) {
        return aq.J(this.a, this.b, (SQLiteDatabase) obj);
    }
}
