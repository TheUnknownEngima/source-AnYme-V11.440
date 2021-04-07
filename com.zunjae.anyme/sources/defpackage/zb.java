package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: zb  reason: default package */
public class zb<T> {
    private List<T> a;
    private List<File> b;

    public zb(List<T> list, List<File> list2) {
        this.a = list;
        this.b = list2;
    }

    public List<T> a() {
        return this.a;
    }

    public List<File> b() {
        return this.b;
    }

    public boolean c() {
        return !this.a.isEmpty();
    }
}
