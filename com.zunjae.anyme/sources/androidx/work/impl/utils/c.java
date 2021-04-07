package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class c {
    private final Context a;
    private SharedPreferences b;
    private boolean c;

    public c(Context context) {
        this.a = context;
    }

    private void a() {
        if (!this.c) {
            this.b = this.a.getSharedPreferences("androidx.work.util.id", 0);
            this.c = true;
        }
    }

    private int c(String str) {
        int i = 0;
        int i2 = this.b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        e(str, i);
        return i2;
    }

    private void e(String str, int i) {
        this.b.edit().putInt(str, i).apply();
    }

    public int b() {
        int c2;
        synchronized (c.class) {
            a();
            c2 = c("next_alarm_manager_id");
        }
        return c2;
    }

    public int d(int i, int i2) {
        synchronized (c.class) {
            a();
            int c2 = c("next_job_scheduler_id");
            if (c2 >= i) {
                if (c2 <= i2) {
                    i = c2;
                }
            }
            e("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
