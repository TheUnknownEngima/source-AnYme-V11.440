package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class s {
    ArrayList<a> a = new ArrayList<>();
    int b;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h = true;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    boolean p = false;
    ArrayList<Runnable> q;

    static final class a {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;
        h.b g;
        h.b h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            h.b bVar = h.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }

        a(int i, Fragment fragment, h.b bVar) {
            this.a = i;
            this.b = fragment;
            this.g = fragment.T;
            this.h = bVar;
        }
    }

    @Deprecated
    public s() {
    }

    s(g gVar, ClassLoader classLoader) {
    }

    public s b(int i2, Fragment fragment) {
        o(i2, fragment, (String) null, 1);
        return this;
    }

    public s c(int i2, Fragment fragment, String str) {
        o(i2, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public s d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.J = viewGroup;
        c(viewGroup.getId(), fragment, str);
        return this;
    }

    public s e(Fragment fragment, String str) {
        o(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    public s g(String str) {
        if (this.h) {
            this.g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public s h(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public s m(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public s n() {
        if (!this.g) {
            this.h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void o(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.B;
            if (str2 == null || str.equals(str2)) {
                fragment.B = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.B + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.z;
                if (i4 == 0 || i4 == i2) {
                    fragment.z = i2;
                    fragment.A = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.z + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        f(new a(i3, fragment));
    }

    public s p(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public s q(int i2, Fragment fragment) {
        r(i2, fragment, (String) null);
        return this;
    }

    public s r(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            o(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public s s(int i2, int i3) {
        t(i2, i3, 0, 0);
        return this;
    }

    public s t(int i2, int i3, int i4, int i5) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        return this;
    }

    public s u(Fragment fragment, h.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public s v(boolean z) {
        this.p = z;
        return this;
    }
}
