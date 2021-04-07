package defpackage;

/* renamed from: oz1  reason: default package */
public final class oz1 {
    private final String a;
    private final String b;

    public oz1(String str, String str2) {
        v62.e(str, "title");
        v62.e(str2, "link");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz1)) {
            return false;
        }
        oz1 oz1 = (oz1) obj;
        return v62.a(this.a, oz1.a) && v62.a(this.b, oz1.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.a;
    }
}
