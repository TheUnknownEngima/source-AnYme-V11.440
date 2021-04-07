package com.zunjae.anyme.features.niche.bulk_delete;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import defpackage.og2;
import java.util.ArrayList;
import java.util.List;

public final class BulkDeleteAnimeService extends IntentService implements og2 {
    /* access modifiers changed from: private */
    public static boolean i;
    public static final c j = new c((r62) null);
    private final int e = 2500;
    private final d22 f = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final ArrayList<b> g = new ArrayList<>();
    private final d22 h = g22.b(new b(m().c(), (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<hy1> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [hy1, java.lang.Object] */
        public final hy1 invoke() {
            return this.f.e(f72.b(hy1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<ov1> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ov1] */
        public final ov1 invoke() {
            return this.f.e(f72.b(ov1.class), this.g, this.h);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final Intent a(Context context, ArrayList<Integer> arrayList) {
            v62.e(context, "source");
            v62.e(arrayList, "selectedIDs");
            Intent intent = new Intent(context, BulkDeleteAnimeService.class);
            intent.putExtra("selectedIDs", arrayList);
            return intent;
        }

        public final void b(boolean z) {
            BulkDeleteAnimeService.i = z;
        }
    }

    public BulkDeleteAnimeService() {
        super("BulkDeleteAnimeService");
        Class<BulkDeleteAnimeService> cls = BulkDeleteAnimeService.class;
    }

    private final hy1 b() {
        return (hy1) this.f.getValue();
    }

    private final ov1 c() {
        return (ov1) this.h.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        List<sy1> h2 = c().h();
        v62.c(intent);
        ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selectedIDs");
        if (integerArrayListExtra != null) {
            v62.d(integerArrayListExtra, "intent!!.getIntegerArray…ectly set the arguments\")");
            int i2 = 0;
            for (sy1 next : h2) {
                if (integerArrayListExtra.contains(Integer.valueOf(next.i()))) {
                    this.g.add(new b(next.i(), next.y()));
                    i2++;
                    cw1.k.a().p(new bv1(next.y(), i2, integerArrayListExtra.size(), ((integerArrayListExtra.size() - i2) * this.e) / 1000));
                    if (!i) {
                        break;
                    }
                    try {
                        int b2 = b().b(next.i());
                        if (200 <= b2) {
                            if (299 >= b2) {
                                c().m(next);
                                Thread.sleep((long) this.e);
                            }
                        }
                        cw1 a2 = cw1.k.a();
                        a2.p(new cv1("Could not delete " + next + ".seriesTitle"));
                        Thread.sleep((long) this.e);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            cw1.k.a().p(new yu1());
            return;
        }
        throw new NullPointerException("Incorrectly set the arguments");
    }
}
