package androidx.work;

import java.util.List;

public abstract class g {
    private static final String a = h.f("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).newInstance();
        } catch (Exception e) {
            h c = h.c();
            String str2 = a;
            c.b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
