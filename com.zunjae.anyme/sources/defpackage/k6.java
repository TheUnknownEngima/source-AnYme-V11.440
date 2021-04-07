package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: k6  reason: default package */
public class k6 {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* renamed from: k6$a */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        private final int g;

        @Deprecated
        public a(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, (String) null, 0);
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = a(str2);
            this.f = str3;
            this.g = i2;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.e > 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0070, code lost:
            r2 = r5.f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r6 == 0) goto L_0x008b
                java.lang.Class<k6$a> r2 = defpackage.k6.a.class
                java.lang.Class r3 = r6.getClass()
                if (r2 == r3) goto L_0x0011
                goto L_0x008b
            L_0x0011:
                k6$a r6 = (defpackage.k6.a) r6
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 20
                if (r2 < r3) goto L_0x0020
                int r2 = r5.e
                int r3 = r6.e
                if (r2 == r3) goto L_0x002b
                return r1
            L_0x0020:
                boolean r2 = r5.b()
                boolean r3 = r6.b()
                if (r2 == r3) goto L_0x002b
                return r1
            L_0x002b:
                java.lang.String r2 = r5.a
                java.lang.String r3 = r6.a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0036
                return r1
            L_0x0036:
                boolean r2 = r5.d
                boolean r3 = r6.d
                if (r2 == r3) goto L_0x003d
                return r1
            L_0x003d:
                int r2 = r5.g
                r3 = 2
                if (r2 != r0) goto L_0x0053
                int r2 = r6.g
                if (r2 != r3) goto L_0x0053
                java.lang.String r2 = r5.f
                if (r2 == 0) goto L_0x0053
                java.lang.String r4 = r6.f
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x0053
                return r1
            L_0x0053:
                int r2 = r5.g
                if (r2 != r3) goto L_0x0068
                int r2 = r6.g
                if (r2 != r0) goto L_0x0068
                java.lang.String r2 = r6.f
                if (r2 == 0) goto L_0x0068
                java.lang.String r3 = r5.f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0068
                return r1
            L_0x0068:
                int r2 = r5.g
                if (r2 == 0) goto L_0x0082
                int r3 = r6.g
                if (r2 != r3) goto L_0x0082
                java.lang.String r2 = r5.f
                if (r2 == 0) goto L_0x007d
                java.lang.String r3 = r6.f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0082
                goto L_0x0081
            L_0x007d:
                java.lang.String r2 = r6.f
                if (r2 == 0) goto L_0x0082
            L_0x0081:
                return r1
            L_0x0082:
                int r2 = r5.c
                int r6 = r6.c
                if (r2 != r6) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r0 = 0
            L_0x008a:
                return r0
            L_0x008b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.k6.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            return "Column{name='" + this.a + '\'' + ", type='" + this.b + '\'' + ", affinity='" + this.c + '\'' + ", notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + '\'' + '}';
        }
    }

    /* renamed from: k6$b */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + '\'' + ", onDelete='" + this.b + '\'' + ", onUpdate='" + this.c + '\'' + ", columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* renamed from: k6$c */
    static class c implements Comparable<c> {
        final int e;
        final int f;
        final String g;
        final String h;

        c(int i, int i2, String str, String str2) {
            this.e = i;
            this.f = i2;
            this.g = str;
            this.h = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.e - cVar.e;
            return i == 0 ? this.f - cVar.f : i;
        }
    }

    /* renamed from: k6$d */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.c.equals(dVar.c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + '\'' + ", unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public k6(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static k6 a(m6 m6Var, String str) {
        return new k6(str, b(m6Var, str), d(m6Var, str), f(m6Var, str));
    }

    private static Map<String, a> b(m6 m6Var, String str) {
        Cursor R = m6Var.R("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (R.getColumnCount() > 0) {
                int columnIndex = R.getColumnIndex("name");
                int columnIndex2 = R.getColumnIndex("type");
                int columnIndex3 = R.getColumnIndex("notnull");
                int columnIndex4 = R.getColumnIndex("pk");
                int columnIndex5 = R.getColumnIndex("dflt_value");
                while (R.moveToNext()) {
                    String string = R.getString(columnIndex);
                    hashMap.put(string, new a(string, R.getString(columnIndex2), R.getInt(columnIndex3) != 0, R.getInt(columnIndex4), R.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            R.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(m6 m6Var, String str) {
        HashSet hashSet = new HashSet();
        Cursor R = m6Var.R("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = R.getColumnIndex("id");
            int columnIndex2 = R.getColumnIndex("seq");
            int columnIndex3 = R.getColumnIndex("table");
            int columnIndex4 = R.getColumnIndex("on_delete");
            int columnIndex5 = R.getColumnIndex("on_update");
            List<c> c2 = c(R);
            int count = R.getCount();
            for (int i = 0; i < count; i++) {
                R.moveToPosition(i);
                if (R.getInt(columnIndex2) == 0) {
                    int i2 = R.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : c2) {
                        if (next.e == i2) {
                            arrayList.add(next.g);
                            arrayList2.add(next.h);
                        }
                    }
                    hashSet.add(new b(R.getString(columnIndex3), R.getString(columnIndex4), R.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            R.close();
        }
    }

    private static d e(m6 m6Var, String str, boolean z) {
        Cursor R = m6Var.R("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = R.getColumnIndex("seqno");
            int columnIndex2 = R.getColumnIndex("cid");
            int columnIndex3 = R.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (R.moveToNext()) {
                        if (R.getInt(columnIndex2) >= 0) {
                            int i = R.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), R.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    R.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            R.close();
        }
    }

    private static Set<d> f(m6 m6Var, String str) {
        Cursor R = m6Var.R("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = R.getColumnIndex("name");
            int columnIndex2 = R.getColumnIndex("origin");
            int columnIndex3 = R.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (R.moveToNext()) {
                        if ("c".equals(R.getString(columnIndex2))) {
                            String string = R.getString(columnIndex);
                            boolean z = true;
                            if (R.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            d e = e(m6Var, string, z);
                            if (e == null) {
                                R.close();
                                return null;
                            }
                            hashSet.add(e);
                        }
                    }
                    R.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            R.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || k6.class != obj.getClass()) {
            return false;
        }
        k6 k6Var = (k6) obj;
        String str = this.a;
        if (str == null ? k6Var.a != null : !str.equals(k6Var.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? k6Var.b != null : !map.equals(k6Var.b)) {
            return false;
        }
        Set<b> set2 = this.c;
        if (set2 == null ? k6Var.c != null : !set2.equals(k6Var.c)) {
            return false;
        }
        Set<d> set3 = this.d;
        if (set3 == null || (set = k6Var.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.a + '\'' + ", columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
