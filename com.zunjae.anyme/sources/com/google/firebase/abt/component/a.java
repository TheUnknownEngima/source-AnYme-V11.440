package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.c;
import java.util.HashMap;
import java.util.Map;

public class a {
    private final Map<String, c> a = new HashMap();
    private final Context b;
    private final eb1 c;

    protected a(Context context, eb1 eb1) {
        this.b = context;
        this.c = eb1;
    }

    /* access modifiers changed from: protected */
    public c a(String str) {
        return new c(this.b, this.c, str);
    }

    public synchronized c b(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, a(str));
        }
        return this.a.get(str);
    }
}
