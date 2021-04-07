package androidx.work;

public abstract class h {
    private static h a = null;
    private static final int b = 20;

    public static class a extends h {
        private int c;

        public a(int i) {
            super(i);
            this.c = i;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.c <= 3 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.c <= 6 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.c <= 4 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void g(String str, String str2, Throwable... thArr) {
            if (this.c <= 2 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        public void h(String str, String str2, Throwable... thArr) {
            if (this.c <= 5 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    public h(int i) {
    }

    public static synchronized h c() {
        h hVar;
        synchronized (h.class) {
            if (a == null) {
                a = new a(3);
            }
            hVar = a;
        }
        return hVar;
    }

    public static synchronized void e(h hVar) {
        synchronized (h.class) {
            a = hVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = b;
        if (length >= i) {
            str = str.substring(0, i);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
