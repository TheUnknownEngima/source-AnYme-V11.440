package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Keep
public final class AndroidExceptionPreHandler extends h42 implements CoroutineExceptionHandler, o52<Method> {
    static final /* synthetic */ d82[] $$delegatedProperties;
    private final d22 preHandler$delegate = g22.b(this);

    static {
        c72 c72 = new c72(f72.b(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        f72.f(c72);
        $$delegatedProperties = new d82[]{c72};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.c);
    }

    private final Method getPreHandler() {
        d22 d22 = this.preHandler$delegate;
        d82 d82 = $$delegatedProperties[0];
        return (Method) d22.getValue();
    }

    public void handleException(n42 n42, Throwable th) {
        v62.f(n42, "context");
        v62.f(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            v62.b(currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object obj = null;
        Object invoke = preHandler != null ? preHandler.invoke((Object) null, new Object[0]) : null;
        if (invoke instanceof Thread.UncaughtExceptionHandler) {
            obj = invoke;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            v62.b(declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
