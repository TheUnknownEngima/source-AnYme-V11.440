package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: l10  reason: default package */
public class l10 {
    public final String a;
    public final long b;
    public final List<g10> c;
    public final List<k10> d;

    public l10(String str, long j, List<g10> list, List<k10> list2) {
        this(str, j, list, list2, (j10) null);
    }

    public l10(String str, long j, List<g10> list, List<k10> list2, j10 j10) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.c.get(i2).b == i) {
                return i2;
            }
        }
        return -1;
    }
}
