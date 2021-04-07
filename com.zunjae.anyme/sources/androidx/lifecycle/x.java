package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h;

public class x extends Fragment {
    private a e;

    interface a {
        void m();

        void n();

        void o();
    }

    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            x.a(activity, h.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            x.a(activity, h.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            x.a(activity, h.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            x.a(activity, h.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            x.a(activity, h.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            x.a(activity, h.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, h.a aVar) {
        if (activity instanceof p) {
            ((p) activity).a().i(aVar);
        } else if (activity instanceof n) {
            h a2 = ((n) activity).a();
            if (a2 instanceof o) {
                ((o) a2).i(aVar);
            }
        }
    }

    private void b(h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.m();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.o();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.n();
        }
    }

    static x f(Activity activity) {
        return (x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar) {
        this.e = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.e);
        b(h.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(h.a.ON_DESTROY);
        this.e = null;
    }

    public void onPause() {
        super.onPause();
        b(h.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        d(this.e);
        b(h.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        e(this.e);
        b(h.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(h.a.ON_STOP);
    }
}
