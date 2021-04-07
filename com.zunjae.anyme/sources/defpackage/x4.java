package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: x4  reason: default package */
public class x4 {
    private final Object a;

    x4(Object obj) {
        this.a = obj;
    }

    public static x4 l(WindowInsets windowInsets) {
        return new x4(Objects.requireNonNull(windowInsets));
    }

    public x4 a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new x4(((WindowInsets) this.a).consumeSystemWindowInsets());
        }
        return null;
    }

    public k2 b() {
        return Build.VERSION.SDK_INT >= 29 ? k2.b(((WindowInsets) this.a).getMandatorySystemGestureInsets()) : g();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        return p3.a(this.a, ((x4) obj).a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public k2 g() {
        return Build.VERSION.SDK_INT >= 29 ? k2.b(((WindowInsets) this.a).getSystemWindowInsets()) : k2.a(d(), f(), e(), c());
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).hasSystemWindowInsets();
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.a).isConsumed();
        }
        return false;
    }

    public x4 j(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new x4(((WindowInsets) this.a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public WindowInsets k() {
        return (WindowInsets) this.a;
    }
}
