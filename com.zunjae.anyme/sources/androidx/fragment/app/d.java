package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.R$anim;
import androidx.fragment.R$id;
import androidx.fragment.app.t;
import defpackage.b3;

class d {

    static class a implements b3.a {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        public void a() {
            if (this.a.q() != null) {
                View q = this.a.q();
                this.a.s1((View) null);
                q.clearAnimation();
            }
            this.a.t1((Animator) null);
        }
    }

    static class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ t.g c;
        final /* synthetic */ b3 d;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.b.q() != null) {
                    b.this.b.s1((View) null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, t.g gVar, b3 b3Var) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.d = b3Var;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    static class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup e;
        final /* synthetic */ View f;
        final /* synthetic */ Fragment g;
        final /* synthetic */ t.g h;
        final /* synthetic */ b3 i;

        c(ViewGroup viewGroup, View view, Fragment fragment, t.g gVar, b3 b3Var) {
            this.e = viewGroup;
            this.f = view;
            this.g = fragment;
            this.h = gVar;
            this.i = b3Var;
        }

        public void onAnimationEnd(Animator animator) {
            this.e.endViewTransition(this.f);
            Animator r = this.g.r();
            this.g.t1((Animator) null);
            if (r != null && this.e.indexOfChild(this.f) < 0) {
                this.h.a(this.g, this.i);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    static class C0025d {
        public final Animation a;
        public final Animator b;

        C0025d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0025d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class e extends AnimationSet implements Runnable {
        private final ViewGroup e;
        private final View f;
        private boolean g;
        private boolean h;
        private boolean i = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.e = viewGroup;
            this.f = view;
            addAnimation(animation);
            this.e.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.i = true;
            if (this.g) {
                return !this.h;
            }
            if (!super.getTransformation(j, transformation)) {
                this.g = true;
                l4.a(this.e, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.i = true;
            if (this.g) {
                return !this.h;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.g = true;
                l4.a(this.e, this);
            }
            return true;
        }

        public void run() {
            if (this.g || !this.i) {
                this.e.endViewTransition(this.f);
                this.h = true;
                return;
            }
            this.i = false;
            this.e.post(this);
        }
    }

    static void a(Fragment fragment, C0025d dVar, t.g gVar) {
        View view = fragment.K;
        ViewGroup viewGroup = fragment.J;
        viewGroup.startViewTransition(view);
        b3 b3Var = new b3();
        b3Var.c(new a(fragment));
        gVar.b(fragment, b3Var);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.s1(fragment.K);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, b3Var));
            fragment.K.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.t1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, b3Var));
        animator.setTarget(fragment.K);
        animator.start();
    }

    static C0025d b(Context context, e eVar, Fragment fragment, boolean z) {
        int c2;
        int E = fragment.E();
        int D = fragment.D();
        boolean z2 = false;
        fragment.y1(0);
        View d = eVar.d(fragment.A);
        if (!(d == null || d.getTag(R$id.visible_removing_fragment_view_tag) == null)) {
            d.setTag(R$id.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = fragment.J;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation o0 = fragment.o0(E, z, D);
        if (o0 != null) {
            return new C0025d(o0);
        }
        Animator p0 = fragment.p0(E, z, D);
        if (p0 != null) {
            return new C0025d(p0);
        }
        if (D != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(D));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, D);
                    if (loadAnimation != null) {
                        return new C0025d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, D);
                    if (loadAnimator != null) {
                        return new C0025d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, D);
                        if (loadAnimation2 != null) {
                            return new C0025d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (E != 0 && (c2 = c(E, z)) >= 0) {
            return new C0025d(AnimationUtils.loadAnimation(context, c2));
        }
        return null;
    }

    private static int c(int i, boolean z) {
        if (i == 4097) {
            return z ? R$anim.fragment_open_enter : R$anim.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? R$anim.fragment_fade_enter : R$anim.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? R$anim.fragment_close_enter : R$anim.fragment_close_exit;
    }
}
