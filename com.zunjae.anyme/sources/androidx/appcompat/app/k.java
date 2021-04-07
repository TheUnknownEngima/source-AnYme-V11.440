package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.b;
import java.util.Calendar;

class k {
    private static k d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    private static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }

    k(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static k a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c2 = b.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (b.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.c.f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        j b2 = j.b();
        j jVar = b2;
        jVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b2.a;
        jVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.c == 1;
        long j3 = b2.b;
        long j4 = j2;
        long j5 = b2.a;
        long j6 = j3;
        boolean z2 = z;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b2.b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.a = z2;
        aVar.b = j4;
        aVar.c = j6;
        aVar.d = j5;
        aVar.e = j7;
        aVar.f = j;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
