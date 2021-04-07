package com.zunjae.zrecyclerview;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class c {
    private final Context a;
    private final RecyclerView b;
    private final RecyclerView.g c;
    private int d = 1;
    private int e = -1;
    private a f = a.LINEAR;
    private RecyclerView.o g;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.zunjae.zrecyclerview.a[] r0 = com.zunjae.zrecyclerview.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.zunjae.zrecyclerview.a r1 = com.zunjae.zrecyclerview.a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.zunjae.zrecyclerview.a r1 = com.zunjae.zrecyclerview.a.GRID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.zunjae.zrecyclerview.a r1 = com.zunjae.zrecyclerview.a.STAGGERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.zrecyclerview.c.a.<clinit>():void");
        }
    }

    public c(Context context, RecyclerView recyclerView, RecyclerView.g gVar) {
        this.a = context;
        this.b = recyclerView;
        this.c = gVar;
    }

    public c a() {
        RecyclerView.o oVar;
        if (this.f != a.LINEAR && this.e < 0) {
            this.e = this.d;
        }
        int i = b.a(this.a) ? this.d : this.e;
        int i2 = a.a[this.f.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                oVar = new GridLayoutManager(this.a, i);
            } else if (i2 == 3) {
                oVar = new StaggeredGridLayoutManager(i, 0);
            } else {
                throw new IllegalArgumentException("incorrect enum set");
            }
            this.g = oVar;
        } else {
            this.g = new LinearLayoutManager(this.a);
        }
        this.b.setLayoutManager(this.g);
        this.b.setAdapter(this.c);
        return this;
    }

    public c b(int i) {
        this.d = i;
        return this;
    }

    public c c(int i, int i2) {
        this.e = i2;
        this.d = i;
        return this;
    }

    public c d(a aVar) {
        this.f = aVar;
        return this;
    }
}
