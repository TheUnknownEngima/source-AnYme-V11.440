package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.er;
import java.nio.ByteBuffer;

/* renamed from: or  reason: default package */
final class or extends kr {
    private static final int i = Float.floatToIntBits(Float.NaN);

    or() {
    }

    private static void n(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(Utils.FLOAT_EPSILON);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            byteBuffer2 = m((i2 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i3 == 805306368) {
            byteBuffer2 = m(i2);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public er.a i(er.a aVar) {
        int i2 = aVar.c;
        if (v50.e0(i2)) {
            return i2 != 4 ? new er.a(aVar.a, aVar.b, 4) : er.a.e;
        }
        throw new er.b(aVar);
    }
}
