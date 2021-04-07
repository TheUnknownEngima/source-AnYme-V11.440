package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: s  reason: default package */
public class s extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;

    /* renamed from: s$a */
    private static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] g = {MenuItem.class};
        private Object e;
        private Method f;

        public a(Object obj, String str) {
            this.e = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f = cls.getMethod(str, g);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f.invoke(this.e, new Object[]{menuItem})).booleanValue();
                }
                this.f.invoke(this.e, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: s$b */
    private class b {
        x3 A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, s.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                "Cannot instantiate class: " + str;
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!s.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(s.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof i;
            if (z3) {
                i iVar = (i) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, s.e, s.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0 && !z2) {
                menuItem.setActionView(i3);
            }
            x3 x3Var = this.A;
            if (x3Var != null) {
                c4.b(menuItem, x3Var);
            }
            c4.d(menuItem, this.B);
            c4.h(menuItem, this.C);
            c4.c(menuItem, this.n, this.o);
            c4.g(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                c4.f(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                c4.e(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = s.this.c.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
            this.b = obtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
            this.c = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
            this.d = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
            this.e = obtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
            this.f = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            g0 t2 = g0.t(s.this.c, attributeSet, R$styleable.MenuItem);
            this.i = t2.n(R$styleable.MenuItem_android_id, 0);
            this.j = (t2.k(R$styleable.MenuItem_android_menuCategory, this.c) & -65536) | (t2.k(R$styleable.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = t2.p(R$styleable.MenuItem_android_title);
            this.l = t2.p(R$styleable.MenuItem_android_titleCondensed);
            this.m = t2.n(R$styleable.MenuItem_android_icon, 0);
            this.n = c(t2.o(R$styleable.MenuItem_android_alphabeticShortcut));
            this.o = t2.k(R$styleable.MenuItem_alphabeticModifiers, 4096);
            this.p = c(t2.o(R$styleable.MenuItem_android_numericShortcut));
            this.q = t2.k(R$styleable.MenuItem_numericModifiers, 4096);
            this.r = t2.r(R$styleable.MenuItem_android_checkable) ? t2.a(R$styleable.MenuItem_android_checkable, false) : this.e;
            this.s = t2.a(R$styleable.MenuItem_android_checked, false);
            this.t = t2.a(R$styleable.MenuItem_android_visible, this.f);
            this.u = t2.a(R$styleable.MenuItem_android_enabled, this.g);
            this.v = t2.k(R$styleable.MenuItem_showAsAction, -1);
            this.z = t2.o(R$styleable.MenuItem_android_onClick);
            this.w = t2.n(R$styleable.MenuItem_actionLayout, 0);
            this.x = t2.o(R$styleable.MenuItem_actionViewClass);
            String o2 = t2.o(R$styleable.MenuItem_actionProviderClass);
            this.y = o2;
            if ((o2 != null) && this.w == 0 && this.x == null) {
                this.A = (x3) e(this.y, s.f, s.this.b);
            } else {
                this.A = null;
            }
            this.B = t2.p(R$styleable.MenuItem_contentDescription);
            this.C = t2.p(R$styleable.MenuItem_tooltipText);
            if (t2.r(R$styleable.MenuItem_iconTintMode)) {
                this.E = q.e(t2.k(R$styleable.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (t2.r(R$styleable.MenuItem_iconTint)) {
                this.D = t2.c(R$styleable.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            t2.v();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            e = r0
            f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.<clinit>():void");
    }

    public s(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                x3 x3Var = bVar.A;
                                if (x3Var == null || !x3Var.b()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof v2)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
