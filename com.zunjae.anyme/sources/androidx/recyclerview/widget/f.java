package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class f {
    private static final Comparator<C0050f> a = new a();

    static class a implements Comparator<C0050f> {
        a() {
        }

        /* renamed from: a */
        public int compare(C0050f fVar, C0050f fVar2) {
            int i = fVar.a - fVar2.a;
            return i == 0 ? fVar.b - fVar2.b : i;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {
        private final List<C0050f> a;
        private final int[] b;
        private final int[] c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;

        c(b bVar, List<C0050f> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.c, 0);
            this.d = bVar;
            this.e = bVar.e();
            this.f = bVar.d();
            this.g = z;
            a();
            h();
        }

        private void a() {
            C0050f fVar = this.a.isEmpty() ? null : this.a.get(0);
            if (fVar == null || fVar.a != 0 || fVar.b != 0) {
                C0050f fVar2 = new C0050f();
                fVar2.a = 0;
                fVar2.b = 0;
                fVar2.d = false;
                fVar2.c = 0;
                fVar2.e = false;
                this.a.add(0, fVar2);
            }
        }

        private void b(List<d> list, l lVar, int i, int i2, int i3) {
            if (!this.g) {
                lVar.b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.c[i5] & 31;
                if (i6 == 0) {
                    lVar.b(i, 1);
                    for (d dVar : list) {
                        dVar.b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.c[i5] >> 5;
                    lVar.a(j(list, i7, true).b, i);
                    if (i6 == 4) {
                        lVar.d(i, 1, this.d.c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new d(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        private void c(List<d> list, l lVar, int i, int i2, int i3) {
            if (!this.g) {
                lVar.c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.b[i5] & 31;
                if (i6 == 0) {
                    lVar.c(i + i4, 1);
                    for (d dVar : list) {
                        dVar.b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.b[i5] >> 5;
                    d j = j(list, i7, false);
                    lVar.a(i + i4, j.b - 1);
                    if (i6 == 4) {
                        lVar.d(j.b - 1, 1, this.d.c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new d(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        private void f(int i, int i2, int i3) {
            if (this.b[i - 1] == 0) {
                g(i, i2, i3, false);
            }
        }

        private boolean g(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0050f fVar = this.a.get(i3);
                int i6 = fVar.a;
                int i7 = fVar.c;
                int i8 = i6 + i7;
                int i9 = fVar.b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.d.b(i11, i5)) {
                            if (!this.d.a(i11, i5)) {
                                i10 = 4;
                            }
                            this.c[i5] = (i11 << 5) | 16;
                            this.b[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.d.b(i5, i12)) {
                            if (!this.d.a(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.b[i13] = (i12 << 5) | 16;
                            this.c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = fVar.a;
                i2 = fVar.b;
                i3--;
            }
            return false;
        }

        private void h() {
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                C0050f fVar = this.a.get(size);
                int i3 = fVar.a;
                int i4 = fVar.c;
                int i5 = i3 + i4;
                int i6 = fVar.b + i4;
                if (this.g) {
                    while (i > i5) {
                        f(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        i(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < fVar.c; i7++) {
                    int i8 = fVar.a + i7;
                    int i9 = fVar.b + i7;
                    int i10 = this.d.a(i8, i9) ? 1 : 2;
                    this.b[i8] = (i9 << 5) | i10;
                    this.c[i9] = (i8 << 5) | i10;
                }
                i = fVar.a;
                i2 = fVar.b;
            }
        }

        private void i(int i, int i2, int i3) {
            if (this.c[i2 - 1] == 0) {
                g(i, i2, i3, true);
            }
        }

        private static d j(List<d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                d dVar = list.get(size);
                if (dVar.a == i && dVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).b += z ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        public void d(l lVar) {
            c cVar = lVar instanceof c ? (c) lVar : new c(lVar);
            ArrayList arrayList = new ArrayList();
            int i = this.e;
            int i2 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                C0050f fVar = this.a.get(size);
                int i3 = fVar.c;
                int i4 = fVar.a + i3;
                int i5 = fVar.b + i3;
                if (i4 < i) {
                    c(arrayList, cVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    b(arrayList, cVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.b;
                    int i7 = fVar.a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        cVar.d(i7 + i6, 1, this.d.c(i7 + i6, fVar.b + i6));
                    }
                }
                i = fVar.a;
                i2 = fVar.b;
            }
            cVar.e();
        }

        public void e(RecyclerView.g gVar) {
            d(new b(gVar));
        }
    }

    private static class d {
        int a;
        int b;
        boolean c;

        public d(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    static class e {
        int a;
        int b;
        int c;
        int d;

        public e() {
        }

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f  reason: collision with other inner class name */
    static class C0050f {
        int a;
        int b;
        int c;
        boolean d;
        boolean e;

        C0050f() {
        }
    }

    public static c a(b bVar) {
        return b(bVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.f.c b(androidx.recyclerview.widget.f.b r15, boolean r16) {
        /*
            int r0 = r15.e()
            int r1 = r15.d()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.f$e r3 = new androidx.recyclerview.widget.f$e
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r3 = r3 + r0
            int r0 = r3 * 2
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.f$e r14 = (androidx.recyclerview.widget.f.e) r14
            int r6 = r14.a
            int r7 = r14.b
            int r8 = r14.c
            int r9 = r14.d
            r5 = r15
            r10 = r1
            r11 = r0
            r12 = r3
            androidx.recyclerview.widget.f$f r5 = c(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.c
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.a
            int r7 = r14.a
            int r6 = r6 + r7
            r5.a = r6
            int r6 = r5.b
            int r7 = r14.c
            int r6 = r6 + r7
            r5.b = r6
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x0074
            androidx.recyclerview.widget.f$e r6 = new androidx.recyclerview.widget.f$e
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r13.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r13.remove(r6)
            androidx.recyclerview.widget.f$e r6 = (androidx.recyclerview.widget.f.e) r6
        L_0x0080:
            int r7 = r14.a
            r6.a = r7
            int r7 = r14.c
            r6.c = r7
            boolean r7 = r5.e
            if (r7 == 0) goto L_0x0095
            int r7 = r5.a
        L_0x008e:
            r6.b = r7
            int r7 = r5.b
        L_0x0092:
            r6.d = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.d
            if (r7 == 0) goto L_0x009e
            int r7 = r5.a
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.a
            r6.b = r7
            int r7 = r5.b
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.e
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.d
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.a
            int r7 = r5.c
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.a
            int r7 = r5.c
            int r6 = r6 + r7
            r14.a = r6
            int r5 = r5.b
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.a
            int r7 = r5.c
            int r6 = r6 + r7
        L_0x00cc:
            r14.a = r6
            int r5 = r5.b
            int r5 = r5 + r7
        L_0x00d1:
            r14.c = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r13.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<androidx.recyclerview.widget.f$f> r2 = a
            java.util.Collections.sort(r4, r2)
            androidx.recyclerview.widget.f$c r8 = new androidx.recyclerview.widget.f$c
            r2 = r8
            r3 = r15
            r5 = r1
            r6 = r0
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.b(androidx.recyclerview.widget.f$b, boolean):androidx.recyclerview.widget.f$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:10:0x0033->B:33:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.f.C0050f c(androidx.recyclerview.widget.f.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r3 = r2[r5]
            r0.a = r3
            int r3 = r3 - r12
            r0.b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.c = r1
            r0.d = r14
            r13 = 0
            r0.e = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a0:
            r13 = 0
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = 1
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = 0
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.b(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r4 = r2[r3]
            r0.a = r4
            int r4 = r4 - r10
            r0.b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.c = r1
            r0.d = r14
            r3 = 1
            r0.e = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.c(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$f");
    }
}
