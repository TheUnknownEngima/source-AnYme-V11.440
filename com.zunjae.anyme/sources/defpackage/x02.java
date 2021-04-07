package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.inflationx.viewpump.R$id;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: x02  reason: default package */
public final class x02 extends LayoutInflater {
    /* access modifiers changed from: private */
    public static final Set<String> f = a42.d("android.widget.", "android.webkit.");
    /* access modifiers changed from: private */
    public static final d22 g = g22.b(a.f);
    public static final b h = new b((r62) null);
    private final boolean a;
    private final io.github.inflationx.viewpump.a b;
    private final io.github.inflationx.viewpump.a c;
    private boolean d;
    private boolean e;

    /* renamed from: x02$a */
    static final class a extends w62 implements o52<Field> {
        public static final a f = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final Field invoke() {
            Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField;
            }
            throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!".toString());
        }
    }

    /* renamed from: x02$b */
    public static final class b {
        static final /* synthetic */ d82[] a;

        static {
            c72 c72 = new c72(f72.b(b.class), "CONSTRUCTOR_ARGS_FIELD", "getCONSTRUCTOR_ARGS_FIELD()Ljava/lang/reflect/Field;");
            f72.f(c72);
            a = new d82[]{c72};
        }

        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        /* access modifiers changed from: private */
        public final Field b() {
            d22 c = x02.g;
            b bVar = x02.h;
            d82 d82 = a[0];
            return (Field) c.getValue();
        }
    }

    /* renamed from: x02$c */
    private static final class c implements io.github.inflationx.viewpump.a {
        private final x02 a;

        public c(x02 x02) {
            v62.f(x02, "inflater");
            this.a = x02;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            View view2 = null;
            for (String createView : x02.f) {
                try {
                    view2 = this.a.createView(str, createView, attributeSet);
                    if (view2 != null) {
                        break;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return view2 == null ? this.a.j(str, attributeSet) : view2;
        }
    }

    /* renamed from: x02$d */
    private static final class d implements io.github.inflationx.viewpump.a {
        private final x02 a;

        public d(x02 x02) {
            v62.f(x02, "inflater");
            this.a = x02;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return this.a.i(view, str, attributeSet);
        }
    }

    /* renamed from: x02$e */
    private static final class e extends g {
        private final f f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(LayoutInflater.Factory2 factory2, x02 x02) {
            super(factory2);
            v62.f(factory2, "factory2");
            v62.f(x02, "inflater");
            this.f = new f(factory2, x02);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return io.github.inflationx.viewpump.e.g.b().c(new io.github.inflationx.viewpump.b(str, context, attributeSet, view, this.f)).e();
        }
    }

    /* renamed from: x02$f */
    private static final class f extends h implements io.github.inflationx.viewpump.a {
        private final x02 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(LayoutInflater.Factory2 factory2, x02 x02) {
            super(factory2);
            v62.f(factory2, "factory2");
            v62.f(x02, "inflater");
            this.b = x02;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return this.b.f(a().onCreateView(view, str, context, attributeSet), str, context, attributeSet);
        }
    }

    /* renamed from: x02$g */
    private static class g implements LayoutInflater.Factory2 {
        private final h e;

        public g(LayoutInflater.Factory2 factory2) {
            v62.f(factory2, "factory2");
            this.e = new h(factory2);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return io.github.inflationx.viewpump.e.g.b().c(new io.github.inflationx.viewpump.b(str, context, attributeSet, view, this.e)).e();
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return onCreateView((View) null, str, context, attributeSet);
        }
    }

    /* renamed from: x02$h */
    private static class h implements io.github.inflationx.viewpump.a {
        private final LayoutInflater.Factory2 a;

        public h(LayoutInflater.Factory2 factory2) {
            v62.f(factory2, "factory2");
            this.a = factory2;
        }

        /* access modifiers changed from: protected */
        public final LayoutInflater.Factory2 a() {
            return this.a;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return this.a.onCreateView(view, str, context, attributeSet);
        }
    }

    /* renamed from: x02$i */
    private static final class i implements LayoutInflater.Factory {
        private final io.github.inflationx.viewpump.a e;

        public i(LayoutInflater.Factory factory) {
            v62.f(factory, "factory");
            this.e = new j(factory);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return io.github.inflationx.viewpump.e.g.b().c(new io.github.inflationx.viewpump.b(str, context, attributeSet, (View) null, this.e, 8, (r62) null)).e();
        }
    }

    /* renamed from: x02$j */
    private static final class j implements io.github.inflationx.viewpump.a {
        private final LayoutInflater.Factory a;

        public j(LayoutInflater.Factory factory) {
            v62.f(factory, "factory");
            this.a = factory;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            v62.f(str, "name");
            v62.f(context, "context");
            return this.a.onCreateView(str, context, attributeSet);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x02(LayoutInflater layoutInflater, Context context, boolean z) {
        super(layoutInflater, context);
        v62.f(layoutInflater, "original");
        v62.f(context, "newContext");
        this.a = Build.VERSION.SDK_INT > 28 || a3.a();
        this.b = new c(this);
        this.c = new d(this);
        this.e = io.github.inflationx.viewpump.e.g.b().f();
        h(z);
    }

    /* access modifiers changed from: private */
    public final View f(View view, String str, Context context, AttributeSet attributeSet) {
        if (!io.github.inflationx.viewpump.e.g.b().d() || view != null || g92.D(str, '.', 0, false, 6, (Object) null) <= -1) {
            return view;
        }
        if (this.a) {
            return cloneInContext(context).createView(str, (String) null, attributeSet);
        }
        Object obj = h.b().get(this);
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[0];
            objArr[0] = context;
            v02.c(h.b(), this, objArr);
            try {
                view = createView(str, (String) null, attributeSet);
                objArr[0] = obj2;
            } catch (ClassNotFoundException unused) {
                objArr[0] = obj2;
            } catch (Throwable th) {
                objArr[0] = obj2;
                v02.c(h.b(), this, objArr);
                throw th;
            }
            v02.c(h.b(), this, objArr);
            return view;
        }
        throw new r22("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
    }

    private final void g() {
        if (this.d || !io.github.inflationx.viewpump.e.g.b().e()) {
            return;
        }
        if (!(getContext() instanceof LayoutInflater.Factory2)) {
            this.d = true;
            return;
        }
        Method a2 = v02.a(LayoutInflater.class, "setPrivateFactory");
        Object[] objArr = new Object[1];
        Context context = getContext();
        if (context != null) {
            objArr[0] = new e((LayoutInflater.Factory2) context, this);
            v02.b(a2, this, objArr);
            this.d = true;
            return;
        }
        throw new r22("null cannot be cast to non-null type android.view.LayoutInflater.Factory2");
    }

    private final void h(boolean z) {
        if (!z) {
            if (getFactory2() != null && !(getFactory2() instanceof g)) {
                setFactory2(getFactory2());
            }
            if (getFactory() != null && !(getFactory() instanceof i)) {
                setFactory(getFactory());
            }
        }
    }

    /* access modifiers changed from: private */
    public final View i(View view, String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(view, str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final View j(String str, AttributeSet attributeSet) {
        try {
            return super.onCreateView(str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public LayoutInflater cloneInContext(Context context) {
        v62.f(context, "newContext");
        return new x02(this, context, true);
    }

    public View inflate(int i2, ViewGroup viewGroup, boolean z) {
        View inflate = super.inflate(i2, viewGroup, z);
        if (inflate != null && this.e) {
            inflate.setTag(R$id.viewpump_layout_res, Integer.valueOf(i2));
        }
        return inflate;
    }

    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        v62.f(xmlPullParser, "parser");
        g();
        View inflate = super.inflate(xmlPullParser, viewGroup, z);
        v62.b(inflate, "super.inflate(parser, root, attachToRoot)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    public View onCreateView(View view, String str, AttributeSet attributeSet) {
        v62.f(str, "name");
        io.github.inflationx.viewpump.e b2 = io.github.inflationx.viewpump.e.g.b();
        Context context = getContext();
        v62.b(context, "context");
        return b2.c(new io.github.inflationx.viewpump.b(str, context, attributeSet, view, this.c)).e();
    }

    /* access modifiers changed from: protected */
    public View onCreateView(String str, AttributeSet attributeSet) {
        v62.f(str, "name");
        io.github.inflationx.viewpump.e b2 = io.github.inflationx.viewpump.e.g.b();
        Context context = getContext();
        v62.b(context, "context");
        return b2.c(new io.github.inflationx.viewpump.b(str, context, attributeSet, (View) null, this.b, 8, (r62) null)).e();
    }

    public void setFactory(LayoutInflater.Factory factory) {
        v62.f(factory, "factory");
        if (!(factory instanceof i)) {
            super.setFactory(new i(factory));
        } else {
            super.setFactory(factory);
        }
    }

    public void setFactory2(LayoutInflater.Factory2 factory2) {
        v62.f(factory2, "factory2");
        if (!(factory2 instanceof g)) {
            super.setFactory2(new g(factory2));
        } else {
            super.setFactory2(factory2);
        }
    }
}
