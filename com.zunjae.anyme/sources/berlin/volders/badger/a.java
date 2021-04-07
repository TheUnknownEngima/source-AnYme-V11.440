package berlin.volders.badger;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public abstract class a extends Drawable {
    private int a = 255;
    private ColorFilter b;

    /* renamed from: berlin.volders.badger.a$a  reason: collision with other inner class name */
    private class C0068a extends Drawable.ConstantState {
        C0068a() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return a.this;
        }
    }

    public interface b<T extends a> {
        T a();
    }

    public int getAlpha() {
        return this.a;
    }

    public ColorFilter getColorFilter() {
        return this.b;
    }

    public Drawable.ConstantState getConstantState() {
        return new C0068a();
    }

    public int getOpacity() {
        int i = this.a;
        if (i == 255) {
            return -1;
        }
        return i == 0 ? -2 : -3;
    }

    public void setAlpha(int i) {
        if (i > 255) {
            i = 255;
        } else if (i < 0) {
            i = 0;
        }
        if (this.a != i) {
            this.a = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != colorFilter) {
            this.b = colorFilter;
            invalidateSelf();
        }
    }
}
