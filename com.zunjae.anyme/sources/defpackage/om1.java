package defpackage;

import com.mikepenz.fastadapter.e;
import com.mikepenz.fastadapter.l;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: om1  reason: default package */
public class om1<Item extends l> extends nm1<Item> {
    protected List<Item> b;

    public om1() {
        this(new ArrayList());
    }

    public om1(List<Item> list) {
        this.b = list;
    }

    public int a(long j) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((l) this.b.get(i)).c() == j) {
                return i;
            }
        }
        return -1;
    }

    public void b(int i, int i2) {
        this.b.remove(i - i2);
        if (k() != null) {
            k().r0(i);
        }
    }

    public void c(List<Item> list, int i, @Nullable e eVar) {
        int size = list.size();
        int size2 = this.b.size();
        List<Item> list2 = this.b;
        if (list != list2) {
            if (!list2.isEmpty()) {
                this.b.clear();
            }
            this.b.addAll(list);
        }
        if (k() != null) {
            if (eVar == null) {
                eVar = e.a;
            }
            eVar.a(k(), size, size2, i);
        }
    }

    public void d(int i) {
        int size = this.b.size();
        this.b.clear();
        if (k() != null) {
            k().q0(i, size);
        }
    }

    public void e(List<Item> list, boolean z) {
        this.b = new ArrayList(list);
        if (k() != null && z) {
            k().k0();
        }
    }

    public void f(int i, List<Item> list, int i2) {
        this.b.addAll(i - i2, list);
        if (k() != null) {
            k().p0(i, list.size());
        }
    }

    public void g(List<Item> list, int i) {
        int size = this.b.size();
        this.b.addAll(list);
        if (k() != null) {
            k().p0(i + size, list.size());
        }
    }

    public List<Item> h() {
        return this.b;
    }

    public void j(int i, int i2, int i3) {
        int min = Math.min(i2, (this.b.size() - i) + i3);
        for (int i4 = 0; i4 < min; i4++) {
            this.b.remove(i - i3);
        }
        if (k() != null) {
            k().q0(i, min);
        }
    }

    /* renamed from: m */
    public Item get(int i) {
        return (l) this.b.get(i);
    }

    /* renamed from: n */
    public void i(int i, Item item, int i2) {
        this.b.set(i - i2, item);
        if (k() != null) {
            k().l0(i);
        }
    }

    public int size() {
        return this.b.size();
    }
}
