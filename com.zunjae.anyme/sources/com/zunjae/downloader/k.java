package com.zunjae.downloader;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.zunjae.downloader.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class k implements f {
    private final Context a;
    private final g b;

    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Long.valueOf(((e) t2).c()), Long.valueOf(((e) t).c()));
        }
    }

    public k(Context context, g gVar) {
        v62.e(context, "context");
        v62.e(gVar, "settings");
        this.a = context;
        this.b = gVar;
    }

    private final h d(String str, String str2, int i) {
        Intent intent;
        String a2 = a.c.a(this.a);
        if (a2 == null) {
            a.c.c(this.a);
            return new h.b("ADM not found");
        }
        if (this.b.b()) {
            h72 h72 = h72.a;
            String format = String.format("%03d.mp4", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            v62.d(format, "java.lang.String.format(format, *args)");
            intent = g(str2, format, str, a2);
        } else {
            h72 h722 = h72.a;
            String format2 = String.format("%s (%03d).mp4", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
            v62.d(format2, "java.lang.String.format(format, *args)");
            intent = f(str2, format2, a2);
        }
        if (!com.zunjae.zapplib.a.d(this.a, intent)) {
            return new h.b("Intent is not safe");
        }
        intent.setFlags(268435456);
        this.a.startActivity(intent);
        return new h.c(-1);
    }

    private final h e(String str, int i, String str2, Map<String, String> map) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
        int i2 = 0;
        for (c flag : this.b.a()) {
            i2 |= flag.getFlag();
        }
        h72 h72 = h72.a;
        String format = String.format("%03d.mp4", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        v62.d(format, "java.lang.String.format(format, *args)");
        String str3 = "/AnYme/" + new u82("[^0-9A-Za-z. :()-]").d(str, "") + '/' + format;
        try {
            request.setDescription("Downloading " + str + " (EP " + i + ')');
            request.setAllowedNetworkTypes(i2);
            request.setTitle(format);
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_MOVIES, str3);
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    request.addRequestHeader((String) next.getKey(), (String) next.getValue());
                }
            }
            Object systemService = this.a.getSystemService("download");
            if (systemService != null) {
                long enqueue = ((DownloadManager) systemService).enqueue(request);
                return enqueue > 0 ? new h.c(enqueue) : new h.b("Invalid ID. unable to queue video");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
        } catch (Exception e) {
            return new h.a(e);
        }
    }

    private final Intent f(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(str3, str3 + ".AEditor");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("com.android.extra.filename", str2);
        return intent;
    }

    private final Intent g(String str, String str2, String str3, String str4) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        v62.d(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
        String str5 = str + " <info> " + str2;
        Intent intent = new Intent();
        intent.setClassName(str4, str4 + ".AEditor");
        intent.putExtra("com.dv.get.ACTION_LIST_ADD", str5);
        intent.putExtra("com.dv.get.ACTION_LIST_PATH", externalStorageDirectory.getAbsolutePath() + "/AnYme_videos/" + str3);
        intent.putExtra("com.dv.get.ACTION_LIST_OPEN", false);
        return intent;
    }

    public List<e> a(m mVar) {
        Throwable th;
        v62.e(mVar, "status");
        Object systemService = this.a.getSystemService("download");
        if (systemService != null) {
            ArrayList arrayList = new ArrayList();
            Cursor query = ((DownloadManager) systemService).query(new DownloadManager.Query().setFilterByStatus(mVar.code()));
            while (query.moveToNext()) {
                try {
                    long j = query.getLong(query.getColumnIndex("_id"));
                    int i = query.getInt(query.getColumnIndex("status"));
                    long j2 = query.getLong(query.getColumnIndex("bytes_so_far"));
                    long j3 = query.getLong(query.getColumnIndex("total_size"));
                    String string = query.getString(query.getColumnIndex("title"));
                    v62.d(string, "title");
                    arrayList.add(new e(j, string, i, j3, j2, (b) null, 32, (r62) null));
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    k52.a(query, th);
                    throw th3;
                }
            }
            u22 u22 = u22.a;
            k52.a(query, (Throwable) null);
            return n32.U(arrayList, new a());
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }

    public h b(String str, int i, String str2, Map<String, String> map) {
        v62.e(str, "showName");
        v62.e(str2, "url");
        int i2 = j.a[this.b.c().ordinal()];
        if (i2 == 1) {
            return e(str, i, str2, map);
        }
        if (i2 == 2) {
            return d(str, str2, i);
        }
        throw new j22();
    }

    public void c(long j) {
        Object systemService = this.a.getSystemService("download");
        if (systemService != null) {
            ((DownloadManager) systemService).remove(new long[]{j});
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }
}
