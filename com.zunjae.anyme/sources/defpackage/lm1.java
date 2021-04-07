package defpackage;

import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.j;
import java.util.List;

/* renamed from: lm1  reason: default package */
public abstract class lm1<Identifiable extends j> implements i<Identifiable> {
    public Identifiable a(Identifiable identifiable) {
        if (identifiable.c() == -1) {
            identifiable.m(c(identifiable));
        }
        return identifiable;
    }

    public List<Identifiable> b(List<Identifiable> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((j) list.get(i));
        }
        return list;
    }

    public Identifiable[] d(Identifiable... identifiableArr) {
        for (Identifiable a : identifiableArr) {
            a(a);
        }
        return identifiableArr;
    }
}
