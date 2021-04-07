package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.nodes.h;

/* renamed from: zf2  reason: default package */
abstract class zf2 extends bg2 {
    final ArrayList<bg2> a;
    int b;

    /* renamed from: zf2$a */
    static final class a extends zf2 {
        a(Collection<bg2> collection) {
            super(collection);
        }

        a(bg2... bg2Arr) {
            this((Collection<bg2>) Arrays.asList(bg2Arr));
        }

        public boolean a(h hVar, h hVar2) {
            for (int i = 0; i < this.b; i++) {
                if (!this.a.get(i).a(hVar, hVar2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return if2.g(this.a, " ");
        }
    }

    /* renamed from: zf2$b */
    static final class b extends zf2 {
        b() {
        }

        b(Collection<bg2> collection) {
            if (this.b > 1) {
                this.a.add(new a(collection));
            } else {
                this.a.addAll(collection);
            }
            d();
        }

        b(bg2... bg2Arr) {
            this((Collection<bg2>) Arrays.asList(bg2Arr));
        }

        public boolean a(h hVar, h hVar2) {
            for (int i = 0; i < this.b; i++) {
                if (this.a.get(i).a(hVar, hVar2)) {
                    return true;
                }
            }
            return false;
        }

        public void e(bg2 bg2) {
            this.a.add(bg2);
            d();
        }

        public String toString() {
            return String.format(":or%s", new Object[]{this.a});
        }
    }

    zf2() {
        this.b = 0;
        this.a = new ArrayList<>();
    }

    zf2(Collection<bg2> collection) {
        this();
        this.a.addAll(collection);
        d();
    }

    /* access modifiers changed from: package-private */
    public void b(bg2 bg2) {
        this.a.set(this.b - 1, bg2);
    }

    /* access modifiers changed from: package-private */
    public bg2 c() {
        int i = this.b;
        if (i > 0) {
            return this.a.get(i - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.b = this.a.size();
    }
}
