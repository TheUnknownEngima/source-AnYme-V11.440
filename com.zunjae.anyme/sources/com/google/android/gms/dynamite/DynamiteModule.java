package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")
    private static Boolean b = null;
    @GuardedBy("DynamiteModule.class")
    private static h c = null;
    @GuardedBy("DynamiteModule.class")
    private static j d = null;
    @GuardedBy("DynamiteModule.class")
    private static String e = null;
    @GuardedBy("DynamiteModule.class")
    private static int f = -1;
    private static final ThreadLocal<c> g = new ThreadLocal<>();
    private static final b.C0092b h = new b();
    public static final b i = new a();
    public static final b j = new c();
    public static final b k = new d();
    public static final b l = new e();
    private final Context a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, b bVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, b bVar) {
            this(str, th);
        }
    }

    public interface b {

        public static class a {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public interface C0092b {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        a a(Context context, String str, C0092b bVar);
    }

    private static class c {
        public Cursor a;

        private c() {
        }

        /* synthetic */ c(b bVar) {
            this();
        }
    }

    private static class d implements b.C0092b {
        private final int a;

        public d(int i, int i2) {
            this.a = i;
        }

        public final int a(Context context, String str) {
            return this.a;
        }

        public final int b(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        r.j(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            sb2.toString();
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            sb3.toString();
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            if (valueOf2.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule d(android.content.Context r9, com.google.android.gms.dynamite.DynamiteModule.b r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ":"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r1 = g
            java.lang.Object r1 = r1.get()
            com.google.android.gms.dynamite.DynamiteModule$c r1 = (com.google.android.gms.dynamite.DynamiteModule.c) r1
            com.google.android.gms.dynamite.DynamiteModule$c r2 = new com.google.android.gms.dynamite.DynamiteModule$c
            r3 = 0
            r2.<init>(r3)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r4 = g
            r4.set(r2)
            com.google.android.gms.dynamite.DynamiteModule$b$b r4 = h     // Catch:{ all -> 0x0114 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r4 = r10.a(r9, r11, r4)     // Catch:{ all -> 0x0114 }
            int r5 = r4.a     // Catch:{ all -> 0x0114 }
            int r6 = r4.b     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0114 }
            int r7 = r7.length()     // Catch:{ all -> 0x0114 }
            int r7 = r7 + 68
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0114 }
            int r8 = r8.length()     // Catch:{ all -> 0x0114 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r8.<init>(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = "Considering local module "
            r8.append(r7)     // Catch:{ all -> 0x0114 }
            r8.append(r11)     // Catch:{ all -> 0x0114 }
            r8.append(r0)     // Catch:{ all -> 0x0114 }
            r8.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = " and remote module "
            r8.append(r5)     // Catch:{ all -> 0x0114 }
            r8.append(r11)     // Catch:{ all -> 0x0114 }
            r8.append(r0)     // Catch:{ all -> 0x0114 }
            r8.append(r6)     // Catch:{ all -> 0x0114 }
            r8.toString()     // Catch:{ all -> 0x0114 }
            int r0 = r4.c     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00ea
            int r0 = r4.c     // Catch:{ all -> 0x0114 }
            r5 = -1
            if (r0 != r5) goto L_0x0063
            int r0 = r4.a     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00ea
        L_0x0063:
            int r0 = r4.c     // Catch:{ all -> 0x0114 }
            r6 = 1
            if (r0 != r6) goto L_0x006c
            int r0 = r4.b     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00ea
        L_0x006c:
            int r0 = r4.c     // Catch:{ all -> 0x0114 }
            if (r0 != r5) goto L_0x0081
            com.google.android.gms.dynamite.DynamiteModule r9 = l(r9, r11)     // Catch:{ all -> 0x0114 }
            android.database.Cursor r10 = r2.a
            if (r10 == 0) goto L_0x007b
        L_0x0078:
            r10.close()
        L_0x007b:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = g
            r10.set(r1)
            return r9
        L_0x0081:
            int r0 = r4.c     // Catch:{ all -> 0x0114 }
            if (r0 != r6) goto L_0x00cf
            int r0 = r4.b     // Catch:{ a -> 0x0090 }
            com.google.android.gms.dynamite.DynamiteModule r9 = f(r9, r11, r0)     // Catch:{ a -> 0x0090 }
            android.database.Cursor r10 = r2.a
            if (r10 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0090:
            r0 = move-exception
            java.lang.String r6 = "Failed to load remote module: "
            java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0114 }
            int r8 = r7.length()     // Catch:{ all -> 0x0114 }
            if (r8 == 0) goto L_0x00a5
            r6.concat(r7)     // Catch:{ all -> 0x0114 }
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0114 }
            r7.<init>(r6)     // Catch:{ all -> 0x0114 }
        L_0x00aa:
            int r6 = r4.a     // Catch:{ all -> 0x0114 }
            if (r6 == 0) goto L_0x00c7
            com.google.android.gms.dynamite.DynamiteModule$d r6 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x0114 }
            int r4 = r4.a     // Catch:{ all -> 0x0114 }
            r7 = 0
            r6.<init>(r4, r7)     // Catch:{ all -> 0x0114 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r10 = r10.a(r9, r11, r6)     // Catch:{ all -> 0x0114 }
            int r10 = r10.c     // Catch:{ all -> 0x0114 }
            if (r10 != r5) goto L_0x00c7
            com.google.android.gms.dynamite.DynamiteModule r9 = l(r9, r11)     // Catch:{ all -> 0x0114 }
            android.database.Cursor r10 = r2.a
            if (r10 == 0) goto L_0x007b
            goto L_0x0078
        L_0x00c7:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = "Remote load failed. No local fallback found."
            r9.<init>(r10, r0, r3)     // Catch:{ all -> 0x0114 }
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x00cf:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0114 }
            int r10 = r4.c     // Catch:{ all -> 0x0114 }
            r11 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r0.<init>(r11)     // Catch:{ all -> 0x0114 }
            java.lang.String r11 = "VersionPolicy returned invalid code:"
            r0.append(r11)     // Catch:{ all -> 0x0114 }
            r0.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0114 }
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.b) r3)     // Catch:{ all -> 0x0114 }
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x00ea:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0114 }
            int r10 = r4.a     // Catch:{ all -> 0x0114 }
            int r11 = r4.b     // Catch:{ all -> 0x0114 }
            r0 = 91
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r4.<init>(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r4.append(r0)     // Catch:{ all -> 0x0114 }
            r4.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = " and remote version is "
            r4.append(r10)     // Catch:{ all -> 0x0114 }
            r4.append(r11)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = "."
            r4.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x0114 }
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.b) r3)     // Catch:{ all -> 0x0114 }
            throw r9     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r9 = move-exception
            android.database.Cursor r10 = r2.a
            if (r10 == 0) goto L_0x011c
            r10.close()
        L_0x011c:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = g
            r10.set(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0054=Splitter:B:23:0x0054, B:18:0x0039=Splitter:B:18:0x0039, B:39:0x008f=Splitter:B:39:0x008f} */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Boolean r1 = b     // Catch:{ all -> 0x00f3 }
            if (r1 != 0) goto L_0x00c6
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x003c
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r4 != r1) goto L_0x0036
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x0036:
            g(r4)     // Catch:{ a -> 0x0039 }
        L_0x0039:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x003c:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x009c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0054
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r1.set(r3, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0033
        L_0x0054:
            int r4 = k(r8, r9, r10)     // Catch:{ a -> 0x0092 }
            java.lang.String r5 = e     // Catch:{ a -> 0x0092 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r5 = e     // Catch:{ a -> 0x0092 }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x0092 }
            if (r5 == 0) goto L_0x0065
            goto L_0x008f
        L_0x0065:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0092 }
            r6 = 29
            if (r5 < r6) goto L_0x0077
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0092 }
            java.lang.String r6 = e     // Catch:{ a -> 0x0092 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0092 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0092 }
            goto L_0x0082
        L_0x0077:
            com.google.android.gms.dynamite.f r5 = new com.google.android.gms.dynamite.f     // Catch:{ a -> 0x0092 }
            java.lang.String r6 = e     // Catch:{ a -> 0x0092 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0092 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0092 }
        L_0x0082:
            g(r5)     // Catch:{ a -> 0x0092 }
            r1.set(r3, r5)     // Catch:{ a -> 0x0092 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x0092 }
            b = r5     // Catch:{ a -> 0x0092 }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            return r4
        L_0x008f:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            return r4
        L_0x0092:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r1.set(r3, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0033
        L_0x009a:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            goto L_0x00c4
        L_0x009c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
        L_0x009f:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            int r2 = r2.length()     // Catch:{ all -> 0x00f3 }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r3.<init>(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r2 = "Failed to load module via V2: "
            r3.append(r2)     // Catch:{ all -> 0x00f3 }
            r3.append(r1)     // Catch:{ all -> 0x00f3 }
            r3.toString()     // Catch:{ all -> 0x00f3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00f3 }
        L_0x00c4:
            b = r1     // Catch:{ all -> 0x00f3 }
        L_0x00c6:
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ee
            int r8 = k(r8, r9, r10)     // Catch:{ a -> 0x00d2 }
            return r8
        L_0x00d2:
            r9 = move-exception
            java.lang.String r10 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00f6 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00f6 }
            int r0 = r9.length()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00e7
            r10.concat(r9)     // Catch:{ all -> 0x00f6 }
            goto L_0x00ec
        L_0x00e7:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            r9.<init>(r10)     // Catch:{ all -> 0x00f6 }
        L_0x00ec:
            r8 = 0
            return r8
        L_0x00ee:
            int r8 = i(r8, r9, r10)     // Catch:{ all -> 0x00f6 }
            return r8
        L_0x00f3:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            throw r9     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r9 = move-exception
            com.google.android.gms.common.util.g.a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule f(Context context, String str, int i2) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = b;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", (b) null);
            } else if (bool.booleanValue()) {
                return j(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                sb.toString();
                h m = m(context);
                if (m != null) {
                    w80 l2 = m.F() >= 2 ? m.l2(x80.s3(context), str, i2) : m.V0(x80.s3(context), str, i2);
                    if (x80.r3(l2) != null) {
                        return new DynamiteModule((Context) x80.r3(l2));
                    }
                    throw new a("Failed to load remote module.", (b) null);
                }
                throw new a("Failed to create IDynamiteLoader.", (b) null);
            }
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, (b) null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            g.a(context, th);
            throw new a("Failed to load remote module.", th, (b) null);
        }
    }

    @GuardedBy("DynamiteModule.class")
    private static void g(ClassLoader classLoader) {
        j jVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = queryLocalInterface instanceof j ? (j) queryLocalInterface : new i(iBinder);
            }
            d = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, (b) null);
        }
    }

    private static Boolean h() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f >= 2);
        }
        return valueOf;
    }

    private static int i(Context context, String str, boolean z) {
        h m = m(context);
        if (m == null) {
            return 0;
        }
        try {
            return m.F() >= 2 ? m.B1(x80.s3(context), str, z) : m.b2(x80.s3(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            } else {
                new String("Failed to retrieve remote module version: ");
            }
            return 0;
        }
    }

    private static DynamiteModule j(Context context, String str, int i2) {
        j jVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        sb.toString();
        synchronized (DynamiteModule.class) {
            jVar = d;
        }
        if (jVar != null) {
            c cVar = g.get();
            if (cVar == null || cVar.a == null) {
                throw new a("No result cursor", (b) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.a;
            x80.s3(null);
            boolean booleanValue = h().booleanValue();
            w80 s3 = x80.s3(applicationContext);
            w80 s32 = x80.s3(cursor);
            Context context2 = (Context) x80.r3(booleanValue ? jVar.k0(s3, str, i2, s32) : jVar.g0(s3, str, i2, s32));
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a("Failed to get module context", (b) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (b) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int k(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r2.append(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0096, all -> 0x0094 }
            if (r8 == 0) goto L_0x008c
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r9 == 0) goto L_0x008c
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = g     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.c) r10     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.a     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            if (r1 != 0) goto L_0x007c
            r10.a = r8     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00a7
        L_0x0087:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0098
        L_0x008c:
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.b) r0)     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
            throw r9     // Catch:{ Exception -> 0x0087, all -> 0x0083 }
        L_0x0094:
            r8 = move-exception
            goto L_0x00a7
        L_0x0096:
            r8 = move-exception
            r9 = r0
        L_0x0098:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x009d
            throw r8     // Catch:{ all -> 0x00a5 }
        L_0x009d:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00a5 }
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            r0 = r9
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.k(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule l(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.h m(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.h r1 = c     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.h r4 = c     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r4
        L_0x000b:
            r1 = 0
            java.lang.String r2 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r2, r3)     // Catch:{ Exception -> 0x003f }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r2)     // Catch:{ Exception -> 0x003f }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x003f }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x003f }
            if (r4 != 0) goto L_0x0027
            r2 = r1
            goto L_0x0039
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r4.queryLocalInterface(r2)     // Catch:{ Exception -> 0x003f }
            boolean r3 = r2 instanceof com.google.android.gms.dynamite.h     // Catch:{ Exception -> 0x003f }
            if (r3 == 0) goto L_0x0034
            com.google.android.gms.dynamite.h r2 = (com.google.android.gms.dynamite.h) r2     // Catch:{ Exception -> 0x003f }
            goto L_0x0039
        L_0x0034:
            com.google.android.gms.dynamite.g r2 = new com.google.android.gms.dynamite.g     // Catch:{ Exception -> 0x003f }
            r2.<init>(r4)     // Catch:{ Exception -> 0x003f }
        L_0x0039:
            if (r2 == 0) goto L_0x0059
            c = r2     // Catch:{ Exception -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r2
        L_0x003f:
            r4 = move-exception
            java.lang.String r2 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005b }
            int r3 = r4.length()     // Catch:{ all -> 0x005b }
            if (r3 == 0) goto L_0x0054
            r2.concat(r4)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0054:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x005b }
            r4.<init>(r2)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return r1
        L_0x005b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m(android.content.Context):com.google.android.gms.dynamite.h");
    }

    public final IBinder c(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, (b) null);
        }
    }
}
