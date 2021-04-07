package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.f;
import androidx.room.g;
import androidx.room.i;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class j {
    final Context a;
    final String b;
    int c;
    final i d;
    final i.c e;
    g f;
    final Executor g;
    final f h = new a();
    final AtomicBoolean i = new AtomicBoolean(false);
    final ServiceConnection j = new b();
    final Runnable k = new c();
    final Runnable l = new d();

    class a extends f.a {

        /* renamed from: androidx.room.j$a$a  reason: collision with other inner class name */
        class C0055a implements Runnable {
            final /* synthetic */ String[] e;

            C0055a(String[] strArr) {
                this.e = strArr;
            }

            public void run() {
                j.this.d.g(this.e);
            }
        }

        a() {
        }

        public void y0(String[] strArr) {
            j.this.g.execute(new C0055a(strArr));
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j.this.f = g.a.p3(iBinder);
            j jVar = j.this;
            jVar.g.execute(jVar.k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            j jVar = j.this;
            jVar.g.execute(jVar.l);
            j.this.f = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                g gVar = j.this.f;
                if (gVar != null) {
                    j.this.c = gVar.L0(j.this.h, j.this.b);
                    j.this.d.a(j.this.e);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            j jVar = j.this;
            jVar.d.i(jVar.e);
        }
    }

    class e extends i.c {
        e(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        public void b(Set<String> set) {
            if (!j.this.i.get()) {
                try {
                    g gVar = j.this.f;
                    if (gVar != null) {
                        gVar.S2(j.this.c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }

    j(Context context, String str, i iVar, Executor executor) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.d = iVar;
        this.g = executor;
        this.e = new e((String[]) iVar.a.keySet().toArray(new String[0]));
        this.a.bindService(new Intent(this.a, MultiInstanceInvalidationService.class), this.j, 1);
    }
}
