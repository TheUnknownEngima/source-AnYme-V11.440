package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import defpackage.n5;
import defpackage.o5;
import java.util.ArrayList;

/* renamed from: o5  reason: default package */
public abstract class o5<T extends o5<T>> implements n5.b {
    public static final k m = new c("scaleX");
    public static final k n = new d("scaleY");
    public static final k o = new e("rotation");
    public static final k p = new f("rotationX");
    public static final k q = new g("rotationY");
    public static final k r = new a("alpha");
    float a = Utils.FLOAT_EPSILON;
    float b = Float.MAX_VALUE;
    boolean c = false;
    final Object d;
    final p5 e;
    boolean f = false;
    float g = Float.MAX_VALUE;
    float h = (-Float.MAX_VALUE);
    private long i = 0;
    private float j;
    private final ArrayList<i> k = new ArrayList<>();
    private final ArrayList<j> l = new ArrayList<>();

    /* renamed from: o5$a */
    static class a extends k {
        a(String str) {
            super(str, (b) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: o5$b */
    static class b extends k {
    }

    /* renamed from: o5$c */
    static class c extends k {
        c(String str) {
            super(str, (b) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: o5$d */
    static class d extends k {
        d(String str) {
            super(str, (b) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: o5$e */
    static class e extends k {
        e(String str) {
            super(str, (b) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: o5$f */
    static class f extends k {
        f(String str) {
            super(str, (b) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: o5$g */
    static class g extends k {
        g(String str) {
            super(str, (b) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: o5$h */
    static class h {
        float a;
        float b;

        h() {
        }
    }

    /* renamed from: o5$i */
    public interface i {
        void a(o5 o5Var, boolean z, float f, float f2);
    }

    /* renamed from: o5$j */
    public interface j {
        void a(o5 o5Var, float f, float f2);
    }

    /* renamed from: o5$k */
    public static abstract class k extends p5<View> {
        private k(String str) {
            super(str);
        }

        /* synthetic */ k(String str, b bVar) {
            this(str);
        }
    }

    <K> o5(K k2, p5<K> p5Var) {
        float f2;
        this.d = k2;
        this.e = p5Var;
        if (p5Var == o || p5Var == p || p5Var == q) {
            f2 = 0.1f;
        } else if (p5Var == r || p5Var == m || p5Var == n) {
            this.j = 0.00390625f;
            return;
        } else {
            f2 = 1.0f;
        }
        this.j = f2;
    }

    private void d(boolean z) {
        this.f = false;
        n5.d().g(this);
        this.i = 0;
        this.c = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, z, this.b, this.a);
            }
        }
        h(this.k);
    }

    private float e() {
        return this.e.a(this.d);
    }

    private static <T> void h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void l() {
        if (!this.f) {
            this.f = true;
            if (!this.c) {
                this.b = e();
            }
            float f2 = this.b;
            if (f2 > this.g || f2 < this.h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            n5.d().a(this, 0);
        }
    }

    public boolean a(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            i(this.b);
            return false;
        }
        this.i = j2;
        boolean m2 = m(j2 - j3);
        float min = Math.min(this.b, this.g);
        this.b = min;
        float max = Math.max(min, this.h);
        this.b = max;
        i(max);
        if (m2) {
            d(false);
        }
        return m2;
    }

    public T b(j jVar) {
        if (!g()) {
            if (!this.l.contains(jVar)) {
                this.l.add(jVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.f) {
            d(true);
        }
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.j * 0.75f;
    }

    public boolean g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void i(float f2) {
        this.e.b(this.d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).a(this, this.b, this.a);
            }
        }
        h(this.l);
    }

    public T j(float f2) {
        this.b = f2;
        this.c = true;
        return this;
    }

    public void k() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m(long j2);
}
