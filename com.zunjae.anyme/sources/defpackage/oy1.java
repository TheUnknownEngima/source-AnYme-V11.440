package defpackage;

import java.util.ArrayList;

/* renamed from: oy1  reason: default package */
public final class oy1 {
    public static final a c = new a((r62) null);
    private final int a;
    private final String b;

    /* renamed from: oy1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final ArrayList<oy1> a() {
            ArrayList<oy1> arrayList = new ArrayList<>();
            arrayList.add(new oy1(0, "Unrated", (r62) null));
            arrayList.add(new oy1(1, "Amagami SS", (r62) null));
            arrayList.add(new oy1(2, "Horrible", (r62) null));
            arrayList.add(new oy1(3, "Very Bad", (r62) null));
            arrayList.add(new oy1(4, "Bad", (r62) null));
            arrayList.add(new oy1(5, "Average", (r62) null));
            arrayList.add(new oy1(6, "Fine", (r62) null));
            arrayList.add(new oy1(7, "Good", (r62) null));
            arrayList.add(new oy1(8, "Very Good", (r62) null));
            arrayList.add(new oy1(9, "Great", (r62) null));
            arrayList.add(new oy1(10, "Masterpiece", (r62) null));
            return arrayList;
        }
    }

    private oy1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ oy1(int i, String str, r62 r62) {
        this(i, str);
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public String toString() {
        return '(' + this.a + ") " + this.b;
    }
}
