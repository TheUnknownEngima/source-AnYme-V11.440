package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.l;

public class AppCompatImageView extends ImageView implements n4, l {
    private final e e;
    private final i f;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(d0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.e = eVar;
        eVar.e(attributeSet, i);
        i iVar = new i(this);
        this.f = iVar;
        iVar.f(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.b();
        }
        i iVar = this.f;
        if (iVar != null) {
            iVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i iVar = this.f;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.e;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        i iVar = this.f;
        if (iVar != null) {
            iVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        i iVar = this.f;
        if (iVar != null) {
            iVar.b();
        }
    }

    public void setImageResource(int i) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.g(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i iVar = this.f;
        if (iVar != null) {
            iVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.i(mode);
        }
    }
}
