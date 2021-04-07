package androidx.work;

import android.content.Context;

public abstract class p {
    private static final String a = h.f("WorkerFactory");

    static class a extends p {
        a() {
        }

        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static p c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a2 = a(context, str, workerParameters);
        if (a2 != null) {
            return a2;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                h c = h.c();
                String str2 = a;
                c.b(str2, "Could not instantiate " + str, e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            h c2 = h.c();
            String str3 = a;
            c2.b(str3, "Class not found: " + str, new Throwable[0]);
            return null;
        }
    }
}
