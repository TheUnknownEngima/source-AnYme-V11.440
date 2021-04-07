package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class r {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, p> b = new HashMap<>();

    r() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.o = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void d(int i) {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            p pVar = this.b.get(it.next().i);
            if (pVar != null) {
                pVar.r(i);
            }
        }
        for (p next : this.b.values()) {
            if (next != null) {
                next.r(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (p next : this.b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment i = next.i();
                    printWriter.println(i);
                    i.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        p pVar = this.b.get(str);
        if (pVar != null) {
            return pVar.i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.z == i) {
                return fragment;
            }
        }
        for (p next : this.b.values()) {
            if (next != null) {
                Fragment i2 = next.i();
                if (i2.z == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.B)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (p next : this.b.values()) {
            if (next != null) {
                Fragment i = next.i();
                if (str.equals(i.B)) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment l;
        for (p next : this.b.values()) {
            if (next != null && (l = next.i().l(str)) != null) {
                return l;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment j(Fragment fragment) {
        ViewGroup viewGroup = fragment.J;
        View view = fragment.K;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.a.get(indexOf);
                if (fragment2.J == viewGroup && fragment2.K != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> k() {
        ArrayList arrayList = new ArrayList();
        Iterator<p> it = this.b.values().iterator();
        while (it.hasNext()) {
            p next = it.next();
            arrayList.add(next != null ? next.i() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public p l(String str) {
        return this.b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> m() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void n(p pVar) {
        this.b.put(pVar.i().i, pVar);
    }

    /* access modifiers changed from: package-private */
    public void o(p pVar) {
        Fragment i = pVar.i();
        for (p next : this.b.values()) {
            if (next != null) {
                Fragment i2 = next.i();
                if (i.i.equals(i2.l)) {
                    i2.k = i;
                    i2.l = null;
                }
            }
        }
        this.b.put(i.i, (Object) null);
        String str = i.l;
        if (str != null) {
            i.k = f(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.o = false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.b.clear();
    }

    /* access modifiers changed from: package-private */
    public void r(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = f(next);
                if (f != null) {
                    if (k.s0(2)) {
                        "restoreSaveState: added (" + next + "): " + f;
                    }
                    a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<o> s() {
        ArrayList<o> arrayList = new ArrayList<>(this.b.size());
        for (p next : this.b.values()) {
            if (next != null) {
                Fragment i = next.i();
                o p = next.p();
                arrayList.add(p);
                if (k.s0(2)) {
                    "Saved state of " + i + ": " + p.q;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> t() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.i);
                if (k.s0(2)) {
                    "saveAllState: adding fragment (" + next.i + "): " + next;
                }
            }
            return arrayList;
        }
    }
}
