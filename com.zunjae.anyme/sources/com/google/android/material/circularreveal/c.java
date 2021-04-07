package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;

public interface c extends b.a {

    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        private final e a = new e();

        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            this.a.b(z91.f(eVar.a, eVar2.a, f), z91.f(eVar.b, eVar2.b, f), z91.f(eVar.c, eVar2.c, f));
            return this.a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    public static class C0097c extends Property<c, e> {
        public static final Property<c, e> a = new C0097c("circularReveal");

        private C0097c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {
        public static final Property<c, Integer> a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {
        public float a;
        public float b;
        public float c;

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public e(e eVar) {
            this(eVar.a, eVar.b, eVar.c);
        }

        public boolean a() {
            return this.c == Float.MAX_VALUE;
        }

        public void b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public void c(e eVar) {
            b(eVar.a, eVar.b, eVar.c);
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
