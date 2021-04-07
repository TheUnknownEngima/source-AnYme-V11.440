package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.p;

public class ActivityChooserView extends ViewGroup {
    final f e;
    private final g f;
    private final View g;
    private final Drawable h;
    final FrameLayout i;
    private final ImageView j;
    final FrameLayout k;
    private final ImageView l;
    private final int m;
    x3 n;
    final DataSetObserver o;
    private final ViewTreeObserver.OnGlobalLayoutListener p;
    private ListPopupWindow q;
    PopupWindow.OnDismissListener r;
    boolean s;
    int t;
    private boolean u;
    private int v;

    public static class InnerLayout extends LinearLayout {
        private static final int[] e = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            g0 t = g0.t(context, attributeSet, e);
            setBackgroundDrawable(t.g(0));
            t.v();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.e.notifyDataSetInvalidated();
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().b();
            x3 x3Var = ActivityChooserView.this.n;
            if (x3Var != null) {
                x3Var.m(true);
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c(ActivityChooserView activityChooserView) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            a5.I0(accessibilityNodeInfo).a0(true);
        }
    }

    class d extends t {
        d(View view) {
            super(view);
        }

        public p b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    private class f extends BaseAdapter {
        private d e;
        private int f = 4;
        private boolean g;
        private boolean h;
        private boolean i;

        f() {
        }

        public int a() {
            return this.e.c();
        }

        public d b() {
            return this.e;
        }

        public ResolveInfo c() {
            return this.e.e();
        }

        public int d() {
            return this.e.f();
        }

        public boolean e() {
            return this.g;
        }

        public int f() {
            int i2 = this.f;
            this.f = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i3 = 0;
            for (int i4 = 0; i4 < count; i4++) {
                view = getView(i4, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
            }
            this.f = i2;
            return i3;
        }

        public void g(d dVar) {
            d b = ActivityChooserView.this.e.b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver(ActivityChooserView.this.o);
            }
            this.e = dVar;
            if (dVar != null && ActivityChooserView.this.isShown()) {
                dVar.registerObserver(ActivityChooserView.this.o);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int c = this.e.c();
            if (!this.g && this.e.e() != null) {
                c--;
            }
            int min = Math.min(c, this.f);
            return this.i ? min + 1 : min;
        }

        public Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (!this.g && this.e.e() != null) {
                    i2++;
                }
                return this.e.b(i2);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public int getItemViewType(int i2) {
            return (!this.i || i2 != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R$id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R$layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
                ((ImageView) view.findViewById(R$id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R$id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.g || i2 != 0 || !this.h) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R$layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(R$id.title)).setText(ActivityChooserView.this.getContext().getString(R$string.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i2) {
            if (this.f != i2) {
                this.f = i2;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z2) {
            if (this.g != z || this.h != z2) {
                this.g = z;
                this.h = z2;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z) {
            if (this.i != z) {
                this.i = z;
                notifyDataSetChanged();
            }
        }
    }

    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.r;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.k) {
                activityChooserView.a();
                Intent a = ActivityChooserView.this.e.b().a(ActivityChooserView.this.e.b().d(ActivityChooserView.this.e.c()));
                if (a != null) {
                    a.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(a);
                }
            } else if (view == activityChooserView.i) {
                activityChooserView.s = false;
                activityChooserView.d(activityChooserView.t);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            a();
            x3 x3Var = ActivityChooserView.this.n;
            if (x3Var != null) {
                x3Var.m(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.s) {
                    if (!activityChooserView.e.e()) {
                        i++;
                    }
                    Intent a = ActivityChooserView.this.e.b().a(i);
                    if (a != null) {
                        a.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(a);
                    }
                } else if (i > 0) {
                    activityChooserView.e.b().g(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.k) {
                if (activityChooserView.e.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.s = true;
                    activityChooserView2.d(activityChooserView2.t);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o = new a();
        this.p = new b();
        this.t = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActivityChooserView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, R$styleable.ActivityChooserView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        this.t = obtainStyledAttributes.getInt(R$styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R$layout.abc_activity_chooser_view, this, true);
        this.f = new g();
        View findViewById = findViewById(R$id.activity_chooser_view_content);
        this.g = findViewById;
        this.h = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.default_activity_button);
        this.k = frameLayout;
        frameLayout.setOnClickListener(this.f);
        this.k.setOnLongClickListener(this.f);
        this.l = (ImageView) this.k.findViewById(R$id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R$id.expand_activities_button);
        frameLayout2.setOnClickListener(this.f);
        frameLayout2.setAccessibilityDelegate(new c(this));
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.i = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R$id.image);
        this.j = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.e = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.p);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().a();
    }

    public boolean c() {
        if (b() || !this.u) {
            return false;
        }
        this.s = false;
        d(this.t);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d(int i2) {
        f fVar;
        if (this.e.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.p);
            boolean z = this.k.getVisibility() == 0;
            int a2 = this.e.a();
            if (i2 == Integer.MAX_VALUE || a2 <= i2 + (z ? 1 : 0)) {
                this.e.j(false);
                fVar = this.e;
            } else {
                this.e.j(true);
                fVar = this.e;
                i2--;
            }
            fVar.h(i2);
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.a()) {
                if (this.s || !z) {
                    this.e.i(true, z);
                } else {
                    this.e.i(false, false);
                }
                listPopupWindow.F(Math.min(this.e.f(), this.m));
                listPopupWindow.b();
                x3 x3Var = this.n;
                if (x3Var != null) {
                    x3Var.m(true);
                }
                listPopupWindow.n().setContentDescription(getContext().getString(R$string.abc_activitychooserview_choose_application));
                listPopupWindow.n().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        Drawable drawable;
        View view;
        if (this.e.getCount() > 0) {
            this.i.setEnabled(true);
        } else {
            this.i.setEnabled(false);
        }
        int a2 = this.e.a();
        int d2 = this.e.d();
        if (a2 == 1 || (a2 > 1 && d2 > 0)) {
            this.k.setVisibility(0);
            ResolveInfo c2 = this.e.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.l.setImageDrawable(c2.loadIcon(packageManager));
            if (this.v != 0) {
                CharSequence loadLabel = c2.loadLabel(packageManager);
                this.k.setContentDescription(getContext().getString(this.v, new Object[]{loadLabel}));
            }
        } else {
            this.k.setVisibility(8);
        }
        if (this.k.getVisibility() == 0) {
            view = this.g;
            drawable = this.h;
        } else {
            view = this.g;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    public d getDataModel() {
        return this.e.b();
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.q == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.q = listPopupWindow;
            listPopupWindow.p(this.e);
            this.q.D(this);
            this.q.J(true);
            this.q.L(this.f);
            this.q.K(this.f);
        }
        return this.q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d b2 = this.e.b();
        if (b2 != null) {
            b2.registerObserver(this.o);
        }
        this.u = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d b2 = this.e.b();
        if (b2 != null) {
            b2.unregisterObserver(this.o);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.p);
        }
        if (b()) {
            a();
        }
        this.u = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.g.layout(0, 0, i4 - i2, i5 - i3);
        if (!b()) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        View view = this.g;
        if (this.k.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(d dVar) {
        this.e.g(dVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.v = i2;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.j.setContentDescription(getContext().getString(i2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.j.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.t = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    public void setProvider(x3 x3Var) {
        this.n = x3Var;
    }
}
