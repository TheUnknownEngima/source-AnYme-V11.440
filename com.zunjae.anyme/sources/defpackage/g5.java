package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.h5;

/* renamed from: g5  reason: default package */
public abstract class g5 extends BaseAdapter implements Filterable, h5.a {
    protected boolean e;
    protected boolean f;
    protected Cursor g;
    protected Context h;
    protected int i;
    protected a j;
    protected DataSetObserver k;
    protected h5 l;

    /* renamed from: g5$a */
    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            g5.this.i();
        }
    }

    /* renamed from: g5$b */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            g5 g5Var = g5.this;
            g5Var.e = true;
            g5Var.notifyDataSetChanged();
        }

        public void onInvalidated() {
            g5 g5Var = g5.this;
            g5Var.e = false;
            g5Var.notifyDataSetInvalidated();
        }
    }

    public g5(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j2 = j(cursor);
        if (j2 != null) {
            j2.close();
        }
    }

    public Cursor b() {
        return this.g;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i2) {
        b bVar;
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f = true;
        } else {
            this.f = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.g = cursor;
        this.e = z;
        this.h = context;
        this.i = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.j = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.j = null;
        }
        this.k = bVar;
        if (z) {
            a aVar = this.j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.e || (cursor = this.g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.e) {
            return null;
        }
        this.g.moveToPosition(i2);
        if (view == null) {
            view = g(this.h, this.g, viewGroup);
        }
        e(view, this.h, this.g);
        return view;
    }

    public Filter getFilter() {
        if (this.l == null) {
            this.l = new h5(this);
        }
        return this.l;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.e || (cursor = this.g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.g;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.e || (cursor = this.g) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.g.getLong(this.i);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.g.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.h, this.g, viewGroup);
            }
            e(view, this.h, this.g);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f && (cursor = this.g) != null && !cursor.isClosed()) {
            this.e = this.g.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.j;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.g = cursor;
        if (cursor != null) {
            a aVar2 = this.j;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.i = cursor.getColumnIndexOrThrow("_id");
            this.e = true;
            notifyDataSetChanged();
        } else {
            this.i = -1;
            this.e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
