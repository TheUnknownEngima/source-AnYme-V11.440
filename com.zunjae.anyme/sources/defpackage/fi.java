package defpackage;

import android.os.Build;
import com.bumptech.glide.load.h;

/* renamed from: fi  reason: default package */
public abstract class fi {
    public static final fi a = new c();
    public static final fi b = new a();
    public static final fi c = new b();
    public static final fi d = new d();
    public static final fi e;
    public static final h<fi> f;
    static final boolean g = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: fi$a */
    private static class a extends fi {
        a() {
        }

        public e a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? e.QUALITY : fi.a.a(i, i2, i3, i4);
        }

        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, fi.a.b(i, i2, i3, i4));
        }
    }

    /* renamed from: fi$b */
    private static class b extends fi {
        b() {
        }

        public e a(int i, int i2, int i3, int i4) {
            return e.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: fi$c */
    private static class c extends fi {
        c() {
        }

        public e a(int i, int i2, int i3, int i4) {
            return fi.g ? e.QUALITY : e.MEMORY;
        }

        public float b(int i, int i2, int i3, int i4) {
            if (fi.g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: fi$d */
    private static class d extends fi {
        d() {
        }

        public e a(int i, int i2, int i3, int i4) {
            return e.QUALITY;
        }

        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: fi$e */
    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        fi fiVar = c;
        e = fiVar;
        f = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", fiVar);
    }

    public abstract e a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
