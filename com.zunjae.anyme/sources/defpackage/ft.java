package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: ft  reason: default package */
public final class ft implements lt {
    private static final Constructor<? extends ht> j;
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = 1;
    private int i;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(ht.class).getConstructor(new Class[0]);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        j = constructor;
    }

    public synchronized ht[] a() {
        ht[] htVarArr;
        htVarArr = new ht[14];
        htVarArr[0] = new ou(this.d);
        int i2 = 1;
        htVarArr[1] = new fv(this.f);
        htVarArr[2] = new iv(this.e);
        htVarArr[3] = new vu(this.g | (this.a ? 1 : 0));
        htVarArr[4] = new jw(this.b | (this.a ? 1 : 0));
        htVarArr[5] = new fw();
        htVarArr[6] = new gx(this.h, this.i);
        htVarArr[7] = new gu();
        htVarArr[8] = new sv();
        htVarArr[9] = new zw();
        htVarArr[10] = new lx();
        int i3 = this.c;
        if (!this.a) {
            i2 = 0;
        }
        htVarArr[11] = new zt(i2 | i3);
        htVarArr[12] = new hw();
        if (j != null) {
            try {
                htVarArr[13] = (ht) j.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        } else {
            htVarArr[13] = new du();
        }
        return htVarArr;
    }
}
