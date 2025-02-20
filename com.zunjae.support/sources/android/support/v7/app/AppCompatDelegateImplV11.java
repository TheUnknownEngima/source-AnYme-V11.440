package android.support.v7.app;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;

@RequiresApi(11)
class AppCompatDelegateImplV11 extends AppCompatDelegateImplV9 {
    AppCompatDelegateImplV11(Context context, Window window, AppCompatCallback callback) {
        super(context, window, callback);
    }

    public boolean hasWindowFeature(int featureId) {
        return super.hasWindowFeature(featureId) || this.mWindow.hasFeature(featureId);
    }

    /* access modifiers changed from: package-private */
    public View callActivityOnCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return null;
    }
}
