package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: hd  reason: default package */
public class hd {
    private a a;

    /* renamed from: hd$a */
    public interface a {
        long a();

        long b();

        long c();
    }

    /* renamed from: hd$b */
    public static abstract class b implements a {
        protected final ActivityManager a;
        protected long b;
        protected long c;
        protected Context d;

        public b(Context context) {
            this.a = (ActivityManager) context.getSystemService("activity");
            this.d = context;
        }

        public long b() {
            return this.c;
        }

        /* access modifiers changed from: protected */
        public Double d() {
            new DecimalFormat("#.##");
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
                Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
                String str = "";
                while (matcher.find()) {
                    str = matcher.group(1);
                }
                randomAccessFile.close();
                return Double.valueOf(Double.parseDouble(str));
            } catch (Exception unused) {
                return Double.valueOf(-1.0d);
            }
        }
    }

    /* renamed from: hd$c */
    public static class c extends b {
        public c(Context context) {
            super(context);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) this.d.getSystemService("activity")).getMemoryInfo(memoryInfo);
            this.c = memoryInfo.availMem;
            this.b = memoryInfo.totalMem;
        }

        public long a() {
            return this.b - this.c;
        }

        public long c() {
            return this.b;
        }
    }

    /* renamed from: hd$d */
    public static class d extends b {
        public d(Context context) {
            super(context);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.a.getRunningAppProcesses();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses == null ? Collections.emptyList() : runningAppProcesses) {
                if (next.uid > 1000) {
                    this.b += (long) this.a.getProcessMemoryInfo(new int[]{next.pid})[0].getTotalPss();
                }
            }
        }

        public long a() {
            return this.b;
        }

        public long c() {
            return Math.round(d().doubleValue());
        }
    }

    public hd(Context context) {
        this.a = Build.VERSION.SDK_INT >= 21 ? new c(context) : new d(context);
    }

    public long a() {
        return this.a.b();
    }

    public long b() {
        return this.a.c();
    }

    public long c() {
        return this.a.a();
    }
}
