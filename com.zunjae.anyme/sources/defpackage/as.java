package defpackage;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: as  reason: default package */
public class as extends wr {
    public final xr e = new xr();
    public ByteBuffer f;
    public boolean g;
    public long h;
    public ByteBuffer i;
    private final int j;

    public as(int i2) {
        this.j = i2;
    }

    private ByteBuffer i(int i2) {
        int i3 = this.j;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i2);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public static as r() {
        return new as(0);
    }

    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.g = false;
    }

    @EnsuresNonNull({"data"})
    public void k(int i2) {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null) {
            this.f = i(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f.position();
        int i3 = i2 + position;
        if (capacity < i3) {
            ByteBuffer i4 = i(i3);
            i4.order(this.f.order());
            if (position > 0) {
                this.f.flip();
                i4.put(this.f);
            }
            this.f = i4;
        }
    }

    public final void l() {
        this.f.flip();
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    public final boolean m() {
        return getFlag(1073741824);
    }

    public final boolean q() {
        return this.f == null && this.j == 0;
    }

    @EnsuresNonNull({"supplementalData"})
    public void s(int i2) {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.i = ByteBuffer.allocate(i2);
        } else {
            this.i.clear();
        }
    }
}
