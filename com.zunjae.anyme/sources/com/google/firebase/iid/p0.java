package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.i;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

class p0 {
    private static int h;
    private static PendingIntent i;
    @GuardedBy("responseCallbacks")
    private final h0<String, f81<Bundle>> a = new h0<>();
    private final Context b;
    private final f0 c;
    private final ScheduledExecutorService d;
    private Messenger e;
    private Messenger f;
    private i g;

    class a extends pp0 {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            p0.this.d(message);
        }
    }

    public p0(Context context, f0 f0Var) {
        this.b = context;
        this.c = f0Var;
        this.e = new Messenger(new a(Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    private static boolean b(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private void c(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                k(intent);
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent.getExtras();
                extras.putString("registration_id", group2);
                q(group, extras);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(stringExtra);
                if (valueOf.length() != 0) {
                    "Unexpected response string: ".concat(valueOf);
                } else {
                    new String("Unexpected response string: ");
                }
            }
        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(action);
            if (valueOf2.length() != 0) {
                "Unexpected response action: ".concat(valueOf2);
            } else {
                new String("Unexpected response action: ");
            }
        }
    }

    /* access modifiers changed from: private */
    public void d(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new i.b());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        this.g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f = (Messenger) parcelableExtra;
                    }
                }
                c((Intent) message.obj);
            }
        }
    }

    static final /* synthetic */ Bundle e(e81 e81) {
        if (e81.q()) {
            return (Bundle) e81.m();
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(e81.l());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            sb.toString();
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static final /* synthetic */ e81 h(Bundle bundle) {
        return b(bundle) ? h81.e(null) : h81.e(bundle);
    }

    public static synchronized String j() {
        String num;
        synchronized (p0.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private e81<Bundle> m(Bundle bundle) {
        String j = j();
        f81 f81 = new f81();
        synchronized (this.a) {
            this.a.put(j, f81);
        }
        r(bundle, j);
        f81.a().c(h.a(), new n0(this, j, this.d.schedule(new m0(f81), 30, TimeUnit.SECONDS)));
        return f81.a();
    }

    private e81<Bundle> n(Bundle bundle) {
        return !this.c.g() ? h81.d(new IOException("MISSING_INSTANCEID_SERVICE")) : m(bundle).k(h.a(), new l0(this, bundle));
    }

    public static synchronized void p(Context context, Intent intent) {
        synchronized (p0.class) {
            if (i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            h0<java.lang.String, f81<android.os.Bundle>> r0 = r2.a
            monitor-enter(r0)
            h0<java.lang.String, f81<android.os.Bundle>> r1 = r2.a     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            f81 r1 = (defpackage.f81) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.c(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.p0.q(java.lang.String, android.os.Bundle):void");
    }

    private void r(Bundle bundle, String str) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.c.e() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        p(this.b, intent);
        o(intent, str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str, ScheduledFuture scheduledFuture, e81 e81) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e81 i(Bundle bundle, e81 e81) {
        return (e81.q() && b((Bundle) e81.m())) ? m(bundle).s(h.a(), o0.a) : e81;
    }

    /* access modifiers changed from: package-private */
    public void k(Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unexpected response, no error or registration id ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(stringExtra);
            if (valueOf2.length() != 0) {
                "Received InstanceID error ".concat(valueOf2);
            } else {
                new String("Received InstanceID error ");
            }
        }
        if (stringExtra.startsWith("|")) {
            String[] split = stringExtra.split("\\|");
            if (split.length <= 2 || !"ID".equals(split[1])) {
                String valueOf3 = String.valueOf(stringExtra);
                if (valueOf3.length() != 0) {
                    "Unexpected structured response ".concat(valueOf3);
                } else {
                    new String("Unexpected structured response ");
                }
            } else {
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                q(str, intent.putExtra("error", str2).getExtras());
            }
        } else {
            synchronized (this.a) {
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    q(this.a.i(i2), intent.getExtras());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e81<Bundle> l(Bundle bundle) {
        return this.c.d() >= 12000000 ? y.c(this.b).g(1, bundle).i(h.a(), k0.a) : n(bundle);
    }

    /* access modifiers changed from: protected */
    public void o(Intent intent, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
        sb.append("|ID|");
        sb.append(str);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            sb2.toString();
        }
        intent.putExtra("google.messenger", this.e);
        if (!(this.f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                if (this.f != null) {
                    this.f.send(obtain);
                    return;
                } else {
                    this.g.b(obtain);
                    return;
                }
            } catch (RemoteException unused) {
                boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
            }
        }
        if (this.c.e() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
    }
}
