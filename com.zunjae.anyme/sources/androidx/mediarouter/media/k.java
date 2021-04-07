package androidx.mediarouter.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import androidx.mediarouter.media.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class k {

    public static final class a implements Runnable {
        private final DisplayManager e;
        private final Handler f;
        private Method g;
        private boolean h;

        public a(Context context, Handler handler) {
            if (Build.VERSION.SDK_INT == 17) {
                this.e = (DisplayManager) context.getSystemService("display");
                this.f = handler;
                try {
                    this.g = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
                } catch (NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public void a(int i) {
            if ((i & 2) != 0) {
                if (!this.h && this.g != null) {
                    this.h = true;
                    this.f.post(this);
                }
            } else if (this.h) {
                this.h = false;
                this.f.removeCallbacks(this);
            }
        }

        public void run() {
            if (this.h) {
                try {
                    this.g.invoke(this.e, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
                this.f.postDelayed(this, 15000);
            }
        }
    }

    public interface b extends j.a {
        void f(Object obj);
    }

    static class c<T extends b> extends j.b<T> {
        public c(T t) {
            super(t);
        }

        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((b) this.a).f(routeInfo);
        }
    }

    public static final class d {
        private Method a;
        private int b;

        public d() {
            if (Build.VERSION.SDK_INT == 17) {
                try {
                    this.b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt((Object) null);
                    this.a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public boolean a(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            Method method = this.a;
            if (method == null) {
                return false;
            }
            try {
                return ((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.b;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    public static final class e {
        public static Display a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                return null;
            }
        }

        public static boolean b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    public static Object a(b bVar) {
        return new c(bVar);
    }
}
