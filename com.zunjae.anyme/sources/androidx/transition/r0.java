package androidx.transition;

import android.view.View;
import android.view.WindowId;

class r0 implements s0 {
    private final WindowId a;

    r0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof r0) && ((r0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
