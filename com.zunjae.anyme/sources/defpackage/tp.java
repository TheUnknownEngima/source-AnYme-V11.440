package defpackage;

import android.database.Cursor;
import defpackage.aq;

/* renamed from: tp  reason: default package */
final /* synthetic */ class tp implements aq.b {
    private static final tp a = new tp();

    private tp() {
    }

    public static aq.b b() {
        return a;
    }

    public Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
