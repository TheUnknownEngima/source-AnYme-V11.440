package defpackage;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* renamed from: yc  reason: default package */
public class yc {
    public static final long b = TimeUnit.SECONDS.toMillis(12);
    private Timer a;

    /* renamed from: yc$a */
    public static class a extends c {
        private final c e;

        public a(c cVar) {
            this.e = cVar;
        }

        public void a() {
            this.e.a();
        }

        public void b(Exception exc) {
            this.e.b(exc);
        }
    }

    /* renamed from: yc$b */
    public static abstract class b extends c {
        private final Random e = new Random();
        final long f = yc.b;
        int g = 0;

        private void g() {
            int i = this.g + 1;
            this.g = i;
            d(c(i, this.f));
        }

        public void a() {
            e();
            if (this.g > 0) {
                f();
                d(yc.b);
            }
        }

        public void b(Exception exc) {
            if (exc instanceof vb) {
                g();
            } else {
                exc.printStackTrace();
            }
        }

        public long c(int i, long j) {
            long pow = (long) (((double) (j / 1000)) * Math.pow(2.0d, (double) Math.min(i, 15)));
            double nextDouble = this.e.nextDouble() * ((double) Math.min(pow, 18000));
            return ((long) Math.min(((double) pow) + nextDouble, nextDouble + 43200.0d)) * 1000;
        }

        /* access modifiers changed from: protected */
        public abstract void d(long j);

        public abstract void e();

        public void f() {
            this.g = 0;
        }
    }

    /* renamed from: yc$c */
    public static abstract class c extends TimerTask {
        public abstract void a();

        public abstract void b(Exception exc);

        public void run() {
            try {
                a();
            } catch (Exception e) {
                b(e);
            }
        }
    }

    public void a() {
        Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
            this.a = null;
        }
    }

    public void b(long j, c cVar) {
        Timer timer = new Timer();
        this.a = timer;
        timer.schedule(cVar, j, j);
    }
}
