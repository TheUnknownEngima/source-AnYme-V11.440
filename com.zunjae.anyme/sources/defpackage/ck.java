package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.core.content.a;
import defpackage.zj;

/* renamed from: ck  reason: default package */
public class ck implements ak {
    public zj a(Context context, zj.a aVar) {
        boolean z = a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new bk(context, aVar) : new gk();
    }
}
