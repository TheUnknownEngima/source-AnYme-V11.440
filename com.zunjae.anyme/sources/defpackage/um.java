package defpackage;

/* renamed from: um  reason: default package */
final class um<T> extends wm<T> {
    private final Integer a;
    private final T b;
    private final xm c;

    um(Integer num, T t, xm xmVar) {
        this.a = num;
        if (t != null) {
            this.b = t;
            if (xmVar != null) {
                this.c = xmVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.a;
    }

    public T b() {
        return this.b;
    }

    public xm c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        Integer num = this.a;
        if (num != null ? num.equals(wmVar.a()) : wmVar.a() == null) {
            return this.b.equals(wmVar.b()) && this.c.equals(wmVar.c());
        }
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
