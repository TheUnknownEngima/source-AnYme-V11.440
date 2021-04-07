package defpackage;

import android.os.Looper;

/* renamed from: wq1  reason: default package */
public interface wq1 {
    public static final wq1 a = new a();

    /* renamed from: wq1$a */
    static class a implements wq1 {
        a() {
        }

        public void a(pq1 pq1) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Event bus " + pq1 + " accessed from non-main thread " + Looper.myLooper());
            }
        }
    }

    void a(pq1 pq1);
}
