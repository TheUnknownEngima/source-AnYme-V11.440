package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import defpackage.e2;
import defpackage.f3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: s2  reason: default package */
class s2 {
    private ConcurrentHashMap<Long, e2.b> a = new ConcurrentHashMap<>();

    /* renamed from: s2$a */
    class a implements c<f3.f> {
        a(s2 s2Var) {
        }

        /* renamed from: c */
        public int a(f3.f fVar) {
            return fVar.d();
        }

        /* renamed from: d */
        public boolean b(f3.f fVar) {
            return fVar.e();
        }
    }

    /* renamed from: s2$b */
    class b implements c<e2.c> {
        b(s2 s2Var) {
        }

        /* renamed from: c */
        public int a(e2.c cVar) {
            return cVar.e();
        }

        /* renamed from: d */
        public boolean b(e2.c cVar) {
            return cVar.f();
        }
    }

    /* renamed from: s2$c */
    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    s2() {
    }

    private void a(Typeface typeface, e2.b bVar) {
        long j = j(typeface);
        if (j != 0) {
            this.a.put(Long.valueOf(j), bVar);
        }
    }

    private e2.c f(e2.b bVar, int i) {
        return (e2.c) g(bVar.a(), i, new b(this));
    }

    private static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    public Typeface b(Context context, e2.b bVar, Resources resources, int i) {
        e2.c f = f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = m2.d(context, resources, f.b(), f.a(), i);
        a(d, bVar);
        return d;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, f3.f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(fVarArr, i).c());
            try {
                Typeface d = d(context, inputStream);
                t2.a(inputStream);
                return d;
            } catch (IOException unused) {
                t2.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                t2.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            t2.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            t2.a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e = t2.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!t2.d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e = t2.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!t2.c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    public f3.f h(f3.f[] fVarArr, int i) {
        return (f3.f) g(fVarArr, i, new a(this));
    }

    /* access modifiers changed from: package-private */
    public e2.b i(Typeface typeface) {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j));
    }
}
