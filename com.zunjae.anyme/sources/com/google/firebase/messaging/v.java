package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class v {
    private final SharedPreferences a;
    private final String b;
    private final String c;
    private final ArrayDeque<String> d = new ArrayDeque<>();
    private final Executor e;
    private boolean f = false;

    private v(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    private final boolean c(boolean z) {
        if (z && !this.f) {
            j();
        }
        return z;
    }

    static v d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        v vVar = new v(sharedPreferences, str, str2, executor);
        vVar.e();
        return vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.d     // Catch:{ all -> 0x0041 }
            r1.clear()     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences r1 = r6.a     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = r6.b     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0041 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = r6.c     // Catch:{ all -> 0x0041 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x0021
            goto L_0x003f
        L_0x0021:
            java.lang.String r2 = r6.c     // Catch:{ all -> 0x0041 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0041 }
            int r2 = r1.length     // Catch:{ all -> 0x0041 }
            int r2 = r1.length     // Catch:{ all -> 0x0041 }
            r3 = 0
        L_0x002b:
            if (r3 >= r2) goto L_0x003d
            r4 = r1[r3]     // Catch:{ all -> 0x0041 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0041 }
            if (r5 != 0) goto L_0x003a
            java.util.ArrayDeque<java.lang.String> r5 = r6.d     // Catch:{ all -> 0x0041 }
            r5.add(r4)     // Catch:{ all -> 0x0041 }
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.v.e():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void b() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, h()).commit();
        }
    }

    private final void j() {
        this.e.execute(new u(this));
    }

    public final boolean a(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.c)) {
            return false;
        }
        synchronized (this.d) {
            add = this.d.add(str);
            c(add);
        }
        return add;
    }

    public final String f() {
        String peek;
        synchronized (this.d) {
            peek = this.d.peek();
        }
        return peek;
    }

    public final boolean g(Object obj) {
        boolean remove;
        synchronized (this.d) {
            remove = this.d.remove(obj);
            c(remove);
        }
        return remove;
    }

    public final String h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}
