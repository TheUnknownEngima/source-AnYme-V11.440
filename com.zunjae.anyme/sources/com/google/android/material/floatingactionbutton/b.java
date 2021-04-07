package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

abstract class b implements f {
    private final Context a;
    private final ExtendedFloatingActionButton b;
    private final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    private final a d;
    private m91 e;
    private m91 f;

    b(ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = aVar;
    }

    public void a() {
        this.d.b();
    }

    public void b() {
        this.d.b();
    }

    public m91 e() {
        return this.f;
    }

    public final void g(m91 m91) {
        this.f = m91;
    }

    public AnimatorSet h() {
        return k(l());
    }

    public final List<Animator.AnimatorListener> i() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public AnimatorSet k(m91 m91) {
        ArrayList arrayList = new ArrayList();
        if (m91.j("opacity")) {
            arrayList.add(m91.f("opacity", this.b, View.ALPHA));
        }
        if (m91.j("scale")) {
            arrayList.add(m91.f("scale", this.b, View.SCALE_Y));
            arrayList.add(m91.f("scale", this.b, View.SCALE_X));
        }
        if (m91.j("width")) {
            arrayList.add(m91.f("width", this.b, ExtendedFloatingActionButton.F));
        }
        if (m91.j("height")) {
            arrayList.add(m91.f("height", this.b, ExtendedFloatingActionButton.G));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        g91.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final m91 l() {
        m91 m91 = this.f;
        if (m91 != null) {
            return m91;
        }
        if (this.e == null) {
            this.e = m91.d(this.a, c());
        }
        m91 m912 = this.e;
        u3.c(m912);
        return m912;
    }

    public void onAnimationStart(Animator animator) {
        this.d.c(animator);
    }
}
