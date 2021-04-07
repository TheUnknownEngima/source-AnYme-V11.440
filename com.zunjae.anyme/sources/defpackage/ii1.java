package defpackage;

import javax.annotation.Nonnull;

/* renamed from: ii1  reason: default package */
final class ii1 extends ni1 {
    private final String a;
    private final String b;

    ii1(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    public String b() {
        return this.a;
    }

    @Nonnull
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ni1)) {
            return false;
        }
        ni1 ni1 = (ni1) obj;
        return this.a.equals(ni1.b()) && this.b.equals(ni1.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
