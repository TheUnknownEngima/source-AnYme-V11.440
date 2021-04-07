package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: vp  reason: default package */
final /* synthetic */ class vp implements aq.b {
    private final aq a;
    private final eo b;
    private final zn c;

    private vp(aq aqVar, eo eoVar, zn znVar) {
        this.a = aqVar;
        this.b = eoVar;
        this.c = znVar;
    }

    public static aq.b b(aq aqVar, eo eoVar, zn znVar) {
        return new vp(aqVar, eoVar, znVar);
    }

    public Object a(Object obj) {
        return aq.Q(this.a, this.b, this.c, (SQLiteDatabase) obj);
    }
}
