package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.r;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class y {
    @GuardedBy("MessengerIpcClient.class")
    private static y e;
    /* access modifiers changed from: private */
    public final Context a;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService b;
    @GuardedBy("this")
    private b c = new b();
    @GuardedBy("this")
    private int d = 1;

    private class b implements ServiceConnection {
        @GuardedBy("this")
        int a;
        final Messenger b;
        c c;
        @GuardedBy("this")
        final Queue<e<?>> d;
        @GuardedBy("this")
        final SparseArray<e<?>> e;

        private b() {
            this.a = 0;
            this.b = new Messenger(new pp0(Looper.getMainLooper(), new z(this)));
            this.d = new ArrayDeque();
            this.e = new SparseArray<>();
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean a(e<?> eVar) {
            int i = this.a;
            if (i == 0) {
                this.d.add(eVar);
                k();
                return true;
            } else if (i == 1) {
                this.d.add(eVar);
                return true;
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        int i2 = this.a;
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("Unknown state: ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return false;
            } else {
                this.d.add(eVar);
                i();
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("this")
        public void b(f fVar) {
            for (e b2 : this.d) {
                b2.b(fVar);
            }
            this.d.clear();
            for (int i = 0; i < this.e.size(); i++) {
                this.e.valueAt(i).b(fVar);
            }
            this.e.clear();
        }

        /* access modifiers changed from: package-private */
        public synchronized void c(int i, String str) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Disconnected: ".concat(valueOf);
                } else {
                    new String("Disconnected: ");
                }
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            } else if (i2 == 1 || i2 == 2) {
                boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
                this.a = 4;
                com.google.android.gms.common.stats.a.b().c(y.this.a, this);
                b(new f(i, str));
            } else if (i2 == 3) {
                this.a = 4;
            } else if (i2 != 4) {
                int i3 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
            c(0, r3.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
            throw r3;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0006, B:8:0x000b] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void d(android.os.IBinder r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                r0 = 0
                if (r3 != 0) goto L_0x000b
                java.lang.String r3 = "Null service connection"
                r2.c(r0, r3)     // Catch:{ all -> 0x001a }
                monitor-exit(r2)     // Catch:{ all -> 0x001a }
                return
            L_0x000b:
                com.google.firebase.iid.y$c r1 = new com.google.firebase.iid.y$c     // Catch:{ RemoteException -> 0x001c }
                r1.<init>(r3)     // Catch:{ RemoteException -> 0x001c }
                r2.c = r1     // Catch:{ RemoteException -> 0x001c }
                r3 = 2
                r2.a = r3     // Catch:{ all -> 0x001a }
                r2.i()     // Catch:{ all -> 0x001a }
                monitor-exit(r2)     // Catch:{ all -> 0x001a }
                return
            L_0x001a:
                r3 = move-exception
                goto L_0x0026
            L_0x001c:
                r3 = move-exception
                java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x001a }
                r2.c(r0, r3)     // Catch:{ all -> 0x001a }
                monitor-exit(r2)     // Catch:{ all -> 0x001a }
                return
            L_0x0026:
                monitor-exit(r2)     // Catch:{ all -> 0x001a }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.y.b.d(android.os.IBinder):void");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void e() {
            c(2, "Service disconnected");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void f(e eVar) {
            m(eVar.a);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void g() {
            e poll;
            while (true) {
                synchronized (this) {
                    if (this.a == 2) {
                        if (this.d.isEmpty()) {
                            n();
                            return;
                        }
                        poll = this.d.poll();
                        this.e.put(poll.a, poll);
                        y.this.b.schedule(new e0(this, poll), 30, TimeUnit.SECONDS);
                    } else {
                        return;
                    }
                }
                j(poll);
            }
            while (true) {
            }
        }

        /* access modifiers changed from: package-private */
        public boolean h(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                sb.toString();
            }
            synchronized (this) {
                e eVar = this.e.get(i);
                if (eVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    sb2.toString();
                    return true;
                }
                this.e.remove(i);
                n();
                eVar.e(message.getData());
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            y.this.b.execute(new c0(this));
        }

        /* access modifiers changed from: package-private */
        public void j(e<?> eVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(eVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb.append("Sending ");
                sb.append(valueOf);
                sb.toString();
            }
            try {
                this.c.a(eVar.a(y.this.a, this.b));
            } catch (RemoteException e2) {
                c(2, e2.getMessage());
            }
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("this")
        public void k() {
            r.m(this.a == 0);
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!com.google.android.gms.common.stats.a.b().a(y.this.a, intent, this, 1)) {
                c(0, "Unable to bind to service");
            } else {
                y.this.b.schedule(new a0(this), 30, TimeUnit.SECONDS);
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void l() {
            if (this.a == 1) {
                c(1, "Timed out while binding");
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void m(int i) {
            e eVar = this.e.get(i);
            if (eVar != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                sb.toString();
                this.e.remove(i);
                eVar.b(new f(3, "Timed out waiting for response"));
                n();
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void n() {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
                this.a = 3;
                com.google.android.gms.common.stats.a.b().c(y.this.a, this);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            y.this.b.execute(new b0(this, iBinder));
        }

        public void onServiceDisconnected(ComponentName componentName) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            y.this.b.execute(new d0(this));
        }
    }

    static class c {
        private final Messenger a;
        private final i b;

        c(IBinder iBinder) {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("android.os.IMessenger".equals(interfaceDescriptor)) {
                this.a = new Messenger(iBinder);
                this.b = null;
            } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.b = new i(iBinder);
                this.a = null;
            } else {
                String valueOf = String.valueOf(interfaceDescriptor);
                if (valueOf.length() != 0) {
                    "Invalid interface descriptor: ".concat(valueOf);
                } else {
                    new String("Invalid interface descriptor: ");
                }
                throw new RemoteException();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(Message message) {
            Messenger messenger = this.a;
            if (messenger != null) {
                messenger.send(message);
                return;
            }
            i iVar = this.b;
            if (iVar != null) {
                iVar.b(message);
                return;
            }
            throw new IllegalStateException("Both messengers are null");
        }
    }

    private static class d extends e<Void> {
        d(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        public void f(Bundle bundle) {
            if (bundle.getBoolean("ack", false)) {
                c(null);
            } else {
                b(new f(4, "Invalid response to one way request"));
            }
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return true;
        }
    }

    private static abstract class e<T> {
        final int a;
        final f81<T> b = new f81<>();
        final int c;
        final Bundle d;

        e(int i, int i2, Bundle bundle) {
            this.a = i;
            this.c = i2;
            this.d = bundle;
        }

        /* access modifiers changed from: package-private */
        public Message a(Context context, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = this.c;
            obtain.arg1 = this.a;
            obtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", g());
            bundle.putString("pkg", context.getPackageName());
            bundle.putBundle("data", this.d);
            obtain.setData(bundle);
            return obtain;
        }

        /* access modifiers changed from: package-private */
        public void b(f fVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(fVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
                sb.append("Failing ");
                sb.append(valueOf);
                sb.append(" with ");
                sb.append(valueOf2);
                sb.toString();
            }
            this.b.b(fVar);
        }

        /* access modifiers changed from: package-private */
        public void c(T t) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(t);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
                sb.append("Finishing ");
                sb.append(valueOf);
                sb.append(" with ");
                sb.append(valueOf2);
                sb.toString();
            }
            this.b.c(t);
        }

        /* access modifiers changed from: package-private */
        public e81<T> d() {
            return this.b.a();
        }

        /* access modifiers changed from: package-private */
        public void e(Bundle bundle) {
            if (bundle.getBoolean("unsupported", false)) {
                b(new f(4, "Not supported by GmsCore"));
            } else {
                f(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void f(Bundle bundle);

        /* access modifiers changed from: package-private */
        public abstract boolean g();

        public String toString() {
            int i = this.c;
            int i2 = this.a;
            boolean g = g();
            StringBuilder sb = new StringBuilder(55);
            sb.append("Request { what=");
            sb.append(i);
            sb.append(" id=");
            sb.append(i2);
            sb.append(" oneWay=");
            sb.append(g);
            sb.append("}");
            return sb.toString();
        }
    }

    public static class f extends Exception {
        public f(int i, String str) {
            super(str);
        }
    }

    private static class g extends e<Bundle> {
        g(int i, int i2, Bundle bundle) {
            super(i, i2, bundle);
        }

        /* access modifiers changed from: package-private */
        public void f(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("data");
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            c(bundle2);
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return false;
        }
    }

    y(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized y c(Context context) {
        y yVar;
        synchronized (y.class) {
            if (e == null) {
                e = new y(context, lp0.a().a(1, new r80("MessengerIpcClient"), qp0.a));
            }
            yVar = e;
        }
        return yVar;
    }

    private synchronized int d() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    private synchronized <T> e81<T> f(e<T> eVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(eVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.c.a(eVar)) {
            b bVar = new b();
            this.c = bVar;
            bVar.a(eVar);
        }
        return eVar.d();
    }

    public e81<Void> e(int i, Bundle bundle) {
        return f(new d(d(), i, bundle));
    }

    public e81<Bundle> g(int i, Bundle bundle) {
        return f(new g(d(), i, bundle));
    }
}
