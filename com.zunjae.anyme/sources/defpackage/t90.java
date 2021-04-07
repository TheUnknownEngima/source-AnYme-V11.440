package defpackage;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.a0;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.d0;
import com.google.android.gms.cast.framework.g0;
import com.google.android.gms.cast.framework.k;
import com.google.android.gms.cast.framework.media.internal.f;
import com.google.android.gms.cast.framework.media.internal.j;
import com.google.android.gms.cast.framework.n;
import com.google.android.gms.cast.framework.v;
import com.google.android.gms.cast.framework.x;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;

/* renamed from: t90  reason: default package */
public final class t90 {
    private static final u60 a = new u60("CastDynamiteModule");

    public static f a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, j jVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return f(context.getApplicationContext()).k3(x80.s3(asyncTask), jVar, i, i2, z, 2097152, 5, 333, 10000);
        } catch (RemoteException | n e) {
            a.b(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", v90.class.getSimpleName());
            return null;
        }
    }

    public static x b(Context context, b bVar, x90 x90, Map<String, IBinder> map) {
        try {
            return f(context).Q0(x80.s3(context.getApplicationContext()), bVar, x90, map);
        } catch (RemoteException e) {
            a.b(e, "Unable to call %s on %s.", "newCastContextImpl", v90.class.getSimpleName());
            return null;
        }
    }

    public static a0 c(Context context, b bVar, w80 w80, v vVar) {
        try {
            return f(context).g1(bVar, w80, vVar);
        } catch (RemoteException | n e) {
            a.b(e, "Unable to call %s on %s.", "newCastSessionImpl", v90.class.getSimpleName());
            return null;
        }
    }

    public static d0 d(Service service, w80 w80, w80 w802) {
        try {
            return f(service.getApplicationContext()).Z1(x80.s3(service), w80, w802);
        } catch (RemoteException | n e) {
            a.b(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", v90.class.getSimpleName());
            return null;
        }
    }

    public static g0 e(Context context, String str, String str2, k kVar) {
        try {
            return f(context).P0(str, str2, kVar);
        } catch (RemoteException | n e) {
            a.b(e, "Unable to call %s on %s.", "newSessionImpl", v90.class.getSimpleName());
            return null;
        }
    }

    private static v90 f(Context context) {
        try {
            IBinder c = DynamiteModule.d(context, DynamiteModule.i, "com.google.android.gms.cast.framework.dynamite").c("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (c == null) {
                return null;
            }
            IInterface queryLocalInterface = c.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof v90 ? (v90) queryLocalInterface : new u90(c);
        } catch (DynamiteModule.a e) {
            throw new n(e);
        }
    }
}
