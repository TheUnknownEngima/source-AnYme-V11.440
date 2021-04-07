package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {
    g e;
    private int f = -1;
    private boolean g;
    private final boolean h;
    private final LayoutInflater i;
    private final int j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.h = z;
        this.i = layoutInflater;
        this.e = gVar;
        this.j = i2;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i x = this.e.x();
        if (x != null) {
            ArrayList<i> B = this.e.B();
            int size = B.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (B.get(i2) == x) {
                    this.f = i2;
                    return;
                }
            }
        }
        this.f = -1;
    }

    public g b() {
        return this.e;
    }

    /* renamed from: c */
    public i getItem(int i2) {
        ArrayList<i> B = this.h ? this.e.B() : this.e.G();
        int i3 = this.f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return B.get(i2);
    }

    public void d(boolean z) {
        this.g = z;
    }

    public int getCount() {
        ArrayList<i> B = this.h ? this.e.B() : this.e.G();
        int i2 = this.f;
        int size = B.size();
        return i2 < 0 ? size : size - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.i.inflate(this.j, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.e.H() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
