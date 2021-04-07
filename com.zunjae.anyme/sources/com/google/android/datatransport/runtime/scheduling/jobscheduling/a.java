package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;

public class a implements s {
    private final Context a;
    private final bp b;
    private AlarmManager c;
    private final g d;
    private final kq e;

    a(Context context, bp bpVar, AlarmManager alarmManager, kq kqVar, g gVar) {
        this.a = context;
        this.b = bpVar;
        this.c = alarmManager;
        this.e = kqVar;
        this.d = gVar;
    }

    public a(Context context, bp bpVar, kq kqVar, g gVar) {
        this(context, bpVar, (AlarmManager) context.getSystemService("alarm"), kqVar, gVar);
    }

    public void a(eo eoVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", eoVar.b());
        builder.appendQueryParameter("priority", String.valueOf(qq.a(eoVar.d())));
        if (eoVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(eoVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (b(intent)) {
            mo.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", eoVar);
            return;
        }
        long x0 = this.b.x0(eoVar);
        long g = this.d.g(eoVar.d(), x0, i);
        mo.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", eoVar, Long.valueOf(g), Long.valueOf(x0), Integer.valueOf(i));
        this.c.set(3, this.e.a() + g, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    public boolean b(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }
}
