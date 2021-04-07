package defpackage;

import android.graphics.Bitmap;
import androidx.core.app.h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a12  reason: default package */
public abstract class a12 {

    /* renamed from: a12$a */
    public static final class a extends a12 implements e, f {
        private CharSequence a;
        private CharSequence b;
        private Bitmap c;
        private CharSequence d;
        private Bitmap e;

        public a() {
            this((CharSequence) null, (CharSequence) null, (Bitmap) null, (CharSequence) null, (Bitmap) null, 31, (r62) null);
        }

        public a(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, CharSequence charSequence3, Bitmap bitmap2) {
            super((r62) null);
            this.a = charSequence;
            this.b = charSequence2;
            this.c = bitmap;
            this.d = charSequence3;
            this.e = bitmap2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.CharSequence r5, java.lang.CharSequence r6, android.graphics.Bitmap r7, java.lang.CharSequence r8, android.graphics.Bitmap r9, int r10, defpackage.r62 r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = r0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = r0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r1
                r8 = r2
                r9 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.a.<init>(java.lang.CharSequence, java.lang.CharSequence, android.graphics.Bitmap, java.lang.CharSequence, android.graphics.Bitmap, int, r62):void");
        }

        public Bitmap a() {
            return this.c;
        }

        public CharSequence b() {
            return this.b;
        }

        public CharSequence c() {
            return this.d;
        }

        public final Bitmap d() {
            return this.e;
        }

        public void e(CharSequence charSequence) {
            this.d = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(getTitle(), aVar.getTitle()) && v62.a(b(), aVar.b()) && v62.a(a(), aVar.a()) && v62.a(c(), aVar.c()) && v62.a(this.e, aVar.e);
        }

        public final void f(Bitmap bitmap) {
            this.e = bitmap;
        }

        public void g(CharSequence charSequence) {
            this.b = charSequence;
        }

        public CharSequence getTitle() {
            return this.a;
        }

        public void h(CharSequence charSequence) {
            this.a = charSequence;
        }

        public int hashCode() {
            CharSequence title = getTitle();
            int i = 0;
            int hashCode = (title != null ? title.hashCode() : 0) * 31;
            CharSequence b2 = b();
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            Bitmap a2 = a();
            int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
            CharSequence c2 = c();
            int hashCode4 = (hashCode3 + (c2 != null ? c2.hashCode() : 0)) * 31;
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                i = bitmap.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            return "BigPicture(title=" + getTitle() + ", text=" + b() + ", largeIcon=" + a() + ", expandedText=" + c() + ", image=" + this.e + ")";
        }
    }

    /* renamed from: a12$b */
    public static final class b extends a12 implements e, f {
        private CharSequence a;
        private CharSequence b;
        private Bitmap c;
        private CharSequence d;
        private CharSequence e;

        public b() {
            this((CharSequence) null, (CharSequence) null, (Bitmap) null, (CharSequence) null, (CharSequence) null, 31, (r62) null);
        }

        public b(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, CharSequence charSequence3, CharSequence charSequence4) {
            super((r62) null);
            this.a = charSequence;
            this.b = charSequence2;
            this.c = bitmap;
            this.d = charSequence3;
            this.e = charSequence4;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ b(java.lang.CharSequence r5, java.lang.CharSequence r6, android.graphics.Bitmap r7, java.lang.CharSequence r8, java.lang.CharSequence r9, int r10, defpackage.r62 r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = r0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = r0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r1
                r8 = r2
                r9 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.a12.b.<init>(java.lang.CharSequence, java.lang.CharSequence, android.graphics.Bitmap, java.lang.CharSequence, java.lang.CharSequence, int, r62):void");
        }

        public Bitmap a() {
            return this.c;
        }

        public CharSequence b() {
            return this.b;
        }

        public final CharSequence c() {
            return this.e;
        }

        public CharSequence d() {
            return this.d;
        }

        public final void e(CharSequence charSequence) {
            this.e = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v62.a(getTitle(), bVar.getTitle()) && v62.a(b(), bVar.b()) && v62.a(a(), bVar.a()) && v62.a(d(), bVar.d()) && v62.a(this.e, bVar.e);
        }

        public void f(CharSequence charSequence) {
            this.d = charSequence;
        }

        public void g(CharSequence charSequence) {
            this.b = charSequence;
        }

        public CharSequence getTitle() {
            return this.a;
        }

        public void h(CharSequence charSequence) {
            this.a = charSequence;
        }

        public int hashCode() {
            CharSequence title = getTitle();
            int i = 0;
            int hashCode = (title != null ? title.hashCode() : 0) * 31;
            CharSequence b2 = b();
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            Bitmap a2 = a();
            int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
            CharSequence d2 = d();
            int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
            CharSequence charSequence = this.e;
            if (charSequence != null) {
                i = charSequence.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            return "BigText(title=" + getTitle() + ", text=" + b() + ", largeIcon=" + a() + ", expandedText=" + d() + ", bigText=" + this.e + ")";
        }
    }

    /* renamed from: a12$c */
    public static final class c extends a12 implements e, f {
        private CharSequence a;
        private CharSequence b;
        private Bitmap c;

        public c() {
            this((CharSequence) null, (CharSequence) null, (Bitmap) null, 7, (r62) null);
        }

        public c(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap) {
            super((r62) null);
            this.a = charSequence;
            this.b = charSequence2;
            this.c = bitmap;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, int i, r62 r62) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : bitmap);
        }

        public Bitmap a() {
            return this.c;
        }

        public CharSequence b() {
            return this.b;
        }

        public void c(CharSequence charSequence) {
            this.b = charSequence;
        }

        public void d(CharSequence charSequence) {
            this.a = charSequence;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return v62.a(getTitle(), cVar.getTitle()) && v62.a(b(), cVar.b()) && v62.a(a(), cVar.a());
        }

        public CharSequence getTitle() {
            return this.a;
        }

        public int hashCode() {
            CharSequence title = getTitle();
            int i = 0;
            int hashCode = (title != null ? title.hashCode() : 0) * 31;
            CharSequence b2 = b();
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            Bitmap a2 = a();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Default(title=" + getTitle() + ", text=" + b() + ", largeIcon=" + a() + ")";
        }
    }

    /* renamed from: a12$d */
    public static final class d extends a12 implements f {
        private Bitmap a;
        private CharSequence b;
        private CharSequence c;
        private List<h.C0020h.a> d;

        public d() {
            this((Bitmap) null, (CharSequence) null, (CharSequence) null, (List) null, 15, (r62) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, CharSequence charSequence, CharSequence charSequence2, List<h.C0020h.a> list) {
            super((r62) null);
            v62.f(charSequence2, "userDisplayName");
            v62.f(list, "messages");
            this.a = bitmap;
            this.b = charSequence;
            this.c = charSequence2;
            this.d = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(Bitmap bitmap, CharSequence charSequence, String str, List list, int i, r62 r62) {
            this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? new ArrayList() : list);
        }

        public Bitmap a() {
            return this.a;
        }

        public final CharSequence c() {
            return this.b;
        }

        public final List<h.C0020h.a> d() {
            return this.d;
        }

        public final CharSequence e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return v62.a(a(), dVar.a()) && v62.a(this.b, dVar.b) && v62.a(this.c, dVar.c) && v62.a(this.d, dVar.d);
        }

        public int hashCode() {
            Bitmap a2 = a();
            int i = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
            CharSequence charSequence = this.b;
            int hashCode2 = (hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
            CharSequence charSequence2 = this.c;
            int hashCode3 = (hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
            List<h.C0020h.a> list = this.d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "Message(largeIcon=" + a() + ", conversationTitle=" + this.b + ", userDisplayName=" + this.c + ", messages=" + this.d + ")";
        }
    }

    /* renamed from: a12$e */
    public interface e {
        CharSequence b();

        CharSequence getTitle();
    }

    /* renamed from: a12$f */
    public interface f {
        Bitmap a();
    }

    /* renamed from: a12$g */
    public static final class g extends a12 implements e, f {
        private CharSequence a;
        private CharSequence b;
        private Bitmap c;
        private List<? extends CharSequence> d;

        public g() {
            this((CharSequence) null, (CharSequence) null, (Bitmap) null, (List) null, 15, (r62) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, List<? extends CharSequence> list) {
            super((r62) null);
            v62.f(list, "lines");
            this.a = charSequence;
            this.b = charSequence2;
            this.c = bitmap;
            this.d = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, List list, int i, r62 r62) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : bitmap, (i & 8) != 0 ? new ArrayList() : list);
        }

        public Bitmap a() {
            return this.c;
        }

        public CharSequence b() {
            return this.b;
        }

        public final List<CharSequence> c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return v62.a(getTitle(), gVar.getTitle()) && v62.a(b(), gVar.b()) && v62.a(a(), gVar.a()) && v62.a(this.d, gVar.d);
        }

        public CharSequence getTitle() {
            return this.a;
        }

        public int hashCode() {
            CharSequence title = getTitle();
            int i = 0;
            int hashCode = (title != null ? title.hashCode() : 0) * 31;
            CharSequence b2 = b();
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            Bitmap a2 = a();
            int hashCode3 = (hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31;
            List<? extends CharSequence> list = this.d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "TextList(title=" + getTitle() + ", text=" + b() + ", largeIcon=" + a() + ", lines=" + this.d + ")";
        }
    }

    private a12() {
    }

    public /* synthetic */ a12(r62 r62) {
        this();
    }
}
