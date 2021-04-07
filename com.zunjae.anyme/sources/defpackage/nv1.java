package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: nv1  reason: default package */
public final class nv1 {
    public static final nv1 a = new nv1();

    private nv1() {
    }

    private final void c(int i) {
        l02.r("@@AdBlocker_DAO_list_version", i);
    }

    public final int a() {
        return l02.g("@@AdBlocker_DAO_list_version", 0);
    }

    public final ArrayList<String> b() {
        ArrayList<String> f = l02.f("@@AdBlocker_DAO", String.class);
        v62.d(f, "ZimpleDB.getGenericList(…LIST, String::class.java)");
        return f;
    }

    public final void d(List<String> list, int i) {
        v62.e(list, "badUrls");
        l02.q("@@AdBlocker_DAO", list);
        c(i);
        uj2.a("[saveList] Saved version " + i, new Object[0]);
        uj2.a("[saveList] New list contains " + list.size() + " entries.", new Object[0]);
    }
}
