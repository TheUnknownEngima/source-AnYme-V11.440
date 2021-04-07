package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.v;
import java.util.ArrayList;
import java.util.List;

final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int F = R$layout.abc_cascading_menu_item_layout;
    private boolean A;
    private m.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener D;
    boolean E;
    private final Context f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    final Handler k;
    private final List<g> l = new ArrayList();
    final List<C0008d> m = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener n = new a();
    private final View.OnAttachStateChangeListener o = new b();
    private final u p = new c();
    private int q = 0;
    private int r = 0;
    private View s;
    View t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private boolean z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.a() && d.this.m.size() > 0 && !d.this.m.get(0).a.B()) {
                View view = d.this.t;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0008d dVar : d.this.m) {
                    dVar.a.b();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements u {

        class a implements Runnable {
            final /* synthetic */ C0008d e;
            final /* synthetic */ MenuItem f;
            final /* synthetic */ g g;

            a(C0008d dVar, MenuItem menuItem, g gVar) {
                this.e = dVar;
                this.f = menuItem;
                this.g = gVar;
            }

            public void run() {
                C0008d dVar = this.e;
                if (dVar != null) {
                    d.this.E = true;
                    dVar.b.e(false);
                    d.this.E = false;
                }
                if (this.f.isEnabled() && this.f.hasSubMenu()) {
                    this.g.N(this.f, 4);
                }
            }
        }

        c() {
        }

        public void e(g gVar, MenuItem menuItem) {
            C0008d dVar = null;
            d.this.k.removeCallbacksAndMessages((Object) null);
            int size = d.this.m.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.m.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.m.size()) {
                    dVar = d.this.m.get(i2);
                }
                d.this.k.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void h(g gVar, MenuItem menuItem) {
            d.this.k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    private static class C0008d {
        public final v a;
        public final g b;
        public final int c;

        public C0008d(v vVar, g gVar, int i) {
            this.a = vVar;
            this.b = gVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.n();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        this.f = context;
        this.s = view;
        this.h = i2;
        this.i = i3;
        this.j = z2;
        this.z = false;
        this.u = G();
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.k = new Handler();
    }

    private v C() {
        v vVar = new v(this.f, (AttributeSet) null, this.h, this.i);
        vVar.T(this.p);
        vVar.L(this);
        vVar.K(this);
        vVar.D(this.s);
        vVar.G(this.r);
        vVar.J(true);
        vVar.I(2);
        return vVar;
    }

    private int D(g gVar) {
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.m.get(i2).b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem E(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View F(C0008d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem E2 = E(dVar.b, gVar);
        if (E2 == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (E2 == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int G() {
        return o4.y(this.s) == 1 ? 0 : 1;
    }

    private int H(int i2) {
        List<C0008d> list = this.m;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.t.getWindowVisibleDisplayFrame(rect);
        return this.u == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void I(g gVar) {
        View view;
        C0008d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f);
        f fVar = new f(gVar, from, this.j, F);
        if (!a() && this.z) {
            fVar.d(true);
        } else if (a()) {
            fVar.d(k.A(gVar));
        }
        int r2 = k.r(fVar, (ViewGroup) null, this.f, this.g);
        v C2 = C();
        C2.p(fVar);
        C2.F(r2);
        C2.G(this.r);
        if (this.m.size() > 0) {
            List<C0008d> list = this.m;
            dVar = list.get(list.size() - 1);
            view = F(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C2.U(false);
            C2.R((Object) null);
            int H = H(r2);
            boolean z2 = H == 1;
            this.u = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C2.D(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.r & 7) == 5) {
                    iArr[0] = iArr[0] + this.s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.r & 5) != 5) {
                if (z2) {
                    r2 = view.getWidth();
                }
                i4 = i2 - r2;
                C2.f(i4);
                C2.M(true);
                C2.k(i3);
            } else if (!z2) {
                r2 = view.getWidth();
                i4 = i2 - r2;
                C2.f(i4);
                C2.M(true);
                C2.k(i3);
            }
            i4 = i2 + r2;
            C2.f(i4);
            C2.M(true);
            C2.k(i3);
        } else {
            if (this.v) {
                C2.f(this.x);
            }
            if (this.w) {
                C2.k(this.y);
            }
            C2.H(q());
        }
        this.m.add(new C0008d(C2, gVar, this.u));
        C2.b();
        ListView n2 = C2.n();
        n2.setOnKeyListener(this);
        if (dVar == null && this.A && gVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R$layout.abc_popup_menu_header_item_layout, n2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.z());
            n2.addHeaderView(frameLayout, (Object) null, false);
            C2.b();
        }
    }

    public boolean a() {
        return this.m.size() > 0 && this.m.get(0).a.a();
    }

    public void b() {
        if (!a()) {
            for (g I : this.l) {
                I(I);
            }
            this.l.clear();
            View view = this.s;
            this.t = view;
            if (view != null) {
                boolean z2 = this.C == null;
                ViewTreeObserver viewTreeObserver = this.t.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.n);
                }
                this.t.addOnAttachStateChangeListener(this.o);
            }
        }
    }

    public void c(g gVar, boolean z2) {
        int D2 = D(gVar);
        if (D2 >= 0) {
            int i2 = D2 + 1;
            if (i2 < this.m.size()) {
                this.m.get(i2).b.e(false);
            }
            C0008d remove = this.m.remove(D2);
            remove.b.Q(this);
            if (this.E) {
                remove.a.S((Object) null);
                remove.a.E(0);
            }
            remove.a.dismiss();
            int size = this.m.size();
            this.u = size > 0 ? this.m.get(size - 1).c : G();
            if (size == 0) {
                dismiss();
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.n);
                    }
                    this.C = null;
                }
                this.t.removeOnAttachStateChangeListener(this.o);
                this.D.onDismiss();
            } else if (z2) {
                this.m.get(0).b.e(false);
            }
        }
    }

    public void d(g gVar) {
        gVar.c(this, this.f);
        if (a()) {
            I(gVar);
        } else {
            this.l.add(gVar);
        }
    }

    public void dismiss() {
        int size = this.m.size();
        if (size > 0) {
            C0008d[] dVarArr = (C0008d[]) this.m.toArray(new C0008d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0008d dVar = dVarArr[i2];
                if (dVar.a.a()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }

    public void g(boolean z2) {
        for (C0008d a2 : this.m) {
            k.B(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public void k(m.a aVar) {
        this.B = aVar;
    }

    public void m(Parcelable parcelable) {
    }

    public ListView n() {
        if (this.m.isEmpty()) {
            return null;
        }
        List<C0008d> list = this.m;
        return list.get(list.size() - 1).a();
    }

    public boolean o(r rVar) {
        for (C0008d next : this.m) {
            if (rVar == next.b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        d(rVar);
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    public void onDismiss() {
        C0008d dVar;
        int size = this.m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.m.get(i2);
            if (!dVar.a.a()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public Parcelable p() {
        return null;
    }

    public void s(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = y3.b(this.q, o4.y(view));
        }
    }

    public void u(boolean z2) {
        this.z = z2;
    }

    public void v(int i2) {
        if (this.q != i2) {
            this.q = i2;
            this.r = y3.b(i2, o4.y(this.s));
        }
    }

    public void w(int i2) {
        this.v = true;
        this.x = i2;
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    public void y(boolean z2) {
        this.A = z2;
    }

    public void z(int i2) {
        this.w = true;
        this.y = i2;
    }
}
