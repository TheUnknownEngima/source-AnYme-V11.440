package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class e extends v {

    class a extends Transition.e {
        final /* synthetic */ Rect a;

        a(e eVar, Rect rect) {
            this.a = rect;
        }

        public Rect a(Transition transition) {
            return this.a;
        }
    }

    class b implements Transition.f {
        final /* synthetic */ View e;
        final /* synthetic */ ArrayList f;

        b(e eVar, View view, ArrayList arrayList) {
            this.e = view;
            this.f = arrayList;
        }

        public void a(Transition transition) {
        }

        public void b(Transition transition) {
        }

        public void c(Transition transition) {
            transition.h0(this);
            this.e.setVisibility(8);
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f.get(i)).setVisibility(0);
            }
        }

        public void d(Transition transition) {
        }

        public void e(Transition transition) {
        }
    }

    class c extends t {
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ Object g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;
        final /* synthetic */ ArrayList j;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.e = obj;
            this.f = arrayList;
            this.g = obj2;
            this.h = arrayList2;
            this.i = obj3;
            this.j = arrayList3;
        }

        public void a(Transition transition) {
            Object obj = this.e;
            if (obj != null) {
                e.this.q(obj, this.f, (ArrayList<View>) null);
            }
            Object obj2 = this.g;
            if (obj2 != null) {
                e.this.q(obj2, this.h, (ArrayList<View>) null);
            }
            Object obj3 = this.i;
            if (obj3 != null) {
                e.this.q(obj3, this.j, (ArrayList<View>) null);
            }
        }

        public void c(Transition transition) {
            transition.h0(this);
        }
    }

    class d extends Transition.e {
        final /* synthetic */ Rect a;

        d(e eVar, Rect rect) {
            this.a = rect;
        }

        public Rect a(Transition transition) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    private static boolean C(Transition transition) {
        return !v.l(transition.K()) || !v.l(transition.L()) || !v.l(transition.O());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.P().clear();
            transitionSet.P().addAll(arrayList2);
            q(transitionSet, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.z0((Transition) obj);
        return transitionSet;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).c(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int D0 = transitionSet.D0();
                while (i < D0) {
                    b(transitionSet.C0(i), arrayList);
                    i++;
                }
            } else if (!C(transition) && v.l(transition.P())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.c(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        u.a(viewGroup, (Transition) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.z0(transition);
            transitionSet.z0(transition2);
            transitionSet.I0(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.z0(transition);
        }
        transitionSet2.z0(transition3);
        return transitionSet2;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.z0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.z0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.z0((Transition) obj3);
        }
        return transitionSet;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).i0(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int D0 = transitionSet.D0();
            while (i < D0) {
                q(transitionSet.C0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!C(transition)) {
            List<View> P = transition.P();
            if (P.size() == arrayList.size() && P.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    transition.c(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.i0(arrayList.get(size2));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).b(new b(this, view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).p0(new d(this, rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).p0(new a(this, rect));
        }
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> P = transitionSet.P();
        P.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v.d(P, arrayList.get(i));
        }
        P.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }
}
