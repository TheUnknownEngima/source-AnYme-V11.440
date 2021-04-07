package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/* renamed from: gx1  reason: default package */
public final class gx1 {
    private final Type a;

    /* renamed from: gx1$a */
    public static final class a extends TypeToken<ox1> {
        a() {
        }
    }

    public gx1() {
        Type type = new a().getType();
        v62.d(type, "object : TypeToken<JikanAired>() {}.type");
        this.a = type;
    }

    public final ox1 a(String str) {
        if (str == null) {
            return null;
        }
        return (ox1) new Gson().fromJson(str, this.a);
    }

    public final String b(ox1 ox1) {
        if (ox1 == null) {
            return null;
        }
        return new Gson().toJson((Object) ox1, this.a);
    }
}
