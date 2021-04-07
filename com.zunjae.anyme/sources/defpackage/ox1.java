package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: ox1  reason: default package */
public final class ox1 {
    @SerializedName("string")
    private final String a;
    @SerializedName("prop")
    private final a b;

    /* renamed from: ox1$a */
    public static final class a {
        @SerializedName("from")
        private final C0257a a;
        @SerializedName("to")
        private final C0257a b;

        /* renamed from: ox1$a$a  reason: collision with other inner class name */
        public static final class C0257a {
            @SerializedName("day")
            private final int a;
            @SerializedName("month")
            private final int b;
            @SerializedName("year")
            private final int c;

            public C0257a() {
                this(0, 0, 0, 7, (r62) null);
            }

            public C0257a(int i, int i2, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0257a(int i, int i2, int i3, int i4, r62 r62) {
                this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
            }

            public final int a() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0257a)) {
                    return false;
                }
                C0257a aVar = (C0257a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
            }

            public int hashCode() {
                return (((this.a * 31) + this.b) * 31) + this.c;
            }

            public String toString() {
                return "DMY(day=" + this.a + ", month=" + this.b + ", year=" + this.c + ")";
            }
        }

        public a() {
            this((C0257a) null, (C0257a) null, 3, (r62) null);
        }

        public a(C0257a aVar, C0257a aVar2) {
            v62.e(aVar, "from");
            v62.e(aVar2, "to");
            this.a = aVar;
            this.b = aVar2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C0257a aVar, C0257a aVar2, int i, r62 r62) {
            this((i & 1) != 0 ? new C0257a(0, 0, 0, 7, (r62) null) : aVar, (i & 2) != 0 ? new C0257a(0, 0, 0, 7, (r62) null) : aVar2);
        }

        public final C0257a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b);
        }

        public int hashCode() {
            C0257a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            C0257a aVar2 = this.b;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Prop(from=" + this.a + ", to=" + this.b + ")";
        }
    }

    public ox1() {
        this((String) null, (a) null, 3, (r62) null);
    }

    public ox1(String str, a aVar) {
        v62.e(str, "representation");
        v62.e(aVar, "prop");
        this.a = str;
        this.b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox1(String str, a aVar, int i, r62 r62) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new a((a.C0257a) null, (a.C0257a) null, 3, (r62) null) : aVar);
    }

    public final a a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox1)) {
            return false;
        }
        ox1 ox1 = (ox1) obj;
        return v62.a(this.a, ox1.a) && v62.a(this.b, ox1.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "JikanAired(representation=" + this.a + ", prop=" + this.b + ")";
    }
}
