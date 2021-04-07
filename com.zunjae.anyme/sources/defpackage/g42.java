package defpackage;

/* renamed from: g42  reason: default package */
public final class g42 {

    /* renamed from: g42$a */
    public static final class a extends Thread {
        final /* synthetic */ o52 e;

        a(o52 o52) {
            this.e = o52;
        }

        public void run() {
            this.e.invoke();
        }
    }

    public static final Thread a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, o52<u22> o52) {
        v62.e(o52, "block");
        a aVar = new a(o52);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread b(boolean z, boolean z2, ClassLoader classLoader, String str, int i, o52 o52, int i2, Object obj) {
        return a((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : classLoader, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? -1 : i, o52);
    }
}
