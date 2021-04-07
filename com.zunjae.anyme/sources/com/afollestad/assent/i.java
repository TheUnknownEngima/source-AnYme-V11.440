package com.afollestad.assent;

import android.content.Context;
import android.content.SharedPreferences;

public final class i implements h {
    private final SharedPreferences a;

    public i(Context context) {
        v62.f(context, "context");
        this.a = context.getSharedPreferences("[com.afollestad.assent-prefs]", 0);
    }

    public <T> T a(String str) {
        v62.f(str, "key");
        SharedPreferences sharedPreferences = this.a;
        v62.b(sharedPreferences, "sharedPrefs");
        T t = sharedPreferences.getAll().get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public void b(String str, Object obj) {
        v62.f(str, "key");
        v62.f(obj, "value");
        SharedPreferences.Editor edit = this.a.edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Number) obj).floatValue());
        } else {
            throw new IllegalStateException(("Cannot put value " + obj + " in shared preferences.").toString());
        }
        edit.apply();
    }
}
