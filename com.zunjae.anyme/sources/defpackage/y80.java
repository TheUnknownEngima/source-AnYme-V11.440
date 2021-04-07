package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.r;

/* renamed from: y80  reason: default package */
public abstract class y80<T> {
    private final String a;
    private T b;

    /* renamed from: y80$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected y80(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public final T b(Context context) {
        if (this.b == null) {
            r.j(context);
            Context c = i.c(context);
            if (c != null) {
                try {
                    this.b = a((IBinder) c.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new a("Could not access creator.", e3);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.b;
    }
}
