package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.f;

public class j {
    private final SparseIntArray a = new SparseIntArray();
    private f b;

    public j(f fVar) {
        r.j(fVar);
        this.b = fVar;
    }

    public void a() {
        this.a.clear();
    }

    public int b(Context context, a.f fVar) {
        r.j(context);
        r.j(fVar);
        int i = 0;
        if (!fVar.l()) {
            return 0;
        }
        int m = fVar.m();
        int i2 = this.a.get(m, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.a.keyAt(i3);
            if (keyAt > m && this.a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.b.h(context, m);
        }
        this.a.put(m, i);
        return i;
    }
}
