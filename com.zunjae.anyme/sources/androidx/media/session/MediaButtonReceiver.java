package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    private static class a extends MediaBrowserCompat.b {
        private final Context c;
        private final Intent d;
        private final BroadcastReceiver.PendingResult e;
        private MediaBrowserCompat f;

        a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        private void e() {
            this.f.b();
            this.e.finish();
        }

        public void a() {
            try {
                new MediaControllerCompat(this.c, this.f.c()).a((KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            e();
        }

        public void b() {
            e();
        }

        public void c() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f = mediaBrowserCompat;
        }
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        int size = queryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    private static void c(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            "Ignore unsupported intent: " + intent;
            return;
        }
        ComponentName b = b(context, "android.intent.action.MEDIA_BUTTON");
        if (b != null) {
            intent.setComponent(b);
            c(context, intent);
            return;
        }
        ComponentName b2 = b(context, "android.media.browse.MediaBrowserService");
        if (b2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            a aVar = new a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b2, aVar, (Bundle) null);
            aVar.f(mediaBrowserCompat);
            mediaBrowserCompat.a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
