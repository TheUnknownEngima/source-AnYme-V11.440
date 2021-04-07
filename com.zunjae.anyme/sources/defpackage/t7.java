package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;

/* renamed from: t7  reason: default package */
public class t7 extends u7<Boolean> {
    private static final String h = h.f("BatteryNotLowTracker");

    public t7(Context context) {
        super(context);
    }

    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r6.equals("android.intent.action.BATTERY_OKAY") != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.work.h r6 = androidx.work.h.c()
            java.lang.String r0 = h
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.getAction()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r6.a(r0, r2, r3)
            java.lang.String r6 = r7.getAction()
            r7 = -1
            int r0 = r6.hashCode()
            r2 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
            if (r0 == r2) goto L_0x0040
            r2 = 490310653(0x1d398bfd, float:2.4556918E-21)
            if (r0 == r2) goto L_0x0036
            goto L_0x0049
        L_0x0036:
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0040:
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r4 = -1
        L_0x004a:
            if (r4 == 0) goto L_0x0052
            if (r4 == r1) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L_0x0054
        L_0x0052:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
        L_0x0054:
            r5.d(r6)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7.h(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            h.c().b(h, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
