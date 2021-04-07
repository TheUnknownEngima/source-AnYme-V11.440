package com.zunjae.anyme.features.update;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import java.io.File;

public final class DownloadBroadcastReceiver extends BroadcastReceiver {
    private final long a;

    public DownloadBroadcastReceiver(long j) {
        this.a = j;
    }

    private final void a(Context context, long j) {
        cw1 a2;
        a aVar;
        Object systemService = context.getSystemService("download");
        if (systemService != null) {
            DownloadManager downloadManager = (DownloadManager) systemService;
            if (j == this.a) {
                context.unregisterReceiver(this);
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(new long[]{j});
                Cursor query2 = downloadManager.query(query);
                if (query2.moveToFirst()) {
                    Uri fromFile = Build.VERSION.SDK_INT < 24 ? Uri.fromFile(new File(query2.getString(query2.getColumnIndex("local_filename")))) : Uri.parse(query2.getString(query2.getColumnIndex("local_uri")));
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, "application/vnd.android.package-archive");
                    intent.setFlags(268435457);
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                    } else {
                        Toast.makeText(context, "Could not update the app. Please manually download the update", 1).show();
                    }
                    a2 = cw1.k.a();
                    aVar = a.Success;
                    a2.p(aVar);
                    return;
                }
            }
            a2 = cw1.k.a();
            aVar = a.Failure;
            a2.p(aVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }

    public void onReceive(Context context, Intent intent) {
        v62.e(context, "context");
        v62.e(intent, "data");
        try {
            a(context, intent.getLongExtra("extra_download_id", -1));
        } catch (Exception e) {
            uj2.d(e);
            cw1.k.a().p(a.Failure);
        }
    }
}
