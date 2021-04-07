package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: g10  reason: default package */
public class g10 {
    public final int a;
    public final int b;
    public final List<o10> c;
    public final List<j10> d;
    public final List<j10> e;
    public final List<j10> f;

    public g10(int i, int i2, List<o10> list, List<j10> list2, List<j10> list3, List<j10> list4) {
        this.a = i;
        this.b = i2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
    }
}
