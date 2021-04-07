package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.g3;
import defpackage.h2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: f3  reason: default package */
public class f3 {
    static final f0<String, Typeface> a = new f0<>(16);
    private static final g3 b = new g3("fonts", 10, 10000);
    static final Object c = new Object();
    static final h0<String, ArrayList<g3.d<g>>> d = new h0<>();
    private static final Comparator<byte[]> e = new d();

    /* renamed from: f3$a */
    static class a implements Callable<g> {
        final /* synthetic */ Context a;
        final /* synthetic */ e3 b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;

        a(Context context, e3 e3Var, int i, String str) {
            this.a = context;
            this.b = e3Var;
            this.c = i;
            this.d = str;
        }

        /* renamed from: a */
        public g call() {
            g f = f3.f(this.a, this.b, this.c);
            Typeface typeface = f.a;
            if (typeface != null) {
                f3.a.d(this.d, typeface);
            }
            return f;
        }
    }

    /* renamed from: f3$b */
    static class b implements g3.d<g> {
        final /* synthetic */ h2.a a;
        final /* synthetic */ Handler b;

        b(h2.a aVar, Handler handler) {
            this.a = aVar;
            this.b = handler;
        }

        /* renamed from: b */
        public void a(g gVar) {
            int i;
            h2.a aVar;
            if (gVar == null) {
                aVar = this.a;
                i = 1;
            } else {
                i = gVar.b;
                if (i == 0) {
                    this.a.b(gVar.a, this.b);
                    return;
                }
                aVar = this.a;
            }
            aVar.a(i, this.b);
        }
    }

    /* renamed from: f3$c */
    static class c implements g3.d<g> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((defpackage.g3.d) r1.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(defpackage.f3.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = defpackage.f3.c
                monitor-enter(r0)
                h0<java.lang.String, java.util.ArrayList<g3$d<f3$g>>> r1 = defpackage.f3.d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                h0<java.lang.String, java.util.ArrayList<g3$d<f3$g>>> r2 = defpackage.f3.d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                g3$d r2 = (defpackage.g3.d) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f3.c.a(f3$g):void");
        }
    }

    /* renamed from: f3$d */
    static class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.f3.d.compare(byte[], byte[]):int");
        }
    }

    /* renamed from: f3$e */
    public static class e {
        private final int a;
        private final f[] b;

        public e(int i, f[] fVarArr) {
            this.a = i;
            this.b = fVarArr;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: f3$f */
    public static class f {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            u3.c(uri);
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* renamed from: f3$g */
    private static final class g {
        final Typeface a;
        final int b;

        g(Typeface typeface, int i) {
            this.a = typeface;
            this.b = i;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, e3 e3Var) {
        ProviderInfo h = h(context.getPackageManager(), e3Var, context.getResources());
        return h == null ? new e(1, (f[]) null) : new e(0, e(context, e3Var, h.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(e3 e3Var, Resources resources) {
        return e3Var.a() != null ? e3Var.a() : e2.c(resources, e3Var.b());
    }

    static f[] e(Context context, e3 e3Var, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{e3Var.f()}, (String) null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{e3Var.f()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    static g f(Context context, e3 e3Var, int i) {
        try {
            e c2 = c(context, (CancellationSignal) null, e3Var);
            int i2 = -3;
            if (c2.b() == 0) {
                Typeface b2 = m2.b(context, (CancellationSignal) null, c2.a(), i);
                if (b2 != null) {
                    i2 = 0;
                }
                return new g(b2, i2);
            }
            if (c2.b() == 1) {
                i2 = -2;
            }
            return new g((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        b.d(r1, new defpackage.f3.c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface g(android.content.Context r2, defpackage.e3 r3, defpackage.h2.a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            f0<java.lang.String, android.graphics.Typeface> r1 = a
            java.lang.Object r1 = r1.c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.d(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            f3$g r2 = f(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.a
            r4.b(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.a
            return r2
        L_0x0043:
            f3$a r1 = new f3$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            g3 r3 = b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.e(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            f3$g r3 = (defpackage.f3.g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            f3$b r3 = new f3$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = c
            monitor-enter(r4)
            h0<java.lang.String, java.util.ArrayList<g3$d<f3$g>>> r5 = d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            h0<java.lang.String, java.util.ArrayList<g3$d<f3$g>>> r3 = d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            g3 r3 = b
            f3$c r4 = new f3$c
            r4.<init>(r0)
            r3.d(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3.g(android.content.Context, e3, h2$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static ProviderInfo h(PackageManager packageManager, e3 e3Var, Resources resources) {
        String d2 = e3Var.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        } else if (resolveContentProvider.packageName.equals(e3Var.e())) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, e);
            List<List<byte[]>> d3 = d(e3Var, resources);
            for (int i = 0; i < d3.size(); i++) {
                ArrayList arrayList = new ArrayList(d3.get(i));
                Collections.sort(arrayList, e);
                if (b(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + e3Var.e());
        }
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, t2.f(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
