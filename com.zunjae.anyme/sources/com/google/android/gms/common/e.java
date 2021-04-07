package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import androidx.core.app.h;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.m;

public class e extends f {
    private static final Object d = new Object();
    private static final e e = new e();
    private String c;

    @SuppressLint({"HandlerLeak"})
    private class a extends l90 {
        private final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                sb.toString();
                return;
            }
            int g = e.this.g(this.a);
            if (e.this.i(g)) {
                e.this.o(this.a, g);
            }
        }
    }

    public static e m() {
        return e;
    }

    static Dialog p(Context context, int i, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.e.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c2 = com.google.android.gms.common.internal.e.c(context, i);
        if (c2 != null) {
            builder.setPositiveButton(c2, fVar);
        }
        String g = com.google.android.gms.common.internal.e.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        return builder.create();
    }

    static void q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            k.X1(dialog, onCancelListener).W1(((FragmentActivity) activity).q(), str);
            return;
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void s(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            r(context);
        } else if (pendingIntent != null) {
            String f = com.google.android.gms.common.internal.e.f(context, i);
            String e2 = com.google.android.gms.common.internal.e.e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            h.e eVar = new h.e(context);
            eVar.x(true);
            eVar.l(true);
            eVar.r(f);
            h.c cVar = new h.c();
            cVar.l(e2);
            eVar.E(cVar);
            if (i.b(context)) {
                r.m(m.g());
                eVar.C(context.getApplicationInfo().icon);
                eVar.A(2);
                if (i.d(context)) {
                    eVar.a(R$drawable.common_full_open_on_phone, resources.getString(R$string.common_open_on_phone), pendingIntent);
                } else {
                    eVar.p(pendingIntent);
                }
            } else {
                eVar.C(17301642);
                eVar.G(resources.getString(R$string.common_google_play_services_notification_ticker));
                eVar.K(System.currentTimeMillis());
                eVar.p(pendingIntent);
                eVar.q(e2);
            }
            if (m.k()) {
                r.m(m.k());
                String u = u();
                if (u == null) {
                    u = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(u);
                    String b = com.google.android.gms.common.internal.e.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(u, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                eVar.n(u);
            }
            Notification d2 = eVar.d();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                i.d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, d2);
        }
    }

    private final String u() {
        String str;
        synchronized (d) {
            str = this.c;
        }
        return str;
    }

    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    public final String e(int i) {
        return super.e(i);
    }

    public int g(Context context) {
        return super.g(context);
    }

    public int h(Context context, int i) {
        return super.h(context, i);
    }

    public final boolean i(int i) {
        return super.i(i);
    }

    public Dialog k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i, f.a(activity, b(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.l() ? bVar.k() : c(context, bVar.i(), 0);
    }

    public boolean n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k = k(activity, i, i2, onCancelListener);
        if (k == null) {
            return false;
        }
        q(activity, k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i) {
        s(context, i, (String) null, d(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final void r(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean t(Context context, b bVar, int i) {
        PendingIntent l = l(context, bVar);
        if (l == null) {
            return false;
        }
        s(context, bVar.i(), (String) null, GoogleApiActivity.a(context, l, i));
        return true;
    }
}
