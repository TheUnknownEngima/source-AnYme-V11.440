package com.zunjae.anyme.features.database;

import android.content.Context;
import androidx.room.k;
import androidx.room.l;

public abstract class AppDatabase extends l {
    private static AppDatabase l;

    public static AppDatabase y(Context context) {
        if (l == null) {
            l.a<AppDatabase> a = k.a(context.getApplicationContext(), AppDatabase.class, "anyme-database");
            a.e();
            a.c();
            l = a.d();
        }
        return l;
    }

    public abstract a w();

    public abstract c x();

    public abstract e z();
}
