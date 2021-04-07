package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    private final int e;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel.readInt());
        }

        /* renamed from: b */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(int i) {
        this.e = (i & 2) != 0 ? i | 1 : i;
    }

    private int b(Context context) {
        if (!i()) {
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        q40.e(systemService);
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || !h(connectivityManager)) ? this.e & 3 : (!j() || !connectivityManager.isActiveNetworkMetered()) ? 0 : 2;
    }

    private boolean e(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean f(Context context) {
        Object systemService = context.getSystemService("power");
        q40.e(systemService);
        PowerManager powerManager = (PowerManager) systemService;
        int i = v50.a;
        if (i >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = r3.getNetworkCapabilities(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean h(android.net.ConnectivityManager r3) {
        /*
            int r0 = defpackage.v50.a
            r1 = 1
            r2 = 24
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            android.net.Network r0 = r3.getActiveNetwork()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0010:
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r0)
            if (r3 == 0) goto L_0x001f
            r0 = 16
            boolean r3 = r3.hasCapability(r0)
            if (r3 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.c.h(android.net.ConnectivityManager):boolean");
    }

    public boolean a(Context context) {
        return c(context) == 0;
    }

    public int c(Context context) {
        int b = b(context);
        if (d() && !e(context)) {
            b |= 8;
        }
        return (!g() || f(context)) ? b : b | 4;
    }

    public boolean d() {
        return (this.e & 8) != 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.e == ((c) obj).e;
    }

    public boolean g() {
        return (this.e & 4) != 0;
    }

    public int hashCode() {
        return this.e;
    }

    public boolean i() {
        return (this.e & 1) != 0;
    }

    public boolean j() {
        return (this.e & 2) != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
    }
}
