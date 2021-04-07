package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;

public final class d extends AsyncTask<Uri, Long, Bitmap> {
    private static final u60 c = new u60("FetchBitmapTask");
    private final f a;
    private final e b;

    private d(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, e eVar) {
        this.a = t90.a(context.getApplicationContext(), this, new g(this), i, i2, false, 2097152, 5, 333, 10000);
        this.b = eVar;
    }

    public d(Context context, int i, int i2, boolean z, e eVar) {
        this(context, i, i2, false, 2097152, 5, 333, 10000, eVar);
    }

    public d(Context context, e eVar) {
        this(context, 0, 0, false, 2097152, 5, 333, 10000, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bitmap doInBackground(Uri... uriArr) {
        if (uriArr.length == 1 && uriArr[0] != null) {
            try {
                return this.a.P2(uriArr[0]);
            } catch (RemoteException e) {
                c.b(e, "Unable to call %s on %s.", "doFetch", f.class.getSimpleName());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        e eVar = this.b;
        if (eVar != null) {
            eVar.a(bitmap);
        }
    }
}
