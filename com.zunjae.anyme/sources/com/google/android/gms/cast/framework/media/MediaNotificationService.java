package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.core.app.h;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.List;

public class MediaNotificationService extends Service {
    /* access modifiers changed from: private */
    public static final u60 u = new u60("MediaNotificationService");
    private static Runnable v;
    private h e;
    private c f;
    private ComponentName g;
    private ComponentName h;
    private List<h.a> i = new ArrayList();
    private int[] j;
    private long k;
    private com.google.android.gms.cast.framework.media.internal.b l;
    private b m;
    private Resources n;
    private b o;
    /* access modifiers changed from: private */
    public a p;
    private NotificationManager q;
    private Notification r;
    /* access modifiers changed from: private */
    public com.google.android.gms.cast.framework.a s;
    private final BroadcastReceiver t = new k0(this);

    static class a {
        public final Uri a;
        public Bitmap b;

        public a(k80 k80) {
            this.a = k80 == null ? null : k80.i();
        }
    }

    static class b {
        public final MediaSessionCompat.Token a;
        public final boolean b;
        public final int c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;

        public b(boolean z, int i, String str, String str2, MediaSessionCompat.Token token, boolean z2, boolean z3) {
            this.b = z;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.a = token;
            this.f = z2;
            this.g = z3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.cast.framework.b r7) {
        /*
            java.lang.Class<com.google.android.gms.cast.framework.media.g> r0 = com.google.android.gms.cast.framework.media.g.class
            com.google.android.gms.cast.framework.media.a r1 = r7.i()
            com.google.android.gms.cast.framework.media.h r1 = r1.m()
            r2 = 0
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            com.google.android.gms.cast.framework.media.a r7 = r7.i()
            com.google.android.gms.cast.framework.media.h r7 = r7.m()
            com.google.android.gms.cast.framework.media.d0 r7 = r7.C0()
            r1 = 1
            if (r7 != 0) goto L_0x001e
            return r1
        L_0x001e:
            java.util.List r3 = e(r7)
            int[] r7 = g(r7)
            if (r3 == 0) goto L_0x004e
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x002f
            goto L_0x004e
        L_0x002f:
            int r4 = r3.size()
            r5 = 5
            if (r4 <= r5) goto L_0x004c
            u60 r4 = u
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = " provides more than 5 actions."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.c(r5, r6)
            goto L_0x0063
        L_0x004c:
            r4 = 1
            goto L_0x0064
        L_0x004e:
            u60 r4 = u
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = " doesn't provide any action."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.c(r5, r6)
        L_0x0063:
            r4 = 0
        L_0x0064:
            if (r4 == 0) goto L_0x00af
            int r3 = r3.size()
            if (r7 == 0) goto L_0x0096
            int r4 = r7.length
            if (r4 != 0) goto L_0x0070
            goto L_0x0096
        L_0x0070:
            int r4 = r7.length
            r5 = 0
        L_0x0072:
            if (r5 >= r4) goto L_0x0094
            r6 = r7[r5]
            if (r6 < 0) goto L_0x007e
            if (r6 < r3) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0072
        L_0x007e:
            u60 r7 = u
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "provides a compact view action whose index is out of bounds."
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.c(r0, r3)
            goto L_0x00ab
        L_0x0094:
            r7 = 1
            goto L_0x00ac
        L_0x0096:
            u60 r7 = u
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = " doesn't provide any actions for compact view."
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.c(r0, r3)
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 == 0) goto L_0x00af
            return r1
        L_0x00af:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.a(com.google.android.gms.cast.framework.b):boolean");
    }

    public static void b() {
        Runnable runnable = v;
        if (runnable != null) {
            runnable.run();
        }
    }

    private static List<f> e(d0 d0Var) {
        try {
            return d0Var.e0();
        } catch (RemoteException e2) {
            u.d(e2, "Unable to call %s on %s.", "getNotificationActions", d0.class.getSimpleName());
            return null;
        }
    }

    private static int[] g(d0 d0Var) {
        try {
            return d0Var.R1();
        } catch (RemoteException e2) {
            u.d(e2, "Unable to call %s on %s.", "getCompactViewActionIndices", d0.class.getSimpleName());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        h.a aVar;
        if (this.o != null) {
            a aVar2 = this.p;
            PendingIntent pendingIntent = null;
            Bitmap bitmap = aVar2 == null ? null : aVar2.b;
            h.e eVar = new h.e(this, "cast_media_notification");
            eVar.v(bitmap);
            eVar.C(this.e.M());
            eVar.r(this.o.d);
            eVar.q(this.n.getString(this.e.j(), new Object[]{this.o.e}));
            eVar.z(true);
            eVar.B(false);
            eVar.J(1);
            if (this.h != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", this.h);
                intent.setAction(this.h.flattenToString());
                pendingIntent = PendingIntent.getBroadcast(this, 1, intent, 134217728);
            }
            if (pendingIntent != null) {
                eVar.p(pendingIntent);
            }
            d0 C0 = this.e.C0();
            if (C0 != null) {
                u.e("actionsProvider != null", new Object[0]);
                this.j = (int[]) g(C0).clone();
                List<f> e2 = e(C0);
                this.i = new ArrayList();
                for (f next : e2) {
                    String i2 = next.i();
                    if (i2.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || i2.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || i2.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || i2.equals(MediaIntentReceiver.ACTION_FORWARD) || i2.equals(MediaIntentReceiver.ACTION_REWIND) || i2.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                        aVar = j(next.i());
                    } else {
                        Intent intent2 = new Intent(next.i());
                        intent2.setComponent(this.g);
                        aVar = new h.a.C0019a(next.k(), next.j(), PendingIntent.getBroadcast(this, 0, intent2, 0)).a();
                    }
                    this.i.add(aVar);
                }
            } else {
                u.e("actionsProvider == null", new Object[0]);
                this.i = new ArrayList();
                for (String j2 : this.e.i()) {
                    this.i.add(j(j2));
                }
                this.j = (int[]) this.e.k().clone();
            }
            for (h.a b2 : this.i) {
                eVar.b(b2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                a6 a6Var = new a6();
                a6Var.s(this.j);
                a6Var.r(this.o.a);
                eVar.E(a6Var);
            }
            Notification d = eVar.d();
            this.r = d;
            startForeground(1, d);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.core.app.h.a j(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.hashCode()
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r8 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            java.lang.String r9 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            java.lang.String r10 = "com.google.android.gms.cast.framework.action.REWIND"
            r11 = 0
            switch(r2) {
                case -1699820260: goto L_0x004b;
                case -945151566: goto L_0x0043;
                case -945080078: goto L_0x003b;
                case -668151673: goto L_0x0033;
                case -124479363: goto L_0x0029;
                case 235550565: goto L_0x0021;
                case 1362116196: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0053
        L_0x0019:
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x0053
            r2 = 3
            goto L_0x0054
        L_0x0021:
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L_0x0053
            r2 = 0
            goto L_0x0054
        L_0x0029:
            java.lang.String r2 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0053
            r2 = 6
            goto L_0x0054
        L_0x0033:
            boolean r2 = r1.equals(r7)
            if (r2 == 0) goto L_0x0053
            r2 = 5
            goto L_0x0054
        L_0x003b:
            boolean r2 = r1.equals(r8)
            if (r2 == 0) goto L_0x0053
            r2 = 2
            goto L_0x0054
        L_0x0043:
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L_0x0053
            r2 = 1
            goto L_0x0054
        L_0x004b:
            boolean r2 = r1.equals(r10)
            if (r2 == 0) goto L_0x0053
            r2 = 4
            goto L_0x0054
        L_0x0053:
            r2 = -1
        L_0x0054:
            r12 = 30000(0x7530, double:1.4822E-319)
            r14 = 10000(0x2710, double:4.9407E-320)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r4 = "googlecast-extra_skip_step_ms"
            r16 = 0
            switch(r2) {
                case 0: goto L_0x019c;
                case 1: goto L_0x016a;
                case 2: goto L_0x0138;
                case 3: goto L_0x00e8;
                case 4: goto L_0x0098;
                case 5: goto L_0x006e;
                case 6: goto L_0x006e;
                default: goto L_0x0061;
            }
        L_0x0061:
            u60 r2 = u
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r11] = r1
            java.lang.String r1 = "Action: %s is not a pre-defined action."
            r2.c(r1, r3)
            return r16
        L_0x006e:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7)
            android.content.ComponentName r2 = r0.g
            r1.setComponent(r2)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r11, r1, r11)
            androidx.core.app.h$a$a r2 = new androidx.core.app.h$a$a
            com.google.android.gms.cast.framework.media.h r3 = r0.e
            int r3 = r3.l()
            android.content.res.Resources r4 = r0.n
            com.google.android.gms.cast.framework.media.h r5 = r0.e
            int r5 = r5.B0()
            java.lang.String r4 = r4.getString(r5)
            r2.<init>(r3, r4, r1)
            androidx.core.app.h$a r1 = r2.a()
            return r1
        L_0x0098:
            long r1 = r0.k
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r10)
            android.content.ComponentName r6 = r0.g
            r5.setComponent(r6)
            r5.putExtra(r4, r1)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r11, r5, r3)
            com.google.android.gms.cast.framework.media.h r4 = r0.e
            int r4 = r4.D()
            com.google.android.gms.cast.framework.media.h r5 = r0.e
            int r5 = r5.r0()
            int r6 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x00c8
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r4 = r1.y()
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r5 = r1.y0()
            goto L_0x00d8
        L_0x00c8:
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00d8
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r4 = r1.z()
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r5 = r1.A0()
        L_0x00d8:
            androidx.core.app.h$a$a r1 = new androidx.core.app.h$a$a
            android.content.res.Resources r2 = r0.n
            java.lang.String r2 = r2.getString(r5)
            r1.<init>(r4, r2, r3)
            androidx.core.app.h$a r1 = r1.a()
            return r1
        L_0x00e8:
            long r1 = r0.k
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            android.content.ComponentName r5 = r0.g
            r6.setComponent(r5)
            r6.putExtra(r4, r1)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r11, r6, r3)
            com.google.android.gms.cast.framework.media.h r4 = r0.e
            int r4 = r4.o()
            com.google.android.gms.cast.framework.media.h r5 = r0.e
            int r5 = r5.m0()
            int r6 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0118
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r4 = r1.m()
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r5 = r1.o0()
            goto L_0x0128
        L_0x0118:
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0128
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r4 = r1.n()
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r5 = r1.q0()
        L_0x0128:
            androidx.core.app.h$a$a r1 = new androidx.core.app.h$a$a
            android.content.res.Resources r2 = r0.n
            java.lang.String r2 = r2.getString(r5)
            r1.<init>(r4, r2, r3)
            androidx.core.app.h$a r1 = r1.a()
            return r1
        L_0x0138:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r1 = r0.o
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x014c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8)
            android.content.ComponentName r2 = r0.g
            r1.setComponent(r2)
            android.app.PendingIntent r16 = android.app.PendingIntent.getBroadcast(r0, r11, r1, r11)
        L_0x014c:
            r1 = r16
            androidx.core.app.h$a$a r2 = new androidx.core.app.h$a$a
            com.google.android.gms.cast.framework.media.h r3 = r0.e
            int r3 = r3.F()
            android.content.res.Resources r4 = r0.n
            com.google.android.gms.cast.framework.media.h r5 = r0.e
            int r5 = r5.j0()
            java.lang.String r4 = r4.getString(r5)
            r2.<init>(r3, r4, r1)
            androidx.core.app.h$a r1 = r2.a()
            return r1
        L_0x016a:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r1 = r0.o
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x017e
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r9)
            android.content.ComponentName r2 = r0.g
            r1.setComponent(r2)
            android.app.PendingIntent r16 = android.app.PendingIntent.getBroadcast(r0, r11, r1, r11)
        L_0x017e:
            r1 = r16
            androidx.core.app.h$a$a r2 = new androidx.core.app.h$a$a
            com.google.android.gms.cast.framework.media.h r3 = r0.e
            int r3 = r3.E()
            android.content.res.Resources r4 = r0.n
            com.google.android.gms.cast.framework.media.h r5 = r0.e
            int r5 = r5.i0()
            java.lang.String r4 = r4.getString(r5)
            r2.<init>(r3, r4, r1)
            androidx.core.app.h$a r1 = r2.a()
            return r1
        L_0x019c:
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r1 = r0.o
            int r2 = r1.c
            boolean r1 = r1.b
            r3 = 2
            if (r2 != r3) goto L_0x01b2
            com.google.android.gms.cast.framework.media.h r2 = r0.e
            int r2 = r2.N()
            com.google.android.gms.cast.framework.media.h r3 = r0.e
            int r3 = r3.Q()
            goto L_0x01be
        L_0x01b2:
            com.google.android.gms.cast.framework.media.h r2 = r0.e
            int r2 = r2.p()
            com.google.android.gms.cast.framework.media.h r3 = r0.e
            int r3 = r3.Y()
        L_0x01be:
            if (r1 == 0) goto L_0x01c1
            goto L_0x01c7
        L_0x01c1:
            com.google.android.gms.cast.framework.media.h r2 = r0.e
            int r2 = r2.u()
        L_0x01c7:
            if (r1 == 0) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            com.google.android.gms.cast.framework.media.h r1 = r0.e
            int r3 = r1.d0()
        L_0x01d0:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.ComponentName r4 = r0.g
            r1.setComponent(r4)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r11, r1, r11)
            androidx.core.app.h$a$a r4 = new androidx.core.app.h$a$a
            android.content.res.Resources r5 = r0.n
            java.lang.String r3 = r5.getString(r3)
            r4.<init>(r2, r3, r1)
            androidx.core.app.h$a r1 = r4.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.j(java.lang.String):androidx.core.app.h$a");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        this.q = (NotificationManager) getSystemService("notification");
        com.google.android.gms.cast.framework.a d = com.google.android.gms.cast.framework.a.d(this);
        this.s = d;
        a i2 = d.a().i();
        this.e = i2.m();
        this.f = i2.j();
        this.n = getResources();
        this.g = new ComponentName(getApplicationContext(), i2.k());
        this.h = !TextUtils.isEmpty(this.e.R()) ? new ComponentName(getApplicationContext(), this.e.R()) : null;
        this.k = this.e.J();
        int dimensionPixelSize = this.n.getDimensionPixelSize(this.e.X());
        this.m = new b(1, dimensionPixelSize, dimensionPixelSize);
        this.l = new com.google.android.gms.cast.framework.media.internal.b(getApplicationContext(), this.m);
        if (this.h != null) {
            registerReceiver(this.t, new IntentFilter(this.h.flattenToString()));
        }
        if (m.k()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            this.q.createNotificationChannel(notificationChannel);
        }
    }

    public void onDestroy() {
        com.google.android.gms.cast.framework.media.internal.b bVar = this.l;
        if (bVar != null) {
            bVar.b();
        }
        if (this.h != null) {
            try {
                unregisterReceiver(this.t);
            } catch (IllegalArgumentException e2) {
                u.d(e2, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        v = null;
        this.q.cancel(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if ((r1 != null && r7.b == r1.b && r7.c == r1.c && defpackage.t60.f(r7.d, r1.d) && defpackage.t60.f(r7.e, r1.e) && r7.f == r1.f && r7.g == r1.g) == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "extra_media_info"
            android.os.Parcelable r2 = r1.getParcelableExtra(r2)
            com.google.android.gms.cast.MediaInfo r2 = (com.google.android.gms.cast.MediaInfo) r2
            com.google.android.gms.cast.l r3 = r2.p()
            java.lang.String r4 = "extra_remote_media_client_player_state"
            r5 = 0
            int r4 = r1.getIntExtra(r4, r5)
            java.lang.String r6 = "extra_cast_device"
            android.os.Parcelable r6 = r1.getParcelableExtra(r6)
            com.google.android.gms.cast.CastDevice r6 = (com.google.android.gms.cast.CastDevice) r6
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r15 = new com.google.android.gms.cast.framework.media.MediaNotificationService$b
            r14 = 2
            r13 = 1
            if (r4 != r14) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r9 = r2.z()
            java.lang.String r2 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r10 = r3.m(r2)
            java.lang.String r11 = r6.k()
            java.lang.String r2 = "extra_media_session_token"
            android.os.Parcelable r2 = r1.getParcelableExtra(r2)
            r12 = r2
            android.support.v4.media.session.MediaSessionCompat$Token r12 = (android.support.v4.media.session.MediaSessionCompat.Token) r12
            java.lang.String r2 = "extra_can_skip_next"
            boolean r2 = r1.getBooleanExtra(r2, r5)
            java.lang.String r4 = "extra_can_skip_prev"
            boolean r4 = r1.getBooleanExtra(r4, r5)
            r7 = r15
            r6 = 1
            r13 = r2
            r2 = 2
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r4 = "extra_media_notification_force_update"
            boolean r1 = r1.getBooleanExtra(r4, r5)
            if (r1 != 0) goto L_0x0090
            com.google.android.gms.cast.framework.media.MediaNotificationService$b r1 = r0.o
            if (r1 == 0) goto L_0x008d
            boolean r4 = r15.b
            boolean r7 = r1.b
            if (r4 != r7) goto L_0x008d
            int r4 = r15.c
            int r7 = r1.c
            if (r4 != r7) goto L_0x008d
            java.lang.String r4 = r15.d
            java.lang.String r7 = r1.d
            boolean r4 = defpackage.t60.f(r4, r7)
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = r15.e
            java.lang.String r7 = r1.e
            boolean r4 = defpackage.t60.f(r4, r7)
            if (r4 == 0) goto L_0x008d
            boolean r4 = r15.f
            boolean r7 = r1.f
            if (r4 != r7) goto L_0x008d
            boolean r4 = r15.g
            boolean r1 = r1.g
            if (r4 != r1) goto L_0x008d
            r13 = 1
            goto L_0x008e
        L_0x008d:
            r13 = 0
        L_0x008e:
            if (r13 != 0) goto L_0x0095
        L_0x0090:
            r0.o = r15
            r16.h()
        L_0x0095:
            com.google.android.gms.cast.framework.media.MediaNotificationService$a r1 = new com.google.android.gms.cast.framework.media.MediaNotificationService$a
            com.google.android.gms.cast.framework.media.c r4 = r0.f
            if (r4 == 0) goto L_0x00a2
            com.google.android.gms.cast.framework.media.b r7 = r0.m
            k80 r3 = r4.b(r3, r7)
            goto L_0x00b4
        L_0x00a2:
            boolean r4 = r3.o()
            if (r4 == 0) goto L_0x00b3
            java.util.List r3 = r3.k()
            java.lang.Object r3 = r3.get(r5)
            k80 r3 = (defpackage.k80) r3
            goto L_0x00b4
        L_0x00b3:
            r3 = 0
        L_0x00b4:
            r1.<init>(r3)
            com.google.android.gms.cast.framework.media.MediaNotificationService$a r3 = r0.p
            if (r3 == 0) goto L_0x00c6
            android.net.Uri r4 = r1.a
            android.net.Uri r3 = r3.a
            boolean r3 = defpackage.t60.f(r4, r3)
            if (r3 == 0) goto L_0x00c6
            r5 = 1
        L_0x00c6:
            if (r5 != 0) goto L_0x00d9
            com.google.android.gms.cast.framework.media.internal.b r3 = r0.l
            com.google.android.gms.cast.framework.media.j0 r4 = new com.google.android.gms.cast.framework.media.j0
            r4.<init>(r0, r1)
            r3.d(r4)
            com.google.android.gms.cast.framework.media.internal.b r3 = r0.l
            android.net.Uri r1 = r1.a
            r3.e(r1)
        L_0x00d9:
            android.app.Notification r1 = r0.r
            r0.startForeground(r6, r1)
            com.google.android.gms.cast.framework.media.i0 r1 = new com.google.android.gms.cast.framework.media.i0
            r3 = r19
            r1.<init>(r0, r3)
            v = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
