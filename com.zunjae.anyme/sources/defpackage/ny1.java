package defpackage;

import java.util.ArrayList;

/* renamed from: ny1  reason: default package */
public final class ny1 {
    public static final a c = new a((r62) null);
    private final String a;
    private final int b;

    /* renamed from: ny1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public static /* synthetic */ ArrayList b(a aVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            return aVar.a(z, z2);
        }

        public final ArrayList<ny1> a(boolean z, boolean z2) {
            ArrayList<ny1> arrayList = new ArrayList<>();
            arrayList.add(new ny1("Action", 1));
            arrayList.add(new ny1("Adventure", 2));
            arrayList.add(new ny1("Cars", 3));
            arrayList.add(new ny1("Comedy", 4));
            arrayList.add(new ny1("Dementia", 5));
            if (z) {
                arrayList.add(new ny1("Demons", 6));
            }
            arrayList.add(new ny1("Drama", 8));
            if (!z2) {
                arrayList.add(new ny1("Ecchi", 9));
            }
            arrayList.add(new ny1("Fantasy", 10));
            arrayList.add(new ny1("Game", 11));
            arrayList.add(new ny1("Harem", 35));
            if (z) {
                arrayList.add(new ny1("Hentai", 12));
            }
            arrayList.add(new ny1("Historical", 13));
            arrayList.add(new ny1("Horror", 14));
            arrayList.add(new ny1("Josei", 43));
            arrayList.add(new ny1("Kids", 15));
            arrayList.add(new ny1("Magic", 16));
            arrayList.add(new ny1("Martial Arts", 17));
            arrayList.add(new ny1("Mecha", 18));
            arrayList.add(new ny1("Military", 38));
            arrayList.add(new ny1("Music", 19));
            arrayList.add(new ny1("Mystery", 7));
            arrayList.add(new ny1("Parody", 20));
            arrayList.add(new ny1("Police", 39));
            arrayList.add(new ny1("Psychological", 40));
            arrayList.add(new ny1("Romance", 22));
            arrayList.add(new ny1("Samurai", 21));
            arrayList.add(new ny1("School", 23));
            arrayList.add(new ny1("Sci-Fi", 24));
            arrayList.add(new ny1("Seinen", 42));
            arrayList.add(new ny1("Shoujo", 25));
            arrayList.add(new ny1("Shoujo Ai", 26));
            arrayList.add(new ny1("Shounen", 27));
            arrayList.add(new ny1("Shounen Ai", 28));
            arrayList.add(new ny1("Slice of Life", 36));
            arrayList.add(new ny1("Space", 29));
            arrayList.add(new ny1("Sports", 30));
            arrayList.add(new ny1("Super Power", 31));
            arrayList.add(new ny1("Supernatural", 37));
            arrayList.add(new ny1("Thriller", 41));
            arrayList.add(new ny1("Vampire", 32));
            if (z) {
                arrayList.add(new ny1("Yaoi", 33));
                arrayList.add(new ny1("Yuri", 34));
            }
            return arrayList;
        }
    }

    public ny1(String str, int i) {
        v62.e(str, "name");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny1)) {
            return false;
        }
        ny1 ny1 = (ny1) obj;
        return v62.a(this.a, ny1.a) && this.b == ny1.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        return this.a;
    }
}
