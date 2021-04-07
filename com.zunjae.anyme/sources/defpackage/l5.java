package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: l5  reason: default package */
class l5 {

    /* renamed from: l5$a */
    public interface a<T> {
        void a(T t, Rect rect);
    }

    /* renamed from: l5$b */
    public interface b<T, V> {
        V a(T t, int i);

        int b(T t);
    }

    /* renamed from: l5$c */
    private static class c<T> implements Comparator<T> {
        private final Rect e = new Rect();
        private final Rect f = new Rect();
        private final boolean g;
        private final a<T> h;

        c(boolean z, a<T> aVar) {
            this.g = z;
            this.h = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.e;
            Rect rect2 = this.f;
            this.h.a(t, rect);
            this.h.a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.g ? 1 : -1;
            }
            if (i3 > i4) {
                return this.g ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.g ? 1 : -1;
            }
            if (i7 > i8) {
                return this.g ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b2 = b(i, rect, rect2);
        if (b(i, rect, rect3) || !b2) {
            return false;
        }
        return !j(i, rect, rect3) || i == 17 || i == 66 || k(i, rect, rect2) < m(i, rect, rect3);
    }

    private static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T c(L r7, defpackage.l5.b<L, T> r8, defpackage.l5.a<T> r9, T r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L_0x0038
            r1 = 33
            if (r12 == r1) goto L_0x002e
            r1 = 66
            if (r12 == r1) goto L_0x0026
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L_0x001e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x0034
        L_0x001e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L_0x0026:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x003e
        L_0x002e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L_0x0034:
            r0.offset(r2, r1)
            goto L_0x0041
        L_0x0038:
            int r1 = r11.width()
            int r1 = r1 + 1
        L_0x003e:
            r0.offset(r1, r2)
        L_0x0041:
            r1 = 0
            int r3 = r8.b(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L_0x004b:
            if (r2 >= r3) goto L_0x0064
            java.lang.Object r5 = r8.a(r7, r2)
            if (r5 != r10) goto L_0x0054
            goto L_0x0061
        L_0x0054:
            r9.a(r5, r4)
            boolean r6 = h(r12, r11, r4, r0)
            if (r6 == 0) goto L_0x0061
            r0.set(r4)
            r1 = r5
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5.c(java.lang.Object, l5$b, l5$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static <L, T> T d(L l, b<L, T> bVar, a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b2 = bVar.b(l);
        ArrayList arrayList = new ArrayList(b2);
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList.add(bVar.a(l, i2));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (i == 1) {
            return f(t, arrayList, z2);
        }
        if (i == 2) {
            return e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    private static boolean h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i)) {
            return false;
        }
        if (i(rect, rect3, i) && !a(i, rect, rect2, rect3)) {
            return !a(i, rect, rect3, rect2) && g(k(i, rect, rect2), o(i, rect, rect2)) < g(k(i, rect, rect3), o(i, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i, Rect rect, Rect rect2) {
        return Math.max(0, l(i, rect, rect2));
    }

    private static int l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int m(int i, Rect rect, Rect rect2) {
        return Math.max(1, n(i, rect, rect2));
    }

    private static int n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int o(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
