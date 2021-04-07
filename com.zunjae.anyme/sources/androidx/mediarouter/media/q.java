package androidx.mediarouter.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.mediarouter.media.h;

public class q {
    static final boolean j = Log.isLoggable("RemotePlaybackClient", 3);
    private final h.f a;
    private final d b;
    private final PendingIntent c;
    private boolean d;
    private boolean e;
    private boolean f;
    String g;
    h h;
    f i;

    class a extends h.c {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Intent c;
        final /* synthetic */ e d;

        a(String str, String str2, Intent intent, e eVar) {
            this.a = str;
            this.b = str2;
            this.c = intent;
            this.d = eVar;
        }

        public void a(String str, Bundle bundle) {
            q.this.g(this.c, this.d, str, bundle);
        }

        public void b(Bundle bundle) {
            if (bundle != null) {
                String i = q.i(this.a, bundle.getString("android.media.intent.extra.SESSION_ID"));
                m a2 = m.a(bundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
                String i2 = q.i(this.b, bundle.getString("android.media.intent.extra.ITEM_ID"));
                a a3 = a.a(bundle.getBundle("android.media.intent.extra.ITEM_STATUS"));
                q.this.a(i);
                if (!(i == null || i2 == null || a3 == null)) {
                    if (q.j) {
                        "Received result from " + this.c.getAction() + ": data=" + q.b(bundle) + ", sessionId=" + i + ", sessionStatus=" + a2 + ", itemId=" + i2 + ", itemStatus=" + a3;
                    }
                    this.d.b(bundle, i, a2, i2, a3);
                    return;
                }
            }
            q.this.h(this.c, this.d, bundle);
        }
    }

    class b extends h.c {
        final /* synthetic */ String a;
        final /* synthetic */ Intent b;
        final /* synthetic */ g c;

        b(String str, Intent intent, g gVar) {
            this.a = str;
            this.b = intent;
            this.c = gVar;
        }

        public void a(String str, Bundle bundle) {
            q.this.g(this.b, this.c, str, bundle);
        }

        public void b(Bundle bundle) {
            boolean equals;
            boolean equals2;
            if (bundle != null) {
                String i = q.i(this.a, bundle.getString("android.media.intent.extra.SESSION_ID"));
                m a2 = m.a(bundle.getBundle("android.media.intent.extra.SESSION_STATUS"));
                q.this.a(i);
                if (i != null) {
                    if (q.j) {
                        "Received result from " + this.b.getAction() + ": data=" + q.b(bundle) + ", sessionId=" + i + ", sessionStatus=" + a2;
                    }
                    try {
                        this.c.b(bundle, i, a2);
                        if (equals && equals2) {
                            return;
                        }
                        return;
                    } finally {
                        if (this.b.getAction().equals("android.media.intent.action.END_SESSION") && i.equals(q.this.g)) {
                            q.this.r((String) null);
                        }
                    }
                }
            }
            q.this.h(this.b, this.c, bundle);
        }
    }

    public static abstract class c {
        public void a(String str, int i, Bundle bundle) {
        }
    }

    private final class d extends BroadcastReceiver {
        d() {
        }

        public void onReceive(Context context, Intent intent) {
            a a2;
            String stringExtra = intent.getStringExtra("android.media.intent.extra.SESSION_ID");
            if (stringExtra == null || !stringExtra.equals(q.this.g)) {
                "Discarding spurious status callback with missing or invalid session id: sessionId=" + stringExtra;
                return;
            }
            m a3 = m.a(intent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
            String action = intent.getAction();
            if (action.equals("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED")) {
                String stringExtra2 = intent.getStringExtra("android.media.intent.extra.ITEM_ID");
                if (stringExtra2 != null && (a2 = a.a(intent.getBundleExtra("android.media.intent.extra.ITEM_STATUS"))) != null) {
                    if (q.j) {
                        "Received item status callback: sessionId=" + stringExtra + ", sessionStatus=" + a3 + ", itemId=" + stringExtra2 + ", itemStatus=" + a2;
                    }
                    h hVar = q.this.h;
                    if (hVar != null) {
                        hVar.a(intent.getExtras(), stringExtra, a3, stringExtra2, a2);
                    }
                }
            } else if (action.equals("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED")) {
                if (a3 != null) {
                    if (q.j) {
                        "Received session status callback: sessionId=" + stringExtra + ", sessionStatus=" + a3;
                    }
                    h hVar2 = q.this.h;
                    if (hVar2 != null) {
                        hVar2.c(intent.getExtras(), stringExtra, a3);
                    }
                }
            } else if (action.equals("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED")) {
                if (q.j) {
                    "Received message callback: sessionId=" + stringExtra;
                }
                f fVar = q.this.i;
                if (fVar != null) {
                    fVar.a(stringExtra, intent.getBundleExtra("android.media.intent.extra.MESSAGE"));
                }
            }
        }
    }

    public static abstract class e extends c {
        public void b(Bundle bundle, String str, m mVar, String str2, a aVar) {
        }
    }

    public interface f {
        void a(String str, Bundle bundle);
    }

    public static abstract class g extends c {
        public void b(Bundle bundle, String str, m mVar) {
        }
    }

    public static abstract class h {
        public abstract void a(Bundle bundle, String str, m mVar, String str2, a aVar);

        public abstract void b(String str);

        public abstract void c(Bundle bundle, String str, m mVar);
    }

    public q(Context context, h.f fVar) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (fVar != null) {
            this.a = fVar;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED");
            intentFilter.addAction("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED");
            intentFilter.addAction("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED");
            d dVar = new d();
            this.b = dVar;
            context.registerReceiver(dVar, intentFilter);
            Intent intent = new Intent("androidx.mediarouter.media.actions.ACTION_ITEM_STATUS_CHANGED");
            intent.setPackage(context.getPackageName());
            this.c = PendingIntent.getBroadcast(context, 0, intent, 0);
            Intent intent2 = new Intent("androidx.mediarouter.media.actions.ACTION_SESSION_STATUS_CHANGED");
            intent2.setPackage(context.getPackageName());
            PendingIntent.getBroadcast(context, 0, intent2, 0);
            Intent intent3 = new Intent("androidx.mediarouter.media.actions.ACTION_MESSAGE_RECEIVED");
            intent3.setPackage(context.getPackageName());
            PendingIntent.getBroadcast(context, 0, intent3, 0);
            c();
        } else {
            throw new IllegalArgumentException("route must not be null");
        }
    }

    static String b(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        bundle.size();
        return bundle.toString();
    }

    private void c() {
        boolean z = true;
        boolean z2 = q("android.media.intent.action.PLAY") && q("android.media.intent.action.SEEK") && q("android.media.intent.action.GET_STATUS") && q("android.media.intent.action.PAUSE") && q("android.media.intent.action.RESUME") && q("android.media.intent.action.STOP");
        this.d = z2;
        this.e = z2 && q("android.media.intent.action.ENQUEUE") && q("android.media.intent.action.REMOVE");
        if (!this.d || !q("android.media.intent.action.START_SESSION") || !q("android.media.intent.action.GET_SESSION_STATUS") || !q("android.media.intent.action.END_SESSION")) {
            z = false;
        }
        this.f = z;
        d();
    }

    private boolean d() {
        for (IntentFilter hasAction : this.a.d()) {
            if (hasAction.hasAction("android.media.intent.action.SEND_MESSAGE")) {
                return true;
            }
        }
        return false;
    }

    static String i(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        if (str == null || str.equals(str2)) {
            return str2;
        }
        return null;
    }

    private static void j(Intent intent) {
        if (j) {
            "Sending request: " + intent;
        }
    }

    private void l(Intent intent, String str, String str2, Bundle bundle, e eVar) {
        intent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
        if (str != null) {
            intent.putExtra("android.media.intent.extra.SESSION_ID", str);
        }
        if (str2 != null) {
            intent.putExtra("android.media.intent.extra.ITEM_ID", str2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        j(intent);
        this.a.K(intent, new a(str, str2, intent, eVar));
    }

    private void m(Intent intent, String str, Bundle bundle, g gVar) {
        intent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
        if (str != null) {
            intent.putExtra("android.media.intent.extra.SESSION_ID", str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        j(intent);
        this.a.K(intent, new b(str, intent, gVar));
    }

    private void o(Uri uri, String str, Bundle bundle, long j2, Bundle bundle2, e eVar, String str2) {
        if (uri != null) {
            u();
            if (str2.equals("android.media.intent.action.ENQUEUE")) {
                t();
            }
            Intent intent = new Intent(str2);
            intent.setDataAndType(uri, str);
            intent.putExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER", this.c);
            if (bundle != null) {
                intent.putExtra("android.media.intent.extra.ITEM_METADATA", bundle);
            }
            if (j2 != 0) {
                intent.putExtra("android.media.intent.extra.ITEM_POSITION", j2);
            }
            l(intent, this.g, (String) null, bundle2, eVar);
            return;
        }
        throw new IllegalArgumentException("contentUri must not be null");
    }

    private boolean q(String str) {
        return this.a.L("android.media.intent.category.REMOTE_PLAYBACK", str);
    }

    private void s() {
        if (this.g == null) {
            throw new IllegalStateException("There is no current session.");
        }
    }

    private void t() {
        if (!this.e) {
            throw new UnsupportedOperationException("The route does not support queuing.");
        }
    }

    private void u() {
        if (!this.d) {
            throw new UnsupportedOperationException("The route does not support remote playback.");
        }
    }

    private void v() {
        if (!this.f) {
            throw new UnsupportedOperationException("The route does not support session management.");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (str != null) {
            r(str);
        }
    }

    public void e(Bundle bundle, g gVar) {
        v();
        s();
        m(new Intent("android.media.intent.action.END_SESSION"), this.g, bundle, gVar);
    }

    public void f(Bundle bundle, g gVar) {
        v();
        s();
        m(new Intent("android.media.intent.action.GET_SESSION_STATUS"), this.g, bundle, gVar);
    }

    /* access modifiers changed from: package-private */
    public void g(Intent intent, c cVar, String str, Bundle bundle) {
        int i2 = 0;
        if (bundle != null) {
            i2 = bundle.getInt("android.media.intent.extra.ERROR_CODE", 0);
        }
        if (j) {
            "Received error from " + intent.getAction() + ": error=" + str + ", code=" + i2 + ", data=" + b(bundle);
        }
        cVar.a(str, i2, bundle);
    }

    /* access modifiers changed from: package-private */
    public void h(Intent intent, c cVar, Bundle bundle) {
        "Received invalid result data from " + intent.getAction() + ": data=" + b(bundle);
        cVar.a((String) null, 0, bundle);
    }

    public void k(Bundle bundle, g gVar) {
        s();
        m(new Intent("android.media.intent.action.PAUSE"), this.g, bundle, gVar);
    }

    public void n(Uri uri, String str, Bundle bundle, long j2, Bundle bundle2, e eVar) {
        o(uri, str, bundle, j2, bundle2, eVar, "android.media.intent.action.PLAY");
    }

    public void p(Bundle bundle, g gVar) {
        s();
        m(new Intent("android.media.intent.action.RESUME"), this.g, bundle, gVar);
    }

    public void r(String str) {
        if (!p3.a(this.g, str)) {
            if (j) {
                "Session id is now: " + str;
            }
            this.g = str;
            h hVar = this.h;
            if (hVar != null) {
                hVar.b(str);
            }
        }
    }
}
