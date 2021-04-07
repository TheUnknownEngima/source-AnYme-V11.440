package defpackage;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import defpackage.z5;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: y5  reason: default package */
class y5 extends x5 {
    static boolean c = false;
    private final n a;
    private final c b;

    /* renamed from: y5$a */
    public static class a<D> extends t<D> implements z5.a<D> {
        private final int k;
        private final Bundle l;
        private final z5<D> m;
        private n n;
        private b<D> o;
        private z5<D> p;

        /* access modifiers changed from: protected */
        public void i() {
            if (y5.c) {
                "  Starting: " + this;
            }
            this.m.f();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void j() {
            if (y5.c) {
                "  Stopping: " + this;
            }
            this.m.g();
        }

        public void l(u<? super D> uVar) {
            super.l(uVar);
            this.n = null;
            this.o = null;
        }

        public void m(D d) {
            super.m(d);
            z5<D> z5Var = this.p;
            if (z5Var != null) {
                z5Var.e();
                this.p = null;
            }
        }

        /* access modifiers changed from: package-private */
        public z5<D> n(boolean z) {
            if (y5.c) {
                "  Destroying: " + this;
            }
            this.m.b();
            this.m.a();
            b<D> bVar = this.o;
            if (bVar != null) {
                l(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.m.h(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.m;
            }
            this.m.e();
            return this.p;
        }

        public void o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            z5<D> z5Var = this.m;
            z5Var.d(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.o);
                b<D> bVar = this.o;
                bVar.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(p().c(d()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(f());
        }

        /* access modifiers changed from: package-private */
        public z5<D> p() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            n nVar = this.n;
            b<D> bVar = this.o;
            if (nVar != null && bVar != null) {
                super.l(bVar);
                g(nVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            n3.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: y5$b */
    static class b<D> implements u<D> {
        public abstract void b(String str, PrintWriter printWriter);

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract void d();
    }

    /* renamed from: y5$c */
    static class c extends a0 {
        private static final c0.a d = new a();
        private i0<a> c = new i0<>();

        /* renamed from: y5$c$a */
        static class a implements c0.a {
            a() {
            }

            public <T extends a0> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(d0 d0Var) {
            return (c) new c0(d0Var, d).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            int r = this.c.r();
            for (int i = 0; i < r; i++) {
                this.c.s(i).n(true);
            }
            this.c.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.c.r() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.c.r(); i++) {
                    a s = this.c.s(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.c.o(i));
                    printWriter.print(": ");
                    printWriter.println(s.toString());
                    s.o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            int r = this.c.r();
            for (int i = 0; i < r; i++) {
                this.c.s(i).q();
            }
        }
    }

    y5(n nVar, d0 d0Var) {
        this.a = nVar;
        this.b = c.g(d0Var);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.f(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        n3.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
