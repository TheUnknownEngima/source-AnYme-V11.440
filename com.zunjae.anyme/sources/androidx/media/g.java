package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

public abstract class g {
    private final int a;
    private final int b;
    private int c;
    private b d;
    private VolumeProvider e;

    class a extends VolumeProvider {
        a(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public void onAdjustVolume(int i) {
            g.this.e(i);
        }

        public void onSetVolumeTo(int i) {
            g.this.f(i);
        }
    }

    public static abstract class b {
        public abstract void a(g gVar);
    }

    public g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public Object d() {
        if (this.e == null && Build.VERSION.SDK_INT >= 21) {
            this.e = new a(this.a, this.b, this.c);
        }
        return this.e;
    }

    public abstract void e(int i);

    public abstract void f(int i);

    public void g(b bVar) {
        this.d = bVar;
    }

    public final void h(int i) {
        this.c = i;
        if (Build.VERSION.SDK_INT >= 21) {
            ((VolumeProvider) d()).setCurrentVolume(i);
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(this);
        }
    }
}
