package defpackage;

import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g30  reason: default package */
final class g30 {
    public final String a;
    public final int b;

    /* renamed from: g30$a */
    static final class a {
        public final int a;
        public final int b;
        public final int c;

        private a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static defpackage.g30.a a(java.lang.String r9) {
            /*
                r0 = 7
                java.lang.String r9 = r9.substring(r0)
                java.lang.String r0 = ","
                java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
                r0 = 0
                r1 = -1
                r2 = 0
                r3 = -1
                r4 = -1
            L_0x0010:
                int r5 = r9.length
                if (r2 >= r5) goto L_0x004d
                r5 = r9[r2]
                java.lang.String r5 = r5.trim()
                java.lang.String r5 = defpackage.v50.G0(r5)
                int r6 = r5.hashCode()
                r7 = 3373707(0x337a8b, float:4.72757E-39)
                r8 = 1
                if (r6 == r7) goto L_0x0037
                r7 = 1767875043(0x695fa1e3, float:1.6897184E25)
                if (r6 == r7) goto L_0x002d
                goto L_0x0041
            L_0x002d:
                java.lang.String r6 = "alignment"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0041
                r5 = 1
                goto L_0x0042
            L_0x0037:
                java.lang.String r6 = "name"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0041
                r5 = 0
                goto L_0x0042
            L_0x0041:
                r5 = -1
            L_0x0042:
                if (r5 == 0) goto L_0x0049
                if (r5 == r8) goto L_0x0047
                goto L_0x004a
            L_0x0047:
                r4 = r2
                goto L_0x004a
            L_0x0049:
                r3 = r2
            L_0x004a:
                int r2 = r2 + 1
                goto L_0x0010
            L_0x004d:
                if (r3 == r1) goto L_0x0056
                g30$a r0 = new g30$a
                int r9 = r9.length
                r0.<init>(r3, r4, r9)
                goto L_0x0057
            L_0x0056:
                r0 = 0
            L_0x0057:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.a.a(java.lang.String):g30$a");
        }
    }

    /* renamed from: g30$b */
    static final class b {
        private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d = Pattern.compile(v50.w("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern e = Pattern.compile(v50.w("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern f = Pattern.compile("\\\\an(\\d+)");
        public final int a;
        public final PointF b;

        private b(int i, PointF pointF) {
            this.a = i;
            this.b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return g30.d(matcher.group(1));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001b */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static defpackage.g30.b b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x0025
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                android.graphics.PointF r4 = c(r3)     // Catch:{ RuntimeException -> 0x001b }
                if (r4 == 0) goto L_0x001b
                r1 = r4
            L_0x001b:
                int r3 = a(r3)     // Catch:{ RuntimeException -> 0x0023 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0023:
                goto L_0x0009
            L_0x0025:
                g30$b r5 = new g30$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.b.b(java.lang.String):g30$b");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    b50.f("SsaStyle.Overrides", sb.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            q40.e(str2);
            float parseFloat = Float.parseFloat(str2.trim());
            q40.e(str3);
            return new PointF(parseFloat, Float.parseFloat(str3.trim()));
        }

        public static String d(String str) {
            return c.matcher(str).replaceAll("");
        }
    }

    private g30(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static g30 b(String str, a aVar) {
        q40.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = aVar.c;
        if (length != i) {
            b50.h("SsaStyle", v50.w("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            return new g30(split[aVar.a].trim(), d(split[aVar.b]));
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Skipping malformed 'Style:' line: '");
            sb.append(str);
            sb.append("'");
            b50.i("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    private static boolean c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static int d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        b50.h("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }
}
