package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.h;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    public static class C0110a {
        public final h.e a;
        public final String b;
        public final int c;

        C0110a(h.e eVar, String str, int i) {
            this.a = eVar;
            this.b = str;
            this.c = i;
        }
    }

    private static PendingIntent a(Context context, q qVar, String str, PackageManager packageManager) {
        Intent f = f(str, qVar, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(qVar.y());
        PendingIntent activity = PendingIntent.getActivity(context, g(), f, 1073741824);
        return p(qVar) ? q(context, qVar, activity) : activity;
    }

    private static PendingIntent b(Context context, q qVar) {
        if (!p(qVar)) {
            return null;
        }
        return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(qVar.x()));
    }

    private static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    static C0110a d(Context context, q qVar) {
        Bundle j = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), qVar, k(context, qVar.k(), j), context.getResources(), context.getPackageManager(), j);
    }

    public static C0110a e(Context context, String str, q qVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        h.e eVar = new h.e(context, str2);
        String n = qVar.n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.r(n);
        }
        String n2 = qVar.n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.q(n2);
            h.c cVar = new h.c();
            cVar.l(n2);
            eVar.E(cVar);
        }
        eVar.C(l(packageManager, resources, str, qVar.p("gcm.n.icon"), bundle));
        Uri m = m(str, qVar, resources);
        if (m != null) {
            eVar.D(m);
        }
        eVar.p(a(context, qVar, str, packageManager));
        PendingIntent b = b(context, qVar);
        if (b != null) {
            eVar.t(b);
        }
        Integer h = h(context, qVar.p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.o(h.intValue());
        }
        eVar.l(!qVar.a("gcm.n.sticky"));
        eVar.x(qVar.a("gcm.n.local_only"));
        String p = qVar.p("gcm.n.ticker");
        if (p != null) {
            eVar.G(p);
        }
        Integer m2 = qVar.m();
        if (m2 != null) {
            eVar.A(m2.intValue());
        }
        Integer r = qVar.r();
        if (r != null) {
            eVar.J(r.intValue());
        }
        Integer l = qVar.l();
        if (l != null) {
            eVar.y(l.intValue());
        }
        Long j = qVar.j("gcm.n.event_time");
        if (j != null) {
            eVar.B(true);
            eVar.K(j.longValue());
        }
        long[] q = qVar.q();
        if (q != null) {
            eVar.I(q);
        }
        int[] e = qVar.e();
        if (e != null) {
            eVar.w(e[0], e[1], e[2]);
        }
        eVar.s(i(qVar));
        return new C0110a(eVar, n(qVar), 0);
    }

    private static Intent f(String str, q qVar, PackageManager packageManager) {
        String p = qVar.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = qVar.f();
        if (f == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(f);
        return intent2;
    }

    private static int g() {
        return a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                sb.toString();
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(androidx.core.content.a.d(context, i));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        return null;
    }

    private static int i(q qVar) {
        int i = qVar.a("gcm.n.default_sound") ? 1 : 0;
        if (qVar.a("gcm.n.default_vibrate_timings")) {
            i |= 2;
        }
        return qVar.a("gcm.n.default_light_settings") ? i | 4 : i;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            sb.toString();
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    private static String k(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                sb.toString();
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && o(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && o(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            sb.toString();
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !o(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                sb2.toString();
            }
        }
        if (i == 0 || !o(resources, i)) {
            return 17301651;
        }
        return i;
    }

    private static Uri m(String str, q qVar, Resources resources) {
        String o = qVar.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(o);
        return Uri.parse(sb.toString());
    }

    private static String n(q qVar) {
        String p = qVar.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    @TargetApi(26)
    private static boolean o(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            sb.toString();
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            sb2.toString();
            return false;
        }
    }

    static boolean p(q qVar) {
        return qVar.a("google.c.a.e");
    }

    private static PendingIntent q(Context context, q qVar, PendingIntent pendingIntent) {
        return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(qVar.x()).putExtra("pending_intent", pendingIntent));
    }
}
