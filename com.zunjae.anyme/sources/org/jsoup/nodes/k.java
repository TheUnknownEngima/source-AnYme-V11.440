package org.jsoup.nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.nodes.f;

public abstract class k implements Cloneable {
    private static final List<k> j = Collections.emptyList();
    k e;
    List<k> f;
    b g;
    String h;
    int i;

    class a implements dg2 {
        final /* synthetic */ String a;

        a(k kVar, String str) {
            this.a = str;
        }

        public void a(k kVar, int i) {
            kVar.h = this.a;
        }

        public void b(k kVar, int i) {
        }
    }

    private static class b implements dg2 {
        private Appendable a;
        private f.a b;

        b(Appendable appendable, f.a aVar) {
            this.a = appendable;
            this.b = aVar;
        }

        public void a(k kVar, int i) {
            try {
                kVar.B(this.a, i, this.b);
            } catch (IOException e) {
                throw new ef2(e);
            }
        }

        public void b(k kVar, int i) {
            if (!kVar.x().equals("#text")) {
                try {
                    kVar.C(this.a, i, this.b);
                } catch (IOException e) {
                    throw new ef2(e);
                }
            }
        }
    }

    protected k() {
        this.f = j;
        this.g = null;
    }

    protected k(String str) {
        this(str, new b());
    }

    protected k(String str, b bVar) {
        jf2.j(str);
        jf2.j(bVar);
        this.f = j;
        this.h = str.trim();
        this.g = bVar;
    }

    private void I(int i2) {
        while (i2 < this.f.size()) {
            this.f.get(i2).T(i2);
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public void A(Appendable appendable) {
        new cg2(new b(appendable, t())).a(this);
    }

    /* access modifiers changed from: package-private */
    public abstract void B(Appendable appendable, int i2, f.a aVar);

    /* access modifiers changed from: package-private */
    public abstract void C(Appendable appendable, int i2, f.a aVar);

    public f D() {
        k P = P();
        if (P instanceof f) {
            return (f) P;
        }
        return null;
    }

    public k G() {
        return this.e;
    }

    public final k H() {
        return this.e;
    }

    public void K() {
        jf2.j(this.e);
        this.e.L(this);
    }

    /* access modifiers changed from: protected */
    public void L(k kVar) {
        jf2.d(kVar.e == this);
        int i2 = kVar.i;
        this.f.remove(i2);
        I(i2);
        kVar.e = null;
    }

    /* access modifiers changed from: protected */
    public void O(k kVar) {
        k kVar2 = kVar.e;
        if (kVar2 != null) {
            kVar2.L(kVar);
        }
        kVar.S(this);
    }

    public k P() {
        k kVar = this;
        while (true) {
            k kVar2 = kVar.e;
            if (kVar2 == null) {
                return kVar;
            }
            kVar = kVar2;
        }
    }

    public void R(String str) {
        jf2.j(str);
        W(new a(this, str));
    }

    /* access modifiers changed from: protected */
    public void S(k kVar) {
        k kVar2 = this.e;
        if (kVar2 != null) {
            kVar2.L(this);
        }
        this.e = kVar;
    }

    /* access modifiers changed from: protected */
    public void T(int i2) {
        this.i = i2;
    }

    public int U() {
        return this.i;
    }

    public List<k> V() {
        k kVar = this.e;
        if (kVar == null) {
            return Collections.emptyList();
        }
        List<k> list = kVar.f;
        ArrayList arrayList = new ArrayList(list.size() - 1);
        for (k next : list) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public k W(dg2 dg2) {
        jf2.j(dg2);
        new cg2(dg2).a(this);
        return this;
    }

    public String b(String str) {
        jf2.h(str);
        return !u(str) ? "" : if2.j(this.h, d(str));
    }

    /* access modifiers changed from: protected */
    public void c(int i2, k... kVarArr) {
        jf2.f(kVarArr);
        s();
        for (int length = kVarArr.length - 1; length >= 0; length--) {
            k kVar = kVarArr[length];
            O(kVar);
            this.f.add(i2, kVar);
            I(i2);
        }
    }

    public String d(String str) {
        jf2.j(str);
        String n = this.g.n(str);
        return n.length() > 0 ? n : str.toLowerCase().startsWith("abs:") ? b(str.substring(4)) : "";
    }

    public k e(String str, String str2) {
        this.g.u(str, str2);
        return this;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public b f() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public k j(k kVar) {
        jf2.j(kVar);
        jf2.j(this.e);
        this.e.c(this.i, kVar);
        return this;
    }

    public k n(int i2) {
        return this.f.get(i2);
    }

    public final int o() {
        return this.f.size();
    }

    public List<k> p() {
        return Collections.unmodifiableList(this.f);
    }

    /* renamed from: q */
    public k clone() {
        k r = r((k) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(r);
        while (!linkedList.isEmpty()) {
            k kVar = (k) linkedList.remove();
            for (int i2 = 0; i2 < kVar.f.size(); i2++) {
                k r2 = kVar.f.get(i2).r(kVar);
                kVar.f.set(i2, r2);
                linkedList.add(r2);
            }
        }
        return r;
    }

    /* access modifiers changed from: protected */
    public k r(k kVar) {
        try {
            k kVar2 = (k) super.clone();
            kVar2.e = kVar;
            kVar2.i = kVar == null ? 0 : this.i;
            b bVar = this.g;
            kVar2.g = bVar != null ? bVar.clone() : null;
            kVar2.h = this.h;
            kVar2.f = new ArrayList(this.f.size());
            for (k add : this.f) {
                kVar2.f.add(add);
            }
            return kVar2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void s() {
        if (this.f == j) {
            this.f = new ArrayList(4);
        }
    }

    /* access modifiers changed from: package-private */
    public f.a t() {
        f D = D();
        if (D == null) {
            D = new f("");
        }
        return D.I0();
    }

    public String toString() {
        return y();
    }

    public boolean u(String str) {
        jf2.j(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (this.g.p(substring) && !b(substring).equals("")) {
                return true;
            }
        }
        return this.g.p(str);
    }

    /* access modifiers changed from: protected */
    public void v(Appendable appendable, int i2, f.a aVar) {
        appendable.append("\n").append(if2.i(i2 * aVar.j()));
    }

    public k w() {
        k kVar = this.e;
        if (kVar == null) {
            return null;
        }
        List<k> list = kVar.f;
        int i2 = this.i + 1;
        if (list.size() > i2) {
            return list.get(i2);
        }
        return null;
    }

    public abstract String x();

    public String y() {
        StringBuilder sb = new StringBuilder(128);
        A(sb);
        return sb.toString();
    }
}
