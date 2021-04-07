package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: hy  reason: default package */
public final class hy {
    private final ByteArrayOutputStream a = new ByteArrayOutputStream(512);
    private final DataOutputStream b = new DataOutputStream(this.a);

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void c(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }

    public byte[] a(fy fyVar) {
        this.a.reset();
        try {
            b(this.b, fyVar.e);
            b(this.b, fyVar.f != null ? fyVar.f : "");
            c(this.b, fyVar.g);
            c(this.b, fyVar.h);
            this.b.write(fyVar.i);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
