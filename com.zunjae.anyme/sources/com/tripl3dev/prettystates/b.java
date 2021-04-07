package com.tripl3dev.prettystates;

import android.util.SparseArray;

public final class b {
    /* access modifiers changed from: private */
    public static b b;
    public static final a c = new a((r62) null);
    private SparseArray<Integer> a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final b a() {
            if (b() != null) {
                b b = b();
                if (b != null) {
                    return b;
                }
                throw new r22("null cannot be cast to non-null type com.tripl3dev.prettystates.StatesConfigFactory");
            }
            throw new Throwable("Please use intialize fun in App Class OnCreate Method or Before get Instance Method");
        }

        public final b b() {
            return b.b;
        }

        public final b c() {
            if (b() == null) {
                d(new b((r62) null));
            }
            b b = b();
            if (b != null) {
                return b;
            }
            throw new r22("null cannot be cast to non-null type com.tripl3dev.prettystates.StatesConfigFactory");
        }

        public final void d(b bVar) {
            b.b = bVar;
        }
    }

    private b() {
        this.a = new SparseArray<>();
    }

    public /* synthetic */ b(r62 r62) {
        this();
    }

    public final b c(int i, int i2) {
        if (this.a.get(i) == null) {
            this.a.put(i, Integer.valueOf(i2));
        }
        return this;
    }

    public final int d(int i) {
        if (this.a.get(i) != null) {
            Integer num = this.a.get(i);
            if (num != null) {
                return num.intValue();
            }
            v62.l();
            throw null;
        }
        throw new Throwable("There isn't any stateView with that State Type");
    }

    public final b e() {
        this.a.put(-2531992, Integer.valueOf(R$layout.prettystates_default_empty_view));
        this.a.put(-2631992, Integer.valueOf(R$layout.prettystates_default_error_view));
        this.a.put(-2731992, Integer.valueOf(R$layout.prettystates_default_loading_view));
        this.a.put(-2431992, Integer.valueOf(R$id.state_view_layout));
        return this;
    }
}
