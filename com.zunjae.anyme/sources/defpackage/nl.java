package defpackage;

@Deprecated
/* renamed from: nl  reason: default package */
public abstract class nl<Z> extends gl<Z> {
    private final int f;
    private final int g;

    public nl(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public void d(ol olVar) {
    }

    public final void j(ol olVar) {
        if (km.s(this.f, this.g)) {
            olVar.e(this.f, this.g);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f + " and height: " + this.g + ", either provide dimensions in the constructor or call override()");
    }
}
