package kotlinx.coroutines;

final class y0 implements j1 {
    private final boolean e;

    public y0(boolean z) {
        this.e = z;
    }

    public a2 a() {
        return null;
    }

    public boolean b() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
