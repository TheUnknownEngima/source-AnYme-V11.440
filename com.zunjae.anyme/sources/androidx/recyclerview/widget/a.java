package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

class a implements m.a {
    private r3<b> a;
    final ArrayList<b> b;
    final ArrayList<b> c;
    final C0048a d;
    Runnable e;
    final boolean f;
    final m g;
    private int h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    interface C0048a {
        void a(int i, int i2);

        void b(b bVar);

        void c(int i, int i2, Object obj);

        void d(b bVar);

        RecyclerView.c0 e(int i);

        void f(int i, int i2);

        void g(int i, int i2);

        void h(int i, int i2);
    }

    static class b {
        int a;
        int b;
        Object c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i = this.a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            Object obj3 = bVar.c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
        }
    }

    a(C0048a aVar) {
        this(aVar, false);
    }

    a(C0048a aVar, boolean z) {
        this.a = new s3(30);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.h = 0;
        this.d = aVar;
        this.f = z;
        this.g = new m(this);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c2;
        boolean z;
        boolean z2;
        int i = bVar.b;
        int i2 = bVar.d + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.d.e(i3) != null || h(i3)) {
                if (c3 == 0) {
                    k(b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    v(b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c3 = c2;
        }
        if (i4 != bVar.d) {
            a(bVar);
            bVar = b(2, i, i4, (Object) null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i = bVar.b;
        int i2 = bVar.d + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.d.e(i) != null || h(i)) {
                if (c2 == 0) {
                    k(b(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    v(b(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.c;
            a(bVar);
            bVar = b(4, i3, i4, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (n(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z = z(bVar.b, i2);
        int i3 = bVar.b;
        int i4 = bVar.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int z2 = z(bVar.b + (i * i6), bVar.a);
            int i7 = bVar.a;
            if (i7 == 2 ? z2 == z : i7 == 4 && z2 == z + 1) {
                i5++;
            } else {
                b b2 = b(bVar.a, z, i5, bVar.c);
                l(b2, i3);
                a(b2);
                if (bVar.a == 4) {
                    i3 += i5;
                }
                z = z2;
                i5 = 1;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i5 > 0) {
            b b3 = b(bVar.a, z, i5, obj);
            l(b3, i3);
            a(b3);
        }
    }

    private void v(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.d.g(bVar.b, bVar.d);
        } else if (i == 2) {
            this.d.f(bVar.b, bVar.d);
        } else if (i == 4) {
            this.d.c(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            this.d.a(bVar.b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i7 = bVar.a;
            if (i7 == 8) {
                int i8 = bVar.b;
                int i9 = bVar.d;
                if (i8 >= i9) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                if (i < i8 || i > i9) {
                    int i11 = bVar.b;
                    if (i < i11) {
                        if (i2 == 1) {
                            bVar.b = i11 + 1;
                            i4 = bVar.d + 1;
                        } else if (i2 == 2) {
                            bVar.b = i11 - 1;
                            i4 = bVar.d - 1;
                        }
                        bVar.d = i4;
                    }
                } else {
                    int i12 = bVar.b;
                    if (i8 == i12) {
                        if (i2 == 1) {
                            i6 = bVar.d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.d - 1;
                            }
                            i++;
                        }
                        bVar.d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i12 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i12 - 1;
                            }
                            i--;
                        }
                        bVar.b = i5;
                        i--;
                    }
                }
            } else {
                int i13 = bVar.b;
                if (i13 > i) {
                    if (i2 == 1) {
                        i3 = i13 + 1;
                    } else if (i2 == 2) {
                        i3 = i13 - 1;
                    }
                    bVar.b = i3;
                } else if (i7 == 1) {
                    i -= bVar.d;
                } else if (i7 == 2) {
                    i += bVar.d;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i14 = bVar2.d;
                if (i14 != bVar2.b && i14 >= 0) {
                }
            } else if (bVar2.d > 0) {
            }
            this.c.remove(size2);
            a(bVar2);
        }
        return i;
    }

    public void a(b bVar) {
        if (!this.f) {
            bVar.c = null;
            this.a.c(bVar);
        }
    }

    public b b(int i, int i2, int i3, Object obj) {
        b b2 = this.a.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.a = i;
        b2.b = i2;
        b2.d = i3;
        b2.c = obj;
        return b2;
    }

    public int e(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.b;
                    if (i4 <= i) {
                        int i5 = bVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.b;
                    if (i6 == i) {
                        i = bVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.d(this.c.get(i));
        }
        x(this.c);
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.d.d(bVar);
                this.d.g(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.d.d(bVar);
                this.d.h(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.d.d(bVar);
                this.d.c(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.d.d(bVar);
                this.d.a(bVar.b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.b);
        this.h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i) {
        this.d.b(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.d.h(i, bVar.d);
        } else if (i2 == 4) {
            this.d.c(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i) {
        return n(i, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i) {
        return (i & this.h) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(b(4, i, i2, obj));
        this.h |= 4;
        return this.b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(b(1, i, i2, (Object) null));
        this.h |= 1;
        return this.b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.b.add(b(8, i, i2, (Object) null));
            this.h |= 8;
            return this.b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.b.add(b(2, i, i2, (Object) null));
        this.h |= 2;
        return this.b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.g.b(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public void x(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        x(this.b);
        x(this.c);
        this.h = 0;
    }
}
