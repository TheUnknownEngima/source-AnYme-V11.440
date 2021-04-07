package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ua1  reason: default package */
public final class ua1 implements ma1 {
    private final float a;

    public ua1(float f) {
        this.a = f;
    }

    public float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua1) && this.a == ((ua1) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
