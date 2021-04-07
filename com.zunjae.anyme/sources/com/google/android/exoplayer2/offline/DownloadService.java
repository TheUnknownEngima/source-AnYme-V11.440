package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.exoplayer2.offline.c;
import com.google.android.exoplayer2.scheduler.e;
import java.util.HashMap;
import java.util.List;

public abstract class DownloadService extends Service {
    private static final HashMap<Class<? extends DownloadService>, b> n = new HashMap<>();
    private final c e;
    private final String f;
    private final int g;
    private final int h;
    private c i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;

    private static final class b implements c.b {
        private final Context a;
        /* access modifiers changed from: private */
        public final c b;
        private final boolean c;
        private final e d;
        private final Class<? extends DownloadService> e;
        private DownloadService f;

        private b(Context context, c cVar, boolean z, e eVar, Class<? extends DownloadService> cls) {
            this.a = context;
            this.b = cVar;
            this.c = z;
            this.d = eVar;
            this.e = cls;
            cVar.b(this);
            j();
        }

        private void h() {
            if (this.c) {
                v50.C0(this.a, DownloadService.e(this.a, this.e, "com.google.android.exoplayer.downloadService.action.RESTART"));
                return;
            }
            try {
                this.a.startService(DownloadService.e(this.a, this.e, "com.google.android.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused) {
                b50.h("DownloadService", "Failed to restart DownloadService (process is idle).");
            }
        }

        private boolean i() {
            DownloadService downloadService = this.f;
            return downloadService == null || downloadService.g();
        }

        private void j() {
            if (this.d != null) {
                if (this.b.h()) {
                    String packageName = this.a.getPackageName();
                    if (!this.d.a(this.b.e(), packageName, "com.google.android.exoplayer.downloadService.action.RESTART")) {
                        b50.c("DownloadService", "Scheduling downloads failed.");
                        return;
                    }
                    return;
                }
                this.d.cancel();
            }
        }

        public /* synthetic */ void a(c cVar, boolean z) {
            d.a(this, cVar, z);
        }

        public void b(c cVar, boolean z) {
            if (!z && !cVar.d() && i()) {
                List<b> c2 = cVar.c();
                int i = 0;
                while (true) {
                    if (i >= c2.size()) {
                        break;
                    } else if (c2.get(i).a == 0) {
                        h();
                        break;
                    } else {
                        i++;
                    }
                }
            }
            j();
        }

        public /* synthetic */ void c(c cVar, com.google.android.exoplayer2.scheduler.c cVar2, int i) {
            d.b(this, cVar, cVar2, i);
        }

        public void e(DownloadService downloadService) {
            q40.f(this.f == null);
            this.f = downloadService;
            if (this.b.g()) {
                new Handler().postAtFrontOfQueue(new a(this, downloadService));
            }
        }

        public void f(DownloadService downloadService) {
            q40.f(this.f == downloadService);
            this.f = null;
            if (this.d != null && !this.b.h()) {
                this.d.cancel();
            }
        }

        public /* synthetic */ void g(DownloadService downloadService) {
            downloadService.i(this.b.c());
        }
    }

    private final class c {
        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    /* access modifiers changed from: private */
    public static Intent e(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    /* access modifiers changed from: private */
    public boolean g() {
        return this.m;
    }

    private static boolean h(int i2) {
        return i2 == 2 || i2 == 5 || i2 == 7;
    }

    /* access modifiers changed from: private */
    public void i(List<b> list) {
        if (this.e != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (h(list.get(i2).a)) {
                    this.e.b();
                    return;
                }
            }
        }
    }

    private void j() {
        boolean z;
        c cVar = this.e;
        if (cVar != null) {
            cVar.c();
        }
        if (v50.a >= 28 || !this.l) {
            z = this.m | stopSelfResult(this.j);
        } else {
            stopSelf();
            z = true;
        }
        this.m = z;
    }

    /* access modifiers changed from: protected */
    public abstract c d();

    /* access modifiers changed from: protected */
    public abstract e f();

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        String str = this.f;
        if (str != null) {
            g50.a(this, str, this.g, this.h, 2);
        }
        Class<DownloadService> cls = DownloadService.class;
        b bVar = n.get(cls);
        if (bVar == null) {
            boolean z = this.e != null;
            e f2 = z ? f() : null;
            c d = d();
            this.i = d;
            d.n();
            bVar = new b(getApplicationContext(), this.i, z, f2, cls);
            n.put(cls, bVar);
        } else {
            this.i = bVar.b;
        }
        bVar.e(this);
    }

    public void onDestroy() {
        b bVar = n.get(DownloadService.class);
        q40.e(bVar);
        bVar.f(this);
        c cVar = this.e;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r8, int r9, int r10) {
        /*
            r7 = this;
            r7.j = r10
            r9 = 0
            r7.l = r9
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.RESTART"
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x002d
            java.lang.String r0 = r8.getAction()
            java.lang.String r2 = "content_id"
            java.lang.String r2 = r8.getStringExtra(r2)
            boolean r3 = r7.k
            java.lang.String r4 = "foreground"
            boolean r4 = r8.getBooleanExtra(r4, r9)
            if (r4 != 0) goto L_0x0028
            boolean r4 = r10.equals(r0)
            if (r4 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r4 = 0
            goto L_0x0029
        L_0x0028:
            r4 = 1
        L_0x0029:
            r3 = r3 | r4
            r7.k = r3
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
            if (r0 != 0) goto L_0x0033
            r0 = r3
        L_0x0033:
            com.google.android.exoplayer2.offline.c r4 = r7.i
            defpackage.q40.e(r4)
            com.google.android.exoplayer2.offline.c r4 = (com.google.android.exoplayer2.offline.c) r4
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -1931239035: goto L_0x0090;
                case -932047176: goto L_0x0086;
                case -871181424: goto L_0x007e;
                case -650547439: goto L_0x0074;
                case -119057172: goto L_0x0069;
                case 191112771: goto L_0x005f;
                case 671523141: goto L_0x0055;
                case 1015676687: goto L_0x004d;
                case 1547520644: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0099
        L_0x0043:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 3
            goto L_0x0099
        L_0x004d:
            boolean r10 = r0.equals(r3)
            if (r10 == 0) goto L_0x0099
            r5 = 0
            goto L_0x0099
        L_0x0055:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 7
            goto L_0x0099
        L_0x005f:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 6
            goto L_0x0099
        L_0x0069:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 8
            goto L_0x0099
        L_0x0074:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 4
            goto L_0x0099
        L_0x007e:
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 1
            goto L_0x0099
        L_0x0086:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 5
            goto L_0x0099
        L_0x0090:
            java.lang.String r10 = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0099
            r5 = 2
        L_0x0099:
            java.lang.String r10 = "stop_reason"
            java.lang.String r3 = "DownloadService"
            switch(r5) {
                case 0: goto L_0x0118;
                case 1: goto L_0x0118;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00e2;
                case 6: goto L_0x00de;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00b1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            java.lang.String r8 = "Ignored unrecognized action: "
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0111
            java.lang.String r8 = r8.concat(r10)
            goto L_0x0105
        L_0x00b1:
            defpackage.q40.e(r8)
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r10 = "requirements"
            android.os.Parcelable r8 = r8.getParcelableExtra(r10)
            com.google.android.exoplayer2.scheduler.c r8 = (com.google.android.exoplayer2.scheduler.c) r8
            if (r8 != 0) goto L_0x00c3
            java.lang.String r8 = "Ignored SET_REQUIREMENTS: Missing requirements extra"
            goto L_0x0105
        L_0x00c3:
            r4.p(r8)
            goto L_0x0118
        L_0x00c7:
            defpackage.q40.e(r8)
            r0 = r8
            android.content.Intent r0 = (android.content.Intent) r0
            boolean r0 = r0.hasExtra(r10)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r8 = "Ignored SET_STOP_REASON: Missing stop_reason extra"
            goto L_0x0105
        L_0x00d6:
            int r8 = r8.getIntExtra(r10, r9)
            r4.q(r2, r8)
            goto L_0x0118
        L_0x00de:
            r4.k()
            goto L_0x0118
        L_0x00e2:
            r4.n()
            goto L_0x0118
        L_0x00e6:
            r4.l()
            goto L_0x0118
        L_0x00ea:
            if (r2 != 0) goto L_0x00ef
            java.lang.String r8 = "Ignored REMOVE_DOWNLOAD: Missing content_id extra"
            goto L_0x0105
        L_0x00ef:
            r4.m(r2)
            goto L_0x0118
        L_0x00f3:
            defpackage.q40.e(r8)
            r0 = r8
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = "download_request"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            com.google.android.exoplayer2.offline.e r0 = (com.google.android.exoplayer2.offline.e) r0
            if (r0 != 0) goto L_0x0109
            java.lang.String r8 = "Ignored ADD_DOWNLOAD: Missing download_request extra"
        L_0x0105:
            defpackage.b50.c(r3, r8)
            goto L_0x0118
        L_0x0109:
            int r8 = r8.getIntExtra(r10, r9)
            r4.a(r0, r8)
            goto L_0x0118
        L_0x0111:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8)
            r8 = r10
            goto L_0x0105
        L_0x0118:
            int r8 = defpackage.v50.a
            r10 = 26
            if (r8 < r10) goto L_0x0129
            boolean r8 = r7.k
            if (r8 == 0) goto L_0x0129
            com.google.android.exoplayer2.offline.DownloadService$c r8 = r7.e
            if (r8 == 0) goto L_0x0129
            r8.a()
        L_0x0129:
            r7.m = r9
            boolean r8 = r4.f()
            if (r8 == 0) goto L_0x0134
            r7.j()
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onTaskRemoved(Intent intent) {
        this.l = true;
    }
}
