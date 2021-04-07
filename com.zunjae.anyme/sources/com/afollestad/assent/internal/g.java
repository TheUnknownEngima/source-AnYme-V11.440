package com.afollestad.assent.internal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;

public final class g extends Fragment {

    static final class a extends w62 implements d62<s, Context, u22> {
        final /* synthetic */ g f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(2);
            this.f = gVar;
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((s) obj, (Context) obj2);
            return u22.a;
        }

        public final void a(s sVar, Context context) {
            v62.f(sVar, "$receiver");
            v62.f(context, "it");
            sVar.m(this.f);
            sVar.p(this.f);
        }
    }

    static final class b extends w62 implements d62<s, Context, u22> {
        final /* synthetic */ g f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(2);
            this.f = gVar;
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            a((s) obj, (Context) obj2);
            return u22.a;
        }

        public final void a(s sVar, Context context) {
            v62.f(sVar, "$receiver");
            v62.f(context, "it");
            sVar.m(this.f);
            sVar.p(this.f);
        }
    }

    public void H0(int i, String[] strArr, int[] iArr) {
        v62.f(strArr, "permissions");
        v62.f(iArr, "grantResults");
        super.H0(i, strArr, iArr);
        h.a(this, strArr, iArr);
    }

    public final void J1() {
        if (F() != null) {
            e.a(this, "Detaching PermissionFragment from parent Fragment %s", F());
            Fragment F = F();
            if (F != null) {
                c.a(F, new a(this));
            }
        } else if (n() != null) {
            e.a(this, "Detaching PermissionFragment from Activity %s", n());
            FragmentActivity n = n();
            if (n != null) {
                c.b(n, new b(this));
            }
        }
    }

    public final void K1(f fVar) {
        v62.f(fVar, "request");
        e.a(this, "perform(%s)", fVar);
        l1(b.a(fVar.b()), fVar.c());
    }

    public void k0(Context context) {
        v62.f(context, "context");
        super.k0(context);
        e.a(this, "onAttach(%s)", context);
    }

    public void v0() {
        e.a(this, "onDetach()", new Object[0]);
        super.v0();
    }
}
