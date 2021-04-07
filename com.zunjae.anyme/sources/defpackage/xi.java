package defpackage;

/* renamed from: xi  reason: default package */
public class xi implements Cif<byte[]> {
    private final byte[] e;

    public xi(byte[] bArr) {
        jm.d(bArr);
        this.e = bArr;
    }

    public void a() {
    }

    /* renamed from: b */
    public byte[] get() {
        return this.e;
    }

    public int c() {
        return this.e.length;
    }

    public Class<byte[]> d() {
        return byte[].class;
    }
}
