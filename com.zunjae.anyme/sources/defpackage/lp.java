package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.aq;

/* renamed from: lp  reason: default package */
final /* synthetic */ class lp implements aq.b {
    private final long a;

    private lp(long j) {
        this.a = j;
    }

    public static aq.b b(long j) {
        return new lp(j);
    }

    public Object a(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.a)}));
    }
}
