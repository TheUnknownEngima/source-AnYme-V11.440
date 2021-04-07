package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

class a {
    private Animator a;

    a() {
    }

    public void a() {
        Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.a = null;
    }

    public void c(Animator animator) {
        a();
        this.a = animator;
    }
}
