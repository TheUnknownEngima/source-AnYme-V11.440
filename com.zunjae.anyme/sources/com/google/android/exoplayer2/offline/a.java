package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadService;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ DownloadService.b e;
    public final /* synthetic */ DownloadService f;

    public /* synthetic */ a(DownloadService.b bVar, DownloadService downloadService) {
        this.e = bVar;
        this.f = downloadService;
    }

    public final void run() {
        this.e.g(this.f);
    }
}
