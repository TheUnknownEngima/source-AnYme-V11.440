package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e {
    private static final String b = h.f("Data");
    public static final e c = new a().a();
    Map<String, Object> a;

    public static final class a {
        private Map<String, Object> a = new HashMap();

        public e a() {
            e eVar = new e((Map<String, ?>) this.a);
            e.j(eVar);
            return eVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.a.put(str, (Object) null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.a.put(str, e.a((boolean[]) obj));
                } else if (cls == int[].class) {
                    this.a.put(str, e.d((int[]) obj));
                } else if (cls == long[].class) {
                    this.a.put(str, e.e((long[]) obj));
                } else if (cls == float[].class) {
                    this.a.put(str, e.c((float[]) obj));
                } else if (cls == double[].class) {
                    this.a.put(str, e.b((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        public a c(e eVar) {
            d(eVar.a);
            return this;
        }

        public a d(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                b((String) next.getKey(), next.getValue());
            }
            return this;
        }

        public a e(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }
    }

    e() {
    }

    public e(e eVar) {
        this.a = new HashMap(eVar.a);
    }

    e(Map<String, ?> map) {
        this.a = new HashMap(map);
    }

    static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    static Double[] b(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    static Float[] c(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    static Integer[] d(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    static Long[] e(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.e f(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0046:
            androidx.work.e r5 = new androidx.work.e
            r5.<init>((java.util.Map<java.lang.String, ?>) r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.e.f(byte[]):androidx.work.e");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|(0)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|21|24|25|(0)|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[SYNTHETIC, Splitter:B:27:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c A[SYNTHETIC, Splitter:B:34:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] j(androidx.work.e r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005d }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005d }
            int r1 = r4.i()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.a     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x001c:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x001c
        L_0x0039:
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r0.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
        L_0x0041:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x004e
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x0056:
            r4 = move-exception
            r1 = r2
            goto L_0x006a
        L_0x0059:
            r1 = r2
            goto L_0x005d
        L_0x005b:
            r4 = move-exception
            goto L_0x006a
        L_0x005d:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r0.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            return r4
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            r0.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.e.j(androidx.work.e):byte[]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public Map<String, Object> g() {
        return Collections.unmodifiableMap(this.a);
    }

    public String h(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public int i() {
        return this.a.size();
    }
}
