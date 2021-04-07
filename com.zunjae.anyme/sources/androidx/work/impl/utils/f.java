package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class f {
    private Context a;
    private SharedPreferences b;

    public f(Context context) {
        this.a = context;
    }

    private SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (f.class) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.b;
        }
        return sharedPreferences;
    }

    public boolean b() {
        return a().getBoolean("reschedule_needed", false);
    }

    public void c(boolean z) {
        a().edit().putBoolean("reschedule_needed", z).apply();
    }
}
