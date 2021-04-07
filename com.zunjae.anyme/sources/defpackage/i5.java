package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: i5  reason: default package */
public abstract class i5 extends g5 {
    private int m;
    private int n;
    private LayoutInflater o;

    @Deprecated
    public i5(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.n = i;
        this.m = i;
        this.o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.o.inflate(this.n, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.o.inflate(this.m, viewGroup, false);
    }
}
