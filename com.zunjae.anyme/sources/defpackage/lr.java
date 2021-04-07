package defpackage;

import defpackage.er;
import java.nio.ByteBuffer;

/* renamed from: lr  reason: default package */
final class lr extends kr {
    private int[] i;
    private int[] j;

    lr() {
    }

    public void e(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        q40.e(iArr);
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m = m(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i2 : iArr2) {
                m.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        m.flip();
    }

    public er.a i(er.a aVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return er.a.e;
        }
        if (aVar.c == 2) {
            boolean z = aVar.b != iArr.length;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < aVar.b) {
                    z |= i3 != i2;
                    i2++;
                } else {
                    throw new er.b(aVar);
                }
            }
            return z ? new er.a(aVar.a, iArr.length, 2) : er.a.e;
        }
        throw new er.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.j = this.i;
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.j = null;
        this.i = null;
    }

    public void n(int[] iArr) {
        this.i = iArr;
    }
}
