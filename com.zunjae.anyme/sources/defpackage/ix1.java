package defpackage;

import com.google.gson.Gson;

/* renamed from: ix1  reason: default package */
public final class ix1 {
    public final qx1 a(String str) {
        if (str == null) {
            return null;
        }
        return (qx1) new Gson().fromJson(str, qx1.class);
    }

    public final String b(qx1 qx1) {
        if (qx1 == null) {
            return null;
        }
        return new Gson().toJson((Object) qx1);
    }
}
