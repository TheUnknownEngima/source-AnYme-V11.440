package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: yw1  reason: default package */
public final class yw1 {
    private final Type a;

    /* renamed from: yw1$a */
    public static final class a extends TypeToken<ArrayList<String>> {
        a() {
        }
    }

    public yw1() {
        Type type = new a().getType();
        v62.d(type, "object : TypeToken<ArrayList<String>>() {}.type");
        this.a = type;
    }

    public final ArrayList<String> a(String str) {
        if (str == null) {
            return null;
        }
        return (ArrayList) new Gson().fromJson(str, this.a);
    }

    public final String b(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return null;
        }
        return new Gson().toJson((Object) arrayList, this.a);
    }
}
