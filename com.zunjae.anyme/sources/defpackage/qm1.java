package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.l;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: qm1  reason: default package */
public class qm1 {

    /* renamed from: qm1$a */
    static class a implements View.OnClickListener {
        final /* synthetic */ RecyclerView.c0 e;
        final /* synthetic */ yl1 f;

        a(RecyclerView.c0 c0Var, yl1 yl1) {
            this.e = c0Var;
            this.f = yl1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r0 = (com.mikepenz.fastadapter.b) r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r4.e
                android.view.View r0 = r0.e
                int r1 = com.mikepenz.fastadapter.R$id.fastadapter_item_adapter
                java.lang.Object r0 = r0.getTag(r1)
                boolean r1 = r0 instanceof com.mikepenz.fastadapter.b
                if (r1 == 0) goto L_0x0026
                com.mikepenz.fastadapter.b r0 = (com.mikepenz.fastadapter.b) r0
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r4.e
                int r1 = r0.X(r1)
                r2 = -1
                if (r1 == r2) goto L_0x0026
                com.mikepenz.fastadapter.l r2 = r0.Y(r1)
                if (r2 == 0) goto L_0x0026
                yl1 r3 = r4.f
                wl1 r3 = (defpackage.wl1) r3
                r3.c(r5, r1, r0, r2)
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qm1.a.onClick(android.view.View):void");
        }
    }

    /* renamed from: qm1$b */
    static class b implements View.OnLongClickListener {
        final /* synthetic */ RecyclerView.c0 e;
        final /* synthetic */ yl1 f;

        b(RecyclerView.c0 c0Var, yl1 yl1) {
            this.e = c0Var;
            this.f = yl1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r0 = (com.mikepenz.fastadapter.b) r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onLongClick(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r4.e
                android.view.View r0 = r0.e
                int r1 = com.mikepenz.fastadapter.R$id.fastadapter_item_adapter
                java.lang.Object r0 = r0.getTag(r1)
                boolean r1 = r0 instanceof com.mikepenz.fastadapter.b
                if (r1 == 0) goto L_0x0028
                com.mikepenz.fastadapter.b r0 = (com.mikepenz.fastadapter.b) r0
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r4.e
                int r1 = r0.X(r1)
                r2 = -1
                if (r1 == r2) goto L_0x0028
                com.mikepenz.fastadapter.l r2 = r0.Y(r1)
                if (r2 == 0) goto L_0x0028
                yl1 r3 = r4.f
                am1 r3 = (defpackage.am1) r3
                boolean r5 = r3.c(r5, r1, r0, r2)
                return r5
            L_0x0028:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qm1.b.onLongClick(android.view.View):boolean");
        }
    }

    /* renamed from: qm1$c */
    static class c implements View.OnTouchListener {
        final /* synthetic */ RecyclerView.c0 e;
        final /* synthetic */ yl1 f;

        c(RecyclerView.c0 c0Var, yl1 yl1) {
            this.e = c0Var;
            this.f = yl1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r6 = (com.mikepenz.fastadapter.b) r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r8.e
                android.view.View r0 = r0.e
                int r1 = com.mikepenz.fastadapter.R$id.fastadapter_item_adapter
                java.lang.Object r0 = r0.getTag(r1)
                boolean r1 = r0 instanceof com.mikepenz.fastadapter.b
                if (r1 == 0) goto L_0x002c
                r6 = r0
                com.mikepenz.fastadapter.b r6 = (com.mikepenz.fastadapter.b) r6
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r8.e
                int r5 = r6.X(r0)
                r0 = -1
                if (r5 == r0) goto L_0x002c
                com.mikepenz.fastadapter.l r7 = r6.Y(r5)
                if (r7 == 0) goto L_0x002c
                yl1 r0 = r8.f
                r2 = r0
                im1 r2 = (defpackage.im1) r2
                r3 = r9
                r4 = r10
                boolean r9 = r2.c(r3, r4, r5, r6, r7)
                return r9
            L_0x002c:
                r9 = 0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qm1.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public static <Item extends l> void a(yl1<Item> yl1, RecyclerView.c0 c0Var, View view) {
        if (yl1 instanceof wl1) {
            view.setOnClickListener(new a(c0Var, yl1));
        } else if (yl1 instanceof am1) {
            view.setOnLongClickListener(new b(c0Var, yl1));
        } else if (yl1 instanceof im1) {
            view.setOnTouchListener(new c(c0Var, yl1));
        } else if (yl1 instanceof xl1) {
            ((xl1) yl1).c(view, c0Var);
        }
    }

    public static <Item extends l> void b(RecyclerView.c0 c0Var, @Nullable List<yl1<Item>> list) {
        if (list != null) {
            for (yl1 next : list) {
                View a2 = next.a(c0Var);
                if (a2 != null) {
                    a(next, c0Var, a2);
                }
                List<? extends View> b2 = next.b(c0Var);
                if (b2 != null) {
                    for (View a3 : b2) {
                        a(next, c0Var, a3);
                    }
                }
            }
        }
    }
}
