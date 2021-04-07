package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: gy  reason: default package */
public final class gy implements ay {
    public yx a(cy cyVar) {
        ByteBuffer byteBuffer = cyVar.f;
        q40.e(byteBuffer);
        ByteBuffer byteBuffer2 = byteBuffer;
        return new yx(b(new i50(byteBuffer2.array(), byteBuffer2.limit())));
    }

    public fy b(i50 i50) {
        String t = i50.t();
        q40.e(t);
        String t2 = i50.t();
        q40.e(t2);
        return new fy(t, t2, i50.B(), i50.B(), Arrays.copyOfRange(i50.a, i50.c(), i50.d()));
    }
}
