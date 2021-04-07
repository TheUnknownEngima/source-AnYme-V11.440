package defpackage;

import android.util.SparseArray;
import com.mikepenz.fastadapter.l;
import com.mikepenz.fastadapter.q;

/* renamed from: pm1  reason: default package */
public class pm1<Item extends l> implements q<Item> {
    private final SparseArray<Item> a = new SparseArray<>();

    public boolean a(Item item) {
        if (this.a.indexOfKey(item.d()) >= 0) {
            return false;
        }
        this.a.put(item.d(), item);
        return true;
    }

    public Item get(int i) {
        return (l) this.a.get(i);
    }
}
