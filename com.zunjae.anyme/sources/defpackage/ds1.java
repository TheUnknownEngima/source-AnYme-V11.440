package defpackage;

import com.afollestad.materialdialogs.f;
import com.google.firebase.messaging.FirebaseMessaging;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.kanon.e;

/* renamed from: ds1  reason: default package */
public final class ds1 {
    private final String a = "AnimeEpisode";

    /* renamed from: ds1$a */
    static final class a implements f.n {
        final /* synthetic */ AbstractActivity a;

        a(AbstractActivity abstractActivity) {
            this.a = abstractActivity;
        }

        public final void a(f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.g0("https://kanonapp.com/account/register");
        }
    }

    /* renamed from: ds1$b */
    static final class b<TResult> implements z71<Void> {
        final /* synthetic */ int a;
        final /* synthetic */ cs1 b;

        b(int i, cs1 cs1) {
            this.a = i;
            this.b = cs1;
        }

        public final void a(e81<Void> e81) {
            v62.e(e81, "task");
            if (e81.q()) {
                ez1.a.c(this.a);
            }
            try {
                cs1 cs1 = this.b;
                if (cs1 != null) {
                    cs1.a(e81.q());
                }
            } catch (Exception e) {
                uj2.d(e);
            }
        }
    }

    /* renamed from: ds1$c */
    static final class c<TResult> implements z71<Void> {
        final /* synthetic */ int a;
        final /* synthetic */ cs1 b;

        c(int i, cs1 cs1) {
            this.a = i;
            this.b = cs1;
        }

        public final void a(e81<Void> e81) {
            v62.e(e81, "task");
            if (e81.q()) {
                ez1.a.d(this.a);
            }
            try {
                cs1 cs1 = this.b;
                if (cs1 != null) {
                    cs1.a(e81.q());
                }
            } catch (Exception e) {
                uj2.d(e);
            }
        }
    }

    public ds1(e eVar) {
        v62.e(eVar, "kanonService");
    }

    public final void a(AbstractActivity abstractActivity) {
        if (abstractActivity != null) {
            f.e eVar = new f.e(abstractActivity);
            eVar.E("Please login");
            eVar.i("In order to get notified on new episode releases you need an account on Kanon. The Kanon server will send app notifications to registered users. Note: this feature uses less than 1% of your battery life!");
            eVar.B("login");
            eVar.e(false);
            eVar.A(new a(abstractActivity));
            eVar.D();
        }
    }

    public final void b(int i, cs1 cs1) {
        FirebaseMessaging a2 = FirebaseMessaging.a();
        a2.g(this.a + i).b(new b(i, cs1));
    }

    public final void c(int i, cs1 cs1) {
        FirebaseMessaging a2 = FirebaseMessaging.a();
        a2.h(this.a + i).b(new c(i, cs1));
    }
}
