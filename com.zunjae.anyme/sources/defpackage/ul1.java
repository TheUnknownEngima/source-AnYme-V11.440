package defpackage;

import android.widget.Filter;
import com.mikepenz.fastadapter.d;
import com.mikepenz.fastadapter.e;
import com.mikepenz.fastadapter.l;
import com.mikepenz.fastadapter.m;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: ul1  reason: default package */
public class ul1<Model, Item extends l> extends Filter {
    private List<Item> a;
    private CharSequence b;
    private vl1<?, Item> c;
    protected zl1<Item> d;
    private m.a<Item> e;

    public ul1(vl1<?, Item> vl1) {
        this.c = vl1;
    }

    public CharSequence a() {
        return this.b;
    }

    public Filter.FilterResults performFiltering(@Nullable CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (this.a == null && (charSequence == null || charSequence.length() == 0)) {
            return filterResults;
        }
        for (d<Item> j : this.c.l().U()) {
            j.j(charSequence);
        }
        this.b = charSequence;
        if (this.a == null) {
            this.a = new ArrayList(this.c.i());
        }
        if (charSequence == null || charSequence.length() == 0) {
            List<Item> list = this.a;
            filterResults.values = list;
            filterResults.count = list.size();
            this.a = null;
            zl1<Item> zl1 = this.d;
            if (zl1 != null) {
                zl1.b();
            }
        } else {
            List<Item> arrayList = new ArrayList<>();
            if (this.e != null) {
                for (Item item : this.a) {
                    if (this.e.a(item, charSequence)) {
                        arrayList.add(item);
                    }
                }
            } else {
                arrayList = this.c.i();
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(@Nullable CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj = filterResults.values;
        if (obj != null) {
            this.c.D((List) obj, false, (e) null);
        }
        zl1<Item> zl1 = this.d;
        if (zl1 != null && this.a != null) {
            zl1.a(charSequence, (List) filterResults.values);
        }
    }
}
