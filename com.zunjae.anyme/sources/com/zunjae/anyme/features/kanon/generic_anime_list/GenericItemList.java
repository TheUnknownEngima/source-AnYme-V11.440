package com.zunjae.anyme.features.kanon.generic_anime_list;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.niche.c;
import java.util.HashMap;
import java.util.List;
import org.aviran.cookiebar2.a;

public final class GenericItemList extends AbstractActivity {
    public static final d M = new d((r62) null);
    private final d22 D = g22.b(new c(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 F = g22.b(new b(this, (oh2) null, (o52) null));
    private a9<vy1> G = b9.a();
    private com.zunjae.bunpaginate.a H;
    /* access modifiers changed from: private */
    public int I;
    private c J;
    /* access modifiers changed from: private */
    public String K;
    private HashMap L;

    public static final class a extends w62 implements o52<ov1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, ov1] */
        public final ov1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(ov1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<hy1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [hy1, java.lang.Object] */
        public final hy1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(hy1.class), this.g, this.h);
        }
    }

    public static final class c extends w62 implements o52<qu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(r62 r62) {
            this();
        }

        public static /* synthetic */ Intent b(d dVar, Context context, c cVar, int i, String str, String str2, int i2, Object obj) {
            return dVar.a(context, cVar, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
        }

        public final Intent a(Context context, c cVar, int i, String str, String str2) {
            v62.e(context, "context");
            v62.e(cVar, "datasetType");
            Intent intent = new Intent(context, GenericItemList.class);
            intent.putExtra("identifier", i);
            intent.putExtra("datasetType", cVar.getId());
            intent.putExtra("query", str);
            intent.putExtra("title", str2);
            return intent;
        }

        public final Intent c(Context context, String str) {
            v62.e(context, "context");
            v62.e(str, "name");
            c cVar = c.UserProfile;
            return a(context, cVar, 0, str, str + "'s Profile");
        }
    }

    static final class e extends w62 implements z52<ve2<GenericItemList>, u22> {
        final /* synthetic */ GenericItemList f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<GenericItemList, u22> {
            final /* synthetic */ e f;
            final /* synthetic */ List g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar, List list) {
                super(1);
                this.f = eVar;
                this.g = list;
            }

            public final void a(GenericItemList genericItemList) {
                v62.e(genericItemList, "it");
                this.f.f.x0(this.g);
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f.f.l0(C0275R$id.swipeRefreshLayout);
                v62.d(swipeRefreshLayout, "swipeRefreshLayout");
                swipeRefreshLayout.setRefreshing(false);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((GenericItemList) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GenericItemList genericItemList, int i) {
            super(1);
            this.f = genericItemList;
            this.g = i;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x012e, code lost:
            r8 = r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(defpackage.ve2<com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList> r22) {
            /*
                r21 = this;
                r1 = r21
                r2 = r22
                java.lang.String r3 = " ("
                java.lang.String r0 = "$receiver"
                defpackage.v62.e(r2, r0)
                r4 = 41
                r5 = 1
                r6 = 0
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.c r0 = com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList.t0(r0)     // Catch:{ Exception -> 0x01b5 }
                int[] r7 = com.zunjae.anyme.features.kanon.generic_anime_list.a.a     // Catch:{ Exception -> 0x01b5 }
                int r0 = r0.ordinal()     // Catch:{ Exception -> 0x01b5 }
                r0 = r7[r0]     // Catch:{ Exception -> 0x01b5 }
                r7 = 10
                switch(r0) {
                    case 1: goto L_0x0195;
                    case 2: goto L_0x017a;
                    case 3: goto L_0x015f;
                    case 4: goto L_0x014c;
                    case 5: goto L_0x0133;
                    case 6: goto L_0x0103;
                    case 7: goto L_0x00d2;
                    case 8: goto L_0x002c;
                    case 9: goto L_0x0026;
                    default: goto L_0x0022;
                }     // Catch:{ Exception -> 0x01b5 }
            L_0x0022:
                j22 r0 = new j22     // Catch:{ Exception -> 0x01b5 }
                goto L_0x01b1
            L_0x0026:
                k22 r0 = new k22     // Catch:{ Exception -> 0x01b5 }
                r0.<init>(r6, r5, r6)     // Catch:{ Exception -> 0x01b5 }
                throw r0     // Catch:{ Exception -> 0x01b5 }
            L_0x002c:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                hy1 r0 = r0.R()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r8 = r1.f     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r8 = r8.K     // Catch:{ Exception -> 0x01b5 }
                defpackage.v62.c(r8)     // Catch:{ Exception -> 0x01b5 }
                java.util.ArrayList r0 = r0.c(r8)     // Catch:{ Exception -> 0x01b5 }
                if (r0 == 0) goto L_0x01b9
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x01b5 }
                int r7 = defpackage.g32.l(r0, r7)     // Catch:{ Exception -> 0x01b5 }
                r8.<init>(r7)     // Catch:{ Exception -> 0x01b5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01b5 }
            L_0x004e:
                boolean r7 = r0.hasNext()     // Catch:{ Exception -> 0x01b5 }
                if (r7 == 0) goto L_0x01ba
                java.lang.Object r7 = r0.next()     // Catch:{ Exception -> 0x01b5 }
                sy1 r7 = (defpackage.sy1) r7     // Catch:{ Exception -> 0x01b5 }
                int r9 = r7.n()     // Catch:{ Exception -> 0x01b5 }
                r10 = 6
                if (r9 != r10) goto L_0x006e
                sy1$a r9 = defpackage.sy1.r     // Catch:{ Exception -> 0x01b5 }
                int r10 = r7.n()     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r9 = r9.c(r10)     // Catch:{ Exception -> 0x01b5 }
            L_0x006b:
                r19 = r9
                goto L_0x0092
            L_0x006e:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
                r9.<init>()     // Catch:{ Exception -> 0x01b5 }
                sy1$a r10 = defpackage.sy1.r     // Catch:{ Exception -> 0x01b5 }
                int r11 = r7.n()     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r10 = r10.c(r11)     // Catch:{ Exception -> 0x01b5 }
                r9.append(r10)     // Catch:{ Exception -> 0x01b5 }
                r9.append(r3)     // Catch:{ Exception -> 0x01b5 }
                int r10 = r7.m()     // Catch:{ Exception -> 0x01b5 }
                r9.append(r10)     // Catch:{ Exception -> 0x01b5 }
                r9.append(r4)     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01b5 }
                goto L_0x006b
            L_0x0092:
                vy1 r9 = new vy1     // Catch:{ Exception -> 0x01b5 }
                int r11 = r7.i()     // Catch:{ Exception -> 0x01b5 }
                int r10 = r7.m()     // Catch:{ Exception -> 0x01b5 }
                double r12 = (double) r10     // Catch:{ Exception -> 0x01b5 }
                r14 = 0
                java.lang.String r15 = r7.w()     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r16 = r7.y()     // Catch:{ Exception -> 0x01b5 }
                int r17 = r7.u()     // Catch:{ Exception -> 0x01b5 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b5 }
                r10.<init>()     // Catch:{ Exception -> 0x01b5 }
                int r5 = r7.p()     // Catch:{ Exception -> 0x01b5 }
                r10.append(r5)     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r5 = " / "
                r10.append(r5)     // Catch:{ Exception -> 0x01b5 }
                int r5 = r7.u()     // Catch:{ Exception -> 0x01b5 }
                r10.append(r5)     // Catch:{ Exception -> 0x01b5 }
                java.lang.String r18 = r10.toString()     // Catch:{ Exception -> 0x01b5 }
                r20 = 1
                r10 = r9
                r10.<init>(r11, r12, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01b5 }
                r8.add(r9)     // Catch:{ Exception -> 0x01b5 }
                r5 = 1
                goto L_0x004e
            L_0x00d2:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                ov1 r0 = r0.y0()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r5 = r1.f     // Catch:{ Exception -> 0x01b5 }
                int r5 = r5.I     // Catch:{ Exception -> 0x01b5 }
                java.util.List r0 = r0.i(r5)     // Catch:{ Exception -> 0x01b5 }
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x01b5 }
                int r5 = defpackage.g32.l(r0, r7)     // Catch:{ Exception -> 0x01b5 }
                r8.<init>(r5)     // Catch:{ Exception -> 0x01b5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01b5 }
            L_0x00ef:
                boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x01b5 }
                if (r5 == 0) goto L_0x01ba
                java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x01b5 }
                sy1 r5 = (defpackage.sy1) r5     // Catch:{ Exception -> 0x01b5 }
                vy1 r5 = r5.j0()     // Catch:{ Exception -> 0x01b5 }
                r8.add(r5)     // Catch:{ Exception -> 0x01b5 }
                goto L_0x00ef
            L_0x0103:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                ov1 r0 = r0.y0()     // Catch:{ Exception -> 0x01b5 }
                java.util.List r0 = r0.D()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r5 = r1.f     // Catch:{ Exception -> 0x01b5 }
                ov1 r5 = r5.y0()     // Catch:{ Exception -> 0x01b5 }
                java.util.List r5 = r5.b()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.k r7 = new com.zunjae.anyme.features.kanon.k     // Catch:{ Exception -> 0x01b5 }
                r7.<init>(r0, r5)     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.e r0 = r0.U()     // Catch:{ Exception -> 0x01b5 }
                ai2 r0 = r0.L(r7)     // Catch:{ Exception -> 0x01b5 }
                qi2 r0 = r0.h()     // Catch:{ Exception -> 0x01b5 }
                java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x01b5 }
            L_0x012e:
                r8 = r0
                java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x01b5 }
                goto L_0x01ba
            L_0x0133:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.e r0 = r0.U()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r5 = r1.f     // Catch:{ Exception -> 0x01b5 }
                int r5 = r5.I     // Catch:{ Exception -> 0x01b5 }
                ai2 r0 = r0.i(r5)     // Catch:{ Exception -> 0x01b5 }
                qi2 r0 = r0.h()     // Catch:{ Exception -> 0x01b5 }
                java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x01b5 }
                goto L_0x012e
            L_0x014c:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.e r0 = r0.U()     // Catch:{ Exception -> 0x01b5 }
                ai2 r0 = r0.O()     // Catch:{ Exception -> 0x01b5 }
                qi2 r0 = r0.h()     // Catch:{ Exception -> 0x01b5 }
                java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x01b5 }
                goto L_0x012e
            L_0x015f:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.e r0 = r0.U()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r5 = r1.f     // Catch:{ Exception -> 0x01b5 }
                int r5 = r5.I     // Catch:{ Exception -> 0x01b5 }
                int r7 = r1.g     // Catch:{ Exception -> 0x01b5 }
                ai2 r0 = r0.w(r5, r7)     // Catch:{ Exception -> 0x01b5 }
                qi2 r0 = r0.h()     // Catch:{ Exception -> 0x01b5 }
                java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x01b5 }
                goto L_0x012e
            L_0x017a:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.e r0 = r0.U()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r5 = r1.f     // Catch:{ Exception -> 0x01b5 }
                int r5 = r5.I     // Catch:{ Exception -> 0x01b5 }
                int r7 = r1.g     // Catch:{ Exception -> 0x01b5 }
                ai2 r0 = r0.C(r5, r7)     // Catch:{ Exception -> 0x01b5 }
                qi2 r0 = r0.h()     // Catch:{ Exception -> 0x01b5 }
                java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x01b5 }
                goto L_0x012e
            L_0x0195:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.e r0 = r0.U()     // Catch:{ Exception -> 0x01b5 }
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r5 = r1.f     // Catch:{ Exception -> 0x01b5 }
                int r5 = r5.I     // Catch:{ Exception -> 0x01b5 }
                int r7 = r1.g     // Catch:{ Exception -> 0x01b5 }
                ai2 r0 = r0.g(r5, r7)     // Catch:{ Exception -> 0x01b5 }
                qi2 r0 = r0.h()     // Catch:{ Exception -> 0x01b5 }
                java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x01b5 }
                goto L_0x012e
            L_0x01b1:
                r0.<init>()     // Catch:{ Exception -> 0x01b5 }
                throw r0     // Catch:{ Exception -> 0x01b5 }
            L_0x01b5:
                r0 = move-exception
                defpackage.uj2.d(r0)
            L_0x01b9:
                r8 = r6
            L_0x01ba:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f
                com.zunjae.anyme.features.kanon.generic_anime_list.c r0 = com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList.t0(r0)
                boolean r0 = r0.getInjectMyStats()
                if (r0 == 0) goto L_0x0229
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList r0 = r1.f
                ov1 r0 = r0.y0()
                java.util.List r0 = r0.X()
                if (r8 == 0) goto L_0x0229
                java.util.Iterator r5 = r8.iterator()
            L_0x01d6:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x0229
                java.lang.Object r7 = r5.next()
                vy1 r7 = (defpackage.vy1) r7
                java.util.Iterator r9 = r0.iterator()
            L_0x01e6:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0203
                java.lang.Object r10 = r9.next()
                r11 = r10
                ty1 r11 = (defpackage.ty1) r11
                int r11 = r11.a()
                int r12 = r7.e()
                if (r11 != r12) goto L_0x01ff
                r11 = 1
                goto L_0x0200
            L_0x01ff:
                r11 = 0
            L_0x0200:
                if (r11 == 0) goto L_0x01e6
                goto L_0x0204
            L_0x0203:
                r10 = r6
            L_0x0204:
                ty1 r10 = (defpackage.ty1) r10
                if (r10 == 0) goto L_0x01d6
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = r10.c()
                r9.append(r11)
                r9.append(r3)
                int r10 = r10.b()
                r9.append(r10)
                r9.append(r4)
                java.lang.String r9 = r9.toString()
                r7.j(r9)
                goto L_0x01d6
            L_0x0229:
                com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList$e$a r0 = new com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList$e$a
                r0.<init>(r1, r8)
                defpackage.we2.a(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList.e.a(ve2):void");
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    public static final class f extends com.zunjae.bunpaginate.a {
        final /* synthetic */ GenericItemList d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GenericItemList genericItemList, RecyclerView recyclerView, int i) {
            super(recyclerView, i);
            this.d = genericItemList;
        }

        public boolean e() {
            return this.d.z0().D();
        }

        public boolean f() {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.d.l0(C0275R$id.swipeRefreshLayout);
            v62.d(swipeRefreshLayout, "swipeRefreshLayout");
            return swipeRefreshLayout.i();
        }

        public void g(int i) {
            GenericItemList genericItemList = this.d;
            genericItemList.A0(GenericItemList.u0(genericItemList).c());
        }
    }

    static final class g implements org.aviran.cookiebar2.c {
        final /* synthetic */ GenericItemList a;
        final /* synthetic */ String b;

        g(GenericItemList genericItemList, String str) {
            this.a = genericItemList;
            this.b = str;
        }

        public final void a() {
            this.a.V().b(this.b);
        }
    }

    /* access modifiers changed from: private */
    public final void A0(int i) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) l0(C0275R$id.swipeRefreshLayout);
        v62.d(swipeRefreshLayout, "swipeRefreshLayout");
        swipeRefreshLayout.setRefreshing(true);
        we2.c(this, (z52) null, new e(this, i), 1, (Object) null);
    }

    @SuppressLint({"SetTextI18n"})
    private final void B0() {
        int a2 = bw1.a.a(T(), 3, 4, 5, 2);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerViewShows);
        v62.d(recyclerView, "recyclerViewShows");
        a9<vy1> a9Var = this.G;
        c cVar = this.J;
        if (cVar != null) {
            c0(recyclerView, a9Var, cVar, a2);
            RecyclerView recyclerView2 = (RecyclerView) l0(C0275R$id.recyclerViewShows);
            v62.d(recyclerView2, "recyclerViewShows");
            f fVar = new f(this, recyclerView2, 9);
            this.H = fVar;
            if (fVar != null) {
                fVar.h(z0().y());
                RecyclerView recyclerView3 = (RecyclerView) l0(C0275R$id.recyclerViewShows);
                com.zunjae.bunpaginate.a aVar = this.H;
                if (aVar != null) {
                    recyclerView3.l(aVar);
                } else {
                    v62.p("paginator");
                    throw null;
                }
            } else {
                v62.p("paginator");
                throw null;
            }
        } else {
            v62.p("listType");
            throw null;
        }
    }

    private final void C0() {
        if (!V().c("LongClickedShow") && V().e("LongClickedShowCounter", new c.a(5, 2))) {
            try {
                a.b c2 = org.aviran.cookiebar2.a.c(this);
                c2.e("Tip");
                c2.c(false);
                c2.d("You can long click a show to quickly add it to your profile");
                c2.b("Understood!", new g(this, "LongClickedShow"));
                c2.f();
            } catch (Exception e2) {
                uj2.d(e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final hy1 R() {
        return (hy1) this.F.getValue();
    }

    public static final /* synthetic */ c t0(GenericItemList genericItemList) {
        c cVar = genericItemList.J;
        if (cVar != null) {
            return cVar;
        }
        v62.p("listType");
        throw null;
    }

    public static final /* synthetic */ com.zunjae.bunpaginate.a u0(GenericItemList genericItemList) {
        com.zunjae.bunpaginate.a aVar = genericItemList.H;
        if (aVar != null) {
            return aVar;
        }
        v62.p("paginator");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void x0(List<vy1> list) {
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerViewShows);
            v62.d(recyclerView, "recyclerViewShows");
            rw1.g(recyclerView);
            this.G.addAll(list);
            z0().r().addAll(list);
            com.zunjae.bunpaginate.a aVar = this.H;
            if (aVar != null) {
                aVar.d();
                qu1 z0 = z0();
                com.zunjae.bunpaginate.a aVar2 = this.H;
                if (aVar2 != null) {
                    z0.T(aVar2.c());
                    c cVar = this.J;
                    if (cVar == null) {
                        v62.p("listType");
                        throw null;
                    } else if (!cVar.getSupportsPagination() || list.size() < qv1.a.d()) {
                        z0().R(true);
                    }
                } else {
                    v62.p("paginator");
                    throw null;
                }
            } else {
                v62.p("paginator");
                throw null;
            }
        } else if (this.G.isEmpty()) {
            fw1.f.f((RecyclerView) l0(C0275R$id.recyclerViewShows));
        }
    }

    /* access modifiers changed from: private */
    public final ov1 y0() {
        return (ov1) this.E.getValue();
    }

    /* access modifiers changed from: private */
    public final qu1 z0() {
        return (qu1) this.D.getValue();
    }

    public View l0(int i) {
        if (this.L == null) {
            this.L = new HashMap();
        }
        View view = (View) this.L.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.L.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_kanon_genres);
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "Shows";
        }
        String str = stringExtra;
        v62.d(str, "intent.getStringExtra(\"title\") ?: \"Shows\"");
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, str, (String) null, true, 4, (Object) null);
        this.I = getIntent().getIntExtra("identifier", -1);
        this.K = getIntent().getStringExtra("query");
        this.J = c.Companion.a(getIntent().getIntExtra("datasetType", 0));
        B0();
        if (z0().r().size() > 0) {
            this.G.addAll(z0().r());
        } else {
            A0(z0().y());
        }
        C0();
    }
}
