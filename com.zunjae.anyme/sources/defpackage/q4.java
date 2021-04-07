package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import androidx.core.R$id;

/* renamed from: q4  reason: default package */
public final class q4 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R$id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && o4.F(viewGroup) == null) ? false : true;
    }
}
