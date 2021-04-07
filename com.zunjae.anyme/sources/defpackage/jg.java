package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: jg  reason: default package */
public final class jg {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    /* renamed from: jg$a */
    public static final class a {
        static final int i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        final Context a;
        ActivityManager b;
        c c;
        float d = 2.0f;
        float e = ((float) i);
        float f = 0.4f;
        float g = 0.33f;
        int h = 4194304;

        public a(Context context) {
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && jg.e(this.b)) {
                this.e = Utils.FLOAT_EPSILON;
            }
        }

        public jg a() {
            return new jg(this);
        }
    }

    /* renamed from: jg$b */
    private static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        public int a() {
            return this.a.heightPixels;
        }

        public int b() {
            return this.a.widthPixels;
        }
    }

    /* renamed from: jg$c */
    interface c {
        int a();

        int b();
    }

    jg(a aVar) {
        this.c = aVar.a;
        this.d = e(aVar.b) ? aVar.h / 2 : aVar.h;
        int c2 = c(aVar.b, aVar.f, aVar.g);
        float b2 = (float) (aVar.c.b() * aVar.c.a() * 4);
        int round = Math.round(aVar.e * b2);
        int round2 = Math.round(b2 * aVar.d);
        int i = c2 - this.d;
        int i2 = round2 + round;
        if (i2 <= i) {
            this.b = round2;
            this.a = round;
        } else {
            float f = (float) i;
            float f2 = aVar.e;
            float f3 = aVar.d;
            float f4 = f / (f2 + f3);
            this.b = Math.round(f3 * f4);
            this.a = Math.round(f4 * aVar.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.b));
            sb.append(", pool size: ");
            sb.append(f(this.a));
            sb.append(", byte array size: ");
            sb.append(f(this.d));
            sb.append(", memory class limited? ");
            sb.append(i2 > c2);
            sb.append(", max size: ");
            sb.append(f(c2));
            sb.append(", memoryClass: ");
            sb.append(aVar.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.b));
            sb.toString();
        }
    }

    private static int c(ActivityManager activityManager, float f, float f2) {
        boolean e = e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i) {
        return Formatter.formatFileSize(this.c, (long) i);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}
