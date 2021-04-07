package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.nodes.h;

/* renamed from: ag2  reason: default package */
public class ag2 extends ArrayList<h> {
    public ag2() {
    }

    public ag2(int i) {
        super(i);
    }

    public ag2(List<h> list) {
        super(list);
    }

    public String c(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.u(str)) {
                return hVar.d(str);
            }
        }
        return "";
    }

    /* renamed from: d */
    public ag2 clone() {
        ag2 ag2 = new ag2(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            ag2.add(((h) it.next()).q());
        }
        return ag2;
    }

    public h g() {
        if (isEmpty()) {
            return null;
        }
        return (h) get(0);
    }

    public String j() {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(hVar.y());
        }
        return sb.toString();
    }

    public ag2 n(String str) {
        return fg2.b(str, this);
    }

    public String o() {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (sb.length() != 0) {
                sb.append(" ");
            }
            sb.append(hVar.E0());
        }
        return sb.toString();
    }

    public String toString() {
        return j();
    }
}
