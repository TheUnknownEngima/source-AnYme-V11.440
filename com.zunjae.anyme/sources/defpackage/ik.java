package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import androidx.fragment.app.s;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ik  reason: default package */
public class ik implements Handler.Callback {
    private static final b j = new a();
    private volatile j e;
    final Map<FragmentManager, hk> f = new HashMap();
    final Map<k, lk> g = new HashMap();
    private final Handler h;
    private final b i;

    /* renamed from: ik$a */
    class a implements b {
        a() {
        }

        public j a(c cVar, ek ekVar, jk jkVar, Context context) {
            return new j(cVar, ekVar, jkVar, context);
        }
    }

    /* renamed from: ik$b */
    public interface b {
        j a(c cVar, ek ekVar, jk jkVar, Context context);
    }

    public ik(b bVar) {
        new b0();
        new b0();
        new Bundle();
        this.i = bVar == null ? j : bVar;
        this.h = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private j c(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        hk j2 = j(fragmentManager, fragment, z);
        j e2 = j2.e();
        if (e2 != null) {
            return e2;
        }
        j a2 = this.i.a(c.d(context), j2.c(), j2.f(), context);
        j2.k(a2);
        return a2;
    }

    private j h(Context context) {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = this.i.a(c.d(context.getApplicationContext()), new yj(), new dk(), context.getApplicationContext());
                }
            }
        }
        return this.e;
    }

    private hk j(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        hk hkVar = (hk) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (hkVar == null && (hkVar = this.f.get(fragmentManager)) == null) {
            hkVar = new hk();
            hkVar.j(fragment);
            if (z) {
                hkVar.c().d();
            }
            this.f.put(fragmentManager, hkVar);
            fragmentManager.beginTransaction().add(hkVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.h.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return hkVar;
    }

    private lk l(k kVar, androidx.fragment.app.Fragment fragment, boolean z) {
        lk lkVar = (lk) kVar.Z("com.bumptech.glide.manager");
        if (lkVar == null && (lkVar = this.g.get(kVar)) == null) {
            lkVar = new lk();
            lkVar.T1(fragment);
            if (z) {
                lkVar.L1().d();
            }
            this.g.put(kVar, lkVar);
            s j2 = kVar.j();
            j2.e(lkVar, "com.bumptech.glide.manager");
            j2.j();
            this.h.obtainMessage(2, kVar).sendToTarget();
        }
        return lkVar;
    }

    private static boolean m(Context context) {
        Activity b2 = b(context);
        return b2 == null || !b2.isFinishing();
    }

    private j n(Context context, k kVar, androidx.fragment.app.Fragment fragment, boolean z) {
        lk l = l(kVar, fragment, z);
        j N1 = l.N1();
        if (N1 != null) {
            return N1;
        }
        j a2 = this.i.a(c.d(context), l.L1(), l.O1(), context);
        l.U1(a2);
        return a2;
    }

    public j d(Activity activity) {
        if (km.p()) {
            return e(activity.getApplicationContext());
        }
        a(activity);
        return c(activity, activity.getFragmentManager(), (Fragment) null, m(activity));
    }

    public j e(Context context) {
        if (context != null) {
            if (km.q() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return g((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return e(contextWrapper.getBaseContext());
                    }
                }
            }
            return h(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public j f(androidx.fragment.app.Fragment fragment) {
        jm.e(fragment.u(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (km.p()) {
            return e(fragment.u().getApplicationContext());
        }
        return n(fragment.u(), fragment.t(), fragment, fragment.f0());
    }

    public j g(FragmentActivity fragmentActivity) {
        if (km.p()) {
            return e(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        return n(fragmentActivity, fragmentActivity.q(), (androidx.fragment.app.Fragment) null, m(fragmentActivity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f;
        } else if (i2 != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                "Failed to remove expected request manager fragment, manager: " + obj;
            }
            return z;
        } else {
            obj2 = (k) message.obj;
            map = this.g;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        "Failed to remove expected request manager fragment, manager: " + obj;
        return z;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public hk i(Activity activity) {
        return j(activity.getFragmentManager(), (Fragment) null, m(activity));
    }

    /* access modifiers changed from: package-private */
    public lk k(Context context, k kVar) {
        return l(kVar, (androidx.fragment.app.Fragment) null, m(context));
    }
}
