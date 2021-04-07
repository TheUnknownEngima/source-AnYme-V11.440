package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.R$id;
import defpackage.d5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a5  reason: default package */
public class a5 {
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    /* renamed from: a5$a */
    public static class a {
        public static final a e = new a(1, (CharSequence) null);
        public static final a f = new a(2, (CharSequence) null);
        public static final a g = new a(16, (CharSequence) null);
        public static final a h = new a(4096, (CharSequence) null);
        public static final a i = new a(8192, (CharSequence) null);
        public static final a j = new a(262144, (CharSequence) null);
        public static final a k = new a(524288, (CharSequence) null);
        public static final a l = new a(1048576, (CharSequence) null);
        public static final a m = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
        public static final a n = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
        public static final a o = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (d5) null, d5.f.class);
        final Object a;
        private final int b;
        private final Class<? extends d5.a> c;
        protected final d5 d;

        static {
            Class<d5.c> cls = d5.c.class;
            Class<d5.b> cls2 = d5.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, d5.g.class);
            new a(2097152, (CharSequence) null, d5.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (d5) null, d5.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (d5) null, d5.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (d5) null, (Class<? extends d5.a>) null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends d5.a> cls) {
            this((Object) null, i2, charSequence, (d5) null, cls);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (d5) null, (Class<? extends d5.a>) null);
        }

        a(Object obj, int i2, CharSequence charSequence, d5 d5Var, Class<? extends d5.a> cls) {
            this.b = i2;
            this.d = d5Var;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.a = obj;
            this.c = cls;
        }

        public a a(CharSequence charSequence, d5 d5Var) {
            return new a((Object) null, this.b, charSequence, d5Var, this.c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                d5 r0 = r4.d
                r1 = 0
                if (r0 == 0) goto L_0x0042
                r0 = 0
                java.lang.Class<? extends d5$a> r2 = r4.c
                if (r2 == 0) goto L_0x003b
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001f }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x001f }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x001f }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x001f }
                d5$a r1 = (defpackage.d5.a) r1     // Catch:{ Exception -> 0x001f }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x003b
            L_0x001d:
                r0 = r1
                goto L_0x0020
            L_0x001f:
            L_0x0020:
                java.lang.Class<? extends d5$a> r6 = r4.c
                if (r6 != 0) goto L_0x0027
                java.lang.String r6 = "null"
                goto L_0x002b
            L_0x0027:
                java.lang.String r6 = r6.getName()
            L_0x002b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to execute command with argument class ViewCommandArgument: "
                r1.append(r2)
                r1.append(r6)
                r1.toString()
            L_0x003b:
                d5 r6 = r4.d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0042:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.a.d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.a;
            Object obj3 = ((a) obj).a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: a5$b */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b((Object) null);
        }

        public static b b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b((Object) null);
        }
    }

    /* renamed from: a5$c */
    public static class c {
        final Object a;

        c(Object obj) {
            this.a = obj;
        }

        public static c f(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new c((Object) null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnIndex();
            }
            return 0;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnSpan();
            }
            return 0;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowIndex();
            }
            return 0;
        }

        public int d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowSpan();
            }
            return 0;
        }

        public boolean e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isSelected();
            }
            return false;
        }
    }

    /* renamed from: a5$d */
    public static class d {
        final Object a;

        d(Object obj) {
            this.a = obj;
        }

        public static d a(int i, float f, float f2, float f3) {
            return Build.VERSION.SDK_INT >= 19 ? new d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3)) : new d((Object) null);
        }
    }

    private a5(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private boolean A() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int B(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static a5 I0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a5(accessibilityNodeInfo);
    }

    public static a5 P() {
        return I0(AccessibilityNodeInfo.obtain());
    }

    public static a5 Q(View view) {
        return I0(AccessibilityNodeInfo.obtain(view));
    }

    public static a5 R(a5 a5Var) {
        return I0(AccessibilityNodeInfo.obtain(a5Var.a));
    }

    private void V(View view) {
        SparseArray<WeakReference<ClickableSpan>> x = x(view);
        if (x != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < x.size(); i++) {
                if (x.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                x.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void X(int i, boolean z) {
        Bundle t = t();
        if (t != null) {
            int i2 = t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            t.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean l(int i) {
        Bundle t = t();
        return t != null && (t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> v(View view) {
        SparseArray<WeakReference<ClickableSpan>> x = x(view);
        if (x != null) {
            return x;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(R$id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> x(View view) {
        return (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
    }

    public void A0(boolean z) {
        this.a.setSelected(z);
    }

    public void B0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            X(4, z);
        }
    }

    public boolean C() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.isAccessibilityFocused();
        }
        return false;
    }

    public void C0(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public boolean D() {
        return this.a.isCheckable();
    }

    public void D0(View view, int i) {
        this.c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSource(view, i);
        }
    }

    public boolean E() {
        return this.a.isChecked();
    }

    public void E0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean F() {
        return this.a.isClickable();
    }

    public void F0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view);
        }
    }

    public boolean G() {
        return this.a.isEnabled();
    }

    public void G0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(z);
        }
    }

    public boolean H() {
        return this.a.isFocusable();
    }

    public AccessibilityNodeInfo H0() {
        return this.a;
    }

    public boolean I() {
        return this.a.isFocused();
    }

    public boolean J() {
        return this.a.isLongClickable();
    }

    public boolean K() {
        return this.a.isPassword();
    }

    public boolean L() {
        return this.a.isScrollable();
    }

    public boolean M() {
        return this.a.isSelected();
    }

    public boolean N() {
        return Build.VERSION.SDK_INT >= 26 ? this.a.isShowingHintText() : l(4);
    }

    public boolean O() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.isVisibleToUser();
        }
        return false;
    }

    public boolean S(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(i, bundle);
        }
        return false;
    }

    public void T() {
        this.a.recycle();
    }

    public boolean U(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
        return false;
    }

    public void W(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    public void Y(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void Z(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCanOpenPopup(z);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
        }
    }

    public void b0(boolean z) {
        this.a.setCheckable(z);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public void c0(boolean z) {
        this.a.setChecked(z);
    }

    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.addChild(view, i);
        }
    }

    public void d0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void e0(boolean z) {
        this.a.setClickable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (a5Var.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a5Var.a)) {
            return false;
        }
        return this.c == a5Var.c && this.b == a5Var.b;
    }

    public void f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            g();
            V(view);
            ClickableSpan[] q = q(charSequence);
            if (q != null && q.length > 0) {
                t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R$id.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> v = v(view);
                int i2 = 0;
                while (q != null && i2 < q.length) {
                    int B = B(q[i2], v);
                    v.put(B, new WeakReference(q[i2]));
                    e(q[i2], (Spanned) charSequence, B);
                    i2++;
                }
            }
        }
    }

    public void f0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a);
        }
    }

    public void g0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
        }
    }

    public void h0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setDismissable(z);
        }
    }

    public void j0(boolean z) {
        this.a.setEnabled(z);
    }

    public int k() {
        return this.a.getActions();
    }

    public void k0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setError(charSequence);
        }
    }

    public void l0(boolean z) {
        this.a.setFocusable(z);
    }

    @Deprecated
    public void m(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void m0(boolean z) {
        this.a.setFocused(z);
    }

    public void n(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void n0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            X(2, z);
        }
    }

    public int o() {
        return this.a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.a.setHintText(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence p() {
        return this.a.getClassName();
    }

    public void p0(boolean z) {
        this.a.setLongClickable(z);
    }

    public void q0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setMaxTextLength(i);
        }
    }

    public c r() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.a.getCollectionItemInfo()) == null) {
            return null;
        }
        return new c(collectionItemInfo);
    }

    public void r0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setMovementGranularities(i);
        }
    }

    public CharSequence s() {
        return this.a.getContentDescription();
    }

    public void s0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public Bundle t() {
        return Build.VERSION.SDK_INT >= 19 ? this.a.getExtras() : new Bundle();
    }

    public void t0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(w());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(y());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; viewId: ");
        sb.append(z());
        sb.append("; checkable: ");
        sb.append(D());
        sb.append("; checked: ");
        sb.append(E());
        sb.append("; focusable: ");
        sb.append(H());
        sb.append("; focused: ");
        sb.append(I());
        sb.append("; selected: ");
        sb.append(M());
        sb.append("; clickable: ");
        sb.append(F());
        sb.append("; longClickable: ");
        sb.append(J());
        sb.append("; enabled: ");
        sb.append(G());
        sb.append("; password: ");
        sb.append(K());
        sb.append("; scrollable: " + L());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> i = i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                a aVar = i.get(i2);
                String j = j(aVar.b());
                if (j.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    j = aVar.c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= ~numberOfTrailingZeros;
                sb.append(j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.getMovementGranularities();
        }
        return 0;
    }

    public void u0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public void v0(View view, int i) {
        this.b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setParent(view, i);
        }
    }

    public CharSequence w() {
        return this.a.getPackageName();
    }

    public void w0(d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.a);
        }
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public CharSequence y() {
        if (!A()) {
            return this.a.getText();
        }
        List<Integer> h = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new y4(h4.get(i).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    public void y0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            X(1, z);
        }
    }

    public String z() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public void z0(boolean z) {
        this.a.setScrollable(z);
    }
}
