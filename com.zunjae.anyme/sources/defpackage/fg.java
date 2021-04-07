package defpackage;

import android.util.Log;
import com.bumptech.glide.load.g;
import defpackage.bg;
import defpackage.ld;
import java.io.File;
import java.io.IOException;

/* renamed from: fg  reason: default package */
public class fg implements bg {
    private final kg a;
    private final File b;
    private final long c;
    private final dg d = new dg();
    private ld e;

    @Deprecated
    protected fg(File file, long j) {
        this.b = file;
        this.c = j;
        this.a = new kg();
    }

    public static bg c(File file, long j) {
        return new fg(file, j);
    }

    private synchronized ld d() {
        if (this.e == null) {
            this.e = ld.L(this.b, 1, 1, this.c);
        }
        return this.e;
    }

    private synchronized void e() {
        this.e = null;
    }

    public void a(g gVar, bg.b bVar) {
        ld.c E;
        String b2 = this.a.b(gVar);
        this.d.a(b2);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                "Put: Obtained: " + b2 + " for for Key: " + gVar;
            }
            try {
                ld d2 = d();
                if (d2.J(b2) == null) {
                    E = d2.E(b2);
                    if (E != null) {
                        if (bVar.a(E.f(0))) {
                            E.e();
                        }
                        E.b();
                        this.d.b(b2);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b2);
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            } catch (Throwable th) {
                E.b();
                throw th;
            }
        } finally {
            this.d.b(b2);
        }
    }

    public File b(g gVar) {
        String b2 = this.a.b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            "Get: Obtained: " + b2 + " for for Key: " + gVar;
        }
        try {
            ld.e J = d().J(b2);
            if (J != null) {
                return J.a(0);
            }
            return null;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    public synchronized void clear() {
        try {
            d().B();
        } catch (IOException unused) {
            try {
                boolean isLoggable = Log.isLoggable("DiskLruCacheWrapper", 5);
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        e();
    }
}
