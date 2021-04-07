package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: xp  reason: default package */
final /* synthetic */ class xp implements aq.b {
    private final String a;

    private xp(String str) {
        this.a = str;
    }

    public static aq.b b(String str) {
        return new xp(str);
    }

    public Object a(Object obj) {
        return aq.V(this.a, (SQLiteDatabase) obj);
    }
}
