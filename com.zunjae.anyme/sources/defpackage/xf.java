package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xf  reason: default package */
public class xf implements rf {
    private static final Bitmap.Config j = Bitmap.Config.ARGB_8888;
    private final yf a;
    private final Set<Bitmap.Config> b;
    private final a c;
    private long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* renamed from: xf$a */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* renamed from: xf$b */
    private static final class b implements a {
        b() {
        }

        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }

    public xf(long j2) {
        this(j2, l(), k());
    }

    xf(long j2, yf yfVar, Set<Bitmap.Config> set) {
        this.d = j2;
        this.a = yfVar;
        this.b = set;
        this.c = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + this.a;
    }

    private void j() {
        q(this.d);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static yf l() {
        return Build.VERSION.SDK_INT >= 19 ? new ag() : new pf();
    }

    private synchronized Bitmap m(int i2, int i3, Bitmap.Config config) {
        Bitmap d2;
        f(config);
        d2 = this.a.d(i2, i3, config != null ? config : j);
        if (d2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                "Missing bitmap=" + this.a.a(i2, i3, config);
            }
            this.g++;
        } else {
            this.f++;
            this.e -= (long) this.a.b(d2);
            this.c.a(d2);
            p(d2);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            "Get bitmap=" + this.a.a(i2, i3, config);
        }
        h();
        return d2;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j2) {
        while (this.e > j2) {
            Bitmap removeLast = this.a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    i();
                }
                this.e = 0;
                return;
            }
            this.c.a(removeLast);
            this.e -= (long) this.a.b(removeLast);
            this.i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                "Evicting bitmap=" + this.a.e(removeLast);
            }
            h();
            removeLast.recycle();
        }
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            "trimMemory, level=" + i2;
        }
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            b();
        } else if (i2 >= 20 || i2 == 15) {
            q(n() / 2);
        }
    }

    public void b() {
        boolean isLoggable = Log.isLoggable("LruBitmapPool", 3);
        q(0);
    }

    public synchronized void c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.a.b(bitmap)) <= this.d) {
                        if (this.b.contains(bitmap.getConfig())) {
                            int b2 = this.a.b(bitmap);
                            this.a.c(bitmap);
                            this.c.b(bitmap);
                            this.h++;
                            this.e += (long) b2;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                "Put bitmap in pool=" + this.a.e(bitmap);
                            }
                            h();
                            j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        "Reject bitmap from pool, bitmap: " + this.a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap m = m(i2, i3, config);
        if (m == null) {
            return g(i2, i3, config);
        }
        m.eraseColor(0);
        return m;
    }

    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap m = m(i2, i3, config);
        return m == null ? g(i2, i3, config) : m;
    }

    public long n() {
        return this.d;
    }
}
