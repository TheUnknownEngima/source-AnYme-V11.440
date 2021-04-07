package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.h;

/* renamed from: s7  reason: default package */
public class s7 extends u7<Boolean> {
    private static final String h = h.f("BatteryChrgTracker");

    public s7(Context context) {
        super(context);
    }

    private boolean j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    public IntentFilter g() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r6.equals("android.os.action.CHARGING") != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.work.h r7 = androidx.work.h.c()
            java.lang.String r0 = h
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            r2 = 3
            r4 = 2
            switch(r0) {
                case -1886648615: goto L_0x0046;
                case -54942926: goto L_0x003c;
                case 948344062: goto L_0x0033;
                case 1019184907: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0050
        L_0x0029:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r3 = 2
            goto L_0x0051
        L_0x0033:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            goto L_0x0051
        L_0x003c:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r3 = 1
            goto L_0x0051
        L_0x0046:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0050
            r3 = 3
            goto L_0x0051
        L_0x0050:
            r3 = -1
        L_0x0051:
            if (r3 == 0) goto L_0x005d
            if (r3 == r1) goto L_0x005a
            if (r3 == r4) goto L_0x005d
            if (r3 == r2) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x005f
        L_0x005d:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
        L_0x005f:
            r5.d(r6)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7.h(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(j(registerReceiver));
        }
        h.c().b(h, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
