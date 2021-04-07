package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dx1  reason: default package */
public final class dx1 {
    public static final dx1 a = new dx1();

    private dx1() {
    }

    private final String a(String str, String str2) {
        int hashCode = str.hashCode();
        if (hashCode != 3202370) {
            if (hashCode != 65966797) {
                if (hashCode == 94750088 && str.equals("click")) {
                    return ax1.c.a(str2);
                }
            } else if (str.equals("scrollInto")) {
                return ax1.c.d(str2);
            }
        } else if (str.equals("hide")) {
            return ax1.c.c(str2);
        }
        return null;
    }

    public final List<String> b(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String U : list) {
            List U2 = g92.U(U, new String[]{"♥"}, false, 0, 6, (Object) null);
            String a2 = a.a((String) U2.get(0), (String) U2.get(1));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
