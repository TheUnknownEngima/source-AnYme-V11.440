package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ka1  reason: default package */
public final class ka1 implements ma1 {
    private final float a;

    public ka1(float f) {
        this.a = f;
    }

    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka1) && this.a == ((ka1) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
