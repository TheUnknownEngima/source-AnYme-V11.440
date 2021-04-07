package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.m22;
import java.lang.reflect.Constructor;

public final class c {
    static {
        Object obj;
        try {
            m22.a aVar = m22.e;
            Looper mainLooper = Looper.getMainLooper();
            v62.b(mainLooper, "Looper.getMainLooper()");
            obj = new a(a(mainLooper, true), "Main");
            m22.a(obj);
        } catch (Throwable th) {
            m22.a aVar2 = m22.e;
            obj = n22.a(th);
            m22.a(obj);
        }
        if (m22.c(obj)) {
            obj = null;
        }
        b bVar = (b) obj;
    }

    public static final Handler a(Looper looper, boolean z) {
        int i;
        v62.f(looper, "$this$asHandler");
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new r22("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            Constructor<Handler> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
            v62.b(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Handler newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.TRUE});
            v62.b(newInstance, "constructor.newInstance(this, null, true)");
            return newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
