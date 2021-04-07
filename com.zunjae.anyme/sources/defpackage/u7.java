package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;

/* renamed from: u7  reason: default package */
public abstract class u7<T> extends v7<T> {
    private static final String g = h.f("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver f = new a();

    /* renamed from: u7$a */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                u7.this.h(context, intent);
            }
        }
    }

    public u7(Context context) {
        super(context);
    }

    public void e() {
        h.c().a(g, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.a.registerReceiver(this.f, g());
    }

    public void f() {
        h.c().a(g, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.a.unregisterReceiver(this.f);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
