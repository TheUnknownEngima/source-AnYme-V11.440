package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class u {
    private static Transition a = new AutoTransition();
    private static ThreadLocal<WeakReference<b0<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        Transition e;
        ViewGroup f;

        /* renamed from: androidx.transition.u$a$a  reason: collision with other inner class name */
        class C0059a extends t {
            final /* synthetic */ b0 e;

            C0059a(b0 b0Var) {
                this.e = b0Var;
            }

            public void c(Transition transition) {
                ((ArrayList) this.e.get(a.this.f)).remove(transition);
                transition.h0(this);
            }
        }

        a(Transition transition, ViewGroup viewGroup) {
            this.e = transition;
            this.f = viewGroup;
        }

        private void a() {
            this.f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!u.c.remove(this.f)) {
                return true;
            }
            b0<ViewGroup, ArrayList<Transition>> b = u.b();
            ArrayList arrayList = b.get(this.f);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.e);
            this.e.b(new C0059a(b));
            this.e.q(this.f, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).k0(this.f);
                }
            }
            this.e.g0(this.f);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            u.c.remove(this.f);
            ArrayList arrayList = u.b().get(this.f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).k0(this.f);
                }
            }
            this.e.r(true);
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (!c.contains(viewGroup) && o4.O(viewGroup)) {
            c.add(viewGroup);
            if (transition == null) {
                transition = a;
            }
            Transition s = transition.clone();
            d(viewGroup, s);
            q.c(viewGroup, (q) null);
            c(viewGroup, s);
        }
    }

    static b0<ViewGroup, ArrayList<Transition>> b() {
        b0<ViewGroup, ArrayList<Transition>> b0Var;
        WeakReference weakReference = b.get();
        if (weakReference != null && (b0Var = (b0) weakReference.get()) != null) {
            return b0Var;
        }
        b0<ViewGroup, ArrayList<Transition>> b0Var2 = new b0<>();
        b.set(new WeakReference(b0Var2));
        return b0Var2;
    }

    private static void c(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            a aVar = new a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).f0(viewGroup);
            }
        }
        if (transition != null) {
            transition.q(viewGroup, true);
        }
        q b2 = q.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
