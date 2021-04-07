package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* renamed from: xo  reason: default package */
public abstract class xo {
    static s a(Context context, bp bpVar, g gVar, kq kqVar) {
        return Build.VERSION.SDK_INT >= 21 ? new e(context, bpVar, gVar) : new a(context, bpVar, kqVar, gVar);
    }
}
