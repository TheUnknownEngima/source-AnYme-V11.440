package defpackage;

import android.database.Cursor;
import defpackage.aq;
import java.util.Map;

/* renamed from: op  reason: default package */
final /* synthetic */ class op implements aq.b {
    private final Map a;

    private op(Map map) {
        this.a = map;
    }

    public static aq.b b(Map map) {
        return new op(map);
    }

    public Object a(Object obj) {
        return aq.P(this.a, (Cursor) obj);
    }
}
