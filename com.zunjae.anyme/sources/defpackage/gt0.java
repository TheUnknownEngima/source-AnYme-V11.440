package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: gt0  reason: default package */
public class gt0 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean();
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        r10 = r10.query(a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r11}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        if (r10 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r10 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r10.moveToFirst() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        d(r0, r11, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r12 = r10.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        if (r12 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dc, code lost:
        if (r12.equals((java.lang.Object) null) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        d(r0, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r12 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e5, code lost:
        if (r10 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ec, code lost:
        if (r10 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f1, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.Class<gt0> r12 = defpackage.gt0.class
            monitor-enter(r12)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f     // Catch:{ all -> 0x00f2 }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicBoolean r0 = e     // Catch:{ all -> 0x00f2 }
            r0.set(r2)     // Catch:{ all -> 0x00f2 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            f = r0     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            k = r0     // Catch:{ all -> 0x00f2 }
            l = r2     // Catch:{ all -> 0x00f2 }
            android.net.Uri r0 = a     // Catch:{ all -> 0x00f2 }
            jt0 r4 = new jt0     // Catch:{ all -> 0x00f2 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f2 }
            r10.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x00f2 }
            goto L_0x0054
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r0 = e     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0054
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = g     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = h     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = i     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = j     // Catch:{ all -> 0x00f2 }
            r0.clear()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
            k = r0     // Catch:{ all -> 0x00f2 }
            l = r2     // Catch:{ all -> 0x00f2 }
        L_0x0054:
            java.lang.Object r0 = k     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = f     // Catch:{ all -> 0x00f2 }
            boolean r4 = r4.containsKey(r11)     // Catch:{ all -> 0x00f2 }
            if (r4 == 0) goto L_0x006b
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f     // Catch:{ all -> 0x00f2 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x00f2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00f2 }
            if (r10 == 0) goto L_0x0069
            r3 = r10
        L_0x0069:
            monitor-exit(r12)     // Catch:{ all -> 0x00f2 }
            return r3
        L_0x006b:
            java.lang.String[] r4 = m     // Catch:{ all -> 0x00f2 }
            int r5 = r4.length     // Catch:{ all -> 0x00f2 }
            r6 = 0
        L_0x006f:
            if (r6 >= r5) goto L_0x00ac
            r7 = r4[r6]     // Catch:{ all -> 0x00f2 }
            boolean r7 = r11.startsWith(r7)     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x00a9
            boolean r0 = l     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0085
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00a7
        L_0x0085:
            java.lang.String[] r0 = m     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f     // Catch:{ all -> 0x00f2 }
            java.util.Map r10 = b(r10, r0)     // Catch:{ all -> 0x00f2 }
            r2.putAll(r10)     // Catch:{ all -> 0x00f2 }
            l = r1     // Catch:{ all -> 0x00f2 }
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f     // Catch:{ all -> 0x00f2 }
            boolean r10 = r10.containsKey(r11)     // Catch:{ all -> 0x00f2 }
            if (r10 == 0) goto L_0x00a7
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f     // Catch:{ all -> 0x00f2 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x00f2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00f2 }
            if (r10 == 0) goto L_0x00a5
            r3 = r10
        L_0x00a5:
            monitor-exit(r12)     // Catch:{ all -> 0x00f2 }
            return r3
        L_0x00a7:
            monitor-exit(r12)     // Catch:{ all -> 0x00f2 }
            return r3
        L_0x00a9:
            int r6 = r6 + 1
            goto L_0x006f
        L_0x00ac:
            monitor-exit(r12)     // Catch:{ all -> 0x00f2 }
            android.net.Uri r5 = a
            r6 = 0
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r1]
            r8[r2] = r11
            r9 = 0
            r4 = r10
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)
            if (r10 != 0) goto L_0x00c3
            if (r10 == 0) goto L_0x00c2
            r10.close()
        L_0x00c2:
            return r3
        L_0x00c3:
            boolean r12 = r10.moveToFirst()     // Catch:{ all -> 0x00eb }
            if (r12 != 0) goto L_0x00d2
            d(r0, r11, r3)     // Catch:{ all -> 0x00eb }
            if (r10 == 0) goto L_0x00d1
            r10.close()
        L_0x00d1:
            return r3
        L_0x00d2:
            java.lang.String r12 = r10.getString(r1)     // Catch:{ all -> 0x00eb }
            if (r12 == 0) goto L_0x00df
            boolean r1 = r12.equals(r3)     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00df
            r12 = r3
        L_0x00df:
            d(r0, r11, r12)     // Catch:{ all -> 0x00eb }
            if (r12 == 0) goto L_0x00e5
            r3 = r12
        L_0x00e5:
            if (r10 == 0) goto L_0x00ea
            r10.close()
        L_0x00ea:
            return r3
        L_0x00eb:
            r11 = move-exception
            if (r10 == 0) goto L_0x00f1
            r10.close()
        L_0x00f1:
            throw r11
        L_0x00f2:
            r10 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00f2 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void d(Object obj, String str, String str2) {
        synchronized (gt0.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }
}
