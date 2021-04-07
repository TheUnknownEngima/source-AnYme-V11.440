package defpackage;

import android.database.Cursor;
import defpackage.aq;
import java.util.List;

/* renamed from: mp  reason: default package */
final /* synthetic */ class mp implements aq.b {
    private final aq a;
    private final List b;
    private final eo c;

    private mp(aq aqVar, List list, eo eoVar) {
        this.a = aqVar;
        this.b = list;
        this.c = eoVar;
    }

    public static aq.b b(aq aqVar, List list, eo eoVar) {
        return new mp(aqVar, list, eoVar);
    }

    public Object a(Object obj) {
        return aq.N(this.a, this.b, this.c, (Cursor) obj);
    }
}
