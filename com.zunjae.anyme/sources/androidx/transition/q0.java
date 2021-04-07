package androidx.transition;

import android.os.IBinder;

class q0 implements s0 {
    private final IBinder a;

    q0(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q0) && ((q0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
