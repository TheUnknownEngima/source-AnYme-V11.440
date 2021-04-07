package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.i;

public class AppCompatCheckedTextView extends CheckedTextView {
    private static final int[] f = {16843016};
    private final m e;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(d0.b(context), attributeSet, i);
        m mVar = new m(this);
        this.e = mVar;
        mVar.m(attributeSet, i);
        this.e.b();
        g0 u = g0.u(getContext(), attributeSet, f, i, 0);
        setCheckMarkDrawable(u.g(0));
        u.v();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.e;
        if (mVar != null) {
            mVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(f.d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.t(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        m mVar = this.e;
        if (mVar != null) {
            mVar.p(context, i);
        }
    }
}
