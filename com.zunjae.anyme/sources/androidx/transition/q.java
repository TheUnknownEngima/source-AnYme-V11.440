package androidx.transition;

import android.view.ViewGroup;

public class q {
    private ViewGroup a;
    private Runnable b;

    public static q b(ViewGroup viewGroup) {
        return (q) viewGroup.getTag(R$id.transition_current_scene);
    }

    static void c(ViewGroup viewGroup, q qVar) {
        viewGroup.setTag(R$id.transition_current_scene, qVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) == this && (runnable = this.b) != null) {
            runnable.run();
        }
    }
}
