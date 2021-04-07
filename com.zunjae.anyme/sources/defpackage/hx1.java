package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: hx1  reason: default package */
public final class hx1 {
    private final Type a;

    /* renamed from: hx1$a */
    public static final class a extends TypeToken<ArrayList<kx1>> {
        a() {
        }
    }

    public hx1() {
        Type type = new a().getType();
        v62.d(type, "object : TypeToken<Array…eJikanGenreR2>>() {}.type");
        this.a = type;
    }

    public final ArrayList<kx1> a(String str) {
        if (str == null) {
            return null;
        }
        return (ArrayList) new Gson().fromJson(str, this.a);
    }

    public final String b(ArrayList<kx1> arrayList) {
        if (arrayList == null) {
            return null;
        }
        return new Gson().toJson((Object) arrayList, this.a);
    }
}
