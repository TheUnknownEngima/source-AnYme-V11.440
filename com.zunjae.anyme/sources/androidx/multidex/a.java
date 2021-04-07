package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

public final class a {
    private static final Set<File> a = new HashSet();
    private static final boolean b = n(System.getProperty("java.vm.version"));

    /* renamed from: androidx.multidex.a$a  reason: collision with other inner class name */
    private static final class C0041a {
        private static final int b = 4;
        private final C0042a a;

        /* renamed from: androidx.multidex.a$a$a  reason: collision with other inner class name */
        private interface C0042a {
            Object a(File file, DexFile dexFile);
        }

        /* renamed from: androidx.multidex.a$a$b */
        private static class b implements C0042a {
            private final Constructor<?> a;

            b(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.a = constructor;
                constructor.setAccessible(true);
            }

            public Object a(File file, DexFile dexFile) {
                return this.a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: androidx.multidex.a$a$c */
        private static class c implements C0042a {
            private final Constructor<?> a;

            c(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.a = constructor;
                constructor.setAccessible(true);
            }

            public Object a(File file, DexFile dexFile) {
                return this.a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: androidx.multidex.a$a$d */
        private static class d implements C0042a {
            private final Constructor<?> a;

            d(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.a = constructor;
                constructor.setAccessible(true);
            }

            public Object a(File file, DexFile dexFile) {
                return this.a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0041a() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                androidx.multidex.a$a$b r1 = new androidx.multidex.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                androidx.multidex.a$a$c r1 = new androidx.multidex.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                androidx.multidex.a$a$d r1 = new androidx.multidex.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.a.C0041a.<init>():void");
        }

        static void a(ClassLoader classLoader, List<? extends File> list) {
            Object obj = a.g(classLoader, "pathList").get(classLoader);
            Object[] b2 = new C0041a().b(list);
            try {
                a.f(obj, "dexElements", b2);
            } catch (NoSuchFieldException unused) {
                a.f(obj, "pathElements", b2);
            }
        }

        private Object[] b(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }

        private static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - b) + ".dex").getPath();
        }
    }

    private static final class b {
        static void a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = a.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field a = a.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) a.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    private static final class c {
        static void a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field a = a.g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a.set(classLoader, sb.toString());
            a.f(classLoader, "mPaths", strArr);
            a.f(classLoader, "mFiles", fileArr);
            a.f(classLoader, "mZips", zipFileArr);
            a.f(classLoader, "mDexs", dexFileArr);
        }
    }

    private static void d(Context context) {
        StringBuilder sb;
        String str;
        String str2;
        StringBuilder sb2;
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            "Clearing old secondary dex dir (" + file.getPath() + ").";
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                "Failed to list secondary dex dir content (" + file.getPath() + ").";
                return;
            }
            for (File file2 : listFiles) {
                "Trying to delete old file " + file2.getPath() + " of size " + file2.length();
                if (!file2.delete()) {
                    sb2 = new StringBuilder();
                    str2 = "Failed to delete old file ";
                } else {
                    sb2 = new StringBuilder();
                    str2 = "Deleted old file ";
                }
                sb2.append(str2);
                sb2.append(file2.getPath());
                sb2.toString();
            }
            if (!file.delete()) {
                sb = new StringBuilder();
                str = "Failed to delete secondary dex dir ";
            } else {
                sb = new StringBuilder();
                str = "Deleted old secondary dex dir ";
            }
            sb.append(str);
            sb.append(file.getPath());
            sb.toString();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC, Splitter:B:32:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void e(android.content.Context r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            java.util.Set<java.io.File> r0 = a
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = a     // Catch:{ all -> 0x0088 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = a     // Catch:{ all -> 0x0088 }
            r1.add(r5)     // Catch:{ all -> 0x0088 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0088 }
            r2 = 20
            if (r1 <= r2) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0088 }
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = ": SDK version higher than "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = " should be backed by "
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "case here: java.vm.version=\""
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0088 }
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ all -> 0x0088 }
            r1.toString()     // Catch:{ all -> 0x0088 }
        L_0x004f:
            java.lang.ClassLoader r1 = j(r4)     // Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            return
        L_0x0057:
            d(r4)     // Catch:{ all -> 0x005a }
        L_0x005a:
            java.io.File r6 = k(r4, r6, r7)     // Catch:{ all -> 0x0088 }
            androidx.multidex.b r7 = new androidx.multidex.b     // Catch:{ all -> 0x0088 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0088 }
            r5 = 0
            r2 = 0
            java.util.List r2 = r7.r(r4, r8, r2)     // Catch:{ all -> 0x0083 }
            m(r1, r6, r2)     // Catch:{ IOException -> 0x006d }
            goto L_0x0078
        L_0x006d:
            r2 = move-exception
            if (r9 == 0) goto L_0x0082
            r9 = 1
            java.util.List r4 = r7.r(r4, r8, r9)     // Catch:{ all -> 0x0083 }
            m(r1, r6, r4)     // Catch:{ all -> 0x0083 }
        L_0x0078:
            r7.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r5 = move-exception
        L_0x007d:
            if (r5 != 0) goto L_0x0081
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            return
        L_0x0081:
            throw r5     // Catch:{ all -> 0x0088 }
        L_0x0082:
            throw r2     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r4 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            throw r4     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.a.e(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    public static void f(Object obj, String str, Object[] objArr) {
        Field g = g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    /* access modifiers changed from: private */
    public static Field g(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    public static Method h(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static ClassLoader j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static File k(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void l(Context context) {
        if (!b) {
            if (Build.VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo i = i(context);
                    if (i != null) {
                        e(context, new File(i.sourceDir), new File(i.dataDir), "secondary-dexes", "", true);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
                }
            } else {
                throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
            }
        }
    }

    private static void m(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                b.a(classLoader, list, file);
            } else if (i >= 14) {
                C0041a.a(classLoader, list);
            } else {
                c.a(classLoader, list);
            }
        }
    }

    static boolean n(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        sb.toString();
        return z;
    }

    private static void o(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
