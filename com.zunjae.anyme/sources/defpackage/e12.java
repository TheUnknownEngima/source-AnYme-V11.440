package defpackage;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.os.Build;
import io.karn.notify.a;
import java.util.List;

/* renamed from: e12  reason: default package */
public final class e12 {
    public static final e12 a = new e12();

    private e12() {
    }

    @SuppressLint({"WrongConstant"})
    public final boolean a(z02 z02) {
        v62.f(z02, "alerting");
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        NotificationManager c = a.c.a().c();
        List<Long> list = null;
        if (c == null) {
            v62.l();
            throw null;
        } else if (c.getNotificationChannel(z02.c()) != null) {
            return true;
        } else {
            NotificationChannel notificationChannel = new NotificationChannel(z02.c(), z02.d(), z02.b() + 3);
            notificationChannel.setDescription(z02.a());
            notificationChannel.setLockscreenVisibility(z02.f());
            Integer valueOf = Integer.valueOf(z02.e());
            if (valueOf.intValue() != 0) {
                z = true;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                notificationChannel.enableLights(true);
                notificationChannel.setLightColor(z02.e());
            }
            List<Long> h = z02.h();
            if (!h.isEmpty()) {
                list = h;
            }
            if (list != null) {
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(n32.b0(list));
            }
            notificationChannel.setSound(z02.g(), new AudioAttributes.Builder().build());
            c.createNotificationChannel(notificationChannel);
            return true;
        }
    }
}
