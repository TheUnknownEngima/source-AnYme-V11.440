package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class e {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.U(context, str, bundle);
    }

    public abstract View d(int i);

    public abstract boolean e();
}
